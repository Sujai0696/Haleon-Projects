package com.qa.sensodyne.in.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.in.pages.SensodyneInSensitiveTeethGumsToothbrushPage;

public class SensodyneInSensitiveTeethGumsToothbrushTest extends BaseClass{
	
	SensodyneInSensitiveTeethGumsToothbrushPage stgt;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyne_inConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		stgt = new SensodyneInSensitiveTeethGumsToothbrushPage();
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyne_inConfig.properties").getProperty("sensitiveTeethGumsToothbrushPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyne_inConfig.properties").getProperty("sensitiveTeethGumsToothbrushLiveUrl"));
	}
	
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		stgt.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_IN", 1, 0));
		switchingTab(secondTab);
		stgt.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_IN", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		stgt.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_IN", 1, 0));
		switchingTab(secondTab);
		stgt.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_IN", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		stgt.clickBreadcrumbThree();
		System.out.println("Breadcrum Three verified successfully in preprod URL");
		switchingTab(secondTab);
		stgt.clickBreadcrumbThree();
		System.out.println("Breadcrum Three verified successfully in Live URL");
	}
	
	@Test(priority = 4)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		stgt.clickBuyNow();
		String preProdUrl = compareUrl(excelRead("Sensodyne_IN", 1, 0));
		switchingTab(secondTab);
		stgt.clickBuyNow();
		String liveUrl = compareUrl(excelRead("Sensodyne_IN", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for BuyNow: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyHyperLinkOne() throws Exception{
		switchingTab(firstTab);
		stgt.clickHyperLinkOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_IN", 1, 0));
		switchingTab(secondTab);
		stgt.clickHyperLinkOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_IN", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkOne: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyAvailablePrdtText() throws Exception{
		switchingTab(firstTab);
		stgt.clickAvailablePrdtText();
		String preProdUrl = compareUrl(excelRead("Sensodyne_IN", 1, 0));
		switchingTab(secondTab);
		stgt.clickAvailablePrdtText();
		String liveUrl = compareUrl(excelRead("Sensodyne_IN", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for AvailablePrdtText: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyAvailablePrdtImg() throws Exception{
		switchingTab(firstTab);
		stgt.clickAvailablePrdtImg();
		String preProdUrl = compareUrl(excelRead("Sensodyne_IN", 1, 0));
		switchingTab(secondTab);
		stgt.clickAvailablePrdtImg();
		String liveUrl = compareUrl(excelRead("Sensodyne_IN", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for AvailablePrdtImg: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyTabSection() throws Exception{
		switchingTab(firstTab);
		stgt.clickTabSection();
		System.out.println("Tab section is verified in the PreProd Url");
		switchingTab(secondTab);
		stgt.clickTabSection();
		System.out.println("Tab section is verified in the Live Url");
	}
	
	@Test(priority = 9)
	private void verifyMostPopularProductOne() throws Exception{
		switchingTab(firstTab);
		stgt.clickMostPopularProductOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_IN", 1, 0));
		switchingTab(secondTab);
		stgt.clickMostPopularProductOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_IN", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Product One: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyMostPopularProductTwo() throws Exception{
		switchingTab(firstTab);
		stgt.clickMostPopularProductTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_IN", 1, 0));
		switchingTab(secondTab);
		stgt.clickMostPopularProductTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_IN", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Product Two: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyMostPopularProductThree() throws Exception{
		switchingTab(firstTab);
		stgt.clickMostPopularProductThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne_IN", 1, 0));
		switchingTab(secondTab);
		stgt.clickMostPopularProductThree();
		String liveUrl = compareUrl(excelRead("Sensodyne_IN", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Product Three: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyMostPopularProductFour() throws Exception{
		switchingTab(firstTab);
		stgt.clickMostPopularProductFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne_IN", 1, 0));
		switchingTab(secondTab);
		stgt.clickMostPopularProductFour();
		String liveUrl = compareUrl(excelRead("Sensodyne_IN", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Product Four: "+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyMostPopularProductFive() throws Exception{
		switchingTab(firstTab);
		stgt.clickMostPopularProductFive();
		String preProdUrl = compareUrl(excelRead("Sensodyne_IN", 1, 0));
		switchingTab(secondTab);
		stgt.clickMostPopularProductFive();
		String liveUrl = compareUrl(excelRead("Sensodyne_IN", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Product Five: "+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyFindYourStore() throws Exception{
		switchingTab(firstTab);
		stgt.clickFindYourStore();
		String preProdUrl = compareUrl(excelRead("Sensodyne_IN", 1, 0));
		switchingTab(secondTab);
		stgt.clickFindYourStore();
		String liveUrl = compareUrl(excelRead("Sensodyne_IN", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for FindYourStore: "+compareTwoText);
	}
	

}
