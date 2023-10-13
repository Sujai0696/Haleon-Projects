package com.qa.theraflu.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.theraflu.pages.TherafluDayNightFluReliefMaxStrengthSyrupValuePackPage;

public class TherafluDayNightFluReliefMaxStrengthSyrupValuePackTest extends BaseClass{
	
	TherafluDayNightFluReliefMaxStrengthSyrupValuePackPage svp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("theraflu_Config.properties").getProperty("browser"));
		launchTwoUrl();
		
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		svp = new TherafluDayNightFluReliefMaxStrengthSyrupValuePackPage();
		switchingTab(firstTab);
		launchURL(loadConfig("theraflu_Config.properties").getProperty(""));
		switchingTab(secondTab);
		launchURL(loadConfig("theraflu_Config.properties").getProperty(""));
	}

	
	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		svp.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		svp.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		svp.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		svp.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		svp.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		svp.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		svp.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three verified successfully in PreProd URL");
		switchingTab(secondTab);
		svp.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three verified successfully in Live URL");
	}
	
	
	@Test(priority = 5)
	private void verifyWriteReview() throws Exception{
		switchingTab(firstTab);
		svp.clickWriteReview();
		System.out.println("Write Review verified successfully in PreProd URL");
		switchingTab(secondTab);
		svp.clickWriteReview();
		System.out.println("Write Review verified successfully in Live URL");
	}
	
	@Test(priority = 7)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		svp.clickBuyNow();
		System.out.println("BuyNow verified successfully in PreProd URL");
		switchingTab(secondTab);
		svp.clickBuyNow();
		System.out.println("BuyNow verified successfully in Live URL");
	}
	
	@Test(priority = 8)
	private void verifyGetCoupon() throws Exception{
		switchingTab(firstTab);
		svp.clickGetCoupon();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		svp.clickGetCoupon();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for GetCoupon: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyImgCarousel() throws Exception{
		switchingTab(firstTab);
		svp.clickImgCarousel();
		System.out.println("ImgCarousel verified successfully in PreProd URL");
		switchingTab(secondTab);
		svp.clickImgCarousel();
		System.out.println("ImgCarousel verified successfully in Live URL");
	}
	
	@Test(priority = 10)
	private void verifyAllAcc() throws Exception{
		switchingTab(firstTab);
		svp.clickAllAcc();
		System.out.println("AllAcc verified successfully in PreProd URL");
		switchingTab(secondTab);
		svp.clickAllAcc();
		System.out.println("AllAcc verified successfully in Live URL");
	}
	
	@Test(priority = 11)
	private void verifyFeaturedProductsOne() throws Exception{
		switchingTab(firstTab);
		svp.clickFeaturedProductsOne();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		svp.clickFeaturedProductsOne();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for FeaturedProductsOne: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyFeaturedProductsTwo() throws Exception{
		switchingTab(firstTab);
		svp.clickFeaturedProductsTwo();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		svp.clickFeaturedProductsTwo();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for FeaturedProductsTwo: "+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyFeaturedProductsThree() throws Exception{
		switchingTab(firstTab);
		svp.clickFeaturedProductsThree();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		svp.clickFeaturedProductsThree();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for FeaturedProductsThree: "+compareTwoText);
	}


}
