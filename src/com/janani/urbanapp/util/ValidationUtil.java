package com.janani.urbanapp.util;

import com.janani.urbanapp.exception.ValidationException;

public class ValidationUtil {

	public boolean isValidInteger(Integer id) {
		return id <= 0;
	}

	public void isInvalidInteger(Integer id, String message) throws ValidationException {
		if (id <= 0) {
			throw new ValidationException(message);
		}
	}

	public boolean isValidString(String name) {
		return name == null || "".equals(name.trim());
	}

	public void isInvalidString(String name, String message) throws ValidationException {
		if (name == null || "".equals(name.trim())) {
			throw new ValidationException(message);
		}
	}
}
