package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.abreva.pages.AbrevaUnderstandingColdSoresPage;
import com.qa.baseClass.BaseClass;

public class AbrevaUnderstandingColdSoresTest extends BaseClass{
	
	AbrevaUnderstandingColdSoresPage ucs;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("Abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		ucs = new AbrevaUnderstandingColdSoresPage();
		switchingTab(firstTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("understandingColdSoresPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("understandingColdSoresLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		ucs.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		ucs.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	
	@Test(priority = 1)
	private void verifyHyperLinkCausesOfColdSores() throws Exception{
		switchingTab(firstTab);
		ucs.clickHyperLinkCausesOfColdSores();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		ucs.clickHyperLinkCausesOfColdSores();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Causes Of Cold Sores: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyHyperLinkColdSoreTriggers() throws Exception{
		switchingTab(firstTab);
		ucs.clickHyperLinkColdSoreTriggers();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		ucs.clickHyperLinkColdSoreTriggers();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Cold Sore Triggers: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyHyperLinkAbrevaCreamOne() throws Exception{
		switchingTab(firstTab);
		ucs.clickHyperLinkAbrevaCreamOne();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		ucs.clickHyperLinkAbrevaCreamOne();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Abreva Cream One: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyHyperLinkTinglingItching() throws Exception{
		switchingTab(firstTab);
		ucs.clickHyperLinkTinglingItching();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		ucs.clickHyperLinkTinglingItching();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Tingling Itching: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyHyperLinkAbrevaCreamTwo() throws Exception{
		switchingTab(firstTab);
		ucs.clickHyperLinkAbrevaCreamTwo();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		ucs.clickHyperLinkAbrevaCreamTwo();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Abreva Cream Two: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyHyperLinkMostCommonTriggers() throws Exception{
		switchingTab(firstTab);
		ucs.clickHyperLinkMostCommonTriggers();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		ucs.clickHyperLinkMostCommonTriggers();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink MostCommonTriggers: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyGetcoupon() throws Exception{
		switchingTab(firstTab);
		ucs.clickGetcoupon();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		ucs.clickGetcoupon();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Get coupon: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		ucs.clickBuyNow();
		System.out.println("Buy Now Button verified in the preprod URL");
		switchingTab(secondTab);
		ucs.clickBuyNow();
		System.out.println("Buy Now Button verified in the Live URL");
	}
	

}
