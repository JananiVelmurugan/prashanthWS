package com.janani.urbanapp.exception;

public class PersistenceException extends Exception {

	public PersistenceException(String message, Throwable cause) {
		super(message, cause);
	}

	public PersistenceException(String message) {
		super(message);
	}

}
