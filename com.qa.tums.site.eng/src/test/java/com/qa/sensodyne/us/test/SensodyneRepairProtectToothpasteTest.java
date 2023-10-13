package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneRepairProtectToothpastePage;

public class SensodyneRepairProtectToothpasteTest extends BaseClass{
	
	SensodyneRepairProtectToothpastePage rpt;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("repairProtectToothpastePreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("repairProtectToothpasteLiveUrl"));
	}

	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		rpt = new SensodyneRepairProtectToothpastePage();
		switchingTab(firstTab);
		rpt.clickCookieBtn();
		rpt.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		rpt.clickCookieBtn();
		rpt.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyWriteAReview() throws Exception{
		switchingTab(firstTab);
		rpt.clickWriteAReview();
		System.out.println("Write a review button verified successfully in the preprod Url");
		switchingTab(secondTab);
		rpt.clickWriteAReview();
		System.out.println("Write a review button verified successfully in the live Url");
	}
	
	@Test(priority = 2)
	private void verifyBuyNowOne() throws Exception{
		switchingTab(firstTab);
		rpt.clickBuyNow();
		System.out.println("Write a buy now button verified successfully in the preprod Url");
		switchingTab(secondTab);
		rpt.clickBuyNow();
		System.out.println("Write a buy now button verified successfully in the live Url");
	}
	
	@Test(priority = 3)
	private void verifyGetCoupon() throws Exception{
		switchingTab(firstTab);
		rpt.clickGetCoupon();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		rpt.clickGetCoupon();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Get Coupon:"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyWhitening() throws Exception{
		switchingTab(firstTab);
		rpt.clickWhitening();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		rpt.clickWhitening();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Whitening:"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyExtraFresh() throws Exception{
		switchingTab(firstTab);
		rpt.clickExtraFresh();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		rpt.clickExtraFresh();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Extra Fresh:"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyIngredients() throws Exception{
		switchingTab(firstTab);
		rpt.checkIngredientsActive();
		System.out.println("Ingredients is active in the pre prod Url");
		switchingTab(secondTab);
		rpt.checkIngredientsActive();
		System.out.println("Ingredients is active in the live Url");
	}
	
	@Test(priority = 7)
	private void verifyDirections() throws Exception{
		switchingTab(firstTab);
		rpt.clickDirections();
		System.out.println("Directions is active in the pre prod Url");
		switchingTab(secondTab);
		rpt.clickDirections();
		System.out.println("Directions is active in the live Url");
	}
	
	@Test(priority = 8)
	private void verifyWarnings() throws Exception{
		switchingTab(firstTab);
		rpt.clickWarnings();
		System.out.println("Warnings is active in the pre prod Url");
		switchingTab(secondTab);
		rpt.clickWarnings();
		System.out.println("Warnings is active in the live Url");
	}
	
	@Test(priority = 9)
	private void verifyMostPopularProductsOne() throws Exception{
		switchingTab(firstTab);
		rpt.clickMostPopularProductsOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		rpt.clickMostPopularProductsOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyMostPopularProductsTwo() throws Exception{
		switchingTab(firstTab);
		rpt.clickMostPopularProductsTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		rpt.clickMostPopularProductsTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products Two:"+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyMostPopularProductsThree() throws Exception{
		switchingTab(firstTab);
		rpt.clickMostPopularProductsThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		rpt.clickMostPopularProductsThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products Three:"+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyMostPopularProductsFour() throws Exception{
		switchingTab(firstTab);
		rpt.clickMostPopularProductsFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		rpt.clickMostPopularProductsFour();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products Four:"+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyMostPopularProductsFive() throws Exception{
		switchingTab(firstTab);
		rpt.clickMostPopularProductsFive();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		rpt.clickMostPopularProductsFive();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products Five:"+compareTwoText);
	}

	@Test(priority = 14)
	private void verifyGetYourCoupon() throws Exception{
		switchingTab(firstTab);
		rpt.clickGetYourCoupon();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		rpt.clickGetYourCoupon();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for get your coupon :"+compareTwoText);
	}
	
	@Test(priority = 15)
	private void verifyFindYourStore() throws Exception{
		switchingTab(firstTab);
		rpt.clickFindYourStore();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		rpt.clickFindYourStore();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for find your store :"+compareTwoText);
	}
	
	@Test(priority = 16)
	private void verifyBreadCrumb() throws Exception{
		switchingTab(firstTab);
		rpt.clickBreadCrumb();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		rpt.clickBreadCrumb();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Bread Crumb :"+compareTwoText);
	}


}
