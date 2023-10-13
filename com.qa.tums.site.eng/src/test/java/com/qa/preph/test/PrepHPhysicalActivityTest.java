package com.qa.preph.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.preph.pages.PrepHPhysicalActivity;

public class PrepHPhysicalActivityTest extends BaseClass{
	PrepHPhysicalActivity ppa;
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("preph_Config.properties").getProperty("browser"));
		launchTwoUrl();
		
	}
	@BeforeMethod
	
	private void launchingTheUrl() throws Exception {
		ppa =new PrepHPhysicalActivity();
		switchingTab(firstTab);
		launchURL(loadConfig("preph_Config.properties").getProperty("PrepHPhysicalActivityPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("preph_Config.properties").getProperty("PrepHPhysicalActivityLiveUrl"));
	}
	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Exception {
	ppa =new PrepHPhysicalActivity();
	switchingTab(firstTab);
	ppa.clickCookieBtn();
	System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
	switchingTab(secondTab);
	ppa.clickCookieBtn();
	System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
}
	@Test(priority = 2)
	private void verifyBreadHome() throws Exception{
		ppa =new PrepHPhysicalActivity();
		switchingTab(firstTab);
		ppa.clickBreadHome();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		ppa.clickBreadHome();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 3)
	private void verifyBreadArticles() throws Exception{
		switchingTab(firstTab);
		ppa.clickBreadArticles();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		ppa.clickBreadArticles();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 4)
	private void verifyflareupsAndNewHemorrhoids() throws Exception{
		switchingTab(firstTab);
		ppa.clickflareupsAndNewHemorrhoids();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		ppa.clickflareupsAndNewHemorrhoids();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 5)
	private void verifyReduceYourRiskOfFlareUps() throws Exception{
		switchingTab(firstTab);
		ppa.clickReduceYourRiskOfFlareUps();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		ppa.clickReduceYourRiskOfFlareUps();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 6)
	private void verifyHemorrhoidsAndWhattoDoAboutThem() throws Exception{
		switchingTab(firstTab);
		ppa.clickHemorrhoidsAndWhattoDoAboutThem();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		ppa.clickHemorrhoidsAndWhattoDoAboutThem();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 7)
	private void verifyReduceYourSymptoms() throws Exception{
		ppa =new PrepHPhysicalActivity();
		switchingTab(firstTab);
		ppa.clickReduceYourSymptoms();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		ppa.clickReduceYourSymptoms();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 8)
	private void verifyPreventConstipation() throws Exception{
		switchingTab(firstTab);
		ppa.clickPreventConstipation();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		ppa.clickPreventConstipation();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 9)
	private void verifyArticle1() throws Exception{
		switchingTab(firstTab);
		ppa.clickArticle1();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		ppa.clickArticle1();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 10)
	private void verifyArticle2() throws Exception{
		switchingTab(firstTab);
		ppa.clickArticle2();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		ppa.clickArticle2();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 11)
	private void verifyArticle3() throws Exception{
		switchingTab(firstTab);
		ppa.clickArticle3();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		ppa.clickArticle3();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}

}
