package com.qa.eno.co.in.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.eno.co.in.pages.EnoAllAboutAcidity;

public class EnoAllAboutAcidityTest extends BaseClass{
	EnoAllAboutAcidity EAA;
	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadConfig("eno_co_inConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		EAA = new EnoAllAboutAcidity();
		switchingTab(firstTab);
		launchURL(loadConfig("eno_co_inConfig.properties").getProperty("EnoAllAboutAcidityPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("eno_co_inConfig.properties").getProperty("EnoAllAboutAcidityLiveUrl"));
	}
	@Test(priority = 2, enabled = true)
	private void verifyUnderstandingAcidity() throws Throwable {
		switchingTab(firstTab);
		EAA.clickonUnderstandingAcidity();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		EAA.clickonUnderstandingAcidity();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 3, enabled = true)
	private void verifyHeartburnDuringPregnancy() throws Throwable {
		switchingTab(firstTab);
		EAA.clickonHeartburnDuringPregnancy();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		EAA.clickonHeartburnDuringPregnancy();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 4, enabled = true)
	private void verifyDealingWithAcidityAtNight() throws Throwable {
		switchingTab(firstTab);
		EAA.clickonDealingWithAcidityAtNight();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		EAA.clickonDealingWithAcidityAtNight();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 5, enabled = true)
	private void verifyHomeRemediesforAcidity() throws Throwable {
		switchingTab(firstTab);
		EAA.clickonHomeRemediesforAcidity();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		EAA.clickonHomeRemediesforAcidity();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 6, enabled = true)
	private void verifyLivingLifeAcidityFree() throws Throwable {
		switchingTab(firstTab);
		EAA.clickonLivingLifeAcidityFree();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		EAA.clickonLivingLifeAcidityFree();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 7, enabled = true)
	private void verifyLearnMore() throws Throwable {
		switchingTab(firstTab);
		EAA.clickonLearnMore();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		EAA.clickonLearnMore();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyDidyouKnowSection()throws Exception {
		switchingTab(firstTab);
		EAA.clickDidYouKnowSection();
		System.out.println("Did you know section is verified in the preprod URL");
		switchingTab(secondTab);
		EAA.clickDidYouKnowSection();
		System.out.println("Did you know section is verified in the live URL");
	}
	
}
