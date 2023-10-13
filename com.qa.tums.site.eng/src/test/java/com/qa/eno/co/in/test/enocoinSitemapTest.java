package com.qa.eno.co.in.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.eno.co.in.pages.enocoinSitemapPage;

public class enocoinSitemapTest extends BaseClass{
	
	enocoinSitemapPage es;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("eno_co_inConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 es=new enocoinSitemapPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("eno_co_inConfig.properties").getProperty("preProdenoinSitemapUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("eno_co_inConfig.properties").getProperty("LiveenocoinSitemapUrl"));
		 }					
	 @Test(priority=1,enabled=true)
		public void verifyHomeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        es.clickonHome();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        es.clickonHome();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Home:"+compareTwoText);
		}			
	 @Test(priority=2,enabled=true)
		public void verifyAllAboutAcidityLink() throws Throwable
		{
		 switchingTab(firstTab);
	        es.clickonAllaboutAcidity();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        es.clickonAllaboutAcidity();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AllaboutAcidity:"+compareTwoText);
		}			
	 @Test(priority=3,enabled=true)
		public void verifyUnderstandingAcidityLink() throws Throwable
		{
		 switchingTab(firstTab);
	        es.clickonUnderstandingAcidity();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        es.clickonUnderstandingAcidity();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for UnderstandingAcidity:"+compareTwoText);
		}			
	 @Test(priority=4,enabled=true)
		public void verifyInitialSymptomsAcidityLink() throws Throwable
		{
		 switchingTab(firstTab);
	        es.clickonInitialSymptomsAcidity();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        es.clickonInitialSymptomsAcidity();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for InitialSymptomsAcidity:"+compareTwoText);
		}			
	 @Test(priority=5,enabled=true)
		public void verifyAcidityorIndigestionLink() throws Throwable
		{
		 switchingTab(firstTab);
	        es.clickonAcidityorIndigestion();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        es.clickonAcidityorIndigestion();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AcidityorIndigestion:"+compareTwoText);
		}			
	 @Test(priority=6,enabled=true)
		public void verifyControlAcidityLifestyleLink() throws Throwable
		{
		 switchingTab(firstTab);
	        es.clickonControlAcidityLifestyle();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        es.clickonControlAcidityLifestyle();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ControlAcidityLifestyle:"+compareTwoText);
		}			
	 @Test(priority=7,enabled=true)
		public void verifyHomeRemediesAcidityLink() throws Throwable
		{
		 switchingTab(firstTab);
	        es.clickonHomeRemediesAcidity();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        es.clickonHomeRemediesAcidity();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeRemediesAcidity:"+compareTwoText);
		}		
	 @Test(priority=8,enabled=true)
		public void verifyDealingAcidityNightLink() throws Throwable
		{
		 switchingTab(firstTab);
	        es.clickonDealingAcidityNight();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        es.clickonDealingAcidityNight();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for DealingAcidityNight:"+compareTwoText);
		}		
	 @Test(priority=9,enabled=true)
		public void verifyConstantAcidityLink() throws Throwable
		{
		 switchingTab(firstTab);
	        es.clickonConstantAcidity();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        es.clickonConstantAcidity();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ConstantAcidity:"+compareTwoText);
		}		
	 @Test(priority=10,enabled=true)
		public void verifyLivingLifeAcidityFreeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        es.clickonLivinglifeAcidityfree();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        es.clickonLivinglifeAcidityfree();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for LivingLifeAcidityFree:"+compareTwoText);
		}		
	 @Test(priority=11,enabled=true)
		public void verifyAcidityAcidReluxorgerdLink() throws Throwable
		{
		 switchingTab(firstTab);
	        es.clickonAcidityorRefluxorGerd();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        es.clickonAcidityorRefluxorGerd();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AcidityReluxorgerd:"+compareTwoText);
		}		
	 @Test(priority=12,enabled=true)
		public void verifyEnoProductsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        es.clickonEnoProducts();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        es.clickonEnoProducts();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for EnoProducts:"+compareTwoText);
		}		
	 @Test(priority=13,enabled=true)
		public void verifyEnoFruitSaltLink() throws Throwable
		{
		 switchingTab(firstTab);
	        es.clickonEnoFruitSalt();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        es.clickonEnoFruitSalt();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for EnoFruitSalt:"+compareTwoText);
		}		
	 @Test(priority=14,enabled=true)
		public void verifyEnoFruitSaltBottleLink() throws Throwable
		{
		 switchingTab(firstTab);
	        es.clickonEnoFruitSaltBottle();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        es.clickonEnoFruitSaltBottle();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for EnoFruitSaltBottle:"+compareTwoText);
		}		
	 @Test(priority=15,enabled=true)
		public void verifyContactUsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        es.clickonContactUs();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        es.clickonContactUs();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ContactUs:"+compareTwoText);
		}		
	 @Test(priority=16,enabled=true)
		public void verifyFAQsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        es.clickonFAQs();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        es.clickonFAQs();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for FAQs:"+compareTwoText);
		}		
	 @Test(priority=17,enabled=true)
		public void verifyPrivacyPolicyLink() throws Throwable
		{
		 switchingTab(firstTab);
	        es.clickonPrivacyPolicy();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        es.clickonPrivacyPolicy();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for PrivacyPolicy:"+compareTwoText);
		}		
	 @Test(priority=18,enabled=true)
		public void verifyTermsUseLink() throws Throwable
		{
		 switchingTab(firstTab);
	        es.clickonTermsUse();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        es.clickonTermsUse();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for TermsUse:"+compareTwoText);
		}		
	 @Test(priority=19,enabled=true)
		public void verifyHeartBurnDuringPregancyLink() throws Throwable
		{
		 switchingTab(firstTab);
	        es.clickonHeartBurnDuringPregancy();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        es.clickonHeartBurnDuringPregancy();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HeartBurnDuringPregancy:"+compareTwoText);
		}		
	 @Test(priority=20,enabled=true)
		public void verifyAcidRefluxBabiesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        es.clickonAcidRefluxBabies();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        es.clickonAcidRefluxBabies();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AcidRefluxBabies:"+compareTwoText);
		}		
	 @Test(priority=21,enabled=true)
		public void verifyDiwaliRamazanLink() throws Throwable
		{
		 switchingTab(firstTab);
	        es.clickonDiwaliRamazan();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        es.clickonDiwaliRamazan();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for DiwaliRamazan:"+compareTwoText);
		}		
	 @Test(priority=22,enabled=true)
		public void verifyWhydoesStomachHeartLink() throws Throwable
		{
		 switchingTab(firstTab);
	        es.clickonWhydoesStomachHeart();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        es.clickonWhydoesStomachHeart();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for WhydoesStomachHeart:"+compareTwoText);
		}		
	 @Test(priority=23,enabled=true)
		public void verifyUnderstandingDigestiveWellnessLink() throws Throwable
		{
		 switchingTab(firstTab);
	        es.clickonUnderstandingDigestiveWellness();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        es.clickonUnderstandingDigestiveWellness();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for UnderstandingDigestiveWellness:"+compareTwoText);
		}		
	 @Test(priority=24,enabled=true)
		public void verifyFoodImproveDigestionLink() throws Throwable
		{
		 switchingTab(firstTab);
	        es.clickonFoodThatImproveDigestion();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        es.clickonFoodThatImproveDigestion();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for FoodImproveDigestion:"+compareTwoText);
		}		
	 @Test(priority=25,enabled=true)
		public void verifyHomeRemediesIndigestionLink() throws Throwable
		{
		 switchingTab(firstTab);
	        es.clickonHomeRemediesIndigestion();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        es.clickonHomeRemediesIndigestion();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeRemediesIndigestion:"+compareTwoText);
		}		
	 @Test(priority=26,enabled=true)
		public void verifyGasReliefLink() throws Throwable
		{
		 switchingTab(firstTab);
	        es.clickonGasRelief();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        es.clickonGasRelief();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for GasRelief:"+compareTwoText);
		}		
	 @Test(priority=27,enabled=true)
		public void verifyWhatisEnoLink() throws Throwable
		{
		 switchingTab(firstTab);
	        es.clickonwhatisEno();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        es.clickonwhatisEno();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for WhatisEno:"+compareTwoText);
		}		
	 @Test(priority=28,enabled=true)
		public void verifyEnoJourneyLink() throws Throwable
		{
		 switchingTab(firstTab);
	        es.clickonEnoJourney();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        es.clickonEnoJourney();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for EnoJourney:"+compareTwoText);
		}		
	 @Test(priority=29,enabled=true)
		public void verifyCurrentCampaignsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        es.clickonCurrentCampaigns();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        es.clickonCurrentCampaigns();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for CurrentCampaigns:"+compareTwoText);
		}		
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	
	
	
	
	
	
	
	
	
	

}
