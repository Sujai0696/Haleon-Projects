package com.qa.caltrate.ca.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.ca.pages.CaltrateContactUsPage;

public class CaltrateContactUsTest extends BaseClass{
	
	CaltrateContactUsPage cu;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("caltrate_caConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("caltrate_caConfig.properties").getProperty("contactUsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("caltrate_caConfig.properties").getProperty("contactUsLiveUrl"));
	}
	
	@Test(priority = 0)
	private void verifyBreadcrumbOne() throws Exception{
		cu = new CaltrateContactUsPage();
		switchingTab(firstTab);
		cu.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Caltrate_ca", 1, 0));
		switchingTab(secondTab);
		cu.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Caltrate_ca", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One :"+compareTwoText);
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		cu.textBreadcrumbTwo();
		System.out.println("Breadcrumb Two successfully verified in the preprod URL");
		switchingTab(secondTab);
		cu.textBreadcrumbTwo();
		System.out.println("Breadcrumb Two successfully verified in the live URL");
	}
	
	@Test(priority = 2)
	private void verifyGetCoupons() throws Exception{
		cu = new CaltrateContactUsPage();
		switchingTab(firstTab);
		cu.clickGetCoupons();
		String preProdUrl = compareUrl(excelRead("Caltrate_ca", 1, 0));
		switchingTab(secondTab);
		cu.clickGetCoupons();
		String liveUrl = compareUrl(excelRead("Caltrate_ca", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Get Coupons :"+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyHealthySavingsImg() throws Exception{
		switchingTab(firstTab);
		String preProdUrl = cu.clickHealthySavingsImg();
		System.out.println(preProdUrl);
		switchingTab(secondTab);
		String liveUrl = cu.clickHealthySavingsImg();
		System.out.println(liveUrl);
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for healthy savings IMG :"+compareTwoText);
	}
	

}
