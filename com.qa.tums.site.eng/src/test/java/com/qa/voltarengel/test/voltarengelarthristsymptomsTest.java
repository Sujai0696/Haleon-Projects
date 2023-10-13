package com.qa.voltarengel.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.voltarengel.pages.voltarengelarthristsymptomsPage;

public class voltarengelarthristsymptomsTest extends BaseClass{
	
	voltarengelarthristsymptomsPage vn;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("voltarengel_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		vn=new voltarengelarthristsymptomsPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("voltarengel_Config.properties").getProperty("preProdWhatarthristsymptomsUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("voltarengel_Config.properties").getProperty("LiveWhatarthristsymptomsUrl"));
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
	    private void Verifywhatisarthrist_breadcrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonwhatisarthrist_Breadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonwhatisarthrist_Breadcrumbs();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for using what is arthrist_Breadcrumbs:"+compareTwoText);
	    }										
	 @Test(priority = 3, enabled = true)
	    private void VerifySignsymptomsArthrist_breadcrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonSignsymptomsArthrist_Breadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonSignsymptomsArthrist_Breadcrumbs();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for using Sign symptoms Arthrist Breadcrumbs:"+compareTwoText);
	    }														
	 @Test(priority = 4, enabled = true)
	    private void VerifyYouTube_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonYouTubeButton();
	        System.out.println("Verified YouTube played successfully on Preprod Url");
	         switchingTab(secondTab);
	         vn.clickonYouTubeButton();
	         System.out.println("Verified YouTube played successfully on Live Url");
	    }								
	 @Test(priority = 5, enabled = true)
	    private void VerifyShowTranscript_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonShowTranscript();
	        System.out.println("Verified Show Transcript Displayed successfully on Preprod Url");
	         switchingTab(secondTab);
	         vn.clickonShowTranscript();
	         System.out.println("Verified Show Transcript Displayed successfully on Live Url");
	    }								
	 @Test(priority = 6, enabled = true)
	    private void VerifyTypesArthrist_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonTypesArthrist();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonTypesArthrist();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for using Types Arthrist:"+compareTwoText);
	    }				
	 @Test(priority = 7, enabled = true)
	    private void VerifyArthriststrikeLife_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonArthriststrikelife();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonArthriststrikelife();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Arthrist strike life:"+compareTwoText);
	    }				
	 @Test(priority = 8, enabled = true)
	    private void VerifyPathtoRelief_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonPathtoRelief();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonPathtoRelief();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for path to Relief:"+compareTwoText);
	    }				
	 @Test(priority = 9, enabled = true)
	    private void VerifyStress_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonStress();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonStress();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Stress:"+compareTwoText);
	    }				
	 @Test(priority = 10, enabled = true)
	    private void VerifyShowReferences_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonShowReferences();
	         System.out.println("Verified Show References Displayed Successfully on preprod Url");
	         switchingTab(secondTab);
	         vn.clickonShowReferences();
	         System.out.println("Verified Show References Displayed Successfully on Live Url");
	    }				
	 @Test(priority = 10, enabled = true)
	    private void VerifyWhatisArthrist_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonWhatisArthrist();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonWhatisArthrist();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for What is Arthrist:"+compareTwoText);
	    }				
	 @Test(priority = 10, enabled = true)
	    private void VerifyReadmore2_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonReadmore2();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonReadmore2();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Read more2:"+compareTwoText);
	    }				
	 @Test(priority = 11, enabled = true)
	    private void VerifySignmeup_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonSignmeup();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonSignmeup();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Sign me up:"+compareTwoText);
	    }				
	 @Test(priority = 12, enabled = true)
	    private void VerifyBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonBuyNow();
	        System.out.println("Verified BuyNow is clicked on preprod Url");
	         switchingTab(secondTab);
	         vn.clickonBuyNow();
	        System.out.println("Verified BuyNow is clicked on Live Url");
	    }					
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
