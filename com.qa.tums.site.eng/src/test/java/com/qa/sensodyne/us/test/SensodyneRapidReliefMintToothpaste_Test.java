package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneRapidReliefMintToothpaste_Pages;

public class SensodyneRapidReliefMintToothpaste_Test extends BaseClass{
	
	SensodyneRapidReliefMintToothpaste_Pages sp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 sp=new  SensodyneRapidReliefMintToothpaste_Pages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("sensodyneConfig.properties").getProperty("preProdSensodyneRapidReliefMintToothpasteUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("sensodyneConfig.properties").getProperty("liveSensodyneRapidReliefMintToothpasteUrl"));
		 }
	 @Test(priority = 0, enabled = true)
		private void cookieButton() throws Exception {
		switchingTab(firstTab);
		sp.clickCookieBtn();
		sp.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		sp.clickCookieBtn();
		sp.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}	
	 @Test(priority = 1, enabled = true)
	    private void VerifyOurProductsBreadCrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnOurProductsBreadCrumbs();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnOurProductsBreadCrumbs();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }						
	 @Test(priority = 2, enabled = true)
	    private void VerifySensodyneRapidReliefMintToothpasteBreadCrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensodyneRapidReliefMintToothpasteBreadCrumbs();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensodyneRapidReliefMintToothpasteBreadCrumbs();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			

	 @Test(priority = 3, enabled = true)
	    private void VerifyReview_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnReviewBtn();
	         System.out.println("Verify Review on Preprod Url");
	         switchingTab(secondTab);
	         sp.clickOnReviewBtn();
	         System.out.println("Verify Review on Prod Url");
	    }			
	 @Test(priority = 4, enabled = true)
	    private void VerifyBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnBuyNowBtn();
	         System.out.println("Verify BuyNow on Preprod Url");
	         switchingTab(secondTab);
	         sp.clickOnBuyNowBtn();
	         System.out.println("Verify BuyNow on Prod Url");
	    }			
	 @Test(priority = 5, enabled = true)
	    private void VerifyGetCoupons_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnGetCoupon();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnGetCoupon();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 6, enabled = true)
	    private void VerifyExtrafresh_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnExtrafresh();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnExtrafresh();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 7, enabled = true)
	    private void VerifyWhitening_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnwhitening();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnwhitening();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 8, enabled = true)
	    private void VerifyIngredients_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnIngredients();
	         System.out.println("Verify Ingredients on Preprod Url");
	         switchingTab(secondTab);
	         sp.clickOnIngredients();
	         System.out.println("Verify Ingredients on Prod Url");
	    }			
	 @Test(priority = 9, enabled = true)
	    private void VerifyDirections_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnDirections();
	         System.out.println("Verify Directions on Preprod Url");
	         switchingTab(secondTab);
	         sp.clickOnDirections();
	         System.out.println("Verify Directions on Prod Url");
	    }			
	 @Test(priority = 10, enabled = true)
	    private void VerifyWarnings_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnWarnings();
	         System.out.println("Verify Warnings on Preprod Url");
	         switchingTab(secondTab);
	         sp.clickOnWarnings();
	         System.out.println("Verify Warnings on Prod Url");
	    }			
	 @Test(priority = 11, enabled = true)
	    private void VerifyYouTubeLink1_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnYouTubelink1();
	         System.out.println("Verify YouTubelink on Preprod Url");
	         switchingTab(secondTab);
	         sp.clickOnYouTubelink1();
	         System.out.println("Verify YouTubelink on Prod Url");
	    }			
	 @Test(priority = 12, enabled = true)
	    private void Verifypopularproduct1_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPopularproduct1();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnPopularproduct1();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 13, enabled = true)
	    private void Verifypopularproduct2_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPopularproduct2();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnPopularproduct2();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 14, enabled = true)
	    private void Verifypopularproduct3_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPopularproduct3();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnPopularproduct3();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 15, enabled = true)
	    private void Verifypopularproduct4_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPopularproduct4();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnPopularproduct4();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 16, enabled = true)
	    private void Verifypopularproduct5_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPopularproduct5();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnPopularproduct5();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 17, enabled = true)
	    private void Verifygetyourcoupon_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnGetyourcoupon();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnGetyourcoupon();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 18, enabled = true)
	    private void VerifyFindYourstore_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnfindyourstore();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnfindyourstore();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
