package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/current")
public class CurrentDateServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String param = req.getParameter("count");
		int count = Integer.parseInt(param);
		PrintWriter out = resp.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>currentt</title>");
		out.println("</head>");
		out.println("<body>");
		
		for(int i=0; i<count; i++) {
			out.println("<h2>" + i + " current = " + new Date() + "</h2>");
		}
		out.println("</body>");
		out.println("</html>");
	}
}
