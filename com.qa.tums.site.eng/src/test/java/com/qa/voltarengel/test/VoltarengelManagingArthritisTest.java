package com.qa.voltarengel.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.voltarengel.pages.VoltarengelManagingArthritis;

public class VoltarengelManagingArthritisTest extends BaseClass{
	VoltarengelManagingArthritis vma;
	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadConfig("voltarengel_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		vma = new VoltarengelManagingArthritis();
		switchingTab(firstTab);
		launchURL(loadConfig("voltarengel_Config.properties").getProperty("VoltarengelManagingArthritisPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("voltarengel_Config.properties").getProperty("VoltarengelManagingArthritisLiveUrl"));
	}
	
	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Exception {
	vma =new VoltarengelManagingArthritis();
	switchingTab(firstTab);
	vma.clickCookieBtn();
	vma.clickGigyaForm();
	System.out.println("Cookie Button and email popup closed successfully in the Preprod URL");
	switchingTab(secondTab);
	vma.clickCookieBtn();
	vma.clickGigyaForm();
	System.out.println("Cookie Button and email popup closed successfully in the Live URL");
}
	@Test(priority = 2, enabled = true)
	private void verifyManagingArthritisatHome() throws Throwable {
		switchingTab(firstTab);
		vma.clickonManagingArthritisatHome();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vma.clickonManagingArthritisatHome();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyManagingArthritisWithYourFamily() throws Throwable {
		switchingTab(firstTab);
		vma.clickonManagingArthritisWithYourFamily();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vma.clickonManagingArthritisWithYourFamily();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyLivingIndependentlywithArthritis() throws Throwable {
		switchingTab(firstTab);
		vma.clickonLivingIndependentlywithArthritis();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vma.clickonLivingIndependentlywithArthritis();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyManagingArthritisatWork() throws Throwable {
		switchingTab(firstTab);
		vma.clickonManagingArthritisatWork();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vma.clickonManagingArthritisatWork();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyOTCArthritisMedication() throws Throwable {
		switchingTab(firstTab);
		vma.clickonOTCArthritisMedication();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vma.clickonOTCArthritisMedication();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyHowOTCArthritisCreamWork() throws Throwable {
		switchingTab(firstTab);
		vma.clickonHowOTCArthritisCreamWork();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vma.clickonHowOTCArthritisCreamWork();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyOvertheCounterDiclofenacGel() throws Throwable {
		switchingTab(firstTab);
		vma.clickonOvertheCounterDiclofenacGel();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vma.clickonOvertheCounterDiclofenacGel();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyTylenolAlternative() throws Throwable {
		switchingTab(firstTab);
		vma.clickonTylenolAlternative();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vma.clickonTylenolAlternative();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyHowtoPreventArthritis() throws Throwable {
		switchingTab(firstTab);
		vma.clickonHowtoPreventArthritis();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vma.clickonHowtoPreventArthritis();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyWhatsFoodtoAvoidWhenYouHaveArthritis() throws Throwable {
		switchingTab(firstTab);
		vma.clickonWhatsFoodtoAvoidWhenYouHaveArthritis();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vma.clickonWhatsFoodtoAvoidWhenYouHaveArthritis();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyKneeBracesforOsteoarthritis() throws Throwable {
		switchingTab(firstTab);
		vma.clickonKneeBracesforOsteoarthritis();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vma.clickonKneeBracesforOsteoarthritis();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyWhatIsLidocainAndHowDoesItWork() throws Throwable {
		switchingTab(firstTab);
		vma.clickonWhatIsLidocainAndHowDoesItWork();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vma.clickonWhatIsLidocainAndHowDoesItWork();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifySignMeUpBtn() throws Throwable {
		switchingTab(firstTab);
		vma.clickonSignMeUpBtn();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vma.clickonSignMeUpBtn();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority = 2, enabled = true)
	private void verifyGetCoupon() throws Throwable {
		switchingTab(firstTab);
		vma.clickonGetCoupon();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vma.clickonGetCoupon();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	
	@Test(priority = 16)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		vma.clickBuyNow();
		System.out.println("Buy Now Button verified in the preprod URL");
		switchingTab(secondTab);
		vma.clickBuyNow();
		System.out.println("Buy Now Button verified in the Live URL");
	}
	
}
