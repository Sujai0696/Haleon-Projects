package com.qa.caltrate.ca.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.ca.pages.CaltrateGummiesPage;

public class CaltrateGummiesTest extends BaseClass{
	
	CaltrateGummiesPage gp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("caltrate_caConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("caltrate_caConfig.properties").getProperty("caltrateGummiesPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("caltrate_caConfig.properties").getProperty("caltrateGummiesLiveUrl"));
	}
	
	@Test(priority = 0)
	private void verifyBreadcrumbOne() throws Exception{
		gp = new CaltrateGummiesPage();
		switchingTab(firstTab);
		gp.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Caltrate_ca", 1, 0));
		switchingTab(secondTab);
		gp.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Caltrate_ca", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One :"+compareTwoText);
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		gp.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Caltrate_ca", 1, 0));
		switchingTab(secondTab);
		gp.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Caltrate_ca", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two :"+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		gp.textBreadcrumbThree();
		System.out.println("Breadcrumb Three successfully verified in the preprod URL");
		switchingTab(secondTab);
		gp.textBreadcrumbThree();
		System.out.println("Breadcrumb Three successfully verified in the live URL");
	}
	
	@Test(priority = 3)
	private void verifyBuyNowButton() throws Exception{
		switchingTab(firstTab);
		gp.clickBuyNow();
		System.out.println("BuyNow is successfully verified in the preprod URL");
		switchingTab(secondTab);
		gp.clickBuyNow();
		System.out.println("BuyNow is successfully verified in the live URL");
	}
	
	@Test(priority = 4)
	private void verifyGetCoupons() throws Exception{
		switchingTab(firstTab);
		gp.clickGetCoupons();
		String preProdUrl = compareUrl(excelRead("Caltrate_ca", 1, 0));
		switchingTab(secondTab);
		gp.clickGetCoupons();
		String liveUrl = compareUrl(excelRead("Caltrate_ca", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Get Coupons :"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifySeeAllProducts() throws Exception{
		switchingTab(firstTab);
		gp.clickSeeAllProducts();
		String preProdUrl = compareUrl(excelRead("Caltrate_ca", 1, 0));
		switchingTab(secondTab);
		gp.clickSeeAllProducts();
		String liveUrl = compareUrl(excelRead("Caltrate_ca", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for See All Products :"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifySaveNowImg() throws Exception{
		switchingTab(firstTab);
		String preProdUrl = gp.clickSaveNowImg();
		System.out.println(preProdUrl);
		switchingTab(secondTab);
		String liveUrl = gp.clickSaveNowImg();
		System.out.println(liveUrl);
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for See All Products :"+compareTwoText);
	}

}
