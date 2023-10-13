package com.qa.sensodyne.ca.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.ca.pages.SensodyneCaWhiterTeethProductsPage;

public class SensodyneCaWhiterTeethProductsTest extends BaseClass{
	
	SensodyneCaWhiterTeethProductsPage wtp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyne_caConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		wtp = new	SensodyneCaWhiterTeethProductsPage();
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyne_caConfig.properties").getProperty("whiterTeethProductsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyne_caConfig.properties").getProperty("whiterTeethProductsLiveUrl"));
	}
	
	@Test(priority = 1)
	private void verifyProductTextOne() throws Exception{
		switchingTab(firstTab);
		wtp.clickProductTextOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		wtp.clickProductTextOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Text One:"+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyProductImgOne() throws Exception{
		switchingTab(firstTab);
		wtp.clickProductImgOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		wtp.clickProductImgOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Img One:"+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyProductBuyNowOne() throws Exception{
		switchingTab(firstTab);
		wtp.clickProductBuyNowOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		wtp.clickProductBuyNowOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products BuyNow One:"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyProductTextTwo() throws Exception{
		switchingTab(firstTab);
		wtp.clickProductTextTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		wtp.clickProductTextTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Text Two:"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyProductImgTwo() throws Exception{
		switchingTab(firstTab);
		wtp.clickProductImgTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		wtp.clickProductImgTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Img Two:"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyProductBuyNowTwo() throws Exception{
		switchingTab(firstTab);
		wtp.clickProductBuyNowTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		wtp.clickProductBuyNowTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products BuyNow Two:"+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyProductTextThree() throws Exception{
		switchingTab(firstTab);
		wtp.clickProductTextThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		wtp.clickProductTextThree();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Text Three:"+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyProductImgThree() throws Exception{
		switchingTab(firstTab);
		wtp.clickProductImgThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		wtp.clickProductImgThree();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Img Three:"+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyProductBuyNowThree() throws Exception{
		switchingTab(firstTab);
		wtp.clickProductBuyNowThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		wtp.clickProductBuyNowThree();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products BuyNow Three:"+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyProductTextFour() throws Exception{
		switchingTab(firstTab);
		wtp.clickProductTextFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		wtp.clickProductTextFour();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Text Four:"+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyProductImgFour() throws Exception{
		switchingTab(firstTab);
		wtp.clickProductImgFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		wtp.clickProductImgFour();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Img Four:"+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyProductBuyNowFour() throws Exception{
		switchingTab(firstTab);
		wtp.clickProductBuyNowFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		wtp.clickProductBuyNowFour();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products BuyNow Four:"+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyProductTextFive() throws Exception{
		switchingTab(firstTab);
		wtp.clickProductTextFive();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		wtp.clickProductTextFive();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Text Five:"+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyProductImgFive() throws Exception{
		switchingTab(firstTab);
		wtp.clickProductImgFive();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		wtp.clickProductImgFive();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Img Five:"+compareTwoText);
	}
	
	@Test(priority = 15)
	private void verifyProductBuyNowFive() throws Exception{
		switchingTab(firstTab);
		wtp.clickProductBuyNowFive();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		wtp.clickProductBuyNowFive();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products BuyNow Five:"+compareTwoText);
	}
	
	@Test(priority = 16)
	private void verifyHyperLinkFreshenBreath() throws Exception{
		switchingTab(firstTab);
		wtp.clickHyperLinkFreshenBreath();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		wtp.clickHyperLinkFreshenBreath();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Freshen Breath:"+compareTwoText);
	}
	
	@Test(priority = 17)
	private void verifyHyperLinkReparingSensitiveTeeth() throws Exception{
		switchingTab(firstTab);
		wtp.clickHyperLinkReparingSensitiveTeeth();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		wtp.clickHyperLinkReparingSensitiveTeeth();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Reparing Sensitive Teeth:"+compareTwoText);
	}
	
	
	
	@Test(priority = 18)
	private void verifyFindYourStore() throws Exception{
		switchingTab(firstTab);
		wtp.clickFindYourStore();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		wtp.clickFindYourStore();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Find Your Store:"+compareTwoText);
	}

}
