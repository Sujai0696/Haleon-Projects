package com.qa.quit.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.quit.pages.QuitHolidayPartySurvivalTipsPage;

public class QuitHolidayPartySurvivalTipsTest extends BaseClass{
	
	QuitHolidayPartySurvivalTipsPage hpst;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("quit_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		hpst = new QuitHolidayPartySurvivalTipsPage();
		switchingTab(firstTab);
		launchURL(loadConfig("quit_Config.properties").getProperty("holidayPartySurvivalTipsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("quit_Config.properties").getProperty("holidayPartySurvivalTipsLiveUrl"));
	}

	
	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		hpst.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		hpst.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		hpst.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		hpst.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		hpst.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		hpst.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		hpst.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three verified successfully in PreProd URL");
		switchingTab(secondTab);
		hpst.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three verified successfully in Live URL");
		
	}
	
	@Test(priority = 4)
	private void verifyLinkBack() throws Exception{
		switchingTab(firstTab);
		hpst.clickLinkBack();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		hpst.clickLinkBack();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for LinkBack: "+compareTwoText);
	}
	
	@Test(priority = 5 )
	private void verifyHyperLinkOne() throws Exception{
		switchingTab(firstTab);
		hpst.clickHyperLinkOne();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		hpst.clickHyperLinkOne();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkOne: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyHyperLinkTwo() throws Exception{
		switchingTab(firstTab);
		hpst.clickHyperLinkTwo();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		hpst.clickHyperLinkTwo();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkTwo: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyBtnSignUp() throws Exception{
		switchingTab(firstTab);
		hpst.clickBtnSignUp();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		hpst.clickBtnSignUp();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for BtnSignUp: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyBtnGetSupport() throws Exception{
		switchingTab(firstTab);
		hpst.clickBtnGetSupport();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		hpst.clickBtnGetSupport();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkTwo: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyTabOne() throws Exception{
		switchingTab(firstTab);
		hpst.clickTabOne();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		hpst.clickTabOne();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for TabOne: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyTabTwo() throws Exception{
		switchingTab(firstTab);
		hpst.clickTabTwo();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		hpst.clickTabTwo();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for TabTwo: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyTabThree() throws Exception{
		switchingTab(firstTab);
		hpst.clickTabThree();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		hpst.clickTabThree();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for TabThree: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyRelatedArticleOne() throws Exception{
		switchingTab(firstTab);
		hpst.clickRelatedArticleOne();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		hpst.clickRelatedArticleOne();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RelatedArticleOne: "+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyRelatedArticleTwo() throws Exception{
		switchingTab(firstTab);
		hpst.clickRelatedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		hpst.clickRelatedArticleTwo();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RelatedArticleTwo: "+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyRelatedArticleThree() throws Exception{
		switchingTab(firstTab);
		hpst.clickRelatedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		hpst.clickRelatedArticleTwo();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RelatedArticleTwo: "+compareTwoText);
	}
	

}
