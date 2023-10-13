package com.qa.preph.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.preph.pages.PrepHHowToTellYouHaveHemorrhoids;

public class PrepHHowToTellYouHaveHemorrhoidsTest extends BaseClass{
	PrepHHowToTellYouHaveHemorrhoids pht;
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("preph_Config.properties").getProperty("browser"));
		launchTwoUrl();
		
	}
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("preph_Config.properties").getProperty("PrepHHowToTellYouHaveHemorrhoidsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("preph_Config.properties").getProperty("PrepHHowToTellYouHaveHemorrhoidsLiveUrl"));
	}
	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Exception {
	pht =new PrepHHowToTellYouHaveHemorrhoids();
	switchingTab(firstTab);
	pht.clickCookieBtn();
	System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
	switchingTab(secondTab);
	pht.clickCookieBtn();
	System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
}
	@Test(priority = 2)
	private void verifyBreadHome() throws Exception{
		pht =new PrepHHowToTellYouHaveHemorrhoids();
		switchingTab(firstTab);
		pht.clickBreadHome();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pht.clickBreadHome();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 3)
	private void verifyBreadArticles() throws Exception{
		switchingTab(firstTab);
		pht.clickBreadArticles();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pht.clickBreadArticles();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 4)
	private void verifyCausesHemorrhoids() throws Exception{
		switchingTab(firstTab);
		pht.clickCausesHemorrhoids();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pht.clickCausesHemorrhoids();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 5)
	private void verifySymptoms() throws Exception{
		pht =new PrepHHowToTellYouHaveHemorrhoids();
		switchingTab(firstTab);
		pht.clickSymptoms();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pht.clickSymptoms();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 6)
	private void verifyArticle1() throws Exception{
		switchingTab(firstTab);
		pht.clickArticle1();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pht.clickArticle1();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 7)
	private void verifyArticle2() throws Exception{
		switchingTab(firstTab);
		pht.clickArticle2();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pht.clickArticle2();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 8)
	private void verifyArticle3() throws Exception{
		switchingTab(firstTab);
		pht.clickArticle3();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pht.clickArticle3();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	

}
