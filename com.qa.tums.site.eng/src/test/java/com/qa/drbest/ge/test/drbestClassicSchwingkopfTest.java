package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.drbestClassicSchwingkopfPage;

public class drbestClassicSchwingkopfTest extends BaseClass{
	
	drbestClassicSchwingkopfPage dc;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("drbest_deConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 dc=new drbestClassicSchwingkopfPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("drbest_deConfig.properties").getProperty("preProddrbestClassicScchwingkopfUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("drbest_deConfig.properties").getProperty("LivedrbestClassicScchwingkopfUrl"));
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
	        dc.clickonReview();
	        System.out.println("Verify Review in preprod url");
	        switchingTab(secondTab);
	        dc.clickonReview();
	        System.out.println("Verify Review on Live url");
		}		
	 @Test(priority=3,enabled=true)
		public void verifyReview1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dc.clickonReview1();
	        System.out.println("Verify Review1 in preprod url");
	        switchingTab(secondTab);
	        dc.clickonReview1();
	        System.out.println("Verify Review1 on Live url");
		}		
	 @Test(priority=4,enabled=true)
		public void verifypolimedLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dc.clickonpolimed();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dc.clickonpolimed();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Polimed:"+compareTwoText);
		}		
	 @Test(priority=5,enabled=true)
		public void verifypolimedproductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dc.clickonpolimedproduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dc.clickonpolimedproduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for PolimedProduct:"+compareTwoText);
		}		
	 @Test(priority=6,enabled=true)
		public void verifypolimedBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dc.clickonpolimedBuyNow();
	        System.out.println("PolimedBuyNow Retailer is  present on preprod url page");
	        switchingTab(secondTab);
	        dc.clickonpolimedBuyNow();
	        System.out.println("PolimedBuyNow Retailer is  present on live url page");
		}		
	 @Test(priority=7,enabled=true)
		public void verifyVibrationpolimedLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dc.clickonVibrationpolimed();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dc.clickonVibrationpolimed();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Vibrationpolimed:"+compareTwoText);
		}		
	 @Test(priority=8,enabled=true)
		public void verifyVibrationpolimedProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dc.clickonVibrationpolimedProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dc.clickonVibrationpolimedProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for VibrationpolimedProduct:"+compareTwoText);
		}		
	 @Test(priority=9,enabled=true)
		public void verifyVibrationpolimedBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dc.clickonVibrationpolimedBuyNow();
	       System.out.println("Verify BuyNow Retailer display on preprod url");
	        switchingTab(secondTab);
	        dc.clickonVibrationpolimedBuyNow();
	        System.out.println("Verify BuyNow Retailer display on Live url");
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
