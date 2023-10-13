package com.qa.drbest.ge.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.DrBestProfessionalPolimedKurzkop;

public class DrBestProfessionalPolimedKurzkopTest extends BaseClass{
	DrBestProfessionalPolimedKurzkop dbp;
	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadConfig("drbest_deConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		dbp = new DrBestProfessionalPolimedKurzkop();
		switchingTab(firstTab);
		launchURL(loadConfig("drbest_deConfig.properties").getProperty("DrBestProfessionalPolimedKurzkopPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("drbest_deConfig.properties").getProperty("DrBestProfessionalPolimedKurzkopLiveUrl"));

	}

	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Throwable {
		dbp = new DrBestProfessionalPolimedKurzkop();
		switchingTab(firstTab);
		dbp.clickonCookieBtn();
		System.out.println("Cookie Button clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		dbp.clickonCookieBtn();
		System.out.println("Cookie Button clicked successfully in the Live URL");
	}
	@Test(priority = 2, enabled = true)
	private void verifyBuyNow1() throws Throwable {
		//tnr = new CaltrateNaturalRemediesForHeartburn();
		switchingTab(firstTab);
		dbp.clickonBuyNow1();
		String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
		switchingTab(secondTab);
		dbp.clickonBuyNow1();
		String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	@Test(priority=2,enabled=true)
	public void verifyReviewLink() throws Throwable
	{
	 switchingTab(firstTab);
        dbp.clickonReview();
       System.out.println("Verified Display of Review on Preprod Url");
        switchingTab(secondTab);
        dbp.clickonReview();
        System.out.println("Verified Display of Review on Live Url");
	}		
// @Test(priority=3,enabled=true)
//	public void verifyReview1Link() throws Throwable
//	{
//	 switchingTab(firstTab);
//        dbp.clickonReview1();
//       System.out.println("Verified Display of Review1 on Preprod Url");
//        switchingTab(secondTab);
//        dbp.clickonReview1();
//        System.out.println("Verified Display of Review1 on Live Url");
//	}		
 @Test(priority=4,enabled=true)
	public void verifyDrBESTVibrationPolimedImage() throws Throwable
	{
	 switchingTab(firstTab);
        dbp.clickonDrBESTVibrationPolimedImage();
        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
        switchingTab(secondTab);
        dbp.clickonDrBESTVibrationPolimedImage();
        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same for DrBESTVibrationPolimedImage:"+compareTwoText);
	}		
 @Test(priority=5,enabled=true)
	public void verifyMehrErfahren1() throws Throwable
	{
	 switchingTab(firstTab);
        dbp.clickonMehrErfahren1();
        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
        switchingTab(secondTab);
        dbp.clickonMehrErfahren1();
        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same "+compareTwoText);
	}		
 @Test(priority=6,enabled=true)
	public void verifyJetztKaufen1() throws Throwable
	{
	 switchingTab(firstTab);
        dbp.clickonJetztKaufen1();
       System.out.println("JetztKaufen1 is display on Preprod url");
        switchingTab(secondTab);
        dbp.clickonJetztKaufen1();
        System.out.println("JetztKaufen1 is display on Live url");
	}		
 @Test(priority=7,enabled=true)
	public void verifyDrBESTVibrationMultiExpertImage() throws Throwable
	{
	 switchingTab(firstTab);
        dbp.clickonDrBESTVibrationMultiExpertImage();
        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
        switchingTab(secondTab);
        dbp.clickonDrBESTVibrationMultiExpertImage();
        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same for DrBESTVibrationMultiExpertImage:"+compareTwoText);
	}		
 @Test(priority=8,enabled=true)
	public void verifyMehrErfahren2() throws Throwable
	{
	 switchingTab(firstTab);
        dbp.clickonMehrErfahren2();
        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
        switchingTab(secondTab);
        dbp.clickonMehrErfahren2();
        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same for Product2:"+compareTwoText);
	}		
 @Test(priority=9,enabled=true)
	public void verifyJetztKaufen2() throws Throwable
	{
	 switchingTab(firstTab);
        dbp.clickonJetztKaufen2();
       System.out.println("PawPatrolBuyNow is display on Preprod url");
        switchingTab(secondTab);
        dbp.clickonJetztKaufen2();
        System.out.println("PawPatrolBuyNow is display on Live url");
	}		
 
}
