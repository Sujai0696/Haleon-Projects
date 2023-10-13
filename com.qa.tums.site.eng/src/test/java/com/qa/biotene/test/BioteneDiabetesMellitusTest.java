package com.qa.biotene.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.biotene.pages.BioteneDiabetesMellitus;

public class BioteneDiabetesMellitusTest extends BaseClass{
	BioteneDiabetesMellitus mdm;
	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadConfig("biotene_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		mdm = new BioteneDiabetesMellitus();
		switchingTab(firstTab);
		launchURL(loadConfig("biotene_Config.properties").getProperty("BioteneDiabetesMellitusPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("biotene_Config.properties").getProperty("BioteneDiabetesMellitusLiveUrl"));
	}
	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Exception {
	mdm =new BioteneDiabetesMellitus();
	switchingTab(firstTab);
	mdm.clickCookieBtn();
	mdm.clickEmailBtn();
	System.out.println("Cookie Button and email popup closed successfully in the Preprod URL");
	switchingTab(secondTab);
	mdm.clickCookieBtn();
	mdm.clickEmailBtn();
	System.out.println("Cookie Button and email popup closed successfully in the Live URL");
}
	@Test(priority = 2, enabled = true)
	private void verifyBioteneDryMouthOralRinse() throws Throwable {
		switchingTab(firstTab);
		mdm.clickonBioteneDryMouthOralRinse();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		mdm.clickonBioteneDryMouthOralRinse();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyTAKETHEQUIZ() throws Throwable {
		switchingTab(firstTab);
		mdm.clickonTAKETHEQUIZ();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		mdm.clickonTAKETHEQUIZ();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyREADMORE() throws Throwable {
		switchingTab(firstTab);
		mdm.clickonREADMORE();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		mdm.clickonREADMORE();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifySHOPNOW() throws Throwable {
		switchingTab(firstTab);
		mdm.clickonSHOPNOW();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		mdm.clickonSHOPNOW();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

}
