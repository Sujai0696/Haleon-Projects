package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneToothSensitivityAfterCavityFilling;

public class SensoDyneToothSensitivityAfterCavityFillingTest extends BaseClass {
	SensodyneToothSensitivityAfterCavityFilling tsa;
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
		
	}
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("SensodyneToothSensitivityAfterCavityPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("SensodyneToothSensitivityAfterCavityLiveUrl"));
	}
	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Exception {
	tsa =new SensodyneToothSensitivityAfterCavityFilling();
	switchingTab(firstTab);
	tsa.clickCookieBtn();
	tsa.clickGigyaForm();
	System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
	switchingTab(secondTab);
	tsa.clickCookieBtn();
	tsa.clickGigyaForm();
	System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}

	@Test(priority = 2)
	private void verifyBackToTheArticleList() throws Exception{
		switchingTab(firstTab);
		tsa.clickOnBackToTheArticleList();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		tsa.clickOnBackToTheArticleList();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);
	}
	@Test(priority = 3)
	private void verifyOralHealthCare() throws Exception{
		switchingTab(firstTab);
		tsa.clickChristineFrankDDS();
		String preProdUrl = getCurrentUrl();
		switchingTab(secondTab);
		tsa.clickChristineFrankDDS();
		String liveUrl = getCurrentUrl();
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);
	}
	@Test(priority = 4)
	private void verifyCausingPulpitis() throws Exception{
		switchingTab(firstTab);
		tsa.clickCausingPulpitis();
		String preProdUrl = getCurrentUrl();
		switchingTab(secondTab);
		tsa.clickCausingPulpitis();
		String liveUrl = getCurrentUrl();
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);
	}
	@Test(priority = 5)
	private void verifySlightlyChangedYourBite() throws Exception{
		switchingTab(firstTab);
		tsa.clickSlightlyChangedYourBite();
		String preProdUrl = getCurrentUrl();
		switchingTab(secondTab);
		tsa.clickSlightlyChangedYourBite();
		String liveUrl = getCurrentUrl();
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);
	}
	@Test(priority = 6)
	private void verifyOtherReasons() throws Exception{
		switchingTab(firstTab);
		tsa.clickOtherReasons();
		String preProdUrl = getCurrentUrl();
		switchingTab(secondTab);
		tsa.clickOtherReasons();
		String liveUrl = getCurrentUrl();
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);
	}
	@Test(priority = 7)
	private void verifyGoAwayEntirely() throws Exception{
		switchingTab(firstTab);
		tsa.clickGoAwayEntirely();
		String preProdUrl = getCurrentUrl();
		switchingTab(secondTab);
		tsa.clickGoAwayEntirely();
		String liveUrl = getCurrentUrl();
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);
	}
	@Test(priority = 8)
	private void verifyNonsteroidalAntiInflammatory() throws Exception{
		switchingTab(firstTab);
		tsa.clickNonsteroidalAntiInflammatory();
		String preProdUrl = getCurrentUrl();
		switchingTab(secondTab);
		tsa.clickNonsteroidalAntiInflammatory();
		String liveUrl = getCurrentUrl();
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);
	}
	@Test(priority = 9)
	private void verifyrelatedArticleOne() throws Exception{
		switchingTab(firstTab);
		tsa.clickThisKindOfTooth();
		String preProdUrl = getCurrentUrl();
		switchingTab(secondTab);
		tsa.clickThisKindOfTooth();
		String liveUrl = getCurrentUrl();
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);
	}
	@Test(priority = 10)
	private void verifySensodyneRapidRelief() throws Exception{
		switchingTab(firstTab);
		tsa.clickSensodyneRapidRelief();
		String preProdUrl = getCurrentUrl();
		switchingTab(secondTab);
		tsa.clickSensodyneRapidRelief();
		String liveUrl = getCurrentUrl();
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyRelatedArticleOne() throws Exception{
		tsa =new SensodyneToothSensitivityAfterCavityFilling();
		switchingTab(firstTab);
		tsa.clickRealatedArticleThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		tsa.clickRealatedArticleOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);
	}

	@Test(priority = 12)
	private void verifyRelatedArticleTwo() throws Exception{
		switchingTab(firstTab);
		tsa.clickRealatedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		tsa.clickRealatedArticleTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}

	@Test(priority = 13)
	private void verifyRelatedArticleThree() throws Exception{
		tsa =new SensodyneToothSensitivityAfterCavityFilling();
		switchingTab(firstTab);
		tsa.clickRealatedArticleThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		tsa.clickRealatedArticleThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);
	}

	@Test(priority = 14)
	private void verifyRelatedArticleFour() throws Exception{
		switchingTab(firstTab);
		tsa.clickRealatedArticleFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		tsa.clickRealatedArticleFour();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);
	}

}
