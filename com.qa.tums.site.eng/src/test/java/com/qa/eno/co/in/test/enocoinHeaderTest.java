package com.qa.eno.co.in.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.eno.co.in.pages.enocoinHeaderPage;

public class enocoinHeaderTest extends BaseClass{
	
	enocoinHeaderPage eh;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("eno_co_inConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 eh=new enocoinHeaderPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("eno_co_inConfig.properties").getProperty("preProdenoinHomepageUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("eno_co_inConfig.properties").getProperty("liveenoinHomepageUrl"));
		 }					
	 @Test(priority=1,enabled=true)
		public void verifyAllAboutAcidityLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonAllaboutAcidity();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonAllaboutAcidity();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AllAboutAcidity:"+compareTwoText);
		}		
	 @Test(priority=2,enabled=true)
		public void verifyIsItAcidityorRefluxLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonIsItAcidityorReflux();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonIsItAcidityorReflux();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for IsItAcidityorReflux:"+compareTwoText);
		}		
	 @Test(priority=3,enabled=true)
		public void verifyAcidityorIndigestionLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonAcidityorIndigestion();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonAcidityorIndigestion();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AcidityorIndigestion:"+compareTwoText);
		}		
	 @Test(priority=4,enabled=true)
		public void verifyWhyStomachHeartLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonWhyStomachHeart();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonWhyStomachHeart();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for whyStomachHeart:"+compareTwoText);
		}		
	 @Test(priority=5,enabled=true)
		public void verifyUnderstandingActivityLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonUnderstandingActivity();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonUnderstandingActivity();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for UnderstandingActivity:"+compareTwoText);
		}		
	 @Test(priority=6,enabled=true)
		public void verifyInitialSymptomsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonInitialSymptoms();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonInitialSymptoms();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for InitialSymptoms:"+compareTwoText);
		}		
	 @Test(priority=7,enabled=true)
		public void verifyLivinglifeAcidityFreeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonLivingAcidityFree();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonLivingAcidityFree();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for LivingAcidity Free:"+compareTwoText);
		}		
	 @Test(priority=8,enabled=true)
		public void verifyHomeRemediesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonHomeRemedies();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonHomeRemedies();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeRemedies:"+compareTwoText);
		}		
	 @Test(priority=9,enabled=true)
		public void verifyUnderstandingHeartburnLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonUnderstandingHeartBurn();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonUnderstandingHeartBurn();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for UnderstandingHeartBurn:"+compareTwoText);
		}		
	 @Test(priority=10,enabled=true)
		public void verifyInitialSymptomsHeartBurnLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonInitialSymptomsHeartBurn();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonInitialSymptomsHeartBurn();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for InitialSymptomsHeartBurn:"+compareTwoText);
		}		
	 @Test(priority=11,enabled=true)
		public void verifyHomeRemediesHeartBurnLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonHomeRemediessHeartBurn();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonHomeRemediessHeartBurn();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeRemediesHeartBurn:"+compareTwoText);
		}		
	 @Test(priority=12,enabled=true)
		public void verifyGasReliefLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonGasRelief();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonGasRelief();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for GasRelief:"+compareTwoText);
		}		
	 @Test(priority=13,enabled=true)
		public void verifyEnoProductsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonEnoProducts();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonEnoProducts();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for EnoProducts:"+compareTwoText);
		}		
	 @Test(priority=14,enabled=true)
		public void verifyEnoFruitSaltLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonEnoFruitSalt();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonEnoFruitSalt();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for EnoFruitSalt:"+compareTwoText);
		}		
	 @Test(priority=15,enabled=true)
		public void verifyEnoFruitSaltBottleLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonEnoFruitSaltBottle();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonEnoFruitSaltBottle();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for EnoFruitSaltBottle:"+compareTwoText);
		}		
	 @Test(priority=16,enabled=true)
		public void verifyDiscoverEnoLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonDiscoverEno();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonDiscoverEno();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for DiscoverEno:"+compareTwoText);
		}		
	 
	 @Test(priority=17,enabled=true)
		public void verifyCurrentCampaignsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonCurrentCampaigns();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonCurrentCampaigns();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for CurrentCampaigns:"+compareTwoText);
		}		
	 @Test(priority=18,enabled=true)
		public void verifyWhatIsEnoLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonWhatIsEno();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonWhatIsEno();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for WhatIsEno:"+compareTwoText);
		}		
	 @Test(priority=19,enabled=true)
		public void verifyEnoJourneyLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonEnoJourney();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonEnoJourney();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for EnoJourney:"+compareTwoText);
		}		
	 @Test(priority=20,enabled=true)
		public void verifyConnectWithEnoLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonConnectWithEno();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonConnectWithEno();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Connect With Eno:"+compareTwoText);
		}		
	 @Test(priority=21,enabled=true)
		public void verifyFAQLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonFAQ();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonFAQ();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for FAQ:"+compareTwoText);
		}		
	 @Test(priority=22,enabled=true)
		public void verifySearchIconLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonSearchIcon();
	        System.out.println("Verified the Search Icon on preprod Url");
	        switchingTab(secondTab);
	        eh.clickonSearchIcon();
	        System.out.println("Verified the Search Icon on Live Url");
		}		
	 @Test(priority=23,enabled=true)
		public void verifyEnoLogoLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonEnoLogo();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonEnoLogo();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for EnoLogo:"+compareTwoText);
		}		
	
	
	
	
	
	
	
	
	
	
	

}
