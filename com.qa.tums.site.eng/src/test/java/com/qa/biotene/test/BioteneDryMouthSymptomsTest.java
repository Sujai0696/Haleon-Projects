package com.qa.biotene.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.biotene.pages.BioteneDryMouthSymptomsPage;

public class BioteneDryMouthSymptomsTest extends BaseClass{
	
	BioteneDryMouthSymptomsPage dms;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("biotene_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		dms = new BioteneDryMouthSymptomsPage();
		switchingTab(firstTab);
		launchURL(loadConfig("biotene_Config.properties").getProperty("dryMouthSymptomsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("biotene_Config.properties").getProperty("dryMouthSymptomsLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		dms.clickCookieBtn();
		dms.clickEmailBtn();
		System.out.println("Cookie Button and Email Pop-up successfully verified in the Preprod URL");
		switchingTab(secondTab);
		dms.clickCookieBtn();
		dms.clickEmailBtn();
		System.out.println("Cookie Button and Email Pop-up successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		dms.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		dms.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		dms.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		dms.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		dms.clickBreadcrumbThree();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		dms.clickBreadcrumbThree();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Three: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyHyperLinkOne() throws Exception{
		switchingTab(firstTab);
		dms.clickHyperLinkOne();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		dms.clickHyperLinkOne();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Hyper Link One: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyPreviousAndNextArrow() throws Exception{
		switchingTab(firstTab);
		dms.clickPreviousAndNextArrow();
		System.out.println("Previous and Next arrow is verified successfully in the Prepord URL");
		switchingTab(secondTab);
		dms.clickPreviousAndNextArrow();
		System.out.println("Previous and Next arrow is verified successfully in the Live URL");
	}
	
	@Test(priority = 6)
	private void verifyReadMore() throws Exception{
		switchingTab(firstTab);
		dms.clickReadMore();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		dms.clickReadMore();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read More: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyTakeTheQuiz() throws Exception{
		switchingTab(firstTab);
		dms.clickTakeTheQuiz();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		dms.clickTakeTheQuiz();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Take The Quiz: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyShopNow() throws Exception{
		switchingTab(firstTab);
		dms.clickShopNow();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		dms.clickShopNow();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Get Coupon: "+compareTwoText);
	}
	
	
	
}
