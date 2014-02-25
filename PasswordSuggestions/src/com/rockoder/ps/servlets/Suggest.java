package com.rockoder.ps.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rockoder.ps.suggesters.SuggestMovie;

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
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		
		if (interest.equalsIgnoreCase("Movies"))
		{
			SuggestMovie sm = new SuggestMovie();
			
			Vector<String> movies = sm.getMovieSuggestions();
			
			out.println("<table border='1'>");
			
			for (String m : movies)
			{
				out.println("<tr>");
				out.println("<td>" + m + "</td>");
				out.println("</tr>");
			}
		}
		
		out.println("</table>");
		
		out.println("</body>");
		out.println("</html>");
	}

}
