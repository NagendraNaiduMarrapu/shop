package com.vamsi;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/DisplayProducts")
public class DisplayProducts extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DisplayProducts() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession hs = request.getSession();
		ArrayList<Products> myProducts = (ArrayList<Products>) hs.getAttribute("productsCart");

		if (myProducts != null) {

			for (Products item : myProducts) {
				out.println(item.getProductType());
				out.println(item.getProductName());
				out.println(item.getImageUrl());
				out.println(item.getProductPrice());

			}
		} else {
			out.println("No Products to display");
		}

	}

}
