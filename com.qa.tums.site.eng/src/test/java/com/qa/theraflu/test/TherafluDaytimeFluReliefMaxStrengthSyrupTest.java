package com.qa.theraflu.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.theraflu.pages.TherafluDaytimeFluReliefMaxStrengthSyrupPage;

public class TherafluDaytimeFluReliefMaxStrengthSyrupTest extends BaseClass{
	
	TherafluDaytimeFluReliefMaxStrengthSyrupPage mss;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("theraflu_Config.properties").getProperty("browser"));
		launchTwoUrl();
		
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		mss = new TherafluDaytimeFluReliefMaxStrengthSyrupPage();
		switchingTab(firstTab);
		launchURL(loadConfig("theraflu_Config.properties").getProperty("daytimeFluReliefMaxStrengthSyrupPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("theraflu_Config.properties").getProperty("daytimeFluReliefMaxStrengthSyrupLiveUrl"));
	}

	
	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		mss.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		mss.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		mss.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		mss.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		mss.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		mss.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		mss.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three verified successfully in PreProd URL");
		switchingTab(secondTab);
		mss.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three verified successfully in Live URL");
	}
	
	
	@Test(priority = 5)
	private void verifyWriteReview() throws Exception{
		switchingTab(firstTab);
		mss.clickWriteReview();
		System.out.println("Write Review verified successfully in PreProd URL");
		switchingTab(secondTab);
		mss.clickWriteReview();
		System.out.println("Write Review verified successfully in Live URL");
	}
	
	@Test(priority = 7)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		mss.clickBuyNow();
		System.out.println("BuyNow verified successfully in PreProd URL");
		switchingTab(secondTab);
		mss.clickBuyNow();
		System.out.println("BuyNow verified successfully in Live URL");
	}
	
	@Test(priority = 8)
	private void verifyGetCoupon() throws Exception{
		switchingTab(firstTab);
		mss.clickGetCoupon();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		mss.clickGetCoupon();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for GetCoupon: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyImgCarousel() throws Exception{
		switchingTab(firstTab);
		mss.clickImgCarousel();
		System.out.println("ImgCarousel verified successfully in PreProd URL");
		switchingTab(secondTab);
		mss.clickImgCarousel();
		System.out.println("ImgCarousel verified successfully in Live URL");
	}
	
	@Test(priority = 10)
	private void verifyAllAcc() throws Exception{
		switchingTab(firstTab);
		mss.clickAllAcc();
		System.out.println("AllAcc verified successfully in PreProd URL");
		switchingTab(secondTab);
		mss.clickAllAcc();
		System.out.println("AllAcc verified successfully in Live URL");
	}
	
	@Test(priority = 11)
	private void verifyFeaturedProductsOne() throws Exception{
		switchingTab(firstTab);
		mss.clickFeaturedProductsOne();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		mss.clickFeaturedProductsOne();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for FeaturedProductsOne: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyFeaturedProductsTwo() throws Exception{
		switchingTab(firstTab);
		mss.clickFeaturedProductsTwo();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		mss.clickFeaturedProductsTwo();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for FeaturedProductsTwo: "+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyFeaturedProductsThree() throws Exception{
		switchingTab(firstTab);
		mss.clickFeaturedProductsThree();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		mss.clickFeaturedProductsThree();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for FeaturedProductsThree: "+compareTwoText);
	}


}
