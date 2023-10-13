package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneRepairProtectExtraFreshToothpastePage;

public class SensodyneRepairProtectExtraFreshToothpasteTest extends BaseClass{
	
	SensodyneRepairProtectExtraFreshToothpastePage eft;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("extraFreshToothpastePreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("extraFreshToothpasteLiveUrl"));
	}

	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		eft = new SensodyneRepairProtectExtraFreshToothpastePage();
		switchingTab(firstTab);
		eft.clickCookieBtn();
		eft.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		eft.clickCookieBtn();
		eft.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}
	
//	@Test(priority = 1)
//	private void verifyWriteAReview() throws Exception{
//		switchingTab(firstTab);
//		eft.clickWriteAReview();
//		System.out.println("Write a review button verified successfully in the preprod Url");
//		switchingTab(secondTab);
//		eft.clickWriteAReview();
//		System.out.println("Write a review button verified successfully in the live Url");
//	}
	
	@Test(priority = 2)
	private void verifyBuyNowOne() throws Exception{
		switchingTab(firstTab);
		eft.clickBuyNow();
		System.out.println("Write a buy now button verified successfully in the preprod Url");
		switchingTab(secondTab);
		eft.clickBuyNow();
		System.out.println("Write a buy now button verified successfully in the live Url");
	}
	
	@Test(priority = 3)
	private void verifyGetCoupon() throws Exception{
		switchingTab(firstTab);
		eft.clickGetCoupon();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		eft.clickGetCoupon();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Get Coupon:"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyWhitening() throws Exception{
		switchingTab(firstTab);
		eft.clickWhitening();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		eft.clickWhitening();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Whitening:"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyOriginal() throws Exception{
		switchingTab(firstTab);
		eft.clickOriginal();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		eft.clickOriginal();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Original:"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyIngredients() throws Exception{
		switchingTab(firstTab);
		eft.checkIngredientsActive();
		System.out.println("Ingredients is active in the pre prod Url");
		switchingTab(secondTab);
		eft.checkIngredientsActive();
		System.out.println("Ingredients is active in the live Url");
	}
	
	@Test(priority = 7)
	private void verifyDirections() throws Exception{
		switchingTab(firstTab);
		eft.clickDirections();
		System.out.println("Directions is active in the pre prod Url");
		switchingTab(secondTab);
		eft.clickDirections();
		System.out.println("Directions is active in the live Url");
	}
	
	@Test(priority = 8)
	private void verifyWarnings() throws Exception{
		switchingTab(firstTab);
		eft.clickWarnings();
		System.out.println("Warnings is active in the pre prod Url");
		switchingTab(secondTab);
		eft.clickWarnings();
		System.out.println("Warnings is active in the live Url");
	}
	
	@Test(priority = 9)
	private void verifyMostPopularProductsOne() throws Exception{
		switchingTab(firstTab);
		eft.clickMostPopularProductsOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		eft.clickMostPopularProductsOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyMostPopularProductsTwo() throws Exception{
		switchingTab(firstTab);
		eft.clickMostPopularProductsTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		eft.clickMostPopularProductsTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products Two:"+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyMostPopularProductsThree() throws Exception{
		switchingTab(firstTab);
		eft.clickMostPopularProductsThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		eft.clickMostPopularProductsThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products Three:"+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyMostPopularProductsFour() throws Exception{
		switchingTab(firstTab);
		eft.clickMostPopularProductsFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		eft.clickMostPopularProductsFour();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products Four:"+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyMostPopularProductsFive() throws Exception{
		switchingTab(firstTab);
		eft.clickMostPopularProductsFive();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		eft.clickMostPopularProductsFive();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products Five:"+compareTwoText);
	}

	@Test(priority = 14)
	private void verifyGetYourCoupon() throws Exception{
		switchingTab(firstTab);
		eft.clickGetYourCoupon();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		eft.clickGetYourCoupon();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for get your coupon :"+compareTwoText);
	}
	
	@Test(priority = 15)
	private void verifyFindYourStore() throws Exception{
		switchingTab(firstTab);
		eft.clickFindYourStore();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		eft.clickFindYourStore();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for find your store :"+compareTwoText);
	}

}
