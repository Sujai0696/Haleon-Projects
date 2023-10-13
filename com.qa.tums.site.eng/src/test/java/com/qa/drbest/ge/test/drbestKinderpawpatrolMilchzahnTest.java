package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.drbestKinderpawpatrolMilchzahnPage;

public class drbestKinderpawpatrolMilchzahnTest extends BaseClass {
	
	drbestKinderpawpatrolMilchzahnPage dk;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("drbest_deConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 dk=new drbestKinderpawpatrolMilchzahnPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("drbest_deConfig.properties").getProperty("preProddrbestKinderpawpatrolMilchzahnUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("drbest_deConfig.properties").getProperty("LivedrbestKinderpawpatrolMilchzahnUrl"));
		 }	
	 @Test(priority=0,enabled=true)
		public void verifydrbestcookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        dk.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        dk.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Live Url");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyBuyNow1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.clickonBuyNow1();
	       System.out.println("Verified Display of BuyNow on Preprod Url");
	        switchingTab(secondTab);
	        dk.clickonBuyNow1();
	        System.out.println("Verified Display of BuyNow on Live Url");
		}					
	 @Test(priority=2,enabled=true)
		public void verifyReviewLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.clickonReview();
	       System.out.println("Verified Display of Review on Preprod Url");
	        switchingTab(secondTab);
	        dk.clickonReview();
	        System.out.println("Verified Display of Review on Live Url");
		}			
	 @Test(priority=3,enabled=true)
		public void verifyReview1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.clickonReview1();
	       System.out.println("Verified Display of Review1 on Preprod Url");
	        switchingTab(secondTab);
	        dk.clickonReview1();
	        System.out.println("Verified Display of Review1 on Live Url");
		}					
	 @Test(priority=4,enabled=true)
		public void verifyJuniorzahnLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        dk.clickonJuniorzahn();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.clickonJuniorzahn();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Juniorzahn:"+compareTwoText);
		}		
	 @Test(priority=5,enabled=true)
		public void verifyJuniorzahnProductLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        dk.clickonJuniorzahnProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.clickonJuniorzahnProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for JuniorzahnProduct:"+compareTwoText);
		}		
	 @Test(priority=6,enabled=true)
		public void verifyJuniorzahnBuYNowLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        dk.clickonjuniorzahnBuyNow();
	        System.out.println("JuniorzahnBuYNow is Verified on Preprod Url");
	        switchingTab(secondTab);
	        dk.clickonjuniorzahnBuyNow();
	        System.out.println("JuniorzahnBuYNow is Verified on Live Url");
		}		
	 @Test(priority=7,enabled=true)
		public void verifyVibrationJuniorzahnLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        dk.clickonVibrationJuniorzahn();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.clickonVibrationJuniorzahn();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for VibrationJuniorzahn:"+compareTwoText);
		}
	 @Test(priority=8,enabled=true)
		public void verifyVibrationJuniorzahnProductLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        dk.clickonVibrationJuniorzahnProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.clickonVibrationJuniorzahnProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for VibrationJuniorzahn product:"+compareTwoText);
		}		
	 @Test(priority=9,enabled=true)
		public void verifyVibrationJuniorzahnBuYNowLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        dk.clickonVibrationjuniorzahnBuyNow();
	        System.out.println("Vibration JuniorzahnBuYNow is Verified on Preprod Url");
	        switchingTab(secondTab);
	        dk.clickonVibrationjuniorzahnBuyNow();
	        System.out.println("Vibration JuniorzahnBuYNow is Verified on Live Url");
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
