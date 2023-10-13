package com.qa.voltarengel.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.voltarengel.pages.voltarengelwhatisvoltarenPage;

public class voltarengelwhatisvoltarenTest extends BaseClass{
	
	voltarengelwhatisvoltarenPage vn;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("voltarengel_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		vn=new voltarengelwhatisvoltarenPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("voltarengel_Config.properties").getProperty("preProdwhatisvoltarenUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("voltarengel_Config.properties").getProperty("LivewhatisvoltarenUrl"));
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
	    private void VerifyWriteReview_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonWriteReview();
	         System.out.println("Verified the Review successfully on Preprod Url");
	         switchingTab(secondTab);
	         vn.clickonWriteReview();
	         System.out.println("Verified the Review successfully on Live Url");
	         
	    }
	 @Test(priority = 4, enabled = true)
	    private void VerifyAddtoCart_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonBuyNow1();
	        System.out.println("Verified BuyNow1 is clicked on preprod Url");
	         switchingTab(secondTab);
	         vn.clickonBuyNow1();
	        System.out.println("Verified BuyNow1 is clicked on Live Url");
	    }					
	 
	 @Test(priority = 5, enabled = true)
	    private void VerifyGetCoupons_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickongetCoupons();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickongetCoupons();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for GetCoupons:"+compareTwoText);
	    }			
	 @Test(priority = 6, enabled = true)
	    private void VerifyYouTube_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonYoutube();
	         System.out.println("Verified the You Tube Video successfully on Preprod Url");
	         switchingTab(secondTab);
	         vn.clickonYoutube();
	         System.out.println("Verified the You Tube Video successfully on Live Url");
	    }			
	 @Test(priority = 7, enabled = true)
	    private void VerifyShowTranscript_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonShowTranscript();
	         System.out.println("Verified Show Transcript on Preprod Url Successfully");
	         switchingTab(secondTab);
	         vn.clickongetCoupons();
	         System.out.println("Verified Show Transcript on Live Url Successfully");
	    }			
	 @Test(priority = 8, enabled = true)
	    private void VerifyReadReviews_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonSeeAllReviews();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonSeeAllReviews();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for SeeAllReviews:"+compareTwoText);
	    }			
	 @Test(priority = 9, enabled = true)
	    private void VerifyWatchStories_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonWatchStories();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonWatchStories();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for WatchStories:"+compareTwoText);
	    }			
	 @Test(priority = 10, enabled = true)
	    private void VerifyVoltarenDifferent_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonVoltarenDifferent();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonVoltarenDifferent();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for VoltarenDifferent:"+compareTwoText);
	    }			
	 @Test(priority = 11, enabled = true)
	    private void VerifyLearnmoreaboutDiclofenac_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonlearnmoreDiclofenac();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonlearnmoreDiclofenac();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for LearnmoreDiclofenac:"+compareTwoText);
	    }			
	 @Test(priority = 12, enabled = true)
	    private void VerifyWhatisvoltarengelpain_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonWhatisvoltarengelpan();
	         System.out.println("Verified  Display of what is voltarengel pain on preprod Url Successfully");
	         switchingTab(secondTab);
	         vn.clickonWhatisvoltarengelpan();
	         System.out.println("Verified Display of what is voltarengel pain on Live Url Successfully");
	    }			
	 @Test(priority = 13, enabled = true)
	    private void VerifyWhatisActiveIngredients_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonWhatisActiveIngredients();
	         System.out.println("Verified  Display of what is Active Ingredients on preprod Url Successfully");
	         switchingTab(secondTab);
	         vn.clickonWhatisActiveIngredients();
	         System.out.println("Verified Display of what is Active Ingredients on Live Url Successfully");
	    }			
	 @Test(priority = 14, enabled = true)
	    private void VerifyWhatisVoltarenappliedto_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonWhatisVoltarenbeapplied();
	         System.out.println("Verified  Display of what is Voltaren be applied to on preprod Url Successfully");
	         switchingTab(secondTab);
	         vn.clickonWhatisVoltarenbeapplied();
	         System.out.println("Verified Display of what is Voltaren be applied to  on Live Url Successfully");
	    }			
	 @Test(priority = 15, enabled = true)
	    private void VerifyHowmuchshoulduseVoltaren_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonHowmuchweshouldusedVoltaren();
	         System.out.println("Verified  Display of How much should use Voltaren to on preprod Url Successfully");
	         switchingTab(secondTab);
	         vn.clickonHowmuchweshouldusedVoltaren();
	         System.out.println("Verified Display of How much should use Voltaren  on Live Url Successfully");
	    }			
	 @Test(priority = 16, enabled = true)
	    private void VerifyHowmanytimesapplyVoltaren_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonHowmanytimesvoltarenapply();
	         System.out.println("Verified  Display of How manyTimes Voltaren to on preprod Url Successfully");
	         switchingTab(secondTab);
	         vn.clickonHowmanytimesvoltarenapply();
	         System.out.println("Verified Display of How many times Voltaren  on Live Url Successfully");
	    }			
	 @Test(priority = 17, enabled = true)
	    private void VerifyHowlongVoltarentakestoWork_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonHowlongdoesVoltarenWork();
	         System.out.println("Verified  Display of How Long Voltaren  takes to work  on preprod Url Successfully");
	         switchingTab(secondTab);
	         vn.clickonHowlongdoesVoltarenWork();
	         System.out.println("Verified Display of How Long Voltaren  takes to work on  Live Url Successfully");
	    }			
	 @Test(priority = 18, enabled = true)
	    private void VerifyHowdoyouopenArthristpaingel_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonHowdoyouopenArthrist();
	         System.out.println("Verified  Display of How do you open Arthrist pain gel on preprod Url Successfully");
	         switchingTab(secondTab);
	         vn.clickonHowdoyouopenArthrist();
	         System.out.println("Verified Display of How do you open Arthrist pain gel on  Live Url Successfully");
	    }			
	 @Test(priority = 19, enabled = true)
	    private void VerifyHowdoyouseArthristpaingel_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonHowdoyouuseArthristpaingel();
	         System.out.println("Verified  Display of How do you use Arthrist pain gel on preprod Url Successfully");
	         switchingTab(secondTab);
	         vn.clickonHowdoyouuseArthristpaingel();
	         System.out.println("Verified Display of How do you use Arthrist pain gel on  Live Url Successfully");
	    }			
	 @Test(priority = 20, enabled = true)
	    private void VerifyBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonBuyNow();
	        System.out.println("Verified BuyNow is clicked on preprod Url");
	         switchingTab(secondTab);
	         vn.clickonBuyNow();
	        System.out.println("Verified BuyNow is clicked on Live Url");
	    }					
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
