package com.qa.caltrate.eng.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.eng.pages.CaltrateWorkYourUpperBodyYardWork;

public class CaltrateWorkYourUpperBodyYardWorkTest extends BaseClass{
	CaltrateWorkYourUpperBodyYardWork cwy;
	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadConfig("CaltrateConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		cwy = new CaltrateWorkYourUpperBodyYardWork();
		switchingTab(firstTab);
		launchURL(loadConfig("CaltrateConfig.properties").getProperty("CaltrateWorkYourUpperBodyYardWorkPreprodURL"));
		switchingTab(secondTab);
		launchURL(loadConfig("CaltrateConfig.properties").getProperty("CaltrateWorkYourUpperBodyYardWorkLiveURL"));

	}

	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Throwable {
		cwy = new CaltrateWorkYourUpperBodyYardWork();
		switchingTab(firstTab);
		cwy.clickOnCookies();
		System.out.println("Cookie Button clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		cwy.clickOnCookies();
		System.out.println("Cookie Button clicked successfully in the Live URL");
	}
	@Test(priority = 2, enabled = true)
	private void verifyHomeIcon() throws Throwable {
		//tnr = new CaltrateNaturalRemediesForHeartburn();
		switchingTab(firstTab);
		cwy.clickOnHomeIcon();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cwy.clickOnHomeIcon();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 4, enabled = true)
	private void verifyBread_BoneHealthCentral() throws Throwable {
		switchingTab(firstTab);
		cwy.clickOnBread_BoneHealthCentral();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cwy.clickOnBread_BoneHealthCentral();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 4, enabled = true)
	private void verifyBread_HealthTip() throws Throwable {
		switchingTab(firstTab);
		cwy.clickOnBread_HealthTip();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cwy.clickOnBread_HealthTip();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 4, enabled = true)
	private void verifyHealthTipLink() throws Throwable {
		switchingTab(firstTab);
		cwy.clickOnHealthTipLink();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cwy.clickOnHealthTipLink();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 4, enabled = true)
	private void verifyAllArticles() throws Throwable {
		switchingTab(firstTab);
		cwy.clickOnAllArticles();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cwy.clickOnAllArticles();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 4, enabled = true)
	private void verifyAllRecipes() throws Throwable {
		switchingTab(firstTab);
		cwy.clickOnAllRecipes();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cwy.clickOnAllRecipes();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 4, enabled = true)
	private void verifyAllHealthTips() throws Throwable {
		switchingTab(firstTab);
		cwy.clickOnAllHealthTips();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cwy.clickOnAllHealthTips();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 4, enabled = true)
	private void verifyAllInteractiveTools() throws Throwable {
		switchingTab(firstTab);
		cwy.clickOnAllInteractiveTools();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cwy.clickOnAllInteractiveTools();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 4, enabled = true)
	private void verifyCalciumAndCalciumCarbonate() throws Throwable {
		switchingTab(firstTab);
		cwy.clickOnCalciumAndCalciumCarbonate();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cwy.clickOnCalciumAndCalciumCarbonate();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 4, enabled = true)
	private void verifyVitaminD() throws Throwable {
		switchingTab(firstTab);
		cwy.clickOnVitaminD();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cwy.clickOnVitaminD();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 4, enabled = true)
	private void verifyOsteoporosis() throws Throwable {
		switchingTab(firstTab);
		cwy.clickOnOsteoporosis();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cwy.clickOnOsteoporosis();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 4, enabled = true)
	private void verifyCalciumSupplements() throws Throwable {
		switchingTab(firstTab);
		cwy.clickOnCalciumSupplements();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cwy.clickOnCalciumSupplements();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	
}
