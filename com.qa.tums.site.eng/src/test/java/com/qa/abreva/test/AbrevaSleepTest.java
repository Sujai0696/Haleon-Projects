package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.abreva.pages.AbrevaSleepPage;
import com.qa.baseClass.BaseClass;

public class AbrevaSleepTest extends BaseClass{
	
	AbrevaSleepPage sp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("Abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		sp = new AbrevaSleepPage();
		switchingTab(firstTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("sleepPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("sleepLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		sp.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		sp.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	

	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		sp.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		sp.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	
	
	@Test(priority = 2)
	private void verifyCarouselActionNext() throws Exception {
		switchingTab(firstTab);
		sp.clickCarouselNext();
		System.out.println("All Carousel has verfied in the preprod URL");
		switchingTab(secondTab);
		sp.clickCarouselNext();
		System.out.println("All Carousel has verfied in the Live URL");
	}
	
	@Test(priority = 3)
	private void verifyCarouselActionPrevious() throws Exception {
		switchingTab(firstTab);
		sp.clickCarouselPrevious();
		System.out.println("All Carousel has verfied in the preprod URL");
		switchingTab(secondTab);
		sp.clickCarouselPrevious();
		System.out.println("All Carousel has verfied in the Live URL");
	}
	
	@Test(priority = 5)
	private void verifyWholeCardSecOne() throws Exception{
		switchingTab(firstTab);
		sp.clickWholeCardSecOne();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		sp.clickWholeCardSecOne();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink whole Card Sec One: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyWholeCardSecTwo() throws Exception{
		switchingTab(firstTab);
		sp.clickWholeCardSecTwo();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		sp.clickWholeCardSecTwo();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Whole Card Sec Two: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyWholeCardSecThree() throws Exception{
		switchingTab(firstTab);
		sp.clickWholeCardSecThree();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		sp.clickWholeCardSecThree();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Whole Card Sec Three: "+compareTwoText);
	}
	
	
	@Test(priority = 7)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		sp.clickBuyNow();
		System.out.println("Buy Now Button verified in the preprod URL");
		switchingTab(secondTab);
		sp.clickBuyNow();
		System.out.println("Buy Now Button verified in the Live URL");
	}
	
	@Test(priority = 8)
	private void verifyHyperLinkCarouselMovingDuringOne() throws Exception{
		switchingTab(firstTab);
		sp.clickHyperLinkCarouselMovingDuringOne();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		sp.clickHyperLinkCarouselMovingDuringOne();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Carousel RestUp One: "+compareTwoText);
	}

}
