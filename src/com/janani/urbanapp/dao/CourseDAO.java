package com.janani.urbanapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.janani.urbanapp.exception.PersistenceException;
import com.janani.urbanapp.model.Course;
import com.janani.urbanapp.util.ConnectionUtil;

public class CourseDAO {

	public void save(Course course) throws PersistenceException {
		try {
			// Step 1: Get the connection
			Connection connection = ConnectionUtil.getConnection();
			// Step 2: Create Query
			String sql = "INSERT INTO courses(NAME) VALUES(?)";
			PreparedStatement pst = connection.prepareStatement(sql);
			// Step 3: Set the values
			pst.setString(1, course.getName());
			// Step 4: Execute the query
			int rows = pst.executeUpdate();
			System.out.println("No. of rows inserted: " + rows);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new PersistenceException("UNABLE TO INSERT COURSE", e);
		}
	}

	public void update(Course course) {

	}

	public void delete(Integer id) {

	}

	public List<Course> findAll() throws PersistenceException {

		List<Course> list = new ArrayList<>();
		try {
			// Step 1: Get the connection
			Connection connection = ConnectionUtil.getConnection();
			// Step 2: Create query
			String sql = "select id,name from course";
			PreparedStatement pst = connection.prepareStatement(sql);
			// Step 3: Execute query
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Course course = new Course();
				course.setId(rs.getInt("id"));
				course.setName(rs.getString("name"));
				list.add(course);
			}
		} catch (Exception e) {
			throw new PersistenceException("UNABLE TO SELECT COURSE", e);
		}
		return list;

	}

}
