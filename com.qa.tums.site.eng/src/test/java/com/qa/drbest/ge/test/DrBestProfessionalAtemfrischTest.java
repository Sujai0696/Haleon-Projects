package com.qa.drbest.ge.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.DrBestProfessionalAtemfrisch;

public class DrBestProfessionalAtemfrischTest extends BaseClass{
	DrBestProfessionalAtemfrisch dpp;
	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadConfig("drbest_deConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		dpp = new DrBestProfessionalAtemfrisch();
		switchingTab(firstTab);
		launchURL(loadConfig("drbest_deConfig.properties").getProperty("DrBestProfessionalAtemfrischPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("drbest_deConfig.properties").getProperty("DrBestProfessionalAtemfrischLiveUrl"));

	}

	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Throwable {
		dpp = new DrBestProfessionalAtemfrisch();
		switchingTab(firstTab);
		dpp.clickonCookieBtn();
		System.out.println("Cookie Button clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		dpp.clickonCookieBtn();
		System.out.println("Cookie Button clicked successfully in the Live URL");
	}
	@Test(priority = 2, enabled = true)
	private void verifyBuyNow1() throws Throwable {
		//tnr = new CaltrateNaturalRemediesForHeartburn();
		switchingTab(firstTab);
		dpp.clickonBuyNow1();
		String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
		switchingTab(secondTab);
		dpp.clickonBuyNow1();
		String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority=2,enabled=true)
	public void verifyReviewLink() throws Throwable
	{
	 switchingTab(firstTab);
        dpp.clickonReview();
       System.out.println("Verified Display of Review on Preprod Url");
        switchingTab(secondTab);
        dpp.clickonReview();
        System.out.println("Verified Display of Review on Live Url");
	}		
// @Test(priority=3,enabled=true)
//	public void verifyReview1Link() throws Throwable
//	{
//	 switchingTab(firstTab);
//        dpp.clickonReview1();
//       System.out.println("Verified Display of Review1 on Preprod Url");
//        switchingTab(secondTab);
//        dpp.clickonReview1();
//        System.out.println("Verified Display of Review1 on Live Url");
//	}		
 @Test(priority=4,enabled=true)
	public void verifyDrBESTVibrationPolimedImage() throws Throwable
	{
	 switchingTab(firstTab);
        dpp.clickonDrBESTVibrationPolimedImage();
        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
        switchingTab(secondTab);
        dpp.clickonDrBESTVibrationPolimedImage();
        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same "+compareTwoText);
	}		
 @Test(priority=5,enabled=true)
	public void verifyMehrErfahren1() throws Throwable
	{
	 switchingTab(firstTab);
        dpp.clickonMehrErfahren1();
        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
        switchingTab(secondTab);
        dpp.clickonMehrErfahren1();
        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same for Product:"+compareTwoText);
	}		
 @Test(priority=6,enabled=true)
	public void verifyJetztKaufen1() throws Throwable
	{
	 switchingTab(firstTab);
        dpp.clickonJetztKaufen1();
       System.out.println("MilichzahnBuyNow is display on Preprod url");
        switchingTab(secondTab);
        dpp.clickonJetztKaufen1();
        System.out.println("MilichzahnBuyNow is display on Live url");
	}		
 @Test(priority=7,enabled=true)
	public void verifyDrBESTVibrationMultiExpertImage() throws Throwable
	{
	 switchingTab(firstTab);
        dpp.clickonDrBESTVibrationMultiExpertImage();
        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
        switchingTab(secondTab);
        dpp.clickonDrBESTVibrationMultiExpertImage();
        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same for product2 Image:"+compareTwoText);
	}		
 @Test(priority=8,enabled=true)
	public void verifyMehrErfahren2() throws Throwable
	{
	 switchingTab(firstTab);
        dpp.clickonMehrErfahren2();
        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
        switchingTab(secondTab);
        dpp.clickonMehrErfahren2();
        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same for Product2:"+compareTwoText);
	}		
 @Test(priority=9,enabled=true)
	public void verifyJetztKaufen2() throws Throwable
	{
	 switchingTab(firstTab);
        dpp.clickonJetztKaufen2();
       System.out.println("BuyNow2 is display on Preprod url");
        switchingTab(secondTab);
        dpp.clickonJetztKaufen2();
        System.out.println("BuyNow2 is display on Live url");
	}		
 

}
