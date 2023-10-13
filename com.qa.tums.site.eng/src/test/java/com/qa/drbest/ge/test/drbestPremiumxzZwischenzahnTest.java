package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.drbestPremiumxzZwischenzahnPage;

public class drbestPremiumxzZwischenzahnTest extends BaseClass{
	
	drbestPremiumxzZwischenzahnPage dc;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("drbest_deConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 dc=new drbestPremiumxzZwischenzahnPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("drbest_deConfig.properties").getProperty("preProddrbestPremiumxzZwischenzahnUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("drbest_deConfig.properties").getProperty("LivedrbestPremiumxzZwischenzahnUrl"));
		 }	
	 @Test(priority=0,enabled=true)
		public void verifydrbestcookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        dc.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        dc.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Live Url");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyBuyNow1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dc.clickonBuyNow1();
	       System.out.println("Verify BuyNow on preprod url");
	        switchingTab(secondTab);
	        dc.clickonBuyNow1();
	        System.out.println("Verify BuyNow on Live url");
		}					
	 @Test(priority=2,enabled=true)
		public void verifyReviewLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dc.clickonReview();
	       System.out.println("Verify Review on preprod url");
	        switchingTab(secondTab);
	        dc.clickonReview();
	        System.out.println("Verify Review on Live url");
		}			
	 @Test(priority=3,enabled=true)
		public void verifyReview1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dc.clickonReview1();
	       System.out.println("Verify Review1 on preprod url");
	        switchingTab(secondTab);
	        dc.clickonReview1();
	        System.out.println("Verify Review1 on Live url");
		}			
	 @Test(priority=4,enabled=true)
		public void verifyAtemfrischLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dc.clickonAtemfrisch();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dc.clickonAtemfrisch();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Atemfrisch:"+compareTwoText);
		}		
	 @Test(priority=5,enabled=true)
		public void verifyAtemfrischProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dc.clickonAtemfrischProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dc.clickonAtemfrischProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AtemfrischProduct:"+compareTwoText);
		}		
	 @Test(priority=6,enabled=true)
		public void verifyAtemfrischBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dc.clickonAtemfrischBuyNow();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dc.clickonAtemfrischBuyNow();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AtemfrischProduct:"+compareTwoText);
		}		
	 @Test(priority=7,enabled=true)
		public void verifyVibrationAtemfrischLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dc.clickonVibrationAtemfrisch();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dc.clickonVibrationAtemfrisch();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for VibrationAtemfrisch:"+compareTwoText);
		}		
	 @Test(priority=8,enabled=true)
		public void verifyVibrationAtemfrischProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dc.clickonVibrationAtemfrischProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dc.clickonVibrationAtemfrischProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for VibrationAtemfrischProduct:"+compareTwoText);
		}		
	 @Test(priority=9,enabled=true)
		public void verifyVibrationAtemfrischBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dc.clickonVibrationAtemfrischBuyNow();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dc.clickonVibrationAtemfrischBuyNow();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for VibrationAtemfrischBuyNow:"+compareTwoText);
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
