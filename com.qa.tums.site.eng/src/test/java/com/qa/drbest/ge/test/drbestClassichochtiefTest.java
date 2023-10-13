package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.drbestClassichochtiefPage;


public class drbestClassichochtiefTest extends BaseClass{
	
	drbestClassichochtiefPage dc;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("drbest_deConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 dc=new drbestClassichochtiefPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("drbest_deConfig.properties").getProperty("preProddrbestClassichochtiefUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("drbest_deConfig.properties").getProperty("LivedrbestClassichochtiefUrl"));
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
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dc.clickonBuyNow1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for BuyNow:"+compareTwoText);
		}			
	 @Test(priority=2,enabled=true)
		public void verifyReviewLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dc.clickonReviewButton();
	        System.out.println("Verify Review on Preprod Url");
	        switchingTab(secondTab);
	        dc.clickonReviewButton();
	       System.out.println("Verify Review on Live Url");
		}			
	 @Test(priority=3,enabled=true)
		public void verifyReview1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dc.clickonReview1Button();
	        System.out.println("Verify Review1 on Preprod Url");
	        switchingTab(secondTab);
	        dc.clickonReview1Button();
	       System.out.println("Verify Review1 on Live Url");
		}			
	 @Test(priority=4,enabled=true)
		public void verifyInterdentAktivLink() throws Throwable
		{
		 switchingTab(firstTab);
		 	dc.clickonInterdentAktivButton();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dc.clickonInterdentAktivButton();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for InterdentAktiv:"+compareTwoText);
		}		
	 @Test(priority=5,enabled=true)
		public void verifyInterdentAktivProductLink() throws Throwable
		{
		 switchingTab(firstTab);
		 	dc.clickonInterdentAktivProductButton();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dc.clickonInterdentAktivProductButton();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for InterdentAktivProduct:"+compareTwoText);
		}		
	 @Test(priority=6,enabled=true)
		public void verifyInterdentAktivBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dc.clickonInterdentAktivBuyNowButton();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dc.clickonInterdentAktivBuyNowButton();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for InterdentAktivBuyNow:"+compareTwoText);
		}			
	 @Test(priority=7,enabled=true)
		public void verifyBESTXZwischenzahnLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dc.clickonBESTXZwischenzahnButton();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dc.clickonBESTXZwischenzahnButton();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for BESTXZwischenzahn:"+compareTwoText);
		}			
	 @Test(priority=8,enabled=true)
		public void verifyBESTXZwischenzahnProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dc.clickonBESTXZwischenzahnProductButton();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dc.clickonBESTXZwischenzahnProductButton();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for BESTXZwischenzahnProduct:"+compareTwoText);
		}			
	 @Test(priority=9,enabled=true)
		public void verifyBESTXZwischenzahnBuYnowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dc.clickonBESTXZwischenzahnBuyNowButton();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dc.clickonBESTXZwischenzahnBuyNowButton();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for BESTXZwischenzahnBuyNow:"+compareTwoText);
		}			
	 @Test(priority=10,enabled=true)
		public void verifyVibrationAstemfrischLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dc.clickonVibrationAstemfrischButton();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dc.clickonVibrationAstemfrischButton();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for VibrationAstemfrisch:"+compareTwoText);
		}			
	 @Test(priority=11,enabled=true)
		public void verifyVibrationAstemfrischProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dc.clickonVibrationAstemfrischProductButton();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dc.clickonVibrationAstemfrischProductButton();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for VibrationAstemfrischProduct:"+compareTwoText);
		}			
	 @Test(priority=12,enabled=true)
		public void verifyVibrationAstemfrischBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dc.clickonVibrationAstemfrischBuyNowButton();
	        System.out.println("Verify BuyNow Button for VibrationAstemfrisch on preprod Url");
	        switchingTab(secondTab);
	        dc.clickonVibrationAstemfrischBuyNowButton();
	        System.out.println("Verify BuyNow Button for VibrationAstemfrisch on Live Url");
		}			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
