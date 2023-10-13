package com.qa.caltrate.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.eng.pages.CaltrateBoneHealthCentralPage;
import com.qa.caltrate.eng.pages.CaltrateHomepage;

public class CaltrateBoneHealthCentralTest extends BaseClass{
	
	CaltrateBoneHealthCentralPage bhc;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("caltrateConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("caltrateConfig.properties").getProperty("boneHealthCentralPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("caltrateConfig.properties").getProperty("boneHealthCentralLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		bhc = new CaltrateBoneHealthCentralPage();
		switchingTab(firstTab);
		bhc.clickCookieBtn();
//		bhc.clickGigyaForm();
		System.out.println("Cookie Button clicked successfully verified in the Preprod URL");
		switchingTab(secondTab);
		bhc.clickCookieBtn();
//		bhc.clickGigyaForm();
		System.out.println("Cookie Button clicked successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyNavTopicOne() throws Exception{
		switchingTab(firstTab);
		bhc.clickNavTopicOne();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		bhc.clickNavTopicOne();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for navigation topic One :"+compareTwoText);
	}
	
	
	@Test(priority = 2)
	private void verifyNavTopicTwo() throws Exception{
		switchingTab(firstTab);
		bhc.clickNavTopicTwo();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		bhc.clickNavTopicTwo();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for navigation topic Two :"+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyNavTopicThree() throws Exception{
		switchingTab(firstTab);
		bhc.clickNavTopicThree();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		bhc.clickNavTopicThree();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for navigation topic Three :"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyNavTopicFour() throws Exception{
		switchingTab(firstTab);
		bhc.clickNavTopicFour();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		bhc.clickNavTopicFour();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for navigation topic Four :"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyNavTopicFive() throws Exception{
		switchingTab(firstTab);
		bhc.clickNavTopicFive();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		bhc.clickNavTopicFive();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for navigation topic Five :"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyNavTopicSix() throws Exception{
		switchingTab(firstTab);
		bhc.clickNavTopicSix();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		bhc.clickNavTopicSix();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for navigation topic Six :"+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyNavTopicSeven() throws Exception{
		switchingTab(firstTab);
		bhc.clickNavTopicSeven();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		bhc.clickNavTopicSeven();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for navigation topic Seven :"+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyNavTopicEight() throws Exception{
		switchingTab(firstTab);
		bhc.clickNavTopicEight();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		bhc.clickNavTopicEight();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for navigation topic Eight :"+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyFeaturedArticleOne() throws Exception{
		switchingTab(firstTab);
		bhc.clickFeaturedArticleOne();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		bhc.clickFeaturedArticleOne();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Featured Article One :"+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyFeaturedArticleTwo() throws Exception{
		switchingTab(firstTab);
		bhc.clickFeaturedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		bhc.clickFeaturedArticleTwo();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Featured Article Two :"+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyFeaturedArticleThree() throws Exception{
		switchingTab(firstTab);
		bhc.clickFeaturedArticleThree();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		bhc.clickFeaturedArticleThree();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Featured Article Three :"+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyFeaturedArticleFour() throws Exception{
		switchingTab(firstTab);
		bhc.clickFeaturedArticleFour();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		bhc.clickFeaturedArticleFour();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Featured Article Four :"+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyFeaturedArticleFive() throws Exception{
		switchingTab(firstTab);
		bhc.clickFeaturedArticleFive();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		bhc.clickFeaturedArticleFive();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Featured Article Five :"+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyViewRecipes() throws Exception{
		switchingTab(firstTab);
		bhc.clickViewRecipes();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		bhc.clickViewRecipes();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Featured Recipes - ViewRecipes :"+compareTwoText);
	}
	
	@Test(priority = 15)
	private void verifyMoreHealthTips() throws Exception{
		switchingTab(firstTab);
		bhc.clickMoreHealthTips();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		bhc.clickMoreHealthTips();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for More Health Tips :"+compareTwoText);
	}
	
	@Test(priority = 16)
	private void verifyReadMore() throws Exception{
		switchingTab(firstTab);
		bhc.clickReadMore();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		bhc.clickReadMore();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read More :"+compareTwoText);
	}
	
	
	
	
	
	

}
