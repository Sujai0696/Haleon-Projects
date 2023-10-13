package com.qa.sensodyne.ca.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.ca.pages.SensodyneCaMultiBenefitProductsPage;

public class SensodyneCaMultiBenefitProductsTest extends BaseClass{
	
	SensodyneCaMultiBenefitProductsPage mbp;
	

	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyne_caConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		mbp = new	SensodyneCaMultiBenefitProductsPage();
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyne_caConfig.properties").getProperty("multiBenefitProductsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyne_caConfig.properties").getProperty("multiBenefitProductsLiveUrl"));
	}
	
	@Test(priority = 1)
	private void verifyProductTextOne() throws Exception{
		switchingTab(firstTab);
		mbp.clickProductTextOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		mbp.clickProductTextOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Text One:"+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyProductImgOne() throws Exception{
		switchingTab(firstTab);
		mbp.clickProductImgOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		mbp.clickProductImgOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Img One:"+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyProductBuyNowOne() throws Exception{
		switchingTab(firstTab);
		mbp.clickProductBuyNowOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		mbp.clickProductBuyNowOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products BuyNow One:"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyProductTextTwo() throws Exception{
		switchingTab(firstTab);
		mbp.clickProductTextTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		mbp.clickProductTextTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Text Two:"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyProductImgTwo() throws Exception{
		switchingTab(firstTab);
		mbp.clickProductImgTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		mbp.clickProductImgTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Img Two:"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyProductBuyNowTwo() throws Exception{
		switchingTab(firstTab);
		mbp.clickProductBuyNowTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		mbp.clickProductBuyNowTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products BuyNow Two:"+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyProductTextThree() throws Exception{
		switchingTab(firstTab);
		mbp.clickProductTextThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		mbp.clickProductTextThree();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Text Three:"+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyProductImgThree() throws Exception{
		switchingTab(firstTab);
		mbp.clickProductImgThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		mbp.clickProductImgThree();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Img Three:"+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyProductBuyNowThree() throws Exception{
		switchingTab(firstTab);
		mbp.clickProductBuyNowThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		mbp.clickProductBuyNowThree();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products BuyNow Three:"+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyFindYourStore() throws Exception{
		switchingTab(firstTab);
		mbp.clickFindYourStore();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		mbp.clickFindYourStore();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Find Your Store:"+compareTwoText);
	}
	

}
