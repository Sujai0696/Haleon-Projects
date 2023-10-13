package com.qa.voltarengel.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.voltarengel.pages.VoltarengelHowtoGetFitAtHome;

public class VoltarengelHowtoGetFitAtHomeTest extends BaseClass{
	VoltarengelHowtoGetFitAtHome vhg;
	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadConfig("voltarengel_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		vhg = new VoltarengelHowtoGetFitAtHome();
		switchingTab(firstTab);
		launchURL(loadConfig("voltarengel_Config.properties").getProperty("VoltarengelHowtoGetFitAtHomePreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("voltarengel_Config.properties").getProperty("VoltarengelHowtoGetFitAtHomeLiveUrl"));
	}
	
	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Exception {
	vhg =new VoltarengelHowtoGetFitAtHome();
	switchingTab(firstTab);
	vhg.clickCookieBtn();
	vhg.clickGigyaForm();
	System.out.println("Cookie Button and email popup closed successfully in the Preprod URL");
	switchingTab(secondTab);
	vhg.clickCookieBtn();
	vhg.clickGigyaForm();
	System.out.println("Cookie Button and email popup closed successfully in the Live URL");
}
	@Test(priority = 2, enabled = true)
	private void verifyArthritisFlares() throws Throwable {
		switchingTab(firstTab);
		vhg.clickonArthritisFlares();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vhg.clickonArthritisFlares();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
		}
	@Test(priority = 2, enabled = true)
	private void verifyTheWrists() throws Throwable {
		switchingTab(firstTab);
		vhg.clickonTheWrists();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vhg.clickonTheWrists();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
		}
	@Test(priority = 2, enabled = true)
	private void verifyknees() throws Throwable {
		switchingTab(firstTab);
		vhg.clickonknees();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vhg.clickonknees();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
		}
	@Test(priority = 2, enabled = true)
	private void verifyTheAnkles() throws Throwable {
		switchingTab(firstTab);
		vhg.clickonTheAnkles();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vhg.clickonTheAnkles();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
		}
	
	
	@Test(priority = 11)
	private void verifyShowReference() throws Exception{
	switchingTab(firstTab);
	vhg.clickShowReference();
	System.out.println("Show reference verified in the preprod URL");
	switchingTab(secondTab);
	vhg.clickShowReference();
	System.out.println("Show reference verified in the Live URL");
	}
	@Test(priority = 2, enabled = true)
	private void verifyFiveAbsWorkoutsYouCanDoFromHome() throws Throwable {
		switchingTab(firstTab);
		vhg.clickonFiveAbsWorkoutsYouCanDoFromHome();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vhg.clickonFiveAbsWorkoutsYouCanDoFromHome();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
		}
	@Test(priority = 2, enabled = true)
	private void verifyFoodExerciseForArthritisRelief() throws Throwable {
		switchingTab(firstTab);
		vhg.clickonFoodExerciseForArthritisRelief();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vhg.clickonFoodExerciseForArthritisRelief();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
		}
	@Test(priority = 2, enabled = true)
	private void verifyGetCoupon() throws Throwable {
		switchingTab(firstTab);
		vhg.clickonGetCoupon();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vhg.clickonGetCoupon();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
		}
	
	@Test(priority = 16)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		vhg.clickBuyNow();
		System.out.println("Buy Now Button verified in the preprod URL");
		switchingTab(secondTab);
		vhg.clickBuyNow();
		System.out.println("Buy Now Button verified in the Live URL");
	}

}
