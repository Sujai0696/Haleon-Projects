package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.drbestInterdentAktivPage;

public class drbestInterdentAktivTest extends BaseClass{
	
	drbestInterdentAktivPage dia;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("drbest_deConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 dia=new drbestInterdentAktivPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("drbest_deConfig.properties").getProperty("preProddrbestInterdentAktivUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("drbest_deConfig.properties").getProperty("LivedrbestInterdentAktivUrl"));
		 }	
	 @Test(priority=0,enabled=true)
		public void verifydrbestcookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        dia.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        dia.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Live Url");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyBuyNow1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dia.clickonBuyNow1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dia.clickonBuyNow1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for BuyNow1:"+compareTwoText);
		}		
	 @Test(priority=2,enabled=true)
		public void verifyReviewLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dia.clickonReview();
	        System.out.println("Review is Verified Successfully on Preprod url");
	        switchingTab(secondTab);
	        dia.clickonReview();
	        System.out.println("Review is Verified Successfully on Live url");
		}		
	 @Test(priority=3,enabled=true)
		public void verifyReview1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dia.clickonReview1();
	        System.out.println("Review1 is Verified Successfully on Preprod url");
	        switchingTab(secondTab);
	        dia.clickonReview1();
	        System.out.println("Review1 is Verified Successfully on Live url");
		}		
	 @Test(priority=4,enabled=true)
		public void verifyAtemfrischLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dia.clickonAtemfrisch();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dia.clickonAtemfrisch();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Atemfrisch:"+compareTwoText);
		}		
	 @Test(priority=5,enabled=true)
		public void verifyAtemfrischProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dia.clickonAtemfrischproduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dia.clickonAtemfrischproduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AtemfrischProduct:"+compareTwoText);
		}		
	 @Test(priority=6,enabled=true)
		public void verifyAtemfrischBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dia.clickonAtemfrischBuyNow1();
	        System.out.println("Atemfrisch BuyNow is Displayed on Preprod url");
	        switchingTab(secondTab);
	        dia.clickonAtemfrischBuyNow1();
	       System.out.println("Atemfrisch BuyNow is Displayed on Live url");
		}		
	 @Test(priority=7,enabled=true)
		public void verifyAtemfrischVibrationLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dia.clickonAtemfrischVibration();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dia.clickonAtemfrischVibration();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AtemfrischVibration:"+compareTwoText);
		}		
	 @Test(priority=8,enabled=true)
		public void verifyAtemfrischVibrationProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dia.clickonAtemfrischVibrationproduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dia.clickonAtemfrischVibrationproduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AtemfrischVibration product:"+compareTwoText);
		}		
	 @Test(priority=9,enabled=true)
		public void verifyAtemfrischVibrationBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dia.clickonAtemfrischVibrationBuyNow();
	        System.out.println("Verified the display of AtemfrischVibration on Preprod Url");
	        switchingTab(secondTab);
	        dia.clickonAtemfrischVibrationBuyNow();
	       System.out.println("Verified the display of AtemfrischVibration on Live Url");
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
