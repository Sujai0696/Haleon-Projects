package com.qa.voltarengel.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.voltarengel.pages.voltarengelyogaArthristPage;

public class volarengelyogaArthristTest extends BaseClass{
	
	voltarengelyogaArthristPage vn;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("voltarengel_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		vn=new voltarengelyogaArthristPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("voltarengel_Config.properties").getProperty("preProdYogaforArthristUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("voltarengel_Config.properties").getProperty("LiveYogaforArthristUrl"));
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
	    private void VerifyYogaArthrist_breadcrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonYogaArthrist_Breadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonYogaArthrist_Breadcrumbs();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Yoga ArthristBreadcrumbs:"+compareTwoText);
	    }				
	 @Test(priority = 4, enabled = true)
	    private void VerifyCertainExercise_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonCertainExercise();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonCertainExercise();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Yoga Certain Exercise:"+compareTwoText);
	    }				
	 @Test(priority = 5, enabled = true)
	    private void VerifyDifferentArthrist_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonDifferentArthrist();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonDifferentArthrist();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for DifferentArthrist:"+compareTwoText);
	    }				
	 @Test(priority = 5, enabled = true)
	    private void VerifyVoltarenArthristpaingel_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonVoltarenArthristpaingel();;
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonVoltarenArthristpaingel();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Voltaren Arthrist pain gel:"+compareTwoText);
	    }				
	 @Test(priority = 6, enabled = true)
	    private void VerifyLivingwithArthrist_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonlivingwithArthristpaingel();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonlivingwithArthristpaingel();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Living with Arthrist pain gel:"+compareTwoText);
	    }				
	 @Test(priority = 7, enabled = true)
	    private void VerifyShowReferences_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonShowReferences();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonShowReferences();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Show References:"+compareTwoText);
	    }				
	 @Test(priority = 8, enabled = true)
	    private void VerifyReadMore1_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonReadMore1();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonReadMore1();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Read More1:"+compareTwoText);
	    }				
	 @Test(priority = 9, enabled = true)
	    private void VerifyReadMore2_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonReadMore2();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonReadMore2();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Read More2:"+compareTwoText);
	    }				
	 @Test(priority = 10, enabled = true)
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
	 @Test(priority = 11, enabled = true)
	    private void VerifyBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonBuyNow();
	        System.out.println("Verified BuyNow is clicked on preprod Url");
	         switchingTab(secondTab);
	         vn.clickonBuyNow();
	        System.out.println("Verified BuyNow is clicked on Live Url");
	    }					
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
