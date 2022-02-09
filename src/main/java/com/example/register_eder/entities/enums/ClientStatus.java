package com.example.register_eder.entities.enums;

public enum ClientStatus {
	
	ANSWERED(1),
	SERVICE(2);
	
	private int code;
	
	private ClientStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static ClientStatus valueOf(int code) {
		for (ClientStatus value : ClientStatus.values()) {
			if (value.getCode()  == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid code");
	}
	
}
