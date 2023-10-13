package com.qa.eno.co.in.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.eno.co.in.pages.enocoinUnderstandingHeartBurnPage;

public class enocoinUnderstandingHeartBurnTest extends BaseClass{

	enocoinUnderstandingHeartBurnPage eh;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("eno_co_inConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 eh=new enocoinUnderstandingHeartBurnPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("eno_co_inConfig.properties").getProperty("preProdenoinUnderstandingHeartburnUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("eno_co_inConfig.properties").getProperty("LiveenoinUnderstandingHeartburnUrl"));
		 }					
	 @Test(priority=1,enabled=true)
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
	 @Test(priority=2,enabled=true)
		public void verifyInitialSymptomsofAcidityLink() throws Throwable
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
	 @Test(priority=3,enabled=true)
		public void verifyInitialSymptomsHeartBurnLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonInitialsymptomsHeartBurn();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonInitialsymptomsHeartBurn();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for InitialSymptomsHeartBurn:"+compareTwoText);
		}		
	 @Test(priority=4,enabled=true)
		public void verifyUnderstandingHeartBurnLink() throws Throwable
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
	 @Test(priority=5,enabled=true)
		public void verifyWhatisEnoLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonWhatisEno();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonWhatisEno();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for WhatisEno:"+compareTwoText);
		}		
	 @Test(priority=6,enabled=true)
		public void verifyYourEverydayLifeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonyoureverydaylife_here();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonyoureverydaylife_here();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Youreverydaylife:"+compareTwoText);
		}		
	 @Test(priority=7,enabled=true)
		public void verifyReferencesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonReferences();
	        System.out.println("Verified Referennces on Preprod url");
	        switchingTab(secondTab);
	        eh.clickonReferences();
	        System.out.println("Verified References on Live Url");
		}		
	 @Test(priority=8,enabled=true)
		public void verifyHeartBurnduringPregancyLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonHeartBurnDuringPregancy();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonHeartBurnDuringPregancy();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HeartBurnDuringPregancy:"+compareTwoText);
		}		
	 @Test(priority=9,enabled=true)
		public void verifyAcidityRefluxorGerdLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonAcidityorRefluxorgerd();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonAcidityorRefluxorgerd();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AcidityorRefluxorGerd:"+compareTwoText);
		}		
	//next slider//
	 
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
