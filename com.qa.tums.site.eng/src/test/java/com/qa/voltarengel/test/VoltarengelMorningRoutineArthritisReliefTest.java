package com.qa.voltarengel.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.voltarengel.pages.VoltarengelMorningRoutineArthritisReliefPage;

public class VoltarengelMorningRoutineArthritisReliefTest extends BaseClass{
	
	VoltarengelMorningRoutineArthritisReliefPage mrar;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("voltarengel_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		mrar = new VoltarengelMorningRoutineArthritisReliefPage();
		switchingTab(firstTab);
		launchURL(loadConfig("voltarengel_Config.properties").getProperty("morningRoutineArthritisReliefPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("voltarengel_Config.properties").getProperty("morningRoutineArthritisReliefLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		mrar.clickCookieBtn();
		mrar.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Pop-up successfully verified in the Preprod URL");
		switchingTab(secondTab);
		mrar.clickCookieBtn();
		mrar.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Pop-up successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		mrar.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		mrar.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		mrar.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		mrar.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		mrar.clickBreadcrumbThree();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		mrar.clickBreadcrumbThree();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Three: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyHyperLinkOsteoarthritis() throws Exception{
		switchingTab(firstTab);
		mrar.clickHyperLinkOsteoarthritis();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		mrar.clickHyperLinkOsteoarthritis();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Hyper Link Osteoarthritis: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyHyperLinkExercise() throws Exception{
		switchingTab(firstTab);
		mrar.clickHyperLinkExercise();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		mrar.clickHyperLinkExercise();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Hyper Link Exercise: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyHyperLinkTopicalCreams() throws Exception{
		switchingTab(firstTab);
		mrar.clickHyperLinkTopicalCreams();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		mrar.clickHyperLinkTopicalCreams();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Hyper Link Topical Creams: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyHyperLinkVoltarenArthritisPainGel() throws Exception{
		switchingTab(firstTab);
		mrar.clickHyperLinkVoltarenArthritisPainGel();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		mrar.clickHyperLinkVoltarenArthritisPainGel();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Hyper Link Voltaren Arthritis Pain Gel: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyHyperLinkLivingWithArthritis() throws Exception{
		switchingTab(firstTab);
		mrar.clickHyperLinkLivingWithArthritis();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		mrar.clickHyperLinkLivingWithArthritis();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Hyper Link Living With Arthritis: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyHyperLinkVoltarenWebpage() throws Exception{
		switchingTab(firstTab);
		mrar.clickHyperLinkVoltarenWebpage();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		mrar.clickHyperLinkVoltarenWebpage();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Hyper Link Voltaren Webpage: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyShowReference() throws Exception{
		switchingTab(firstTab);
		mrar.clickShowReference();
		System.out.println("Show reference verified in the preprod URL");
		switchingTab(secondTab);
		mrar.clickShowReference();
		System.out.println("Show reference verified in the Live URL");
	}
	
	@Test(priority = 11)
	private void verifyGetCoupons() throws Exception{
		switchingTab(firstTab);
		mrar.clickGetCoupons();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		mrar.clickGetCoupons();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Get Coupons: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		mrar.clickBuyNow();
		System.out.println("Buy Now Button verified in the preprod URL");
		switchingTab(secondTab);
		mrar.clickBuyNow();
		System.out.println("Buy Now Button verified in the Live URL");
	}
	
	

}
