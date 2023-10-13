package com.qa.preph.test;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.baseClass.BaseClass;
import com.qa.preph.pages.ContentTestingPage;

public class ContentTestingTest extends BaseClass{
	
	ContentTestingPage ctp;
	
	@BeforeClass
	private void launchTheBrowser() throws Exception {
		browserLaunch(loadConfig("checkListConfig.properties").getProperty("browser"));
		launchTwoUrl();
		
	}
	
//	dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class
	

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		ctp = new ContentTestingPage();
		switchingTab(firstTab);
		launchURL("https://haleonstaging1:Health2023@preparationh-v3-com.preprod-cf65.ch.adobecqms.net/contact-us/");
//		https://haleonstaging1:Health2023@preparationh-v3-com.preprod-cf65.ch.adobecqms.net/contact-us/
		switchingTab(secondTab);
		launchURL("https://www.betotal.net/contatti/");
//		https://www.preparationh.com/contact-us/

	}
	
//	@Test()
//	private void verifyFontFamily() throws Exception {
//		switchingTab(firstTab);
//		List<String> prePord = ctp.getAllTheText();
////		System.out.println(prePord);
//		switchingTab(secondTab);
//		List<String> live = ctp.getAllTheText();
////		System.out.println(live);
//		compareTwoTextList(prePord, live);
//	}
	
	@Test
	private void verifyFontFamily() throws Exception {
		switchingTab(firstTab);
		List<String> preprod = ctp.getAllText();
		System.out.println(preprod);
		switchingTab(secondTab);
		List<String> live = ctp.getAllText();
		System.out.println(live);
		compareTwoTextList(preprod, live);
	}
	
}
