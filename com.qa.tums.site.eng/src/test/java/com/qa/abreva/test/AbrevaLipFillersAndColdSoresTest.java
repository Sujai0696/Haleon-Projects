package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.abreva.pages.AbrevaLipFillersAndColdSoresPage;
import com.qa.baseClass.BaseClass;

public class AbrevaLipFillersAndColdSoresTest extends BaseClass{
	
	AbrevaLipFillersAndColdSoresPage lfcs;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("Abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		lfcs = new AbrevaLipFillersAndColdSoresPage();
		switchingTab(firstTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("lipFillersAndColdSoresPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("lipFillersAndColdSoresLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		lfcs.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		lfcs.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	

	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		lfcs.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		lfcs.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyHyperLinkCommonColdSoreTriggers() throws Exception{
		switchingTab(firstTab);
		lfcs.clickHyperLinkCommonColdSoreTriggers();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		lfcs.clickHyperLinkCommonColdSoreTriggers();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Common Cold Sore Triggers: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyHyperLinkFatigue() throws Exception{
		switchingTab(firstTab);
		lfcs.clickHyperLinkFatigue();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		lfcs.clickHyperLinkFatigue();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Fatigue: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyHyperLinkSun() throws Exception{
		switchingTab(firstTab);
		lfcs.clickHyperLinkSun();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		lfcs.clickHyperLinkSun();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Sun: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyHyperLinkAbreva() throws Exception{
		switchingTab(firstTab);
		lfcs.clickHyperLinkAbreva();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		lfcs.clickHyperLinkAbreva();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Abreva: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyHyperLinkDealingWithColdSores() throws Exception{
		switchingTab(firstTab);
		lfcs.clickHyperLinkDealingWithColdSores();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		lfcs.clickHyperLinkDealingWithColdSores();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Dealing With Cold Sores: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyReadOurLipCareTips() throws Exception{
		switchingTab(firstTab);
		lfcs.clickReadOurLipCareTips();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		lfcs.clickReadOurLipCareTips();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Read Our Lip Care Tips: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		lfcs.clickBuyNow();
		System.out.println("Buy Now Button verified in the preprod URL");
		switchingTab(secondTab);
		lfcs.clickBuyNow();
		System.out.println("Buy Now Button verified in the Live URL");
	}
	
	
	
	

}
