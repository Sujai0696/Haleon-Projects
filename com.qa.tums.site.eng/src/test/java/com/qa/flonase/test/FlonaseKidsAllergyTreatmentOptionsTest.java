package com.qa.flonase.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.flonase.pages.FlonaseKidsAllergyTreatmentOptionsPage;

public class FlonaseKidsAllergyTreatmentOptionsTest extends BaseClass{
	
	FlonaseKidsAllergyTreatmentOptionsPage kat;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("Flonase_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		kat = new FlonaseKidsAllergyTreatmentOptionsPage();
		switchingTab(firstTab);
		launchURL(loadConfig("Flonase_Config.properties").getProperty("kidsAllergyTreatmentOptionsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("Flonase_Config.properties").getProperty("kidsAllergyTreatmentOptionsLiveUrl"));
	}

	
	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		kat.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		kat.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyAllSlides() throws Exception{
		switchingTab(firstTab);
		kat.clickAllSlides();
		System.out.println("All slides has verified successfully in PreProd URL");
		switchingTab(secondTab);
		kat.clickAllSlides();
		System.out.println("All slides verified successfully in Live URL");
	}
	
	@Test(priority = 2)
	private void verifyBtnBuyNow() throws Exception{
		switchingTab(firstTab);
		kat.clickBtnBuyNow();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		kat.clickBtnBuyNow();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for BtnBuyNow: "+compareTwoText);
	}

}
