package com.qa.caltrate.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.eng.pages.CaltrateCalciumAtEveryAgePage;

public class CaltrateCalciumAtEveryAgeTest extends BaseClass{
	
	CaltrateCalciumAtEveryAgePage ea;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("caltrateConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("caltrateConfig.properties").getProperty("calciumAtEveryAgePreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("caltrateConfig.properties").getProperty("calciumAtEveryAgeLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		ea = new CaltrateCalciumAtEveryAgePage();
		switchingTab(firstTab);
		ea.clickCookieBtn();
//		ea.clickGigyaForm();
		System.out.println("Cookie Button clicked successfully verified in the Preprod URL");
		switchingTab(secondTab);
		ea.clickCookieBtn();
//		ea.clickGigyaForm();
		System.out.println("Cookie Button clicked successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyReadArticles() throws Exception{
		switchingTab(firstTab);
		ea.clickReadArticles();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ea.clickReadArticles();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read Articles :"+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyProductCard() throws Exception{
		switchingTab(firstTab);
		ea.clickProductCard();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ea.clickProductCard();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Product Card :"+compareTwoText);
	}

	@Test(priority = 3)
	private void verifyViewBySectionOne() throws Exception{
		switchingTab(firstTab);
		ea.clickViewBySectionOne();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ea.clickViewBySectionOne();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for View By Section One :"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyViewBySectionTwo() throws Exception{
		switchingTab(firstTab);
		ea.clickViewBySectionTwo();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ea.clickViewBySectionTwo();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for View By Section Two :"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyViewBySectionThree() throws Exception{
		switchingTab(firstTab);
		ea.clickViewBySectionThree();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ea.clickViewBySectionThree();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for View By Section Three :"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyViewBySectionFour() throws Exception{
		switchingTab(firstTab);
		ea.clickViewBySectionFour();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ea.clickViewBySectionFour();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for View By Section Four :"+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyViewByTopicOne() throws Exception{
		switchingTab(firstTab);
		ea.clickViewByTopicOne();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ea.clickViewByTopicOne();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for View By Topic One :"+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyViewByTopicTwo() throws Exception{
		switchingTab(firstTab);
		ea.clickViewByTopicTwo();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ea.clickViewByTopicTwo();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for View By Topic Two :"+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyViewByTopicThree() throws Exception{
		switchingTab(firstTab);
		ea.clickViewByTopicThree();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ea.clickViewByTopicThree();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for View By Topic Three :"+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyViewByTopicFour() throws Exception{
		switchingTab(firstTab);
		ea.clickViewByTopicFour();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ea.clickViewByTopicFour();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for View By Topic Four :"+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		ea.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ea.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One :"+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		ea.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ea.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two :"+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		ea.clickBreadcrumbThree();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ea.clickBreadcrumbThree();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Three :"+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyBreadcrumbFour() throws Exception{
		switchingTab(firstTab);
		ea.textBreadcrumbFour();
		System.out.println("Breadcrumb Four successfully verified in the preprod URL");
		switchingTab(secondTab);
		ea.textBreadcrumbFour();
		System.out.println("Breadcrumb Four successfully verified in the live URL");
	}

}
