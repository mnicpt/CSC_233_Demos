package edu.hcc.csci233.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.hcc.csci233.beans.Customer;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		Customer cust = new Customer();
		cust.setFirstName(firstName);
		request.getSession().setAttribute("customer", cust);
//		
//		PrintWriter writer = response.getWriter();
//		Enumeration<String> headerNames = request.getHeaderNames();
//		writer.println("<h1>Request Headers</h1>");
//		while(headerNames.hasMoreElements()) {
//			String name = headerNames.nextElement();
//			writer.println(name +": "+ request.getHeader(name));
//		}
		response.setContentType("text/html");
		response.sendRedirect("result.jsp");
	}

}
