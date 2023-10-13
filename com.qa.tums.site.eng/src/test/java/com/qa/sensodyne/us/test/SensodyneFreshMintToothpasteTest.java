package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneFreshMintToothpastePage;

public class SensodyneFreshMintToothpasteTest extends BaseClass{
	
	SensodyneFreshMintToothpastePage fmt;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("freshMintToothpastePreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("freshMintToothpasteLiveUrl"));
	}

	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		fmt = new SensodyneFreshMintToothpastePage();
		switchingTab(firstTab);
		fmt.clickCookieBtn();
		fmt.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		fmt.clickCookieBtn();
		fmt.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyWriteAReview() throws Exception{
		switchingTab(firstTab);
		fmt.clickWriteAReview();
		System.out.println("Write a review button verified successfully in the preprod Url");
		switchingTab(secondTab);
		fmt.clickWriteAReview();
		System.out.println("Write a review button verified successfully in the live Url");
	}
	
	@Test(priority = 2)
	private void verifyBuyNowOne() throws Exception{
		switchingTab(firstTab);
		fmt.clickBuyNow();
		System.out.println("Write a buy now button verified successfully in the preprod Url");
		switchingTab(secondTab);
		fmt.clickBuyNow();
		System.out.println("Write a buy now button verified successfully in the live Url");
	}
	
	@Test(priority = 3)
	private void verifyGetCoupon() throws Exception{
		switchingTab(firstTab);
		fmt.clickGetCoupon();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		fmt.clickGetCoupon();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Get Coupon:"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyIngredients() throws Exception{
		switchingTab(firstTab);
		fmt.checkIngredientsActive();
		System.out.println("Ingredients is active in the pre prod Url");
		switchingTab(secondTab);
		fmt.checkIngredientsActive();
		System.out.println("Ingredients is active in the live Url");
	}
	
	@Test(priority = 5)
	private void verifyDirections() throws Exception{
		switchingTab(firstTab);
		fmt.clickDirections();
		System.out.println("Directions is active in the pre prod Url");
		switchingTab(secondTab);
		fmt.clickDirections();
		System.out.println("Directions is active in the live Url");
	}
	
	@Test(priority = 6)
	private void verifyWarnings() throws Exception{
		switchingTab(firstTab);
		fmt.clickWarnings();
		System.out.println("Warnings is active in the pre prod Url");
		switchingTab(secondTab);
		fmt.clickWarnings();
		System.out.println("Warnings is active in the live Url");
	}
	
	@Test(priority = 7)
	private void verifyYoutubeLink() throws Exception{
		switchingTab(firstTab);
		fmt.clickYoutubeLink();
		System.out.println("Tooth sensitivity youtube video has verified in PreProd Url");
		switchingTab(secondTab);
		fmt.clickYoutubeLink();
		System.out.println("Tooth sensitivity youtube video has verified in live Url");
	}
	
	@Test(priority = 8)
	private void verifyMostPopularProductsOne() throws Exception{
		switchingTab(firstTab);
		fmt.clickMostPopularProductsOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		fmt.clickMostPopularProductsOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyMostPopularProductsTwo() throws Exception{
		switchingTab(firstTab);
		fmt.clickMostPopularProductsTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		fmt.clickMostPopularProductsTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products Two:"+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyMostPopularProductsThree() throws Exception{
		switchingTab(firstTab);
		fmt.clickMostPopularProductsThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		fmt.clickMostPopularProductsThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products Three:"+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyMostPopularProductsFour() throws Exception{
		switchingTab(firstTab);
		fmt.clickMostPopularProductsFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		fmt.clickMostPopularProductsFour();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products Four:"+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyMostPopularProductsFive() throws Exception{
		switchingTab(firstTab);
		fmt.clickMostPopularProductsFive();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		fmt.clickMostPopularProductsFive();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products Five:"+compareTwoText);
	}

	@Test(priority = 13)
	private void verifyGetYourCoupon() throws Exception{
		switchingTab(firstTab);
		fmt.clickGetYourCoupon();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		fmt.clickGetYourCoupon();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for get your coupon :"+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyFindYourStore() throws Exception{
		switchingTab(firstTab);
		fmt.clickFindYourStore();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		fmt.clickFindYourStore();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for find your store :"+compareTwoText);
	}
	
	@Test(priority = 15)
	private void verifyBreadCrumb() throws Exception{
		switchingTab(firstTab);
		fmt.clickBreadCrumb();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		fmt.clickBreadCrumb();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Bread Crumb :"+compareTwoText);
	}

}
