package com.qa.voltarengel.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.voltarengel.pages.VoltarengelFirstArthritisFriendlySitePage;

public class VoltarengelFirstArthritisFriendlySiteTest extends BaseClass{
	
	VoltarengelFirstArthritisFriendlySitePage fafs;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("voltarengel_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		fafs = new VoltarengelFirstArthritisFriendlySitePage();
		switchingTab(firstTab);
		launchURL(loadConfig("voltarengel_Config.properties").getProperty("firstArthritisFriendlySitePreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("voltarengel_Config.properties").getProperty("firstArthritisFriendlySiteLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		fafs.clickCookieBtn();
		fafs.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Pop-up successfully verified in the Preprod URL");
		switchingTab(secondTab);
		fafs.clickCookieBtn();
		fafs.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Pop-up successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		fafs.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		fafs.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		fafs.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		fafs.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		fafs.clickBreadcrumbThree();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		fafs.clickBreadcrumbThree();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Three: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyHyperLinkArthritisPain() throws Exception{
		switchingTab(firstTab);
		fafs.clickHyperLinkArthritisPain();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		fafs.clickHyperLinkArthritisPain();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Hyper Link Arthritis Pain: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyHyperLinkArthritis() throws Exception{
		switchingTab(firstTab);
		fafs.clickHyperLinkArthritis();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		fafs.clickHyperLinkArthritis();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Hyper Link Arthritis : "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyHyperLinkHowVoltarenWorks() throws Exception{
		switchingTab(firstTab);
		fafs.clickHyperLinkHowVoltarenWorks();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		fafs.clickHyperLinkHowVoltarenWorks();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Hyper Link How Voltaren Works : "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyHyperLinkTheseFeatures() throws Exception{
		switchingTab(firstTab);
		fafs.clickHyperLinkTheseFeatures();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		fafs.clickHyperLinkTheseFeatures();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Hyper Link These Features : "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyRelatedArticleReadMoreOne() throws Exception{
		switchingTab(firstTab);
		fafs.clickRelatedArticleReadMoreOne();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		fafs.clickRelatedArticleReadMoreOne();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Related Article Read More One: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyRelatedArticleReadMoreTwo() throws Exception{
		switchingTab(firstTab);
		fafs.clickRelatedArticleReadMoreTwo();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		fafs.clickRelatedArticleReadMoreTwo();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Related Article Read More Two: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyGetCoupons() throws Exception{
		switchingTab(firstTab);
		fafs.clickGetCoupons();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		fafs.clickGetCoupons();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Get Coupons: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		fafs.clickBuyNow();
		System.out.println("Buy Now Button verified in the preprod URL");
		switchingTab(secondTab);
		fafs.clickBuyNow();
		System.out.println("Buy Now Button verified in the Live URL");
	}
	
	
	

}
