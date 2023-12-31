package com.prog;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/userlogin") // Defines the servlet mapping
public class Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Retrieve user input from the login form
        String email = req.getParameter("email");
        String password = req.getParameter("pswd");
        
        // Create cookies to store user email and password
        Cookie ck1 = new Cookie("email", email);
        Cookie ck2 = new Cookie("pswd", password);
        
        // Add the cookies to the response to be sent to the client
        resp.addCookie(ck1);
        resp.addCookie(ck2);
        
        // Redirect the user to the "Profile" servlet
        resp.sendRedirect("profile");
    }
}
