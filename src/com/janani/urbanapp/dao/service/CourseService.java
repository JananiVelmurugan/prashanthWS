package com.janani.urbanapp.dao.service;

import com.janani.urbanapp.dao.CourseDAO;
import com.janani.urbanapp.exception.ServiceException;
import com.janani.urbanapp.exception.ValidationException;
import com.janani.urbanapp.model.Course;
import com.janani.urbanapp.validator.CourseValidator;

public class CourseService {

	CourseValidator validator = new CourseValidator();
	CourseDAO dao = new CourseDAO();

	public void saveService(Course course) throws ServiceException {
		try {
			validator.validateSave(course);
			dao.save(course);
		} catch (ValidationException e) {
			throw new ServiceException(e.getMessage(), e);
		}
	}

}
