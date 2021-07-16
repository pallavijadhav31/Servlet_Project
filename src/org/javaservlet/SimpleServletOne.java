package org.javaservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServletOne
 */
@WebServlet(description = "A simple java servlet", urlPatterns = { "/SimpleServletOne" })
public class SimpleServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from doget Method");
		PrintWriter writer=response.getWriter();
		writer.println("<h4>Heellooooo Servlet ####</h4>");
	}
}
