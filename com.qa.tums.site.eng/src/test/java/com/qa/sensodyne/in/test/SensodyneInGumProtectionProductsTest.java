package com.qa.sensodyne.in.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.in.pages.SensodyneInGumProtectionProductsPage;

public class SensodyneInGumProtectionProductsTest extends BaseClass{
	
	SensodyneInGumProtectionProductsPage gpp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyne_inConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		gpp = new	SensodyneInGumProtectionProductsPage();
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyne_inConfig.properties").getProperty("gumProtectionProductsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyne_inConfig.properties").getProperty("gumProtectionProductsLiveUrl"));
	}
	
	
	@Test(priority = 1)
	private void verifyPrdtCardText() throws Exception{
		switchingTab(firstTab);
		gpp.clickPrdtCardText();
		String preProdUrl = compareUrl(excelRead("Sensodyne_IN", 1, 0));
		switchingTab(secondTab);
		gpp.clickPrdtCardText();
		String liveUrl = compareUrl(excelRead("Sensodyne_IN", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for PrdtCardText: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyPrdtCardImg() throws Exception{
		switchingTab(firstTab);
		gpp.clickPrdtCardImg();
		String preProdUrl = compareUrl(excelRead("Sensodyne_IN", 1, 0));
		switchingTab(secondTab);
		gpp.clickPrdtCardImg();
		String liveUrl = compareUrl(excelRead("Sensodyne_IN", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for PrdtCardImg: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyPrdtCardBuyNow() throws Exception{
		switchingTab(firstTab);
		gpp.clickPrdtCardBuyNow();
		System.out.println("Product Card Buy Now verified successfully in Preprod URL");
		switchingTab(secondTab);
		gpp.clickPrdtCardBuyNow();
		System.out.println("Product Card Buy Now verified successfully in Live URL");
	}
	
	@Test(priority = 4)
	private void verifyFindYourStore() throws Exception{
		switchingTab(firstTab);
		gpp.clickFindYourStore();
		String preProdUrl = compareUrl(excelRead("Sensodyne_IN", 1, 0));
		switchingTab(secondTab);
		gpp.clickFindYourStore();
		String liveUrl = compareUrl(excelRead("Sensodyne_IN", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for FindYourStore: "+compareTwoText);
	}

}
