package com.qa.sensodyne.in.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.in.pages.SensodyneInFreshBreathProductsPage;

public class SensodyneInFreshBreathProductsTest extends BaseClass{
	
	SensodyneInFreshBreathProductsPage fbp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyne_inConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		fbp = new	SensodyneInFreshBreathProductsPage();
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyne_inConfig.properties").getProperty("freshBreathProductsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyne_inConfig.properties").getProperty("freshBreathProductsLiveUrl"));
	}
	
	
	@Test(priority = 1)
	private void verifyPrdtCardTextOne() throws Exception{
		switchingTab(firstTab);
		fbp.clickPrdtCardTextOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_IN", 1, 0));
		switchingTab(secondTab);
		fbp.clickPrdtCardTextOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_IN", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for PrdtCardTextOne: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyPrdtCardImgOne() throws Exception{
		switchingTab(firstTab);
		fbp.clickPrdtCardImgOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_IN", 1, 0));
		switchingTab(secondTab);
		fbp.clickPrdtCardImgOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_IN", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for PrdtCardImgOne: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyPrdtCardBuyNowOne() throws Exception{
		switchingTab(firstTab);
		fbp.clickPrdtCardBuyNowOne();
		System.out.println("Product Card Buy Now One verified successfully in Preprod URL");
		switchingTab(secondTab);
		fbp.clickPrdtCardBuyNowOne();
		System.out.println("Product Card Buy Now One verified successfully in Live URL");
	}
	
	@Test(priority = 4)
	private void verifyPrdtCardTextTwo() throws Exception{
		switchingTab(firstTab);
		fbp.clickPrdtCardTextTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_IN", 1, 0));
		switchingTab(secondTab);
		fbp.clickPrdtCardTextTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_IN", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for PrdtCardTextTwo: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyPrdtCardImgTwo() throws Exception{
		switchingTab(firstTab);
		fbp.clickPrdtCardImgTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_IN", 1, 0));
		switchingTab(secondTab);
		fbp.clickPrdtCardImgTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_IN", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for PrdtCardImgTwo: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyPrdtCardBuyNowTwo() throws Exception{
		switchingTab(firstTab);
		fbp.clickPrdtCardBuyNowTwo();
		System.out.println("Product Card Buy Now Two verified successfully in Preprod URL");
		switchingTab(secondTab);
		fbp.clickPrdtCardBuyNowTwo();
		System.out.println("Product Card Buy Now Two verified successfully in Live URL");
	}
	
	@Test(priority = 7)
	private void verifyPrdtCardTextThree() throws Exception{
		switchingTab(firstTab);
		fbp.clickPrdtCardTextThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne_IN", 1, 0));
		switchingTab(secondTab);
		fbp.clickPrdtCardTextThree();
		String liveUrl = compareUrl(excelRead("Sensodyne_IN", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for PrdtCardTextThree: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyPrdtCardImgThree() throws Exception{
		switchingTab(firstTab);
		fbp.clickPrdtCardImgThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne_IN", 1, 0));
		switchingTab(secondTab);
		fbp.clickPrdtCardImgThree();
		String liveUrl = compareUrl(excelRead("Sensodyne_IN", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for PrdtCardImgThree: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyPrdtCardBuyNowThree() throws Exception{
		switchingTab(firstTab);
		fbp.clickPrdtCardBuyNowThree();
		System.out.println("Product Card Buy Now Three verified successfully in Preprod URL");
		switchingTab(secondTab);
		fbp.clickPrdtCardBuyNowThree();
		System.out.println("Product Card Buy Now Three verified successfully in Live URL");
	}

}
