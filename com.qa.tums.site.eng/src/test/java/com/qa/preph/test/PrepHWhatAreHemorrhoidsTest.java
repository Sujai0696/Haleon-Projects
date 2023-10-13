package com.qa.preph.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.preph.pages.PrepHWhatAreHemorrhoids;

public class PrepHWhatAreHemorrhoidsTest extends BaseClass{
	PrepHWhatAreHemorrhoids pwa;
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("preph_Config.properties").getProperty("browser"));
		launchTwoUrl();
		
	}
	@BeforeMethod
	
	private void launchingTheUrl() throws Exception {
		pwa =new PrepHWhatAreHemorrhoids();
		switchingTab(firstTab);
		launchURL(loadConfig("preph_Config.properties").getProperty("PrepHWhatAreHemorrhoidsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("preph_Config.properties").getProperty("PrepHWhatAreHemorrhoidsLiveUrl"));
	}
	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Exception {
	pwa =new PrepHWhatAreHemorrhoids();
	switchingTab(firstTab);
	pwa.clickCookieBtn();
	System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
	switchingTab(secondTab);
	pwa.clickCookieBtn();
	System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
}
	@Test(priority = 2)
	private void verifyBreadHome() throws Exception{
		pwa =new PrepHWhatAreHemorrhoids();
		switchingTab(firstTab);
		pwa.clickBreadHome();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pwa.clickBreadHome();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 3)
	private void verifyBreadArticles() throws Exception{
		switchingTab(firstTab);
		pwa.clickBreadArticles();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pwa.clickBreadArticles();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 4)
	private void verifyHarvardHealthPublications() throws Exception{
		switchingTab(firstTab);
		pwa.clickHarvardHealthPublications();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pwa.clickHarvardHealthPublications();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 5)
	private void verifyFlareUps() throws Exception{
		switchingTab(firstTab);
		pwa.clickFlareUps();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pwa.clickFlareUps();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 6)
	private void verifyreliefFromFlareUpSymptomsWithPREPARATIONHProducts() throws Exception{
		switchingTab(firstTab);
		pwa.clickreliefFromFlareUpSymptomsWithPREPARATIONHProducts();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pwa.clickreliefFromFlareUpSymptomsWithPREPARATIONHProducts();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 7)
	private void verifyExercising() throws Exception{
		pwa =new PrepHWhatAreHemorrhoids();
		switchingTab(firstTab);
		pwa.clickExercising();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pwa.clickExercising();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 8)
	private void verifyManageYourSymptoms() throws Exception{
		switchingTab(firstTab);
		pwa.clickManageYourSymptoms();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pwa.clickManageYourSymptoms();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyArticle1() throws Exception{
		switchingTab(firstTab);
		pwa.clickArticle1();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pwa.clickArticle1();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 14)
	private void verifyArticle2() throws Exception{
		switchingTab(firstTab);
		pwa.clickArticle2();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pwa.clickArticle2();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 15)
	private void verifyArticle3() throws Exception{
		switchingTab(firstTab);
		pwa.clickArticle3();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pwa.clickArticle3();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}

}
