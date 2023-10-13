package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.abreva.pages.AbrevadealingcoldsorePage;


public class AbrevadealingcoldsoreTest extends BaseClass{
	
	AbrevadealingcoldsorePage ac;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 ac=new AbrevadealingcoldsorePage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("abreva_Config.properties").getProperty("preProdAbrevadealingwithcoldsoresUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("abreva_Config.properties").getProperty("LiveAbrevadealingwithcoldsoresUrl"));
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
		public void verifyColdsorecontagiousLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonColdsorecontagious();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonColdsorecontagious();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cold sore Contagious:"+compareTwoText);
		}									
	 @Test(priority=9,enabled=true)
		public void verifywaysridcoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonwaysridcoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonwaysridcoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ways rid cold sores:"+compareTwoText);
		}						
	 @Test(priority=10,enabled=true)
		public void verifyfeelconfidentcoldsoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonfeelconfidentcoldsore();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonfeelconfidentcoldsore();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for feel confident:"+compareTwoText);
		}				
	 @Test(priority=11,enabled=true)
		public void verifyConcealcoldsoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonConcealcoldsore();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonConcealcoldsore();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Conceal cold sore:"+compareTwoText);
		}				
	 @Test(priority=12,enabled=true)
		public void verifyKisstellLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonkisstell();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonkisstell();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for kisstell:"+compareTwoText);
		}				
	 @Test(priority=13,enabled=true)
		public void verifyfeverblistercoldsoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonfeverblistercoldsore();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonfeverblistercoldsore();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for fever blister cold sore:"+compareTwoText);
		}				
	 @Test(priority=14,enabled=true)
		public void verifyridofcoldsoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonridofcoldsore();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonridofcoldsore();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for rid of cold sore:"+compareTwoText);
		}				
	 @Test(priority=15,enabled=true)
		public void verifyfacecoldsoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonfacecoldsore();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonfacecoldsore();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for face cold sore:"+compareTwoText);
		}				
	 @Test(priority=16,enabled=true)
		public void verifyColdsoreremediesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonColdsoreremedies();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonColdsoreremedies();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for cold sore remedies:"+compareTwoText);
		}				
	 @Test(priority=17,enabled=true)
		public void verifyColdsoreconfidentlyLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonColdsoreconfidently();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonColdsoreconfidently();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for cold sore Confidently:"+compareTwoText);
		}				
	 @Test(priority=18,enabled=true)
		public void verifyColdsoreconfessionLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonColdsoreconfession();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonColdsoreconfession();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for cold sore confession:"+compareTwoText);
		}				
	 @Test(priority=19,enabled=true)
		public void verifyhelpspreadLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonhelpspread();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonhelpspread();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for help spread:"+compareTwoText);
		}				
	 @Test(priority=20,enabled=true)
		public void verifytreatcoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickontreatcoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickontreatcoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for treatcoldsores:"+compareTwoText);
		}				
	 @Test(priority=21,enabled=true)
		public void verifyhealcoldsorescabLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonhealcoldsorescab();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonhealcoldsorescab();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for heal cold sore scab:"+compareTwoText);
		}				
	 @Test(priority=22,enabled=true)
		public void verifycoldsorenoseLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickoncoldsorenose();;
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickoncoldsorenose();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for cold sore nose:"+compareTwoText);
		}				
	 @Test(priority=23,enabled=true)
		public void verifytoothpasteworkLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickontoothpastework();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickontoothpastework();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for tooth paste work:"+compareTwoText);
		}				
	 @Test(priority=24,enabled=true)
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
	 @Test(priority=25,enabled=true)
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
