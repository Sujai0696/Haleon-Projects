package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.drbestProfessionalPolimedPage;

public class drbestProfessionalPolimedTest extends BaseClass{

	drbestProfessionalPolimedPage dp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("drbest_deConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 dp=new drbestProfessionalPolimedPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("drbest_deConfig.properties").getProperty("preProddrbestProfessionalPolimedUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("drbest_deConfig.properties").getProperty("LivedrbestProfessionalPolimedUrl"));
		 }	
	 @Test(priority=0,enabled=true)
		public void verifydrbestcookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        dp.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        dp.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Live Url");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyBuyNow1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dp.clickonBuyNow1();
	       System.out.println("Verified Display of BuyNow on Preprod Url");
	        switchingTab(secondTab);
	        dp.clickonBuyNow1();
	        System.out.println("Verified Display of BuyNow on Live Url");
		}				
	 @Test(priority=2,enabled=true)
		public void verifyReviewLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dp.clickonReview();
	       System.out.println("Verified Display of Review on Preprod Url");
	        switchingTab(secondTab);
	        dp.clickonReview();
	        System.out.println("Verified Display of Review on Live Url");
		}				
	 @Test(priority=3,enabled=true)
		public void verifyReview1Link() throws Throwable
		{
		 	switchingTab(firstTab);
	        dp.clickonReview1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dp.clickonReview1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Review1:"+compareTwoText);
		}		
	 @Test(priority=4,enabled=true)
		public void verifyVibrationPolimedLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        dp.clickonVibrationPolimed();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dp.clickonVibrationPolimed();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Vibration Polimed:"+compareTwoText);
		}		
	 @Test(priority=5,enabled=true)
		public void verifyVibrationPolimedProductLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        dp.clickonVibrationPolimedproduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dp.clickonVibrationPolimedproduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Vibration Polimed product:"+compareTwoText);
		}		
	 @Test(priority=6,enabled=true)
		public void verifyVibrationPolimedBuyNowLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        dp.clickonVibrationPolimedBuynow();
	        System.out.println("VibrationPolimedBuyNow is Verified on Preprod Url");
	        switchingTab(secondTab);
	        dp.clickonVibrationPolimedBuynow();
	        System.out.println("VibrationPolimedBuyNow is Verified on Live Url");
		}		
	 @Test(priority=7,enabled=true)
		public void verifyVibrationMultiExpertLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        dp.clickonVibrationMultiExpert();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dp.clickonVibrationMultiExpert();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Vibration MultiExpert:"+compareTwoText);
		}		
	 @Test(priority=8,enabled=true)
		public void verifyVibrationMultiExpertProductLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        dp.clickonVibrationMultiExpertProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dp.clickonVibrationMultiExpertProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Vibration MultiExpertProduct:"+compareTwoText);
		}		
	 @Test(priority=9,enabled=true)
		public void verifyVibrationMultiExpertBuyNowLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        dp.clickonVibrationMultiExpertBuyNow();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dp.clickonVibrationMultiExpertBuyNow();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Vibration MultiExpertBuyNow:"+compareTwoText);
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
