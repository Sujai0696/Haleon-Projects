package com.qa.caltrate.ca.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.ca.pages.CaltrateSoftChewsPage;

public class CaltrateSoftChewsTest extends BaseClass{
	
	CaltrateSoftChewsPage sc;

	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("caltrate_caConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("caltrate_caConfig.properties").getProperty("caltrateSoftChewsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("caltrate_caConfig.properties").getProperty("caltrateSoftChewsLiveUrl"));
	}
	
	@Test(priority = 0)
	private void verifyBreadcrumbOne() throws Exception{
		sc = new CaltrateSoftChewsPage();
		switchingTab(firstTab);
		sc.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Caltrate_ca", 1, 0));
		switchingTab(secondTab);
		sc.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Caltrate_ca", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One :"+compareTwoText);
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		sc.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Caltrate_ca", 1, 0));
		switchingTab(secondTab);
		sc.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Caltrate_ca", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two :"+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		sc.textBreadcrumbThree();
		System.out.println("Breadcrumb Three successfully verified in the preprod URL");
		switchingTab(secondTab);
		sc.textBreadcrumbThree();
		System.out.println("Breadcrumb Three successfully verified in the live URL");
	}
	
	@Test(priority = 3)
	private void verifyBuyNowButton() throws Exception{
		switchingTab(firstTab);
		sc.clickBuyNow();
		System.out.println("BuyNow is successfully verified in the preprod URL");
		switchingTab(secondTab);
		sc.clickBuyNow();
		System.out.println("BuyNow is successfully verified in the live URL");
	}
	
	@Test(priority = 4)
	private void verifyGetCoupons() throws Exception{
		switchingTab(firstTab);
		sc.clickGetCoupons();
		String preProdUrl = compareUrl(excelRead("Caltrate_ca", 1, 0));
		switchingTab(secondTab);
		sc.clickGetCoupons();
		String liveUrl = compareUrl(excelRead("Caltrate_ca", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Get Coupons :"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifySeeAllProducts() throws Exception{
		switchingTab(firstTab);
		sc.clickSeeAllProducts();
		String preProdUrl = compareUrl(excelRead("Caltrate_ca", 1, 0));
		switchingTab(secondTab);
		sc.clickSeeAllProducts();
		String liveUrl = compareUrl(excelRead("Caltrate_ca", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for See All Products :"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifySaveNowImg() throws Exception{
		switchingTab(firstTab);
		String preProdUrl = sc.clickSaveNowImg();
		System.out.println(preProdUrl);
		switchingTab(secondTab);
		String liveUrl = sc.clickSaveNowImg();
		System.out.println(liveUrl);
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for See All Products :"+compareTwoText);
	}
	
	
}
