package com.janani.urbanapp.validator;

import com.janani.urbanapp.exception.ValidationException;
import com.janani.urbanapp.model.Course;
import com.janani.urbanapp.util.ValidationUtil;

public class CourseValidator {
	ValidationUtil util = new ValidationUtil();

	public void validateSave(Course course) throws ValidationException {
		util.isInvalidString(course.getName(), "INVALID COURSE NAME");
	}

	public void validateUpdate(Course course) throws ValidationException {
		util.isInvalidInteger(course.getId(), "INVALID COURSE ID");
		util.isInvalidString(course.getName(), "INVALID COURSE NAME");
	}

	public void validateDelete(Integer id) throws ValidationException {
		util.isInvalidInteger(id, "INVALID COURSE ID");
	}
}
