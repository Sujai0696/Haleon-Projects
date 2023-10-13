package com.qa.flonase.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.flonase.pages.FlonasePrepareForAllergySeasonPage;

public class FlonasePrepareForAllergySeasonTest extends BaseClass{
	
	FlonasePrepareForAllergySeasonPage pas;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("Flonase_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		pas = new FlonasePrepareForAllergySeasonPage();
		switchingTab(firstTab);
		launchURL(loadConfig("Flonase_Config.properties").getProperty("prepareForAllergySeasonPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("Flonase_Config.properties").getProperty("prepareForAllergySeasonLiveUrl"));
	}

	
	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		pas.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		pas.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyHyperLinkOne() throws Exception{
		switchingTab(firstTab);
		pas.clickHyperLinkOne();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pas.clickHyperLinkOne();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkOne: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyHyperLinkTwo() throws Exception{
		switchingTab(firstTab);
		pas.clickHyperLinkTwo();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pas.clickHyperLinkTwo();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkTwo: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyHyperLinkThree() throws Exception{
		switchingTab(firstTab);
		pas.clickHyperLinkThree();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pas.clickHyperLinkThree();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkThree: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyHyperLinkFour() throws Exception{
		switchingTab(firstTab);
		pas.clickHyperLinkFour();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pas.clickHyperLinkFour();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkFour: "+compareTwoText);
	}
	
	
	@Test(priority = 5)
	private void verifyHyperLinkFive() throws Exception{
		switchingTab(firstTab);
		pas.clickHyperLinkFive();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pas.clickHyperLinkFive();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkFive: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyHyperLinkSix() throws Exception{
		switchingTab(firstTab);
		pas.clickHyperLinkSix();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pas.clickHyperLinkSix();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkSix: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyHyperLinkSeven() throws Exception{
		switchingTab(firstTab);
		pas.clickHyperLinkSeven();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pas.clickHyperLinkSeven();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkSeven: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyHyperLinkEight() throws Exception{
		switchingTab(firstTab);
		pas.clickHyperLinkEight();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pas.clickHyperLinkEight();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkEight: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyHyperLinkNine() throws Exception{
		switchingTab(firstTab);
		pas.clickHyperLinkNine();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pas.clickHyperLinkNine();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkNine: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyHyperLinkTen() throws Exception{
		switchingTab(firstTab);
		pas.clickHyperLinkTen();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pas.clickHyperLinkTen();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkTen: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyHyperLinkEleven() throws Exception{
		switchingTab(firstTab);
		pas.clickHyperLinkEleven();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pas.clickHyperLinkEleven();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkEleven: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyHyperLinkTweleve() throws Exception{
		switchingTab(firstTab);
		pas.clickHyperLinkTweleve();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pas.clickHyperLinkTweleve();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkTweleve: "+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyHyperLinkThirteen() throws Exception{
		switchingTab(firstTab);
		pas.clickHyperLinkThirteen();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pas.clickHyperLinkThirteen();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkThirteen: "+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyBtnBuyNow() throws Exception{
		switchingTab(firstTab);
		pas.clickBtnBuyNow();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pas.clickBtnBuyNow();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for BtnBuyNow: "+compareTwoText);
	}
	
	

}
