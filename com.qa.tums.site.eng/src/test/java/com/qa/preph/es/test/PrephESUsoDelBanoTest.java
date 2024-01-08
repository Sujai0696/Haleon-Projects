package com.qa.preph.es.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.preph.es.pages.PrephESUsoDelBanoPage;

public class PrephESUsoDelBanoTest extends BaseClass{
	
	PrephESUsoDelBanoPage udb;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("preph_es_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		udb = new PrephESUsoDelBanoPage();
		switchingTab(firstTab);
		launchURL(loadConfig("preph_es_Config.properties").getProperty("usoDelBanoPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("preph_es_Config.properties").getProperty("usoDelBanoLiveUrl"));
	}

	
	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		udb.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		udb.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		udb.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		udb.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		udb.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		udb.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyHyperlinkOne() throws Exception{
		switchingTab(firstTab);
		udb.clickHyperlinkOne();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		udb.clickHyperlinkOne();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperlinkOne: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyHyperlinkTwo() throws Exception{
		switchingTab(firstTab);
		udb.clickHyperlinkTwo();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		udb.clickHyperlinkTwo();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperlinkTwo: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyHyperlinkThree() throws Exception{
		switchingTab(firstTab);
		udb.clickHyperlinkThree();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		udb.clickHyperlinkThree();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperlinkThree: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyHyperlinkFour() throws Exception{
		switchingTab(firstTab);
		udb.clickHyperlinkFour();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		udb.clickHyperlinkFour();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperlinkFour: "+compareTwoText);
	}
	
	
	@Test(priority = 8)
	private void verifyArticleOne() throws Exception{
		switchingTab(firstTab);
		udb.clickArticleOne();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		udb.clickArticleOne();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ArticleOne: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyArticleTwo() throws Exception{
		switchingTab(firstTab);
		udb.clickArticleTwo();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		udb.clickArticleTwo();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ArticleTwo: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyArticleThree() throws Exception{
		switchingTab(firstTab);
		udb.clickArticleThree();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		udb.clickArticleThree();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ArticleThree: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyArticleBtnOne() throws Exception{
		switchingTab(firstTab);
		udb.clickArticleBtnOne();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		udb.clickArticleBtnOne();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ArticleBtnOne: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyArticleBtnTwo() throws Exception{
		switchingTab(firstTab);
		udb.clickArticleBtnTwo();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		udb.clickArticleBtnTwo();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ArticleBtnTwo: "+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyArticleBtnThree() throws Exception{
		switchingTab(firstTab);
		udb.clickArticleBtnThree();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		udb.clickArticleBtnThree();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ArticleBtnThree: "+compareTwoText);
	}
	
	

}
