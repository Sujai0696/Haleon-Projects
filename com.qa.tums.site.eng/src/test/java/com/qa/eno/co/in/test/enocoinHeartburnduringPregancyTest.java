package com.qa.eno.co.in.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.eno.co.in.pages.enocoinHeartburnduringPregancyPage;

public class enocoinHeartburnduringPregancyTest extends BaseClass{
	
	enocoinHeartburnduringPregancyPage eh;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("eno_co_inConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 eh=new enocoinHeartburnduringPregancyPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("eno_co_inConfig.properties").getProperty("preProdenoinHeartburnduringPregancyUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("eno_co_inConfig.properties").getProperty("LiveenoinHeartburnduringPregancyUrl"));
		 }					
	 @Test(priority=1,enabled=true)
		public void verifyDealingwithAcidityNightLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonDealingwithAcidityNight();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonDealingwithAcidityNight();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeDealingwithAcidityNight:"+compareTwoText);
		}				
	 @Test(priority=2,enabled=true)
		public void verifyControlAcidityLifestyleLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonControlAcidityLifestyle();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonControlAcidityLifestyle();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for controlAcidityLifestyle:"+compareTwoText);
		}				
	 @Test(priority=3,enabled=true)
		public void verifylivinglifeAcidityFreeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonLivinglifeAcidityFree();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonLivinglifeAcidityFree();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for LivingLifeAcidityfree:"+compareTwoText);
		}				
	 @Test(priority=4,enabled=true)
		public void verifyWhatIsEnoLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonWhatIsEno();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonWhatIsEno();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for WhatisEno:"+compareTwoText);
		}				
	 @Test(priority=5,enabled=true)
		public void verifyUnderstandingHeartBurnLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonUnderstamdingHeartburn();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonUnderstamdingHeartburn();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for UnderstandingHeartBurn:"+compareTwoText);
		}			
	 @Test(priority=6,enabled=true)
		public void verifyInitialSymptomsHearburnLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonInitialHeartburnSymptoms();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonInitialHeartburnSymptoms();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for InitialSymptomsHeartburn:"+compareTwoText);
		}			
	 @Test(priority=7,enabled=true)
		public void verifyReferencesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonReferences();
	        System.out.println("Verified References Successfully on Preprod Url");
	        switchingTab(secondTab);
	        eh.clickonReferences();
	        System.out.println("Verified References Successfully on Live Url");
		}			
	 @Test(priority=8,enabled=true)
		public void verifyStomachHeartLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonStomachHurt();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonStomachHurt();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for StomachHurt:"+compareTwoText);
		}			
	 @Test(priority=9,enabled=true)
		public void verifyHomeRemediesHeartburnLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonHomeRemediesheartburn();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonHomeRemediesheartburn();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Homeremedies Heartburn:"+compareTwoText);
		}			
	 @Test(priority=10,enabled=true)
		public void verifyDidyouKnowSectionLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonDidYouKnowSection();
	        System.out.println("Did you know section is verified in the preprod URL");
	        switchingTab(secondTab);
	        eh.clickonDidYouKnowSection();
	        System.out.println("Did you know section is verified in the Live URL");
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
