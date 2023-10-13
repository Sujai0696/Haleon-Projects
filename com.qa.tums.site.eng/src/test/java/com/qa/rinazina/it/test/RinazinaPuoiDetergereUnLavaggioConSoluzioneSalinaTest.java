package com.qa.rinazina.it.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.rinazina.it.pages.RinazinaPuoiDetergereUnLavaggioConSoluzioneSalina;

public class RinazinaPuoiDetergereUnLavaggioConSoluzioneSalinaTest extends BaseClass {
	RinazinaPuoiDetergereUnLavaggioConSoluzioneSalina rpd;
	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadConfig("rinazina_itConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		rpd = new RinazinaPuoiDetergereUnLavaggioConSoluzioneSalina();
		switchingTab(firstTab);
		launchURL(loadConfig("rinazina_itConfig.properties").getProperty("RinazinaPuoiDetergereUnLavaggioConSoluzioneSalinaPreprodURL"));
		switchingTab(secondTab);
		launchURL(loadConfig("rinazina_itConfig.properties").getProperty("RinazinaPuoiDetergereUnLavaggioConSoluzioneSalinaLiveURL"));

	}

	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Throwable {
		rpd = new RinazinaPuoiDetergereUnLavaggioConSoluzioneSalina();
		switchingTab(firstTab);
		rpd.clickonCookieBtn();
		System.out.println("Cookie Button clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		rpd.clickonCookieBtn();
		System.out.println("Cookie Button clicked successfully in the Live URL");
	}
	@Test(priority = 2, enabled = true)
	private void verifyBread_Home() throws Throwable {
		//tnr = new CaltrateNaturalRemediesForHeartburn();
		switchingTab(firstTab);
		rpd.clickOnBread_Home();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		rpd.clickOnBread_Home();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 3, enabled = true)
	private void verifyBread_ConsigliSullaSaluteNasale() throws Throwable {
		//tnr = new CaltrateNaturalRemediesForHeartburn();
		switchingTab(firstTab);
		rpd.clickOnBread_ConsigliSullaSaluteNasale();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		rpd.clickOnBread_ConsigliSullaSaluteNasale();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 4, enabled = true)
	private void verifyPerSaperneDiPiùBtn() throws Throwable {
		//tnr = new CaltrateNaturalRemediesForHeartburn();
		switchingTab(firstTab);
		rpd.clickOnPerSaperneDiPiùBtn();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		rpd.clickOnPerSaperneDiPiùBtn();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 5, enabled = true)
	private void verifyArticleOne() throws Throwable {
		//tnr = new CaltrateNaturalRemediesForHeartburn();
		switchingTab(firstTab);
		rpd.clickOnArticleOne();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		rpd.clickOnArticleOne();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 6, enabled = true)
	private void verifyArticleTwo() throws Throwable {
		//tnr = new CaltrateNaturalRemediesForHeartburn();
		switchingTab(firstTab);
		rpd.clickOnArticleTwo();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		rpd.clickOnArticleTwo();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 7, enabled = true)
	private void verifyArticleThree() throws Throwable {
		//tnr = new CaltrateNaturalRemediesForHeartburn();
		switchingTab(firstTab);
		rpd.clickOnArticleThree();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		rpd.clickOnArticleThree();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 8, enabled = true)
	private void verifyArticleFour() throws Throwable {
		//tnr = new CaltrateNaturalRemediesForHeartburn();
		switchingTab(firstTab);
		rpd.clickOnArticleFour();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		rpd.clickOnArticleFour();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}


}
