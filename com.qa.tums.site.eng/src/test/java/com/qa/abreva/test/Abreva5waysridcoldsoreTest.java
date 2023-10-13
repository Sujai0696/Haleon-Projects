package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.abreva.pages.Abreva5waysridcoldsorePage;

public class Abreva5waysridcoldsoreTest extends BaseClass{
	
	Abreva5waysridcoldsorePage ac;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 ac=new Abreva5waysridcoldsorePage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("abreva_Config.properties").getProperty("preProdAbreva5waysridcoldsoreUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("abreva_Config.properties").getProperty("LiveAbreva5waysridcoldsoreUrl"));
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
		public void verifyManagingLipHealthLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonManagingliphealth();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonManagingliphealth();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Managing lip health:"+compareTwoText);
		}										
	 @Test(priority=2,enabled=true)
		public void verifyDealingColdSoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonDealingColdSore();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonDealingColdSore();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for DealingColdSore:"+compareTwoText);
		}										
	 @Test(priority=3,enabled=true)
		public void verifyLipCareLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonLipCare();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonLipCare();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for lipcare:"+compareTwoText);
		}						
	 @Test(priority=4,enabled=true)
		public void verifyStresscoldsoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonStressColdsore();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonStressColdsore();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Stress Cold Sore:"+compareTwoText);
		}						
	 @Test(priority=5,enabled=true)
		public void verifyLipProblemLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonLipProblem();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonLipProblem();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Lip Problem:"+compareTwoText);
		}						
	 @Test(priority=6,enabled=true)
		public void verifyAloeveracoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonAloeveracoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonAloeveracoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Aloe vera cold sores:"+compareTwoText);
		}						
	 @Test(priority=7,enabled=true)
		public void verifyRecurringcoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonRecurringcoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonRecurringcoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Recurring Cold Sores:"+compareTwoText);
		}							
	 @Test(priority=8,enabled=true)
		public void verifyDealingwithColdSoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonDealingwithcoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonDealingwithcoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Dealing with Cold Sores:"+compareTwoText);
		}						
	 @Test(priority=9,enabled=true)
		public void verifyColdSoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickoncoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickoncoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for  Cold Sores:"+compareTwoText);
		}						
	 @Test(priority=10,enabled=true)
		public void verifyBanner1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonBanner1();
	        System.out.println("Verified the Banner is Displayed on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonBanner1();
	        System.out.println("Verified the Banner is Displayed on Live Url");
		}						
	 @Test(priority=11,enabled=true)
		public void verifyBanner2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonBanner2();
	        System.out.println("Verified the Banner is Displayed on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonBanner2();
	        System.out.println("Verified the Banner is Displayed on Live Url");
		}						
	 @Test(priority=12,enabled=true)
		public void verifyBanner3Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonBanner3();
	        System.out.println("Verified the Banner is Displayed on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonBanner3();
	        System.out.println("Verified the Banner is Displayed on Live Url");
		}						
	 @Test(priority=13,enabled=true)
		public void verifyBanner4Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonBanner4();
	        System.out.println("Verified the Banner is Displayed on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonBanner4();
	        System.out.println("Verified the Banner is Displayed on Live Url");
		}						
	
	 @Test(priority=14,enabled=true)
		public void verifyBanner5Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonBanner5();
	        System.out.println("Verified the Banner is Displayed on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonBanner5();
	        System.out.println("Verified the Banner is Displayed on Live Url");
		}						
	
	 @Test(priority=15,enabled=true)
		public void verifyYouTubeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonYoutube();
	        System.out.println("Verified the Youtube is played successfully on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonYoutube();
	        System.out.println("Verified the Youtube is played successfully on Live Url");
		}						
	 @Test(priority=16,enabled=true)
		public void verifyRelatedArticle1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonRelatedArticle1();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonRelatedArticle1();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Related Article1:"+compareTwoText);
		}						
	 @Test(priority=17,enabled=true)
		public void verifyRelatedArticle2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonRelatedArticle2();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonRelatedArticle2();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Related Article2:"+compareTwoText);
		}						
	 @Test(priority=18,enabled=true)
		public void verifyRelatedArticle3Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonRelatedArticle3();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonRelatedArticle3();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Related Article3:"+compareTwoText);
		}						
	 @Test(priority=19,enabled=true)
		public void verifyGetCouponsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickongetcoupons();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickongetcoupons();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for GetCoupons:"+compareTwoText);
		}						
	 @Test(priority=20,enabled=true)
		public void verifyBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonBuyNow();
	        System.out.println("Verified BuyNow is Displayed on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonBuyNow();
	       System.out.println("Verified BuyNow is Displayed on Live Url");
		}				
	
	
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
