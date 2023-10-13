package com.qa.tums.eng.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.TumsGutHealthFood;

public class TumsGutHealthFoodTest extends BaseClass{
	TumsGutHealthFood tgh;
	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadConfig("TumsConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("TumsConfig.properties").getProperty("TumsGutHealthFoodPreprodURL"));
		switchingTab(secondTab);
		launchURL(loadConfig("TumsConfig.properties").getProperty("TumsGutHealthFoodLiveURL"));

	}

	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Throwable {
		tgh = new TumsGutHealthFood();
		switchingTab(firstTab);
		tgh.clickCookieBtn();
		System.out.println("Cookie Button clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		tgh.clickCookieBtn();
		System.out.println("Cookie Button clicked successfully in the Live URL");
	}

	@Test(priority = 1, enabled = true)
	private void verifyHomeIcon() throws Throwable {
		tgh = new TumsGutHealthFood();
		switchingTab(firstTab);
		tgh.clickOnHomeIcon();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tgh.clickOnHomeIcon();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	// Verify Heartburn101 in Breadcrumb
	@Test(priority = 2, enabled = true)
	private void verifyHeartBurn101() throws Throwable {
		tgh = new TumsGutHealthFood();
		switchingTab(firstTab);
		tgh.clickOnHeartBurn101();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tgh.clickOnHeartBurn101();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyCulpritsForHeartburn() throws Throwable {
		tgh = new TumsGutHealthFood();
		switchingTab(firstTab);
		tgh.clickOnCulpritsForHeartburn();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tgh.clickOnCulpritsForHeartburn();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyManageIndigestion() throws Throwable {
		tgh = new TumsGutHealthFood();
		switchingTab(firstTab);
		tgh.clickOnManageIndigestion();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tgh.clickOnManageIndigestion();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifySite() throws Throwable {
		tgh = new TumsGutHealthFood();
		switchingTab(firstTab);
		tgh.clickOnSite();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tgh.clickOnSite();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 6, enabled = true)
	private void verifySeeProducts() throws Throwable {
		tgh = new TumsGutHealthFood();
		switchingTab(firstTab);
		tgh.clickSeeProducts();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tgh.clickSeeProducts();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}


}
