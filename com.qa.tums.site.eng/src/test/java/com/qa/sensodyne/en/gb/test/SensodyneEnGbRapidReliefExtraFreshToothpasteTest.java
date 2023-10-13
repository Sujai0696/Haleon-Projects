package com.qa.sensodyne.en.gb.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.en.gb.pages.SensodyneEnGbRapidReliefExtraFreshToothpastePage;

public class SensodyneEnGbRapidReliefExtraFreshToothpasteTest extends BaseClass{
	
	SensodyneEnGbRapidReliefExtraFreshToothpastePage reft;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyne_en_gbConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		reft = new	SensodyneEnGbRapidReliefExtraFreshToothpastePage();
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyne_en_gbConfig.properties").getProperty("rapidReliefExtraFreshToothpastePreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyne_en_gbConfig.properties").getProperty("rapidReliefExtraFreshToothpasteLiveUrl"));
	}
	
	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		reft.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		reft.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		reft.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		reft.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		reft.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		reft.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		reft.clickBreadcrumbThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		reft.clickBreadcrumbThree();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Three: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		reft.clickBuyNow();
		System.out.println("Buy Now Verified in the Preprod URL");
		switchingTab(secondTab);
		reft.clickBuyNow();
		System.out.println("Buy Now Verified in the Live URL");
	}
	
	
	@Test(priority = 5)
	private void verifyAvailableProductImgOne() throws Exception{
		switchingTab(firstTab);
		reft.clickAvailableProductImgOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		reft.clickAvailableProductImgOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for AvailableProductImg One: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyAvailableProductLinkOne() throws Exception{
		switchingTab(firstTab);
		reft.clickAvailableProductLinkOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		reft.clickAvailableProductLinkOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for AvailableProductLink One: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyAvailableProductImgTwo() throws Exception{
		switchingTab(firstTab);
		reft.clickAvailableProductImgTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		reft.clickAvailableProductImgTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for AvailableProductImg Two: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyAvailableProductLinkTwo() throws Exception{
		switchingTab(firstTab);
		reft.clickAvailableProductLinkTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		reft.clickAvailableProductLinkTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for AvailableProductLink Two: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyTabSection() throws Exception{
		switchingTab(firstTab);
		reft.clickTabSection();
		System.out.println("Tab section is verified in the PreProd Url");
		switchingTab(secondTab);
		reft.clickTabSection();
		System.out.println("Tab section is verified in the Live Url");
	}
	
	@Test(priority = 10)
	private void verifyMostPopularProductOne() throws Exception{
		switchingTab(firstTab);
		reft.clickMostPopularProductOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		reft.clickMostPopularProductOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Product One: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyMostPopularProductTwo() throws Exception{
		switchingTab(firstTab);
		reft.clickMostPopularProductTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		reft.clickMostPopularProductTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Product Two: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyMostPopularProductThree() throws Exception{
		switchingTab(firstTab);
		reft.clickMostPopularProductThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		reft.clickMostPopularProductThree();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Product Three: "+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyMostPopularProductFour() throws Exception{
		switchingTab(firstTab);
		reft.clickMostPopularProductFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		reft.clickMostPopularProductFour();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Product Four: "+compareTwoText);
	}
	
	
	@Test(priority = 14)
	private void verifyFindYourStore() throws Exception{
		switchingTab(firstTab);
		reft.clickFindYourStore();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		reft.clickFindYourStore();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Find Your Store:"+compareTwoText);
	}

}
