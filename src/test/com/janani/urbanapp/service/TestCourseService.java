package test.com.janani.urbanapp.service;

import com.janani.urbanapp.exception.ServiceException;
import com.janani.urbanapp.model.Course;
import com.janani.urbanapp.service.CourseService;

public class TestCourseService {

	public static void main(String[] args) throws ServiceException {
		// TODO Auto-generated method stub

		Course course = new Course();
		course.setName("Spring");
		CourseService service = new CourseService();
		service.saveService(course);

	}

}
