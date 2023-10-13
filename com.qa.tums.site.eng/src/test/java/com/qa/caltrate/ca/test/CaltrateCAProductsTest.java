package com.qa.caltrate.ca.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.ca.pages.CaltrateCAProducts;

public class CaltrateCAProductsTest extends BaseClass{
	CaltrateCAProducts ccp;
	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadConfig("CaltrateConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		ccp = new CaltrateCAProducts();
		switchingTab(firstTab);
		launchURL(loadConfig("Caltrate_caConfig.properties").getProperty("CaltrateProductPreprodURL"));
		switchingTab(secondTab);
		launchURL(loadConfig("Caltrate_caConfig.properties").getProperty("CaltrateProductLiveURL"));

	}

	
	@Test(priority = 2, enabled = true)
	private void verifyHomeIcon() throws Throwable {
		//tnr = new CaltrateNaturalRemediesForHeartburn();
		switchingTab(firstTab);
		ccp.clickOnHomeIcon();
		String preProdUrl = compareUrl(excelRead("CaltrateCA", 1, 0));
		switchingTab(secondTab);
		ccp.clickOnHomeIcon();
		String liveUrl = compareUrl(excelRead("CaltrateCA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 3, enabled = true)
	private void verifyProduct1() throws Throwable {
		switchingTab(firstTab);
		ccp.clickOnProduct1();
		String preProdUrl = compareUrl(excelRead("CaltrateCA", 1, 0));
		switchingTab(secondTab);
		ccp.clickOnProduct1();
		String liveUrl = compareUrl(excelRead("CaltrateCA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 3, enabled = true)
	private void verifyProduct2() throws Throwable {
		switchingTab(firstTab);
		ccp.clickOnProduct2();
		String preProdUrl = compareUrl(excelRead("CaltrateCA", 1, 0));
		switchingTab(secondTab);
		ccp.clickOnProduct2();
		String liveUrl = compareUrl(excelRead("CaltrateCA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 3, enabled = true)
	private void verifyProduct3() throws Throwable {
		switchingTab(firstTab);
		ccp.clickOnProduct3();
		String preProdUrl = compareUrl(excelRead("CaltrateCA", 1, 0));
		switchingTab(secondTab);
		ccp.clickOnProduct3();
		String liveUrl = compareUrl(excelRead("CaltrateCA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 3, enabled = true)
	private void verifyProduct4() throws Throwable {
		switchingTab(firstTab);
		ccp.clickOnProduct4();
		String preProdUrl = compareUrl(excelRead("CaltrateCA", 1, 0));
		switchingTab(secondTab);
		ccp.clickOnProduct4();
		String liveUrl = compareUrl(excelRead("CaltrateCA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 3, enabled = true)
	private void verifyProduct5() throws Throwable {
		switchingTab(firstTab);
		ccp.clickOnProduct5();
		String preProdUrl = compareUrl(excelRead("CaltrateCA", 1, 0));
		switchingTab(secondTab);
		ccp.clickOnProduct5();
		String liveUrl = compareUrl(excelRead("CaltrateCA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 3, enabled = true)
	private void verifyProduct6() throws Throwable {
		switchingTab(firstTab);
		ccp.clickOnProduct6();
		String preProdUrl = compareUrl(excelRead("CaltrateCA", 1, 0));
		switchingTab(secondTab);
		ccp.clickOnProduct6();
		String liveUrl = compareUrl(excelRead("CaltrateCA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 3, enabled = true)
	private void verifyProduct7() throws Throwable {
		switchingTab(firstTab);
		ccp.clickOnProduct7();
		String preProdUrl = compareUrl(excelRead("CaltrateCA", 1, 0));
		switchingTab(secondTab);
		ccp.clickOnProduct7();
		String liveUrl = compareUrl(excelRead("CaltrateCA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 3, enabled = true)
	private void verifyCaltratePLUS() throws Throwable {
		switchingTab(firstTab);
		ccp.clickOnCaltratePLUS();
		String preProdUrl = compareUrl(excelRead("CaltrateCA", 1, 0));
		switchingTab(secondTab);
		ccp.clickOnCaltratePLUS();
		String liveUrl = compareUrl(excelRead("CaltrateCA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 3, enabled = true)
	private void verifyCaltratewithVitaminD() throws Throwable {
		switchingTab(firstTab);
		ccp.clickOnCaltratewithVitaminD();
		String preProdUrl = compareUrl(excelRead("CaltrateCA", 1, 0));
		switchingTab(secondTab);
		ccp.clickOnCaltratewithVitaminD();
		String liveUrl = compareUrl(excelRead("CaltrateCA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 3, enabled = true)
	private void verifyCaltrateSELECT() throws Throwable {
		switchingTab(firstTab);
		ccp.clickOnCaltrateSELECT();
		String preProdUrl = compareUrl(excelRead("CaltrateCA", 1, 0));
		switchingTab(secondTab);
		ccp.clickOnCaltrateSELECT();
		String liveUrl = compareUrl(excelRead("CaltrateCA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 3, enabled = true)
	private void verifyCaltrate() throws Throwable {
		switchingTab(firstTab);
		ccp.clickOnCaltrate();
		String preProdUrl = compareUrl(excelRead("CaltrateCA", 1, 0));
		switchingTab(secondTab);
		ccp.clickOnCaltrate();
		String liveUrl = compareUrl(excelRead("CaltrateCA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 3, enabled = true)
	private void verifyCaltrateGummies() throws Throwable {
		switchingTab(firstTab);
		ccp.clickOnCaltrateGummies();
		String preProdUrl = compareUrl(excelRead("CaltrateCA", 1, 0));
		switchingTab(secondTab);
		ccp.clickOnCaltrateGummies();
		String liveUrl = compareUrl(excelRead("CaltrateCA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 3, enabled = true)
	private void verifyCaltrateSoftChews() throws Throwable {
		switchingTab(firstTab);
		ccp.clickOnCaltrateSoftChews();
		String preProdUrl = compareUrl(excelRead("CaltrateCA", 1, 0));
		switchingTab(secondTab);
		ccp.clickOnCaltrateSoftChews();
		String liveUrl = compareUrl(excelRead("CaltrateCA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 3, enabled = true)
	private void verifyCaltratePLUSChewables() throws Throwable {
		switchingTab(firstTab);
		ccp.clickOnCaltratePLUSChewables();
		String preProdUrl = compareUrl(excelRead("CaltrateCA", 1, 0));
		switchingTab(secondTab);
		ccp.clickOnCaltratePLUSChewables();
		String liveUrl = compareUrl(excelRead("CaltrateCA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 3, enabled = true)
	private void verifyLearnMoreAboutCaltratePlus() throws Throwable {
		switchingTab(firstTab);
		ccp.clickOnLearnMoreAboutCaltratePlus();
		String preProdUrl = compareUrl(excelRead("CaltrateCA", 1, 0));
		switchingTab(secondTab);
		ccp.clickOnLearnMoreAboutCaltratePlus();
		String liveUrl = compareUrl(excelRead("CaltrateCA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 3, enabled = true)
	private void verifyLearnMoreAboutCaltrateWithVitaminD() throws Throwable {
		switchingTab(firstTab);
		ccp.clickOnLearnMoreAboutCaltrateWithVitaminD();
		String preProdUrl = compareUrl(excelRead("CaltrateCA", 1, 0));
		switchingTab(secondTab);
		ccp.clickOnLearnMoreAboutCaltrateWithVitaminD();
		String liveUrl = compareUrl(excelRead("CaltrateCA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 3, enabled = true)
	private void verifyLearnMoreAboutCaltrateSelect() throws Throwable {
		switchingTab(firstTab);
		ccp.clickOnLearnMoreAboutCaltrateSelect();
		String preProdUrl = compareUrl(excelRead("CaltrateCA", 1, 0));
		switchingTab(secondTab);
		ccp.clickOnLearnMoreAboutCaltrateSelect();
		String liveUrl = compareUrl(excelRead("CaltrateCA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 3, enabled = true)
	private void verifyLearnMoreAboutCaltrate() throws Throwable {
		switchingTab(firstTab);
		ccp.clickOnLearnMoreAboutCaltrate();
		String preProdUrl = compareUrl(excelRead("CaltrateCA", 1, 0));
		switchingTab(secondTab);
		ccp.clickOnLearnMoreAboutCaltrate();
		String liveUrl = compareUrl(excelRead("CaltrateCA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 3, enabled = true)
	private void verifyLearnMoreAboutCaltrateGummies() throws Throwable {
		switchingTab(firstTab);
		ccp.clickOnLearnMoreAboutCaltrateGummies();
		String preProdUrl = compareUrl(excelRead("CaltrateCA", 1, 0));
		switchingTab(secondTab);
		ccp.clickOnLearnMoreAboutCaltrateGummies();
		String liveUrl = compareUrl(excelRead("CaltrateCA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 3, enabled = true)
	private void verifyLearnMoreAboutCaltrateSoftChews() throws Throwable {
		switchingTab(firstTab);
		ccp.clickOnLearnMoreAboutCaltrateSoftChews();
		String preProdUrl = compareUrl(excelRead("CaltrateCA", 1, 0));
		switchingTab(secondTab);
		ccp.clickOnLearnMoreAboutCaltrateSoftChews();
		String liveUrl = compareUrl(excelRead("CaltrateCA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 3, enabled = true)
	private void verifyLearnMoreAboutCaltratePlusChewables() throws Throwable {
		switchingTab(firstTab);
		ccp.clickOnLearnMoreAboutCaltratePlusChewables();
		String preProdUrl = compareUrl(excelRead("CaltrateCA", 1, 0));
		switchingTab(secondTab);
		ccp.clickOnLearnMoreAboutCaltratePlusChewables();
		String liveUrl = compareUrl(excelRead("CaltrateCA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

}
