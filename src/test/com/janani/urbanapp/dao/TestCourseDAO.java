package test.com.janani.urbanapp.dao;

import com.janani.urbanapp.dao.CourseDAO;
import com.janani.urbanapp.model.Course;

public class TestCourseDAO {

	public static void main(String[] args) {

		Course course = new Course();
		course.setName("Ruby");
		CourseDAO dao = new CourseDAO();
		try {
			dao.save(course);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
