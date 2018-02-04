package com.packt.webstore.exception;

public class UserNotFoundException extends RuntimeException{
	private static final long serialVersionUID =-694354952032299587L;
	private int userId;
	public UserNotFoundException(int userId) {
		this.userId = userId;
	}
	public int getProductId() {
		return userId;
	}
}
