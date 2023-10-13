package com.qa.biotene.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.biotene.pages.BioteneCottonMouthCauses;

public class BioteneCottonMouthCausesTest extends BaseClass{
	BioteneCottonMouthCauses bdc;
	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadConfig("biotene_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		bdc = new BioteneCottonMouthCauses();
		switchingTab(firstTab);
		launchURL(loadConfig("biotene_Config.properties").getProperty("BioteneCottonMouthCausesPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("biotene_Config.properties").getProperty("BioteneCottonMouthCausesLiveUrl"));
	}
	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Exception {
	bdc =new BioteneCottonMouthCauses();
	switchingTab(firstTab);
	bdc.clickCookieBtn();
	bdc.clickEmailBtn();
	System.out.println("Cookie Button and email popup closed successfully in the Preprod URL");
	switchingTab(secondTab);
	bdc.clickCookieBtn();
	bdc.clickEmailBtn();
	System.out.println("Cookie Button and email popup closed successfully in the Live URL");
}
	@Test(priority = 2, enabled = true)
	private void verifyManageYourSymptoms() throws Throwable {
		switchingTab(firstTab);
		bdc.clickonManageYourSymptoms();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		bdc.clickonManageYourSymptoms();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 3, enabled = true)
	private void verifyOurProducts() throws Throwable {
		switchingTab(firstTab);
		bdc.clickonOurProducts();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		bdc.clickonOurProducts();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 4, enabled = true)
	private void verifyOurSite() throws Throwable {
		switchingTab(firstTab);
		bdc.clickonOurSite();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		bdc.clickonOurSite();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 5, enabled = true)
	private void verifyTAKETHEQUIZ() throws Throwable {
		switchingTab(firstTab);
		bdc.clickonTAKETHEQUIZ();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		bdc.clickonTAKETHEQUIZ();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 6, enabled = true)
	private void verifyGETCOUPONS() throws Throwable {
		switchingTab(firstTab);
		bdc.clickonGETCOUPONS();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		bdc.clickonGETCOUPONS();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 7, enabled = true)
	private void verifySHOPNOW() throws Throwable {
		switchingTab(firstTab);
		bdc.clickonSHOPNOW();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		bdc.clickonSHOPNOW();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	
	

}
