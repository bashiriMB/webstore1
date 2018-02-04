package com.packt.webstore.exception;

public class ProfileNotFoundException extends RuntimeException{
	private static final long serialVersionUID =-694354952032299587L;
	private int profileId;
	public ProfileNotFoundException(int profileId) {
		this.profileId = profileId;
	}
	public int getProductId() {
		return profileId;
	}
}

