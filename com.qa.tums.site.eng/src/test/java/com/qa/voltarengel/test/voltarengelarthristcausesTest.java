package com.qa.voltarengel.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.voltarengel.pages.voltarengelarthristcausesPage;

public class voltarengelarthristcausesTest extends BaseClass{
	
	voltarengelarthristcausesPage vn;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("voltarengel_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		vn=new voltarengelarthristcausesPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("voltarengel_Config.properties").getProperty("preProdArthristcausesUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("voltarengel_Config.properties").getProperty("LiveArthristcausesUrl"));
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
	    private void VerifyCausesVoltarenArthrist_breadcrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickoncausesArthristvoltaren_Breadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickoncausesArthristvoltaren_Breadcrumbs();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for using Causes voltaren Arthrist Breadcrumbs:"+compareTwoText);
	    }												
	 @Test(priority = 4, enabled = true)
	    private void VerifyYoutube_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonYoutube_Button();
	         System.out.println("Verified YouTube play Successfully on Preprod Url");
	         switchingTab(secondTab);
	         vn.clickonYoutube_Button();
	        System.out.println("Verified YouTube play Successfully on Live Url");
	    }							
	 @Test(priority = 5, enabled = true)
	    private void VerifyShowTranscript_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonShowTranscript_Button();
	         System.out.println("Verified Show Transcript Displayed Successfully on Preprod Url");
	         switchingTab(secondTab);
	         vn.clickonShowTranscript_Button();
	        System.out.println("Verified Show Transcript Displayed Successfully on Live Url");
	    }			
	 @Test(priority = 6, enabled = true)
	    private void VerifyMildjointpain_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonMildjointpain_Button();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonMildjointpain_Button();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for using Mild joint pain:"+compareTwoText);
	    }							
	 @Test(priority = 7, enabled = true)
	    private void VerifyArthristpain_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonArthristpain_Button();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonArthristpain_Button();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for using Arthrist pain:"+compareTwoText);
	    }						
	 @Test(priority = 8, enabled = true)
	    private void VerifyInflamation_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonInflammation_Button();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonInflammation_Button();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for using Inflamation:"+compareTwoText);
	    }						
	 @Test(priority = 9, enabled = true)
	    private void VerifyTreatmentOptions_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonTreatmentoptions_Button();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonTreatmentoptions_Button();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for using Treatment options:"+compareTwoText);
	    }						
	 @Test(priority = 10, enabled = true)
	    private void VerifyExercising_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonExercise_Button();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonExercise_Button();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for using Exercise :"+compareTwoText);
	    }						
	 @Test(priority = 11, enabled = true)
	    private void VerifyShowReferences_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonShowReferences_Button();
	         System.out.println("Verified Show References displayed Successfully  on Preprod Url");
	         switchingTab(secondTab);
	         vn.clickonShowReferences_Button();
	         System.out.println("Verified Show References displayed Successfully  on Live Url");
	    }					
	 @Test(priority = 11, enabled = true)
	    private void VerifyReadmore1_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonReadmore1_Button();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonReadmore1_Button();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for using Readmore1 :"+compareTwoText);
	    }						
	 @Test(priority = 12, enabled = true)
	    private void VerifyReadmore2_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonReadmore2_Button();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonReadmore2_Button();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for using Readmore2 :"+compareTwoText);
	    }						
	 @Test(priority = 13, enabled = true)
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
	 @Test(priority = 14, enabled = true)
	    private void VerifyBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonBuyNow();
	        System.out.println("Verified BuyNow is clicked on preprod Url");
	         switchingTab(secondTab);
	         vn.clickonBuyNow();
	        System.out.println("Verified BuyNow is clicked on Live Url");
	    }					
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
