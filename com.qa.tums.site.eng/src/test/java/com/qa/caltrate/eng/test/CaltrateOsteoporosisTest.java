package com.qa.caltrate.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.eng.pages.CaltrateOsteoporosisPage;

public class CaltrateOsteoporosisTest extends BaseClass{
	
	CaltrateOsteoporosisPage op;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("caltrateConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("caltrateConfig.properties").getProperty("osteoporosisPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("caltrateConfig.properties").getProperty("osteoporosisLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		op = new CaltrateOsteoporosisPage();
		switchingTab(firstTab);
		op.clickCookieBtn();
//		op.clickGigyaForm();
		System.out.println("Cookie Button clicked successfully verified in the Preprod URL");
		switchingTab(secondTab);
		op.clickCookieBtn();
//		op.clickGigyaForm();
		System.out.println("Cookie Button clicked successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyFeaturedArticleOne() throws Exception{
		switchingTab(firstTab);
		op.clickFeaturedArticleOne();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		op.clickFeaturedArticleOne();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Featured Article One :"+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyFeaturedArticleTwo() throws Exception{
		switchingTab(firstTab);
		op.clickFeaturedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		op.clickFeaturedArticleTwo();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Featured Article Two :"+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyFeaturedArticleThree() throws Exception{
		switchingTab(firstTab);
		op.clickFeaturedArticleThree();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		op.clickFeaturedArticleThree();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Featured Article Three :"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyFeaturedArticleFour() throws Exception{
		switchingTab(firstTab);
		op.clickFeaturedArticleFour();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		op.clickFeaturedArticleFour();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Featured Article Four :"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyFeaturedArticleFive() throws Exception{
		switchingTab(firstTab);
		op.clickFeaturedArticleFive();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		op.clickFeaturedArticleFive();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Featured Article Five :"+compareTwoText);
	}
	

	@Test(priority = 6)
	private void verifyReadMoreOne() throws Exception{
		switchingTab(firstTab);
		op.clickReadMoreOne();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		op.clickReadMoreOne();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read More One:"+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyReadMoreTwo() throws Exception{
		switchingTab(firstTab);
		op.clickReadMoreTwo();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		op.clickReadMoreTwo();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read More Two:"+compareTwoText);
	}
	

}
