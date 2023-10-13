package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneSensodyeRapidReleifPage;

public class SensodyneSensodyeRapidReleifTest extends BaseClass{
	
	SensodyneSensodyeRapidReleifPage sr;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("sensodyneRapidReleifPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("sensodyneRapidReleifLiveUrl"));
	}

	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		sr = new SensodyneSensodyeRapidReleifPage();
		switchingTab(firstTab);
		sr.clickCookieBtn();
		sr.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		sr.clickCookieBtn();
		sr.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyWriteAReview() throws Exception{
		switchingTab(firstTab);
		sr.clickWriteAReview();
		System.out.println("Write a review button verified successfully in the preprod Url");
		switchingTab(secondTab);
		sr.clickWriteAReview();
		System.out.println("Write a review button verified successfully in the live Url");
	}
	
	@Test(priority = 2)
	private void verifyBuyNowOne() throws Exception{
		switchingTab(firstTab);
		sr.clickBuyNow();
		System.out.println("Write a buy now button verified successfully in the preprod Url");
		switchingTab(secondTab);
		sr.clickBuyNow();
		System.out.println("Write a buy now button verified successfully in the live Url");
	}
	
	@Test(priority = 3)
	private void verifyGetCoupon() throws Exception{
		switchingTab(firstTab);
		sr.clickGetCoupon();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sr.clickGetCoupon();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Get Coupon:"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyMint() throws Exception{
		switchingTab(firstTab);
		sr.clickMint();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sr.clickMint();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Mint:"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyWhitening() throws Exception{
		switchingTab(firstTab);
		sr.clickWhitening();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sr.clickWhitening();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Whitening:"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyIngredients() throws Exception{
		switchingTab(firstTab);
		sr.checkIngredientsActive();
		System.out.println("Ingredients is active in the pre prod Url");
		switchingTab(secondTab);
		sr.checkIngredientsActive();
		System.out.println("Ingredients is active in the live Url");
	}
	
	@Test(priority = 7)
	private void verifyDirections() throws Exception{
		switchingTab(firstTab);
		sr.clickDirections();
		System.out.println("Directions is active in the pre prod Url");
		switchingTab(secondTab);
		sr.clickDirections();
		System.out.println("Directions is active in the live Url");
	}
	
	@Test(priority = 8)
	private void verifyWarnings() throws Exception{
		switchingTab(firstTab);
		sr.clickWarnings();
		System.out.println("Warnings is active in the pre prod Url");
		switchingTab(secondTab);
		sr.clickWarnings();
		System.out.println("Warnings is active in the live Url");
	}
	
	@Test(priority = 9)
	private void verifySensodyneRapidReleifYoutube() throws Exception{
		switchingTab(firstTab);
		sr.clickSensodyneRapidReleifYoutube();
		System.out.println("Sensodyne rapid releif youtube video has verified in PreProd Url");
		switchingTab(secondTab);
		sr.clickSensodyneRapidReleifYoutube();
		System.out.println("Sensodyne rapid releif youtube video has verified in live Url");
	}
	
	@Test(priority = 10)
	private void verifyLearnMore() throws Exception{
		switchingTab(firstTab);
		sr.clickLearnMore();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sr.clickLearnMore();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More:"+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyDentistRecommendYoutubeLink() throws Exception{
		switchingTab(firstTab);
		sr.clickDentistRecommendYoutubeLink();
		System.out.println("DentistRecommendYoutubeLink youtube video has verified in PreProd Url");
		switchingTab(secondTab);
		sr.clickDentistRecommendYoutubeLink();
		System.out.println("DentistRecommendYoutubeLink youtube video has verified in live Url");
	}
	
	@Test(priority = 12)
	private void verifyMostPopularProductsOne() throws Exception{
		switchingTab(firstTab);
		sr.clickMostPopularProductsOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sr.clickMostPopularProductsOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyMostPopularProductsTwo() throws Exception{
		switchingTab(firstTab);
		sr.clickMostPopularProductsTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sr.clickMostPopularProductsTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products Two:"+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyMostPopularProductsThree() throws Exception{
		switchingTab(firstTab);
		sr.clickMostPopularProductsThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sr.clickMostPopularProductsThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products Three:"+compareTwoText);
	}
	
	@Test(priority = 15)
	private void verifyMostPopularProductsFour() throws Exception{
		switchingTab(firstTab);
		sr.clickMostPopularProductsFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sr.clickMostPopularProductsFour();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products Four:"+compareTwoText);
	}
	
	@Test(priority = 16)
	private void verifyMostPopularProductsFive() throws Exception{
		switchingTab(firstTab);
		sr.clickMostPopularProductsFive();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sr.clickMostPopularProductsFive();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products Five:"+compareTwoText);
	}

	@Test(priority = 17)
	private void verifyGetYourCoupon() throws Exception{
		switchingTab(firstTab);
		sr.clickGetYourCoupon();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sr.clickGetYourCoupon();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for get your coupon :"+compareTwoText);
	}
	
	@Test(priority = 18)
	private void verifyFindYourStore() throws Exception{
		switchingTab(firstTab);
		sr.clickFindYourStore();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sr.clickFindYourStore();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for find your store :"+compareTwoText);
	}

}
