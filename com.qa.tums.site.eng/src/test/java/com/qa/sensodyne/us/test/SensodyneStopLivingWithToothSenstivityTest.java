package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneMouthwashForSensitiveTeeth;
import com.qa.sensodyne.us.page.SensodyneStopLivingWithToothSenstivity;

public class SensodyneStopLivingWithToothSenstivityTest extends BaseClass {
	SensodyneStopLivingWithToothSenstivity ssl;
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
		
	}
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("stopLivingWithToothSensitivityPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("stopLivingWithToothSensitivityLiveUrl"));
	}
	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Exception {
	ssl =new SensodyneStopLivingWithToothSenstivity();
	switchingTab(firstTab);
	ssl.clickCookieBtn();
	ssl.clickGigyaForm();
	System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
	switchingTab(secondTab);
	ssl.clickCookieBtn();
	ssl.clickGigyaForm();
	System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}

	@Test(priority = 10)
	private void verifyBackToTheArticleList() throws Exception{
		switchingTab(firstTab);
		ssl.clickOnBackToTheArticleList();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ssl.clickOnBackToTheArticleList();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 10)
	private void verifySensodyne() throws Exception{
		switchingTab(firstTab);
		ssl.clickSensodyne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ssl.clickSensodyne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 10)
	private void verifySensodyneRapidRelief() throws Exception{
		switchingTab(firstTab);
		ssl.clickSensodyneRapidRelief();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ssl.clickSensodyneRapidRelief();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 10)
	private void verifyRelatedArticleOne() throws Exception{
		switchingTab(firstTab);
		ssl.clickRealatedArticleOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ssl.clickRealatedArticleOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}

	@Test(priority = 11)
	private void verifyRelatedArticleTwo() throws Exception{
		switchingTab(firstTab);
		ssl.clickRealatedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ssl.clickRealatedArticleTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article two :"+compareTwoText);
	}

	@Test(priority = 12)
	private void verifyRelatedArticleThree() throws Exception{
		switchingTab(firstTab);
		ssl.clickRealatedArticleThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ssl.clickRealatedArticleThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article three :"+compareTwoText);
	}

	@Test(priority = 13)
	private void verifyRelatedArticleFour() throws Exception{
		switchingTab(firstTab);
		ssl.clickRealatedArticleFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ssl.clickRealatedArticleFour();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article Four :"+compareTwoText);
	}

}
