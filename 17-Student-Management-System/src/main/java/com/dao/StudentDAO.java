package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.entity.Student;

public class StudentDAO {

	private Connection conn;

	public StudentDAO(Connection conn) {
		super();
		this.conn = conn;
	}

	// Add a new student record to the database
	public boolean addStudent(Student student) {
		boolean f = false;
		try {
			String sql = "INSERT INTO studentdb(name, dob, address, qualification, email) VALUES(?,?,?,?,?)";

			PreparedStatement pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, student.getFullName());
			pstmt.setString(2, student.getDob());
			pstmt.setString(3, student.getAddress());
			pstmt.setString(4, student.getQualification());
			pstmt.setString(5, student.getEmail());

			int i = pstmt.executeUpdate();

			if (i == 1) {
				f = true;
			}

		} catch (Exception e) {
			e.printStackTrace(); // Handle exceptions properly, e.g., log or re-throw.
		}
		return f;
	}

	// Retrieve a list of all students from the database
	public List<Student> getAllStudent() {
		List<Student> list = new ArrayList<Student>();
		Student s = null;

		try {
			String sql = "SELECT * FROM Student"; // Correct the table name to "Student"
			PreparedStatement pstmt = conn.prepareStatement(sql);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				s = new Student();
				s.setId(rs.getInt(1));
				s.setFullName(rs.getString(2));
				s.setDob(rs.getString(3));
				s.setAddress(rs.getString(4));
				s.setQualification(rs.getString(5));
				s.setEmail(rs.getString(6));
				list.add(s);
			}
		} catch (Exception e) {
			e.printStackTrace(); // Handle exceptions properly, e.g., log or re-throw.
		}
		return list;
	}

	// Retrieve a student by their ID
	public Student getStudentById(int id) {
		Student s = null;

		try {
			String sql = "SELECT * FROM Student WHERE id=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				s = new Student();
				s.setId(rs.getInt(1));
				s.setFullName(rs.getString(2));
				s.setDob(rs.getString(3));
				s.setAddress(rs.getString(4));
				s.setQualification(rs.getString(5));
				s.setEmail(rs.getString(6));
			}

		} catch (Exception e) {
			e.printStackTrace(); // Handle exceptions properly, e.g., log or re-throw.
		}

		return s;
	}

	// Update a student's information in the database
	public boolean updateStudent(Student student) {
		boolean f = false;

		try {
			String sql = "UPDATE Student SET name=?, dob=?, address=?, qualification=?, email=? WHERE id=? ";
			PreparedStatement pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, student.getFullName());
			pstmt.setString(2, student.getDob());
			pstmt.setString(3, student.getAddress());
			pstmt.setString(4, student.getQualification());
			pstmt.setString(5, student.getEmail());
			pstmt.setInt(6, student.getId()); // Set the ID for the WHERE condition

			int i = pstmt.executeUpdate();

			if (i == 1) {
				f = true;
			}

		} catch (Exception e) {
			e.printStackTrace(); // Handle exceptions properly, e.g., log or re-throw.
		}
		return f;
	}

	// Delete a student from the database by ID
	public boolean deleteStudent(int id) {
		boolean f = false;

		try {
			String sql = "DELETE FROM Student WHERE id=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);

			int i = pstmt.executeUpdate();

			if (i == 1) {
				f = true;
			}

		} catch (Exception e) {
			e.printStackTrace(); // Handle exceptions properly, e.g., log or re-throw.
		}
		return f;
	}
}
