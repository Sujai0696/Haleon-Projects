package com.qa.sensodyne.in.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.in.pages.SensodyneInSensodyneDeepCleanToothpastePage;

public class SensodyneInSensodyneDeepCleanToothpasteTest extends BaseClass{
	
	SensodyneInSensodyneDeepCleanToothpastePage sdct;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyne_inConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		sdct = new SensodyneInSensodyneDeepCleanToothpastePage();
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyne_inConfig.properties").getProperty("sensodyneDeepCleanToothpastePreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyne_inConfig.properties").getProperty("sensodyneDeepCleanToothpasteLiveUrl"));
	}
	
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		sdct.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_IN", 1, 0));
		switchingTab(secondTab);
		sdct.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_IN", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		sdct.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_IN", 1, 0));
		switchingTab(secondTab);
		sdct.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_IN", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		sdct.clickBreadcrumbThree();
		System.out.println("Breadcrum Three verified successfully in preprod URL");
		switchingTab(secondTab);
		sdct.clickBreadcrumbThree();
		System.out.println("Breadcrum Three verified successfully in Live URL");
	}
	
	@Test(priority = 4)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		sdct.clickBuyNow();
		String preProdUrl = compareUrl(excelRead("Sensodyne_IN", 1, 0));
		switchingTab(secondTab);
		sdct.clickBuyNow();
		String liveUrl = compareUrl(excelRead("Sensodyne_IN", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for BuyNow: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyAvailablePrdtText() throws Exception{
		switchingTab(firstTab);
		sdct.clickAvailablePrdtText();
		String preProdUrl = compareUrl(excelRead("Sensodyne_IN", 1, 0));
		switchingTab(secondTab);
		sdct.clickAvailablePrdtText();
		String liveUrl = compareUrl(excelRead("Sensodyne_IN", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for AvailablePrdtText: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyAvailablePrdtImg() throws Exception{
		switchingTab(firstTab);
		sdct.clickAvailablePrdtImg();
		String preProdUrl = compareUrl(excelRead("Sensodyne_IN", 1, 0));
		switchingTab(secondTab);
		sdct.clickAvailablePrdtImg();
		String liveUrl = compareUrl(excelRead("Sensodyne_IN", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for AvailablePrdtImg: "+compareTwoText);
	}
	
	
	
	@Test(priority = 8)
	private void verifyTabSection() throws Exception{
		switchingTab(firstTab);
		sdct.clickTabSection();
		System.out.println("Tab section is verified in the PreProd Url");
		switchingTab(secondTab);
		sdct.clickTabSection();
		System.out.println("Tab section is verified in the Live Url");
	}
	
	@Test(priority = 9)
	private void verifyMostPopularProductOne() throws Exception{
		switchingTab(firstTab);
		sdct.clickMostPopularProductOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_IN", 1, 0));
		switchingTab(secondTab);
		sdct.clickMostPopularProductOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_IN", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Product One: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyMostPopularProductTwo() throws Exception{
		switchingTab(firstTab);
		sdct.clickMostPopularProductTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_IN", 1, 0));
		switchingTab(secondTab);
		sdct.clickMostPopularProductTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_IN", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Product Two: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyMostPopularProductThree() throws Exception{
		switchingTab(firstTab);
		sdct.clickMostPopularProductThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne_IN", 1, 0));
		switchingTab(secondTab);
		sdct.clickMostPopularProductThree();
		String liveUrl = compareUrl(excelRead("Sensodyne_IN", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Product Three: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyMostPopularProductFour() throws Exception{
		switchingTab(firstTab);
		sdct.clickMostPopularProductFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne_IN", 1, 0));
		switchingTab(secondTab);
		sdct.clickMostPopularProductFour();
		String liveUrl = compareUrl(excelRead("Sensodyne_IN", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Product Four: "+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyMostPopularProductFive() throws Exception{
		switchingTab(firstTab);
		sdct.clickMostPopularProductFive();
		String preProdUrl = compareUrl(excelRead("Sensodyne_IN", 1, 0));
		switchingTab(secondTab);
		sdct.clickMostPopularProductFive();
		String liveUrl = compareUrl(excelRead("Sensodyne_IN", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Product Five: "+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyFindYourStore() throws Exception{
		switchingTab(firstTab);
		sdct.clickFindYourStore();
		String preProdUrl = compareUrl(excelRead("Sensodyne_IN", 1, 0));
		switchingTab(secondTab);
		sdct.clickFindYourStore();
		String liveUrl = compareUrl(excelRead("Sensodyne_IN", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for FindYourStore: "+compareTwoText);
	}

}
