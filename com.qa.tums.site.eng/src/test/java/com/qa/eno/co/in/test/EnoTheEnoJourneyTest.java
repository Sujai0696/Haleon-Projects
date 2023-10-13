package com.qa.eno.co.in.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.eno.co.in.pages.EnoTheEnoJourney;

public class EnoTheEnoJourneyTest extends BaseClass{
	EnoTheEnoJourney ete;
	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadConfig("eno_co_inConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		ete = new EnoTheEnoJourney();
		switchingTab(firstTab);
		launchURL(loadConfig("eno_co_inConfig.properties").getProperty("EnoTheEnoJourneyPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("eno_co_inConfig.properties").getProperty("EnoTheEnoJourneyLiveUrl"));
	}
	@Test(priority = 2, enabled = true)
	private void verifyWhatisEno() throws Throwable {
		switchingTab(firstTab);
		ete.clickonWhatisEno();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ete.clickonWhatisEno();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyTheENOJourney() throws Throwable {
		switchingTab(firstTab);
		ete.clickonTheENOJourney();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ete.clickonTheENOJourney();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	
	@Test(priority = 2, enabled = true)
	private void verifyReferences() throws Throwable {
		switchingTab(firstTab);
		ete.clickonReferences();
		switchingTab(secondTab);
		ete.clickonReferences();
		System.out.println("references are working fine");
	}
	
	@Test(priority = 3)
	private void verifyDidyouKnowSection()throws Exception {
		switchingTab(firstTab);
		ete.clickDidYouKnowSection();
		System.out.println("Did you know section is verified in the preprod URL");
		switchingTab(secondTab);
		ete.clickDidYouKnowSection();
		System.out.println("Did you know section is verified in the live URL");
	}
}
