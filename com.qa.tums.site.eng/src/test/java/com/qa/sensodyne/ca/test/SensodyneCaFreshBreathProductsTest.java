package com.qa.sensodyne.ca.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.ca.pages.SensodyneCaFreshBreathProductsPage;

public class SensodyneCaFreshBreathProductsTest extends BaseClass{
	
	SensodyneCaFreshBreathProductsPage fbp;
	

	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyne_caConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		fbp = new	SensodyneCaFreshBreathProductsPage();
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyne_caConfig.properties").getProperty("freshBreathProductsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyne_caConfig.properties").getProperty("freshBreathProductsLiveUrl"));
	}
	
	@Test(priority = 1)
	private void verifyProductTextOne() throws Exception{
		switchingTab(firstTab);
		fbp.clickProductTextOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		fbp.clickProductTextOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Text One:"+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyProductImgOne() throws Exception{
		switchingTab(firstTab);
		fbp.clickProductImgOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		fbp.clickProductImgOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Img One:"+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyProductBuyNowOne() throws Exception{
		switchingTab(firstTab);
		fbp.clickProductBuyNowOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		fbp.clickProductBuyNowOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products BuyNow One:"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyProductTextTwo() throws Exception{
		switchingTab(firstTab);
		fbp.clickProductTextTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		fbp.clickProductTextTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Text Two:"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyProductImgTwo() throws Exception{
		switchingTab(firstTab);
		fbp.clickProductImgTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		fbp.clickProductImgTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Img Two:"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyProductBuyNowTwo() throws Exception{
		switchingTab(firstTab);
		fbp.clickProductBuyNowTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		fbp.clickProductBuyNowTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products BuyNow Two:"+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyProductTextThree() throws Exception{
		switchingTab(firstTab);
		fbp.clickProductTextThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		fbp.clickProductTextThree();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Text Three:"+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyProductImgThree() throws Exception{
		switchingTab(firstTab);
		fbp.clickProductImgThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		fbp.clickProductImgThree();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Img Three:"+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyProductBuyNowThree() throws Exception{
		switchingTab(firstTab);
		fbp.clickProductBuyNowThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		fbp.clickProductBuyNowThree();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products BuyNow Three:"+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyProductTextFour() throws Exception{
		switchingTab(firstTab);
		fbp.clickProductTextFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		fbp.clickProductTextFour();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Text Four:"+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyProductImgFour() throws Exception{
		switchingTab(firstTab);
		fbp.clickProductImgFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		fbp.clickProductImgFour();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Img Four:"+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyProductBuyNowFour() throws Exception{
		switchingTab(firstTab);
		fbp.clickProductBuyNowFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		fbp.clickProductBuyNowFour();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products BuyNow Four:"+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyProductTextFive() throws Exception{
		switchingTab(firstTab);
		fbp.clickProductTextFive();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		fbp.clickProductTextFive();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Text Five:"+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyProductImgFive() throws Exception{
		switchingTab(firstTab);
		fbp.clickProductImgFive();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		fbp.clickProductImgFive();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Img Five:"+compareTwoText);
	}
	
	@Test(priority = 15)
	private void verifyProductBuyNowFive() throws Exception{
		switchingTab(firstTab);
		fbp.clickProductBuyNowFive();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		fbp.clickProductBuyNowFive();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products BuyNow Five:"+compareTwoText);
	}
	
	@Test(priority = 16)
	private void verifyProductTextSix() throws Exception{
		switchingTab(firstTab);
		fbp.clickProductTextSix();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		fbp.clickProductTextSix();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Text Six:"+compareTwoText);
	}
	
	@Test(priority = 17)
	private void verifyProductImgSix() throws Exception{
		switchingTab(firstTab);
		fbp.clickProductImgSix();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		fbp.clickProductImgSix();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Img Six:"+compareTwoText);
	}
	
	@Test(priority = 18)
	private void verifyProductBuyNowSix() throws Exception{
		switchingTab(firstTab);
		fbp.clickProductBuyNowSix();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		fbp.clickProductBuyNowSix();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products BuyNow Six:"+compareTwoText);
	}
	
	@Test(priority = 19)
	private void verifyProductTextSeven() throws Exception{
		switchingTab(firstTab);
		fbp.clickProductTextSeven();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		fbp.clickProductTextSeven();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Text Seven:"+compareTwoText);
	}
	
	@Test(priority = 20)
	private void verifyProductImgSeven() throws Exception{
		switchingTab(firstTab);
		fbp.clickProductImgSeven();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		fbp.clickProductImgSeven();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Img Seven:"+compareTwoText);
	}
	
	@Test(priority = 21)
	private void verifyProductBuyNowSeven() throws Exception{
		switchingTab(firstTab);
		fbp.clickProductBuyNowSeven();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		fbp.clickProductBuyNowSeven();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products BuyNow Seven:"+compareTwoText);
	}
	
	@Test(priority = 22)
	private void verifyHyperLinkSensitivityRelief() throws Exception{
		switchingTab(firstTab);
		fbp.clickHyperLinkSensitivityRelief();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		fbp.clickHyperLinkSensitivityRelief();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Sensitivity Relief:"+compareTwoText);
	}
	
	@Test(priority = 23)
	private void verifyHyperLinkWhiterTeeth() throws Exception{
		switchingTab(firstTab);
		fbp.clickHyperLinkWhiterTeeth();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		fbp.clickHyperLinkWhiterTeeth();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Whiter Teeth:"+compareTwoText);
	}
	
	
	
	@Test(priority = 24)
	private void verifyFindYourStore() throws Exception{
		switchingTab(firstTab);
		fbp.clickFindYourStore();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		fbp.clickFindYourStore();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Find Your Store:"+compareTwoText);
	}

}
