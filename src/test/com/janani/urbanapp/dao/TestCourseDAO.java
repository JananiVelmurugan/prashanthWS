package test.com.janani.urbanapp.dao;

import java.util.List;

import com.janani.urbanapp.dao.CourseDAO;
import com.janani.urbanapp.model.Course;

public class TestCourseDAO {

	public static void main(String[] args) {

		Course course = new Course();
		course.setName("Ruby");
		CourseDAO dao = new CourseDAO();
		try {
			dao.save(course);
			List<Course> list = dao.findAll();
			for (Course c : list){
				System.out.println(c);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
