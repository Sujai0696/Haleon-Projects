package com.qa.eno.co.in.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.eno.co.in.pages.enocoinConstantAcidityPage;

public class enocoinConstantAcidityTest extends BaseClass{
	
	enocoinConstantAcidityPage ec;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("eno_co_inConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 ec=new enocoinConstantAcidityPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("eno_co_inConfig.properties").getProperty("preProdenoinConstantAcidityUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("eno_co_inConfig.properties").getProperty("LiveenoinConstantAcidityUrl"));
		 }					
	 @Test(priority=1,enabled=true)
		public void verifyControlAcidityBusyLifestyleLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ec.clickonControlAcidityBusyLifestyle();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ec.clickonControlAcidityBusyLifestyle();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ControlAcidityBusyLifestyle:"+compareTwoText);
		}						
	 @Test(priority=2,enabled=true)
		public void verifyLivingLifeAcidityFreeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ec.clickonLivingLifeAcidityFree();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ec.clickonLivingLifeAcidityFree();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for LivingLifeAcidityFree:"+compareTwoText);
		}			
	 @Test(priority=3,enabled=true)
		public void verifyWhatisEnoLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ec.clickonWhatisEno();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ec.clickonWhatisEno();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for WhatisEno:"+compareTwoText);
		}			
	 @Test(priority=4,enabled=true)
		public void verifyUnderstandingAcidityLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ec.clickonUnderstandingAcidity();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ec.clickonUnderstandingAcidity();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for UnderstandingAcidity:"+compareTwoText);
		}			
	 @Test(priority=5,enabled=true)
		public void verifyAcidityorIndigestionLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ec.clickonAcidityorIndigestion();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ec.clickonAcidityorIndigestion();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AcidityorIndigestion:"+compareTwoText);
		}			
	 @Test(priority=6,enabled=true)
		public void verifyAcidityReluxorGerdLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ec.clickonAcidityorRefluxorGerd();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ec.clickonAcidityorRefluxorGerd();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AcidityorRefluxorGerd:"+compareTwoText);
		}			
	 @Test(priority=7,enabled=true)
		public void verifyWhatisEno_hereLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ec.clickonWhatisEno_here();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ec.clickonWhatisEno_here();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for whatisEno_here:"+compareTwoText);
		}			
	 @Test(priority=8,enabled=true)
		public void verifyReferencesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ec.clickonReferences();
	        System.out.println("Verified References Successfully on Preprod Url");
	        switchingTab(secondTab);
	        ec.clickonReferences();
	        System.out.println("Verified References Successfully on Live Url");
		}			
	 @Test(priority=8,enabled=true)
		public void verifyLivingLifeAcidityFree1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ec.clickonLivingLifeAcidityFree1();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ec.clickonLivingLifeAcidityFree1();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for LivingLifeAcidity Free1:"+compareTwoText);
		}			
	 @Test(priority=9,enabled=true)
		public void verifyAcidityorIndigestion2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ec.clickonAcidityorIndigestion2();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ec.clickonAcidityorIndigestion2();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AcidityorIndigestion2:"+compareTwoText);
		}		
	 @Test(priority=10,enabled=true)
		public void verifyDidyouKnowSectionLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ec.clickonDidYouKnowSection();
	        System.out.println("Did you know section is verified in the preprod URL");
	        switchingTab(secondTab);
	        ec.clickonDidYouKnowSection();
	        System.out.println("Did you know section is verified in the Live URL");
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
