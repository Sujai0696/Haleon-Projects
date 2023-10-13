package com.qa.voltarengel.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.voltarengel.pages.VoltarengelHowToRelieveArthritisPain;

public class VoltarengelHowToRelieveArthritisPainTest extends BaseClass{
	VoltarengelHowToRelieveArthritisPain vht;
	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadConfig("voltarengel_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		vht = new 	VoltarengelHowToRelieveArthritisPain();
		switchingTab(firstTab);
		launchURL(loadConfig("voltarengel_Config.properties").getProperty("VoltarengelHowToRelieveArthritisPainPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("voltarengel_Config.properties").getProperty("VoltarengelHowToRelieveArthritisPainLiveUrl"));
	}
	
	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Exception {
	vht =new VoltarengelHowToRelieveArthritisPain();
	switchingTab(firstTab);
	vht.clickCookieBtn();
	vht.clickGigyaForm();
	System.out.println("Cookie Button and email popup closed successfully in the Preprod URL");
	switchingTab(secondTab);
	vht.clickCookieBtn();
	vht.clickGigyaForm();
	System.out.println("Cookie Button and email popup closed successfully in the Live URL");
}
	@Test(priority = 11)
	private void verifyShowReference() throws Exception{
	switchingTab(firstTab);
	vht.clickShowReference();
	System.out.println("Show reference verified in the preprod URL");
	switchingTab(secondTab);
	vht.clickShowReference();
	System.out.println("Show reference verified in the Live URL");
	}
	@Test(priority = 2, enabled = true)
	private void verifyLivingWithArthritis() throws Throwable {
		switchingTab(firstTab);
		vht.clickonLivingWithArthritis();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vht.clickonLivingWithArthritis();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
		}
	@Test(priority = 2, enabled = true)
	private void verifyEspeciallyYourJoints() throws Throwable {
		switchingTab(firstTab);
		vht.clickonEspeciallyYourJoints();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vht.clickonEspeciallyYourJoints();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
		}
	@Test(priority = 2, enabled = true)
	private void verifyMediterraneanDiet() throws Throwable {
		switchingTab(firstTab);
		vht.clickonMediterraneanDiet();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vht.clickonMediterraneanDiet();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
		}
	@Test(priority = 2, enabled = true)
	private void verifyFightInflammation() throws Throwable {
		switchingTab(firstTab);
		vht.clickonFightInflammation();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vht.clickonFightInflammation();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
		}
	@Test(priority = 2, enabled = true)
	private void verifyLowImpactExercises() throws Throwable {
		switchingTab(firstTab);
		vht.clickonLowImpactExercises();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vht.clickonLowImpactExercises();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
		}
	@Test(priority = 2, enabled = true)
	private void verifyGoodOption() throws Throwable {
		switchingTab(firstTab);
		vht.clickonGoodOption();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vht.clickonGoodOption();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
		}
	
	@Test(priority = 2, enabled = true)
	private void verifyArticle1() throws Throwable {
		switchingTab(firstTab);
		vht.clickonArticle1();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vht.clickonArticle1();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
		}
	@Test(priority = 2, enabled = true)
	private void verifyArticle2() throws Throwable {
		switchingTab(firstTab);
		vht.clickonArticle2();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vht.clickonArticle2();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
		}
	@Test(priority = 2, enabled = true)
	private void verifyGetCoupon() throws Throwable {
		switchingTab(firstTab);
		vht.clickonGetCoupon();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vht.clickonGetCoupon();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
		}
	
	@Test(priority = 16)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		vht.clickBuyNow();
		System.out.println("Buy Now Button verified in the preprod URL");
		switchingTab(secondTab);
		vht.clickBuyNow();
		System.out.println("Buy Now Button verified in the Live URL");
	}
}
