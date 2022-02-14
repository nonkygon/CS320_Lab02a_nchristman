package edu.ycp.cs320.lab02a_nchristman.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ycp.cs320.lab02a_nchristman.controller.NumbersController;

public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("Index Servlet: doGet");
		
		req.getRequestDispatcher("/_view/index.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("Index Servlet: doPost");
		
		String submit = req.getParameter("submit");
		System.out.println(submit);
		
		if(submit.equals("Add Numbers!")) {
			req.getRequestDispatcher("/_view/addNumbers.jsp").forward(req, resp);
		}
		else if(submit.equals("Multiply Numbers!")) {
			req.getRequestDispatcher("/_view/multiplyNumbers.jsp").forward(req, resp);
		}
		else if(submit.equals("Guessing Game!")) {
			req.getRequestDispatcher("/_view/guessingGame.jsp").forward(req, resp);
		}
		else {
			System.out.println("Invalid Link");
		}
		
	}
}
