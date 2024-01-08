package com.qa.preph.es.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.preph.es.pages.PrephESComoSaberSiTienesHemorroidesPage;

public class PrephESComoSaberSiTienesHemorroidesTest extends BaseClass{
	
	PrephESComoSaberSiTienesHemorroidesPage cssth;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("preph_es_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		cssth = new PrephESComoSaberSiTienesHemorroidesPage();
		switchingTab(firstTab);
		launchURL(loadConfig("preph_es_Config.properties").getProperty("comoSaberSiTienesHemorroidesPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("preph_es_Config.properties").getProperty("comoSaberSiTienesHemorroidesLiveUrl"));
	}

	
	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		cssth.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		cssth.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		cssth.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		cssth.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		cssth.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		cssth.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyHyperlinkOne() throws Exception{
		switchingTab(firstTab);
		cssth.clickHyperlinkOne();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		cssth.clickHyperlinkOne();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperlinkOne: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyArticleOne() throws Exception{
		switchingTab(firstTab);
		cssth.clickArticleOne();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		cssth.clickArticleOne();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ArticleOne: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyArticleTwo() throws Exception{
		switchingTab(firstTab);
		cssth.clickArticleTwo();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		cssth.clickArticleTwo();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ArticleTwo: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyArticleThree() throws Exception{
		switchingTab(firstTab);
		cssth.clickArticleThree();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		cssth.clickArticleThree();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ArticleThree: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyArticleBtnOne() throws Exception{
		switchingTab(firstTab);
		cssth.clickArticleBtnOne();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		cssth.clickArticleBtnOne();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ArticleBtnOne: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyArticleBtnTwo() throws Exception{
		switchingTab(firstTab);
		cssth.clickArticleBtnTwo();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		cssth.clickArticleBtnTwo();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ArticleBtnTwo: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyArticleBtnThree() throws Exception{
		switchingTab(firstTab);
		cssth.clickArticleBtnThree();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		cssth.clickArticleBtnThree();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ArticleBtnThree: "+compareTwoText);
	}

}
