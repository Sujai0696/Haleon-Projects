package com.qa.eno.co.in.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.eno.co.in.pages.EnoHomeRemediesForIndigestion;

public class EnoHomeRemediesForIndigestionTest extends BaseClass{
	EnoHomeRemediesForIndigestion ehr;
	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadConfig("eno_co_inConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		ehr = new EnoHomeRemediesForIndigestion();
		switchingTab(firstTab);
		launchURL(loadConfig("eno_co_inConfig.properties").getProperty("EnoHomeRemediesForIndigestionPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("eno_co_inConfig.properties").getProperty("EnoHomeRemediesForIndigestionLiveUrl"));
	}
	@Test(priority = 1, enabled = true)
	private void verifyPrevious() throws Throwable {
		ehr = new EnoHomeRemediesForIndigestion();
		switchingTab(firstTab);
		ehr.clickonPrevious();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ehr.clickonPrevious();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyNext() throws Throwable {
		switchingTab(firstTab);
		ehr.clickonNext();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ehr.clickonNext();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	
	@Test(priority = 3, enabled = true)
	private void verifyReferences() throws Throwable {
		switchingTab(firstTab);
		ehr.clickonReferences();
		switchingTab(secondTab);
		ehr.clickonReferences();
		System.out.println("references are working fine");
	}

	@Test(priority = 4, enabled = true)
	private void verifyLivingLifeAcidityFree() throws Throwable {
		switchingTab(firstTab);
		ehr.clickonGasRelief();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ehr.clickonGasRelief();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 5, enabled = true)
	private void verifyUnderstandingAcidity() throws Throwable {
		switchingTab(firstTab);
		ehr.clickonUnderstandingAcidity();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ehr.clickonUnderstandingAcidity();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 6, enabled = true)
	private void verifyCarousal() throws Throwable {
		switchingTab(firstTab);
		ehr.clickonCarousal();
		switchingTab(secondTab);
		ehr.clickonCarousal();
		System.out.println("references are working fine");
	}
	@Test(priority = 7, enabled = true)
	private void verifyLearnMore() throws Throwable {
		switchingTab(firstTab);
		ehr.clickonLearnMore();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ehr.clickonLearnMore();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyDidyouKnowSection()throws Exception {
		switchingTab(firstTab);
		ehr.clickDidYouKnowSection();
		System.out.println("Did you know section is verified in the preprod URL");
		switchingTab(secondTab);
		ehr.clickDidYouKnowSection();
		System.out.println("Did you know section is verified in the live URL");
	}
	
}
