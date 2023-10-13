package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.abreva.pages.AbrevacoldsoretriggerPage;

public class AbrevacoldsoretriggerTest extends BaseClass{
	
	AbrevacoldsoretriggerPage ac;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 ac=new AbrevacoldsoretriggerPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("abreva_Config.properties").getProperty("preProdAbrevacoldsoretriggerUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("abreva_Config.properties").getProperty("LiveAbrevacoldsoretriggerUrl"));
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
		public void verifyliphealthLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonliphealth();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonliphealth();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for lip health:"+compareTwoText);
		}							
	 @Test(priority=9,enabled=true)
		public void verifyColdsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonColdsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonColdsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for cold sores:"+compareTwoText);
		}							
	 @Test(priority=10,enabled=true)
		public void verifyStressLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonStress();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonStress();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Stress:"+compareTwoText);
		}							
	 @Test(priority=11,enabled=true)
		public void verifygettingenoughsleepLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickongettingenoughsleep();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickongettingenoughsleep();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Getting enough sleep:"+compareTwoText);
		}							
	 @Test(priority=12,enabled=true)
		public void verifyUsingSunscreenLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonusingsunscreen();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonusingsunscreen();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same forusing sunscreen:"+compareTwoText);
		}					
	 @Test(priority=13,enabled=true)
		public void verifyHormonalchangesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonHormonalchange();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonHormonalchange();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for hormonal changes:"+compareTwoText);
		}					
	 @Test(priority=13,enabled=true)
		public void verifyProtectinglipsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonProtectinglips();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonProtectinglips();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Protecting lips:"+compareTwoText);
		}					
	 @Test(priority=14,enabled=true)
		public void verifyDealingcoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonDealingcoldsores1();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonDealingcoldsores1();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Dealing cold sores1:"+compareTwoText);
		}					
	 @Test(priority=15,enabled=true)
		public void verifySelectDropdownLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonSelect_dropdown();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonSelect_dropdown();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Select Dropdown:"+compareTwoText);
		}					
	 @Test(priority=16,enabled=true)
		public void verifySummerplanningLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonSummerplanning();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonSummerplanning();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Summer planning:"+compareTwoText);
		}					
	 @Test(priority=17,enabled=true)
		public void verifyColdsoresweatherLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickoncoldsoresweather();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickoncoldsoresweather();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cold sore weather:"+compareTwoText);
		}					
	 @Test(priority=18,enabled=true)
		public void verifygetfactsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickongetfacts();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickongetfacts();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for get facts:"+compareTwoText);
		}					
	 @Test(priority=19,enabled=true)
		public void verifyManagingliphealthbettersleepLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonmanagingliphealthbettersleep();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonmanagingliphealthbettersleep();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for managing lip health better sleep:"+compareTwoText);
		}					
	 @Test(priority=20,enabled=true)
		public void verifyManagingtriggersLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonmanagingtriggers();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonmanagingtriggers();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for managing triggers:"+compareTwoText);
		}					
	 @Test(priority=21,enabled=true)
		public void verifyManagingliphealthLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonmanagingliphealths();;
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonmanagingliphealths();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for managing lip healths:"+compareTwoText);
		}					
	 @Test(priority=22,enabled=true)
		public void verifyRelaxationTechniquesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonRelaxationTechniques();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonRelaxationTechniques();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Relaxation Techniques:"+compareTwoText);
		}					
	 @Test(priority=23,enabled=true)
		public void verifyReducestresstriggerLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonReducestresstrigger();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonReducestresstrigger();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Reduce stress trigger:"+compareTwoText);
		}				
	 @Test(priority=24,enabled=true)
		public void verifyCopeillnessLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonCopeillness();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonCopeillness();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cope Illness:"+compareTwoText);
		}				
	 @Test(priority=25,enabled=true)
		public void verifyStressworkmanageLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonstressworkmanage();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonstressworkmanage();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for stress work manage:"+compareTwoText);
		}				
	 @Test(priority=26,enabled=true)
		public void verifyplanimportantdaysLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonplanimportantdays();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonplanimportantdays();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for plan important days:"+compareTwoText);
		}				
	 @Test(priority=27,enabled=true)
		public void verifygetfactscoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickongetfactscoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickongetfactscoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for get facts cold sores:"+compareTwoText);
		}				
	 @Test(priority=28,enabled=true)
		public void verifyVisitingDentistsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonvisitingDentist();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonvisitingDentist();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Visiting Dentist:"+compareTwoText);
		}				
	 @Test(priority=29,enabled=true)
		public void verifyFlupreventionLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonfluprevention();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonfluprevention();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for flu prevention:"+compareTwoText);
		}				
	 @Test(priority=30,enabled=true)
		public void verifyAvoidcoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonAvoidcoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonAvoidcoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for avoid cold sores:"+compareTwoText);
		}				
	 @Test(priority=31,enabled=true)
		public void verifylipfillercauseLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonlipfillercause();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonlipfillercause();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for lip filler cause:"+compareTwoText);
		}				
	 @Test(priority=32,enabled=true)
		public void verifyhavestdLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonhavestd();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonhavestd();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for have std:"+compareTwoText);
		}				
	 @Test(priority=33,enabled=true)
		public void verifyAntiviralcoldsoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonAntiviralcoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonAntiviralcoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Anti viral cold sores:"+compareTwoText);
		}				
	 @Test(priority=34,enabled=true)
		public void verifyParentguideLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonparentguide();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonparentguide();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for parent guide:"+compareTwoText);
		}				
	 @Test(priority=35,enabled=true)
		public void verifyreadlipcareLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonreadlipcare();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonreadlipcare();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for read lip care:"+compareTwoText);
		}				
	 @Test(priority=36,enabled=true)
		public void verifyBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonBuyNow();
	       System.out.println("Verified BuyNow is displayed successfully on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonBuyNow();
	       System.out.println("Verified BuyNow is displayed successfully on Live Url");
		}			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
