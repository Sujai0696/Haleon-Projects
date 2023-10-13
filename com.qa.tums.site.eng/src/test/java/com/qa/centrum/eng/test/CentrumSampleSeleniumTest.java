package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.CentrumSeleniumPage;

public class CentrumSampleSeleniumTest extends BaseClass{
	
	CentrumSeleniumPage se;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL("https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/learn/vitamins-minerals/selenium/");
		switchingTab(secondTab);
		launchURL("https://www.centrum.com/learn/vitamins-minerals/selenium/");
	}


	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		se = new CentrumSeleniumPage();
		switchingTab(firstTab);
		se.clickCookieBtn();
		se.clickGigyaForm();
		System.out.println("Cookie Pop-up and Gigya form verified in the preprod URL");
		switchingTab(secondTab);
		se.clickCookieBtn();
		se.clickGigyaForm();
		System.out.println("Cookie Pop-up and Gigya form verified in the live URL");
	}
	
	@Test(priority = 1, enabled = true)
	private void verifyEnergy() throws Exception {
		switchingTab(firstTab);
		se.clickEnergy();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		se.clickEnergy();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Energy :"+compareTwoText);
	}
	
	@Test(priority = 2, enabled = true)
	private void verifyImmuneHealth() throws Exception {
		switchingTab(firstTab);
		se.clickImmuneHealth();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		se.clickImmuneHealth();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Immune Helath :"+compareTwoText);
	}
	
	@Test(priority = 3, enabled = true)
	private void verifyArticleOne() throws Exception {
		switchingTab(firstTab);
		se.clickArticleOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		se.clickArticleOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article One :"+compareTwoText);
	}
	
	@Test(priority = 4, enabled = true)
	private void verifyArticleTwo() throws Exception {
		switchingTab(firstTab);
		se.clickArticleTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		se.clickArticleTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Two :"+compareTwoText);
	}
	
	
	@Test(priority = 5, enabled = true)
	private void verifyArticleThree() throws Exception {
		switchingTab(firstTab);
		se.clickArticleThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		se.clickArticleThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Three :"+compareTwoText);
	}
	
	@Test(priority = 6, enabled = true)
	private void verifyArticleFour() throws Exception {
		switchingTab(firstTab);
		se.clickArticleFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		se.clickArticleFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Four :"+compareTwoText);
	}
	
	@Test(priority = 7, enabled = true)
	private void verifyLearnMoreOne() throws Exception {
		switchingTab(firstTab);
		se.clickLearnMoreOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		se.clickLearnMoreOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More One :"+compareTwoText);
	}
	
	@Test(priority = 8, enabled = true)
	private void verifyLearnMoreTwo() throws Exception {
		switchingTab(firstTab);
		se.clickLearnMoreTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		se.clickLearnMoreTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More Two :"+compareTwoText);
	}
	
	@Test(priority = 9, enabled = true)
	private void verifyLearnMoreThree() throws Exception {
		switchingTab(firstTab);
		se.clickLearnMoreThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		se.clickLearnMoreThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More Three :"+compareTwoText);
	}
	
	@Test(priority = 10, enabled = true)
	private void verifyLearnMoreFour() throws Exception {
		switchingTab(firstTab);
		se.clickLearnMoreFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		se.clickLearnMoreFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More Four :"+compareTwoText);
	}
	
	@Test(priority = 11, enabled = true)
	private void verifyFeaturedProduct() throws Exception {
		switchingTab(firstTab);
		se.clickFeaturedProduct();
		System.out.println("Featured products successfully verified in Preprod URL");
		switchingTab(secondTab);
		se.clickFeaturedProduct();
		System.out.println("Featured products successfully verified in Live URL");
	}

	@Test(priority = 12, enabled = true)
	private void verifyProductMen() throws Exception {
		switchingTab(firstTab);
		se.clickProductMen();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		se.clickProductMen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product card One :"+compareTwoText);
	}
	
	@Test(priority = 13, enabled = true)
	private void verifyProductMultiGummiesMen() throws Exception {
		switchingTab(firstTab);
		se.clickProductMultiGummiesMen();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		se.clickProductMultiGummiesMen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product card Two :"+compareTwoText);
	}
	
	@Test(priority = 14, enabled = true)
	private void verifyProductSilverWomen() throws Exception {
		switchingTab(firstTab);
		se.clickProductSilverWomen();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		se.clickProductSilverWomen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product card Three :"+compareTwoText);
	}
	
	@Test(priority = 15, enabled = true)
	private void verifyProductWomensMultivitamin() throws Exception {
		switchingTab(firstTab);
		se.clickProductWomensMultivitamin();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		se.clickProductWomensMultivitamin();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product card Four :"+compareTwoText);
	}
	
	@Test(priority = 16, enabled = true)
	private void verifyBuyNowOne() throws Exception {
		switchingTab(firstTab);
		se.clickBuyNowOne();
		System.out.println("product card BuyNow One is successfully verified in the Preprod URL");
		switchingTab(secondTab);
		se.clickBuyNowOne();
		System.out.println("product card BuyNow One is successfully verified in the Live URL");
	}
	
	@Test(priority = 17, enabled = true)
	private void verifyBuyNowTwo() throws Exception {
		switchingTab(firstTab);
		se.clickBuyNowTwo();
		System.out.println("product card BuyNow Two is successfully verified in the Preprod URL");
		switchingTab(secondTab);
		se.clickBuyNowTwo();
		System.out.println("product card BuyNow Two is successfully verified in the Live URL");
	}
	
	@Test(priority = 18, enabled = true)
	private void verifyBuyNowThree() throws Exception {
		switchingTab(firstTab);
		se.clickBuyNowThree();
		System.out.println("product card BuyNow Three is successfully verified in the Preprod URL");
		switchingTab(secondTab);
		se.clickBuyNowThree();
		System.out.println("product card BuyNow Three is successfully verified in the Live URL");
	}
	
	@Test(priority = 19, enabled = true)
	private void verifyBuyNowFour() throws Exception {
		switchingTab(firstTab);
		se.clickBuyNowFour();
		System.out.println("product card BuyNow Four is successfully verified in the Preprod URL");
		switchingTab(secondTab);
		se.clickBuyNowFour();
		System.out.println("product card BuyNow Four is successfully verified in the Live URL");
	}
	
	@Test(priority = 20, enabled = true)
	private void verifyCompareOne() throws Exception {
		switchingTab(firstTab);
		se.clickCompareOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		se.clickCompareOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product card compare one :"+compareTwoText);
	}
	
	@Test(priority = 21, enabled = true)
	private void verifyCompareTwo() throws Exception {
		switchingTab(firstTab);
		se.clickCompareTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		se.clickCompareTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product card compare Two :"+compareTwoText);
	}
	
	@Test(priority = 22, enabled = true)
	private void verifyCompareThree() throws Exception {
		switchingTab(firstTab);
		se.clickCompareThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		se.clickCompareThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product card compare Three :"+compareTwoText);
	}
	
	@Test(priority = 23, enabled = true)
	private void verifyCompareFour() throws Exception {
		switchingTab(firstTab);
		se.clickCompareFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		se.clickCompareFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product card compare Four :"+compareTwoText);
	}
	
	@Test(priority = 24)
	private void verifyBreadcrumbOne() throws Exception {
		switchingTab(firstTab);
		se.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		se.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One :"+compareTwoText);
	}
	
	@Test(priority = 25)
	private void verifyBreadcrumbTwo() throws Exception {
		switchingTab(firstTab);
		se.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		se.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two :"+compareTwoText);
	}
	
	@Test(priority = 26)
	private void verifyBreadcrumbThree() throws Exception {
		switchingTab(firstTab);
		se.clickBreadcrumbThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		se.clickBreadcrumbThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Three :"+compareTwoText);
	}
	
	@Test(priority = 27)
	private void verifyBreadcrumbFour() throws Exception {
		switchingTab(firstTab);
		se.clickBreadcrumbFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		se.clickBreadcrumbFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Four :"+compareTwoText);
	}
}
