package com.qa.caltrate.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.baseClass.BaseClass;
import com.qa.caltrate.eng.pages.CaltrateFavoriteSoupBoostCalciumPage;

public class CaltrateFavoriteSoupBoostCalciumTest extends BaseClass{
	
	CaltrateFavoriteSoupBoostCalciumPage bc;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("caltrateConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("caltrateConfig.properties").getProperty("favoriteSoupBoostCalciumPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("caltrateConfig.properties").getProperty("favoriteSoupBoostCalciumLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		bc = new CaltrateFavoriteSoupBoostCalciumPage();
		switchingTab(firstTab);
		bc.clickCookieBtn();
//		bc.clickGigyaForm();
		System.out.println("Cookie Button clicked successfully verified in the Preprod URL");
		switchingTab(secondTab);
		bc.clickCookieBtn();
//		bc.clickGigyaForm();
		System.out.println("Cookie Button clicked successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyTagsLinkOne() throws Exception{
		switchingTab(firstTab);
		bc.clickTagsLinkOne();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		bc.clickTagsLinkOne();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Tags Link One :"+compareTwoText);
	}

	@Test(priority = 2)
	private void verifyViewBySectionOne() throws Exception{
		switchingTab(firstTab);
		bc.clickViewBySectionOne();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		bc.clickViewBySectionOne();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for View By Section One :"+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyViewBySectionTwo() throws Exception{
		switchingTab(firstTab);
		bc.clickViewBySectionTwo();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		bc.clickViewBySectionTwo();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for View By Section Two :"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyViewBySectionThree() throws Exception{
		switchingTab(firstTab);
		bc.clickViewBySectionThree();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		bc.clickViewBySectionThree();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for View By Section Three :"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyViewBySectionFour() throws Exception{
		switchingTab(firstTab);
		bc.clickViewBySectionFour();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		bc.clickViewBySectionFour();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for View By Section Four :"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyViewByTopicOne() throws Exception{
		switchingTab(firstTab);
		bc.clickViewByTopicOne();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		bc.clickViewByTopicOne();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for View By Topic One :"+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyViewByTopicTwo() throws Exception{
		switchingTab(firstTab);
		bc.clickViewByTopicTwo();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		bc.clickViewByTopicTwo();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for View By Topic Two :"+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyViewByTopicThree() throws Exception{
		switchingTab(firstTab);
		bc.clickViewByTopicThree();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		bc.clickViewByTopicThree();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for View By Topic Three :"+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyViewByTopicFour() throws Exception{
		switchingTab(firstTab);
		bc.clickViewByTopicFour();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		bc.clickViewByTopicFour();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for View By Topic Four :"+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		bc.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		bc.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One :"+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		bc.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		bc.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two :"+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		bc.clickBreadcrumbThree();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		bc.clickBreadcrumbThree();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Three :"+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyBreadcrumbFour() throws Exception{
		switchingTab(firstTab);
		bc.textBreadcrumbFour();
		System.out.println("Breadcrumb Four successfully verified in the preprod URL");
		switchingTab(secondTab);
		bc.textBreadcrumbFour();
		System.out.println("Breadcrumb Four successfully verified in the live URL");
	}

}
