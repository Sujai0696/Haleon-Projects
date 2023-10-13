package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneSensodyneRepairProtectWhietningToothpastePage;

public class SensodyneSensodyneRepairProtectWhietningToothpasteTest extends BaseClass{

	
	SensodyneSensodyneRepairProtectWhietningToothpastePage wt;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("sensodyneRepairProtectWhiteningToothpastePreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("sensodyneRepairProtectWhiteningToothpasteLiveUrl"));
	}

	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		wt = new SensodyneSensodyneRepairProtectWhietningToothpastePage();
		switchingTab(firstTab);
		wt.clickCookieBtn();
		wt.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		wt.clickCookieBtn();
		wt.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}
	
	
	@Test(priority = 1)
	private void verifyWriteAReview() throws Exception{
		switchingTab(firstTab);
		wt.clickWriteAReview();
		System.out.println("Write a review button verified successfully in the preprod Url");
		switchingTab(secondTab);
		wt.clickWriteAReview();
		System.out.println("Write a review button verified successfully in the live Url");
	}
	
	@Test(priority = 2)
	private void verifyBuyNowOne() throws Exception{
		switchingTab(firstTab);
		wt.clickBuyNow();
		System.out.println("Write a buy now button verified successfully in the preprod Url");
		switchingTab(secondTab);
		wt.clickBuyNow();
		System.out.println("Write a buy now button verified successfully in the live Url");
	}
	
	@Test(priority = 3)
	private void verifyGetCoupon() throws Exception{
		switchingTab(firstTab);
		wt.clickGetCoupon();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		wt.clickGetCoupon();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Get Coupon:"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyOriginal() throws Exception{
		switchingTab(firstTab);
		wt.clickOriginal();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		wt.clickOriginal();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for original:"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyExtraFresh() throws Exception{
		switchingTab(firstTab);
		wt.clickExtraFresh();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		wt.clickExtraFresh();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for extra fresh=:"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyIngredients() throws Exception{
		switchingTab(firstTab);
		wt.checkIngredientsActive();
		System.out.println("Ingredients is active in the pre prod Url");
		switchingTab(secondTab);
		wt.checkIngredientsActive();
		System.out.println("Ingredients is active in the live Url");
	}
	
	@Test(priority = 7)
	private void verifyDirections() throws Exception{
		switchingTab(firstTab);
		wt.clickDirections();
		System.out.println("Directions is active in the pre prod Url");
		switchingTab(secondTab);
		wt.clickDirections();
		System.out.println("Directions is active in the live Url");
	}
	
	@Test(priority = 8)
	private void verifyWarnings() throws Exception{
		switchingTab(firstTab);
		wt.clickWarnings();
		System.out.println("Warnings is active in the pre prod Url");
		switchingTab(secondTab);
		wt.clickWarnings();
		System.out.println("Warnings is active in the live Url");
	}
	
	@Test(priority = 9)
	private void verifyMostPopularProductsOne() throws Exception{
		switchingTab(firstTab);
		wt.clickMostPopularProductsOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		wt.clickMostPopularProductsOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyMostPopularProductsTwo() throws Exception{
		switchingTab(firstTab);
		wt.clickMostPopularProductsTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		wt.clickMostPopularProductsTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products Two:"+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyMostPopularProductsThree() throws Exception{
		switchingTab(firstTab);
		wt.clickMostPopularProductsThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		wt.clickMostPopularProductsThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products Three:"+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyMostPopularProductsFour() throws Exception{
		switchingTab(firstTab);
		wt.clickMostPopularProductsFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		wt.clickMostPopularProductsFour();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products Four:"+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyMostPopularProductsFive() throws Exception{
		switchingTab(firstTab);
		wt.clickMostPopularProductsFive();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		wt.clickMostPopularProductsFive();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products Five:"+compareTwoText);
	}

	@Test(priority = 14)
	private void verifyGetYourCoupon() throws Exception{
		switchingTab(firstTab);
		wt.clickGetYourCoupon();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		wt.clickGetYourCoupon();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for get your coupon :"+compareTwoText);
	}
	
	@Test(priority = 15)
	private void verifyFindYourStore() throws Exception{
		switchingTab(firstTab);
		wt.clickFindYourStore();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		wt.clickFindYourStore();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for find your store :"+compareTwoText);
	}

}
