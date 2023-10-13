package com.qa.preph.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.preph.pages.PrephLearnMorePage;

public class PrephLearnMoreTest extends BaseClass{
	
	PrephLearnMorePage lm;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("preph_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		lm = new PrephLearnMorePage();
		switchingTab(firstTab);
		launchURL(loadConfig("preph_Config.properties").getProperty("learnMorePreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("preph_Config.properties").getProperty("learnMoreLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		lm.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		lm.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyArticleOne() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleOne();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleOne();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyArticleTwo() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleTwo();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleTwo();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyArticleThree() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleThree();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleThree();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Three: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyArticleFour() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleFour();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleFour();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Four: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyArticleFive() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleFive();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleFive();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Five: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyArticleSix() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleSix();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleSix();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Six: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyArticleSeven() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleSeven();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleSeven();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Seven: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyArticleEight() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleEight();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleEight();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Eight: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyArticleNine() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleNine();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleNine();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Nine: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyArticleTen() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleTen();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleTen();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Ten: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyArticleEleven() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleEleven();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleEleven();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Eleven: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyArticleTweleve() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleTweleve();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleTweleve();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Tweleve: "+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyArticleThirteen() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleThirteen();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleThirteen();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Thirteen: "+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyArticleFourteen() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleFourteen();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleFourteen();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Fourteen: "+compareTwoText);
	}
	
	@Test(priority = 15)
	private void verifyArticleFifteen() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleFifteen();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleFifteen();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Fifteen: "+compareTwoText);
	}
	
	@Test(priority = 16)
	private void verifyArticleSixteen() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleSixteen();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleSixteen();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Sixteen: "+compareTwoText);
	}
	
	@Test(priority = 17)
	private void verifyArticleSeventeen() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleSeventeen();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleSeventeen();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Seventeen: "+compareTwoText);
	}
	
	@Test(priority = 18)
	private void verifyArticleEighteen() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleEighteen();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleEighteen();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Eighteen: "+compareTwoText);
	}
	
	@Test(priority = 19)
	private void verifyArticleNineteen() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleNineteen();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleNineteen();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Nineteen: "+compareTwoText);
	}
	
	@Test(priority = 20)
	private void verifyArticleTwenty() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleTwenty();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleTwenty();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Twenty: "+compareTwoText);
	}
	
	@Test(priority = 21)
	private void verifyArticleTwentyOne() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleTwentyOne();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleTwentyOne();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Twenty One: "+compareTwoText);
	}
	
	@Test(priority = 22)
	private void verifyArticleTwentyTwo() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleTwentyTwo();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleTwentyTwo();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Twenty Two: "+compareTwoText);
	}
	
	@Test(priority = 23)
	private void verifyArticleTwentyThree() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleTwentyThree();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleTwentyThree();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Twenty Three: "+compareTwoText);
	}
	
	@Test(priority = 24)
	private void verifyArticleTwentyFour() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleTwentyFour();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleTwentyFour();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article TwentyFour: "+compareTwoText);
	}
	
	@Test(priority = 25)
	private void verifyArticleTwentyFive() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleTwentyFive();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleTwentyFive();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article TwentyFive: "+compareTwoText);
	}
	
	@Test(priority = 26)
	private void verifyArticleTwentySix() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleTwentySix();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleTwentySix();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article TwentySix: "+compareTwoText);
	}
	
	@Test(priority = 27)
	private void verifyArticleTwentySeven() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleTwentySeven();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleTwentySeven();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article TwentySeven: "+compareTwoText);
	}
	
	@Test(priority = 28)
	private void verifyArticleTwentyEight() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleTwentyEight();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleTwentyEight();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article TwentyEight: "+compareTwoText);
	}
	
	@Test(priority = 29)
	private void verifyArticleTwentyNine() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleTwentyNine();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleTwentyNine();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article TwentyNine: "+compareTwoText);
	}
	
	@Test(priority = 30)
	private void verifyArticleThirty() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleThirty();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleThirty();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Thirty: "+compareTwoText);
	}
	
	@Test(priority = 31)
	private void verifyArticleThirtyOne() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleThirtyOne();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleThirtyOne();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ThirtyOne: "+compareTwoText);
	}
	
	@Test(priority = 32)
	private void verifyArticleThirtyTwo() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleThirtyTwo();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleThirtyTwo();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ThirtyTwo: "+compareTwoText);
	}
	
	@Test(priority = 33)
	private void verifyArticleThirtyThree() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleThirtyThree();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleThirtyThree();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ThirtyThree: "+compareTwoText);
	}
	
	@Test(priority = 34)
	private void verifyArticleThirtyFour() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleThirtyFour();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleThirtyFour();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ThirtyFour: "+compareTwoText);
	}
	
	@Test(priority = 35)
	private void verifyArticleThirtyFive() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleThirtyFive();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleThirtyFive();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ThirtyFive: "+compareTwoText);
	}
	
	@Test(priority = 36)
	private void verifyArticleThirtySix() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleThirtySix();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleThirtySix();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ThirtySix: "+compareTwoText);
	}
	
	@Test(priority = 37)
	private void verifyArticleThirtySeven() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleThirtySeven();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleThirtySeven();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ThirtySeven: "+compareTwoText);
	}
	
	@Test(priority = 38)
	private void verifyArticleThirtyEight() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleThirtyEight();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleThirtyEight();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ThirtyEight: "+compareTwoText);
	}
	
	
	@Test(priority = 39)
	private void verifyArticleReadMoreOne() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleReadMoreOne();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleReadMoreOne();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Read More One: "+compareTwoText);
	}
	
	
	@Test(priority = 40)
	private void verifyArticleReadMoreTwo() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleReadMoreTwo();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleReadMoreTwo();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ReadMoreTwo: "+compareTwoText);
	}
	
	@Test(priority = 41)
	private void verifyArticleReadMoreThree() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleReadMoreThree();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleReadMoreThree();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ReadMoreThree: "+compareTwoText);
	}
	
	@Test(priority = 42)
	private void verifyArticleReadMoreFour() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleReadMoreFour();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleReadMoreFour();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ReadMoreFour: "+compareTwoText);
	}
	
	@Test(priority = 43)
	private void verifyArticleReadMoreFive() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleReadMoreFive();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleReadMoreFive();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ReadMoreFive: "+compareTwoText);
	}
	
	@Test(priority = 44)
	private void verifyArticleReadMoreSix() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleReadMoreSix();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleReadMoreSix();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ReadMoreSix: "+compareTwoText);
	}
	
	@Test(priority = 45)
	private void verifyArticleReadMoreSeven() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleReadMoreSeven();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleReadMoreSeven();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ReadMoreSeven: "+compareTwoText);
	}
	
	@Test(priority = 46)
	private void verifyArticleReadMoreEight() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleReadMoreEight();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleReadMoreEight();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ReadMoreEight: "+compareTwoText);
	}
	
	@Test(priority = 47)
	private void verifyArticleReadMoreNine() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleReadMoreNine();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleReadMoreNine();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ReadMoreNine: "+compareTwoText);
	}
	
	@Test(priority = 48)
	private void verifyArticleReadMoreTen() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleReadMoreTen();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleReadMoreTen();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ReadMoreTen: "+compareTwoText);
	}
	
	@Test(priority = 49)
	private void verifyArticleReadMoreEleven() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleReadMoreEleven();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleReadMoreEleven();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ReadMoreEleven: "+compareTwoText);
	}
	
	@Test(priority = 50)
	private void verifyArticleReadMoreTweleve() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleReadMoreTweleve();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleReadMoreTweleve();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ReadMoreTweleve: "+compareTwoText);
	}
	
	@Test(priority = 51)
	private void verifyArticleReadMoreThirteen() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleReadMoreThirteen();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleReadMoreThirteen();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ReadMoreThirteen: "+compareTwoText);
	}
	
	@Test(priority = 52)
	private void verifyArticleReadMoreFourteen() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleReadMoreFourteen();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleReadMoreFourteen();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ReadMoreFourteen: "+compareTwoText);
	}
	
	@Test(priority = 53)
	private void verifyArticleReadMoreFifteen() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleReadMoreFifteen();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleReadMoreFifteen();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ReadMoreFifteen: "+compareTwoText);
	}
	
	@Test(priority = 54)
	private void verifyArticleReadMoreSixteen() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleReadMoreSixteen();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleReadMoreSixteen();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ReadMoreSixteen: "+compareTwoText);
	}
	
	@Test(priority = 55)
	private void verifyArticleReadMoreSeventeen() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleReadMoreSeventeen();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleReadMoreSeventeen();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ReadMoreSeventeen: "+compareTwoText);
	}
	
	@Test(priority = 56)
	private void verifyArticleReadMoreEighteen() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleReadMoreEighteen();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleReadMoreEighteen();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ReadMoreEighteen: "+compareTwoText);
	}
	
	@Test(priority = 57)
	private void verifyArticleReadMoreNineteen() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleReadMoreNineteen();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleReadMoreNineteen();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ReadMoreNineteen: "+compareTwoText);
	}
	
	@Test(priority = 58)
	private void verifyArticleReadMoreTwenty() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleReadMoreTwenty();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleReadMoreTwenty();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ReadMoreTwenty: "+compareTwoText);
	}
	
	@Test(priority = 59)
	private void verifyArticleReadMoreTwentyOne() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleReadMoreTwentyOne();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleReadMoreTwentyOne();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ReadMoreTwenty One: "+compareTwoText);
	}
	
	@Test(priority = 60)
	private void verifyArticleReadMoreTwentyTwo() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleReadMoreTwentyTwo();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleReadMoreTwentyTwo();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ReadMoreTwenty Two: "+compareTwoText);
	}
	
	@Test(priority = 61)
	private void verifyArticleReadMoreTwentyThree() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleReadMoreTwentyThree();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleReadMoreTwentyThree();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ReadMoreTwenty Three: "+compareTwoText);
	}
	
	@Test(priority = 62)
	private void verifyArticleReadMoreTwentyFour() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleReadMoreTwentyFour();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleReadMoreTwentyFour();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ReadMoreTwentyFour: "+compareTwoText);
	}
	
	@Test(priority = 63)
	private void verifyArticleReadMoreTwentyFive() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleReadMoreTwentyFive();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleReadMoreTwentyFive();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ReadMoreTwentyFive: "+compareTwoText);
	}
	
	@Test(priority = 64)
	private void verifyArticleReadMoreTwentySix() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleReadMoreTwentySix();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleReadMoreTwentySix();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ReadMoreTwentySix: "+compareTwoText);
	}
	
	@Test(priority = 65)
	private void verifyArticleReadMoreTwentySeven() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleReadMoreTwentySeven();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleReadMoreTwentySeven();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ReadMoreTwentySeven: "+compareTwoText);
	}
	
	@Test(priority = 66)
	private void verifyArticleReadMoreTwentyEight() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleReadMoreTwentyEight();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleReadMoreTwentyEight();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ReadMoreTwentyEight: "+compareTwoText);
	}
	
	@Test(priority = 67)
	private void verifyArticleReadMoreTwentyNine() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleReadMoreTwentyNine();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleReadMoreTwentyNine();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ReadMoreTwentyNine: "+compareTwoText);
	}
	
	@Test(priority = 68)
	private void verifyArticleReadMoreThirty() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleReadMoreThirty();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleReadMoreThirty();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ReadMoreThirty: "+compareTwoText);
	}
	
	@Test(priority = 69)
	private void verifyArticleReadMoreThirtyOne() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleReadMoreThirtyOne();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleReadMoreThirtyOne();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ReadMoreThirtyOne: "+compareTwoText);
	}
	
	@Test(priority = 70)
	private void verifyArticleReadMoreThirtyTwo() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleReadMoreThirtyTwo();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleReadMoreThirtyTwo();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ReadMoreThirtyTwo: "+compareTwoText);
	}
	
	@Test(priority = 71)
	private void verifyArticleReadMoreThirtyThree() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleReadMoreThirtyThree();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleReadMoreThirtyThree();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ReadMoreThirtyThree: "+compareTwoText);
	}
	
	@Test(priority = 72)
	private void verifyArticleReadMoreThirtyFour() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleReadMoreThirtyFour();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleReadMoreThirtyFour();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ReadMoreThirtyFour: "+compareTwoText);
	}
	
	@Test(priority = 73)
	private void verifyArticleReadMoreThirtyFive() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleReadMoreThirtyFive();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleReadMoreThirtyFive();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ReadMoreThirtyFive: "+compareTwoText);
	}
	
	@Test(priority = 74)
	private void verifyArticleReadMoreThirtySix() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleReadMoreThirtySix();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleReadMoreThirtySix();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ReadMoreThirtySix: "+compareTwoText);
	}
	
	@Test(priority = 75)
	private void verifyArticleReadMoreThirtySeven() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleReadMoreThirtySeven();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleReadMoreThirtySeven();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ReadMoreThirtySeven: "+compareTwoText);
	}
	
	@Test(priority = 76)
	private void verifyArticleReadMoreThirtyEight() throws Exception{
		switchingTab(firstTab);
		lm.clickArticleReadMoreThirtyEight();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		lm.clickArticleReadMoreThirtyEight();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article ReadMoreThirtyEight: "+compareTwoText);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
