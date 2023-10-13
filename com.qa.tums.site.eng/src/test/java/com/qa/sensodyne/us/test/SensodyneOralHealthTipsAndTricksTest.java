package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneOralHealthTipsAndTricksPage;
import com.qa.sensodyne.us.page.SensodyneWhyTeethHurtColdOutsidePage;
import com.qa.tums.eng.util.Retry;

public class SensodyneOralHealthTipsAndTricksTest extends BaseClass{
	
	SensodyneOralHealthTipsAndTricksPage tt;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("oralHealthTipsAndTricksPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("oralHealthTipsAndTricksLiveUrl"));
	}

	@Test(priority = 0, retryAnalyzer = Retry.class)
	private void cookieButton() throws Exception {
		tt = new SensodyneOralHealthTipsAndTricksPage();
		switchingTab(firstTab);
		tt.clickCookieBtn();
		tt.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		tt.clickCookieBtn();
		tt.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}
	
	
	@Test(priority = 1)
	private void verifyBackToTheArticleList() throws Exception{
		switchingTab(firstTab);
		tt.clickBackToTheArticleList();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		tt.clickBackToTheArticleList();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for back to the article list: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyKristinPiper() throws Exception{
		switchingTab(firstTab);
		tt.clickKristinPiperLink();
		String preProdUrl = getCurrentUrl();
		switchingTab(secondTab);
		tt.clickKristinPiperLink();
		String liveUrl = getCurrentUrl();
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for kristin piper link: "+compareTwoText);
	}
	
	
	@Test(priority = 3)
	private void verifySensodyneRapidRelief() throws Exception{
		switchingTab(firstTab);
		tt.clickSensodyneRapidRelief();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		tt.clickSensodyneRapidRelief();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Rapid Relief: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyRelatedArtilceOne() throws Exception{
		switchingTab(firstTab);
		tt.clickRelatedArticleOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		tt.clickRelatedArticleOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Related Article One: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyRelatedArtilceTwo() throws Exception{
		switchingTab(firstTab);
		tt.clickRelatedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		tt.clickRelatedArticleTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Related Article two: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyRelatedArtilceThree() throws Exception{
		switchingTab(firstTab);
		tt.clickRelatedArticleThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		tt.clickRelatedArticleThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Related Article three: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyRelatedArtilceFour() throws Exception{
		switchingTab(firstTab);
		tt.clickRelatedArticleFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		tt.clickRelatedArticleFour ();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Related Article four: "+compareTwoText);
	}
	
	
	
	

}
