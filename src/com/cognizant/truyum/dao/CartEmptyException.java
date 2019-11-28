package com.cognizant.truyum.dao;

/**
 * 
 * @author Prakash_K
 *
 */
public class CartEmptyException extends Exception {
	private String message;

	public CartEmptyException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
