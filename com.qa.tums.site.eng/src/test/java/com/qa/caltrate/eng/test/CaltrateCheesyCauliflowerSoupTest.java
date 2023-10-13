package com.qa.caltrate.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.eng.pages.CaltrateCheesyCauliflowerSoupPage;

public class CaltrateCheesyCauliflowerSoupTest extends BaseClass{
	
	CaltrateCheesyCauliflowerSoupPage cs;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("caltrateConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("caltrateConfig.properties").getProperty("cheesyCauliflowerSoupPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("caltrateConfig.properties").getProperty("cheesyCauliflowerSoupLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		cs = new CaltrateCheesyCauliflowerSoupPage();
		switchingTab(firstTab);
		cs.clickCookieBtn();
//		cs.clickGigyaForm();
		System.out.println("Cookie Button clicked successfully verified in the Preprod URL");
		switchingTab(secondTab);
		cs.clickCookieBtn();
//		cs.clickGigyaForm();
		System.out.println("Cookie Button clicked successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyTagsLinkOne() throws Exception{
		switchingTab(firstTab);
		cs.clickTagsLinkOne();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cs.clickTagsLinkOne();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Tags Link One :"+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyTagsLinkTwo() throws Exception{
		switchingTab(firstTab);
		cs.clickTagsLinkTwo();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cs.clickTagsLinkTwo();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Tags Link Two :"+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyLearnMore() throws Exception{
		switchingTab(firstTab);
		cs.clickLearnMore();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cs.clickLearnMore();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for LEARN MORE :"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyProductCard() throws Exception{
		switchingTab(firstTab);
		cs.clickProductCard();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cs.clickProductCard();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Product Card :"+compareTwoText);
	}

	@Test(priority = 5)
	private void verifyViewBySectionOne() throws Exception{
		switchingTab(firstTab);
		cs.clickViewBySectionOne();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cs.clickViewBySectionOne();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for View By Section One :"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyViewBySectionTwo() throws Exception{
		switchingTab(firstTab);
		cs.clickViewBySectionTwo();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cs.clickViewBySectionTwo();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for View By Section Two :"+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyViewBySectionThree() throws Exception{
		switchingTab(firstTab);
		cs.clickViewBySectionThree();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cs.clickViewBySectionThree();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for View By Section Three :"+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyViewBySectionFour() throws Exception{
		switchingTab(firstTab);
		cs.clickViewBySectionFour();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cs.clickViewBySectionFour();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for View By Section Four :"+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyViewByTopicOne() throws Exception{
		switchingTab(firstTab);
		cs.clickViewByTopicOne();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cs.clickViewByTopicOne();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for View By Topic One :"+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyViewByTopicTwo() throws Exception{
		switchingTab(firstTab);
		cs.clickViewByTopicTwo();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cs.clickViewByTopicTwo();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for View By Topic Two :"+compareTwoText);
	}
	
	@Test(priority =11)
	private void verifyViewByTopicThree() throws Exception{
		switchingTab(firstTab);
		cs.clickViewByTopicThree();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cs.clickViewByTopicThree();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for View By Topic Three :"+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyViewByTopicFour() throws Exception{
		switchingTab(firstTab);
		cs.clickViewByTopicFour();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cs.clickViewByTopicFour();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for View By Topic Four :"+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		cs.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cs.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One :"+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		cs.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cs.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two :"+compareTwoText);
	}
	
	@Test(priority = 15)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		cs.clickBreadcrumbThree();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cs.clickBreadcrumbThree();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Three :"+compareTwoText);
	}
	
	@Test(priority = 16)
	private void verifyBreadcrumbFour() throws Exception{
		switchingTab(firstTab);
		cs.textBreadcrumbFour();
		System.out.println("Breadcrumb Four successfully verified in the preprod URL");
		switchingTab(secondTab);
		cs.textBreadcrumbFour();
		System.out.println("Breadcrumb Four successfully verified in the live URL");
	}

}
