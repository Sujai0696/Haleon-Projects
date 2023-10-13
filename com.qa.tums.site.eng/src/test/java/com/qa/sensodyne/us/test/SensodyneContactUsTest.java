package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneContactUs;

public class SensodyneContactUsTest extends BaseClass{
SensodyneContactUs scu;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
		
	}
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("SensodyneContactUsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("SensodyneContactUsLiveUrl"));
	}
	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Exception {
	scu =new SensodyneContactUs();
	switchingTab(firstTab);
	scu.clickCookieBtn();
	scu.clickGigyaForm();
	System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
	switchingTab(secondTab);
	scu.clickCookieBtn();
	scu.clickGigyaForm();
	System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
}
	@Test(priority = 3)
	private void verifyFAQ() throws Exception{
		switchingTab(firstTab);
		scu.clickFAQ();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		scu.clickFAQ();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Get Coupon:"+compareTwoText);
	}

	@Test(priority = 3)
	private void verifyClickHere() throws Exception{
		switchingTab(firstTab);
		scu.clickClickHere();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		scu.clickClickHere();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Get Coupon:"+compareTwoText);
	}
}
