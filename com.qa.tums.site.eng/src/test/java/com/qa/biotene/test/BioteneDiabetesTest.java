package com.qa.biotene.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.biotene.pages.BioteneDiabetes;

public class BioteneDiabetesTest extends BaseClass{
	BioteneDiabetes bdt;
	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadConfig("biotene_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		bdt = new BioteneDiabetes();
		switchingTab(firstTab);
		launchURL(loadConfig("biotene_Config.properties").getProperty("BioteneCancerPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("biotene_Config.properties").getProperty("BioteneCancerLiveUrl"));
	}
	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Exception {
	bdt =new BioteneDiabetes();
	switchingTab(firstTab);
	bdt.clickCookieBtn();
	bdt.clickEmailBtn();
	System.out.println("Cookie Button and email popup closed successfully in the Preprod URL");
	switchingTab(secondTab);
	bdt.clickCookieBtn();
	bdt.clickEmailBtn();
	System.out.println("Cookie Button and email popup closed successfully in the Live URL");
}
	@Test(priority = 2, enabled = true)
	private void verifyLearnMore1() throws Throwable {
		switchingTab(firstTab);
		bdt.clickonLearnMore1();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		bdt.clickonLearnMore1();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyLearnMore2() throws Throwable {
		switchingTab(firstTab);
		bdt.clickonLearnMore2();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		bdt.clickonLearnMore2();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyLearnMore3() throws Throwable {
		switchingTab(firstTab);
		bdt.clickonLearnMore3();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		bdt.clickonLearnMore3();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyLearnMore4() throws Throwable {
		switchingTab(firstTab);
		bdt.clickonLearnMore4();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		bdt.clickonLearnMore4();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

}
