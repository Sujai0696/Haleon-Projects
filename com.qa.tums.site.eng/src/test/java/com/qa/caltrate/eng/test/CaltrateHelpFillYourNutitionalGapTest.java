package com.qa.caltrate.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.eng.pages.CaltrateHelpFillYourNutitionalGapPage;

public class CaltrateHelpFillYourNutitionalGapTest extends BaseClass{

	
	CaltrateHelpFillYourNutitionalGapPage ng;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("caltrateConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("caltrateConfig.properties").getProperty("helpFillYourNutritionalGapPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("caltrateConfig.properties").getProperty("helpFillYourNutritionalGapLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		ng = new CaltrateHelpFillYourNutitionalGapPage();
		switchingTab(firstTab);
		ng.clickCookieBtn();
//		ng.clickGigyaForm();
		System.out.println("Cookie Button clicked successfully verified in the Preprod URL");
		switchingTab(secondTab);
		ng.clickCookieBtn();
//		ng.clickGigyaForm();
		System.out.println("Cookie Button clicked successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyTagsLinkOne() throws Exception{
		switchingTab(firstTab);
		ng.clickTagsLinkOne();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ng.clickTagsLinkOne();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Tags Link One :"+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyTagsLinkTwo() throws Exception{
		switchingTab(firstTab);
		ng.clickTagsLinkTwo();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ng.clickTagsLinkTwo();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Tags Link Two :"+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyTagsLinkThree() throws Exception{
		switchingTab(firstTab);
		ng.clickTagsLinkThree();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ng.clickTagsLinkThree();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Tags Link Three :"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyTagsLinkFour() throws Exception{
		switchingTab(firstTab);
		ng.clickTagsLinkFour();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ng.clickTagsLinkFour();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Tags Link Four :"+compareTwoText);
	}
	
//	@Test(priority = 5)
//	private void verifyTagsLinkFive() throws Exception{
//		switchingTab(firstTab);
//		ng.clickTagsLinkFive();
//		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
//		switchingTab(secondTab);
//		ng.clickTagsLinkFive();
//		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Tags Link Five :"+compareTwoText);
//	}
	
	@Test(priority = 6)
	private void verifyReadMoreLink() throws Exception{
		switchingTab(firstTab);
		ng.clickReadMoreLink();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ng.clickReadMoreLink();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read More Link :"+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyViewBySectionOne() throws Exception{
		switchingTab(firstTab);
		ng.clickViewBySectionOne();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ng.clickViewBySectionOne();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for View By Section One :"+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyViewBySectionTwo() throws Exception{
		switchingTab(firstTab);
		ng.clickViewBySectionTwo();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ng.clickViewBySectionTwo();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for View By Section Two :"+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyViewBySectionThree() throws Exception{
		switchingTab(firstTab);
		ng.clickViewBySectionThree();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ng.clickViewBySectionThree();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for View By Section Three :"+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyViewBySectionFour() throws Exception{
		switchingTab(firstTab);
		ng.clickViewBySectionFour();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ng.clickViewBySectionFour();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for View By Section Four :"+compareTwoText);
	}
	
	@Test(priority =11)
	private void verifyViewByTopicOne() throws Exception{
		switchingTab(firstTab);
		ng.clickViewByTopicOne();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ng.clickViewByTopicOne();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for View By Topic One :"+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyViewByTopicTwo() throws Exception{
		switchingTab(firstTab);
		ng.clickViewByTopicTwo();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ng.clickViewByTopicTwo();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for View By Topic Two :"+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyViewByTopicThree() throws Exception{
		switchingTab(firstTab);
		ng.clickViewByTopicThree();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ng.clickViewByTopicThree();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for View By Topic Three :"+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyViewByTopicFour() throws Exception{
		switchingTab(firstTab);
		ng.clickViewByTopicFour();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ng.clickViewByTopicFour();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for View By Topic Four :"+compareTwoText);
	}
	
	@Test(priority = 15)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		ng.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ng.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One :"+compareTwoText);
	}
	
	@Test(priority = 16)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		ng.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ng.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two :"+compareTwoText);
	}
	
	@Test(priority = 17)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		ng.clickBreadcrumbThree();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ng.clickBreadcrumbThree();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Three :"+compareTwoText);
	}
	
	@Test(priority = 18)
	private void verifyBreadcrumbFour() throws Exception{
		switchingTab(firstTab);
		ng.textBreadcrumbFour();
		System.out.println("Breadcrumb Four successfully verified in the preprod URL");
		switchingTab(secondTab);
		ng.textBreadcrumbFour();
		System.out.println("Breadcrumb Four successfully verified in the live URL");
	}
	
}
