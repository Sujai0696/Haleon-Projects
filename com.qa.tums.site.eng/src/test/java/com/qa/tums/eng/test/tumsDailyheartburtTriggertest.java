package com.qa.tums.eng.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.tumsDailyHearburnTrigger;


public class tumsDailyheartburtTriggertest extends BaseClass {
	
	tumsDailyHearburnTrigger tht;
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("TumsConfig.properties").getProperty("browser"));
		launchTwoUrl();
		
	}
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("TumsConfig.properties").getProperty("TumsDailyHeartTrigersPreprodURL"));
		switchingTab(secondTab);
		launchURL(loadConfig("TumsConfig.properties").getProperty("TumsDailyHeartTrigersLiveURL"));
	}
	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Throwable {
	tht =new tumsDailyHearburnTrigger();
	switchingTab(firstTab);
	tht.clickOnCookies();
	System.out.println("Cookie Button clicked successfully in the Preprod URL");
	switchingTab(secondTab);
	tht.clickOnCookies();
	System.out.println("Cookie Button clicked successfully in the Live URL");
	}
	
	@Test(priority = 1, enabled = true)
	private void verifyHomeIcon() throws Throwable {
		tht = new tumsDailyHearburnTrigger();
		switchingTab(firstTab);
		tht.clickOnHomeIcon();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tht.clickOnHomeIcon();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);

	}
	@Test(priority = 1, enabled = true)
	private void verifyHeartBurn101() throws Throwable {
		tht = new tumsDailyHearburnTrigger();
		switchingTab(firstTab);
		tht.clickOnHeartBurn101();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tht.clickOnHeartBurn101();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);

	}
	@Test(priority = 1, enabled = true)
	private void verifyseeProducts() throws Throwable {
		tht = new tumsDailyHearburnTrigger();
		switchingTab(firstTab);
		tht.clickOnseeProducts();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tht.clickOnseeProducts();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);

	}
	
	
}
