package com.qa.eno.co.in.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.eno.co.in.pages.EnoWhatisEno;

public class EnoWhatisEnoTest extends BaseClass{

	EnoWhatisEno ea;
	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadConfig("eno_co_inConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		ea = new EnoWhatisEno();
		switchingTab(firstTab);
		launchURL(loadConfig("eno_co_inConfig.properties").getProperty("EnoWhatisEnoPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("eno_co_inConfig.properties").getProperty("EnoWhatisEnoLiveUrl"));
	}
	@Test(priority = 2, enabled = true)
	private void verifyWhatisEno() throws Throwable {
		switchingTab(firstTab);
		ea.clickonWhatisEno();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ea.clickonWhatisEno();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyTheENOJourney() throws Throwable {
		switchingTab(firstTab);
		ea.clickonTheENOJourney();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ea.clickonTheENOJourney();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	
	@Test(priority = 2, enabled = true)
	private void verifyReferences() throws Throwable {
		switchingTab(firstTab);
		ea.clickonReferences();
		switchingTab(secondTab);
		ea.clickonReferences();
		System.out.println("references are working fine");
	}
	
	@Test(priority = 3)
	private void verifyDidyouKnowSection()throws Exception {
		switchingTab(firstTab);
		ea.clickDidYouKnowSection();
		System.out.println("Did you know section is verified in the preprod URL");
		switchingTab(secondTab);
		ea.clickDidYouKnowSection();
		System.out.println("Did you know section is verified in the live URL");
	}
}
