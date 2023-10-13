package com.qa.eno.co.in.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.eno.co.in.pages.EnoUnderstandingAcidity;

public class EnoUnderstandingAcidityTest extends BaseClass{
	
	EnoUnderstandingAcidity ewd;
	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadConfig("eno_co_inConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		ewd = new EnoUnderstandingAcidity();
		switchingTab(firstTab);
		launchURL(loadConfig("eno_co_inConfig.properties").getProperty("EnoUnderstandingAcidityPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("eno_co_inConfig.properties").getProperty("EnoUnderstandingAcidityLiveUrl"));
	}
	@Test(priority = 2, enabled = true)
	private void verifyPrevious() throws Throwable {
		ewd = new EnoUnderstandingAcidity();
		switchingTab(firstTab);
		ewd.clickonPrevious();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ewd.clickonPrevious();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyNext() throws Throwable {
		switchingTab(firstTab);
		ewd.clickonNext();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ewd.clickonNext();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyHereLink1() throws Throwable {
		switchingTab(firstTab);
		ewd.clickonHereLink1();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ewd.clickonHereLink1();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyHereLink2() throws Throwable {
		switchingTab(firstTab);
		ewd.clickonHereLink2();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ewd.clickonHereLink2();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyReferences() throws Throwable {
		switchingTab(firstTab);
		ewd.clickonReferences();
		switchingTab(secondTab);
		ewd.clickonReferences();
		System.out.println("references are working fine");
	}

	@Test(priority = 2, enabled = true)
	private void verifyLivingLifeAcidityFree() throws Throwable {
		switchingTab(firstTab);
		ewd.clickonLivingLifeAcidityFree();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ewd.clickonLivingLifeAcidityFree();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyHomeRemediestoCureAcidity() throws Throwable {
		switchingTab(firstTab);
		ewd.clickonHomeRemediestoCureAcidity();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ewd.clickonHomeRemediestoCureAcidity();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyDidyouKnowSection()throws Exception {
		switchingTab(firstTab);
		ewd.clickDidYouKnowSection();
		System.out.println("Did you know section is verified in the preprod URL");
		switchingTab(secondTab);
		ewd.clickDidYouKnowSection();
		System.out.println("Did you know section is verified in the live URL");
	}

}
