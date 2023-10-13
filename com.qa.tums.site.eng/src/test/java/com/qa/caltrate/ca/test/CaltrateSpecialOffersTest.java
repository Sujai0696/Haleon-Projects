package com.qa.caltrate.ca.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.ca.pages.CaltrateSpecialOffersPage;

public class CaltrateSpecialOffersTest extends BaseClass{
	
	CaltrateSpecialOffersPage so;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("caltrate_caConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("caltrate_caConfig.properties").getProperty("specialOffersPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("caltrate_caConfig.properties").getProperty("specialOffersLiveUrl"));
	}
	
	@Test(priority = 0)
	private void verifyBreadcrumbOne() throws Exception{
		so = new CaltrateSpecialOffersPage();
		switchingTab(firstTab);
		so.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Caltrate_ca", 1, 0));
		switchingTab(secondTab);
		so.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Caltrate_ca", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One :"+compareTwoText);
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		so.textBreadcrumbTwo();
		System.out.println("Breadcrumb Two successfully verified in the preprod URL");
		switchingTab(secondTab);
		so.textBreadcrumbTwo();
		System.out.println("Breadcrumb Two successfully verified in the live URL");
	}
	
	@Test(priority = 3)
	private void verifySaveNowImg() throws Exception{
		switchingTab(firstTab);
		String preProdUrl = so.clickSaveNowImg();
		System.out.println(preProdUrl);
		switchingTab(secondTab);
		String liveUrl = so.clickSaveNowImg();
		System.out.println(liveUrl);
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for save now IMG :"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyGetHealthySavingsLink() throws Exception{
		switchingTab(firstTab);
		String preProdUrl = so.clickGetHealthySavingsLink();
		System.out.println(preProdUrl);
		switchingTab(secondTab);
		String liveUrl = so.clickGetHealthySavingsLink();
		System.out.println(liveUrl);
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for get healthy savings link :"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyHealthySavingsImg() throws Exception{
		switchingTab(firstTab);
		String preProdUrl = so.clickHealthySavingsImg();
		System.out.println(preProdUrl);
		switchingTab(secondTab);
		String liveUrl = so.clickHealthySavingsImg();
		System.out.println(liveUrl);
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for healthy savings IMG :"+compareTwoText);
	}

}
