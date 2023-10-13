package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.abreva.pages.AbrevaWheretobuyPage;

public class AbrevaWheretobuyTest extends BaseClass{
	
	AbrevaWheretobuyPage ah;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 ah=new AbrevaWheretobuyPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("abreva_Config.properties").getProperty("preProdAbrevaWheretobuyUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("abreva_Config.properties").getProperty("LiveAbrevaWheretobuyUrl"));
		 }	
	 @Test(priority=0,enabled=true)
		public void verifyRinazinacookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        ah.clickonCookieBtn();
	        System.out.println("Verify Abreva Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        ah.clickonCookieBtn();
	        System.out.println("Verify Abreva Cookie Popup on Live Url");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyBuyNow1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonBuyNow1();
	        System.out.println("Verified BuyNow1 is Displayed Successfully on Preprod Url");
	        switchingTab(secondTab);
	        ah.clickonBuyNow1();
	       System.out.println("Verified BuyNow1 is Displayed Successfully on Live Url");
		}							
	 @Test(priority=2,enabled=true)
		public void verifyBuyNow2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonBuyNow2();
	        System.out.println("Verified BuyNow2 is Displayed Successfully on Preprod Url");
	        switchingTab(secondTab);
	        ah.clickonBuyNow2();
	       System.out.println("Verified BuyNow2 is Displayed Successfully on Live Url");
		}							
	 @Test(priority=3,enabled=true)
		public void verifyGetCouponsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonGetCoupons();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ah.clickonGetCoupons();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for GetCoupons:"+compareTwoText);
		}					
	 @Test(priority=4,enabled=true)
		public void verifyReadReviewsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonReadReviews();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ah.clickonReadReviews();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ReadReviews:"+compareTwoText);
		}					
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
