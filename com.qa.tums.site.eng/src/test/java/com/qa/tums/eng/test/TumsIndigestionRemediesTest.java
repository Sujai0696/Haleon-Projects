package com.qa.tums.eng.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.TumsIndigestionRemedies;

public class TumsIndigestionRemediesTest extends BaseClass{
	TumsIndigestionRemedies tir;
	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadConfig("TumsConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		tir = new TumsIndigestionRemedies();
		switchingTab(firstTab);
		launchURL(loadConfig("TumsConfig.properties").getProperty("TumsIndigestionRemediesPreprodURL"));
		switchingTab(secondTab);
		launchURL(loadConfig("TumsConfig.properties").getProperty("TumsIndigestionRemediesLiveURL"));

	}

	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Throwable {
		tir = new TumsIndigestionRemedies();
		switchingTab(firstTab);
		tir.clickOnCookies();
		System.out.println("Cookie Button clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		tir.clickOnCookies();
		System.out.println("Cookie Button clicked successfully in the Live URL");
	}

	@Test(priority = 1, enabled = true)
	private void verifyHomeIcon() throws Throwable {
		tir = new TumsIndigestionRemedies();
		switchingTab(firstTab);
		tir.clickOnHomeIcon();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tir.clickOnHomeIcon();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	// Verify Heartburn101 in Breadcrumb
	@Test(priority = 2, enabled = true)
	private void verifyHeartBurn101() throws Throwable {
		tir = new TumsIndigestionRemedies();
		switchingTab(firstTab);
		tir.clickOnHeartBurn101();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tir.clickOnHeartBurn101();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyIndigestionAndHeartburn() throws Throwable {
		tir = new TumsIndigestionRemedies();
		switchingTab(firstTab);
		tir.clickOnIndigestionAndHeartburn();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tir.clickOnIndigestionAndHeartburn();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyTipsOnGettingFastHeartburn() throws Throwable {
		tir = new TumsIndigestionRemedies();
		switchingTab(firstTab);
		tir.clickOnTipsOnGettingFastHeartburn();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tir.clickOnTipsOnGettingFastHeartburn();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyMoreArticlesFromTUMS() throws Throwable {
		tir = new TumsIndigestionRemedies();
		switchingTab(firstTab);
		tir.clickOnMoreArticlesFromTUMS();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tir.clickOnMoreArticlesFromTUMS();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	
	@Test(priority = 6, enabled = true)
	private void verifySeeProducts() throws Throwable {
		tir = new TumsIndigestionRemedies();
		switchingTab(firstTab);
		tir.clickSeeProducts();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tir.clickSeeProducts();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

}
