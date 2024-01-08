package com.qa.preph.es.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.preph.es.pages.PrephESElCostoEmocionalDeLasHemorroidesPage;

public class PrephESElCostoEmocionalDeLasHemorroidesTest extends BaseClass{
	
	PrephESElCostoEmocionalDeLasHemorroidesPage ecedlh;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("preph_es_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		ecedlh = new PrephESElCostoEmocionalDeLasHemorroidesPage();
		switchingTab(firstTab);
		launchURL(loadConfig("preph_es_Config.properties").getProperty("elCostoEmocionalDeLasHemorroidesPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("preph_es_Config.properties").getProperty("elCostoEmocionalDeLasHemorroidesLiveUrl"));
	}

	
	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		ecedlh.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		ecedlh.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		ecedlh.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		ecedlh.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		ecedlh.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		ecedlh.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	
	@Test(priority = 8)
	private void verifyArticleOne() throws Exception{
		switchingTab(firstTab);
		ecedlh.clickArticleOne();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		ecedlh.clickArticleOne();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ArticleOne: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyArticleTwo() throws Exception{
		switchingTab(firstTab);
		ecedlh.clickArticleTwo();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		ecedlh.clickArticleTwo();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ArticleTwo: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyArticleThree() throws Exception{
		switchingTab(firstTab);
		ecedlh.clickArticleThree();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		ecedlh.clickArticleThree();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ArticleThree: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyArticleBtnOne() throws Exception{
		switchingTab(firstTab);
		ecedlh.clickArticleBtnOne();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		ecedlh.clickArticleBtnOne();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ArticleBtnOne: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyArticleBtnTwo() throws Exception{
		switchingTab(firstTab);
		ecedlh.clickArticleBtnTwo();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		ecedlh.clickArticleBtnTwo();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ArticleBtnTwo: "+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyArticleBtnThree() throws Exception{
		switchingTab(firstTab);
		ecedlh.clickArticleBtnThree();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		ecedlh.clickArticleBtnThree();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ArticleBtnThree: "+compareTwoText);
	}

}
