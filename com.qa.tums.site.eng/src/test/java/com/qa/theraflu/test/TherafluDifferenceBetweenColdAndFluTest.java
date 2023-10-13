package com.qa.theraflu.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.theraflu.pages.TherafluDifferenceBetweenColdAndFluPage;

public class TherafluDifferenceBetweenColdAndFluTest extends BaseClass{
	
	TherafluDifferenceBetweenColdAndFluPage cf;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("theraflu_Config.properties").getProperty("browser"));
		launchTwoUrl();
		
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		cf = new TherafluDifferenceBetweenColdAndFluPage();
		switchingTab(firstTab);
		launchURL(loadConfig("theraflu_Config.properties").getProperty("differenceBetweenColdAndFluPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("theraflu_Config.properties").getProperty("differenceBetweenColdAndFluLiveUrl"));
	}

	
	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		cf.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		cf.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		cf.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		cf.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		cf.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		cf.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		cf.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three verified successfully in PreProd URL");
		switchingTab(secondTab);
		cf.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three verified successfully in Live URL");
	}
	
	@Test(priority = 6)
	private void verifyBannerImgLinkOne() throws Exception{
		switchingTab(firstTab);
		cf.clickBannerImgLinkOne();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		cf.clickBannerImgLinkOne();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for BannerImgLinkOne: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyHyperLinkOne() throws Exception{
		switchingTab(firstTab);
		cf.clickHyperLinkOne();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		cf.clickHyperLinkOne();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkOne: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyHyperLinkTwo() throws Exception{
		switchingTab(firstTab);
		cf.clickHyperLinkTwo();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		cf.clickHyperLinkTwo();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkTwo: "+compareTwoText);
	}
	
	
	@Test(priority = 8)
	private void verifyReferences() throws Exception{
		switchingTab(firstTab);
		cf.clickReferences();
		System.out.println("References verfied successfully in Preprod URL");
		switchingTab(secondTab);
		cf.clickReferences();
		System.out.println("References verfied successfully in Live URL");
	}
	
	@Test(priority = 9)
	private void verifyRecommendedArticlesOne() throws Exception{
		switchingTab(firstTab);
		cf.clickRecommendedArticleOne();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		cf.clickRecommendedArticleOne();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RecommendedArticle: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyRecommendedArticlesTwo() throws Exception{
		switchingTab(firstTab);
		cf.clickRecommendedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		cf.clickRecommendedArticleTwo();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RecommendedArticleTwo: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyRecommendedArticlesThree() throws Exception{
		switchingTab(firstTab);
		cf.clickRecommendedArticleThree();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		cf.clickRecommendedArticleThree();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RecommendedArticleThree: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyRecommendedArticlesFour() throws Exception{
		switchingTab(firstTab);
		cf.clickRecommendedArticleFour();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		cf.clickRecommendedArticleFour();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RecommendedArticleFour: "+compareTwoText);
	}

}
