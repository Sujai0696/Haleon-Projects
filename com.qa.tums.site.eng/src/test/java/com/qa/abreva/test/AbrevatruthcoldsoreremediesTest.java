package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.abreva.pages.AbrevatruthcoldsoreremediesPage;

public class AbrevatruthcoldsoreremediesTest extends BaseClass{
	
	AbrevatruthcoldsoreremediesPage ac;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 ac=new AbrevatruthcoldsoreremediesPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("abreva_Config.properties").getProperty("preProdAbrevatruthcoldsoreremediesUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("abreva_Config.properties").getProperty("LiveAbrevatruthcoldsoreremediesUrl"));
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
		public void verifyDealingcoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonDealingwithcoldsoreslink();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonDealingwithcoldsoreslink();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Dealing Cold Sore link:"+compareTwoText);
		}						
	 @Test(priority=9,enabled=true)
		public void verifyLipsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonlipslink();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonlipslink();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for lips link:"+compareTwoText);
		}					
	 @Test(priority=10,enabled=true)
		public void verifyAbrevaCreamLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonAbrevacreamlink();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonAbrevacreamlink();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Abreva Cream link:"+compareTwoText);
		}					
	 @Test(priority=11,enabled=true)
		public void verifyColdSoreTipsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonColdSoreTipslink();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonColdSoreTipslink();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cold Sore Tipslink:"+compareTwoText);
		}					
	 @Test(priority=12,enabled=true)
		public void verifyWeatherwinterLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonWeatherwinterlink();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonWeatherwinterlink();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Weather Winter link:"+compareTwoText);
		}					
	 @Test(priority=13,enabled=true)
		public void verifyColdsoreConfidenceLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonColdsoreConfidencelink();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonColdsoreConfidencelink();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cold sore Confidence link:"+compareTwoText);
		}					
	 @Test(priority=14,enabled=true)
		public void verifyLysinecoldsoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonlysinecoldsorelink();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonlysinecoldsorelink();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Lysine cold sore link:"+compareTwoText);
		}					
	 @Test(priority=15,enabled=true)
		public void verifyGetCouponsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonGetCouponslink();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonGetCouponslink();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for GetCoupons:"+compareTwoText);
		}					
	
	 @Test(priority=16,enabled=true)
		public void verifyBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonBuyNowlink();
	        System.out.println("Verified BuyNow is displayed Successfully on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonBuyNowlink();
	        System.out.println("Verified BuyNow is displayed Successfully on Live Url");
		}					
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
