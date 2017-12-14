package org.jspiders.chainApp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/chain")
public class MainController extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String name= req.getParameter("nm");
	
	String output = "Welcome " + name;
	
	String htmlOutput = "<html><body><h1>"+ output + "</h1></body></html";
	
	RequestDispatcher rd = req.getRequestDispatcher("hd");
	/*req.setAttribute("msg", output );
	rd.forward(req, resp);*/
	rd.include(req, resp);
	PrintWriter pw = resp.getWriter();
	pw.println(htmlOutput);
	RequestDispatcher rd1 = req.getRequestDispatcher("fd");
	rd1.include(req, resp);
	
}
}
