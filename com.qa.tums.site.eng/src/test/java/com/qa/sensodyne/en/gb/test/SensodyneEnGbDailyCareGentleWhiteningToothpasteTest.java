package com.qa.sensodyne.en.gb.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.en.gb.pages.SensodyneEnGbDailyCareGentleWhiteningToothpastePage;

public class SensodyneEnGbDailyCareGentleWhiteningToothpasteTest extends BaseClass{
	
	SensodyneEnGbDailyCareGentleWhiteningToothpastePage dcgwt;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyne_en_gbConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		dcgwt = new	SensodyneEnGbDailyCareGentleWhiteningToothpastePage();
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyne_en_gbConfig.properties").getProperty("dailyCareGentleWhiteningToothpastePreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyne_en_gbConfig.properties").getProperty("dailyCareGentleWhiteningToothpasteLiveUrl"));
	}
	
	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		dcgwt.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		dcgwt.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
//	@Test(priority = 1)
//	private void verifyBreadcrumbOne() throws Exception{
//		switchingTab(firstTab);
//		dcgwt.clickBreadcrumbOne();
//		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
//		switchingTab(secondTab);
//		dcgwt.clickBreadcrumbOne();
//		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
//	}
//	
//	@Test(priority = 2)
//	private void verifyBreadcrumbTwo() throws Exception{
//		switchingTab(firstTab);
//		dcgwt.clickBreadcrumbTwo();
//		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
//		switchingTab(secondTab);
//		dcgwt.clickBreadcrumbTwo();
//		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
//	}
//	
//	@Test(priority = 3)
//	private void verifyBreadcrumbThree() throws Exception{
//		switchingTab(firstTab);
//		dcgwt.clickBreadcrumbThree();
//		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
//		switchingTab(secondTab);
//		dcgwt.clickBreadcrumbThree();
//		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Three: "+compareTwoText);
//	}
//	
//	@Test(priority = 4)
//	private void verifyBuyNow() throws Exception{
//		switchingTab(firstTab);
//		dcgwt.clickBuyNow();
//		System.out.println("Buy Now Verified in the Preprod URL");
//		switchingTab(secondTab);
//		dcgwt.clickBuyNow();
//		System.out.println("Buy Now Verified in the Live URL");
//	}
	
	@Test(priority = 5)
	private void verifyYoutubeVideo() throws Exception{
		switchingTab(firstTab);
		dcgwt.clickYoutubeVideo();
		System.out.println("YouTube Video verified in the preprod URL");
		switchingTab(secondTab);
		dcgwt.clickYoutubeVideo();
		System.out.println("YouTube Video verified in the Live URL");
	}
	
	
	
//	@Test(priority = 11)
//	private void verifyTabSection() throws Exception{
//		switchingTab(firstTab);
//		dcgwt.clickTabSection();
//		System.out.println("Tab section is verified in the PreProd Url");
//		switchingTab(secondTab);
//		dcgwt.clickTabSection();
//		System.out.println("Tab section is verified in the Live Url");
//	}
//	
//	@Test(priority = 12)
//	private void verifyMostPopularProductOne() throws Exception{
//		switchingTab(firstTab);
//		dcgwt.clickMostPopularProductOne();
//		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
//		switchingTab(secondTab);
//		dcgwt.clickMostPopularProductOne();
//		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Product One: "+compareTwoText);
//	}
//	
//	@Test(priority = 13)
//	private void verifyMostPopularProductTwo() throws Exception{
//		switchingTab(firstTab);
//		dcgwt.clickMostPopularProductTwo();
//		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
//		switchingTab(secondTab);
//		dcgwt.clickMostPopularProductTwo();
//		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Product Two: "+compareTwoText);
//	}
//	
//	@Test(priority = 14)
//	private void verifyMostPopularProductThree() throws Exception{
//		switchingTab(firstTab);
//		dcgwt.clickMostPopularProductThree();
//		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
//		switchingTab(secondTab);
//		dcgwt.clickMostPopularProductThree();
//		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Product Three: "+compareTwoText);
//	}
//	
//	@Test(priority = 15)
//	private void verifyMostPopularProductFour() throws Exception{
//		switchingTab(firstTab);
//		dcgwt.clickMostPopularProductFour();
//		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
//		switchingTab(secondTab);
//		dcgwt.clickMostPopularProductFour();
//		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Product Four: "+compareTwoText);
//	}
//	
//	
//	@Test(priority = 16)
//	private void verifyFindYourStore() throws Exception{
//		switchingTab(firstTab);
//		dcgwt.clickFindYourStore();
//		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
//		switchingTab(secondTab);
//		dcgwt.clickFindYourStore();
//		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Find Your Store:"+compareTwoText);
//	}

}
