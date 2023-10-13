package com.qa.bens.checklist.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.bens.checklist.page.DummyClassPage;

public class DummyClassTest extends BaseClass{
	
	DummyClassPage li;
	
	@BeforeClass
	private void launchTheBrowser() throws Exception {
		browserLaunch(loadConfig("checkListConfig.properties").getProperty("browser"));
		li = new DummyClassPage();
		
	}
	
	
	@Test()
	private void verifyAllTheLinks() throws Exception {
		launchURL("https://haleonstaging1:Health2023@preparationh-v3-com.preprod-cf65.ch.adobecqms.net/es/relief-finder/");
		li.getAllTheLinks();
	}
	
	
	 
}
