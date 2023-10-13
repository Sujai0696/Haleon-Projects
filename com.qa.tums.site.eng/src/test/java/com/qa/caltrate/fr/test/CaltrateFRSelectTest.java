package com.qa.caltrate.fr.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.fr.pages.CaltrateFRSelectPage;

public class CaltrateFRSelectTest extends BaseClass{
	
CaltrateFRSelectPage cs;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("caltrate_frConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("caltrate_frConfig.properties").getProperty("caltrateSelectPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("caltrate_frConfig.properties").getProperty("caltrateSelectLiveUrl"));
	}
	
	@Test(priority = 0)
	private void verifyBreadcrumbOne() throws Exception{
		cs = new CaltrateFRSelectPage();
		switchingTab(firstTab);
		cs.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Caltrate_fr", 1, 0));
		switchingTab(secondTab);
		cs.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Caltrate_fr", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One :"+compareTwoText);
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		cs.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Caltrate_fr", 1, 0));
		switchingTab(secondTab);
		cs.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Caltrate_fr", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two :"+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		cs.textBreadcrumbThree();
		System.out.println("Breadcrumb Three successfully verified in the preprod URL");
		switchingTab(secondTab);
		cs.textBreadcrumbThree();
		System.out.println("Breadcrumb Three successfully verified in the live URL");
	}
	
	@Test(priority = 3)
	private void verifyAcheter() throws Exception{
		switchingTab(firstTab);
		cs.clickAcheterBtn();
		System.out.println("Acheter Btn is successfully verified in the preprod URL");
		switchingTab(secondTab);
		cs.clickAcheterBtn();
		System.out.println("Acheter Btn is successfully verified in the live URL");
	}
	
	@Test(priority = 4)
	private void verifycoupon() throws Exception{
		switchingTab(firstTab);
		cs.clickCoupon();
		String preProdUrl = compareUrl(excelRead("Caltrate_fr", 1, 0));
		switchingTab(secondTab);
		cs.clickCoupon();
		String liveUrl = compareUrl(excelRead("Caltrate_fr", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for coupon :"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyProduits() throws Exception{
		switchingTab(firstTab);
		cs.clickProduits();
		String preProdUrl = compareUrl(excelRead("Caltrate_fr", 1, 0));
		switchingTab(secondTab);
		cs.clickProduits();
		String liveUrl = compareUrl(excelRead("Caltrate_fr", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Produits :"+compareTwoText);
	}
	

}
