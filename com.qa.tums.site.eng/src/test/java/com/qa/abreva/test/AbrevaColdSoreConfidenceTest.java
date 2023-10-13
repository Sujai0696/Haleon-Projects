package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.abreva.pages.AbrevaColdSoreConfidencePage;
import com.qa.baseClass.BaseClass;

public class AbrevaColdSoreConfidenceTest extends BaseClass{

	
	AbrevaColdSoreConfidencePage csc;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("Abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		csc = new AbrevaColdSoreConfidencePage();
		switchingTab(firstTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("coldSoreConfidencePreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("coldSoreConfidenceLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		csc.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		csc.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	

	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		csc.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		csc.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyHyperLinkHere() throws Exception{
		switchingTab(firstTab);
		csc.clickHyperLinkHere();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		csc.clickHyperLinkHere();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Here: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyHyperLinkReadMore() throws Exception{
		switchingTab(firstTab);
		csc.clickHyperLinkReadMore();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		csc.clickHyperLinkReadMore();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Read More: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyWholeCardSecOne() throws Exception{
		switchingTab(firstTab);
		csc.clickWholeCardSecOne();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		csc.clickWholeCardSecOne();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink whole Card Sec One: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyWholeCardSecTwo() throws Exception{
		switchingTab(firstTab);
		csc.clickWholeCardSecTwo();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		csc.clickWholeCardSecTwo();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Whole Card Sec Two: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyWholeCardSecThree() throws Exception{
		switchingTab(firstTab);
		csc.clickWholeCardSecThree();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		csc.clickWholeCardSecThree();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Whole Card Sec Three: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyGetcoupon() throws Exception{
		switchingTab(firstTab);
		csc.clickGetcoupon();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		csc.clickGetcoupon();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Get coupon: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		csc.clickBuyNow();
		System.out.println("Buy Now Button verified in the preprod URL");
		switchingTab(secondTab);
		csc.clickBuyNow();
		System.out.println("Buy Now Button verified in the Live URL");
	}
}
