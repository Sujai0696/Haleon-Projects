package com.qa.caltrate.fr.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.fr.pages.CaltrateFRGeleesCaltratePage;

public class CaltrateFRGeleesCaltrateTest extends BaseClass{

	CaltrateFRGeleesCaltratePage gc;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("caltrate_frConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("caltrate_frConfig.properties").getProperty("geleesCaltratePreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("caltrate_frConfig.properties").getProperty("geleesCaltrateLiveUrl"));
	}
	
	@Test(priority = 0)
	private void verifyBreadcrumbOne() throws Exception{
		gc = new CaltrateFRGeleesCaltratePage();
		switchingTab(firstTab);
		gc.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Caltrate_fr", 1, 0));
		switchingTab(secondTab);
		gc.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Caltrate_fr", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One :"+compareTwoText);
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		gc.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Caltrate_fr", 1, 0));
		switchingTab(secondTab);
		gc.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Caltrate_fr", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two :"+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		gc.textBreadcrumbThree();
		System.out.println("Breadcrumb Three successfully verified in the preprod URL");
		switchingTab(secondTab);
		gc.textBreadcrumbThree();
		System.out.println("Breadcrumb Three successfully verified in the live URL");
	}
	
	@Test(priority = 3)
	private void verifyAcheter() throws Exception{
		switchingTab(firstTab);
		gc.clickAcheterBtn();
		System.out.println("Acheter Btn is successfully verified in the preprod URL");
		switchingTab(secondTab);
		gc.clickAcheterBtn();
		System.out.println("Acheter Btn is successfully verified in the live URL");
	}
	
	@Test(priority = 4)
	private void verifycoupon() throws Exception{
		switchingTab(firstTab);
		gc.clickCoupon();
		String preProdUrl = compareUrl(excelRead("Caltrate_fr", 1, 0));
		switchingTab(secondTab);
		gc.clickCoupon();
		String liveUrl = compareUrl(excelRead("Caltrate_fr", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for coupon :"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyProduits() throws Exception{
		switchingTab(firstTab);
		gc.clickProduits();
		String preProdUrl = compareUrl(excelRead("Caltrate_fr", 1, 0));
		switchingTab(secondTab);
		gc.clickProduits();
		String liveUrl = compareUrl(excelRead("Caltrate_fr", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Produits :"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifySaveNowImg() throws Exception{
		switchingTab(firstTab);
		String preProdUrl = gc.clickImgLink();
		System.out.println(preProdUrl);
		switchingTab(secondTab);
		String liveUrl = gc.clickImgLink();
		System.out.println(liveUrl);
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for IMG link :"+compareTwoText);
	}
}
