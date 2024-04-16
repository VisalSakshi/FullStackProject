package com.eb.dessert.exception;

public class MenuResource extends RuntimeException {
	public MenuResource(String msg) {
		super(msg);
	}
}
