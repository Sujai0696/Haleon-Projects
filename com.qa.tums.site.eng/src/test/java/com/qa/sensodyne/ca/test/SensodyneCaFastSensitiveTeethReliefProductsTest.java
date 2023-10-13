package com.qa.sensodyne.ca.test;


import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.ca.pages.SensodyneCaFastSensitiveTeethReliefProductsPage;

public class SensodyneCaFastSensitiveTeethReliefProductsTest extends BaseClass{
	
	SensodyneCaFastSensitiveTeethReliefProductsPage fstr;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyne_caConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		fstr = new	SensodyneCaFastSensitiveTeethReliefProductsPage();
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyne_caConfig.properties").getProperty("fastSensitiveTeethReliefProductsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyne_caConfig.properties").getProperty("fastSensitiveTeethReliefProductsLiveUrl"));
	}

//	@Test(priority = 0, enabled = true)
//	private void cookieButton() throws Exception {
//		switchingTab(firstTab);
//		fstr.clickCookieBtn();
//		fstr.clickGigyaForm();
//		System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
//		switchingTab(secondTab);
//		fstr.clickCookieBtn();
//		fstr.clickGigyaForm();
//		System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
//	}
	
	@Test(priority = 1)
	private void verifyProductTextOne() throws Exception{
		switchingTab(firstTab);
		fstr.clickProductTextOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		fstr.clickProductTextOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Text One:"+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyProductImgOne() throws Exception{
		switchingTab(firstTab);
		fstr.clickProductImgOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		fstr.clickProductImgOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Img One:"+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyProductBuyNowOne() throws Exception{
		switchingTab(firstTab);
		fstr.clickProductBuyNowOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		fstr.clickProductBuyNowOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products BuyNow One:"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyProductTextTwo() throws Exception{
		switchingTab(firstTab);
		fstr.clickProductTextTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		fstr.clickProductTextTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Text Two:"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyProductImgTwo() throws Exception{
		switchingTab(firstTab);
		fstr.clickProductImgTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		fstr.clickProductImgTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Img Two:"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyProductBuyNowTwo() throws Exception{
		switchingTab(firstTab);
		fstr.clickProductBuyNowTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		fstr.clickProductBuyNowTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products BuyNow Two:"+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyProductTextThree() throws Exception{
		switchingTab(firstTab);
		fstr.clickProductTextThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		fstr.clickProductTextThree();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Text Three:"+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyProductImgThree() throws Exception{
		switchingTab(firstTab);
		fstr.clickProductImgThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		fstr.clickProductImgThree();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products Img Three:"+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyProductBuyNowThree() throws Exception{
		switchingTab(firstTab);
		fstr.clickProductBuyNowThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		fstr.clickProductBuyNowThree();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products BuyNow Three:"+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyFindYourStore() throws Exception{
		switchingTab(firstTab);
		fstr.clickFindYourStore();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		fstr.clickFindYourStore();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Find Your Store:"+compareTwoText);
	}
	

}
