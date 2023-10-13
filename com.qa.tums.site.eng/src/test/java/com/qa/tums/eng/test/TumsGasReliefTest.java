package com.qa.tums.eng.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.TumsGasRelief;

public class TumsGasReliefTest extends BaseClass{
	TumsGasRelief tgr;
	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadConfig("TumsConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		tgr = new TumsGasRelief();
		switchingTab(firstTab);
		launchURL(loadConfig("TumsConfig.properties").getProperty("GasReliefPreprodURL"));
		switchingTab(secondTab);
		launchURL(loadConfig("TumsConfig.properties").getProperty("GasReliefLiveURL"));

	}

	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Throwable {
		tgr = new TumsGasRelief();
		switchingTab(firstTab);
		tgr.clickOnCookies();
		System.out.println("Cookie Accept Button clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		tgr.clickOnCookies();
		System.out.println("Cookie Button clicked successfully in the Live URL");
	}

	@Test(priority = 1, enabled = true)
	private void verifyHomeIcon() throws Throwable {
		tgr = new TumsGasRelief();
		switchingTab(firstTab);
		tgr.clickOnHomeIcon();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tgr.clickOnHomeIcon();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	// Verify Heartburn101 in Breadcrumb
	@Test(priority = 2, enabled = true)
	private void verifyHeartBurn101() throws Throwable {
		tgr = new TumsGasRelief();
		switchingTab(firstTab);
		tgr.clickOnHeartBurn101();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tgr.clickOnHeartBurn101();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
//	@Test(priority = 2, enabled = true)
//	private void verifyGasX() throws Throwable {
//		tgr = new TumsGasRelief();
//		switchingTab(firstTab);
//		tgr.clickOnGasX();
//		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
//		switchingTab(secondTab);
//		tgr.clickOnGasX();
//		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
//	}
	@Test(priority = 2, enabled = true)
	private void verifyLifestyleSuggestions() throws Throwable {
		tgr = new TumsGasRelief();
		switchingTab(firstTab);
		tgr.clickOnLifestyleSuggestions();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tgr.clickOnLifestyleSuggestions();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyHeartburn() throws Throwable {
		tgr = new TumsGasRelief();
		switchingTab(firstTab);
		tgr.clickOnHeartburn();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tgr.clickOnHeartburn();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyTUMSChewyBitesWithGasRelief() throws Throwable {
		tgr = new TumsGasRelief();
		switchingTab(firstTab);
		tgr.clickOnTUMSChewyBitesWithGasRelief();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tgr.clickOnTUMSChewyBitesWithGasRelief();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	
	@Test(priority = 6, enabled = true)
	private void verifySeeProducts() throws Throwable {
		tgr = new TumsGasRelief();
		switchingTab(firstTab);
		tgr.clickSeeProducts();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tgr.clickSeeProducts();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}


}
