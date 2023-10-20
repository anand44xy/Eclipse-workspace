package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.conn.DBconnection;
import com.dao.StudentDAO;
import com.entity.Student;

@SuppressWarnings("serial")
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Retrieve data from the request parameters
        String name = req.getParameter("name");
        String dob = req.getParameter("dob");
        String address = req.getParameter("address");
        String qualification = req.getParameter("qualification");
        String email = req.getParameter("email");

        // Create a Student object with the submitted information
        Student student = new Student(name, address, email, dob, qualification);

        // Create a StudentDAO instance to interact with the database
        StudentDAO dao = new StudentDAO(DBconnection.getConnection());

        // Get the user's session
        HttpSession session = req.getSession();

        // Add the student to the database
        boolean success = dao.addStudent(student);

        if (success) {
            // Set a success message in the session and redirect to the addStudent.jsp
            session.setAttribute("succMSG", "Student details successfully submitted.");
            resp.sendRedirect("addStudent.jsp");
        } else {
            // Set an error message in the session and redirect to the addStudent.jsp
            session.setAttribute("errorMSG", "Something went wrong on the server!");
            resp.sendRedirect("addStudent.jsp");
        }
    }
}
