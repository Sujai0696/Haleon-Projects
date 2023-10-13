package com.qa.quit.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.quit.pages.QuitMastheadArticlePage;

public class QuitMastheadArticleTest extends BaseClass{
	
	QuitMastheadArticlePage ma;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("quit_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		ma = new QuitMastheadArticlePage();
		switchingTab(firstTab);
		launchURL(loadConfig("quit_Config.properties").getProperty("mastheadArticlePreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("quit_Config.properties").getProperty("mastheadArticleLiveUrl"));
	}

	
	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		ma.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		ma.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		ma.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		ma.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		ma.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		ma.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		ma.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three verified successfully in PreProd URL");
		switchingTab(secondTab);
		ma.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three verified successfully in Live URL");
		
	}
	
	@Test(priority = 4)
	private void verifyLinkBack() throws Exception{
		switchingTab(firstTab);
		ma.clickLinkBack();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		ma.clickLinkBack();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for LinkBack: "+compareTwoText);
	}
	
	
	@Test(priority = 5)
	private void verifyYoutubeVideo() throws Exception{
		switchingTab(firstTab);
		ma.clickYoutubeVideo();
		System.out.println("YouTube Video verified in the preprod URL");
		switchingTab(secondTab);
		ma.clickYoutubeVideo();
		System.out.println("YouTube Video verified in the Live URL");
	}
	
	@Test(priority = 9)
	private void verifyTabOne() throws Exception{
		switchingTab(firstTab);
		ma.clickTabOne();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		ma.clickTabOne();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for TabOne: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyTabTwo() throws Exception{
		switchingTab(firstTab);
		ma.clickTabTwo();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		ma.clickTabTwo();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for TabTwo: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyTabThree() throws Exception{
		switchingTab(firstTab);
		ma.clickTabThree();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		ma.clickTabThree();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for TabThree: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyRelatedArticleOne() throws Exception{
		switchingTab(firstTab);
		ma.clickRelatedArticleOne();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		ma.clickRelatedArticleOne();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RelatedArticleOne: "+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyRelatedArticleTwo() throws Exception{
		switchingTab(firstTab);
		ma.clickRelatedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		ma.clickRelatedArticleTwo();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RelatedArticleTwo: "+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyRelatedArticleThree() throws Exception{
		switchingTab(firstTab);
		ma.clickRelatedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		ma.clickRelatedArticleTwo();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RelatedArticleTwo: "+compareTwoText);
	}

}
