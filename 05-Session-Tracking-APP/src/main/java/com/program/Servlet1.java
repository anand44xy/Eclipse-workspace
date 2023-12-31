package com.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("nem");
        PrintWriter out = resp.getWriter();
        
        Cookie ck=new Cookie("nem", name);
        resp.addCookie(ck);
        
        resp.setContentType("text/html");
        out.print("Welcome to servlet1=" + name);
        
        out.print("<br> <a href='servlet2'>Servlet2</a>"); 
    }
}