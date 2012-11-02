/**
 * 
 */
package calculator.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import calculator.Calculator;

/**
 * @author smask
 *
 */
@WebServlet(urlPatterns="/Calculator", asyncSupported=true)
public class CalculatorServlet extends HttpServlet{

	private static final long serialVersionUID = 8508474841091357637L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("Hit servlet");
		Calculator calc = (Calculator)req.getSession().getAttribute("calc");
		if(calc == null) {
			calc = new Calculator();
			req.getSession().setAttribute("calc", calc);
		}
		
		char operator = req.getParameter("operator").charAt(0);
		String display = req.getParameter("display");
		calc.setDisplayValue(display);
		int result = 0;
		
		switch (operator) {
			case '+': {
				result = calc.add();
				break;
			}
			case '-': {
				result = calc.subtract();
				break;
			}
			case '*': {
				result = calc.multiply();
				break;
			}
			case '/': {
				result = calc.divide();
				break;
			}
			case 'C': {
				result = calc.clear();
				break;
			}
			default: {//enter key
				calc.push(display);
				result = Integer.parseInt(display);
			}
		}
		resp.flushBuffer();
		resp.getWriter().print(result);
	}
	
}
