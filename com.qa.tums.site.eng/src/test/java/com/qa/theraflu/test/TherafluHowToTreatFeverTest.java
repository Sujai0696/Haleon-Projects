package com.qa.theraflu.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.theraflu.pages.TherafluHowToTreatFeverPage;

public class TherafluHowToTreatFeverTest extends BaseClass{
	
	TherafluHowToTreatFeverPage tf;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("theraflu_Config.properties").getProperty("browser"));
		launchTwoUrl();
		
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		tf = new TherafluHowToTreatFeverPage();
		switchingTab(firstTab);
		launchURL(loadConfig("theraflu_Config.properties").getProperty("howToTreatFeverPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("theraflu_Config.properties").getProperty("howToTreatFeverLiveUrl"));
	}

	
	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		tf.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		tf.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		tf.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		tf.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		tf.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		tf.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		tf.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three verified successfully in PreProd URL");
		switchingTab(secondTab);
		tf.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three verified successfully in Live URL");
	}
	
	@Test(priority = 4)
	private void verifyHyperLinkOne() throws Exception{
		switchingTab(firstTab);
		tf.clickHyperLinkOne();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		tf.clickHyperLinkOne();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkOne: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyHyperLinkTwo() throws Exception{
		switchingTab(firstTab);
		tf.clickHyperLinkTwo();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		tf.clickHyperLinkTwo();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkTwo: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyHyperLinkThree() throws Exception{
		switchingTab(firstTab);
		tf.clickHyperLinkThree();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		tf.clickHyperLinkThree();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkThree: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyHyperLinkFour() throws Exception{
		switchingTab(firstTab);
		tf.clickHyperLinkFour();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		tf.clickHyperLinkFour();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkFour: "+compareTwoText);
	}
	
	
	@Test(priority = 8)
	private void verifyReferences() throws Exception{
		switchingTab(firstTab);
		tf.clickReferences();
		System.out.println("References verfied successfully in Preprod URL");
		switchingTab(secondTab);
		tf.clickReferences();
		System.out.println("References verfied successfully in Live URL");
	}
	
	@Test(priority = 9)
	private void verifyRecommendedArticlesOne() throws Exception{
		switchingTab(firstTab);
		tf.clickRecommendedArticleOne();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		tf.clickRecommendedArticleOne();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RecommendedArticle: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyRecommendedArticlesTwo() throws Exception{
		switchingTab(firstTab);
		tf.clickRecommendedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		tf.clickRecommendedArticleTwo();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RecommendedArticleTwo: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyRecommendedArticlesThree() throws Exception{
		switchingTab(firstTab);
		tf.clickRecommendedArticleThree();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		tf.clickRecommendedArticleThree();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RecommendedArticleThree: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyRecommendedArticlesFour() throws Exception{
		switchingTab(firstTab);
		tf.clickRecommendedArticleFour();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		tf.clickRecommendedArticleFour();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RecommendedArticleFour: "+compareTwoText);
	}

}
