package edu.hcc.csci233.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		HttpSession session = request.getSession();
		session.setAttribute("customer", cust);
//		
//		PrintWriter writer = response.getWriter();
//		Enumeration<String> headerNames = request.getHeaderNames();
//		writer.println("<h1>Request Headers</h1>");
//		while(headerNames.hasMoreElements()) {
//			String name = headerNames.nextElement();
//			writer.println(name +": "+ request.getHeader(name));
//		}
		PrintWriter writer = response.getWriter();
		writer.println("Session id: " +session.getId());
		Cookie[] cookies = request.getCookies();
		
		for(Cookie cookie : cookies) {
			writer.println("Name: " +cookie.getName()); 
			writer.println("Value: " +cookie.getValue());
		}
		//request.getRequestDispatcher("page").forward(request, response);
		Cookie cookie = new Cookie("firstName",firstName);
		cookie.setComment("This is the first name.");
		response.addCookie(cookie);
		
//		response.setContentType("text/html");
//		response.sendRedirect("result.jsp");
	}

}
