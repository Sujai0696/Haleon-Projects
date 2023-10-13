package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneCompleteProtectionExtraFreshPage;

public class SensodyneCompleteProtectionExtraFreshTest extends BaseClass{
	
	SensodyneCompleteProtectionExtraFreshPage cpe;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("completeProtectionExtraFreshPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("completeProtectionExtraFreshLiveUrl"));
	}

	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		cpe = new SensodyneCompleteProtectionExtraFreshPage();
		switchingTab(firstTab);
		cpe.clickCookieBtn();
		cpe.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		cpe.clickCookieBtn();
		cpe.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}
	
//	@Test(priority = 1)
//	private void verifyWriteAReview() throws Exception{
//		switchingTab(firstTab);
//		cpe.clickWriteAReview();
//		System.out.println("Write a review button verified successfully in the preprod Url");
//		switchingTab(secondTab);
//		cpe.clickWriteAReview();
//		System.out.println("Write a review button verified successfully in the live Url");
//	}
	
	@Test(priority = 2)
	private void verifyBuyNowOne() throws Exception{
		switchingTab(firstTab);
		cpe.clickBuyNow();
		System.out.println("Write a buy now button verified successfully in the preprod Url");
		switchingTab(secondTab);
		cpe.clickBuyNow();
		System.out.println("Write a buy now button verified successfully in the live Url");
	}
	
	@Test(priority = 3)
	private void verifyGetCoupon() throws Exception{
		switchingTab(firstTab);
		cpe.clickGetCoupon();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		cpe.clickGetCoupon();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Get Coupon:"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyOriginal() throws Exception{
		switchingTab(firstTab);
		cpe.clickOriginal();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		cpe.clickOriginal();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for original:"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyBreadCrumb() throws Exception{
		switchingTab(firstTab);
		cpe.clickBreadCrumb();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		cpe.clickBreadCrumb();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Bread Crumb:"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyIngredients() throws Exception{
		switchingTab(firstTab);
		cpe.checkIngredientsActive();
		System.out.println("Ingredients is active in the pre prod Url");
		switchingTab(secondTab);
		cpe.checkIngredientsActive();
		System.out.println("Ingredients is active in the live Url");
	}
	
	@Test(priority = 7)
	private void verifyDirections() throws Exception{
		switchingTab(firstTab);
		cpe.clickDirections();
		System.out.println("Directions is active in the pre prod Url");
		switchingTab(secondTab);
		cpe.clickDirections();
		System.out.println("Directions is active in the live Url");
	}
	
	@Test(priority = 8)
	private void verifyWarnings() throws Exception{
		switchingTab(firstTab);
		cpe.clickWarnings();
		System.out.println("Warnings is active in the pre prod Url");
		switchingTab(secondTab);
		cpe.clickWarnings();
		System.out.println("Warnings is active in the live Url");
	}
	
	@Test(priority = 9)
	private void verifyMostPopularProductsOne() throws Exception{
		switchingTab(firstTab);
		cpe.clickMostPopularProductsOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		cpe.clickMostPopularProductsOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyMostPopularProductsTwo() throws Exception{
		switchingTab(firstTab);
		cpe.clickMostPopularProductsTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		cpe.clickMostPopularProductsTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products Two:"+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyMostPopularProductsThree() throws Exception{
		switchingTab(firstTab);
		cpe.clickMostPopularProductsThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		cpe.clickMostPopularProductsThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products Three:"+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyMostPopularProductsFour() throws Exception{
		switchingTab(firstTab);
		cpe.clickMostPopularProductsFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		cpe.clickMostPopularProductsFour();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products Four:"+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyMostPopularProductsFive() throws Exception{
		switchingTab(firstTab);
		cpe.clickMostPopularProductsFive();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		cpe.clickMostPopularProductsFive();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products Five:"+compareTwoText);
	}

	@Test(priority = 14)
	private void verifyGetYourCoupon() throws Exception{
		switchingTab(firstTab);
		cpe.clickGetYourCoupon();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		cpe.clickGetYourCoupon();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for get your coupon :"+compareTwoText);
	}
	
	@Test(priority = 15)
	private void verifyFindYourStore() throws Exception{
		switchingTab(firstTab);
		cpe.clickFindYourStore();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		cpe.clickFindYourStore();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for find your store :"+compareTwoText);
	}
	
	

}
