package com.qa.flonase.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.flonase.pages.FlonasePollenAllergiesPage;

public class FlonasePollenAllergiesTest extends BaseClass{
	
	FlonasePollenAllergiesPage pa;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("Flonase_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		pa = new FlonasePollenAllergiesPage();
		switchingTab(firstTab);
		launchURL(loadConfig("Flonase_Config.properties").getProperty("pollenAllergiesPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("Flonase_Config.properties").getProperty("pollenAllergiesLiveUrl"));
	}

	
	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		pa.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		pa.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	
	@Test(priority = 1)
	private void verifyHyperLinkOne() throws Exception{
		switchingTab(firstTab);
		pa.clickHyperLinkOne();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pa.clickHyperLinkOne();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkOne: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyHyperLinkTwo() throws Exception{
		switchingTab(firstTab);
		pa.clickHyperLinkTwo();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pa.clickHyperLinkTwo();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkTwo: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyHyperLinkThree() throws Exception{
		switchingTab(firstTab);
		pa.clickHyperLinkThree();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pa.clickHyperLinkThree();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkThree: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyHyperLinkFour() throws Exception{
		switchingTab(firstTab);
		pa.clickHyperLinkFour();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pa.clickHyperLinkFour();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkFour: "+compareTwoText);
	}
	
	
	@Test(priority = 5)
	private void verifyHyperLinkFive() throws Exception{
		switchingTab(firstTab);
		pa.clickHyperLinkFive();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pa.clickHyperLinkFive();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkFive: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyHyperLinkSix() throws Exception{
		switchingTab(firstTab);
		pa.clickHyperLinkSix();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pa.clickHyperLinkSix();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkSix: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyHyperLinkSeven() throws Exception{
		switchingTab(firstTab);
		pa.clickHyperLinkSeven();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pa.clickHyperLinkSeven();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkSeven: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyHyperLinkEight() throws Exception{
		switchingTab(firstTab);
		pa.clickHyperLinkEight();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pa.clickHyperLinkEight();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkEight: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyHyperLinkNine() throws Exception{
		switchingTab(firstTab);
		pa.clickHyperLinkNine();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pa.clickHyperLinkNine();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkNine: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyHyperLinkTen() throws Exception{
		switchingTab(firstTab);
		pa.clickHyperLinkTen();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pa.clickHyperLinkTen();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkTen: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyHyperLinkEleven() throws Exception{
		switchingTab(firstTab);
		pa.clickHyperLinkEleven();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pa.clickHyperLinkEleven();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkEleven: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyHyperLinkTweleve() throws Exception{
		switchingTab(firstTab);
		pa.clickHyperLinkTweleve();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pa.clickHyperLinkTweleve();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkTweleve: "+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyHyperLinkThirteen() throws Exception{
		switchingTab(firstTab);
		pa.clickHyperLinkThirteen();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pa.clickHyperLinkThirteen();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkThirteen: "+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyHyperLinkFourteen() throws Exception{
		switchingTab(firstTab);
		pa.clickHyperLinkFourteen();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pa.clickHyperLinkFourteen();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkFourteen: "+compareTwoText);
	}
	
	@Test(priority = 15)
	private void verifyHyperLinkFifteen() throws Exception{
		switchingTab(firstTab);
		pa.clickHyperLinkFifteen();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pa.clickHyperLinkFifteen();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkFifteen: "+compareTwoText);
	}
	
	@Test(priority = 16)
	private void verifyHyperLinkSixteen() throws Exception{
		switchingTab(firstTab);
		pa.clickHyperLinkSixteen();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pa.clickHyperLinkSixteen();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkSixteen: "+compareTwoText);
	}
	
	@Test(priority = 17)
	private void verifyHyperLinkSeventeen() throws Exception{
		switchingTab(firstTab);
		pa.clickHyperLinkSeventeen();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pa.clickHyperLinkSeventeen();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkSeveteen: "+compareTwoText);
	}
	
	@Test(priority = 18)
	private void verifyHyperLinkEighteen() throws Exception{
		switchingTab(firstTab);
		pa.clickHyperLinkEighteen();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pa.clickHyperLinkEighteen();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkEighteen: "+compareTwoText);
	}
	
	@Test(priority = 19)
	private void verifyHyperLinkNineteen() throws Exception{
		switchingTab(firstTab);
		pa.clickHyperLinkNineteen();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pa.clickHyperLinkNineteen();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkNineteen: "+compareTwoText);
	}
	
	
	
	
	@Test(priority = 20)
	private void verifyTagsLinksOne() throws Exception{
		switchingTab(firstTab);
		pa.clickTagsLinksOne();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pa.clickTagsLinksOne();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for TagsLinksOne: "+compareTwoText);
	}
	
	@Test(priority = 21)
	private void verifyTagsLinksTwo() throws Exception{
		switchingTab(firstTab);
		pa.clickTagsLinksTwo();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pa.clickTagsLinksTwo();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for TagsLinksTwo: "+compareTwoText);
	}
	
	@Test(priority = 22)
	private void verifyHyperLinkSeeAllArticles() throws Exception{
		switchingTab(firstTab);
		pa.clickHyperLinkSeeAllArticles();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pa.clickHyperLinkSeeAllArticles();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkSeeAllArticles: "+compareTwoText);
	}
	
	@Test(priority = 23)
	private void verifyAllAboutAllergiesArticleOne() throws Exception{
		switchingTab(firstTab);
		pa.clickAllAboutAllergiesArticleOne();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pa.clickAllAboutAllergiesArticleOne();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for AllAboutAllergiesArticleOne: "+compareTwoText);
	}
	
	@Test(priority = 24)
	private void verifyAllAboutAllergiesArticleTwo() throws Exception{
		switchingTab(firstTab);
		pa.clickAllAboutAllergiesArticleTwo();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pa.clickAllAboutAllergiesArticleTwo();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for AllAboutAllergiesArticleTwo: "+compareTwoText);
	}
	
	
	@Test(priority = 25)
	private void verifyAllAboutAllergiesArticleThree() throws Exception{
		switchingTab(firstTab);
		pa.clickAllAboutAllergiesArticleThree();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pa.clickAllAboutAllergiesArticleThree();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for AllAboutAllergiesArticleThree: "+compareTwoText);
	}
	
	@Test(priority = 26)
	private void verifyBtnBuyNow() throws Exception{
		switchingTab(firstTab);
		pa.clickBtnBuyNow();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		pa.clickBtnBuyNow();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for BtnBuyNow: "+compareTwoText);
	}

}
