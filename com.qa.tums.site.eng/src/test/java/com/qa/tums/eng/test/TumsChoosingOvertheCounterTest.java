package com.qa.tums.eng.test;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.TumsChoosingOvertheCounter;

public class TumsChoosingOvertheCounterTest extends BaseClass{
	TumsChoosingOvertheCounter tco;
	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadConfig("TumsConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("TumsConfig.properties").getProperty("TumsChoosingOvertheCounterPreprodURL"));
		switchingTab(secondTab);
		launchURL(loadConfig("TumsConfig.properties").getProperty("TumsChoosingOvertheCounterLiveURL"));

		
	}
	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Throwable {
	tco = new TumsChoosingOvertheCounter();
	switchingTab(firstTab);
	tco.clickOnCookies();
	System.out.println("Cookie Button clicked successfully in the Preprod URL");
	switchingTab(secondTab);
	tco.clickOnCookies();
	System.out.println("Cookie Button clicked successfully in the Live URL");
	}
	
	@Test(priority = 1, enabled = true)
	private void verifyHomeIcon() throws Throwable {
		tco = new TumsChoosingOvertheCounter();
		switchingTab(firstTab);
		tco.clickOnHomeIcon();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tco.clickOnHomeIcon();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);

	}
	// Verify Heartburn101 in Breadcrumb
			@Test(priority = 2, enabled = true)
			private void verifyHeartBurn101() throws Throwable {
				tco = new TumsChoosingOvertheCounter();
				switchingTab(firstTab);
				tco.clickOnHeartBurn101();
				String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
				switchingTab(secondTab);
				tco.clickOnHeartBurn101();
				String liveUrl = compareUrl(excelRead("Tums", 1, 1));
				boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
				System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);
			}
			
			@Test(priority = 6, enabled = true)
			private void verifyHeartburnLink() throws Throwable {
				tco = new TumsChoosingOvertheCounter();
				switchingTab(firstTab);
				tco.clickHeartburnLink();
				String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
				switchingTab(secondTab);
				tco.clickHeartburnLink();
				String liveUrl = compareUrl(excelRead("Tums", 1, 1));
				boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
				System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);
			}
			@Test(priority = 6, enabled = true)
			private void verifyTUMSLink() throws Throwable {
				tco = new TumsChoosingOvertheCounter();
				switchingTab(firstTab);
				tco.clickTUMSLink();
				String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
				switchingTab(secondTab);
				tco.clickTUMSLink();
				String liveUrl = compareUrl(excelRead("Tums", 1, 1));
				boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
				System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);
			}
			@Test(priority = 6, enabled = true)
			private void verifyTUMSChewyBitesLink() throws Throwable {
				tco = new TumsChoosingOvertheCounter();
				switchingTab(firstTab);
				tco.clickTUMSChewyBitesLink();
				String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
				switchingTab(secondTab);
				tco.clickTUMSChewyBitesLink();
				String liveUrl = compareUrl(excelRead("Tums", 1, 1));
				boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
				System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);
			}
			@Test(priority = 6, enabled = true)
			private void verifyHeartburnQuizLink() throws Throwable {
				tco = new TumsChoosingOvertheCounter();
				switchingTab(firstTab);
				tco.clickHeartburnQuizLink();
				String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
				switchingTab(secondTab);
				tco.clickHeartburnQuizLink();
				String liveUrl = compareUrl(excelRead("Tums", 1, 1));
				boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
				System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);
			}
			@Test(priority = 6, enabled = true)
			private void verifyCausesofHeartburnLink() throws Throwable {
				tco = new TumsChoosingOvertheCounter();
				switchingTab(firstTab);
				tco.clickCausesofHeartburnLink();
				String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
				switchingTab(secondTab);
				tco.clickCausesofHeartburnLink();
				String liveUrl = compareUrl(excelRead("Tums", 1, 1));
				boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
				System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);
			}
			@Test(priority = 6, enabled = true)
			private void verifyHowtoRelieveHeartburnLink() throws Throwable {
				tco = new TumsChoosingOvertheCounter();
				switchingTab(firstTab);
				tco.clickHowtoRelieveHeartburnLink();
				String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
				switchingTab(secondTab);
				tco.clickHowtoRelieveHeartburnLink();
				String liveUrl = compareUrl(excelRead("Tums", 1, 1));
				boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
				System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);
			}
			@Test(priority = 6, enabled = true)
			private void verifyWhatBehaviorsCanTriggerHeartburnLink() throws Throwable {
				tco = new TumsChoosingOvertheCounter();
				switchingTab(firstTab);
				tco.clickWhatBehaviorsCanTriggerHeartburnLink();
				String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
				switchingTab(secondTab);
				tco.clickWhatBehaviorsCanTriggerHeartburnLink();
				String liveUrl = compareUrl(excelRead("Tums", 1, 1));
				boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
				System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);
			}
			@Test(priority = 6, enabled = true)
			private void verifySeeProducts() throws Throwable {
				tco = new TumsChoosingOvertheCounter();
				switchingTab(firstTab);
				tco.clickSeeProducts();
				String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
				switchingTab(secondTab);
				tco.clickSeeProducts();
				String liveUrl = compareUrl(excelRead("Tums", 1, 1));
				boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
				System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);
			}
			
}
