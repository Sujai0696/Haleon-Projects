package com.qa.rinazina.it.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.rinazina.it.pages.RinazinaComeLiberareIlNasoChiusoConUnoSprayPerLlNaso;

public class RinazinaComeLiberareIlNasoChiusoConUnoSprayPerLlNasoTest extends BaseClass{
	RinazinaComeLiberareIlNasoChiusoConUnoSprayPerLlNaso rcl;
	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadConfig("rinazina_itConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		rcl = new RinazinaComeLiberareIlNasoChiusoConUnoSprayPerLlNaso();
		switchingTab(firstTab);
		launchURL(loadConfig("rinazina_itConfig.properties").getProperty("RinazinaComeLiberareIlNasoChiusoConUnoSprayPerLlNasoPreprodURL"));
		switchingTab(secondTab);
		launchURL(loadConfig("rinazina_itConfig.properties").getProperty("RinazinaComeLiberareIlNasoChiusoConUnoSprayPerLlNasoLiveURL"));

	}

	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Throwable {
		rcl = new RinazinaComeLiberareIlNasoChiusoConUnoSprayPerLlNaso();
		switchingTab(firstTab);
		rcl.clickonCookieBtn();
		System.out.println("Cookie Button clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		rcl.clickonCookieBtn();
		System.out.println("Cookie Button clicked successfully in the Live URL");
	}
	@Test(priority = 2, enabled = true)
	private void verifyBread_Home() throws Throwable {
		//tnr = new CaltrateNaturalRemediesForHeartburn();
		switchingTab(firstTab);
		rcl.clickOnBread_Home();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		rcl.clickOnBread_Home();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 3, enabled = true)
	private void verifyBread_ConsigliSullaSaluteNasale() throws Throwable {
		//tnr = new CaltrateNaturalRemediesForHeartburn();
		switchingTab(firstTab);
		rcl.clickOnBread_ConsigliSullaSaluteNasale();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		rcl.clickOnBread_ConsigliSullaSaluteNasale();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 4, enabled = true)
	private void verifyPerSaperneDiPiùBtn() throws Throwable {
		//tnr = new CaltrateNaturalRemediesForHeartburn();
		switchingTab(firstTab);
		rcl.clickOnPerSaperneDiPiùBtn();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		rcl.clickOnPerSaperneDiPiùBtn();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 5, enabled = true)
	private void verifyArticleOne() throws Throwable {
		//tnr = new CaltrateNaturalRemediesForHeartburn();
		switchingTab(firstTab);
		rcl.clickOnArticleOne();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		rcl.clickOnArticleOne();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 6, enabled = true)
	private void verifyArticleTwo() throws Throwable {
		//tnr = new CaltrateNaturalRemediesForHeartburn();
		switchingTab(firstTab);
		rcl.clickOnArticleTwo();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		rcl.clickOnArticleTwo();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 7, enabled = true)
	private void verifyArticleThree() throws Throwable {
		//tnr = new CaltrateNaturalRemediesForHeartburn();
		switchingTab(firstTab);
		rcl.clickOnArticleThree();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		rcl.clickOnArticleThree();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 8, enabled = true)
	private void verifyArticleFour() throws Throwable {
		//tnr = new CaltrateNaturalRemediesForHeartburn();
		switchingTab(firstTab);
		rcl.clickOnArticleFour();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		rcl.clickOnArticleFour();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	

}
