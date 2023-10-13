package com.qa.tums.eng.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.tumsHeartburnCausesChecklist;

public class tumsHeartburnCausesChecklistTest extends BaseClass {
	
	tumsHeartburnCausesChecklist thc;
	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadConfig("TumsConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("TumsConfig.properties").getProperty("TumsHeartburnCauseChecklistPreprodURL"));
		switchingTab(secondTab);
		launchURL(loadConfig("TumsConfig.properties").getProperty("TumsHeartburnCauseChecklistLiveURL"));
	}
	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Throwable {
	thc = new tumsHeartburnCausesChecklist();
	switchingTab(firstTab);
	thc.clickOnCookies();
	System.out.println("Cookie Button clicked successfully in the Preprod URL");
	switchingTab(secondTab);
	thc.clickOnCookies();
	System.out.println("Cookie Button clicked successfully in the Live URL");
	}
	@Test(priority = 1, enabled = true)
	private void verifyHomeIcon() throws Throwable {
		thc = new tumsHeartburnCausesChecklist();
		switchingTab(firstTab);
		thc.clickOnHomeIcon();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		thc.clickOnHomeIcon();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);

	}

	// Verify Heartburn101 in Breadcrumb
	@Test(priority = 2, enabled = true)
	private void verifyHeartBurn101() throws Throwable {
		thc = new tumsHeartburnCausesChecklist();
		switchingTab(firstTab);
		thc.clickOnHeartBurn101();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		thc.clickOnHeartBurn101();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);

	}
	@Test(priority = 6, enabled = true)
	private void verifyYoutubePlay() throws Throwable {
		thc = new tumsHeartburnCausesChecklist();
		switchingTab(firstTab);
		thc.clickOnyoutubevideo();
		switchingTab(secondTab);
		thc.clickOnyoutubevideo();
		System.out.println("PreProdUrl and LiveUrl are Same  :");

	}
}



