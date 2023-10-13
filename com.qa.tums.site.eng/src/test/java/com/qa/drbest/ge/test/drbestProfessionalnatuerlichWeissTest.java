package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.drbestProfessionalnatuerlichWeissPage;

public class drbestProfessionalnatuerlichWeissTest extends BaseClass{
	
	drbestProfessionalnatuerlichWeissPage dk;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("drbest_deConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 dk=new drbestProfessionalnatuerlichWeissPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("drbest_deConfig.properties").getProperty("preProddrbestProfessionalnatuerlichWeissUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("drbest_deConfig.properties").getProperty("LivedrbestProfessionalnatuerlichWeissUrl"));
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
		public void verifyVibrationPolimedLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        dk.clickonVibrationPolimed();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.clickonVibrationPolimed();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for VibrationPolimed:"+compareTwoText);
		}		
	 @Test(priority=5,enabled=true)
		public void verifyVibrationPolimedProductLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        dk.clickonVibrationPolimedProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.clickonVibrationPolimedProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for VibrationPolimed Product:"+compareTwoText);
		}		
	 @Test(priority=6,enabled=true)
		public void verifyVibrationPolimedBuyNowLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        dk.clickonVibrationPolimedBuyNow();
	        System.out.println("VibrationPolimedBuyNow is Verified on Preprod Url");
	        switchingTab(secondTab);
	        dk.clickonVibrationPolimedBuyNow();
	       System.out.println("VibrationPolimedBuyNow is Verified on Live Url");
		}		
	 @Test(priority=7,enabled=true)
		public void verifyPolimedLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        dk.clickonPolimed();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.clickonPolimed();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Polimed:"+compareTwoText);
		}		
	 @Test(priority=8,enabled=true)
		public void verifyPolimedProductLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        dk.clickonPolimedProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.clickonPolimedProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for PolimedProduct:"+compareTwoText);
		}		
	 @Test(priority=9,enabled=true)
		public void verifyPolimedBuyNowLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        dk.clickonPolimedBuyNow();
	        System.out.println("Verify PolimedBuyNow on Preprod Url");
	        switchingTab(secondTab);
	        dk.clickonPolimedBuyNow();
	        System.out.println("Verify PolimedBuyNow on Live Url");
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
