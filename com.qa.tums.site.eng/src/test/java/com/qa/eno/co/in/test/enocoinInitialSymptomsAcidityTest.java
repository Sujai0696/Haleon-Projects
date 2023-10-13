package com.qa.eno.co.in.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.eno.co.in.pages.enocoinInitialSymptomsAcidityPage;

public class enocoinInitialSymptomsAcidityTest extends BaseClass{
	
	enocoinInitialSymptomsAcidityPage ei;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("eno_co_inConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 ei=new enocoinInitialSymptomsAcidityPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("eno_co_inConfig.properties").getProperty("preProdenoinInitialSymptomsAcidityUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("eno_co_inConfig.properties").getProperty("LiveenoinInitialSymptomsAcidityUrl"));
		 }					
	 @Test(priority=1,enabled=true)
		public void verifyAcidityLifeFreeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ei.clickonAcidityLifeFree();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ei.clickonAcidityLifeFree();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Aciditylifefree:"+compareTwoText);
		}	
	 @Test(priority=2,enabled=true)
		public void verifyWhatisEnoLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ei.clickonWhatisEno();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ei.clickonWhatisEno();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for WhatisEno:"+compareTwoText);
		}	
	 
	 @Test(priority=3,enabled=true)
		public void verifyUnderstandingAcidityLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ei.clickonUnderstandingAcidity();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ei.clickonUnderstandingAcidity();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Understanding Acidity:"+compareTwoText);
		}			
	 @Test(priority=4,enabled=true)
		public void verifyAcidityorIndigestionLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ei.clickonAcidityorIndigestion();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ei.clickonAcidityorIndigestion();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AcidityorIndigestion:"+compareTwoText);
		}			
	 @Test(priority=5,enabled=true)
		public void verifyAcidityorRefluxorgerdLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ei.clickonAcidityRefluxorgerd();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ei.clickonAcidityRefluxorgerd();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AcidityRefluxorGerd:"+compareTwoText);
		}			
	 @Test(priority=6,enabled=true)
		public void verifyAcidityorIndigestion1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ei.clickonAcidityorIndigestion1();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ei.clickonAcidityorIndigestion1();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AcidityorIndigestion1:"+compareTwoText);
		}			
	 @Test(priority=7,enabled=true)
		public void verifyLivingLifeAcidity_hereLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ei.clickonLivinglifeAcidity_here();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ei.clickonLivinglifeAcidity_here();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for LivinglifeAcidity_here:"+compareTwoText);
		}			
	 @Test(priority=8,enabled=true)
		public void verifyReferencesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ei.clickonReferences();
	       System.out.println("Verified References Successfully on Preprod url");
	        switchingTab(secondTab);
	        ei.clickonReferences();
	        System.out.println("Verified References Successfully on Live url");
		}			
	 @Test(priority=9,enabled=true)
		public void verifyHomeRemediesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ei.clickonHomeRemedies();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ei.clickonHomeRemedies();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeRemedies:"+compareTwoText);
		}			
	 @Test(priority=10,enabled=true)
		public void verifyControlAcidityBusyLifestyleLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ei.clickonControlAcidityBusyLifestyle();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ei.clickonControlAcidityBusyLifestyle();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ControlAcidityBusyLifestyle:"+compareTwoText);
		}			
	//next slider//
	 @Test(priority=11,enabled=true)
		public void verifyDidyouKnowSectionLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ei.clickonDidYouKnowSection();
	        System.out.println("Did you know section is verified in the preprod URL");
	        switchingTab(secondTab);
	        ei.clickonDidYouKnowSection();
	        System.out.println("Did you know section is verified in the Live URL");
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
