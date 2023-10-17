package com.qa.flonase.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.flonase.pages.CMXPage;

public class CMXTest extends BaseClass{
	
	CMXPage cmx;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("Flonase_Config.properties").getProperty("browser"));
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		cmx = new CMXPage();
		launchURL("https://cmxweb.influx.co.in/");
	}
	
	
	@Test(priority = 0)
	private void verifyLoginPage() throws Exception {
		cmx.clickLogin();
		
	}
	

}
