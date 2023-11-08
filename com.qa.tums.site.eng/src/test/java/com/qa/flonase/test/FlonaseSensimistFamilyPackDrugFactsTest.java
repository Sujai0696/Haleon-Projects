package com.qa.flonase.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.flonase.pages.FlonaseSensimistFamilyPackDrugFactsPage;

public class FlonaseSensimistFamilyPackDrugFactsTest extends BaseClass{
	
	FlonaseSensimistFamilyPackDrugFactsPage sfp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("Flonase_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		sfp = new FlonaseSensimistFamilyPackDrugFactsPage();
		switchingTab(firstTab);
		launchURL(loadConfig("Flonase_Config.properties").getProperty("sensimistFamilyPackDrugFactsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("Flonase_Config.properties").getProperty("sensimistFamilyPackDrugFactsLiveUrl"));
	}

	
	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		sfp.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		sfp.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBannerImgLinkOne() throws Exception{
		switchingTab(firstTab);
		sfp.clickBannerImgLinkOne();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		sfp.clickBannerImgLinkOne();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for BannerImgLinkOne: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBannerImgLinkTwo() throws Exception{
		switchingTab(firstTab);
		sfp.clickBannerImgLinkTwo();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		sfp.clickBannerImgLinkTwo();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for BannerImgLinkTwo: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBannerImgLinkThree() throws Exception{
		switchingTab(firstTab);
		sfp.clickBannerImgLinkThree();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		sfp.clickBannerImgLinkThree();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for BannerImgLinkThree: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyBannerImgLinkFour() throws Exception{
		switchingTab(firstTab);
		sfp.clickBannerImgLinkFour();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		sfp.clickBannerImgLinkFour();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for BannerImgLinkFour: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyTabSection() throws Exception{
		switchingTab(firstTab);
		sfp.clickTabSection();
		System.out.println("Tab Section verified successfully in PreProd URL");
		switchingTab(secondTab);
		sfp.clickTabSection();
		System.out.println("Tab Section verified successfully in Live URL");
	}
	
	@Test(priority = 7)
	private void verifyHyperLinkSeeAllArticles() throws Exception{
		switchingTab(firstTab);
		sfp.clickHyperLinkSeeAllArticles();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		sfp.clickHyperLinkSeeAllArticles();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkSeeAllArticles: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyAllAboutAllergiesArticleOne() throws Exception{
		switchingTab(firstTab);
		sfp.clickAllAboutAllergiesArticleOne();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		sfp.clickAllAboutAllergiesArticleOne();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for AllAboutAllergiesArticleOne: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyAllAboutAllergiesArticleTwo() throws Exception{
		switchingTab(firstTab);
		sfp.clickAllAboutAllergiesArticleTwo();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		sfp.clickAllAboutAllergiesArticleTwo();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for AllAboutAllergiesArticleTwo: "+compareTwoText);
	}
	
	
	@Test(priority = 10)
	private void verifyAllAboutAllergiesArticleThree() throws Exception{
		switchingTab(firstTab);
		sfp.clickAllAboutAllergiesArticleThree();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		sfp.clickAllAboutAllergiesArticleThree();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for AllAboutAllergiesArticleThree: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyReliefProductsOne() throws Exception{
		switchingTab(firstTab);
		sfp.clickReliefProductsOne();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		sfp.clickReliefProductsOne();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ReliefProductsOne: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyReliefProductsTwo() throws Exception{
		switchingTab(firstTab);
		sfp.clickReliefProductsTwo();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		sfp.clickReliefProductsTwo();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ReliefProductsTwo: "+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyReliefProductsThree() throws Exception{
		switchingTab(firstTab);
		sfp.clickReliefProductsThree();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		sfp.clickReliefProductsThree();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ReliefProductsThree: "+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyReliefProductsFour() throws Exception{
		switchingTab(firstTab);
		sfp.clickReliefProductsFour();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		sfp.clickReliefProductsFour();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ReliefProductsFour: "+compareTwoText);
	}
	
	@Test(priority = 15)
	private void verifyReliefProductsFive() throws Exception{
		switchingTab(firstTab);
		sfp.clickReliefProductsFive();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		sfp.clickReliefProductsFive();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ReliefProductsFive: "+compareTwoText);
	}
	
	@Test(priority = 16)
	private void verifyReliefProductsSix() throws Exception{
		switchingTab(firstTab);
		sfp.clickReliefProductsSix();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		sfp.clickReliefProductsSix();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ReliefProductsSix: "+compareTwoText);
	}

}
