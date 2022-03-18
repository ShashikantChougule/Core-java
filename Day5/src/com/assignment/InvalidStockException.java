package com.assignment;
@SuppressWarnings("serial")
public class InvalidStockException extends Exception {

	String msg;
	public InvalidStockException(String msg) {
		this.msg=msg;
	}
	public String getMessage() {
		return msg;
	}

}
