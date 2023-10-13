package com.qa.sensodyne.ca.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.ca.pages.SensodyneCaWhiteningProductsAndSensitiveTeethPage;

public class SensodyneCaWhiteningProductsAndSensitiveTeethTest extends BaseClass{
	
	SensodyneCaWhiteningProductsAndSensitiveTeethPage wpst;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyne_caConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		wpst = new	SensodyneCaWhiteningProductsAndSensitiveTeethPage();
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyne_caConfig.properties").getProperty("whiteningProductsAndSensitiveTeethPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyne_caConfig.properties").getProperty("whiteningProductsAndSensitiveTeethLiveUrl"));
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		wpst.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		wpst.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		wpst.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		wpst.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		wpst.clickBreadcrumbThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		wpst.clickBreadcrumbThree();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Three: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyHyperLinkSensodyneBrilliantWhitening() throws Exception{
		switchingTab(firstTab);
		wpst.clickHyperLinkSensodyneBrilliantWhitening();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		wpst.clickHyperLinkSensodyneBrilliantWhitening();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Sensodyne Brilliant Whitening: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyRelatedArticleOne() throws Exception{
		switchingTab(firstTab);
		wpst.clickRelatedArticleOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		wpst.clickRelatedArticleOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Related Article One: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyRelatedArticleTwo() throws Exception{
		switchingTab(firstTab);
		wpst.clickRelatedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		wpst.clickRelatedArticleTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Related Article Two: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyRelatedArticleThree() throws Exception{
		switchingTab(firstTab);
		wpst.clickRelatedArticleThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		wpst.clickRelatedArticleThree();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Related Article Three: "+compareTwoText);
	}

}
