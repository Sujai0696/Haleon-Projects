package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.abreva.pages.AbrevaPlanForImportantDaysPage;
import com.qa.baseClass.BaseClass;

public class AbrevaPlanForImportantDaysTest extends BaseClass{
	
	AbrevaPlanForImportantDaysPage pid;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("Abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		pid = new AbrevaPlanForImportantDaysPage();
		switchingTab(firstTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("planForImportantDaysPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("planForImportantDaysLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		pid.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		pid.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	

	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		pid.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		pid.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	
	
	@Test(priority = 2)
	private void verifyCarouselActionNext() throws Exception {
		switchingTab(firstTab);
		pid.clickCarouselNext();
		System.out.println("All Carousel has verfied in the preprod URL");
		switchingTab(secondTab);
		pid.clickCarouselNext();
		System.out.println("All Carousel has verfied in the Live URL");
	}
	
	@Test(priority = 3)
	private void verifyCarouselActionPrevious() throws Exception {
		switchingTab(firstTab);
		pid.clickCarouselPrevious();
		System.out.println("All Carousel has verfied in the preprod URL");
		switchingTab(secondTab);
		pid.clickCarouselPrevious();
		System.out.println("All Carousel has verfied in the Live URL");
	}
	
	@Test(priority = 5)
	private void verifyWholeCardSecOne() throws Exception{
		switchingTab(firstTab);
		pid.clickWholeCardSecOne();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		pid.clickWholeCardSecOne();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink whole Card Sec One: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyWholeCardSecTwo() throws Exception{
		switchingTab(firstTab);
		pid.clickWholeCardSecTwo();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		pid.clickWholeCardSecTwo();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Whole Card Sec Two: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyWholeCardSecThree() throws Exception{
		switchingTab(firstTab);
		pid.clickWholeCardSecThree();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		pid.clickWholeCardSecThree();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Whole Card Sec Three: "+compareTwoText);
	}
	
	
	@Test(priority = 7)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		pid.clickBuyNow();
		System.out.println("Buy Now Button verified in the preprod URL");
		switchingTab(secondTab);
		pid.clickBuyNow();
		System.out.println("Buy Now Button verified in the Live URL");
	}
	
	@Test(priority = 8)
	private void verifyHyperLinkCarouselRestUpOne() throws Exception{
		switchingTab(firstTab);
		pid.clickHyperLinkCarouselRestUpOne();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		pid.clickHyperLinkCarouselRestUpOne();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Carousel RestUp One: "+compareTwoText);
	}

}
