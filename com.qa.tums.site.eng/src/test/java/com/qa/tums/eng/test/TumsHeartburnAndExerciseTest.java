package com.qa.tums.eng.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.TumsHeartburnAndExercise;

public class TumsHeartburnAndExerciseTest extends BaseClass{
	TumsHeartburnAndExercise tha;
	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadConfig("TumsConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		tha = new TumsHeartburnAndExercise();
		switchingTab(firstTab);
		launchURL(loadConfig("TumsConfig.properties").getProperty("TumsHeartburnAndExercisePreprodURL"));
		switchingTab(secondTab);
		launchURL(loadConfig("TumsConfig.properties").getProperty("TumsHeartburnAndExerciseLiveURL"));

	}

	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Throwable {
		tha = new TumsHeartburnAndExercise();
		switchingTab(firstTab);
		tha.clickOnCookies();
		System.out.println("Cookie Accept Button clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		tha.clickOnCookies();
		System.out.println("Cookie Button clicked successfully in the Live URL");
	}

	@Test(priority = 1, enabled = true)
	private void verifyHomeIcon() throws Throwable {
		tha = new TumsHeartburnAndExercise();
		switchingTab(firstTab);
		tha.clickOnHomeIcon();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tha.clickOnHomeIcon();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	// Verify Heartburn101 in Breadcrumb
	@Test(priority = 2, enabled = true)
	private void verifyHeartBurn101() throws Throwable {
		tha = new TumsHeartburnAndExercise();
		switchingTab(firstTab);
		tha.clickOnHeartBurn101();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tha.clickOnHeartBurn101();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyGERD() throws Throwable {
		tha = new TumsHeartburnAndExercise();
		switchingTab(firstTab);
		tha.clickOnGERD();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tha.clickOnGERD();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyHeartburnSymptoms() throws Throwable {
		tha = new TumsHeartburnAndExercise();
		switchingTab(firstTab);
		tha.clickOnHeartburnSymptoms();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tha.clickOnHeartburnSymptoms();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyOtherLifestyleModifications() throws Throwable {
		tha = new TumsHeartburnAndExercise();
		switchingTab(firstTab);
		tha.clickOnOtherLifestyleModifications();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tha.clickOnOtherLifestyleModifications();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyMoreArticlesOnHeartburnFromTUMS() throws Throwable {
		tha = new TumsHeartburnAndExercise();
		switchingTab(firstTab);
		tha.clickOnMoreArticlesOnHeartburnFromTUMS();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tha.clickOnMoreArticlesOnHeartburnFromTUMS();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	
	@Test(priority = 6, enabled = true)
	private void verifySeeProducts() throws Throwable {
		tha = new TumsHeartburnAndExercise();
		switchingTab(firstTab);
		tha.clickSeeProducts();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tha.clickSeeProducts();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}


}
