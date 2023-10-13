package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.abreva.pages.AbrevacoldsorefirstsignPage;

public class AbrevacoldsorefirstsignTest extends BaseClass{

	AbrevacoldsorefirstsignPage ac;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 ac=new AbrevacoldsorefirstsignPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("abreva_Config.properties").getProperty("preProdAbrevacoldsorefirstsignUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("abreva_Config.properties").getProperty("LiveAbrevacoldsorefirstsignUrl"));
		 }	
	 @Test(priority=0,enabled=true)
		public void verifyAbrevacookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        ac.clickonCookieBtn();
	        System.out.println("Verify Abreva Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonCookieBtn();
	        System.out.println("Verify Abreva Cookie Popup on Live Url");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyColdsoreReliefLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonColdsoreRelief();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonColdsoreRelief();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cold sore Relief:"+compareTwoText);
		}									
	 @Test(priority=2,enabled=true)
		public void verifyStressedLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonStressed();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonStressed();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Stressed:"+compareTwoText);
		}				
	 @Test(priority=3,enabled=true)
		public void verifyColdsoreTreatmentLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickoncoldsoretreatment();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickoncoldsoretreatment();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cold sore Treatment:"+compareTwoText);
		}				
	 @Test(priority=4,enabled=true)
		public void verifyridcoldsoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickongetridcoldsore();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickongetridcoldsore();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for getrid cold sore:"+compareTwoText);
		}				
	 @Test(priority=5,enabled=true)
		public void verifysignstagesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonsignstages();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonsignstages();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for sign stages:"+compareTwoText);
		}				
	 @Test(priority=6,enabled=true)
		public void verifyreduceOccuranceLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonreduceoccurance();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonreduceoccurance();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Reduce occurance:"+compareTwoText);
		}				
	 @Test(priority=7,enabled=true)
		public void verifylearntriggersLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonlearntriggers();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonlearntriggers();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for learn triggers:"+compareTwoText);
		}				
	 @Test(priority=8,enabled=true)
		public void verifyseeallabrevaproductsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonseeallabrevaproducts();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonseeallabrevaproducts();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for see all abreva products:"+compareTwoText);
		}				
	 @Test(priority=9,enabled=true)
		public void verifyYouTubeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonYouTubeLink();
	        System.out.println("Verified You tube Video is displayed successfully on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonYouTubeLink();
	        System.out.println("Verified You tube Video is displayed successfully on live Url");
		}				
	 @Test(priority=10,enabled=true)
		public void verifySeeTranscriptLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonSeetranscript();
	        System.out.println("Verified Transcript is displayed successfully on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonSeetranscript();
	        System.out.println("Verified Transcript is displayed successfully on live Url");
		}				
	 @Test(priority=11,enabled=true)
		public void verifyBuynowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonBuyNow();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonBuyNow();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for BuyNow:"+compareTwoText);
		}				
	 @Test(priority=12,enabled=true)
		public void verifyReadAllReviewsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonReadallReviews();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonReadallReviews();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ReadAllReviews:"+compareTwoText);
		}				
	 @Test(priority=13,enabled=true)
		public void verifyManagingliphealthLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonManagingliphealth();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonManagingliphealth();;
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Managing lip health:"+compareTwoText);
		}				
	 @Test(priority=14,enabled=true)
		public void verifyReadmore1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonReadmore1();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonReadmore1();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same forReadmore1:"+compareTwoText);
		}				
	 @Test(priority=15,enabled=true)
		public void verifyReadmore2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonReadmore2();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonReadmore2();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Readmore2:"+compareTwoText);
		}				
	 @Test(priority=16,enabled=true)
		public void verifyReadmore3Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonReadmore3();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonReadmore3();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Readmore3:"+compareTwoText);
		}				
	 @Test(priority=17,enabled=true)
		public void verifyCouponLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickongetcoupons();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickongetcoupons();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Coupon:"+compareTwoText);
		}				
	 @Test(priority=18,enabled=true)
		public void verifyBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonBuyNow1();
	        System.out.println("Verified BuyNow1 is Displayed on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonBuyNow1();
	        System.out.println("Verified BuyNow1 is Displayed on Live Url");
		}			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
