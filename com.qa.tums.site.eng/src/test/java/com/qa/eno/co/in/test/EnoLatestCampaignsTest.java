package com.qa.eno.co.in.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.eno.co.in.pages.EnoLatestCampaigns;

public class EnoLatestCampaignsTest extends BaseClass{
	EnoLatestCampaigns elc;
	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadConfig("eno_co_inConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		elc = new EnoLatestCampaigns();
		switchingTab(firstTab);
		launchURL(loadConfig("eno_co_inConfig.properties").getProperty("EnoLatestCampaignsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("eno_co_inConfig.properties").getProperty("EnoLatestCampaignsLiveUrl"));
	}
	
	@Test(priority = 0)
	private void verifyDidyouKnowSection()throws Exception {
		switchingTab(firstTab);
		elc.clickDidYouKnowSection();
		System.out.println("Did you know section is verified in the preprod URL");
		switchingTab(secondTab);
		elc.clickDidYouKnowSection();
		System.out.println("Did you know section is verified in the live URL");
	}

}
