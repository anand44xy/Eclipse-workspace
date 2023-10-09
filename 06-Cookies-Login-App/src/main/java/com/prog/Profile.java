package com.prog;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/profile") // Defines the servlet mapping
public class Profile extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Retrieve cookies from the client's browser
        Cookie[] cookies = req.getCookies();

        // Check if cookies are null (user not logged in)
        if (cookies == null) {
            // Redirect the user to the login page (index.html)
            resp.sendRedirect("index.html");
        } else {
            // Set the response content type to HTML
            resp.setContentType("text/html");

            // Create a PrintWriter to write HTML response
            PrintWriter out = resp.getWriter();

            // Display user email and password from cookies
            out.print("<h1>Email= " + cookies[0].getValue() + "</h1>");
            out.print("<h1>Password= " + cookies[1].getValue() + "</h1>");

            // Provide a link to log out (redirect to the "logout" servlet)
            out.print("<a href='logout'>Logout</a>");
        }
    }
}
