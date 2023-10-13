package com.qa.theraflu.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.theraflu.pages.TherafluHowToCleanYourHouseAfterTheFluPage;

public class TherafluHowToCleanYourHouseAfterTheFluTest extends BaseClass{
	
	TherafluHowToCleanYourHouseAfterTheFluPage af;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("theraflu_Config.properties").getProperty("browser"));
		launchTwoUrl();
		
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		af = new TherafluHowToCleanYourHouseAfterTheFluPage();
		switchingTab(firstTab);
		launchURL(loadConfig("theraflu_Config.properties").getProperty("howToCleanYourHouseAfterTheFluPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("theraflu_Config.properties").getProperty("howToCleanYourHouseAfterTheFluLiveUrl"));
	}

	
	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		af.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		af.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		af.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		af.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		af.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		af.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		af.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three verified successfully in PreProd URL");
		switchingTab(secondTab);
		af.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three verified successfully in Live URL");
	}
	
	@Test(priority = 6)
	private void verifyBannerImgLinkOne() throws Exception{
		switchingTab(firstTab);
		af.clickBannerImgLinkOne();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		af.clickBannerImgLinkOne();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for BannerImgLinkOne: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyHyperLinkOne() throws Exception{
		switchingTab(firstTab);
		af.clickHyperLinkOne();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		af.clickHyperLinkOne();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkOne: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyHyperLinkTwo() throws Exception{
		switchingTab(firstTab);
		af.clickHyperLinkTwo();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		af.clickHyperLinkTwo();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkTwo: "+compareTwoText);
	}
	
	
	@Test(priority = 8)
	private void verifyReferences() throws Exception{
		switchingTab(firstTab);
		af.clickReferences();
		System.out.println("References verfied successfully in Preprod URL");
		switchingTab(secondTab);
		af.clickReferences();
		System.out.println("References verfied successfully in Live URL");
	}
	
	@Test(priority = 9)
	private void verifyRecommendedArticlesOne() throws Exception{
		switchingTab(firstTab);
		af.clickRecommendedArticleOne();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		af.clickRecommendedArticleOne();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RecommendedArticle: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyRecommendedArticlesTwo() throws Exception{
		switchingTab(firstTab);
		af.clickRecommendedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		af.clickRecommendedArticleTwo();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RecommendedArticleTwo: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyRecommendedArticlesThree() throws Exception{
		switchingTab(firstTab);
		af.clickRecommendedArticleThree();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		af.clickRecommendedArticleThree();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RecommendedArticleThree: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyRecommendedArticlesFour() throws Exception{
		switchingTab(firstTab);
		af.clickRecommendedArticleFour();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		af.clickRecommendedArticleFour();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RecommendedArticleFour: "+compareTwoText);
	}

}
