package com.capg.bank.service;

public interface IBank{  // Interface is Specification or Requirement for Programmers
	
	public  static final  String IFSC = "HDFC1234";
	
	public abstract void deposit();
	
	public abstract void withdraw();
	

}
