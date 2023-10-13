package com.qa.eno.co.in.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.eno.co.in.pages.EnoAcidity;

public class EnoAcidityTest extends BaseClass{
	
	EnoAcidity ea;
	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadConfig("eno_co_inConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		ea = new EnoAcidity();
		switchingTab(firstTab);
		launchURL(loadConfig("eno_co_inConfig.properties").getProperty("EnoAcidityPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("eno_co_inConfig.properties").getProperty("EnoAcidityLiveUrl"));
	}
	@Test(priority = 2, enabled = true)
	private void verifyUnderstandingAcidity() throws Throwable {
		switchingTab(firstTab);
		ea.clickonUnderstandingAcidity();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ea.clickonUnderstandingAcidity();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 3, enabled = true)
	private void verifyInitialSymptomsOfAcidity() throws Throwable {
		switchingTab(firstTab);
		ea.clickonInitialSymptomsOfAcidity();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ea.clickonInitialSymptomsOfAcidity();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 4, enabled = true)
	private void verifyDealingWithAcidityAtNight() throws Throwable {
		switchingTab(firstTab);
		ea.clickonDealingWithAcidityAtNight();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ea.clickonDealingWithAcidityAtNight();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 5, enabled = true)
	private void verifyHomeRemediesforAcidity() throws Throwable {
		switchingTab(firstTab);
		ea.clickonHomeRemediesforAcidity();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ea.clickonHomeRemediesforAcidity();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 6, enabled = true)
	private void verifyLivingLifeAcidityFree() throws Throwable {
		switchingTab(firstTab);
		ea.clickonLivingLifeAcidityFree();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ea.clickonLivingLifeAcidityFree();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 7, enabled = true)
	private void verifyLearnMore() throws Throwable {
		switchingTab(firstTab);
		ea.clickonLearnMore();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ea.clickonLearnMore();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyDidyouKnowSection()throws Exception {
		switchingTab(firstTab);
		ea.clickDidYouKnowSection();
		System.out.println("Did you know section is verified in the preprod URL");
		switchingTab(secondTab);
		ea.clickDidYouKnowSection();
		System.out.println("Did you know section is verified in the live URL");
	}
	

}

