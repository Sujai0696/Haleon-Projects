package com.qa.biotene.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.biotene.pages.biotenewhatisdrymouthPage;

public class biotenewhatisdrymouthTest extends BaseClass{
	
	biotenewhatisdrymouthPage bw;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("biotene_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 bw=new biotenewhatisdrymouthPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("biotene_Config.properties").getProperty("preProdBiotenewhatisdrymouthUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("biotene_Config.properties").getProperty("LiveBiotenewhatisdrymouthUrl"));
		 }	
	 @Test(priority=0,enabled=true)
		public void verifyBiotenecookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        bw.clickonCookieBtn();
	        bw.clickonEmailBtn();
	        System.out.println("Cookie Button and Email Pop-up successfully verified in the Preprod URL");
	        switchingTab(secondTab);
	        bw.clickonCookieBtn();
	        bw.clickonEmailBtn();
	        System.out.println("Cookie Button and Email Pop-up successfully verified in the Live URL");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyHomeBreadcrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bw.clickonHomeBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bw.clickonHomeBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeBreadcrumbs:"+compareTwoText);
		}			
	 @Test(priority=2,enabled=true)
		public void verifywhatisdrymouthBreadcrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bw.clickonWhatisdrymouthBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bw.clickonWhatisdrymouthBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for WhatisdrymouthBreadcrumbs:"+compareTwoText);
		}			
	 @Test(priority=3,enabled=true)
		public void verifydrymouth101_LearnmoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bw.clickondrymouth_Learnmore();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bw.clickondrymouth_Learnmore();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Drymouth101Learnmore:"+compareTwoText);
		}			
	 @Test(priority=4,enabled=true)
		public void verifyMedicationdrymouth_LearnmoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bw.clickonMedicationdrymouth_Learnmore();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bw.clickonMedicationdrymouth_Learnmore();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for MedicationdrymouthLearnmore:"+compareTwoText);
		}		
	 @Test(priority=5,enabled=true)
		public void verifySjogrensyndromeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bw.clickonSjogrneSyndrome();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bw.clickonSjogrneSyndrome();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for SjogrneSyndrome:"+compareTwoText);
		}		
	 @Test(priority=6,enabled=true)
		public void verifyDiabetesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bw.clickonDiabetes();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bw.clickonDiabetes();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Diabetes:"+compareTwoText);
		}		
	 @Test(priority=7,enabled=true)
		public void verifySchelerdermaLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bw.clickonSchlerderma();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bw.clickonSchlerderma();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Schelerderma:"+compareTwoText);
		}		
	 @Test(priority=8,enabled=true)
		public void verifyParkinsonDiseaesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bw.clickonParkinsondisease();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bw.clickonParkinsondisease();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ParkinsonDiseaes:"+compareTwoText);
		}		
	 @Test(priority=9,enabled=true)
		public void verifySymptomsdisease_learnmoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bw.clickonSymptomsRemedies_Learnmore();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bw.clickonSymptomsRemedies_Learnmore();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Symptome_DiseaseLearnmore:"+compareTwoText);
		}		
	 @Test(priority=10,enabled=true)
		public void verifyCottonmouth_causes_learnmoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bw.clickonCottoncauses_Learnmore();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bw.clickonCottoncauses_Learnmore();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cotton_causesLearnmore:"+compareTwoText);
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
