package com.qa.caltrate.eng.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.eng.pages.CaltrateVitaminDandYYourHealth;

public class CaltrateVitaminDandYYourHealthTest extends BaseClass{
	CaltrateVitaminDandYYourHealth cvd;
	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadConfig("CaltrateConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		cvd = new CaltrateVitaminDandYYourHealth();
		switchingTab(firstTab);
		launchURL(loadConfig("CaltrateConfig.properties").getProperty("CaltrateVitaminDandYYourHealthPreprodURL"));
		switchingTab(secondTab);
		launchURL(loadConfig("CaltrateConfig.properties").getProperty("CaltrateVitaminDandYYourHealthLiveURL"));

	}

	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Throwable {
		cvd = new CaltrateVitaminDandYYourHealth();
		switchingTab(firstTab);
		cvd.clickOnCookies();
		System.out.println("Cookie Button clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		cvd.clickOnCookies();
		System.out.println("Cookie Button clicked successfully in the Live URL");
	}
	@Test(priority = 2, enabled = true)
	private void verifyHomeIcon() throws Throwable {
		//tnr = new CaltrateNaturalRemediesForHeartburn();
		switchingTab(firstTab);
		cvd.clickOnHomeIcon();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cvd.clickOnHomeIcon();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 4, enabled = true)
	private void verifyBread_BoneHealthCentral() throws Throwable {
		switchingTab(firstTab);
		cvd.clickOnBread_BoneHealthCentral();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cvd.clickOnBread_BoneHealthCentral();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 4, enabled = true)
	private void verifyBread_Articles() throws Throwable {
		switchingTab(firstTab);
		cvd.clickOnBread_Articles();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cvd.clickOnBread_Articles();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 4, enabled = true)
	private void verifyVitaminDLink() throws Throwable {
		switchingTab(firstTab);
		cvd.clickOnVitaminDLink();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cvd.clickOnVitaminDLink();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 4, enabled = true)
	private void verifyArticles() throws Throwable {
		switchingTab(firstTab);
		cvd.clickOnArticles();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cvd.clickOnArticles();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 4, enabled = true)
	private void verifyDietarySupplement() throws Throwable {
		switchingTab(firstTab);
		cvd.clickOnDietarySupplement();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cvd.clickOnDietarySupplement();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 4, enabled = true)
	private void verifyReadMore() throws Throwable {
		switchingTab(firstTab);
		cvd.clickOnReadMore();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cvd.clickOnReadMore();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 4, enabled = true)
	private void verifyCALTRATE600D3PLUSMINERALSCHEWABLES() throws Throwable {
		switchingTab(firstTab);
		cvd.clickOnCALTRATE600D3PLUSMINERALSCHEWABLES();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cvd.clickOnCALTRATE600D3PLUSMINERALSCHEWABLES();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 4, enabled = true)
	private void verifyAllArticles() throws Throwable {
		switchingTab(firstTab);
		cvd.clickOnAllArticles();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cvd.clickOnAllArticles();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 4, enabled = true)
	private void verifyAllRecipes() throws Throwable {
		switchingTab(firstTab);
		cvd.clickOnAllRecipes();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cvd.clickOnAllRecipes();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 4, enabled = true)
	private void verifyAllHealthTips() throws Throwable {
		switchingTab(firstTab);
		cvd.clickOnAllHealthTips();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cvd.clickOnAllHealthTips();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 4, enabled = true)
	private void verifyAllInteractiveTools() throws Throwable {
		switchingTab(firstTab);
		cvd.clickOnAllInteractiveTools();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cvd.clickOnAllInteractiveTools();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 4, enabled = true)
	private void verifyCalciumAndCalciumCarbonate() throws Throwable {
		switchingTab(firstTab);
		cvd.clickOnCalciumAndCalciumCarbonate();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cvd.clickOnCalciumAndCalciumCarbonate();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 4, enabled = true)
	private void verifyVitaminD() throws Throwable {
		switchingTab(firstTab);
		cvd.clickOnVitaminD();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cvd.clickOnVitaminD();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 4, enabled = true)
	private void verifyOsteoporosis() throws Throwable {
		switchingTab(firstTab);
		cvd.clickOnOsteoporosis();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cvd.clickOnOsteoporosis();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 4, enabled = true)
	private void verifyCalciumSupplements() throws Throwable {
		switchingTab(firstTab);
		cvd.clickOnCalciumSupplements();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cvd.clickOnCalciumSupplements();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

}
