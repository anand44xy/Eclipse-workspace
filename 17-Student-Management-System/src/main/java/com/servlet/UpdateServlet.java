package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.conn.DBconnection; // Corrected the import statement
import com.dao.StudentDAO;
import com.entity.Student;

@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Retrieve data from the request parameters
        String name = req.getParameter("name");
        String dob = req.getParameter("dob");
        String address = req.getParameter("address");
        String qualification = req.getParameter("qualification");
        String email = req.getParameter("email");

        // Parse the student ID from the request parameter
        int id = Integer.parseInt(req.getParameter("id"));

        // Create a Student object with updated information
        Student student = new Student(id, name, address, email, dob, qualification);

        // Create a StudentDAO instance to interact with the database
        StudentDAO dao = new StudentDAO(DBconnection.getConnection()); 

        // Get the user's session
        HttpSession session = req.getSession();

        // Update the student's information in the database
        boolean success = dao.updateStudent(student);

        if (success) {
            // Set a success message in the session and redirect to the index page
            session.setAttribute("succMSG", "Student details successfully updated.");
            resp.sendRedirect("index.jsp");
        } else {
            // Set an error message in the session and redirect to the index page
            session.setAttribute("errorMSG", "Something went wrong on the server!");
            resp.sendRedirect("index.jsp");
        }
    }
}
