package com.qa.centrum.eng.test;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.centrum.eng.pages.CentrumVitaminB6Page;

public class CentrumSampleVitaminB6Test extends CentrumVitaminB6Page{

	CentrumVitaminB6Page vb;

	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL("https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/learn/vitamins-minerals/vitamin-b6/");
		switchingTab(secondTab);
		launchURL("https://www.centrum.com/learn/vitamins-minerals/vitamin-b6/");
	}


	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		vb = new CentrumVitaminB6Page();
		switchingTab(firstTab);
		vb.clickCookieBtn();
		vb.clickGigyaForm();
		System.out.println("Cookie Pop-up and Gigya form verified in the preprod URL");
		switchingTab(secondTab);
		vb.clickCookieBtn();
		vb.clickGigyaForm();
		System.out.println("Cookie Pop-up and Gigya form verified in the live URL");
	}

	
	@Test(priority = 1, enabled = true)
	private void verifyHeartHealth() throws Exception {
		switchingTab(firstTab);
		vb.clickHeartHealth();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickHeartHealth();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for heart health :"+compareTwoText);
	}
	
	@Test(priority = 2, enabled = true)
	private void verifyEnergy() throws Exception {
		switchingTab(firstTab);
		vb.clickEnergy();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickEnergy();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for energy :"+compareTwoText);
	}
	
	@Test(priority = 3, enabled = true)
	private void verifyBrainHealth() throws Exception {
		switchingTab(firstTab);
		vb.clickBrainHealth();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickBrainHealth();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Brain Health :"+compareTwoText);
	}
	
	@Test(priority = 4, enabled = true)
	private void verifyArticleOne() throws Exception {
		switchingTab(firstTab);
		vb.clickArticleOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickArticleOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article One :"+compareTwoText);
	}
	
	@Test(priority = 5, enabled = true)
	private void verifyArticleTwo() throws Exception {
		switchingTab(firstTab);
		vb.clickArticleTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickArticleTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Two :"+compareTwoText);
	}
	
	
	@Test(priority = 6, enabled = true)
	private void verifyArticleThree() throws Exception {
		switchingTab(firstTab);
		vb.clickArticleThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickArticleThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Three :"+compareTwoText);
	}
	
	@Test(priority = 7, enabled = true)
	private void verifyArticleFour() throws Exception {
		switchingTab(firstTab);
		vb.clickArticleFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickArticleFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Four :"+compareTwoText);
	}
	
	@Test(priority = 8, enabled = true)
	private void verifyLearnMoreOne() throws Exception {
		switchingTab(firstTab);
		vb.clickLearnMoreOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickLearnMoreOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More One :"+compareTwoText);
	}
	
	@Test(priority = 9, enabled = true)
	private void verifyLearnMoreTwo() throws Exception {
		switchingTab(firstTab);
		vb.clickLearnMoreTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickLearnMoreTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More Two :"+compareTwoText);
	}
	
	@Test(priority = 10, enabled = true)
	private void verifyLearnMoreThree() throws Exception {
		switchingTab(firstTab);
		vb.clickLearnMoreThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickLearnMoreThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More Three :"+compareTwoText);
	}
	
	@Test(priority = 11, enabled = true)
	private void verifyLearnMoreFour() throws Exception {
		switchingTab(firstTab);
		vb.clickLearnMoreFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickLearnMoreFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More Four :"+compareTwoText);
	}
	
	@Test(priority = 12, enabled = true)
	private void verifyFeaturedProduct() throws Exception {
		switchingTab(firstTab);
		vb.clickFeaturedProduct();
		System.out.println("Featured products successfully verified in Preprod URL");
		switchingTab(secondTab);
		vb.clickFeaturedProduct();
		System.out.println("Featured products successfully verified in Live URL");
	}

	@Test(priority = 13, enabled = true)
	private void verifyProductMen() throws Exception {
		switchingTab(firstTab);
		vb.clickProductMen();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickProductMen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Product card One :"+compareTwoText);
	}
	
	@Test(priority = 14, enabled = true)
	private void verifyProductMultiGummiesMen() throws Exception {
		switchingTab(firstTab);
		vb.clickProductMultiGummiesMen();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickProductMultiGummiesMen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Product card two :"+compareTwoText);
	}
	
	@Test(priority = 15, enabled = true)
	private void verifyProductSilverWomen() throws Exception {
		switchingTab(firstTab);
		vb.clickProductSilverWomen();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickProductSilverWomen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Product card Three :"+compareTwoText);
	}
	
	@Test(priority = 16, enabled = true)
	private void verifyProductWomensMultivitamin() throws Exception {
		switchingTab(firstTab);
		vb.clickProductWomensMultivitamin();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickProductWomensMultivitamin();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Product card Four :"+compareTwoText);
	}
	
	@Test(priority = 17, enabled = true)
	private void verifyBuyNowOne() throws Exception {
		switchingTab(firstTab);
		vb.clickBuyNowOne();
		System.out.println("product card BuyNow One is successfully verified in the Preprod URL");
		switchingTab(secondTab);
		vb.clickBuyNowOne();
		System.out.println("product card BuyNow One is successfully verified in the Live URL");
	}
	
	@Test(priority = 18, enabled = true)
	private void verifyBuyNowTwo() throws Exception {
		switchingTab(firstTab);
		vb.clickBuyNowTwo();
		System.out.println("product card BuyNow Two is successfully verified in the Preprod URL");
		switchingTab(secondTab);
		vb.clickBuyNowTwo();
		System.out.println("product card BuyNow Two is successfully verified in the Live URL");
	}
	
	@Test(priority = 19, enabled = true)
	private void verifyBuyNowThree() throws Exception {
		switchingTab(firstTab);
		vb.clickBuyNowThree();
		System.out.println("product card BuyNow Three is successfully verified in the Preprod URL");
		switchingTab(secondTab);
		vb.clickBuyNowThree();
		System.out.println("product card BuyNow Three is successfully verified in the Live URL");
	}
	
	@Test(priority = 20, enabled = true)
	private void verifyBuyNowFour() throws Exception {
		switchingTab(firstTab);
		vb.clickBuyNowFour();
		System.out.println("product card BuyNow Four is successfully verified in the Preprod URL");
		switchingTab(secondTab);
		vb.clickBuyNowFour();
		System.out.println("product card BuyNow Four is successfully verified in the Live URL");
	}
	
	@Test(priority = 21, enabled = true)
	private void verifyCompareOne() throws Exception {
		switchingTab(firstTab);
		vb.clickCompareOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickCompareOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product card compare one :"+compareTwoText);
	}
	
	@Test(priority = 22, enabled = true)
	private void verifyCompareTwo() throws Exception {
		switchingTab(firstTab);
		vb.clickCompareTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickCompareTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product card compare Two :"+compareTwoText);
	}
	
	@Test(priority = 23, enabled = true)
	private void verifyCompareThree() throws Exception {
		switchingTab(firstTab);
		vb.clickCompareThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickCompareThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product card compare Three :"+compareTwoText);
	}
	
	@Test(priority = 24, enabled = true)
	private void verifyCompareFour() throws Exception {
		switchingTab(firstTab);
		vb.clickCompareFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickCompareFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product card compare Four :"+compareTwoText);
	}
	
	@Test(priority = 25)
	private void verifyBreadcrumbOne() throws Exception {
		switchingTab(firstTab);
		vb.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One :"+compareTwoText);
	}
	
	@Test(priority = 26)
	private void verifyBreadcrumbTwo() throws Exception {
		switchingTab(firstTab);
		vb.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two :"+compareTwoText);
	}
	
	@Test(priority = 27)
	private void verifyBreadcrumbThree() throws Exception {
		switchingTab(firstTab);
		vb.clickBreadcrumbThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickBreadcrumbThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Three :"+compareTwoText);
	}
	
	@Test(priority = 28)
	private void verifyBreadcrumbFour() throws Exception {
		switchingTab(firstTab);
		vb.clickBreadcrumbFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vb.clickBreadcrumbFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Four :"+compareTwoText);
	}


}
