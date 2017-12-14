package org.jspiders.chainApp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/disp")
public class DispController extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	String val = (String) req.getAttribute("msg");
	String htmlOutput = "<html><body><h1>"+ val+ "</h1></body></html";
	PrintWriter pw = resp.getWriter();
	pw.println(htmlOutput);
	
}
}
