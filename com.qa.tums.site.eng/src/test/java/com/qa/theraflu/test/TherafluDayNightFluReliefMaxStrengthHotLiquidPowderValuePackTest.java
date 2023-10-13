package com.qa.theraflu.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.theraflu.pages.TherafluDayNightFluReliefMaxStrengthHotLiquidPowderValuePackPage;

public class TherafluDayNightFluReliefMaxStrengthHotLiquidPowderValuePackTest extends BaseClass{
	
	TherafluDayNightFluReliefMaxStrengthHotLiquidPowderValuePackPage pvp;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("theraflu_Config.properties").getProperty("browser"));
		launchTwoUrl();
		
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		pvp = new TherafluDayNightFluReliefMaxStrengthHotLiquidPowderValuePackPage();
		switchingTab(firstTab);
		launchURL(loadConfig("theraflu_Config.properties").getProperty("dayNightFluReliefMaxStrengthHotLiquidPowderValuePackPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("theraflu_Config.properties").getProperty("dayNightFluReliefMaxStrengthHotLiquidPowderValuePackLiveUrl"));
	}

	
	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		pvp.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		pvp.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		pvp.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		pvp.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		pvp.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		pvp.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		pvp.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three verified successfully in PreProd URL");
		switchingTab(secondTab);
		pvp.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three verified successfully in Live URL");
	}
	
	
	@Test(priority = 5)
	private void verifyWriteReview() throws Exception{
		switchingTab(firstTab);
		pvp.clickWriteReview();
		System.out.println("Write Review verified successfully in PreProd URL");
		switchingTab(secondTab);
		pvp.clickWriteReview();
		System.out.println("Write Review verified successfully in Live URL");
	}
	
	@Test(priority = 7)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		pvp.clickBuyNow();
		System.out.println("BuyNow verified successfully in PreProd URL");
		switchingTab(secondTab);
		pvp.clickBuyNow();
		System.out.println("BuyNow verified successfully in Live URL");
	}
	
	@Test(priority = 8)
	private void verifyGetCoupon() throws Exception{
		switchingTab(firstTab);
		pvp.clickGetCoupon();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		pvp.clickGetCoupon();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for GetCoupon: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyImgCarousel() throws Exception{
		switchingTab(firstTab);
		pvp.clickImgCarousel();
		System.out.println("ImgCarousel verified successfully in PreProd URL");
		switchingTab(secondTab);
		pvp.clickImgCarousel();
		System.out.println("ImgCarousel verified successfully in Live URL");
	}
	
	@Test(priority = 10)
	private void verifyAllAcc() throws Exception{
		switchingTab(firstTab);
		pvp.clickAllAcc();
		System.out.println("AllAcc verified successfully in PreProd URL");
		switchingTab(secondTab);
		pvp.clickAllAcc();
		System.out.println("AllAcc verified successfully in Live URL");
	}
	
	@Test(priority = 11)
	private void verifyFeaturedProductsOne() throws Exception{
		switchingTab(firstTab);
		pvp.clickFeaturedProductsOne();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		pvp.clickFeaturedProductsOne();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for FeaturedProductsOne: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyFeaturedProductsTwo() throws Exception{
		switchingTab(firstTab);
		pvp.clickFeaturedProductsTwo();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		pvp.clickFeaturedProductsTwo();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for FeaturedProductsTwo: "+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyFeaturedProductsThree() throws Exception{
		switchingTab(firstTab);
		pvp.clickFeaturedProductsThree();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		pvp.clickFeaturedProductsThree();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for FeaturedProductsThree: "+compareTwoText);
	}


}
