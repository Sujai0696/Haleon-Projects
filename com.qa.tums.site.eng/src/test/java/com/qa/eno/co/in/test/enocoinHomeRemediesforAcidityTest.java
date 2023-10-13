package com.qa.eno.co.in.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.eno.co.in.pages.enocoinHomeRemediesforAcidityPage;

public class enocoinHomeRemediesforAcidityTest extends BaseClass {
	
	enocoinHomeRemediesforAcidityPage eh;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("eno_co_inConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 eh=new enocoinHomeRemediesforAcidityPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("eno_co_inConfig.properties").getProperty("preProdenoinHomeRemediesforAcidityUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("eno_co_inConfig.properties").getProperty("LiveenoinHomeRemediesforAcidityUrl"));
		 }					
	 @Test(priority=1,enabled=true)
		public void verifyLivinglifeAcidityfreeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonLivinglifeAcidityfree();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonLivinglifeAcidityfree();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for LivinglifeAcidityfree:"+compareTwoText);
		}		
	 @Test(priority=2,enabled=true)
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
	 @Test(priority=3,enabled=true)
		public void verifyUnderstandingAcidityLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonUnderstandingAcidity();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonUnderstandingAcidity();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for UnderstandingAcidity:"+compareTwoText);
		}		
	 @Test(priority=4,enabled=true)
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
	 @Test(priority=5,enabled=true)
		public void verifyAcidityorRefluxorgerdLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonAcidityorRefluxorgerd();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonAcidityorRefluxorgerd();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AcidityorREfluxorgerd:"+compareTwoText);
		}		
	 @Test(priority=6,enabled=true)
		public void verifyWhatiseno_hereLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonWhatisEno_here();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonWhatisEno_here();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for whatiseno_here:"+compareTwoText);
		}		
	 @Test(priority=7,enabled=true)
		public void verifyWhatiseno_here1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonWhatisEno_here1();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonWhatisEno_here1();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for whatiseno_here1:"+compareTwoText);
		}		
	 @Test(priority=8,enabled=true)
		public void verifyReferencesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonReferences();
	        System.out.println("Verified References Successfully on preprod url");
	        switchingTab(secondTab);
	        eh.clickonReferences();
	        System.out.println("Verified References Successfully on Live url");
		}		
	 @Test(priority=7,enabled=true)
		public void verifyConstantAcidityLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonConstantAcidity();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonConstantAcidity();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ConstantAcidity:"+compareTwoText);
		}		
	 @Test(priority=8,enabled=true)
		public void verifyWhatisenosLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        eh.clickonWhatisemos();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonWhatisemos();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Whatisenos:"+compareTwoText);
		}		
	//next slider//
	 
	 	@Test(priority=9,enabled=true)
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
