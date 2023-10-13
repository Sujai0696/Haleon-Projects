package com.qa.voltarengel.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.voltarengel.pages.VoltarengelNaturalRemedies;

public class VoltarengelNaturalRemediesTest extends BaseClass{
	VoltarengelNaturalRemedies vnr;
	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadConfig("voltarengel_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		vnr = new VoltarengelNaturalRemedies();
		switchingTab(firstTab);
		launchURL(loadConfig("voltarengel_Config.properties").getProperty("VoltarengelNaturalRemediesPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("voltarengel_Config.properties").getProperty("VoltarengelNaturalRemediesLiveUrl"));
	}
	
	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Exception {
	vnr =new VoltarengelNaturalRemedies();
	switchingTab(firstTab);
	vnr.clickCookieBtn();
	vnr.clickGigyaForm();
	System.out.println("Cookie Button and email popup closed successfully in the Preprod URL");
	switchingTab(secondTab);
	vnr.clickCookieBtn();
	vnr.clickGigyaForm();
	System.out.println("Cookie Button and email popup closed successfully in the Live URL");
}
	@Test(priority = 2, enabled = true)
	private void verifyOsteoarthritisToRheumatoidArthritis() throws Throwable {
		switchingTab(firstTab);
		vnr.clickonOsteoarthritisToRheumatoidArthritis();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vnr.clickonOsteoarthritisToRheumatoidArthritis();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
		}
	@Test(priority = 3, enabled = true)
	private void verifyVoltarenArthritisPainGel() throws Throwable {
		switchingTab(firstTab);
		vnr.clickonVoltarenArthritisPainGel();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vnr.clickonVoltarenArthritisPainGel();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
		}
	@Test(priority = 4, enabled = true)
	private void verifySymptomsOfArthritisPain() throws Throwable {
		switchingTab(firstTab);
		vnr.clickonSymptomsOfArthritisPain();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vnr.clickonSymptomsOfArthritisPain();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
		}
	@Test(priority = 5, enabled = true)
	private void verifyPainManagement() throws Throwable {
		switchingTab(firstTab);
		vnr.clickonPainManagement();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vnr.clickonPainManagement();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
		}
	@Test(priority = 6, enabled = true)
	private void verifySymptomsOfStress() throws Throwable {
		switchingTab(firstTab);
		vnr.clickonSymptomsOfStress();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vnr.clickonSymptomsOfStress();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
		}
	@Test(priority = 7, enabled = true)
	private void verifyMuscleStrengtheningExercises() throws Throwable {
		switchingTab(firstTab);
		vnr.clickonMuscleStrengtheningExercises();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vnr.clickonMuscleStrengtheningExercises();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
		}
	@Test(priority = 8, enabled = true)
	private void verifySymptomReliefForArthritisPain() throws Throwable {
		switchingTab(firstTab);
		vnr.clickonSymptomReliefForArthritisPain();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vnr.clickonSymptomReliefForArthritisPain();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
		}
	@Test(priority = 9, enabled = true)
	private void verifyAtHome() throws Throwable {
		switchingTab(firstTab);
		vnr.clickonAtHome();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vnr.clickonAtHome();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
		}
	@Test(priority = 10, enabled = true)
	private void verifyInSocialSituations() throws Throwable {
		switchingTab(firstTab);
		vnr.clickonInSocialSituations();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vnr.clickonInSocialSituations();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
		}
	
	@Test(priority = 11)
	private void verifyShowReference() throws Exception{
	switchingTab(firstTab);
	vnr.clickShowReference();
	System.out.println("Show reference verified in the preprod URL");
	switchingTab(secondTab);
	vnr.clickShowReference();
	System.out.println("Show reference verified in the Live URL");
	}
	@Test(priority = 12, enabled = true)
	private void verifyHowToRelieveArthritisPain() throws Throwable {
		switchingTab(firstTab);
		vnr.clickonHowToRelieveArthritisPain();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vnr.clickonHowToRelieveArthritisPain();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
		}
	@Test(priority = 13, enabled = true)
	private void verifyWhataretheCausesOfArthritis() throws Throwable {
		switchingTab(firstTab);
		vnr.clickonWhataretheCausesOfArthritis();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vnr.clickonWhataretheCausesOfArthritis();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
		}
	@Test(priority = 14, enabled = true)
	private void verifyGetCoupons() throws Throwable {
		switchingTab(firstTab);
		vnr.clickonGetCoupons();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vnr.clickonGetCoupons();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
		}
	
	@Test(priority = 16)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		vnr.clickBuyNow();
		System.out.println("Buy Now Button verified in the preprod URL");
		switchingTab(secondTab);
		vnr.clickBuyNow();
		System.out.println("Buy Now Button verified in the Live URL");
	}
	

}
