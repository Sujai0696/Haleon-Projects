package com.qa.sensodyne.en.gb.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.en.gb.pages.SensodyneEnGbRepairAndProtectWhiteningToothpastePage;

public class SensodyneEnGbRepairAndProtectWhiteningToothpasteTest extends BaseClass{
	
	SensodyneEnGbRepairAndProtectWhiteningToothpastePage rapwt;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyne_en_gbConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		rapwt = new	SensodyneEnGbRepairAndProtectWhiteningToothpastePage();
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyne_en_gbConfig.properties").getProperty("repairAndProtectWhiteningToothpastePreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyne_en_gbConfig.properties").getProperty("repairAndProtectWhiteningToothpasteLiveUrl"));
	}
	
	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		rapwt.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		rapwt.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		rapwt.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		rapwt.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		rapwt.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		rapwt.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		rapwt.clickBreadcrumbThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		rapwt.clickBreadcrumbThree();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Three: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		rapwt.clickBuyNow();
		System.out.println("Buy Now Verified in the Preprod URL");
		switchingTab(secondTab);
		rapwt.clickBuyNow();
		System.out.println("Buy Now Verified in the Live URL");
	}
	
	
	@Test(priority = 5)
	private void verifyAvailableProductImgOne() throws Exception{
		switchingTab(firstTab);
		rapwt.clickAvailableProductImgOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		rapwt.clickAvailableProductImgOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for AvailableProductImg One: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyAvailableProductLinkOne() throws Exception{
		switchingTab(firstTab);
		rapwt.clickAvailableProductLinkOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		rapwt.clickAvailableProductLinkOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for AvailableProductLink One: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyAvailableProductImgTwo() throws Exception{
		switchingTab(firstTab);
		rapwt.clickAvailableProductImgTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		rapwt.clickAvailableProductImgTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for AvailableProductImg Two: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyAvailableProductLinkTwo() throws Exception{
		switchingTab(firstTab);
		rapwt.clickAvailableProductLinkTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		rapwt.clickAvailableProductLinkTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for AvailableProductLink Two: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyAvailableProductImgThree() throws Exception{
		switchingTab(firstTab);
		rapwt.clickAvailableProductImgThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		rapwt.clickAvailableProductImgThree();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for AvailableProductImg Three: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyAvailableProductLinkThree() throws Exception{
		switchingTab(firstTab);
		rapwt.clickAvailableProductLinkThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		rapwt.clickAvailableProductLinkThree();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for AvailableProductLink Three: "+compareTwoText);
	}
	
	
	@Test(priority = 11)
	private void verifyTabSection() throws Exception{
		switchingTab(firstTab);
		rapwt.clickTabSection();
		System.out.println("Tab section is verified in the PreProd Url");
		switchingTab(secondTab);
		rapwt.clickTabSection();
		System.out.println("Tab section is verified in the Live Url");
	}
	
	@Test(priority = 12)
	private void verifyMostPopularProductOne() throws Exception{
		switchingTab(firstTab);
		rapwt.clickMostPopularProductOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		rapwt.clickMostPopularProductOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Product One: "+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyMostPopularProductTwo() throws Exception{
		switchingTab(firstTab);
		rapwt.clickMostPopularProductTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		rapwt.clickMostPopularProductTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Product Two: "+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyMostPopularProductThree() throws Exception{
		switchingTab(firstTab);
		rapwt.clickMostPopularProductThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		rapwt.clickMostPopularProductThree();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Product Three: "+compareTwoText);
	}
	
	@Test(priority = 15)
	private void verifyMostPopularProductFour() throws Exception{
		switchingTab(firstTab);
		rapwt.clickMostPopularProductFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		rapwt.clickMostPopularProductFour();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Product Four: "+compareTwoText);
	}
	
	
	@Test(priority = 16)
	private void verifyFindYourStore() throws Exception{
		switchingTab(firstTab);
		rapwt.clickFindYourStore();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		rapwt.clickFindYourStore();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Find Your Store:"+compareTwoText);
	}

}
