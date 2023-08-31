package test;

import java.io.IOException;
import java.io.PrintWriter;

CheckBoxDemo.java
==================

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/check")
public class ChechBoxDemo extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		String mobile=request.getParameter("mobile");
		pw.println("name\n:"+name);
		pw.println("age\n:"+age);
		pw.println("MobNo\n:"+mobile);
		String gender=request.getParameter("Gender");
		if(gender.equals("Male"))
		{
			pw.println("Gender-"+gender);
		}
		else
		{
			pw.println("Gender-"+gender);
		}
		String hobies[]=request.getParameterValues("Hobies");
		for(String hob:hobies)
		{
			pw.println("Hobies:"+hob);
		}
		
	}

}