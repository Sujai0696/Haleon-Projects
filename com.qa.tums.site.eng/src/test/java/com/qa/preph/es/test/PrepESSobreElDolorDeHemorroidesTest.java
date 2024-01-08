package com.qa.preph.es.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.preph.es.pages.PrepESSobreElDolorDeHemorroidesPage;

public class PrepESSobreElDolorDeHemorroidesTest extends BaseClass{
	
	PrepESSobreElDolorDeHemorroidesPage ddh;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("preph_es_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		ddh = new PrepESSobreElDolorDeHemorroidesPage();
		switchingTab(firstTab);
		launchURL(loadConfig("preph_es_Config.properties").getProperty("sobreElDolorDeHemorroidesPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("preph_es_Config.properties").getProperty("sobreElDolorDeHemorroidesLiveUrl"));
	}

	
	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		ddh.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		ddh.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		ddh.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		ddh.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		ddh.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		ddh.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyHyperlinkOne() throws Exception{
		switchingTab(firstTab);
		ddh.clickHyperlinkOne();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		ddh.clickHyperlinkOne();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperlinkOne: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyHyperlinkTwo() throws Exception{
		switchingTab(firstTab);
		ddh.clickHyperlinkTwo();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		ddh.clickHyperlinkTwo();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperlinkTwo: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyArticleOne() throws Exception{
		switchingTab(firstTab);
		ddh.clickArticleOne();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		ddh.clickArticleOne();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ArticleOne: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyArticleTwo() throws Exception{
		switchingTab(firstTab);
		ddh.clickArticleTwo();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		ddh.clickArticleTwo();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ArticleTwo: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyArticleThree() throws Exception{
		switchingTab(firstTab);
		ddh.clickArticleThree();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		ddh.clickArticleThree();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ArticleThree: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyArticleBtnOne() throws Exception{
		switchingTab(firstTab);
		ddh.clickArticleBtnOne();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		ddh.clickArticleBtnOne();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ArticleBtnOne: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyArticleBtnTwo() throws Exception{
		switchingTab(firstTab);
		ddh.clickArticleBtnTwo();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		ddh.clickArticleBtnTwo();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ArticleBtnTwo: "+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyArticleBtnThree() throws Exception{
		switchingTab(firstTab);
		ddh.clickArticleBtnThree();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		ddh.clickArticleBtnThree();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ArticleBtnThree: "+compareTwoText);
	}

}
