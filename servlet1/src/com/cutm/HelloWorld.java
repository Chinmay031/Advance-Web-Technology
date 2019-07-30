package com.cutm;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

//Extend HttpServlet class

//Writen by Chinmay
public class HelloWorld extends HttpServlet{
	
	private String message;
	
	public void init() throws ServletException{
		 // Do required initialization
	      message = "first servlet page";
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {
		// Set response content type
		response.setContentType("text/html");
		// Actual logic goes here.
	      PrintWriter out = response.getWriter();
	      out.println("<h2>" + message + "</h2>");
	      
	}
	
	 public void destroy() {
	      // do nothing.
	   }
}