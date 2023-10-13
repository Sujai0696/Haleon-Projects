package com.qa.bens.checklist.test;

import java.awt.AWTException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.bens.checklist.page.CheckListConsoleErrorPage;
import com.qa.tums.eng.util.DataProviderCode;

public class CheckListConsoleErrorTest extends BaseClass{
	
	CheckListConsoleErrorPage ce;
	
	
	@BeforeClass
	private void launchTheBrowser() throws Exception {
		browserLaunch(loadConfig("checkListConfig.properties").getProperty("browser"));
		ce = new CheckListConsoleErrorPage();
	}
	
//	@AfterTest
//	private void keyrelease() throws AWTException {
//		ctrlShiftIKeyRelease();
//	}
	
	@Test(dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class)
	private void findingConsoleError(String path) throws Exception {
		ce.verifyConsoleError(path);
		System.out.println("---->*********************************************************<----");
	}

}
