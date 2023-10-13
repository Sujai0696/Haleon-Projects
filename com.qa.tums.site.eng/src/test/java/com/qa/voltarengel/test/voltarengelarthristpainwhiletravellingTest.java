package com.qa.voltarengel.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.voltarengel.pages.voltarengelarthristpainwhiletravellingPage;


public class voltarengelarthristpainwhiletravellingTest extends BaseClass{
	
	voltarengelarthristpainwhiletravellingPage vn;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("voltarengel_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		vn=new voltarengelarthristpainwhiletravellingPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("voltarengel_Config.properties").getProperty("preProdarthristpainwhiletravellingUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("voltarengel_Config.properties").getProperty("LivearthristpainwhiletravellingUrl"));
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
	    private void VerifylivingArthrist_breadcrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonlivingarthrist_Breadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonlivingarthrist_Breadcrumbs();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for living arthrist body_Breadcrumbs:"+compareTwoText);
	    }							
	 @Test(priority = 3, enabled = true)
	    private void Verifymanagepainwhiletravelling_breadcrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonmanagepainwhiletravelling_Breadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonmanagepainwhiletravelling_Breadcrumbs();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for managepainwhiletravelling_Breadcrumbs:"+compareTwoText);
	    }				
	 @Test(priority = 4, enabled = true)
	    private void VerifyArthristpain_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonarthristpain();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonarthristpain();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Arthrist pain:"+compareTwoText);
	    }				
	 @Test(priority = 5, enabled = true)
	    private void VerifyExercise_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonExercise();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonExercise();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Exercise:"+compareTwoText);
	    }				
	 @Test(priority = 6, enabled = true)
	    private void VerifyManagingArthrist_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonManagingArthrist();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonManagingArthrist();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Managing Arthrist:"+compareTwoText);
	    }				
	 @Test(priority = 7, enabled = true)
	    private void VerifylivingindependentArthrist_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonlivingindependentarthrist();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonlivingindependentarthrist();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Living Independent Arthrist:"+compareTwoText);
	    }				
	 @Test(priority = 8, enabled = true)
	    private void VerifyshowReferences_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonShowReferences();
	         System.out.println("Verified References display on Preprod Url ");
	         switchingTab(secondTab);
	         vn.clickonShowReferences();
	         System.out.println("Verified References display on Live Url ");
	    }				
	 @Test(priority = 9, enabled = true)
	    private void VerifygetCoupons_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonGetCoupons();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonGetCoupons();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for GetCoupons:"+compareTwoText);
	    }				
	
	 @Test(priority =10, enabled = true)
	    private void VerifyBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonBuyNow();
	         System.out.println("Verified BuyNow on Preprod Url Successfully");
	         switchingTab(secondTab);
	         vn.clickonBuyNow();
	         System.out.println("Verified BuyNow  on Live Url Successfully");
	    }			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
