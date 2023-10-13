package com.qa.biotene.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.biotene.pages.BioteneDryMouthCausesMedicationsPage;

public class BioteneDryMouthCausesMedicationsTest extends BaseClass{
	
	
	BioteneDryMouthCausesMedicationsPage dmcm;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("biotene_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		dmcm = new BioteneDryMouthCausesMedicationsPage();
		switchingTab(firstTab);
		launchURL(loadConfig("biotene_Config.properties").getProperty("dryMouthCausesMedicationsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("biotene_Config.properties").getProperty("dryMouthCausesMedicationsLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		dmcm.clickCookieBtn();
		dmcm.clickEmailBtn();
		System.out.println("Cookie Button and Email Pop-up successfully verified in the Preprod URL");
		switchingTab(secondTab);
		dmcm.clickCookieBtn();
		dmcm.clickEmailBtn();
		System.out.println("Cookie Button and Email Pop-up successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		dmcm.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		dmcm.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		dmcm.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		dmcm.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		dmcm.clickBreadcrumbThree();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		dmcm.clickBreadcrumbThree();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Three: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyVideo() throws Exception{
		switchingTab(firstTab);
		dmcm.clickVideo();
		System.out.println("Video is playing in the preprod URL");
		switchingTab(secondTab);
		dmcm.clickVideo();
		System.out.println("Video is playing in the live URL");
	}
	
	@Test(priority = 5)
	private void verifyReadMore() throws Exception{
		switchingTab(firstTab);
		dmcm.clickReadMore();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		dmcm.clickReadMore();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read More: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyTakeTheQuiz() throws Exception{
		switchingTab(firstTab);
		dmcm.clickTakeTheQuiz();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		dmcm.clickTakeTheQuiz();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Take The Quiz: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyShopNow() throws Exception{
		switchingTab(firstTab);
		dmcm.clickShopNow();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		dmcm.clickShopNow();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Get Coupon: "+compareTwoText);
	}

}
