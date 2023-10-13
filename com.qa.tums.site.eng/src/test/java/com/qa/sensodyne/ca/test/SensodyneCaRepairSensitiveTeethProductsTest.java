package com.qa.sensodyne.ca.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.ca.pages.SensodyneCaRepairSensitiveTeethProductsPage;

public class SensodyneCaRepairSensitiveTeethProductsTest extends BaseClass{
	
	SensodyneCaRepairSensitiveTeethProductsPage rstp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyne_caConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		rstp = new	SensodyneCaRepairSensitiveTeethProductsPage();
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyne_caConfig.properties").getProperty("repairSensitiveTeethProductsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyne_caConfig.properties").getProperty("repairSensitiveTeethProductsLiveUrl"));
	}
	
	@Test(priority = 1)
	private void verifyProductTextOne() throws Exception{
		switchingTab(firstTab);
		rstp.clickProductTextOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		rstp.clickProductTextOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Text One:"+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyProductImgOne() throws Exception{
		switchingTab(firstTab);
		rstp.clickProductImgOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		rstp.clickProductImgOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Img One:"+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyProductBuyNowOne() throws Exception{
		switchingTab(firstTab);
		rstp.clickProductBuyNowOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		rstp.clickProductBuyNowOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products BuyNow One:"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyProductTextTwo() throws Exception{
		switchingTab(firstTab);
		rstp.clickProductTextTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		rstp.clickProductTextTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Text Two:"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyProductImgTwo() throws Exception{
		switchingTab(firstTab);
		rstp.clickProductImgTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		rstp.clickProductImgTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Img Two:"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyProductBuyNowTwo() throws Exception{
		switchingTab(firstTab);
		rstp.clickProductBuyNowTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		rstp.clickProductBuyNowTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products BuyNow Two:"+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyProductTextThree() throws Exception{
		switchingTab(firstTab);
		rstp.clickProductTextThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		rstp.clickProductTextThree();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Text Three:"+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyProductImgThree() throws Exception{
		switchingTab(firstTab);
		rstp.clickProductImgThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		rstp.clickProductImgThree();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Img Three:"+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyProductBuyNowThree() throws Exception{
		switchingTab(firstTab);
		rstp.clickProductBuyNowThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		rstp.clickProductBuyNowThree();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products BuyNow Three:"+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyFindYourStore() throws Exception{
		switchingTab(firstTab);
		rstp.clickFindYourStore();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		rstp.clickFindYourStore();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Find Your Store:"+compareTwoText);
	}

}
