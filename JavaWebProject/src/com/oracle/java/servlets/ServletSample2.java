package com.oracle.java.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//This servlet is called from ServletSample2.jsp page through WebServlet annotation
//by submitting form

@WebServlet("/ServletSample2")
public class ServletSample2 extends HttpServlet {
	
	
	 private String message;

	   public void init() throws ServletException {
	      // Do required initialization
	      message = "Hello World";
	   }

	   public void doGet(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {
	      
		   
		   System.out.println("Do GET is getting processed......");
		   
	      // Set response content type
	      response.setContentType("text/html");

	      // Actual logic goes here.
	      PrintWriter out = response.getWriter();
	      out.println("<h1>" + message + " " + "GET" + "</h1>");
	   }
	   
	   
	   public void doPost(HttpServletRequest request, HttpServletResponse response)
			      throws ServletException, IOException {
			      
				   
				   System.out.println("Do POST is getting processed......");
				   
			      // Set response content type
			      response.setContentType("text/html");
			      
			      
			      if(!request.getParameter("request").equals(null)
			    		  && !request.getParameter("request").equals("")
			    		  && request.getParameter("request").equals("test1"))
			      {
			    	  response.sendRedirect("test1.jsp");  
			      } 
			      
			      else if(!request.getParameter("request").equals(null)
			    		  && !request.getParameter("request").equals("")
			    		  && request.getParameter("request").equals("test2"))
			      {
			    	  response.sendRedirect("test2.jsp");
			      }
			      
			      else {
				      // Actual logic goes here.
				      PrintWriter out = response.getWriter();
				      out.println("<h1>" + message + " " + "POST" + "</h1>");
			      }
			      
			   }

	   public void destroy() {
	      // do nothing.
	   }

}
