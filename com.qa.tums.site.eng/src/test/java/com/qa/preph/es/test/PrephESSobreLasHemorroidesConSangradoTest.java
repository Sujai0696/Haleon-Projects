package com.qa.preph.es.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.preph.es.pages.PrephESSobreLasHemorroidesConSangradoPage;

public class PrephESSobreLasHemorroidesConSangradoTest extends BaseClass{
	
	PrephESSobreLasHemorroidesConSangradoPage ip;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("preph_es_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		ip = new PrephESSobreLasHemorroidesConSangradoPage();
		switchingTab(firstTab);
		launchURL(loadConfig("preph_es_Config.properties").getProperty("sobreLasHemorroidesConSangradoPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("preph_es_Config.properties").getProperty("sobreLasHemorroidesConSangradoLiveUrl"));
	}

	
	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		ip.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		ip.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		ip.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		ip.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		ip.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		ip.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyArticleOne() throws Exception{
		switchingTab(firstTab);
		ip.clickArticleOne();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		ip.clickArticleOne();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ArticleOne: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyArticleTwo() throws Exception{
		switchingTab(firstTab);
		ip.clickArticleTwo();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		ip.clickArticleTwo();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ArticleTwo: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyArticleThree() throws Exception{
		switchingTab(firstTab);
		ip.clickArticleThree();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		ip.clickArticleThree();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ArticleThree: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyArticleBtnOne() throws Exception{
		switchingTab(firstTab);
		ip.clickArticleBtnOne();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		ip.clickArticleBtnOne();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ArticleBtnOne: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyArticleBtnTwo() throws Exception{
		switchingTab(firstTab);
		ip.clickArticleBtnTwo();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		ip.clickArticleBtnTwo();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ArticleBtnTwo: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyArticleBtnThree() throws Exception{
		switchingTab(firstTab);
		ip.clickArticleBtnThree();
		String preProdUrl = compareUrl(excelRead("Preph_ES", 1, 0));
		switchingTab(secondTab);
		ip.clickArticleBtnThree();
		String liveUrl = compareUrl(excelRead("Preph_ES", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ArticleBtnThree: "+compareTwoText);
	}
	
	

}
