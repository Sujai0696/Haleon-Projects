package com.qa.tums.eng.util;

public class  LogFile extends ExtentManager{
	
	
	
	public static void pass(String Status) {
		ExtentManager.test.pass(Status);
	}
	
	public static void fail(String Status) {
		ExtentManager.test.fail(Status);
	}
	
	public void info(String Status) {
		ExtentManager.test.info(Status);
	}
	
	public void skip (String Status) {
		ExtentManager.test.skip(Status);
	}
	
	
	
	

}
