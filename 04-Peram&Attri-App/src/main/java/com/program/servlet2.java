package com.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/servlet2")
public class servlet2 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int fn = Integer.parseInt(req.getParameter("fn"));
        int sn = Integer.parseInt(req.getParameter("sn"));
        int sum = (int) req.getAttribute("s");
        int mult = fn * sn;

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.print("<h1>Sum = " + sum + ", Multiplication = " + mult + "</h1>");
    }
}
