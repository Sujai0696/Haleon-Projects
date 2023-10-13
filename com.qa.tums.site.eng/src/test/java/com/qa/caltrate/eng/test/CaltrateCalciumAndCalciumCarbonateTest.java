package com.qa.caltrate.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.eng.pages.CaltrateCalciumAndCalciumCarbonatePage;

public class CaltrateCalciumAndCalciumCarbonateTest extends BaseClass{
	
	CaltrateCalciumAndCalciumCarbonatePage cc;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("caltrateConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("caltrateConfig.properties").getProperty("calciumAndCalciumCarbonatePreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("caltrateConfig.properties").getProperty("calciumAndCalciumCarbonateLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		cc = new CaltrateCalciumAndCalciumCarbonatePage();
		switchingTab(firstTab);
		cc.clickCookieBtn();
//		cc.clickGigyaForm();
		System.out.println("Cookie Button clicked successfully verified in the Preprod URL");
		switchingTab(secondTab);
		cc.clickCookieBtn();
//		cc.clickGigyaForm();
		System.out.println("Cookie Button clicked successfully verified in the Live URL");
	}
	
	

	@Test(priority = 1)
	private void verifyFeaturedArticleOne() throws Exception{
		switchingTab(firstTab);
		cc.clickFeaturedArticleOne();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cc.clickFeaturedArticleOne();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Featured Article One :"+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyFeaturedArticleTwo() throws Exception{
		switchingTab(firstTab);
		cc.clickFeaturedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cc.clickFeaturedArticleTwo();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Featured Article Two :"+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyFeaturedArticleThree() throws Exception{
		switchingTab(firstTab);
		cc.clickFeaturedArticleThree();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cc.clickFeaturedArticleThree();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Featured Article Three :"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyFeaturedArticleFour() throws Exception{
		switchingTab(firstTab);
		cc.clickFeaturedArticleFour();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cc.clickFeaturedArticleFour();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Featured Article Four :"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyReadMoreOne() throws Exception{
		switchingTab(firstTab);
		cc.clickReadMoreOne();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cc.clickReadMoreOne();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read More One :"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyReadMoreTwo() throws Exception{
		switchingTab(firstTab);
		cc.clickReadMoreTwo();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cc.clickReadMoreTwo();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read More Two :"+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyReadMoreThree() throws Exception{
		switchingTab(firstTab);
		cc.clickReadMoreThree();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cc.clickReadMoreThree();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read More Three :"+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyReadMoreFour() throws Exception{
		switchingTab(firstTab);
		cc.clickReadMoreFour();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cc.clickReadMoreFour();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read More Four :"+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyReadMoreFive() throws Exception{
		switchingTab(firstTab);
		cc.clickReadMoreFive();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cc.clickReadMoreFive();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read More Five :"+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyReadMoreSix() throws Exception{
		switchingTab(firstTab);
		cc.clickReadMoreSix();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cc.clickReadMoreSix();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read More Six :"+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyReadMoreSeven() throws Exception{
		switchingTab(firstTab);
		cc.clickReadMoreSeven();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cc.clickReadMoreSeven();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read More Seven :"+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyReadMoreEight() throws Exception{
		switchingTab(firstTab);
		cc.clickReadMoreEight();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cc.clickReadMoreEight();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read More Eight :"+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyReadMoreNine() throws Exception{
		switchingTab(firstTab);
		cc.clickReadMoreNine();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cc.clickReadMoreNine();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read More Nine :"+compareTwoText);
	}
	
	@Test(priority = 15)
	private void verifyReadMoreTen() throws Exception{
		switchingTab(firstTab);
		cc.clickReadMoreTen();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cc.clickReadMoreTen();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read More Ten :"+compareTwoText);
	}
	
	@Test(priority = 16)
	private void verifyReadMoreEleven() throws Exception{
		switchingTab(firstTab);
		cc.clickReadMoreEleven();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cc.clickReadMoreEleven();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read More Eleven :"+compareTwoText);
	}
	
	@Test(priority = 17)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		cc.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cc.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One :"+compareTwoText);
	}
	
	@Test(priority = 18)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		cc.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cc.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two :"+compareTwoText);
	}
	
	@Test(priority = 19)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		cc.textBreadcrumbThree();
		System.out.println("Breadcrumb Three successfully verified in the preprod URL");
		switchingTab(secondTab);
		cc.textBreadcrumbThree();
		System.out.println("Breadcrumb Three successfully verified in the live URL");
	}


}
