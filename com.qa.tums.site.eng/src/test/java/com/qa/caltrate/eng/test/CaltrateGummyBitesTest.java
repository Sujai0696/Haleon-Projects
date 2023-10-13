package com.qa.caltrate.eng.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.eng.pages.CaltrateGummyBites;

public class CaltrateGummyBitesTest extends BaseClass{
	CaltrateGummyBites cgb;
	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadConfig("CaltrateConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		cgb = new CaltrateGummyBites();
		switchingTab(firstTab);
		launchURL(loadConfig("CaltrateConfig.properties").getProperty("CaltrateGummyBitesPreprodURL"));
		switchingTab(secondTab);
		launchURL(loadConfig("CaltrateConfig.properties").getProperty("CaltrateGummyBitesLiveURL"));

	}

	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Throwable {
		cgb = new CaltrateGummyBites();
		switchingTab(firstTab);
		cgb.clickOnCookies();
		System.out.println("Cookie Button clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		cgb.clickOnCookies();
		System.out.println("Cookie Button clicked successfully in the Live URL");
	}
	@Test(priority = 2, enabled = true)
	private void verifyHomeIcon() throws Throwable {
		//tnr = new CaltrateNaturalRemediesForHeartburn();
		switchingTab(firstTab);
		cgb.clickOnHomeIcon();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cgb.clickOnHomeIcon();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 3, enabled = true)
	private void verifyBread_Products() throws Throwable {
		switchingTab(firstTab);
		cgb.clickOnBread_Products();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cgb.clickOnBread_Products();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 4, enabled = true)
	private void verifyBuyNowButton() throws Throwable {
		switchingTab(firstTab);
		cgb.clickOnBuyNowButton();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cgb.clickOnBuyNowButton();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 5, enabled = true)
	private void verifyGetCouponButton() throws Throwable {
		switchingTab(firstTab);
		cgb.clickOnGetCouponButton();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cgb.clickOnGetCouponButton();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 6, enabled = true)
	private void verifyProductLabeling() throws Throwable {
		switchingTab(firstTab);
		cgb.clickOnProductLabeling();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cgb.clickOnProductLabeling();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 7, enabled = true)
	private void verifyFirstProduct() throws Throwable {
		switchingTab(firstTab);
		cgb.clickOnFirstProduct();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cgb.clickOnFirstProduct();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 8, enabled = true)
	private void verifySecondProduct() throws Throwable {
		switchingTab(firstTab);
		cgb.clickOnSecondProduct();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cgb.clickOnSecondProduct();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 9, enabled = true)
	private void verifyThirdProduct() throws Throwable {
		switchingTab(firstTab);
		cgb.clickOnThirdProduct();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cgb.clickOnThirdProduct();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 10, enabled = true)
	private void verifyFourthProduct() throws Throwable {
		switchingTab(firstTab);
		cgb.clickOnFourthProduct();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cgb.clickOnFourthProduct();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 11, enabled = true)
	private void verifyFifthProduct() throws Throwable {
		switchingTab(firstTab);
		cgb.clickOnFifthProduct();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cgb.clickOnFifthProduct();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 12, enabled = true)
	private void verifyFirstProductImage() throws Throwable {
		switchingTab(firstTab);
		cgb.clickOnFirstProductImage();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cgb.clickOnFirstProductImage();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 13, enabled = true)
	private void verifySecondProductImage() throws Throwable {
		switchingTab(firstTab);
		cgb.clickOnSecondProductImage();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cgb.clickOnSecondProductImage();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 14, enabled = true)
	private void verifyThirdProductImage() throws Throwable {
		switchingTab(firstTab);
		cgb.clickOnThirdProductImage();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cgb.clickOnThirdProductImage();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 15, enabled = true)
	private void verifyFourthProductImage() throws Throwable {
		switchingTab(firstTab);
		cgb.clickOnFourthProductImage();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cgb.clickOnFourthProductImage();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 16, enabled = true)
	private void verifyFifthProductImage() throws Throwable {
		switchingTab(firstTab);
		cgb.clickOnFifthProductImage();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cgb.clickOnFifthProductImage();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 17, enabled = true)
	private void verifyViewAllProduct() throws Throwable {
		switchingTab(firstTab);
		cgb.clickOnViewAllProduct();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cgb.clickOnViewAllProduct();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 18, enabled = true)
	private void verifyReadMore() throws Throwable {
		switchingTab(firstTab);
		cgb.clickOnReadMore();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cgb.clickOnReadMore();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

}
