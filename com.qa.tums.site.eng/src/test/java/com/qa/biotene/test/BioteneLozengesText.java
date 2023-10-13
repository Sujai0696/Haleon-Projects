package com.qa.biotene.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.biotene.pages.BioteneLozengesPage;

public class BioteneLozengesText extends BaseClass{
	
	BioteneLozengesPage lp;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("biotene_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		lp = new BioteneLozengesPage();
		switchingTab(firstTab);
		launchURL(loadConfig("biotene_Config.properties").getProperty("lozengesPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("biotene_Config.properties").getProperty("lozengesLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		lp.clickCookieBtn();
		lp.clickEmailBtn();
		System.out.println("Cookie Button and Email Pop-up successfully verified in the Preprod URL");
		switchingTab(secondTab);
		lp.clickCookieBtn();
		lp.clickEmailBtn();
		System.out.println("Cookie Button and Email Pop-up successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		lp.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		lp.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		lp.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		lp.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		lp.clickBreadcrumbThree();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		lp.clickBreadcrumbThree();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Three: "+compareTwoText);
	}
	
//	@Test(priority = 4)
//	private void verifyBannerBuyNow() throws Exception{
//		switchingTab(firstTab);
//		lp.clickBannerBuyNow();
//		System.out.println("Banner Buy Now is verified successfully in the Prepord URL");
//		switchingTab(secondTab);
//		lp.clickBannerBuyNow();
//		System.out.println("Banner Buy Now is verified successfully in the Live URL");
//	}
	
	@Test(priority = 5)
	private void verifyLearnMoreOne() throws Exception{
		switchingTab(firstTab);
		lp.clickLearnMoreOne();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		lp.clickLearnMoreOne();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More One: "+compareTwoText);
	}
	
	
	@Test(priority = 6)
	private void verifyLearnMoreTwo() throws Exception{
		switchingTab(firstTab);
		lp.clickLearnMoreTwo();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		lp.clickLearnMoreTwo();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More Two: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyLearnMoreThree() throws Exception{
		switchingTab(firstTab);
		lp.clickLearnMoreThree();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		lp.clickLearnMoreThree();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More Three: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyLearnMoreFour() throws Exception{
		switchingTab(firstTab);
		lp.clickLearnMoreFour();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		lp.clickLearnMoreFour();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More Four: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyLearnMoreFive() throws Exception{
		switchingTab(firstTab);
		lp.clickLearnMoreFive();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		lp.clickLearnMoreFive();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More Five: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyLearnMoreSix() throws Exception{
		switchingTab(firstTab);
		lp.clickLearnMoreSix();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		lp.clickLearnMoreSix();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More Six: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyLearnMoreSeven() throws Exception{
		switchingTab(firstTab);
		lp.clickLearnMoreSeven();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		lp.clickLearnMoreSeven();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More Seven: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyPreviousAndNextArrow() throws Exception{
		switchingTab(firstTab);
		lp.clickPreviousAndNextArrow();
		System.out.println("Previous and Next arrow is verified successfully in the Prepord URL");
		switchingTab(secondTab);
		lp.clickPreviousAndNextArrow();
		System.out.println("Previous and Next arrow is verified successfully in the Live URL");
	}
	
	@Test(priority = 13)
	private void verifyGetCoupon() throws Exception{
		switchingTab(firstTab);
		lp.clickGetCoupon();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		lp.clickGetCoupon();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Get Coupon: "+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyTakeTheQuiz() throws Exception{
		switchingTab(firstTab);
		lp.clickTakeTheQuiz();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		lp.clickTakeTheQuiz();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Take The Quiz: "+compareTwoText);
	}
	
	@Test(priority = 15)
	private void verifyShopNow() throws Exception{
		switchingTab(firstTab);
		lp.clickShopNow();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		lp.clickShopNow();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Get Coupon: "+compareTwoText);
	}
	
	

}
