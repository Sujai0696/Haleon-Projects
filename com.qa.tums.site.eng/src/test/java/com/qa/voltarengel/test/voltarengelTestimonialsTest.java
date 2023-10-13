package com.qa.voltarengel.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.voltarengel.pages.voltarengelTestimonialsPage;

public class voltarengelTestimonialsTest extends BaseClass{
	
	voltarengelTestimonialsPage vn;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("voltarengel_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		vn=new voltarengelTestimonialsPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("voltarengel_Config.properties").getProperty("preProdTestimonialsUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("voltarengel_Config.properties").getProperty("LiveTestimonialsUrl"));
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
	    private void Verifyaboutvoltaren_breadcrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonaboutvoltarenBreadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonaboutvoltarenBreadcrumbs();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for aboutVoltarenBreadcrumbs:"+compareTwoText);
	    }								
	 @Test(priority = 3, enabled = true)
	    private void VerifyTestimonials_breadcrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonTestimonialsBreadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonTestimonialsBreadcrumbs();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for TestimonalsBreadcrumbs:"+compareTwoText);
	    }					
	 @Test(priority = 4, enabled = true)
	    private void VerifyYouTubeButton1_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonYoutube1();
	        System.out.println("Verified the YouTube button played successfully on Preprod Url");
	         switchingTab(secondTab);
	         vn.clickonYoutube1();
	         System.out.println("Verified the YouTube button played successfully on Live Url");
	    }					
	 @Test(priority = 5, enabled = true)
	    private void VerifyShowTranscript1_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonShowTranscript1();
	        System.out.println("Verified the Show Transcript1 displayed successfully on Preprod Url");
	         switchingTab(secondTab);
	         vn.clickonShowTranscript1();
	         System.out.println("Verified the Show Transcript1 displayed successfully on Live Url");
	    }					
	 @Test(priority = 6, enabled = true)
	    private void VerifyYouTubeButton2_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonYoutube2();
	        System.out.println("Verified the YouTube2 button played successfully on Preprod Url");
	         switchingTab(secondTab);
	         vn.clickonYoutube2();
	         System.out.println("Verified the YouTube2 button played successfully on Live Url");
	    }				
	 @Test(priority = 7, enabled = true)
	    private void VerifyShowTranscript2_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonShowTranscript2();
	        System.out.println("Verified the Show Transcript2 displayed successfully on Preprod Url");
	         switchingTab(secondTab);
	         vn.clickonShowTranscript2();
	         System.out.println("Verified the Show Transcript2 displayed successfully on Live Url");
	    }			
	 @Test(priority = 7, enabled = true)
	    private void VerifyYouTubeButton3_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonYoutube3();
	        System.out.println("Verified the YouTube3 button played successfully on Preprod Url");
	         switchingTab(secondTab);
	         vn.clickonYoutube3();
	         System.out.println("Verified the YouTube3 button played successfully on Live Url");
	    }				
	 @Test(priority = 8, enabled = true)
	    private void VerifyShowTranscript3_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonShowTranscript3();
	        System.out.println("Verified the Show Transcript3 displayed successfully on Preprod Url");
	         switchingTab(secondTab);
	         vn.clickonShowTranscript3();
	         System.out.println("Verified the Show Transcript3 displayed successfully on Live Url");
	    }			
	 @Test(priority = 9, enabled = true)
	    private void VerifyReadMore1_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonReadMore1();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonReadMore1();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for ReadMore1:"+compareTwoText);
	    }					
	 @Test(priority = 10, enabled = true)
	    private void VerifyReadMore2_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonReadMore2();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonReadMore2();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for ReadMore2:"+compareTwoText);
	    }				
	 @Test(priority = 11, enabled = true)
	    private void Verifygetcoupons_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonGetCoupons();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonGetCoupons();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for getcoupons:"+compareTwoText);
	    }				
	 @Test(priority = 12, enabled = true)
	    private void VerifyBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonBuyNow();
	         System.out.println("Verified BuyNow button on Preprod Url");
	         switchingTab(secondTab);
	         vn.clickonBuyNow();
	         System.out.println("Verified BuyNow button on Live Url");
	    }			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
