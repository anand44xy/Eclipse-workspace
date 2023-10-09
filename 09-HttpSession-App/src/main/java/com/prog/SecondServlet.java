package com.prog;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
// The annotation below specifies the URL mapping for this servlet.
@WebServlet("/servlet2")
public class SecondServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Retrieve the 'username' attribute from the session
        HttpSession session = req.getSession();
        String name = (String) session.getAttribute("username");
        
        // Set the content type of the response to HTML
        resp.setContentType("text/html");
        // Get the PrintWriter object to write the response
        PrintWriter out = resp.getWriter();
        out.print("Name: " + name);
    }
}
