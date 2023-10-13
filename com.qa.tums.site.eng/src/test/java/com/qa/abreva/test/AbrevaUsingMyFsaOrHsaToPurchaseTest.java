package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.abreva.pages.AbrevaUsingMyFsaOrHsaToPurchasePage;
import com.qa.baseClass.BaseClass;

public class AbrevaUsingMyFsaOrHsaToPurchaseTest extends BaseClass{
	
	
	AbrevaUsingMyFsaOrHsaToPurchasePage umf;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("Abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		umf = new AbrevaUsingMyFsaOrHsaToPurchasePage();
		switchingTab(firstTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("usingMyFsaOrHsaToPurchasePreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("usingMyFsaOrHsaToPurchaseLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		umf.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		umf.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyHyperLinkAbrevaProducts() throws Exception{
		switchingTab(firstTab);
		umf.clickHyperLinkAbrevaProducts();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		umf.clickHyperLinkAbrevaProducts();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Cold Sore: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyHyperLinkFaqPage() throws Exception{
		switchingTab(firstTab);
		umf.clickHyperLinkFaqPage();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		umf.clickHyperLinkFaqPage();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Cold Sore: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyGetcoupon() throws Exception{
		switchingTab(firstTab);
		umf.clickGetcoupon();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		umf.clickGetcoupon();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Get coupon: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		umf.clickBuyNow();
		System.out.println("Buy Now Button verified in the preprod URL");
		switchingTab(secondTab);
		umf.clickBuyNow();
		System.out.println("Buy Now Button verified in the Live URL");
	}
	
	
}
