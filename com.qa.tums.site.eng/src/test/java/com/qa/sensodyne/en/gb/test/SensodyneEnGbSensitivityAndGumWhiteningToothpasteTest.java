package com.qa.sensodyne.en.gb.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.en.gb.pages.SensodyneEnGbSensitivityAndGumWhiteningToothpastePage;

public class SensodyneEnGbSensitivityAndGumWhiteningToothpasteTest extends BaseClass{
	
	SensodyneEnGbSensitivityAndGumWhiteningToothpastePage sgwt;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyne_en_gbConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		sgwt = new	SensodyneEnGbSensitivityAndGumWhiteningToothpastePage();
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyne_en_gbConfig.properties").getProperty("sensitivityAndGumWhiteningToothpastePreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyne_en_gbConfig.properties").getProperty("sensitivityAndGumWhiteningToothpasteLiveUrl"));
	}
	
	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		sgwt.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		sgwt.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
//	@Test(priority = 1)
//	private void verifyBreadcrumbOne() throws Exception{
//		switchingTab(firstTab);
//		sgwt.clickBreadcrumbOne();
//		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
//		switchingTab(secondTab);
//		sgwt.clickBreadcrumbOne();
//		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
//	}
//	
//	@Test(priority = 2)
//	private void verifyBreadcrumbTwo() throws Exception{
//		switchingTab(firstTab);
//		sgwt.clickBreadcrumbTwo();
//		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
//		switchingTab(secondTab);
//		sgwt.clickBreadcrumbTwo();
//		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
//	}
//	
//	@Test(priority = 3)
//	private void verifyBreadcrumbThree() throws Exception{
//		switchingTab(firstTab);
//		sgwt.clickBreadcrumbThree();
//		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
//		switchingTab(secondTab);
//		sgwt.clickBreadcrumbThree();
//		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Three: "+compareTwoText);
//	}
	
	@Test(priority = 4)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		sgwt.clickBuyNow();
		System.out.println("Buy Now Verified in the Preprod URL");
		switchingTab(secondTab);
		sgwt.clickBuyNow();
		System.out.println("Buy Now Verified in the Live URL");
	}
	
	
	@Test(priority = 5)
	private void verifyAvailableProductImg() throws Exception{
		switchingTab(firstTab);
		sgwt.clickAvailableProductImg();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		sgwt.clickAvailableProductImg();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for AvailableProductImg: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyAvailableProductLink() throws Exception{
		switchingTab(firstTab);
		sgwt.clickAvailableProductLink();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		sgwt.clickAvailableProductLink();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for AvailableProductLink: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyTabSection() throws Exception{
		switchingTab(firstTab);
		sgwt.clickTabSection();
		System.out.println("Tab section is verified in the PreProd Url");
		switchingTab(secondTab);
		sgwt.clickTabSection();
		System.out.println("Tab section is verified in the Live Url");
	}
	
	@Test(priority = 8)
	private void verifyMostPopularProductOne() throws Exception{
		switchingTab(firstTab);
		sgwt.clickMostPopularProductOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		sgwt.clickMostPopularProductOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Product One: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyMostPopularProductTwo() throws Exception{
		switchingTab(firstTab);
		sgwt.clickMostPopularProductTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		sgwt.clickMostPopularProductTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Product Two: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyMostPopularProductThree() throws Exception{
		switchingTab(firstTab);
		sgwt.clickMostPopularProductThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		sgwt.clickMostPopularProductThree();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Product Three: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyMostPopularProductFour() throws Exception{
		switchingTab(firstTab);
		sgwt.clickMostPopularProductFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		sgwt.clickMostPopularProductFour();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Product Four: "+compareTwoText);
	}
	
	
	@Test(priority = 12)
	private void verifyFindYourStore() throws Exception{
		switchingTab(firstTab);
		sgwt.clickFindYourStore();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		sgwt.clickFindYourStore();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Find Your Store:"+compareTwoText);
	}


}
