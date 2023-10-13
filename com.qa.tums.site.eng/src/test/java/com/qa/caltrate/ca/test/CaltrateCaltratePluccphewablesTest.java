package com.qa.caltrate.ca.test;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.ca.pages.CaltrateCaltratePlusChewables;

public class CaltrateCaltratePluccphewablesTest extends BaseClass{
	CaltrateCaltratePlusChewables ccp;
	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadConfig("Caltrate_caConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		ccp = new CaltrateCaltratePlusChewables();
		switchingTab(firstTab);
		launchURL(loadConfig("Caltrate_caConfig.properties").getProperty("CaltratePlusChewablePreprodURL"));
		switchingTab(secondTab);
		launchURL(loadConfig("Caltrate_caConfig.properties").getProperty("CaltratePlusChewableLiveURL"));

	}
	@Test(priority = 0)
	private void verifyBreadcrumbOne() throws Exception{
		ccp = new CaltrateCaltratePlusChewables();
		switchingTab(firstTab);
		ccp.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("CaltrateCA", 1, 0));
		switchingTab(secondTab);
		ccp.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("CaltrateCA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One :"+compareTwoText);
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		ccp.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("CaltrateCA", 1, 0));
		switchingTab(secondTab);
		ccp.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("CaltrateCA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two :"+compareTwoText);
	}
	
//	@Test(priority = 2)
//	private void verifyBreadcrumbThree() throws Exception{
//		switchingTab(firstTab);
//		ccp.textBreadcrumbThree();
//		System.out.println("Breadcrumb Three successfully verified in the preprod URL");
//		switchingTab(secondTab);
//		ccp.textBreadcrumbThree();
//		System.out.println("Breadcrumb Three successfully verified in the live URL");
//	}
//	
	@Test(priority = 3)
	private void verifyBuyNowButton() throws Exception{
		switchingTab(firstTab);
		ccp.clickBuyNow();
		System.out.println("BuyNow is successfully verified in the preprod URL");
		switchingTab(secondTab);
		ccp.clickBuyNow();
		System.out.println("BuyNow is successfully verified in the live URL");
	}
	
	@Test(priority = 4)
	private void verifyGetCoupons() throws Exception{
		switchingTab(firstTab);
		ccp.clickGetCoupons();
		String preProdUrl = compareUrl(excelRead("CaltrateCA", 1, 0));
		switchingTab(secondTab);
		ccp.clickGetCoupons();
		String liveUrl = compareUrl(excelRead("CaltrateCA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Get Coupons :"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifySeeAllProducts() throws Exception{
		switchingTab(firstTab);
		ccp.clickSeeAllProducts();
		String preProdUrl = compareUrl(excelRead("CaltrateCA", 1, 0));
		switchingTab(secondTab);
		ccp.clickSeeAllProducts();
		String liveUrl = compareUrl(excelRead("CaltrateCA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for See All Products :"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifySaveNowImg() throws Exception{
		switchingTab(firstTab);
		String preProdUrl = ccp.clickSaveNowImg();
		System.out.println(preProdUrl);
		switchingTab(secondTab);
		String liveUrl = ccp.clickSaveNowImg();
		System.out.println(liveUrl);
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for See All Products :"+compareTwoText);
	}
	

}
