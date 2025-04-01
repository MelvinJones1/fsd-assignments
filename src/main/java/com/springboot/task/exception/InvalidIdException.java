package com.springboot.task.exception;

public class InvalidIdException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;
	
	public InvalidIdException(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String getMessage() {
		return msg;
	}
	
	

}
