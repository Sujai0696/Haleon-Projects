package com.qa.biotene.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.biotene.pages.BioteneFreshMintToothPastePage;

public class BioteneFreshMintToothPasteTest extends BaseClass{
	
	BioteneFreshMintToothPastePage fmt;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("biotene_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		fmt = new BioteneFreshMintToothPastePage();
		switchingTab(firstTab);
		launchURL(loadConfig("biotene_Config.properties").getProperty("freshMintToothPastePreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("biotene_Config.properties").getProperty("freshMintToothPasteLiveUrl"));
		
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		fmt.clickCookieBtn();
		fmt.clickEmailBtn();
		System.out.println("Cookie Button and Email Pop-up successfully verified in the Preprod URL");
		switchingTab(secondTab);
		fmt.clickCookieBtn();
		fmt.clickEmailBtn();
		System.out.println("Cookie Button and Email Pop-up successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		fmt.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		fmt.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		fmt.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		fmt.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		fmt.clickBreadcrumbThree();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		fmt.clickBreadcrumbThree();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Three: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyBannerBuyNow() throws Exception{
		switchingTab(firstTab);
		fmt.clickBannerBuyNow();
		System.out.println("Banner Buy Now is verified successfully in the Prepord URL");
		switchingTab(secondTab);
		fmt.clickBannerBuyNow();
		System.out.println("Banner Buy Now is verified successfully in the Live URL");
	}
	
	@Test(priority = 5)
	private void verifyLearnMoreOne() throws Exception{
		switchingTab(firstTab);
		fmt.clickLearnMoreOne();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		fmt.clickLearnMoreOne();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More One: "+compareTwoText);
	}
	
	
	@Test(priority = 6)
	private void verifyLearnMoreTwo() throws Exception{
		switchingTab(firstTab);
		fmt.clickLearnMoreTwo();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		fmt.clickLearnMoreTwo();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More Two: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyLearnMoreThree() throws Exception{
		switchingTab(firstTab);
		fmt.clickLearnMoreThree();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		fmt.clickLearnMoreThree();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More Three: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyLearnMoreFour() throws Exception{
		switchingTab(firstTab);
		fmt.clickLearnMoreFour();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		fmt.clickLearnMoreFour();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More Four: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyLearnMoreFive() throws Exception{
		switchingTab(firstTab);
		fmt.clickLearnMoreFive();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		fmt.clickLearnMoreFive();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More Five: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyLearnMoreSix() throws Exception{
		switchingTab(firstTab);
		fmt.clickLearnMoreSix();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		fmt.clickLearnMoreSix();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More Six: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyLearnMoreSeven() throws Exception{
		switchingTab(firstTab);
		fmt.clickLearnMoreSeven();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		fmt.clickLearnMoreSeven();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More Seven: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyPreviousAndNextArrow() throws Exception{
		switchingTab(firstTab);
		fmt.clickPreviousAndNextArrow();
		System.out.println("Previous and Next arrow is verified successfully in the Prepord URL");
		switchingTab(secondTab);
		fmt.clickPreviousAndNextArrow();
		System.out.println("Previous and Next arrow is verified successfully in the Live URL");
	}
	
	@Test(priority = 13)
	private void verifyGetCoupon() throws Exception{
		switchingTab(firstTab);
		fmt.clickGetCoupon();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		fmt.clickGetCoupon();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Get Coupon: "+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyTakeTheQuiz() throws Exception{
		switchingTab(firstTab);
		fmt.clickTakeTheQuiz();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		fmt.clickTakeTheQuiz();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Take The Quiz: "+compareTwoText);
	}
	
	@Test(priority = 15)
	private void verifyShopNow() throws Exception{
		switchingTab(firstTab);
		fmt.clickShopNow();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		fmt.clickShopNow();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Get Coupon: "+compareTwoText);
	}
	

}
