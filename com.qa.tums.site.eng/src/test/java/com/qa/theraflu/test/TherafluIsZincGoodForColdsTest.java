package com.qa.theraflu.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.theraflu.pages.TherafluIsZincGoodForColdsPage;

public class TherafluIsZincGoodForColdsTest extends BaseClass{
	
	TherafluIsZincGoodForColdsPage gfc;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("theraflu_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		gfc = new TherafluIsZincGoodForColdsPage();
		switchingTab(firstTab);
		launchURL(loadConfig("theraflu_Config.properties").getProperty("isZincGoodForColdsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("theraflu_Config.properties").getProperty("isZincGoodForColdsLiveUrl"));
	}

	
	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		gfc.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		gfc.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		gfc.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		gfc.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		gfc.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		gfc.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		gfc.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three verified successfully in PreProd URL");
		switchingTab(secondTab);
		gfc.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three verified successfully in Live URL");
	}
	
//	@Test(priority = 4)
//	private void verifyHyperLinkOne() throws Exception{
//		switchingTab(firstTab);
//		gfc.clickHyperLinkOne();
//		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
//		switchingTab(secondTab);
//		gfc.clickHyperLinkOne();
//		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkOne: "+compareTwoText);
//	}
//	
//	@Test(priority = 5)
//	private void verifyHyperLinkTwo() throws Exception{
//		switchingTab(firstTab);
//		gfc.clickHyperLinkTwo();
//		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
//		switchingTab(secondTab);
//		gfc.clickHyperLinkTwo();
//		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkTwo: "+compareTwoText);
//	}
//	
//	@Test(priority = 6)
//	private void verifyHyperLinkThree() throws Exception{
//		switchingTab(firstTab);
//		gfc.clickHyperLinkThree();
//		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
//		switchingTab(secondTab);
//		gfc.clickHyperLinkThree();
//		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkThree: "+compareTwoText);
//	}
//	
//	@Test(priority = 7)
//	private void verifyHyperLinkFour() throws Exception{
//		switchingTab(firstTab);
//		gfc.clickHyperLinkFour();
//		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
//		switchingTab(secondTab);
//		gfc.clickHyperLinkFour();
//		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkFour: "+compareTwoText);
//	}
	
	@Test(priority = 8)
	private void verifyHyperLinkFive() throws Exception{
		switchingTab(firstTab);
		gfc.clickHyperLinkFive();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		gfc.clickHyperLinkFive();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkFive: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyHyperLinkSix() throws Exception{
		switchingTab(firstTab);
		gfc.clickHyperLinkSix();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		gfc.clickHyperLinkSix();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkSix: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyHyperLinkSeven() throws Exception{
		switchingTab(firstTab);
		gfc.clickHyperLinkSeven();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		gfc.clickHyperLinkSeven();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkSeven: "+compareTwoText);
	}
	
	
	@Test(priority = 11)
	private void verifyReferences() throws Exception{
		switchingTab(firstTab);
		gfc.clickReferences();
		System.out.println("References verfied successfully in Preprod URL");
		switchingTab(secondTab);
		gfc.clickReferences();
		System.out.println("References verfied successfully in Live URL");
	}
	
	@Test(priority = 12)
	private void verifyRecommendedArticlesOne() throws Exception{
		switchingTab(firstTab);
		gfc.clickRecommendedArticleOne();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		gfc.clickRecommendedArticleOne();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RecommendedArticle: "+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyRecommendedArticlesTwo() throws Exception{
		switchingTab(firstTab);
		gfc.clickRecommendedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		gfc.clickRecommendedArticleTwo();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RecommendedArticleTwo: "+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyRecommendedArticlesThree() throws Exception{
		switchingTab(firstTab);
		gfc.clickRecommendedArticleThree();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		gfc.clickRecommendedArticleThree();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RecommendedArticleThree: "+compareTwoText);
	}
	
	@Test(priority = 15)
	private void verifyRecommendedArticlesFour() throws Exception{
		switchingTab(firstTab);
		gfc.clickRecommendedArticleFour();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		gfc.clickRecommendedArticleFour();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RecommendedArticleFour: "+compareTwoText);
	}

}
