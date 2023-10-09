package com.program;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int fn = Integer.parseInt(req.getParameter("fn"));
        int sn = Integer.parseInt(req.getParameter("sn"));
        int sum = fn + sn;
        req.setAttribute("s", sum);
        RequestDispatcher rd = req.getRequestDispatcher("/servlet2");
        rd.forward(req, resp);
    }
}
