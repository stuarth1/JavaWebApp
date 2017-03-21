package com.as.samples;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PageOneProcess
 */
public class PageOneProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	String name = request.getParameter("name");
    	String address = request.getParameter("address");
    	String phone = request.getParameter("phone");
    	
    	System.out.println("The name is: " + name);
    	System.out.println("The address is: " + address);
    	System.out.println("The phone is: " + phone);
    	
    	request.getSession().setAttribute("name", name);
    	request.getSession().setAttribute("address", address);
    	request.getSession().setAttribute("phone", phone);
    	
    	response.sendRedirect("html/pageTwo.html");
    	
	}

}
