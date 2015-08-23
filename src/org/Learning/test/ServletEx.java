package org.Learning.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletEx extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 	
			throws ServletException, IOException {

		resp.setContentType("text/html");
		
		super.doGet(req, resp);
		 
		String Name = req.getParameter("UserName");
		String Email = req.getParameter("Email");
		String IP = req.getRemoteAddr();
		
		resp.getWriter().println("<html>");
		resp.getWriter().println("<head>");
		resp.getWriter().println("<title> this is the response </title>");
		resp.getWriter().println("</head>");
		resp.getWriter().println("<body>");
		resp.getWriter().println("your name is: " + Name);
		resp.getWriter().println("your name is: " + Email);
		resp.getWriter().println("your IP address is: " + IP);
		resp.getWriter().println("</body>");
		resp.getWriter().println("</html>");
	}
}
