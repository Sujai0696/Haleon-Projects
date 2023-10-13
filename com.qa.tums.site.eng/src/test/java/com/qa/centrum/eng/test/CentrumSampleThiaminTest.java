package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.centrum.eng.pages.CentrumThiaminPage;

public class CentrumSampleThiaminTest extends CentrumThiaminPage {
	
	CentrumThiaminPage th;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL("https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/learn/vitamins-minerals/thiamin/");
		switchingTab(secondTab);
		launchURL("https://www.centrum.com/learn/vitamins-minerals/thiamin/");
	}


	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		th = new CentrumThiaminPage();
		switchingTab(firstTab);
		th.clickCookieBtn();
		th.clickGigyaForm();
		System.out.println("Cookie Pop-up and Gigya form verified in the preprod URL");
		switchingTab(secondTab);
		th.clickCookieBtn();
		th.clickGigyaForm();
		System.out.println("Cookie Pop-up and Gigya form verified in the Live URL");
	}
	
	@Test(priority = 1, enabled = true)
	private void verifyEnergy() throws Exception {
		switchingTab(firstTab);
		th.clickEnergy();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickEnergy();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Energy :"+compareTwoText);
	}
	
	
	@Test(priority = 2, enabled = true)
	private void verifyArticleOne() throws Exception {
		switchingTab(firstTab);
		th.clickArticleOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickArticleOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article One :"+compareTwoText);
	}
	
	@Test(priority = 3, enabled = true)
	private void verifyArticleTwo() throws Exception {
		switchingTab(firstTab);
		th.clickArticleTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickArticleTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Two :"+compareTwoText);
	}
	
	
	@Test(priority = 4, enabled = true)
	private void verifyArticleThree() throws Exception {
		switchingTab(firstTab);
		th.clickArticleThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickArticleThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Three :"+compareTwoText);
	}
	
	@Test(priority = 5, enabled = true)
	private void verifyArticleFour() throws Exception {
		switchingTab(firstTab);
		th.clickArticleFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickArticleFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Four :"+compareTwoText);
	}
	
	@Test(priority = 6, enabled = true)
	private void verifyLearnMoreOne() throws Exception {
		switchingTab(firstTab);
		th.clickLearnMoreOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickLearnMoreOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Leran More One :"+compareTwoText);
	}
	
	@Test(priority = 7, enabled = true)
	private void verifyLearnMoreTwo() throws Exception {
		switchingTab(firstTab);
		th.clickLearnMoreTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickLearnMoreTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Leran More Two :"+compareTwoText);
	}
	
	@Test(priority = 8, enabled = true)
	private void verifyLearnMoreThree() throws Exception {
		switchingTab(firstTab);
		th.clickLearnMoreThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickLearnMoreThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Leran More Three :"+compareTwoText);
	}
	
	@Test(priority = 9, enabled = true)
	private void verifyLearnMoreFour() throws Exception {
		switchingTab(firstTab);
		th.clickLearnMoreFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickLearnMoreFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Leran More Four :"+compareTwoText);
	}
	
	@Test(priority = 10, enabled = true)
	private void verifyFeaturedProduct() throws Exception {
		switchingTab(firstTab);
		th.clickFeaturedProduct();
		System.out.println("Featured products successfully verified in Preprod URL");
		switchingTab(secondTab);
		th.clickFeaturedProduct();
		System.out.println("Featured products successfully verified in Live URL");
	}
	
	@Test(priority = 11, enabled = true)
	private void verifyProductAdultsFiftyPlus() throws Exception {
		switchingTab(firstTab);
		th.clickProductAdultsFiftyPlus();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickProductAdultsFiftyPlus();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Product card One :"+compareTwoText);
	}
	
	@Test(priority = 12, enabled = true)
	private void verifyProductAdults() throws Exception {
		switchingTab(firstTab);
		th.clickProductAdults();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickProductAdults();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Product card Two :"+compareTwoText);
	}
	
	@Test(priority = 13, enabled = true)
	private void verifyProductMen() throws Exception {
		switchingTab(firstTab);
		th.clickProductMen();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickProductMen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Product card Three :"+compareTwoText);
	}
	
	@Test(priority = 14, enabled = true)
	private void verifyProductWomen() throws Exception {
		switchingTab(firstTab);
		th.clickProductWomen();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickProductWomen();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Product card Four :"+compareTwoText);
	}
	
	@Test(priority = 15, enabled = true)
	private void verifyBuyNowOne() throws Exception {
		switchingTab(firstTab);
		th.clickBuyNowOne();
		System.out.println("product card BuyNow One is successfully verified in the Preprod URL");
		switchingTab(secondTab);
		th.clickBuyNowOne();
		System.out.println("product card BuyNow One is successfully verified in the Live URL");
	}
	
	@Test(priority = 16, enabled = true)
	private void verifyBuyNowTwo() throws Exception {
		switchingTab(firstTab);
		th.clickBuyNowTwo();
		System.out.println("product card BuyNow Two is successfully verified in the Preprod URL");
		switchingTab(secondTab);
		th.clickBuyNowTwo();
		System.out.println("product card BuyNow Two is successfully verified in the Live URL");
	}
	
	@Test(priority = 17, enabled = true)
	private void verifyBuyNowThree() throws Exception {
		switchingTab(firstTab);
		th.clickBuyNowThree();
		System.out.println("product card BuyNow Three is successfully verified in the Preprod URL");
		switchingTab(secondTab);
		th.clickBuyNowThree();
		System.out.println("product card BuyNow Three is successfully verified in the Live URL");
	}
	
	@Test(priority = 18, enabled = true)
	private void verifyBuyNowFour() throws Exception {
		switchingTab(firstTab);
		th.clickBuyNowFour();
		System.out.println("product card BuyNow Four is successfully verified in the Preprod URL");
		switchingTab(secondTab);
		th.clickBuyNowFour();
		System.out.println("product card BuyNow Four is successfully verified in the Live URL");
	}
	
	@Test(priority = 19, enabled = true)
	private void verifyCompareOne() throws Exception {
		switchingTab(firstTab);
		th.clickCompareOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickCompareOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product card compare one :"+compareTwoText);
	}
	
	@Test(priority = 20, enabled = true)
	private void verifyCompareTwo() throws Exception {
		switchingTab(firstTab);
		th.clickCompareTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickCompareTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product card compare Two :"+compareTwoText);
	}
	
	@Test(priority = 21, enabled = true)
	private void verifyCompareThree() throws Exception {
		switchingTab(firstTab);
		th.clickCompareThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickCompareThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product card compare Three :"+compareTwoText);
	}
	
	@Test(priority = 22, enabled = true)
	private void verifyCompareFour() throws Exception {
		switchingTab(firstTab);
		th.clickCompareFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickCompareFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product card compare Four :"+compareTwoText);
	}
	
	@Test(priority = 23)
	private void verifyBreadcrumbOne() throws Exception {
		switchingTab(firstTab);
		th.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One :"+compareTwoText);
	}
	
	@Test(priority = 24)
	private void verifyBreadcrumbTwo() throws Exception {
		switchingTab(firstTab);
		th.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two :"+compareTwoText);
	}
	
	@Test(priority = 25)
	private void verifyBreadcrumbThree() throws Exception {
		switchingTab(firstTab);
		th.clickBreadcrumbThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickBreadcrumbThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Three :"+compareTwoText);
	}
	
	@Test(priority = 26)
	private void verifyBreadcrumbFour() throws Exception {
		switchingTab(firstTab);
		th.clickBreadcrumbFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		th.clickBreadcrumbFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Four :"+compareTwoText);
	}	
	

}
