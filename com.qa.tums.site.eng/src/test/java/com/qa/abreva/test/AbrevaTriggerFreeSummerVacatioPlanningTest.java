package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.abreva.pages.AbrevaTriggerFreeSummerVacatioPlanningPage;
import com.qa.baseClass.BaseClass;

public class AbrevaTriggerFreeSummerVacatioPlanningTest extends BaseClass{
	
	AbrevaTriggerFreeSummerVacatioPlanningPage trsvp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("Abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		trsvp = new AbrevaTriggerFreeSummerVacatioPlanningPage();
		switchingTab(firstTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("triggerFreeSummerVacatioPlanningPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("triggerFreeSummerVacatioPlanningLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		trsvp.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		trsvp.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	

	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		trsvp.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		trsvp.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyHyperLinkSunExposure() throws Exception{
		switchingTab(firstTab);
		trsvp.clickHyperLinkSunExposure();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		trsvp.clickHyperLinkSunExposure();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Sun Exposure: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyHyperLinkStressWearsDown() throws Exception{
		switchingTab(firstTab);
		trsvp.clickHyperLinkStressWearsDown();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		trsvp.clickHyperLinkStressWearsDown();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Stress Wears Down: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyHyperLinkActOnIt() throws Exception{
		switchingTab(firstTab);
		trsvp.clickHyperLinkActOnIt();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		trsvp.clickHyperLinkActOnIt();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Act On It: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyWholeCardSecOne() throws Exception{
		switchingTab(firstTab);
		trsvp.clickWholeCardSecOne();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		trsvp.clickWholeCardSecOne();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink whole Card Sec One: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyWholeCardSecTwo() throws Exception{
		switchingTab(firstTab);
		trsvp.clickWholeCardSecTwo();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		trsvp.clickWholeCardSecTwo();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Whole Card Sec Two: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyWholeCardSecThree() throws Exception{
		switchingTab(firstTab);
		trsvp.clickWholeCardSecThree();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		trsvp.clickWholeCardSecThree();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Whole Card Sec Three: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyGetcoupon() throws Exception{
		switchingTab(firstTab);
		trsvp.clickGetcoupon();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		trsvp.clickGetcoupon();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Get coupon: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		trsvp.clickBuyNow();
		System.out.println("Buy Now Button verified in the preprod URL");
		switchingTab(secondTab);
		trsvp.clickBuyNow();
		System.out.println("Buy Now Button verified in the Live URL");
	}

}
