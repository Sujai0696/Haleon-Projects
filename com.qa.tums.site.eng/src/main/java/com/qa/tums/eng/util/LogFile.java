package com.qa.tums.eng.util;

import java.util.List;

import com.github.dockerjava.api.model.Info;

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
	
	
	
	

}
