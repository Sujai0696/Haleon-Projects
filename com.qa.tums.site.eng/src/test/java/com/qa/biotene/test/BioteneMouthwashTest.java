package com.qa.biotene.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.biotene.pages.BioteneMouthwashPage;

public class BioteneMouthwashTest extends BaseClass{
	
	BioteneMouthwashPage mw;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("biotene_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		mw = new BioteneMouthwashPage();
		switchingTab(firstTab);
		launchURL(loadConfig("biotene_Config.properties").getProperty("mouthwashPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("biotene_Config.properties").getProperty("mouthwashLiveUrl"));
		
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		mw.clickCookieBtn();
		mw.clickEmailBtn();
		System.out.println("Cookie Button and Email Pop-up successfully verified in the Preprod URL");
		switchingTab(secondTab);
		mw.clickCookieBtn();
		mw.clickEmailBtn();
		System.out.println("Cookie Button and Email Pop-up successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		mw.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		mw.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		mw.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		mw.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		mw.clickBreadcrumbThree();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		mw.clickBreadcrumbThree();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Three: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyBannerBuyNow() throws Exception{
		switchingTab(firstTab);
		mw.clickBannerBuyNow();
		System.out.println("Banner Buy Now is verified successfully in the Prepord URL");
		switchingTab(secondTab);
		mw.clickBannerBuyNow();
		System.out.println("Banner Buy Now is verified successfully in the Live URL");
	}
	
	@Test(priority = 5)
	private void verifyBannerWriteAReview() throws Exception{
		switchingTab(firstTab);
		mw.clickBannerWriteAReview();
		System.out.println("Banner Write a review is verified successfully in the Prepord URL");
		switchingTab(secondTab);
		mw.clickBannerWriteAReview();
		System.out.println("Banner Write a review is verified successfully in the Live URL");
	}
	
	@Test(priority = 7)
	private void verifyDryMouthLink() throws Exception{
		switchingTab(firstTab);
		mw.clickDryMouthLink();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		mw.clickDryMouthLink();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Dry Mouth Link "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyExploreResourcesLink() throws Exception{
		switchingTab(firstTab);
		mw.clickExploreResourcesLink();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		mw.clickExploreResourcesLink();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Explore Resources Link "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyBioteneSiteLink() throws Exception{
		switchingTab(firstTab);
		mw.clickBioteneSiteLink();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		mw.clickBioteneSiteLink();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Biotene Site Link "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyLearnMoreOne() throws Exception{
		switchingTab(firstTab);
		mw.clickLearnMoreOne();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		mw.clickLearnMoreOne();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More One: "+compareTwoText);
	}
	
	
	@Test(priority = 10)
	private void verifyLearnMoreTwo() throws Exception{
		switchingTab(firstTab);
		mw.clickLearnMoreTwo();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		mw.clickLearnMoreTwo();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More Two: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyLearnMoreThree() throws Exception{
		switchingTab(firstTab);
		mw.clickLearnMoreThree();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		mw.clickLearnMoreThree();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More Three: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyLearnMoreFour() throws Exception{
		switchingTab(firstTab);
		mw.clickLearnMoreFour();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		mw.clickLearnMoreFour();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More Four: "+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyLearnMoreFive() throws Exception{
		switchingTab(firstTab);
		mw.clickLearnMoreFive();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		mw.clickLearnMoreFive();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More Five: "+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyLearnMoreSix() throws Exception{
		switchingTab(firstTab);
		mw.clickLearnMoreSix();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		mw.clickLearnMoreSix();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More Six: "+compareTwoText);
	}
	
	@Test(priority = 15)
	private void verifyLearnMoreSeven() throws Exception{
		switchingTab(firstTab);
		mw.clickLearnMoreSeven();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		mw.clickLearnMoreSeven();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More Seven: "+compareTwoText);
	}
	
	@Test(priority = 16)
	private void verifyPreviousAndNextArrow() throws Exception{
		switchingTab(firstTab);
		mw.clickPreviousAndNextArrow();
		System.out.println("Previous and Next arrow is verified successfully in the Prepord URL");
		switchingTab(secondTab);
		mw.clickPreviousAndNextArrow();
		System.out.println("Previous and Next arrow is verified successfully in the Live URL");
	}
	
	@Test(priority = 17)
	private void verifyGetCoupon() throws Exception{
		switchingTab(firstTab);
		mw.clickGetCoupon();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		mw.clickGetCoupon();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Get Coupon: "+compareTwoText);
	}
	
	@Test(priority = 18)
	private void verifyTakeTheQuiz() throws Exception{
		switchingTab(firstTab);
		mw.clickTakeTheQuiz();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		mw.clickTakeTheQuiz();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Take The Quiz: "+compareTwoText);
	}
	
	@Test(priority = 19)
	private void verifyShopNow() throws Exception{
		switchingTab(firstTab);
		mw.clickShopNow();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		mw.clickShopNow();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Get Coupon: "+compareTwoText);
	}
	
	
}
