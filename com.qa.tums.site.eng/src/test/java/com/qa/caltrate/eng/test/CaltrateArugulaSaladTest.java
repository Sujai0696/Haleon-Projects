package com.qa.caltrate.eng.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.eng.pages.CaltrateArugulaSalad;

public class CaltrateArugulaSaladTest extends BaseClass{
	CaltrateArugulaSalad cas;
	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadConfig("CaltrateConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		cas = new CaltrateArugulaSalad();
		switchingTab(firstTab);
		launchURL(loadConfig("CaltrateConfig.properties").getProperty("CaltrateArugulaSaladPreprodURL"));
		switchingTab(secondTab);
		launchURL(loadConfig("CaltrateConfig.properties").getProperty("CaltrateArugulaSaladLiveURL"));

	}

	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Throwable {
		cas = new CaltrateArugulaSalad();
		switchingTab(firstTab);
		cas.clickOnCookies();
		System.out.println("Cookie Button clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		cas.clickOnCookies();
		System.out.println("Cookie Button clicked successfully in the Live URL");
	}
	@Test(priority = 2, enabled = true)
	private void verifyHomeIcon() throws Throwable {
		//tnr = new CaltrateNaturalRemediesForHeartburn();
		switchingTab(firstTab);
		cas.clickOnHomeIcon();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cas.clickOnHomeIcon();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 3, enabled = true)
	private void verifyBread_BoneHealthCentral() throws Throwable {
		switchingTab(firstTab);
		cas.clickOnBread_BoneHealthCentral();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cas.clickOnBread_BoneHealthCentral();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 4, enabled = true)
	private void verifyBread_Recipes() throws Throwable {
		switchingTab(firstTab);
		cas.clickOnBread_Recipes();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cas.clickOnBread_Recipes();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 6, enabled = true)
	private void verifyCalciumAndCalciumCarbonateLink() throws Throwable {
		switchingTab(firstTab);
		cas.clickOnCalciumAndCalciumCarbonateLink();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cas.clickOnCalciumAndCalciumCarbonateLink();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 9, enabled = true)
	private void verifyReadMore() throws Throwable {
		switchingTab(firstTab);
		cas.clickOnReadMore();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cas.clickOnReadMore();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 10, enabled = true)
	private void verifyCALTRATE600D3PLUSMINERALSMINIS() throws Throwable {
		switchingTab(firstTab);
		cas.clickOnCALTRATE600D3PLUSMINERALSMINIS();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cas.clickOnCALTRATE600D3PLUSMINERALSMINIS();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 10, enabled = true)
	private void verifyAllArticles() throws Throwable {
		switchingTab(firstTab);
		cas.clickOnAllArticles();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cas.clickOnAllArticles();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 11, enabled = true)
	private void verifyAllRecipes() throws Throwable {
		switchingTab(firstTab);
		cas.clickOnAllRecipes();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cas.clickOnAllRecipes();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 12, enabled = true)
	private void verifyAllHealthTips() throws Throwable {
		switchingTab(firstTab);
		cas.clickOnAllHealthTips();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cas.clickOnAllHealthTips();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 13, enabled = true)
	private void verifyAllInteractiveTools() throws Throwable {
		switchingTab(firstTab);
		cas.clickOnAllInteractiveTools();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cas.clickOnAllInteractiveTools();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 14, enabled = true)
	private void verifyCalciumAndCalciumCarbonate() throws Throwable {
		switchingTab(firstTab);
		cas.clickOnCalciumAndCalciumCarbonate();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cas.clickOnCalciumAndCalciumCarbonate();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 15, enabled = true)
	private void verifyVitaminD() throws Throwable {
		switchingTab(firstTab);
		cas.clickOnVitaminD();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cas.clickOnVitaminD();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 16, enabled = true)
	private void verifyOsteoporosis() throws Throwable {
		switchingTab(firstTab);
		cas.clickOnOsteoporosis();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cas.clickOnOsteoporosis();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 17, enabled = true)
	private void verifyCalciumSupplements() throws Throwable {
		switchingTab(firstTab);
		cas.clickOnCalciumSupplements();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		cas.clickOnCalciumSupplements();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}


}
