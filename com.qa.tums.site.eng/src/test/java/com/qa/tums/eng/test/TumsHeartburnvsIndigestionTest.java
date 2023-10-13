package com.qa.tums.eng.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.TumsHeartburnvsIndigestion;
import com.qa.tums.eng.pages.tumsHeartburnCausesChecklist;


public class TumsHeartburnvsIndigestionTest extends BaseClass {

	TumsHeartburnvsIndigestion thi;

	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadConfig("TumsConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
//		thi = new TumsHeartburnvsIndigestion();
		switchingTab(firstTab);
		launchURL(loadConfig("TumsConfig.properties").getProperty("TumsAcidRefluxVsGerdPreprodURL"));
		switchingTab(secondTab);
		launchURL(loadConfig("TumsConfig.properties").getProperty("TumsAcidRefluxVsGerdLiveURL"));
	}
	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Throwable {
	thi = new TumsHeartburnvsIndigestion();
	switchingTab(firstTab);
	thi.clickOnCookies();
	System.out.println("Cookie Button clicked successfully in the Preprod URL");
	switchingTab(secondTab);
	thi.clickOnCookies();
	System.out.println("Cookie Button clicked successfully in the Live URL");
	}
	@Test(priority = 1, enabled = true)
	private void verifyHomeIcon() throws Throwable {
		
		switchingTab(firstTab);
		thi.clickOnHomeIcon();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		thi.clickOnHomeIcon();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);

	}

	@Test(priority = 1, enabled = true)
	private void verifyHeartBurn101() throws Throwable {
		switchingTab(firstTab);
		thi.clickOnHeartBurn101();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		thi.clickOnHeartBurn101();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);
		
	}
	@Test(priority = 1, enabled = true)
	private void verifyYoutubeVideo() throws Throwable {
		switchingTab(firstTab);
		thi.clickOnyoutubevideo();
		thi.switchToYoutubeFrame();
		thi.verifyYoutubevideo();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		thi.clickOnyoutubevideo();
		thi.switchToYoutubeFrame();
		thi.verifyYoutubevideo();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);

	}
	}
