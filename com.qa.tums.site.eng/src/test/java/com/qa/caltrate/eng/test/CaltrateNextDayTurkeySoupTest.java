package com.qa.caltrate.eng.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.eng.pages.CaltrateNextDayTurkeySoup;

public class CaltrateNextDayTurkeySoupTest extends BaseClass{
	CaltrateNextDayTurkeySoup ckc;
	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadConfig("CaltrateConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		ckc = new CaltrateNextDayTurkeySoup();
		switchingTab(firstTab);
		launchURL(loadConfig("CaltrateConfig.properties").getProperty("CaltrateNextDayTurkeySoupPreprodURL"));
		switchingTab(secondTab);
		launchURL(loadConfig("CaltrateConfig.properties").getProperty("CaltrateNextDayTurkeySoupLiveURL"));

	}

	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Throwable {
		ckc = new CaltrateNextDayTurkeySoup();
		switchingTab(firstTab);
		ckc.clickOnCookies();
		System.out.println("Cookie Button clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		ckc.clickOnCookies();
		System.out.println("Cookie Button clicked successfully in the Live URL");
	}
	@Test(priority = 2, enabled = true)
	private void verifyHomeIcon() throws Throwable {
		//tnr = new CaltrateNaturalRemediesForHeartburn();
		switchingTab(firstTab);
		ckc.clickOnHomeIcon();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ckc.clickOnHomeIcon();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 3, enabled = true)
	private void verifyBread_BoneHealthCentral() throws Throwable {
		switchingTab(firstTab);
		ckc.clickOnBread_BoneHealthCentral();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ckc.clickOnBread_BoneHealthCentral();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 4, enabled = true)
	private void verifyBread_Recipes() throws Throwable {
		switchingTab(firstTab);
		ckc.clickOnBread_Recipes();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ckc.clickOnBread_Recipes();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
//	@Test(priority = 6, enabled = true)
//	private void verifyCalciumAndCalciumCarbonateLink() throws Throwable {
//		switchingTab(firstTab);
//		ckc.clickOnCalciumAndCalciumCarbonateLink();
//		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
//		switchingTab(secondTab);
//		ckc.clickOnCalciumAndCalciumCarbonateLink();
//		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
//	}
	@Test(priority = 9, enabled = true)
	private void verifyReadArticle() throws Throwable {
		switchingTab(firstTab);
		ckc.clickOnReadMore();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ckc.clickOnReadMore();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 10, enabled = true)
	private void verifyCALTRATE600D3PLUSMINERALSMINIS() throws Throwable {
		switchingTab(firstTab);
		ckc.clickOnCALTRATE600D3PLUSMINERALSMINIS();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ckc.clickOnCALTRATE600D3PLUSMINERALSMINIS();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 10, enabled = true)
	private void verifyAllArticles() throws Throwable {
		switchingTab(firstTab);
		ckc.clickOnAllArticles();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ckc.clickOnAllArticles();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 11, enabled = true)
	private void verifyAllRecipes() throws Throwable {
		switchingTab(firstTab);
		ckc.clickOnAllRecipes();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ckc.clickOnAllRecipes();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 12, enabled = true)
	private void verifyAllHealthTips() throws Throwable {
		switchingTab(firstTab);
		ckc.clickOnAllHealthTips();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ckc.clickOnAllHealthTips();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 13, enabled = true)
	private void verifyAllInteractiveTools() throws Throwable {
		switchingTab(firstTab);
		ckc.clickOnAllInteractiveTools();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ckc.clickOnAllInteractiveTools();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 14, enabled = true)
	private void verifyCalciumAndCalciumCarbonate() throws Throwable {
		switchingTab(firstTab);
		ckc.clickOnCalciumAndCalciumCarbonate();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ckc.clickOnCalciumAndCalciumCarbonate();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 15, enabled = true)
	private void verifyVitaminD() throws Throwable {
		switchingTab(firstTab);
		ckc.clickOnVitaminD();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ckc.clickOnVitaminD();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 16, enabled = true)
	private void verifyOsteoporosis() throws Throwable {
		switchingTab(firstTab);
		ckc.clickOnOsteoporosis();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ckc.clickOnOsteoporosis();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 17, enabled = true)
	private void verifyCalciumSupplements() throws Throwable {
		switchingTab(firstTab);
		ckc.clickOnCalciumSupplements();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		ckc.clickOnCalciumSupplements();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

}
