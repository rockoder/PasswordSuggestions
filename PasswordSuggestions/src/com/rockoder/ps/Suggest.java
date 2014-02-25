package com.rockoder.ps;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Suggest
 */
@WebServlet("/Suggest")
public class Suggest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int minLength = Integer.parseInt(request.getParameter("minLength"));
		int maxLength = Integer.parseInt(request.getParameter("maxLength"));
		String interest = request.getParameter("interest");
		
		System.out.println("hi " + interest);
	}

}
