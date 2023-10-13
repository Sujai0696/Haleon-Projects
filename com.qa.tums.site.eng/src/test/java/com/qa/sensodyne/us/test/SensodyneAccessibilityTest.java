package com.qa.sensodyne.us.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneAccessibility;

public class SensodyneAccessibilityTest extends BaseClass{
	SensodyneAccessibility sac;
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
		
	}
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("SensodyneAccessibilityPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("SensodyneAccessibilityLiveUrl"));
	}
	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Exception {
	sac =new SensodyneAccessibility();
	switchingTab(firstTab);
	sac.clickCookieBtn();
	sac.clickGigyaForm();
	System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
	switchingTab(secondTab);
	sac.clickCookieBtn();
	sac.clickGigyaForm();
	System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
}
	@Test(priority = 2)
	private void verifyContactUs() throws Exception{
		switchingTab(firstTab);
		sac.clickContactUsLink();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		sac.clickContactUsLink();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Get Coupon:"+compareTwoText);
	}

}
