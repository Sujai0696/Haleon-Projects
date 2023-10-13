package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.drbestVibrationMultiexpertPage;

public class drbestVibrationMultiexpertTest extends BaseClass{
	
	drbestVibrationMultiexpertPage dv;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("drbest_deConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 dv=new drbestVibrationMultiexpertPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("drbest_deConfig.properties").getProperty("preProddrbestVibrationMultiExpertUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("drbest_deConfig.properties").getProperty("LivedrbestVibrationMultiExpertUrl"));
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
	        System.out.println("Verified the BuyNow Successfully  on Preprod Url");
	        switchingTab(secondTab);
	        dv.clickonBuyNow1();
	       System.out.println("Verified the BuyNow Successfully  on Live Url");
		}	
	 @Test(priority=2,enabled=true)
		public void verifyReviewSliderLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dv.clickonReviewslider();
	       System.out.println("Verified the ReviewSlider Successfully  on Preprod Url");
	        switchingTab(secondTab);
	        dv.clickonReviewslider();
	        System.out.println("Verified the ReviewSlider Successfully on Live Url");
		}			
	 @Test(priority=3,enabled=true)
		public void verifyReviewLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dv.clickonReview();
	       System.out.println("Verified the Review on Preprod Url");
	        switchingTab(secondTab);
	        dv.clickonReview();
	        System.out.println("Verified the Review on Live Url");
		}			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
