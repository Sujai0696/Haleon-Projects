package com.qa.voltarengel.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.voltarengel.pages.voltarengelrelievekneepainPage;

public class voltarengelrelievekneepainTest extends BaseClass{
	
	voltarengelrelievekneepainPage vn;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("voltarengel_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		vn=new voltarengelrelievekneepainPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("voltarengel_Config.properties").getProperty("preProdvoltarengelrelievekneepainUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("voltarengel_Config.properties").getProperty("LivevoltarengelrelievekneepainUrl"));
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
	    private void Verifylivingarthrist_breadcrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonlivingwitharthrist_Breadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonlivingwitharthrist_Breadcrumbs();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for using living arthrist_Breadcrumbs:"+compareTwoText);
	    }														
	 @Test(priority = 3, enabled = true)
	    private void VerifyExercisesArthristpainrelief_Breadcrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonexercisespainrelief_Breadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonexercisespainrelief_Breadcrumbs();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for using Exercise Arthrist  pain relief_Breadcrumbs:"+compareTwoText);
	    }										
	 @Test(priority = 4, enabled = true)
	    private void VerifyRelievekneepain_Breadcrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonrelievekneepain_Breadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonrelievekneepain_Breadcrumbs();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for using Relieve knee pain_Breadcrumbs:"+compareTwoText);
	    }								
	 @Test(priority = 5, enabled = true)
	    private void VerifyVoltarenarthristpaingel_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonVoltarenarthristpaingel();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonVoltarenarthristpaingel();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for using Voltaren Arthrist pain gel:"+compareTwoText);
	    }							
	 @Test(priority = 6, enabled = true)
	    private void VerifyKneepain_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonkneepain();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonkneepain();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for using knee pain:"+compareTwoText);
	    }							
	 @Test(priority = 7, enabled = true)
	    private void VerifyChronickneepain_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonChronickneepain();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonChronickneepain();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for using  chronic knee pain:"+compareTwoText);
	    }						
	 @Test(priority = 8, enabled = true)
	    private void VerifyShowReferences_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonShowReferences();
	        System.out.println("Verified Show References  displayed Successfully on preprod Url");
	         switchingTab(secondTab);
	         vn.clickonShowReferences();
	         System.out.println("Verified Show References  displayed Successfully on Live Url");
	    }						
	 @Test(priority = 9, enabled = true)
	    private void VerifyReadmore1_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonReadmore1();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonReadmore1();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for using  Readmore1:"+compareTwoText);
	    }						
	 @Test(priority = 9, enabled = true)
	    private void VerifyReadmore2_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonReadmore2();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonReadmore2();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for using  Readmore2:"+compareTwoText);
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