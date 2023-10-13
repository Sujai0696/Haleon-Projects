package com.qa.caltrate.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.eng.pages.CaltrateVitaminDPage;

public class CaltrateVitaminDTest extends BaseClass{
	
	CaltrateVitaminDPage vd;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("caltrateConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("caltrateConfig.properties").getProperty("vitaminDPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("caltrateConfig.properties").getProperty("vitaminDLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		vd = new CaltrateVitaminDPage();
		switchingTab(firstTab);
		vd.clickCookieBtn();
//		vd.clickGigyaForm();
		System.out.println("Cookie Button clicked successfully verified in the Preprod URL");
		switchingTab(secondTab);
		vd.clickCookieBtn();
//		vd.clickGigyaForm();
		System.out.println("Cookie Button clicked successfully verified in the Live URL");
	}
	
	
	@Test(priority = 1)
	private void verifyFeaturedArticleOne() throws Exception{
		switchingTab(firstTab);
		vd.clickFeaturedArticleOne();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		vd.clickFeaturedArticleOne();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Featured Article One :"+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyFeaturedArticleTwo() throws Exception{
		switchingTab(firstTab);
		vd.clickFeaturedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		vd.clickFeaturedArticleTwo();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Featured Article Two :"+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyFeaturedArticleThree() throws Exception{
		switchingTab(firstTab);
		vd.clickFeaturedArticleThree();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		vd.clickFeaturedArticleThree();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Featured Article Three :"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyFeaturedArticleFour() throws Exception{
		switchingTab(firstTab);
		vd.clickFeaturedArticleFour();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		vd.clickFeaturedArticleFour();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Featured Article Four :"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyReadMoreOne() throws Exception{
		switchingTab(firstTab);
		vd.clickReadMoreOne();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		vd.clickReadMoreOne();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read More One:"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyReadMoreTwo() throws Exception{
		switchingTab(firstTab);
		vd.clickReadMoreTwo();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		vd.clickReadMoreTwo();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read More Two:"+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyReadMoreThree() throws Exception{
		switchingTab(firstTab);
		vd.clickReadMoreThree();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		vd.clickReadMoreThree();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read More Three:"+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyReadMoreFour() throws Exception{
		switchingTab(firstTab);
		vd.clickReadMoreFour();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		vd.clickReadMoreFour();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read More Four:"+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyReadMoreFive() throws Exception{
		switchingTab(firstTab);
		vd.clickReadMoreFive();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		vd.clickReadMoreFive();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read More Five:"+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyReadMoreSix() throws Exception{
		switchingTab(firstTab);
		vd.clickReadMoreSix();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		vd.clickReadMoreSix();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read More Six:"+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyReadMoreSeven() throws Exception{
		switchingTab(firstTab);
		vd.clickReadMoreSeven();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		vd.clickReadMoreSeven();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read More Seven:"+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyReadMoreEight() throws Exception{
		switchingTab(firstTab);
		vd.clickReadMoreEight();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		vd.clickReadMoreEight();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read More Eight:"+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyReadMoreNine() throws Exception{
		switchingTab(firstTab);
		vd.clickReadMoreNine();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		vd.clickReadMoreNine();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read More Nine:"+compareTwoText);
	}
	
	@Test(priority = 15)
	private void verifyReadMoreTen() throws Exception{
		switchingTab(firstTab);
		vd.clickReadMoreTen();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		vd.clickReadMoreTen();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read More Ten:"+compareTwoText);
	}

}
