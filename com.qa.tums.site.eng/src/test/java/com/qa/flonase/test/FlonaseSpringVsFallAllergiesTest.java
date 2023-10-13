package com.qa.flonase.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.flonase.pages.FlonaseSpringVsFallAllergiesPage;

public class FlonaseSpringVsFallAllergiesTest extends BaseClass{
	
	FlonaseSpringVsFallAllergiesPage sfa;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("Flonase_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		sfa = new FlonaseSpringVsFallAllergiesPage();
		switchingTab(firstTab);
		launchURL(loadConfig("Flonase_Config.properties").getProperty("springVsFallAllergiesPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("Flonase_Config.properties").getProperty("springVsFallAllergiesLiveUrl"));
	}

	
	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		sfa.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		sfa.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyHyperLinkOne() throws Exception{
		switchingTab(firstTab);
		sfa.clickHyperLinkOne();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		sfa.clickHyperLinkOne();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkOne: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyHyperLinkTwo() throws Exception{
		switchingTab(firstTab);
		sfa.clickHyperLinkTwo();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		sfa.clickHyperLinkTwo();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkTwo: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyHyperLinkThree() throws Exception{
		switchingTab(firstTab);
		sfa.clickHyperLinkThree();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		sfa.clickHyperLinkThree();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkThree: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyTagsLinksOne() throws Exception{
		switchingTab(firstTab);
		sfa.clickTagsLinksOne();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		sfa.clickTagsLinksOne();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for TagsLinksOne: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyTagsLinksTwo() throws Exception{
		switchingTab(firstTab);
		sfa.clickTagsLinksTwo();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		sfa.clickTagsLinksTwo();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for TagsLinksTwo: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyTagsLinksThree() throws Exception{
		switchingTab(firstTab);
		sfa.clickTagsLinksThree();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		sfa.clickTagsLinksThree();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for TagsLinksThree: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyTagsLinksFour() throws Exception{
		switchingTab(firstTab);
		sfa.clickTagsLinksFour();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		sfa.clickTagsLinksFour();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for TagsLinksFour: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyTagsLinksFive() throws Exception{
		switchingTab(firstTab);
		sfa.clickTagsLinksFive();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		sfa.clickTagsLinksFive();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for TagsLinksFive: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyTagsLinksSix() throws Exception{
		switchingTab(firstTab);
		sfa.clickTagsLinksSix();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		sfa.clickTagsLinksSix();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for TagsLinksSix: "+compareTwoText);
	}

	
	@Test(priority = 10)
	private void verifyBtnBuyNow() throws Exception{
		switchingTab(firstTab);
		sfa.clickBtnBuyNow();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		sfa.clickBtnBuyNow();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for BtnBuyNow: "+compareTwoText);
	}
}
