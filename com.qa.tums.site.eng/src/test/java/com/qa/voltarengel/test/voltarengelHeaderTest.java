package com.qa.voltarengel.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.voltarengel.pages.voltarengelHeaderPage;

public class voltarengelHeaderTest extends BaseClass{
	
	voltarengelHeaderPage vh;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("voltarengel_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		vh=new voltarengelHeaderPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("voltarengel_Config.properties").getProperty("preProdHomepageUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("voltarengel_Config.properties").getProperty("liveHomepageUrl"));
		 }
	 @Test(priority=0,enabled=true)
		public void verifyGigyaformLink() throws Throwable
		{
		 switchingTab(firstTab);
	        vh.clickCookieBtn();
	        vh.clickGigyaForm();
	        System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
	        switchingTab(secondTab);
	        vh.clickCookieBtn();
	        vh.clickGigyaForm();        
	        System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
		}			
	 @Test(priority = 1, enabled = true)
	    private void VerifyCoupons_Button() throws Exception {
		     switchingTab(firstTab);
	         vh.clickonCoupons();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vh.clickonCoupons();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Coupons:"+compareTwoText);
	    }	
	 @Test(priority = 2, enabled = true)
	    private void VerifyNewsLetter_Button() throws Exception {
		     switchingTab(firstTab);
	         vh.clickonNewsLetter();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vh.clickonNewsLetter();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same  for NewsLetter:"+compareTwoText);
	    }	
	 @Test(priority = 3, enabled = true)
	    private void VerifyFAQ_Button() throws Exception {
		     switchingTab(firstTab);
	         vh.clickonFAQ();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vh.clickonFAQ();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same  for FAQ:"+compareTwoText);
	    }	
	 @Test(priority = 4, enabled = true)
	    private void VerifyCaregivers_Button() throws Exception {
		     switchingTab(firstTab);
	         vh.clickonCaregivers();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vh.clickonCaregivers();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same  for Caregivers:"+compareTwoText);
	    }	
	 @Test(priority = 5, enabled = true)
	    private void VerifyDropdown_Button() throws Exception {
		     switchingTab(firstTab);
	         vh.clickonUS_Dropdown();
	         System.out.println("Verified Dropdown of Voltrangel_US on Preprod Url");
	         switchingTab(secondTab);
	         vh.clickonUS_Dropdown();
	         System.out.println("Verified Dropdown of Voltrangel_US on Live Url");
	    }	
	 @Test(priority = 6, enabled = true)
	    private void VerifySearchIcon_Button() throws Exception {
		     switchingTab(firstTab);
	         vh.clickonSearchIcon();
	         System.out.println("Verified SearchIcon of Voltrangel_US on Preprod Url");
	         switchingTab(secondTab);
	         vh.clickonSearchIcon();
	         System.out.println("Verified SearchIcon of Voltrangel_US on Live Url");
	    }	
	 @Test(priority = 5, enabled = true)
	    private void VerifyVoltarengel_Button() throws Exception {
		     switchingTab(firstTab);
	         vh.clickonVoltarengel_logo();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vh.clickonVoltarengel_logo();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same  for Voltarengel:"+compareTwoText);
	    }	
	 @Test(priority = 6, enabled = true)
	    private void VerifyAboutVoltaren_Button() throws Exception {
		     switchingTab(firstTab);
	         vh.clickonAboutVoltaren();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vh.clickonAboutVoltaren();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same  for AboutVoltaren:"+compareTwoText);
	    }	
	 @Test(priority = 7, enabled = true)
	    private void VerifyVoltarenDifferent_Button() throws Exception {
		     switchingTab(firstTab);
	         vh.clickonVoltarendifferent();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vh.clickonVoltarendifferent();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same  for VoltarenDifferent:"+compareTwoText);
	    }	
	 @Test(priority = 8, enabled = true)
	    private void VerifyReadReview_Button() throws Exception {
		     switchingTab(firstTab);
	         vh.clickonReadReview();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vh.clickonReadReview();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same  for Read Review:"+compareTwoText);
	    }	
	 @Test(priority = 9, enabled = true)
	    private void VerifyTestimonals_Button() throws Exception {
		     switchingTab(firstTab);
	         vh.clickonTestimonals();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vh.clickonTestimonals();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same  for Testimonals:"+compareTwoText);
	    }	
	 @Test(priority = 10, enabled = true)
	    private void VerifywhatisArthritis_Button() throws Exception {
		     switchingTab(firstTab);
	         vh.clickonWhatisArthritis();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vh.clickonWhatisArthritis();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same  for whatisArthritis:"+compareTwoText);
	    }	
	 @Test(priority = 11, enabled = true)
	    private void VerifyUnderstandingpain_Button() throws Exception {
		     switchingTab(firstTab);
	         vh.clickonUnderstandingpain();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vh.clickonUnderstandingpain();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same  for understandingpain:"+compareTwoText);
	    }	
	 @Test(priority = 12, enabled = true)
	    private void VerifyLivingArthritis_Button() throws Exception {
		     switchingTab(firstTab);
	         vh.clickonlivingArthiritis();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vh.clickonlivingArthiritis();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same  for LivingArthritis:"+compareTwoText);
	    }	
	 @Test(priority = 13, enabled = true)
	    private void Verifyjointpain_Button() throws Exception {
		     switchingTab(firstTab);
	         vh.clickonjoint_pain();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vh.clickonjoint_pain();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same  for JointPain:"+compareTwoText);
	    }	
	 @Test(priority = 14, enabled = true)
	    private void VerifyExerciseArthritis_Button() throws Exception {
		     switchingTab(firstTab);
	         vh.clickonExerciseArthritis();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vh.clickonExerciseArthritis();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same  for Exercise Arthritis:"+compareTwoText);
	    }	
	 @Test(priority = 15, enabled = true)
	    private void VerifyManagingArthritis_Button() throws Exception {
		     switchingTab(firstTab);
	         vh.clickonMangingArthritis();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vh.clickonMangingArthritis();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same  for Managing Arthritis:"+compareTwoText);
	    }	
	 @Test(priority = 16, enabled = true)
	    private void VerifyExercisePainRelief_Button() throws Exception {
		     switchingTab(firstTab);
	         vh.clickonExercisepainRelief();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vh.clickonExercisepainRelief();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same  for ExercisePainRelief:"+compareTwoText);
	    }	
	 @Test(priority = 17, enabled = true)
	    private void VerifyRelieveArthristpain_Button() throws Exception {
		     switchingTab(firstTab);
	         vh.clickonRelieveArthristpain();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vh.clickonRelieveArthristpain();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same  for RelieveArthrist pain:"+compareTwoText);
	    }	
	 @Test(priority = 18, enabled = true)
	    private void VerifyNaturalRemedies_Button() throws Exception {
		     switchingTab(firstTab);
	         vh.clickonNaturalRemedies();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vh.clickonNaturalRemedies();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same  for Natural Remedies:"+compareTwoText);
	    }	
	 @Test(priority = 19, enabled = true)
	    private void VerifyStressArthritis_Button() throws Exception {
		     switchingTab(firstTab);
	         vh.clickonStressArthritis();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vh.clickonStressArthritis();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same  for Stress Arthritis:"+compareTwoText);
	    }	
	 @Test(priority = 20, enabled = true)
	    private void VerifyArthristFriendlywebsite_Button() throws Exception {
		     switchingTab(firstTab);
	         vh.clickonArthritisfriendlywebsite();;
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vh.clickonArthritisfriendlywebsite();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same  for Arthristfriendly website:"+compareTwoText);
	    }	
	 @Test(priority = 21, enabled = true)
	    private void VerifyNavigatewebsite_Button() throws Exception {
		     switchingTab(firstTab);
	         vh.clickonNavigatewebsite();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vh.clickonNavigatewebsite();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same  for Navigate website:"+compareTwoText);
	    }	
	 @Test(priority = 22, enabled = true)
	    private void VerifyAgingbody_Button() throws Exception {
		     switchingTab(firstTab);
	         vh.clickonAgingBody();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vh.clickonAgingBody();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same  for Aging body:"+compareTwoText);
	    }	
	 @Test(priority = 23, enabled = true)
	    private void VerifyRelievewristpain_Button() throws Exception {
		     switchingTab(firstTab);
	         vh.clickonRelievewristpain();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vh.clickonRelievewristpain();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same  for Relievewristpain:"+compareTwoText);
	    }	
	 @Test(priority = 24, enabled = true)
	    private void VerifyArtiristHerditary_Button() throws Exception {
		     switchingTab(firstTab);
	         vh.clickonArthristHeredietary();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vh.clickonArthristHeredietary();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same  for Artirist Herditary:"+compareTwoText);
	    }	
	 @Test(priority = 25, enabled = true)
	    private void VerifyMorningarthrist_Button() throws Exception {
		     switchingTab(firstTab);
	         vh.clickonMorningarthrist();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vh.clickonMorningarthrist();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same  for Morning arthrist:"+compareTwoText);
	    }	
	 @Test(priority = 26, enabled = true)
	    private void VerifyBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         vh.clickonBuyNow();
	         System.out.println("Verified Buynow  displayed on Preprod Url");
	         switchingTab(secondTab);
	         vh.clickonBuyNow();
	         System.out.println("Verified Buynow displayed on Live Url");
	    }	
	
	
	
	
	
	
	
	

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
