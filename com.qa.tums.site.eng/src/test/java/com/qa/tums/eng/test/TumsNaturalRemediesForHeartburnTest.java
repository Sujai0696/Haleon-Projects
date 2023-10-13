package com.qa.tums.eng.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.TumsNaturalRemediesForHeartburn;

public class TumsNaturalRemediesForHeartburnTest extends BaseClass{
	TumsNaturalRemediesForHeartburn tnr;
	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadConfig("TumsConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		tnr = new TumsNaturalRemediesForHeartburn();
		switchingTab(firstTab);
		launchURL(loadConfig("TumsConfig.properties").getProperty("NaturalRemediesforHeartburnPreprodURL"));
		switchingTab(secondTab);
		launchURL(loadConfig("TumsConfig.properties").getProperty("NaturalRemediesforHeartburnLiveURL"));

	}

	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Throwable {
		tnr = new TumsNaturalRemediesForHeartburn();;
		switchingTab(firstTab);
		tnr.clickOnCookies();
		System.out.println("Cookie Button clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		tnr.clickOnCookies();
		System.out.println("Cookie Button clicked successfully in the Live URL");
	}

	@Test(priority = 1, enabled = true)
	private void verifyHomeIcon() throws Throwable {
		tnr = new TumsNaturalRemediesForHeartburn();
		switchingTab(firstTab);
		tnr.clickOnHomeIcon();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tnr.clickOnHomeIcon();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	// Verify Heartburn101 in Breadcrumb
	@Test(priority = 2, enabled = true)
	private void verifyHeartBurn101() throws Throwable {
		tnr = new TumsNaturalRemediesForHeartburn();
		switchingTab(firstTab);
		tnr.clickOnHeartBurn101();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tnr.clickOnHeartBurn101();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyHomeRemedy() throws Throwable {
		tnr = new TumsNaturalRemediesForHeartburn();
		switchingTab(firstTab);
		tnr.clickOnHomeRemedy();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tnr.clickOnHomeRemedy();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyAppleCiderVinegar() throws Throwable {
		tnr = new TumsNaturalRemediesForHeartburn();
		switchingTab(firstTab);
		tnr.clickOnAppleCiderVinegar();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tnr.clickOnAppleCiderVinegar();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyAntacid() throws Throwable {
		tnr = new TumsNaturalRemediesForHeartburn();
		switchingTab(firstTab);
		tnr.clickOnAntacid();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tnr.clickOnAntacid();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyTums() throws Throwable {
		tnr = new TumsNaturalRemediesForHeartburn();
		switchingTab(firstTab);
		tnr.clickOnTUMS();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tnr.clickOnTUMS();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	
	@Test(priority = 6, enabled = true)
	private void verifySeeProducts() throws Throwable {
		tnr = new TumsNaturalRemediesForHeartburn();
		switchingTab(firstTab);
		tnr.clickSeeProducts();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tnr.clickSeeProducts();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

}
