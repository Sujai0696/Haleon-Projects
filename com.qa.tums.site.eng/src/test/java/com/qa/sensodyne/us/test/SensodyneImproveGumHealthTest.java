package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneImproveGumHealthPage;
import com.qa.sensodyne.us.page.SensodyneWhyTeethHurtColdOutsidePage;
import com.qa.tums.eng.util.Retry;

public class SensodyneImproveGumHealthTest extends BaseClass{
	
	SensodyneImproveGumHealthPage ig;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("improveGumHealthPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("improveGumHealthLiveUrl"));
	}

	@Test(priority = 0, retryAnalyzer = Retry.class)
	private void cookieButton() throws Exception {
		ig = new SensodyneImproveGumHealthPage();
		switchingTab(firstTab);
		ig.clickCookieBtn();
		ig.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		ig.clickCookieBtn();
		ig.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyPlaqueLink() throws Exception{
		switchingTab(firstTab);
		ig.clickPlaqueLink();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ig.clickPlaqueLink();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Plaque Link: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyGingivitisLink() throws Exception{
		switchingTab(firstTab);
		ig.clickGingivitisLink();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ig.clickGingivitisLink();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Gingivitis Link: "+compareTwoText);
	}
	
	
	@Test(priority = 3)
	private void verifyToothSensitivity() throws Exception{
		switchingTab(firstTab);
		ig.clickToothSensitivity();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ig.clickToothSensitivity();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Tooth Sensitivity: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyDailyOralHygiene() throws Exception{
		switchingTab(firstTab);
		ig.clickDailyOralHygiene();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ig.clickDailyOralHygiene();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Daily Oral Hygiene: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyToothSensitivityTwo() throws Exception{
		switchingTab(firstTab);
		ig.clickToothSensitivityTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ig.clickToothSensitivityTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Tooth Sensitivity Two: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifySensodyneSensitivityGum() throws Exception{
		switchingTab(firstTab);
		ig.clickSensodyneSensitivityGum();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ig.clickSensodyneSensitivityGum();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Sensitivity Gum: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyTwoBenefits() throws Exception{
		switchingTab(firstTab);
		ig.clickTwoBenefits();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ig.clickTwoBenefits();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Two Benefits: "+compareTwoText);
	}
	
	
	@Test(priority = 8)
	private void verifyRelatedArticleOne() throws Exception{
		switchingTab(firstTab);
		ig.clickRelatedArticleOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ig.clickRelatedArticleOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article one: "+compareTwoText);
	}
	

	@Test(priority = 9)
	private void verifyRelatedArticleTwo() throws Exception{
		switchingTab(firstTab);
		ig.clickRelatedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ig.clickRelatedArticleTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article two: "+compareTwoText);
	}
	

	@Test(priority = 10)
	private void verifyRelatedArticleThree() throws Exception{
		switchingTab(firstTab);
		ig.clickRelatedArticleThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ig.clickRelatedArticleThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article three: "+compareTwoText);
	}
	

	@Test(priority = 11)
	private void verifyRelatedArticleFour() throws Exception{
		switchingTab(firstTab);
		ig.clickRelatedArticleFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ig.clickRelatedArticleFour();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article Four: "+compareTwoText);
	}
	
}
