package com.qa.biotene.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.biotene.pages.BioteneShopNowPage;

public class BioteneShopNowTest extends BaseClass{
	
	BioteneShopNowPage sn;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("biotene_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		sn = new BioteneShopNowPage();
		switchingTab(firstTab);
		launchURL(loadConfig("biotene_Config.properties").getProperty("shopNowPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("biotene_Config.properties").getProperty("shopNowLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		sn.clickCookieBtn();
		sn.clickEmailBtn();
		System.out.println("Cookie Button and Email Pop-up successfully verified in the Preprod URL");
		switchingTab(secondTab);
		sn.clickCookieBtn();
		sn.clickEmailBtn();
		System.out.println("Cookie Button and Email Pop-up successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		sn.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		sn.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		sn.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		sn.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBuyNowAndBuyLocal() throws Exception{
		switchingTab(firstTab);
		sn.clickBuyNowAndBuyLocal();
		System.out.println("Buy Now & Buy Local is successfully verified in the Preprod URL");
		switchingTab(secondTab);
		sn.clickBuyNowAndBuyLocal();
		System.out.println("Buy Now & Buy Local is successfully verified in the Live URL");
	}

}
