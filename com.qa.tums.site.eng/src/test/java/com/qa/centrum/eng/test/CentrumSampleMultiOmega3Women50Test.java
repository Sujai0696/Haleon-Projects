package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.CentrumMultiOmega3Women50Page;

public class CentrumSampleMultiOmega3Women50Test extends BaseClass{
	
	CentrumMultiOmega3Women50Page ow;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL("https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/products/multivitamins/centrum-multi-omega-3-women-50/");
		switchingTab(secondTab);
		launchURL("https://www.centrum.com/products/multivitamins/centrum-multi-omega-3-women-50/");
	}


	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		ow = new CentrumMultiOmega3Women50Page();
		switchingTab(firstTab);
		ow.clickCookieBtn();
		ow.clickGigyaForm();
		System.out.println("Cookie Pop-up and Gigya form verified in the preprod URL");
		switchingTab(secondTab);
		ow.clickCookieBtn();
		ow.clickGigyaForm();
		System.out.println("Cookie Pop-up and Gigya form verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyWriteAReviewBtn() throws Exception {
		switchingTab(firstTab);
		ow.clickWriteAReviewBtn();
		System.out.println("Review Buttom verified in the PREPROD URL");
		switchingTab(secondTab);
		ow.clickWriteAReviewBtn();
		System.out.println("Review Buttom verified in the LIVE URL");
	}
	
	@Test(priority = 2)
	private void verifyBuyNowBtn() throws Exception{
		switchingTab(firstTab);
		ow.clickBuyNowBtn();
		System.out.println("Buy Now Buttom verified in the PREPROD URL");
		switchingTab(secondTab);
		ow.clickBuyNowBtn();
		System.out.println("Buy Now Buttom verified in the LIVE URL");
	}
	
	@Test(priority = 3)
	private void verifyGetCoupons() throws Exception{
		switchingTab(firstTab);
		ow.clickGetCoupons();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ow.clickGetCoupons();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Get Coupons :"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyVitaminAndMinerals() throws Exception{
		switchingTab(firstTab);
		ow.clickVitaminAndMinerals();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ow.clickVitaminAndMinerals();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for vitamins and minerals :"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyUsage() throws Exception{
		switchingTab(firstTab);
		ow.clickUsage();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ow.clickUsage();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Usage :"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyFAQ() throws Exception{
		switchingTab(firstTab);
		ow.clickFAQ();
		System.out.println("FAQs verified in Preprod URL");
		switchingTab(secondTab);
		ow.clickFAQ();
		System.out.println("FAQs verified in Live URL");
	}
	
	@Test(priority = 7)
	private void verifyProductBenefits() throws Exception{
		switchingTab(firstTab);
		ow.clickProductBenefits();
		System.out.println("Product Benefits verified in Preprod URL");
		switchingTab(secondTab);
		ow.clickProductBenefits();
		System.out.println("Product Benefits verified in Live URL");
	}	
	@Test(priority = 8)
	private void verifyCompareTab()throws Exception {
		switchingTab(firstTab);
		ow.clickCompareTab();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ow.clickCompareTab();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for compare tab:"+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyCompareButton()throws Exception {
		switchingTab(firstTab);
		ow.clickCompareButton();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ow.clickCompareButton();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same compare button :"+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyRelatedProductOne()throws Exception {
		switchingTab(firstTab);
		ow.clickRelatedProductOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ow.clickRelatedProductOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product One :"+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyRelatedProductTwo()throws Exception {
		switchingTab(firstTab);
		ow.clickRelatedProductTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ow.clickRelatedProductTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product Two :"+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyRelatedProductThree()throws Exception {
		switchingTab(firstTab);
		ow.clickRelatedProductThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ow.clickRelatedProductThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product Three:"+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyRelatedProductFour()throws Exception {
		switchingTab(firstTab);
		ow.clickRelatedProductFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ow.clickRelatedProductFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product Four :"+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyBuyNowOne() throws Exception {
		switchingTab(firstTab);
		ow.clickBuyNowOne();
		System.out.println("Buy Now One is verified in the PreProd Url");
		switchingTab(secondTab);
		ow.clickBuyNowOne();
		System.out.println("Buy Now One is verified in the Live Url");
	}
	
	@Test(priority = 15)
	private void verifyBuyNowTwo() throws Exception {
		switchingTab(firstTab);
		ow.clickBuyNowTwo();
		System.out.println("Buy Now Two is verified in the PreProd Url");
		switchingTab(secondTab);
		ow.clickBuyNowTwo();
		System.out.println("Buy Now Two is verified in the Live Url");
	}
	
	@Test(priority = 16)
	private void verifyBuyNowThree() throws Exception {
		switchingTab(firstTab);
		ow.clickBuyNowThree();
		System.out.println("Buy Now Three is verified in the PreProd Url");
		switchingTab(secondTab);
		ow.clickBuyNowThree();
		System.out.println("Buy Now Three is verified in the Live Url");
	}
	
	@Test(priority = 17)
	private void verifyBuyNowFour() throws Exception {
		switchingTab(firstTab);
		ow.clickBuyNowFour();
		System.out.println("Buy Now Four is verified in the PreProd Url");
		switchingTab(secondTab);
		ow.clickBuyNowFour();
		System.out.println("Buy Now Four is verified in the Live Url");
	}
	
	@Test(priority = 18)
	private void verifyCompareOne() throws Exception{
		switchingTab(firstTab);
		ow.clickCompareOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ow.clickCompareOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product compare One :"+compareTwoText);
	}
	
	@Test(priority = 19)
	private void verifyCompareTwo() throws Exception{
		switchingTab(firstTab);
		ow.clickCompareTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ow.clickCompareTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product compare Two :"+compareTwoText);
	}
	
	@Test(priority = 20)
	private void verifyCompareThree() throws Exception{
		switchingTab(firstTab);
		ow.clickCompareThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ow.clickCompareThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product compare Three :"+compareTwoText);
	}
	
	@Test(priority = 21)
	private void verifyCompareFour() throws Exception{
		switchingTab(firstTab);
		ow.clickCompareFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ow.clickCompareFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product compare Four :"+compareTwoText);
	}
	
	@Test(priority = 22)
	private void verifyBrowseOne() throws Exception{
		switchingTab(firstTab);
		ow.clickBrowseLinkOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ow.clickBrowseLinkOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Browse One :"+compareTwoText);
	}
	
	@Test(priority = 23)
	private void verifyBrowseTwo() throws Exception{
		switchingTab(firstTab);
		ow.clickBrowseLinkTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ow.clickBrowseLinkTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Browse Two :"+compareTwoText);
	}
	
	@Test(priority = 24)
	private void verifyBrowseThree() throws Exception{
		switchingTab(firstTab);
		ow.clickBrowseLinkThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ow.clickBrowseLinkThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Browse Three :"+compareTwoText);
	}
	
	@Test(priority = 25)
	private void verifyBrowseFour() throws Exception{
		switchingTab(firstTab);
		ow.clickBrowseLinkFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ow.clickBrowseLinkFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Browse Four :"+compareTwoText);
	}
	
	@Test(priority = 26)
	private void verifyBreadcrumbOne() throws Exception {
		switchingTab(firstTab);
		ow.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ow.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		if (preProdUrl.contains(liveUrl)) {
			throw new Exception("Preprod breadcrumb home is redirecting to live url");
		} else {
			System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One :"+compareTwoText);
		}
	}
	
	@Test(priority = 27)
	private void verifyBreadcrumbTwo() throws Exception {
		switchingTab(firstTab);
		ow.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ow.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two :"+compareTwoText);
	}
	
	@Test(priority = 28)
	private void verifyBreadcrumbThree() throws Exception {
		switchingTab(firstTab);
		ow.clickBreadcrumbThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ow.clickBreadcrumbThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Three :"+compareTwoText);
	}
	
	@Test(priority = 29)
	private void verifyBreadcrumbFour() throws Exception {
		switchingTab(firstTab);
		ow.clickBreadcrumbFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		ow.clickBreadcrumbFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Four :"+compareTwoText);
	}

}
