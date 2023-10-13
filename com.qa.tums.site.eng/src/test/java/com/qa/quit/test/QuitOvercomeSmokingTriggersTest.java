package com.qa.quit.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.quit.pages.QuitOvercomeSmokingTriggersPage;

public class QuitOvercomeSmokingTriggersTest extends BaseClass{
	
	QuitOvercomeSmokingTriggersPage ost;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("quit_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		ost = new QuitOvercomeSmokingTriggersPage();
		switchingTab(firstTab);
		launchURL(loadConfig("quit_Config.properties").getProperty("overcomeSmokingTriggersPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("quit_Config.properties").getProperty("overcomeSmokingTriggersLiveUrl"));
	}

	
	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		ost.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		ost.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		ost.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		ost.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		ost.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		ost.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		ost.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three verified successfully in PreProd URL");
		switchingTab(secondTab);
		ost.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three verified successfully in Live URL");
	}
	
	@Test(priority = 4)
	private void verifyLinkBack() throws Exception{
		switchingTab(firstTab);
		ost.clickLinkBack();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		ost.clickLinkBack();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for LinkBack: "+compareTwoText);
	}
	
	@Test(priority = 5 )
	private void verifyHyperLinkOne() throws Exception{
		switchingTab(firstTab);
		ost.clickHyperLinkOne();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		ost.clickHyperLinkOne();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkOne: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyHyperLinkTwo() throws Exception{
		switchingTab(firstTab);
		ost.clickHyperLinkTwo();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		ost.clickHyperLinkTwo();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkTwo: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyHyperLinkThree() throws Exception{
		switchingTab(firstTab);
		ost.clickHyperLinkThree();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		ost.clickHyperLinkThree();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkThree: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyHyperLinkFour() throws Exception{
		switchingTab(firstTab);
		ost.clickHyperLinkFour();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		ost.clickHyperLinkFour();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkFour: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyHyperLinkFive() throws Exception{
		switchingTab(firstTab);
		ost.clickHyperLinkFive();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		ost.clickHyperLinkFive();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkFive: "+compareTwoText);
	}
	
//	@Test(priority = 10)
//	private void verifyHyperLinkSix() throws Exception{
//		switchingTab(firstTab);
//		ost.clickHyperLinkSix();
//		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
//		switchingTab(secondTab);
//		ost.clickHyperLinkSix();
//		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkSix: "+compareTwoText);
//	}
	
	@Test(priority = 11)
	private void verifyHyperLinkSeven() throws Exception{
		switchingTab(firstTab);
		ost.clickHyperLinkSeven();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		ost.clickHyperLinkSeven();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkSeven: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyTabOne() throws Exception{
		switchingTab(firstTab);
		ost.clickTabOne();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		ost.clickTabOne();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for TabOne: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyTabTwo() throws Exception{
		switchingTab(firstTab);
		ost.clickTabTwo();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		ost.clickTabTwo();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for TabTwo: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyTabThree() throws Exception{
		switchingTab(firstTab);
		ost.clickTabThree();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		ost.clickTabThree();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for TabThree: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyRelatedArticleOne() throws Exception{
		switchingTab(firstTab);
		ost.clickRelatedArticleOne();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		ost.clickRelatedArticleOne();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RelatedArticleOne: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyRelatedArticleTwo() throws Exception{
		switchingTab(firstTab);
		ost.clickRelatedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		ost.clickRelatedArticleTwo();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RelatedArticleTwo: "+compareTwoText);
	}



}
