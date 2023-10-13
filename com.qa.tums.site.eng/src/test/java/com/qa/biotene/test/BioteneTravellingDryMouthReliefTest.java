package com.qa.biotene.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.biotene.pages.BioteneTravellingDryMouthRelief;

public class BioteneTravellingDryMouthReliefTest extends BaseClass{
	BioteneTravellingDryMouthRelief btd;
	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadConfig("biotene_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		btd = new BioteneTravellingDryMouthRelief();
		switchingTab(firstTab);
		launchURL(loadConfig("biotene_Config.properties").getProperty("BioteneTravellingDryMouthReliefPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("biotene_Config.properties").getProperty("BioteneTravellingDryMouthReliefLiveUrl"));
	}
	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Exception {
	btd =new BioteneTravellingDryMouthRelief();
	switchingTab(firstTab);
	btd.clickCookieBtn();
	btd.clickEmailBtn();
	System.out.println("Cookie Button and email popup closed successfully in the Preprod URL");
	switchingTab(secondTab);
	btd.clickCookieBtn();
	btd.clickEmailBtn();
	System.out.println("Cookie Button and email popup closed successfully in the Live URL");
}
	@Test(priority = 2, enabled = true)
	private void verifyBioteneDryMouthOralRinse() throws Throwable {
		switchingTab(firstTab);
		btd.clickonBioteneDryMouthOralRinse();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		btd.clickonBioteneDryMouthOralRinse();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyGetaGoodNightRest() throws Throwable {
		switchingTab(firstTab);
		btd.clickonGetaGoodNightRest();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		btd.clickonGetaGoodNightRest();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyConstantlyDrinkingWater() throws Throwable {
		switchingTab(firstTab);
		btd.clickonConstantlyDrinkingWater();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		btd.clickonConstantlyDrinkingWater();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyTAKETHEQUIZ() throws Throwable {
		switchingTab(firstTab);
		btd.clickonTAKETHEQUIZ();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		btd.clickonTAKETHEQUIZ();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyREADMORE() throws Throwable {
		switchingTab(firstTab);
		btd.clickonREADMORE();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		btd.clickonREADMORE();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifySHOPNOW() throws Throwable {
		switchingTab(firstTab);
		btd.clickonSHOPNOW();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		btd.clickonSHOPNOW();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

}
