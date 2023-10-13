package com.qa.voltarengel.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.voltarengel.pages.voltarengelFooterPage;


public class voltarengelFooterTest extends BaseClass{
	
	voltarengelFooterPage vf;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("voltarengel_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		vf=new voltarengelFooterPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("voltarengel_Config.properties").getProperty("preProdHomepageUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("voltarengel_Config.properties").getProperty("liveHomepageUrl"));
		 }
	 @Test(priority=0,enabled=true)
		public void verifyGigyaformLink() throws Throwable
		{
		 switchingTab(firstTab);
	        vf.clickCookieBtn();
	        vf.clickGigyaForm();
	        System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
	        switchingTab(secondTab);
	        vf.clickCookieBtn();
	        vf.clickGigyaForm();        
	        System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
		}				
	 @Test(priority = 1, enabled = true)
	    private void VerifyVoltarengellogo_footer_Button() throws Exception {
		     switchingTab(firstTab);
	         vf.clickonVoltarenlogo_footer();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vf.clickonVoltarenlogo_footer();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same  for Voltarengel_logofooter:"+compareTwoText);
	    }	
	 @Test(priority = 2, enabled = true)
	    private void VerifyAboutVoltaren_Button() throws Exception {
		     switchingTab(firstTab);
	         vf.clickonAboutvoltaren();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vf.clickonAboutvoltaren();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same  for AboutVoltaren:"+compareTwoText);
	    }	
	 @Test(priority = 3, enabled = true)
	    private void VerifyWhatisArthrist_Button() throws Exception {
		     switchingTab(firstTab);
	         vf.clickonwhatisArthrist();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vf.clickonwhatisArthrist();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same  for whatisArthrist:"+compareTwoText);
	    }	
	 @Test(priority = 4, enabled = true)
	    private void VerifylivingwithArthrist_Button() throws Exception {
		     switchingTab(firstTab);
	         vf.clickonlivingwitharthrist();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vf.clickonlivingwitharthrist();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same  for whatisArthrist:"+compareTwoText);
	    }	
	 @Test(priority = 5, enabled = true)
	    private void VerifyUnderstandingpain_Button() throws Exception {
		     switchingTab(firstTab);
	         vf.clickonunderstandingpain();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vf.clickonunderstandingpain();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same  for Understandingpain:"+compareTwoText);
	    }	
	 @Test(priority = 6, enabled = true)
	    private void VerifyCoupons_Button() throws Exception {
		     switchingTab(firstTab);
	         vf.clickonCoupons();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vf.clickonCoupons();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same  forCoupons:"+compareTwoText);
	    }	
	 @Test(priority = 7, enabled = true)
	    private void VerifyFSAorHSA_Button() throws Exception {
		     switchingTab(firstTab);
	         vf.clickonFSAorHSA();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vf.clickonFSAorHSA();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same  for FSAorHSA:"+compareTwoText);
	    }	
	 @Test(priority = 8, enabled = true)
	    private void VerifyNewsletter_Button() throws Exception {
		     switchingTab(firstTab);
	         vf.clickonNewsletter();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vf.clickonNewsletter();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same  for FSAorHSA:"+compareTwoText);
	    }	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
