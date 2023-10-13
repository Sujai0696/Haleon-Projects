package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.CentrumIodinePage;

public class CentrumSampleIodineTest extends BaseClass{
	
	CentrumIodinePage io;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL("https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/learn/vitamins-minerals/iodine/");
		switchingTab(secondTab);
		launchURL("https://www.centrum.com/learn/vitamins-minerals/iodine/");
	}


	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		io = new CentrumIodinePage();
		switchingTab(firstTab);
		io.clickCookieBtn();
		io.clickGigyaForm();
		System.out.println("Cookie Pop-up and Gigya form verified in the preprod URL");
		switchingTab(secondTab);
		io.clickCookieBtn();
		io.clickGigyaForm();
		System.out.println("Cookie Pop-up and Gigya form verified in the live URL");
	}
	
	@Test(priority = 1, enabled = true)
	private void verifyBrainHealth() throws Exception {
		switchingTab(firstTab);
		io.clickEnergy();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		io.clickEnergy();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Brain Health :"+compareTwoText);
	}
	
	@Test(priority = 2, enabled = true)
	private void verifyPregnancy() throws Exception {
		switchingTab(firstTab);
		io.clickPregnancy();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		io.clickPregnancy();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Pregnancy :"+compareTwoText);
	}
	
	@Test(priority = 3, enabled = true)
	private void verifyArticleOne() throws Exception {
		switchingTab(firstTab);
		io.clickArticleOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		io.clickArticleOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article One :"+compareTwoText);
	}
	
	@Test(priority = 4, enabled = true)
	private void verifyArticleTwo() throws Exception {
		switchingTab(firstTab);
		io.clickArticleTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		io.clickArticleTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Two :"+compareTwoText);
	}
	
	
	@Test(priority = 5, enabled = true)
	private void verifyArticleThree() throws Exception {
		switchingTab(firstTab);
		io.clickArticleThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		io.clickArticleThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Three :"+compareTwoText);
	}
	
	@Test(priority = 6, enabled = true)
	private void verifyArticleFour() throws Exception {
		switchingTab(firstTab);
		io.clickArticleFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		io.clickArticleFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Four :"+compareTwoText);
	}
	
	@Test(priority = 7, enabled = true)
	private void verifyLearnMoreOne() throws Exception {
		switchingTab(firstTab);
		io.clickLearnMoreOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		io.clickLearnMoreOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More One :"+compareTwoText);
	}
	
	@Test(priority = 8, enabled = true)
	private void verifyLearnMoreTwo() throws Exception {
		switchingTab(firstTab);
		io.clickLearnMoreTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		io.clickLearnMoreTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More Two :"+compareTwoText);
	}
	
	@Test(priority = 9, enabled = true)
	private void verifyLearnMoreThree() throws Exception {
		switchingTab(firstTab);
		io.clickLearnMoreThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		io.clickLearnMoreThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More Three :"+compareTwoText);
	}
	
	@Test(priority = 10, enabled = true)
	private void verifyLearnMoreFour() throws Exception {
		switchingTab(firstTab);
		io.clickLearnMoreFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		io.clickLearnMoreFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More Four :"+compareTwoText);
	}
	
	@Test(priority = 11, enabled = true)
	private void verifyFeaturedProduct() throws Exception {
		switchingTab(firstTab);
		io.clickFeaturedProduct();
		System.out.println("Featured products successfully verified in Preprod URL");
		switchingTab(secondTab);
		io.clickFeaturedProduct();
		System.out.println("Featured products successfully verified in Live URL");
	}
	@Test(priority = 12, enabled = true)
	private void verifyProductAdults() throws Exception {
		switchingTab(firstTab);
		io.clickProductAdults();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		io.clickProductAdults();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Product card One :"+compareTwoText);
	}
	
	@Test(priority = 13, enabled = true)
	private void verifyProductMen() throws Exception {
		switchingTab(firstTab);
		io.clickProductMen();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		io.clickProductMen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Product card Two:"+compareTwoText);
	}
	
	@Test(priority = 14, enabled = true)
	private void verifyProductWomen() throws Exception {
		switchingTab(firstTab);
		io.clickProductWomen();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		io.clickProductWomen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Product card Three :"+compareTwoText);
	}
	
	@Test(priority = 15, enabled = true)
	private void verifyProductWomensMultivitamin() throws Exception {
		switchingTab(firstTab);
		io.clickProductWomensMultivitamin();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		io.clickProductWomensMultivitamin();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Product card Four :"+compareTwoText);
	}
	
	@Test(priority = 16, enabled = true)
	private void verifyBuyNowOne() throws Exception {
		switchingTab(firstTab);
		io.clickBuyNowOne();
		System.out.println("product card BuyNow One is successfully verified in the Preprod URL");
		switchingTab(secondTab);
		io.clickBuyNowOne();
		System.out.println("product card BuyNow One is successfully verified in the Live URL");
	}
	
	@Test(priority = 17, enabled = true)
	private void verifyBuyNowTwo() throws Exception {
		switchingTab(firstTab);
		io.clickBuyNowTwo();
		System.out.println("product card BuyNow Two is successfully verified in the Preprod URL");
		switchingTab(secondTab);
		io.clickBuyNowTwo();
		System.out.println("product card BuyNow Two is successfully verified in the Live URL");
	}
	
	@Test(priority = 18, enabled = true)
	private void verifyBuyNowThree() throws Exception {
		switchingTab(firstTab);
		io.clickBuyNowThree();
		System.out.println("product card BuyNow Three is successfully verified in the Preprod URL");
		switchingTab(secondTab);
		io.clickBuyNowThree();
		System.out.println("product card BuyNow Three is successfully verified in the Live URL");
	}
	
	@Test(priority = 19, enabled = true)
	private void verifyBuyNowFour() throws Exception {
		switchingTab(firstTab);
		io.clickBuyNowFour();
		System.out.println("product card BuyNow Four is successfully verified in the Preprod URL");
		switchingTab(secondTab);
		io.clickBuyNowFour();
		System.out.println("product card BuyNow Four is successfully verified in the Live URL");
	}
	
	@Test(priority = 20, enabled = true)
	private void verifyCompareOne() throws Exception {
		switchingTab(firstTab);
		io.clickCompareOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		io.clickCompareOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product card compare one :"+compareTwoText);
	}
	
	@Test(priority = 21, enabled = true)
	private void verifyCompareTwo() throws Exception {
		switchingTab(firstTab);
		io.clickCompareTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		io.clickCompareTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product card compare Two :"+compareTwoText);
	}
	
	@Test(priority = 22, enabled = true)
	private void verifyCompareThree() throws Exception {
		switchingTab(firstTab);
		io.clickCompareThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		io.clickCompareThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product card compare Three :"+compareTwoText);
	}
	
	@Test(priority = 23, enabled = true)
	private void verifyCompareFour() throws Exception {
		switchingTab(firstTab);
		io.clickCompareFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		io.clickCompareFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product card compare Four :"+compareTwoText);
	}
	
	@Test(priority = 24)
	private void verifyBreadcrumbOne() throws Exception {
		switchingTab(firstTab);
		io.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		io.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One :"+compareTwoText);
	}
	
	@Test(priority = 25)
	private void verifyBreadcrumbTwo() throws Exception {
		switchingTab(firstTab);
		io.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		io.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two :"+compareTwoText);
	}
	
	@Test(priority = 26)
	private void verifyBreadcrumbThree() throws Exception {
		switchingTab(firstTab);
		io.clickBreadcrumbThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		io.clickBreadcrumbThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Three :"+compareTwoText);
	}
	
	@Test(priority = 27)
	private void verifyBreadcrumbFour() throws Exception {
		switchingTab(firstTab);
		io.clickBreadcrumbFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		io.clickBreadcrumbFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Four :"+compareTwoText);
	}

}
