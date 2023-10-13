package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.abreva.pages.AbrevaToothpasteOnColdSoresPage;
import com.qa.baseClass.BaseClass;

public class AbrevaToothpasteOnColdSoresTest extends BaseClass{
	
	AbrevaToothpasteOnColdSoresPage tcs;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("Abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		tcs = new AbrevaToothpasteOnColdSoresPage();
		switchingTab(firstTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("toothpasteOnColdSoresPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("toothpasteOnColdSoresLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		tcs.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		tcs.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	

	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		tcs.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		tcs.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyHyperLinkTinglingOrBurningSensations() throws Exception{
		switchingTab(firstTab);
		tcs.clickHyperLinkTinglingOrBurningSensations();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		tcs.clickHyperLinkTinglingOrBurningSensations();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Tingling Or Burning Sensations: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyHyperLinkAbrevaCream() throws Exception{
		switchingTab(firstTab);
		tcs.clickHyperLinkAbrevaCream();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		tcs.clickHyperLinkAbrevaCream();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Abreva Cream: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyHyperLinkAbrevaSite() throws Exception{
		switchingTab(firstTab);
		tcs.clickHyperLinkAbrevaSite();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		tcs.clickHyperLinkAbrevaSite();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Abreva Site: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyGetcoupon() throws Exception{
		switchingTab(firstTab);
		tcs.clickGetcoupon();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		tcs.clickGetcoupon();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Get coupon: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		tcs.clickBuyNow();
		System.out.println("Buy Now Button verified in the preprod URL");
		switchingTab(secondTab);
		tcs.clickBuyNow();
		System.out.println("Buy Now Button verified in the Live URL");
	}
	

}
