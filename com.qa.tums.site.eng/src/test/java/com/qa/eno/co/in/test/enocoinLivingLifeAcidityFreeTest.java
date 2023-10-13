package com.qa.eno.co.in.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.eno.co.in.pages.enocoinLivingLifeAcidityFreePage;

public class enocoinLivingLifeAcidityFreeTest extends BaseClass{
	
	enocoinLivingLifeAcidityFreePage el;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("eno_co_inConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 el=new enocoinLivingLifeAcidityFreePage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("eno_co_inConfig.properties").getProperty("preProdenoinLivingLifeAcidityFreeUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("eno_co_inConfig.properties").getProperty("LiveenoinLivingLifeAcidityFreeUrl"));
		 }					
	 @Test(priority=1,enabled=true)
		public void verifyWhatIsEnoLink() throws Throwable
		{
		 switchingTab(firstTab);
	        el.clickonWhatIsEno();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        el.clickonWhatIsEno();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for WhatIsEno:"+compareTwoText);
		}		
	
	 @Test(priority=2,enabled=true)
		public void verifyInitialSymptomsAcidityLink() throws Throwable
		{
		 switchingTab(firstTab);
	        el.clickonInitialSymptomsAcidity();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        el.clickonInitialSymptomsAcidity();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Initial Symptoms Acidity:"+compareTwoText);
		}		
	 @Test(priority=3,enabled=true)
		public void verifyUnderstandingAcidityLink() throws Throwable
		{
		 switchingTab(firstTab);
	        el.clickonUnderstandingAcidity();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        el.clickonUnderstandingAcidity();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for UnderstandingAcidity:"+compareTwoText);
		}		
	 @Test(priority=4,enabled=true)
		public void verifyAcidityorIndigestionLink() throws Throwable
		{
		 switchingTab(firstTab);
	        el.clickonAcidityorIndigestion();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        el.clickonAcidityorIndigestion();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AcidityorIndigestion:"+compareTwoText);
		}		
	 @Test(priority=5,enabled=true)
		public void verifyAcidityorRefluxorGerdLink() throws Throwable
		{
		 switchingTab(firstTab);
	        el.clickonAcidityorRefluxorGerd();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        el.clickonAcidityorRefluxorGerd();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AcidityorRefluxorGerd:"+compareTwoText);
		}		
	 @Test(priority=6,enabled=true)
		public void verifyWhatisEno_hereLink() throws Throwable
		{
		 switchingTab(firstTab);
	        el.clickonWhatisEno_here();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        el.clickonWhatisEno_here();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Whatiseno_here:"+compareTwoText);
		}		
	 @Test(priority=7,enabled=true)
		public void verifybReferencesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        el.clickonReferences();
	       System.out.println("Verified References Successfully on Preprod Url");
	        switchingTab(secondTab);
	        el.clickonReferences();
	       System.out.println("Verified References Successfully on Live Url");
		}		
	 @Test(priority=8,enabled=true)
		public void verifyAcidityorRefluxorGerd1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        el.clickonAcidityorRefluxorGerd1();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        el.clickonAcidityorRefluxorGerd1();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AcidityorRefluxorGerd1:"+compareTwoText);
		}		
	 @Test(priority=9,enabled=true)
		public void verifyUnderstandingDigestiveWellnessLink() throws Throwable
		{
		 switchingTab(firstTab);
	        el.clickonUnderstandingDigestiveWellness();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        el.clickonUnderstandingDigestiveWellness();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Understanding DigestiveWellness:"+compareTwoText);
		}		
	
	//next slider//
	 
	 @Test(priority=10,enabled=true)
		public void verifyDidyouKnowSectionLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        el.clickonDidYouKnowSection();
	        System.out.println("Did you know section is verified in the preprod URL");
	        switchingTab(secondTab);
	        el.clickonDidYouKnowSection();
	        System.out.println("Did you know section is verified in the Live URL");
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
