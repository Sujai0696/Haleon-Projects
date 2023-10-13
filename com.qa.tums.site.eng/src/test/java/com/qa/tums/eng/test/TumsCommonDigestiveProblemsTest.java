package com.qa.tums.eng.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.TumsCommonDigestiveProblems;

public class TumsCommonDigestiveProblemsTest extends BaseClass{
	TumsCommonDigestiveProblems tcd;
	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadConfig("TumsConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("TumsConfig.properties").getProperty("TumsCommonDigestiveProblemsPreprodURL"));
		switchingTab(secondTab);
		launchURL(loadConfig("TumsConfig.properties").getProperty("TumsCommonDigestiveProblemsLiveURL"));
		tcd = new TumsCommonDigestiveProblems();
		
	}
	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Throwable {
		tcd = new TumsCommonDigestiveProblems();
	switchingTab(firstTab);
	tcd.clickOnCookies();
	System.out.println("Cookie Button clicked successfully in the Preprod URL");
	switchingTab(secondTab);
	tcd.clickOnCookies();
	System.out.println("Cookie Button clicked successfully in the Live URL");
	}
	
	@Test(priority = 1, enabled = true)
	private void verifyHomeIcon() throws Throwable {
		tcd = new TumsCommonDigestiveProblems();
		switchingTab(firstTab);
		tcd.clickOnHomeIcon();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tcd.clickOnHomeIcon();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);

	}
	// Verify Heartburn101 in Breadcrumb
		@Test(priority = 2, enabled = true)
		private void verifyHeartBurn101() throws Throwable {
			tcd = new TumsCommonDigestiveProblems();
			switchingTab(firstTab);
			tcd.clickOnHeartBurn101();
			String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
			switchingTab(secondTab);
			tcd.clickOnHeartBurn101();
			String liveUrl = compareUrl(excelRead("Tums", 1, 1));
			boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
			System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);

		}
		
		@Test(priority = 6, enabled = true)
		private void verifySymptomsofHeartburn() throws Throwable {
			tcd = new TumsCommonDigestiveProblems();
			switchingTab(firstTab);
			tcd.clickSymptomsofHeartburn();
			String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
			switchingTab(secondTab);
			tcd.clickSymptomsofHeartburn();
			String liveUrl = compareUrl(excelRead("Tums", 1, 1));
			boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
			System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);

		}
		@Test(priority = 6, enabled = true)
		private void verifyTumsLink() throws Throwable {
			tcd = new TumsCommonDigestiveProblems();
			switchingTab(firstTab);
			tcd.clickTumsLink();
			String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
			switchingTab(secondTab);
			tcd.clickTumsLink();
			String liveUrl = compareUrl(excelRead("Tums", 1, 1));
			boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
			System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);

		}

		@Test(priority = 6, enabled = true)
		private void verifyReduceHeartburnLink() throws Throwable {
			tcd = new TumsCommonDigestiveProblems();
			switchingTab(firstTab);
			tcd.clickReduceHeartburnLink();
			String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
			switchingTab(secondTab);
			tcd.clickReduceHeartburnLink();
			String liveUrl = compareUrl(excelRead("Tums", 1, 1));
			boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
			System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);

		}

		@Test(priority = 6, enabled = true)
		private void verifyHeartburnReliefLink() throws Throwable {
			tcd = new TumsCommonDigestiveProblems();
			switchingTab(firstTab);
			tcd.clickHeartburnReliefLink();
			String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
			switchingTab(secondTab);
			tcd.clickHeartburnReliefLink();
			String liveUrl = compareUrl(excelRead("Tums", 1, 1));
			boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
			System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);

		}
		@Test(priority = 6, enabled = true)
		private void verifyGERDAndHeartburnLink() throws Throwable {
			tcd = new TumsCommonDigestiveProblems();
			switchingTab(firstTab);
			tcd.clickGERDAndHeartburnLink();
			String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
			switchingTab(secondTab);
			tcd.clickGERDAndHeartburnLink();
			String liveUrl = compareUrl(excelRead("Tums", 1, 1));
			boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
			System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);

		}
		@Test(priority = 6, enabled = true)
		private void verifyIndigestionLink() throws Throwable {
			tcd = new TumsCommonDigestiveProblems();
			switchingTab(firstTab);
			tcd.clickIndigestionLink();
			String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
			switchingTab(secondTab);
			tcd.clickIndigestionLink();
			String liveUrl = compareUrl(excelRead("Tums", 1, 1));
			boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
			System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);

		}
      @Test(priority = 6, enabled = true)
		private void verifySeeProducts() throws Throwable {
			tcd = new TumsCommonDigestiveProblems();
			switchingTab(firstTab);
			tcd.clickSeeProducts();
			String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
			switchingTab(secondTab);
			tcd.clickSeeProducts();
			String liveUrl = compareUrl(excelRead("Tums", 1, 1));
			boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
			System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);

		}

}
