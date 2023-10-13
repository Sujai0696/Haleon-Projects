package com.qa.biotene.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.biotene.pages.BioteneNaturalRemediesDryMouthPage;
import com.qa.biotene.pages.BioteneUnderstandingDryMouthPage;

public class BioteneNaturalRemediesDryMouthTest extends BaseClass{
	
	BioteneNaturalRemediesDryMouthPage nrdm;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("biotene_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		nrdm = new BioteneNaturalRemediesDryMouthPage();
		switchingTab(firstTab);
		launchURL(loadConfig("biotene_Config.properties").getProperty("naturalRemediesDryMouthPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("biotene_Config.properties").getProperty("naturalRemediesDryMouthLiveUrl"));
		
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		nrdm.clickCookieBtn();
		nrdm.clickEmailBtn();
		System.out.println("Cookie Button and Email Pop-up successfully verified in the Preprod URL");
		switchingTab(secondTab);
		nrdm.clickCookieBtn();
		nrdm.clickEmailBtn();
		System.out.println("Cookie Button and Email Pop-up successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		nrdm.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		nrdm.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		nrdm.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		nrdm.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		nrdm.clickBreadcrumbThree();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		nrdm.clickBreadcrumbThree();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Three: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyHyperLinkOne() throws Exception{
		switchingTab(firstTab);
		nrdm.clickHyperLinkOne();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		nrdm.clickHyperLinkOne();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Hyper Link One: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyHyperLinkTwo() throws Exception{
		switchingTab(firstTab);
		nrdm.clickHyperLinkTwo();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		nrdm.clickHyperLinkTwo();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Hyper Link Two: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyHyperLinkThree() throws Exception{
		switchingTab(firstTab);
		nrdm.clickHyperLinkThree();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		nrdm.clickHyperLinkThree();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Hyper Link Three: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyReadMore() throws Exception{
		switchingTab(firstTab);
		nrdm.clickReadMore();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		nrdm.clickReadMore();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read More: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyTakeTheQuiz() throws Exception{
		switchingTab(firstTab);
		nrdm.clickTakeTheQuiz();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		nrdm.clickTakeTheQuiz();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Take The Quiz: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyShopNow() throws Exception{
		switchingTab(firstTab);
		nrdm.clickShopNow();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		nrdm.clickShopNow();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Shop Now: "+compareTwoText);
	}

}
