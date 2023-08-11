package com.vamsi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		PrintWriter out = res.getWriter();
		out.println("<html><body><p>hibbi</p></body></html>");
		// out.println("");
		// out.println("");
	}
}
