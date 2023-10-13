package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.drbestVibrationPolimedPage;

public class drbestVibrationPolimedTest extends BaseClass{
	
	drbestVibrationPolimedPage dv;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("drbest_deConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 dv=new drbestVibrationPolimedPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("drbest_deConfig.properties").getProperty("preProddrbestVibrationPolimedUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("drbest_deConfig.properties").getProperty("LivedrbestVibrationPolimedUrl"));
		 }	
	 @Test(priority=0,enabled=true)
		public void verifydrbestcookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        dv.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        dv.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Live Url");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyBuyNow1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dv.clickonBuyNow1();
	       System.out.println("Verified Display of BuyNow on Preprod Url");
	        switchingTab(secondTab);
	        dv.clickonBuyNow1();
	        System.out.println("Verified Display of BuyNow on Live Url");
		}			
	 @Test(priority=2,enabled=true)
		public void verifyReviewLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dv.clickonReview();
	       System.out.println("Verified Display of Review on Preprod Url");
	        switchingTab(secondTab);
	        dv.clickonReview();
	        System.out.println("Verified Display of Review on Live Url");
		}			
	 @Test(priority=3,enabled=true)
		public void verifyReview1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dv.clickonReview1();
	       System.out.println("Verified Display of Review1 on Preprod Url");
	        switchingTab(secondTab);
	        dv.clickonReview1();
	        System.out.println("Verified Display of Review1 on Live Url");
		}			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
