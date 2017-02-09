package test.com.janani.urbanapp.model;

import com.janani.urbanapp.model.Course; 

public class TestCourse {
	public static void main(String[] args) {

		Course course = new Course();

		System.out.println(course);
		//System.out.println(course.toString());

		// System.out.println("Before Assigning Id : " + course.getId());
		course.setId(1);
		System.out.println("After Assigning Id : " + course.getId());

		// System.out.println("Before Assigning Name : " + course.getName());
		course.setName("Java");
		System.out.println("After Assigning Id : " + course.getName());
		
		System.out.println(course);

	}
}
