package com.qa.tums.eng.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.TumsCauses;
import com.qa.tums.eng.pages.TumsHeartburnvsIndigestion;

public class TumsCausesTest extends BaseClass {
	TumsCauses C;

	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadConfig("TumsConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("TumsConfig.properties").getProperty("TumsCausesPreprodURL"));
		switchingTab(secondTab);
		launchURL(loadConfig("TumsConfig.properties").getProperty("TumsCausesLiveURL"));
		C = new TumsCauses();
		
	}
	
	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Throwable {
	switchingTab(firstTab);
	C.clickCookieBtn();
	System.out.println("Cookie Button clicked successfully in the Preprod URL");
	switchingTab(secondTab);
	C.clickCookieBtn();
	System.out.println("Cookie Button clicked successfully in the Live URL");
	}

	// Verify HomeIcon in Breadcrumb
	@Test(priority = 1, enabled = true)
	private void verifyHomeIcon() throws Throwable {
		C = new TumsCauses();
		switchingTab(firstTab);
		C.clickOnHomeIcon();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		C.clickOnHomeIcon();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);


	}

	// Verify Heartburn101 in Breadcrumb
	@Test(priority = 2, enabled = true)
	private void verifyHeartBurn101() throws Throwable {
		C = new TumsCauses();
		switchingTab(firstTab);
		C.clickOnHeartBurn101();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		C.clickOnHeartBurn101();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);

	}

	// Verify Heartburn101 in Twitter
	
	@Test(priority = 6, enabled = true)
	private void verifyQuickHeartburnRelief() throws Throwable {
		C = new TumsCauses();
		switchingTab(firstTab);
		C.clickOnQuickHeartbunRelief();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		C.clickOnQuickHeartbunRelief();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);

	}
	
	@Test(priority = 7, enabled = true)
	private void verifyEatingAndExercise_accordion() throws Throwable {
		C = new TumsCauses();
		switchingTab(firstTab);
		C.clickOnEatingAndExercise_accordion();
		//String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		C.clickOnEatingAndExercise_accordion();
//		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);

	}
	
	@Test(priority = 8, enabled = true)
	private void verifyFoodsThatCauseHeartburn_accordion() throws Throwable {
		C = new TumsCauses();
		switchingTab(firstTab);
		C.clickOnFoodsThatCauseHeartburn_accordion();
//		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		C.clickOnFoodsThatCauseHeartburn_accordion();
//		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);

	}
	
	@Test(priority = 9, enabled = true)
	private void verifyHeartburnCausedbyDrink_accordion() throws Throwable {
		C = new TumsCauses();
		switchingTab(firstTab);
		C.clickOnHeartburnCausedbyDrink_accordion();
//		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		C.clickOnHeartburnCausedbyDrink_accordion();
//		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);

	}
	
	@Test(priority = 10, enabled = true)
	private void verifyMedicationsandHeartburn_accordion() throws Throwable {
		C = new TumsCauses();
		switchingTab(firstTab);
		C.clickOnMedicationsandHeartburn_accordion();
//		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		C.clickOnMedicationsandHeartburn_accordion();
//		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);

	}
	@Test(priority = 11, enabled = true)
	private void verifyHeartburnDuringPregnancy_accordion() throws Throwable {
		C = new TumsCauses();
		switchingTab(firstTab);
		C.clickOnHeartburnDuringPregnancy_accordion();
//		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		C.clickOnHeartburnDuringPregnancy_accordion();
//		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);

	}
	

	@Test(priority = 13, enabled = true)
	private void verifyHiatalHernia_accordion() throws Throwable {
		C = new TumsCauses();
		switchingTab(firstTab);
		C.clickOnHeartBurn101();
//		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		C.clickOnHeartBurn101();
//		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);

	}
	@Test(priority = 14, enabled = true)
	private void verifyreferences() throws Throwable {
		C = new TumsCauses();
		switchingTab(firstTab);
		C.clickOnHeartBurn101();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		C.clickOnHeartBurn101();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);

	}
	
	@Test(priority = 15, enabled = true)
	private void verifyHeartburnSymptoms() throws Throwable {
		C = new TumsCauses();
		switchingTab(firstTab);
		C.clickOnHeartBurn101();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		C.clickOnHeartBurn101();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);

	}
	@Test(priority = 16, enabled = true)
	private void verifyFindingRelief() throws Throwable {
		C = new TumsCauses();
		switchingTab(firstTab);
		C.clickOnHeartBurn101();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		C.clickOnHeartBurn101();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);

	}
	
	@Test(priority = 17, enabled = true)
	private void verifyTUMSwhilePregnant() throws Throwable {
		C = new TumsCauses();
		switchingTab(firstTab);
		C.clickOnHeartBurn101();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		C.clickOnHeartBurn101();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);

	}
	
	@Test(priority = 18, enabled = true)
	private void verifyWhatCausesHeartburnAChecklist() throws Throwable {
		C = new TumsCauses();
		switchingTab(firstTab);
		C.clickOnHeartBurn101();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		C.clickOnHeartBurn101();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);

	}
	
	@Test(priority = 19, enabled = true)
	private void verifyAcidRefluxvsGERD() throws Throwable {
		C = new TumsCauses();
		switchingTab(firstTab);
		C.clickOnHeartBurn101();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		C.clickOnHeartBurn101();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);

	}
	
	@Test(priority = 20, enabled = true)
	private void verifyWhatBehaviors() throws Throwable {
		C = new TumsCauses();
		switchingTab(firstTab);
		C.clickOnHeartBurn101();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		C.clickOnHeartBurn101();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);

	}
	
	@Test(priority = 21, enabled = true)
	private void verifyWhatFoodsauseHeartburn() throws Throwable {
		C = new TumsCauses();
		switchingTab(firstTab);
		C.clickOnHeartBurn101();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		C.clickOnHeartBurn101();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);

	}
	@Test(priority = 22, enabled = true)
	private void verifyupsetStomach() throws Throwable {
		C = new TumsCauses();
		switchingTab(firstTab);
		C.clickOnHeartBurn101();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		C.clickOnHeartBurn101();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);

	}
	@Test(priority = 23, enabled = true)
	private void verifysevenSurprising() throws Throwable {
		C = new TumsCauses();
		switchingTab(firstTab);
		C.clickOnHeartBurn101();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		C.clickOnHeartBurn101();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);

	}
	@Test(priority = 24, enabled = true)
	private void verifyaGuidetoCommon() throws Throwable {
		C = new TumsCauses();
		switchingTab(firstTab);
		C.clickOnHeartBurn101();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		C.clickOnHeartBurn101();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);

	}
	@Test(priority = 25, enabled = true)
	private void verifySeeProoducts() throws Throwable {
		C = new TumsCauses();
		switchingTab(firstTab);
		C.clickOnHeartBurn101();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		C.clickOnHeartBurn101();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);

	}
}
