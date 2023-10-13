package com.qa.biotene.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.biotene.pages.BioteneDryMouthProductsPage;

public class BioteneDryMouthProductsTest extends BaseClass{
	
	BioteneDryMouthProductsPage dmp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("biotene_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		dmp = new BioteneDryMouthProductsPage();
		switchingTab(firstTab);
		launchURL(loadConfig("biotene_Config.properties").getProperty("dryMouthProductsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("biotene_Config.properties").getProperty("dryMouthProductsLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		dmp.clickCookieBtn();
		dmp.clickEmailBtn();
		System.out.println("Cookie Button and Email Pop-up successfully verified in the Preprod URL");
		switchingTab(secondTab);
		dmp.clickCookieBtn();
		dmp.clickEmailBtn();
		System.out.println("Cookie Button and Email Pop-up successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		dmp.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		dmp.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		dmp.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		dmp.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyLearnMoreOne() throws Exception{
		switchingTab(firstTab);
		dmp.clickLearnMoreOne();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		dmp.clickLearnMoreOne();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for LearnMore One : "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyLearnMoreTwo() throws Exception{
		switchingTab(firstTab);
		dmp.clickLearnMoreTwo();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		dmp.clickLearnMoreTwo();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for LearnMore Two : "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyLearnMoreThree() throws Exception{
		switchingTab(firstTab);
		dmp.clickLearnMoreThree();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		dmp.clickLearnMoreThree();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for LearnMore Three : "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyLearnMoreFour() throws Exception{
		switchingTab(firstTab);
		dmp.clickLearnMoreFour();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		dmp.clickLearnMoreFour();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for LearnMore Four : "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyLearnMoreFive() throws Exception{
		switchingTab(firstTab);
		dmp.clickLearnMoreFive();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		dmp.clickLearnMoreFive();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for LearnMore Five : "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyLearnMoreSix() throws Exception{
		switchingTab(firstTab);
		dmp.clickLearnMoreSix();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		dmp.clickLearnMoreSix();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for LearnMore Six : "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyLearnMoreSeven() throws Exception{
		switchingTab(firstTab);
		dmp.clickLearnMoreSeven();
		String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
		switchingTab(secondTab);
		dmp.clickLearnMoreSeven();
		String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for LearnMore Seven : "+compareTwoText);
	}
	

}
