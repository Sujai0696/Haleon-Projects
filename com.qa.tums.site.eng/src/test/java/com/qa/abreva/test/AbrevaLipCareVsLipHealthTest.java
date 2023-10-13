package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.abreva.pages.AbrevaLipCareVsLipHealthPage;
import com.qa.baseClass.BaseClass;

public class AbrevaLipCareVsLipHealthTest extends BaseClass{
	
	AbrevaLipCareVsLipHealthPage lclh;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("Abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		lclh = new AbrevaLipCareVsLipHealthPage();
		switchingTab(firstTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("lipCareVsLipHealthPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("lipCareVsLipHealthLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		lclh.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		lclh.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	

	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		lclh.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		lclh.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyReadMore() throws Exception{
		switchingTab(firstTab);
		lclh.clickReadMore();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		lclh.clickReadMore();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read More: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyWholeCardSecOne() throws Exception{
		switchingTab(firstTab);
		lclh.clickWholeCardSecOne();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		lclh.clickWholeCardSecOne();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink whole Card Sec One: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyWholeCardSecTwo() throws Exception{
		switchingTab(firstTab);
		lclh.clickWholeCardSecTwo();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		lclh.clickWholeCardSecTwo();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Whole Card Sec Two: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyWholeCardSecThree() throws Exception{
		switchingTab(firstTab);
		lclh.clickWholeCardSecThree();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		lclh.clickWholeCardSecThree();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Whole Card Sec Three: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyTakeTheQuiz() throws Exception{
		switchingTab(firstTab);
		lclh.clickTakeTheQuiz();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		lclh.clickTakeTheQuiz();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Take The Quiz: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		lclh.clickBuyNow();
		System.out.println("Buy Now Button verified in the preprod URL");
		switchingTab(secondTab);
		lclh.clickBuyNow();
		System.out.println("Buy Now Button verified in the Live URL");
	}
	

}
