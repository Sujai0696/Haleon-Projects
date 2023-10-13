package com.qa.theraflu.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.theraflu.pages.TherafluCovidVsFluVsColdPage;

public class TherafluCovidVsFluVsColdTest extends BaseClass{
	
	TherafluCovidVsFluVsColdPage cc;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("theraflu_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		cc = new TherafluCovidVsFluVsColdPage();
		switchingTab(firstTab);
		launchURL(loadConfig("theraflu_Config.properties").getProperty("covidVsFluVsColdPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("theraflu_Config.properties").getProperty("covidVsFluVsColdLiveUrl"));
	}

	
	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		cc.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		cc.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		cc.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		cc.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		cc.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		cc.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		cc.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three verified successfully in PreProd URL");
		switchingTab(secondTab);
		cc.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three verified successfully in Live URL");
	}
	
	@Test(priority = 4)
	private void verifybannerImgLinkOne() throws Exception{
		switchingTab(firstTab);
		cc.clickBannerImgLinkOne();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		cc.clickBannerImgLinkOne();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for BannerImgLinkOne: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifybannerImgLinkTwo() throws Exception{
		switchingTab(firstTab);
		cc.clickBannerImgLinkTwo();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		cc.clickBannerImgLinkTwo();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for BannerImgLinkTwo: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifybannerImgLinkThree() throws Exception{
		switchingTab(firstTab);
		cc.clickBannerImgLinkThree();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		cc.clickBannerImgLinkThree();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for BannerImgLinkThree: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyHyperLinkOne() throws Exception{
		switchingTab(firstTab);
		cc.clickHyperLinkOne();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		cc.clickHyperLinkOne();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkOne: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyHyperLinkTwo() throws Exception{
		switchingTab(firstTab);
		cc.clickHyperLinkTwo();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		cc.clickHyperLinkTwo();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkTwo: "+compareTwoText);
	}
	
	
	@Test(priority = 9)
	private void verifyReferences() throws Exception{
		switchingTab(firstTab);
		cc.clickReferences();
		System.out.println("References verfied successfully in Preprod URL");
		switchingTab(secondTab);
		cc.clickReferences();
		System.out.println("References verfied successfully in Live URL");
	}
	
	@Test(priority = 10)
	private void verifyRecommendedArticlesOne() throws Exception{
		switchingTab(firstTab);
		cc.clickRecommendedArticleOne();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		cc.clickRecommendedArticleOne();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RecommendedArticle: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyRecommendedArticlesTwo() throws Exception{
		switchingTab(firstTab);
		cc.clickRecommendedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		cc.clickRecommendedArticleTwo();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RecommendedArticleTwo: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyRecommendedArticlesThree() throws Exception{
		switchingTab(firstTab);
		cc.clickRecommendedArticleThree();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		cc.clickRecommendedArticleThree();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RecommendedArticleThree: "+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyRecommendedArticlesFour() throws Exception{
		switchingTab(firstTab);
		cc.clickRecommendedArticleFour();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		cc.clickRecommendedArticleFour();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RecommendedArticleFour: "+compareTwoText);
	}
	

}
