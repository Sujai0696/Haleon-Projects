package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneUnsubscribe;

public class SensodyneUnsubscribeTest extends BaseClass{
	SensodyneUnsubscribe su;
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();	
	}
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		su =new SensodyneUnsubscribe();
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("SensodyneUnsubscribePreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("SensodyneUnsubscribeLiveUrl"));
		}
	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Exception {
	su =new SensodyneUnsubscribe();
	switchingTab(firstTab);
	su.clickCookieBtn();
	su.clickGigyaForm();
	System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
	switchingTab(secondTab);
	su.clickCookieBtn();
	su.clickGigyaForm();
	System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}
	
	@Test(priority = 10)
	private void verifyGetYourCoupon() throws Exception{
		switchingTab(firstTab);
		su.clickUnsubscribe();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		su.clickUnsubscribe();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);
	}
}
