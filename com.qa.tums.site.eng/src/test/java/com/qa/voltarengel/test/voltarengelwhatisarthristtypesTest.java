package com.qa.voltarengel.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.voltarengel.pages.voltarengelwhatisarthristtypesPage;

public class voltarengelwhatisarthristtypesTest extends BaseClass{
	
	voltarengelwhatisarthristtypesPage vn;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("voltarengel_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		vn=new voltarengelwhatisarthristtypesPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("voltarengel_Config.properties").getProperty("preProdVoltarengelarthristtypesUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("voltarengel_Config.properties").getProperty("LiveVoltarengelarthristtypesUrl"));
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
	    private void Verifywhattypesarthrist_breadcrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonwhattypesarthrist_Breadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonwhattypesarthrist_Breadcrumbs();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for using What types Arthrist Breadcrumbs:"+compareTwoText);
	    }													
	 @Test(priority = 4, enabled = true)
	    private void VerifyYouTube_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonYoutube();
	         System.out.println("Verified the you tube Video played successfully on Preprod Url");
	         switchingTab(secondTab);
	         vn.clickonYoutube();
	         System.out.println("Verified the you tube Video played successfully on Live Url");
	    }													
	 @Test(priority = 5, enabled = true)
	    private void VerifyShowTranscript_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonShowTranscript();
	         System.out.println("Verified the Show Transcript Displayed successfully on Preprod Url");
	         switchingTab(secondTab);
	         vn.clickonShowTranscript();
	         System.out.println("Verified the Show Transcript Displayed successfully on Live Url");
	    }													
	 @Test(priority = 6, enabled = true)
	    private void VerifyChronickneepain_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonchronickneepain();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonchronickneepain();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for using Chronic knee pain:"+compareTwoText);
	    }						
	 @Test(priority = 7, enabled = true)
	    private void VerifyRelief_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonRelief();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonRelief();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for using Relief:"+compareTwoText);
	    }						
	 @Test(priority = 8, enabled = true)
	    private void VerifySymptoms_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonSymptoms();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonSymptoms();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Symptoms:"+compareTwoText);
	    }						
	 @Test(priority = 9, enabled = true)
	    private void VerifyShowReferences_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonShowReferences();
	         System.out.println("Verified Show References Displayed Successfully on Preprod Url");
	         switchingTab(secondTab);
	         vn.clickonShowReferences();
	         System.out.println("Verified Show References Displayed Successfully on Live Url");
	    }						
	 @Test(priority = 10, enabled = true)
	    private void VerifyReadmore1_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonReadmore1();;
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonReadmore1();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Readmore1:"+compareTwoText);
	    }				
	 @Test(priority = 11, enabled = true)
	    private void VerifyReadmore2_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonReadmore2();;
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonReadmore2();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Readmore2:"+compareTwoText);
	    }				
	 @Test(priority = 12, enabled = true)
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
	 @Test(priority = 13, enabled = true)
	    private void VerifyGetCoupons_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickongetcoupons();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickongetcoupons();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Get -Coupons:"+compareTwoText);
	    }				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
