package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.CentrumCopperPage;

public class CentrumSampleCooperTest  extends BaseClass{
	
	CentrumCopperPage cu;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL("https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/learn/vitamins-minerals/copper/");
		switchingTab(secondTab);
		launchURL("https://www.centrum.com/learn/vitamins-minerals/copper/");
	}


	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		cu = new CentrumCopperPage();
		switchingTab(firstTab);
		cu.clickCookieBtn();
		cu.clickGigyaForm();
		System.out.println("Cookie Pop-up and Gigya form verified in the preprod URL");
		switchingTab(secondTab);
		cu.clickCookieBtn();
		cu.clickGigyaForm();
		System.out.println("Cookie Pop-up and Gigya form verified in the live URL");
	}
	
	@Test(priority = 1, enabled = true)
	private void verifyEnergy() throws Exception {
		switchingTab(firstTab);
		cu.clickEnergy();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickEnergy();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Energy :"+compareTwoText);
	}
	
	@Test(priority = 2, enabled = true)
	private void verifyArticleOne() throws Exception {
		switchingTab(firstTab);
		cu.clickArticleOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickArticleOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article one :"+compareTwoText);
	}
	
	@Test(priority = 3, enabled = true)
	private void verifyArticleTwo() throws Exception {
		switchingTab(firstTab);
		cu.clickArticleTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickArticleTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article two :"+compareTwoText);
	}
	
	
	@Test(priority = 4, enabled = true)
	private void verifyArticleThree() throws Exception {
		switchingTab(firstTab);
		cu.clickArticleThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickArticleThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Three :"+compareTwoText);
	}
	
	@Test(priority = 5, enabled = true)
	private void verifyArticleFour() throws Exception {
		switchingTab(firstTab);
		cu.clickArticleFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickArticleFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Four :"+compareTwoText);
	}
	
	@Test(priority = 6, enabled = true)
	private void verifyLearnMoreOne() throws Exception {
		switchingTab(firstTab);
		cu.clickLearnMoreOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickLearnMoreOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More One :"+compareTwoText);
	}
	
	@Test(priority = 7, enabled = true)
	private void verifyLearnMoreTwo() throws Exception {
		switchingTab(firstTab);
		cu.clickLearnMoreTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickLearnMoreTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More Two :"+compareTwoText);
	}
	
	@Test(priority = 8, enabled = true)
	private void verifyLearnMoreThree() throws Exception {
		switchingTab(firstTab);
		cu.clickLearnMoreThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickLearnMoreThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More Three :"+compareTwoText);
	}
	
	@Test(priority = 9, enabled = true)
	private void verifyLearnMoreFour() throws Exception {
		switchingTab(firstTab);
		cu.clickLearnMoreFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickLearnMoreFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More Four :"+compareTwoText);
	}
	
	@Test(priority = 10, enabled = true)
	private void verifyFeaturedProduct() throws Exception {
		switchingTab(firstTab);
		cu.clickFeaturedProduct();
		System.out.println("Featured products successfully verified in Preprod URL");
		switchingTab(secondTab);
		cu.clickFeaturedProduct();
		System.out.println("Featured products successfully verified in Live URL");
	}
	
	@Test(priority = 11, enabled = true)
	private void verifyProductMen() throws Exception {
		switchingTab(firstTab);
		cu.clickProductMen();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickProductMen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Product card One :"+compareTwoText);
	}
	
	@Test(priority = 12, enabled = true)
	private void verifyProductWomen() throws Exception {
		switchingTab(firstTab);
		cu.clickProductWomen();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickProductWomen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same Product card Two :"+compareTwoText);
	}
	
	@Test(priority = 13, enabled = true)
	private void verifyProductSilverMen() throws Exception {
		switchingTab(firstTab);
		cu.clickProductSilverMen();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickProductSilverMen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same Product card Three :"+compareTwoText);
	}
	
	@Test(priority = 14, enabled = true)
	private void verifyProductSilverWomen() throws Exception {
		switchingTab(firstTab);
		cu.clickProductSilverWomen();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickProductSilverWomen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same Product card Four :"+compareTwoText);
	}
	
	@Test(priority = 15, enabled = true)
	private void verifyBuyNowOne() throws Exception {
		switchingTab(firstTab);
		cu.clickBuyNowOne();
		System.out.println("product card BuyNow One is successfully verified in the Preprod URL");
		switchingTab(secondTab);
		cu.clickBuyNowOne();
		System.out.println("product card BuyNow One is successfully verified in the Live URL");
	}
	
	@Test(priority = 16, enabled = true)
	private void verifyBuyNowTwo() throws Exception {
		switchingTab(firstTab);
		cu.clickBuyNowTwo();
		System.out.println("product card BuyNow Two is successfully verified in the Preprod URL");
		switchingTab(secondTab);
		cu.clickBuyNowTwo();
		System.out.println("product card BuyNow Two is successfully verified in the Live URL");
	}
	
	@Test(priority = 17, enabled = true)
	private void verifyBuyNowThree() throws Exception {
		switchingTab(firstTab);
		cu.clickBuyNowThree();
		System.out.println("product card BuyNow Three is successfully verified in the Preprod URL");
		switchingTab(secondTab);
		cu.clickBuyNowThree();
		System.out.println("product card BuyNow Three is successfully verified in the Live URL");
	}
	
	@Test(priority = 18, enabled = true)
	private void verifyBuyNowFour() throws Exception {
		switchingTab(firstTab);
		cu.clickBuyNowFour();
		System.out.println("product card BuyNow Four is successfully verified in the Preprod URL");
		switchingTab(secondTab);
		cu.clickBuyNowFour();
		System.out.println("product card BuyNow Four is successfully verified in the Live URL");
	}
	
	@Test(priority = 19, enabled = true)
	private void verifyCompareOne() throws Exception {
		switchingTab(firstTab);
		cu.clickCompareOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickCompareOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product card compare one :"+compareTwoText);
	}
	
	@Test(priority = 20, enabled = true)
	private void verifyCompareTwo() throws Exception {
		switchingTab(firstTab);
		cu.clickCompareTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickCompareTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product card compare Two :"+compareTwoText);
	}
	
	@Test(priority = 21, enabled = true)
	private void verifyCompareThree() throws Exception {
		switchingTab(firstTab);
		cu.clickCompareThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickCompareThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product card compare Three :"+compareTwoText);
	}
	
	@Test(priority = 22, enabled = true)
	private void verifyCompareFour() throws Exception {
		switchingTab(firstTab);
		cu.clickCompareFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickCompareFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product card compare Four :"+compareTwoText);
	}
	
	@Test(priority = 23)
	private void verifyBreadcrumbOne() throws Exception {
		switchingTab(firstTab);
		cu.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One :"+compareTwoText);
	}
	
	@Test(priority = 24)
	private void verifyBreadcrumbTwo() throws Exception {
		switchingTab(firstTab);
		cu.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two :"+compareTwoText);
	}
	
	@Test(priority = 25)
	private void verifyBreadcrumbThree() throws Exception {
		switchingTab(firstTab);
		cu.clickBreadcrumbThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickBreadcrumbThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Three :"+compareTwoText);
	}
	
	@Test(priority = 26)
	private void verifyBreadcrumbFour() throws Exception {
		switchingTab(firstTab);
		cu.clickBreadcrumbFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		cu.clickBreadcrumbFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Four :"+compareTwoText);
	}
	
	
}
