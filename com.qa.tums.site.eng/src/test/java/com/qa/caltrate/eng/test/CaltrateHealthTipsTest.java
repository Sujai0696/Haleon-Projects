package com.qa.caltrate.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.eng.pages.CaltrateHealthTipsPage;

public class CaltrateHealthTipsTest extends BaseClass{
	
	CaltrateHealthTipsPage ht;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("caltrateConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("caltrateConfig.properties").getProperty("healthTipsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("caltrateConfig.properties").getProperty("healthTipsLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		ht = new CaltrateHealthTipsPage();
		switchingTab(firstTab);
		ht.clickCookieBtn();
//		ht.clickGigyaForm();
		System.out.println("Cookie Button clicked successfully verified in the Preprod URL");
		switchingTab(secondTab);
		ht.clickCookieBtn();
//		ht.clickGigyaForm();
		System.out.println("Cookie Button clicked successfully verified in the Live URL");
	}
	
	
	@Test(priority = 1)
	private void verifyFeaturedArticleOne() throws Exception{
		switchingTab(firstTab);
		ht.clickFeaturedArticleOne();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ht.clickFeaturedArticleOne();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Featured Article One :"+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyFeaturedArticleTwo() throws Exception{
		switchingTab(firstTab);
		ht.clickFeaturedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ht.clickFeaturedArticleTwo();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Featured Article Two :"+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyFeaturedArticleThree() throws Exception{
		switchingTab(firstTab);
		ht.clickFeaturedArticleThree();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ht.clickFeaturedArticleThree();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Featured Article Three :"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyReadMoreOne() throws Exception{
		switchingTab(firstTab);
		ht.clickReadMoreOne();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ht.clickReadMoreOne();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read More One:"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyReadMoreTwo() throws Exception{
		switchingTab(firstTab);
		ht.clickReadMoreTwo();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ht.clickReadMoreTwo();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read More Two:"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyReadMoreThree() throws Exception{
		switchingTab(firstTab);
		ht.clickReadMoreThree();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ht.clickReadMoreThree();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read More Three:"+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyReadMoreFour() throws Exception{
		switchingTab(firstTab);
		ht.clickReadMoreFour();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ht.clickReadMoreFour();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read More Four:"+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyReadMoreFive() throws Exception{
		switchingTab(firstTab);
		ht.clickReadMoreFive();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ht.clickReadMoreFive();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read More Five:"+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyReadMoreSix() throws Exception{
		switchingTab(firstTab);
		ht.clickReadMoreSix();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ht.clickReadMoreSix();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read More Six:"+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyReadMoreSeven() throws Exception{
		switchingTab(firstTab);
		ht.clickReadMoreSeven();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ht.clickReadMoreSeven();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read More Seven:"+compareTwoText);
	}

}
