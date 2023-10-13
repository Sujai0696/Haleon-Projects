package com.qa.biotene.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.biotene.pages.BioteneGentleToothpastePage;

public class BioteneGentleToothpasteTest extends BaseClass{
	
	BioteneGentleToothpastePage gt;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("biotene_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		gt = new BioteneGentleToothpastePage();
		switchingTab(firstTab);
		launchURL(loadConfig("biotene_Config.properties").getProperty("gentleToothpastePreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("biotene_Config.properties").getProperty("gentleToothpasteLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		gt.clickCookieBtn();
		gt.clickEmailBtn();
		System.out.println("Cookie Button and Email Pop-up successfully verified in the Preprod URL");
		switchingTab(secondTab);
		gt.clickCookieBtn();
		gt.clickEmailBtn();
		System.out.println("Cookie Button and Email Pop-up successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		gt.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		gt.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		gt.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		gt.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		gt.clickBreadcrumbThree();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		gt.clickBreadcrumbThree();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Three: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyBannerBuyNow() throws Exception{
		switchingTab(firstTab);
		gt.clickBannerBuyNow();
		System.out.println("Banner Buy Now is verified successfully in the Prepord URL");
		switchingTab(secondTab);
		gt.clickBannerBuyNow();
		System.out.println("Banner Buy Now is verified successfully in the Live URL");
	}
	
	@Test(priority = 5)
	private void verifyLearnMoreOne() throws Exception{
		switchingTab(firstTab);
		gt.clickLearnMoreOne();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		gt.clickLearnMoreOne();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More One: "+compareTwoText);
	}
	
	
	@Test(priority = 6)
	private void verifyLearnMoreTwo() throws Exception{
		switchingTab(firstTab);
		gt.clickLearnMoreTwo();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		gt.clickLearnMoreTwo();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More Two: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyLearnMoreThree() throws Exception{
		switchingTab(firstTab);
		gt.clickLearnMoreThree();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		gt.clickLearnMoreThree();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More Three: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyLearnMoreFour() throws Exception{
		switchingTab(firstTab);
		gt.clickLearnMoreFour();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		gt.clickLearnMoreFour();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More Four: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyLearnMoreFive() throws Exception{
		switchingTab(firstTab);
		gt.clickLearnMoreFive();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		gt.clickLearnMoreFive();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More Five: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyLearnMoreSix() throws Exception{
		switchingTab(firstTab);
		gt.clickLearnMoreSix();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		gt.clickLearnMoreSix();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More Six: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyLearnMoreSeven() throws Exception{
		switchingTab(firstTab);
		gt.clickLearnMoreSeven();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		gt.clickLearnMoreSeven();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More Seven: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyPreviousAndNextArrow() throws Exception{
		switchingTab(firstTab);
		gt.clickPreviousAndNextArrow();
		System.out.println("Previous and Next arrow is verified successfully in the Prepord URL");
		switchingTab(secondTab);
		gt.clickPreviousAndNextArrow();
		System.out.println("Previous and Next arrow is verified successfully in the Live URL");
	}
	
	@Test(priority = 13)
	private void verifyGetCoupon() throws Exception{
		switchingTab(firstTab);
		gt.clickGetCoupon();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		gt.clickGetCoupon();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Get Coupon: "+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyTakeTheQuiz() throws Exception{
		switchingTab(firstTab);
		gt.clickTakeTheQuiz();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		gt.clickTakeTheQuiz();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Take The Quiz: "+compareTwoText);
	}
	
	@Test(priority = 15)
	private void verifyShopNow() throws Exception{
		switchingTab(firstTab);
		gt.clickShopNow();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		gt.clickShopNow();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Get Coupon: "+compareTwoText);
	}

}
