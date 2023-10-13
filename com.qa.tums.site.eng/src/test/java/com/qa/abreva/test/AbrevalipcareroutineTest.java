package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.abreva.pages.AbrevalipcareroutinePage;

public class AbrevalipcareroutineTest extends BaseClass{
	
	AbrevalipcareroutinePage ac;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 ac=new AbrevalipcareroutinePage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("abreva_Config.properties").getProperty("preProdAbrevalipcareroutineUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("abreva_Config.properties").getProperty("LiveAbrevalipcareroutineUrl"));
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
		public void verifylipcare1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonlipcare1();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonlipcare1();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for lipcare1:"+compareTwoText);
		}										
	 @Test(priority=9,enabled=true)
		public void verifyVitaminrichfoodLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonVitaminrichfood();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonVitaminrichfood();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for vitamin Rich food:"+compareTwoText);
		}						
	 @Test(priority=10,enabled=true)
		public void verifyColdweatherLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonColdweather();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonColdweather();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cold weather:"+compareTwoText);
		}						
	 @Test(priority=11,enabled=true)
		public void verifyPopcoldsoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonpopcoldsore();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonpopcoldsore();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for pop cold sore:"+compareTwoText);
		}						
	
	 @Test(priority=12,enabled=true)
		public void verifylipcare2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonlipcare2();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonlipcare2();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for lip care2:"+compareTwoText);
		}						
	 @Test(priority=13,enabled=true)
		public void verifyTakequizLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonTakequiz();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonTakequiz();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Take quiz:"+compareTwoText);
		}					
	 @Test(priority=14,enabled=true)
		public void verifyBuyNow1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonBuyNow();
	        System.out.println("Verified BuyNow1 is Displayed on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonBuyNow();
	        System.out.println("Verified BuyNow1 is Displayed on Live Url");
		}			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
