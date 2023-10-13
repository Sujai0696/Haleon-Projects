package com.qa.tums.eng.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.TumsAcidRefluxVsGERD;
import com.qa.tums.eng.pages.tumsDailyHearburnTrigger;

public class TumsAcidRefluxVsGERDTest extends BaseClass {

	TumsAcidRefluxVsGERD tag;

	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadConfig("TumsConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("TumsConfig.properties").getProperty("TumsAcidRefluxVsGerdPreprodURL"));
		switchingTab(secondTab);
		launchURL(loadConfig("TumsConfig.properties").getProperty("TumsAcidRefluxVsGerdLiveURL"));
	}

	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Throwable {
		tag = new TumsAcidRefluxVsGERD();
		switchingTab(firstTab);
		tag.clickCookieBtn();
		System.out.println("Cookie Button clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		tag.clickCookieBtn();
		System.out.println("Cookie Button clicked successfully in the Live URL");
	}

	@Test(priority = 1, enabled = true)
	private void verifyHomeIcon() throws Throwable {
		
		switchingTab(firstTab);
		tag.clickOnHomeIcon();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tag.clickOnHomeIcon();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);

	}

	@Test(priority = 1, enabled = true)
	private void verifyHeartBurn101() throws Throwable {
		switchingTab(firstTab);
		tag.clickOnHeartBurn101();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tag.clickOnHeartBurn101();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);
		
	}

	@Test(priority = 1, enabled = true)
	private void verifyLifestyleSuggestionsLink() throws Throwable {
		switchingTab(firstTab);
		tag.clickOnlifestyleSuggestionsLink();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tag.clickOnlifestyleSuggestionsLink();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);

	}
	@Test(priority = 1, enabled = true)
	private void verifyHeartburnLink() throws Throwable {
		switchingTab(firstTab);
		tag.clickOnheartburnLink();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tag.clickOnheartburnLink();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);

	}
	@Test(priority = 1, enabled = true)
	private void verifyTUMSChewyLink() throws Throwable {
		switchingTab(firstTab);
		tag.clickOnTUMSChewyLink();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		tag.clickOnTUMSChewyLink();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);

	}
}
