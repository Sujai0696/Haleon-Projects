package com.qa.voltarengel.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.voltarengel.pages.voltarengelotcarthristmedicationPage;

public class voltarengelotcarthristmedicationTest extends BaseClass{
	
	voltarengelotcarthristmedicationPage vn;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("voltarengel_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		vn=new voltarengelotcarthristmedicationPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("voltarengel_Config.properties").getProperty("preProdVoltarengelotcarthristmedicationsUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("voltarengel_Config.properties").getProperty("LiveVoltarengelotcarthristmedicationsUrl"));
		 }
	 @Test(priority=0,enabled=true)
		public void verifyGigyaformLink() throws Throwable
		{
		 switchingTab(firstTab);
	        vn.clickCookieBtn();
	        vn.clickGigyaForm();
	        System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
	        switchingTab(secondTab);
	        vn.clickCookieBtn();
	        vn.clickGigyaForm();        
	        System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
		}			
	 @Test(priority = 1, enabled = true)
	    private void VerifyHomepagebreadcrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonHomepageBreadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonHomepageBreadcrumbs();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for HomepageBreadcrumbs:"+compareTwoText);
	    }			
	 @Test(priority = 2, enabled = true)
	    private void VerifylivingwithArthrist_breadcrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonlivingArthrist_Breadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonlivingArthrist_Breadcrumbs();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for using living withArthrist_Breadcrumbs:"+compareTwoText);
	    }										
	 @Test(priority = 3, enabled = true)
	    private void VerifymanagingArthrist_breadcrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonManagingArthrist_Breadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonManagingArthrist_Breadcrumbs();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for using ManageArthrist Breadcrumbs:"+compareTwoText);
	    }												
	 @Test(priority = 4, enabled = true)
	    private void VerifyOtcArthristmedications_breadcrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonotcArthristmedications_Breadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonotcArthristmedications_Breadcrumbs();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for using OtcArthrist medications Breadcrumbs:"+compareTwoText);
	    }					
	 @Test(priority = 5, enabled = true)
	    private void VerifyLivingwitharthrist_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonlivingwitharthrist();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonlivingwitharthrist();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for living with arthrist:"+compareTwoText);
	    }					
	 @Test(priority = 6, enabled = true)
	    private void Verifyhelprelievesymptoms_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonhelprelievesymptoms();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonhelprelievesymptoms();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for help relieve symptoms:"+compareTwoText);
	    }					
	 @Test(priority = 7, enabled = true)
	    private void Verifymanagepain_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonmanagepain();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonmanagepain();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for manage pain:"+compareTwoText);
	    }					
	 @Test(priority = 8, enabled = true)
	    private void Verifykindarthrist_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonkindarthrist();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonkindarthrist();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for kind arthrist:"+compareTwoText);
	    }					
	
	 @Test(priority = 9, enabled = true)
	    private void VerifyArthristsuffers_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonArthristsufferes();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonArthristsufferes();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Arthrist suffers:"+compareTwoText);
	    }					
	 @Test(priority = 10, enabled = true)
	    private void Verifypainrelief_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonpainrelief();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonpainrelief();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for pain relief:"+compareTwoText);
	    }					
	 @Test(priority = 11, enabled = true)
	    private void Verifylivingwitharthrists_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonlivingwitharthrists();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonlivingwitharthrists();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for living with arthrists:"+compareTwoText);
	    }					
	 @Test(priority = 12, enabled = true)
	    private void Verifyvoltaren_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonvoltaren();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonvoltaren();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for voltaren:"+compareTwoText);
	    }					
	 @Test(priority = 13, enabled = true)
	    private void VerifyShowReferences_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonShowReferences();
	         System.out.println("Verified the Show References on Preprod url");
	         switchingTab(secondTab);
	         vn.clickonShowReferences();
	         System.out.println("Verified the Show References on Live url");
	    }					
	 @Test(priority = 14, enabled = true)
	    private void VerifyReadMore1_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonReadmore1();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonReadmore1();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Readmore1:"+compareTwoText);
	    }					
	 @Test(priority = 15, enabled = true)
	    private void VerifyReadMore2_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonReadmore2();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonReadmore2();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Readmore2:"+compareTwoText);
	    }					
	 @Test(priority = 16, enabled = true)
	    private void VerifyGetCoupons_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonGetCoupons();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonGetCoupons();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for GetCoupons:"+compareTwoText);
	    }				
	 @Test(priority = 17, enabled = true)
	    private void VerifyBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonBuyNow();
	        System.out.println("Verified BuyNow is clicked on preprod Url");
	         switchingTab(secondTab);
	         vn.clickonBuyNow();
	        System.out.println("Verified BuyNow is clicked on Live Url");
	    }					
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
