package com.janani.urbanapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.janani.urbanapp.model.Course;
import com.janani.urbanapp.util.ConnectionUtil;

public class CourseDAO {

	public void save(Course course) throws Exception {
		// Step 1: Get the connection
		Connection connection = ConnectionUtil.getConnection();
		// Step 2: Create Query
		String sql = "INSERT INTO course(NAME) VALUES(?)";
		PreparedStatement pst = connection.prepareStatement(sql);
		// Step 3: Set the values
		pst.setString(1, course.getName());
		// Step 4: Execute the query
		int rows = pst.executeUpdate();
		System.out.println("No. of rows inserted: " + rows);
	}

}
