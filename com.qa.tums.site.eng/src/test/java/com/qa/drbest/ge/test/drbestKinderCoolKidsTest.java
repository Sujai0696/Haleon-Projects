package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.drbestKinderCoolKidsPage;

public class drbestKinderCoolKidsTest extends BaseClass{
	
	drbestKinderCoolKidsPage dk;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("drbest_deConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 dk=new drbestKinderCoolKidsPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("drbest_deConfig.properties").getProperty("preProddrbestKinderCoolKidsUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("drbest_deConfig.properties").getProperty("LivedrbestKinderCoolKidsUrl"));
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
		public void verifyVibrationjuniorzahnLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        dk.clickonVibrationjuniorzahn();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.clickonVibrationjuniorzahn();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Vibrationjuniorzahn:"+compareTwoText);
		}		
	 @Test(priority=5,enabled=true)
		public void verifyVibrationjuniorzahnProductLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        dk.clickonVibrationjuniorzahnProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.clickonVibrationjuniorzahnProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Vibrationjuniorzahn product:"+compareTwoText);
		}		
	 @Test(priority=6,enabled=true)
		public void verifyVibrationjuniorzahnBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.clickonVibrationjuniorzahnBuyNow();
	       System.out.println("Verified Display of VibrationjuniorzahnBuyNow on Preprod Url");
	        switchingTab(secondTab);
	        dk.clickonVibrationjuniorzahnBuyNow();
	        System.out.println("Verified Display of VibrationjuniorzahnBuyNow on Live Url");
		}				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
