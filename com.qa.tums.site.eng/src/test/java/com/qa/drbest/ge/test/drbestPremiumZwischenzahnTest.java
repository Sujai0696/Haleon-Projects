package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.drbestPremiumZwischenzahnPage;
import com.qa.drbest.ge.pages.drbestZahnbuerstenPage;

public class drbestPremiumZwischenzahnTest extends BaseClass{
	
	drbestPremiumZwischenzahnPage dz;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("drbest_deConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 dz=new drbestPremiumZwischenzahnPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("drbest_deConfig.properties").getProperty("preProddrbestPremiumZwischenzahnUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("drbest_deConfig.properties").getProperty("LivedrbestPremiumZwischenzahnUrl"));
		 }	
	 @Test(priority=0,enabled=true)
		public void verifydrbestcookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        dz.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        dz.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Live Url");
		}								
	 @Test(priority=1,enabled=true)
		public void verifyReviewIconLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dz.clickonReviewcon();
	       System.out.println("Verify Review button on Preprod url");
	        switchingTab(secondTab);
	        dz.clickonReviewcon();
	        System.out.println("Verify Review button on Live url");
		}
	 @Test(priority=2,enabled=true)
		public void verifyBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dz.clickonBuyNow();
	        System.out.println("Retailers Display on preprod Url");
	        switchingTab(secondTab);
	        dz.clickonBuyNow();
	        System.out.println("Retailers Display on Live Url");
		}		
	 
	 @Test(priority=3,enabled=true)
		public void verifyProduct1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dz.clickonProduct1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dz.clickonProduct1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Product1:"+compareTwoText);
		}		
	 @Test(priority=4,enabled=true)
		public void verifyProductcard1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dz.clickonProductcard1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dz.clickonProductcard1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Productcard1:"+compareTwoText);
		}		
	 @Test(priority=5,enabled=true)
		public void verifyProduct2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dz.clickonProduct2();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dz.clickonProduct2();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Product2:"+compareTwoText);
		}		
	 @Test(priority=6,enabled=true)
		public void verifyProductcard2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dz.clickonProductcard2();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dz.clickonProductcard2();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Productcard2:"+compareTwoText);
		}		
	 @Test(priority=7,enabled=true)
		public void verifyBuyNow1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dz.clickonBuyNow1();
	        System.out.println("BuyNow is Displayed on preprod url");
	        switchingTab(secondTab);
	        dz.clickonBuyNow1();
	        System.out.println("BuyNow is Displayed on Live Url");
		}		
	 @Test(priority=8,enabled=true)
		public void verifyBuyNow2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dz.clickonBuyNow2();
	        System.out.println("BuyNow2 is Displayed on preprod url");
	        switchingTab(secondTab);
	        dz.clickonBuyNow2();
	        System.out.println("BuyNow2 is Displayed on Live Url");
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
