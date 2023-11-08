package com.qa.flonase.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.flonase.pages.FlonaseChildrensSensimistDrugFactsPage;

public class FlonaseChildrensSensimistDrugFactsTest extends BaseClass{

	FlonaseChildrensSensimistDrugFactsPage csdf;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("Flonase_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		csdf = new FlonaseChildrensSensimistDrugFactsPage();
		switchingTab(firstTab);
		launchURL(loadConfig("Flonase_Config.properties").getProperty("childrensSensimistDrugFactsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("Flonase_Config.properties").getProperty("childrensSensimistDrugFactsLiveUrl"));
	}

	
	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		csdf.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		csdf.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBannerImgLinkOne() throws Exception{
		switchingTab(firstTab);
		csdf.clickBannerImgLinkOne();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		csdf.clickBannerImgLinkOne();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for BannerImgLinkOne: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBannerImgLinkTwo() throws Exception{
		switchingTab(firstTab);
		csdf.clickBannerImgLinkTwo();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		csdf.clickBannerImgLinkTwo();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for BannerImgLinkTwo: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBannerImgLinkThree() throws Exception{
		switchingTab(firstTab);
		csdf.clickBannerImgLinkThree();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		csdf.clickBannerImgLinkThree();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for BannerImgLinkThree: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyBannerImgLinkFour() throws Exception{
		switchingTab(firstTab);
		csdf.clickBannerImgLinkFour();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		csdf.clickBannerImgLinkFour();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for BannerImgLinkFour: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyBannerImgLinkFive() throws Exception{
		switchingTab(firstTab);
		csdf.clickBannerImgLinkFive();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		csdf.clickBannerImgLinkFive();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for BannerImgLinkFive: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyTabSection() throws Exception{
		switchingTab(firstTab);
		csdf.clickTabSection();
		System.out.println("Tab Section verified successfully in PreProd URL");
		switchingTab(secondTab);
		csdf.clickTabSection();
		System.out.println("Tab Section verified successfully in Live URL");
	}
	
	@Test(priority = 7)
	private void verifyHyperLinkSeeAllArticles() throws Exception{
		switchingTab(firstTab);
		csdf.clickHyperLinkSeeAllArticles();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		csdf.clickHyperLinkSeeAllArticles();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkSeeAllArticles: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyAllAboutAllergiesArticleOne() throws Exception{
		switchingTab(firstTab);
		csdf.clickAllAboutAllergiesArticleOne();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		csdf.clickAllAboutAllergiesArticleOne();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for AllAboutAllergiesArticleOne: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyAllAboutAllergiesArticleTwo() throws Exception{
		switchingTab(firstTab);
		csdf.clickAllAboutAllergiesArticleTwo();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		csdf.clickAllAboutAllergiesArticleTwo();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for AllAboutAllergiesArticleTwo: "+compareTwoText);
	}
	
	
	@Test(priority = 10)
	private void verifyAllAboutAllergiesArticleThree() throws Exception{
		switchingTab(firstTab);
		csdf.clickAllAboutAllergiesArticleThree();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		csdf.clickAllAboutAllergiesArticleThree();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for AllAboutAllergiesArticleThree: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyReliefProductsOne() throws Exception{
		switchingTab(firstTab);
		csdf.clickReliefProductsOne();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		csdf.clickReliefProductsOne();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ReliefProductsOne: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyReliefProductsTwo() throws Exception{
		switchingTab(firstTab);
		csdf.clickReliefProductsTwo();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		csdf.clickReliefProductsTwo();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ReliefProductsTwo: "+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyReliefProductsThree() throws Exception{
		switchingTab(firstTab);
		csdf.clickReliefProductsThree();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		csdf.clickReliefProductsThree();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ReliefProductsThree: "+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyReliefProductsFour() throws Exception{
		switchingTab(firstTab);
		csdf.clickReliefProductsFour();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		csdf.clickReliefProductsFour();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ReliefProductsFour: "+compareTwoText);
	}
	
	@Test(priority = 15)
	private void verifyReliefProductsFive() throws Exception{
		switchingTab(firstTab);
		csdf.clickReliefProductsFive();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		csdf.clickReliefProductsFive();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ReliefProductsFive: "+compareTwoText);
	}
	
	
	
}
