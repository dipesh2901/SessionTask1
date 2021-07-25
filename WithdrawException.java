package com.neosoft.programs;

public class WithdrawException extends Exception {

	String string;
	
	public WithdrawException(String string) {
		// TODO Auto-generated constructor stub
		super(string);
		this.string=string;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
