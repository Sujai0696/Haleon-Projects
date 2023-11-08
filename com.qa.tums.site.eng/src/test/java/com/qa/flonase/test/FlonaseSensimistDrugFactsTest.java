package com.qa.flonase.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.flonase.pages.FlonaseSensimistDrugFactsPage;

public class FlonaseSensimistDrugFactsTest extends BaseClass{
	
	FlonaseSensimistDrugFactsPage sdf;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("Flonase_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		sdf = new FlonaseSensimistDrugFactsPage();
		switchingTab(firstTab);
		launchURL(loadConfig("Flonase_Config.properties").getProperty("sensimistDrugFactsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("Flonase_Config.properties").getProperty("sensimistDrugFactsLiveUrl"));
	}

	
	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		sdf.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		sdf.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBannerImgLinkOne() throws Exception{
		switchingTab(firstTab);
		sdf.clickBannerImgLinkOne();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		sdf.clickBannerImgLinkOne();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for BannerImgLinkOne: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBannerImgLinkTwo() throws Exception{
		switchingTab(firstTab);
		sdf.clickBannerImgLinkTwo();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		sdf.clickBannerImgLinkTwo();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for BannerImgLinkTwo: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBannerImgLinkThree() throws Exception{
		switchingTab(firstTab);
		sdf.clickBannerImgLinkThree();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		sdf.clickBannerImgLinkThree();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for BannerImgLinkThree: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyBannerImgLinkFour() throws Exception{
		switchingTab(firstTab);
		sdf.clickBannerImgLinkFour();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		sdf.clickBannerImgLinkFour();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for BannerImgLinkFour: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyBannerImgLinkFive() throws Exception{
		switchingTab(firstTab);
		sdf.clickBannerImgLinkFive();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		sdf.clickBannerImgLinkFive();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for BannerImgLinkFive: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyTabSection() throws Exception{
		switchingTab(firstTab);
		sdf.clickTabSection();
		System.out.println("Tab Section verified successfully in PreProd URL");
		switchingTab(secondTab);
		sdf.clickTabSection();
		System.out.println("Tab Section verified successfully in Live URL");
	}
	
	@Test(priority = 8)
	private void verifyAllAboutAllergiesArticleOne() throws Exception{
		switchingTab(firstTab);
		sdf.clickAllAboutAllergiesArticleOne();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		sdf.clickAllAboutAllergiesArticleOne();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for AllAboutAllergiesArticleOne: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyAllAboutAllergiesArticleTwo() throws Exception{
		switchingTab(firstTab);
		sdf.clickAllAboutAllergiesArticleTwo();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		sdf.clickAllAboutAllergiesArticleTwo();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for AllAboutAllergiesArticleTwo: "+compareTwoText);
	}
	
	
	@Test(priority = 10)
	private void verifyAllAboutAllergiesArticleThree() throws Exception{
		switchingTab(firstTab);
		sdf.clickAllAboutAllergiesArticleThree();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		sdf.clickAllAboutAllergiesArticleThree();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for AllAboutAllergiesArticleThree: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyReliefProductsOne() throws Exception{
		switchingTab(firstTab);
		sdf.clickReliefProductsOne();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		sdf.clickReliefProductsOne();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ReliefProductsOne: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyReliefProductsTwo() throws Exception{
		switchingTab(firstTab);
		sdf.clickReliefProductsTwo();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		sdf.clickReliefProductsTwo();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ReliefProductsTwo: "+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyReliefProductsThree() throws Exception{
		switchingTab(firstTab);
		sdf.clickReliefProductsThree();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		sdf.clickReliefProductsThree();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ReliefProductsThree: "+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyReliefProductsFour() throws Exception{
		switchingTab(firstTab);
		sdf.clickReliefProductsFour();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		sdf.clickReliefProductsFour();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ReliefProductsFour: "+compareTwoText);
	}
	
	@Test(priority = 15)
	private void verifyReliefProductsFive() throws Exception{
		switchingTab(firstTab);
		sdf.clickReliefProductsFive();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		sdf.clickReliefProductsFive();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ReliefProductsFive: "+compareTwoText);
	}
	
	@Test(priority = 16)
	private void verifyReliefProductsSix() throws Exception{
		switchingTab(firstTab);
		sdf.clickReliefProductsSix();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		sdf.clickReliefProductsSix();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ReliefProductsSix: "+compareTwoText);
	}
	
	

}
