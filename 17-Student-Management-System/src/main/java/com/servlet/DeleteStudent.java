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

@SuppressWarnings("serial")
@WebServlet("/delete")
public class DeleteStudent extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Get the student ID from the request parameter
        int id = Integer.parseInt(req.getParameter("id"));

        // Create a StudentDAO instance to interact with the database
        StudentDAO dao = new StudentDAO(DBconnection.getConnection()); 

        // Get the user's session
        HttpSession session = req.getSession();

        // Attempt to delete the student from the database
        boolean success = dao.deleteStudent(id);

        if (success) {
            // Set a success message in the session and redirect to the DeleteStudent.jsp
            session.setAttribute("succMSG", "Student details successfully deleted.");
            resp.sendRedirect("DeleteStudent.jsp");
        } else {
            // Set an error message in the session and redirect to the DeleteStudent.jsp
            session.setAttribute("errorMSG", "Something went wrong on the server!");
            resp.sendRedirect("DeleteStudent.jsp");
        }
    }
}
