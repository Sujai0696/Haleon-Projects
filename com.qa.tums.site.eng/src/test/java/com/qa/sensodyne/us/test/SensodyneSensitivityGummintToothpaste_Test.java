package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneSensitivityGummintToothpaste_Pages;

public class SensodyneSensitivityGummintToothpaste_Test extends BaseClass{
	
	SensodyneSensitivityGummintToothpaste_Pages sp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 sp=new  SensodyneSensitivityGummintToothpaste_Pages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("sensodyneConfig.properties").getProperty("preProdSensodyneSensitivityGummintToothpasteUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("sensodyneConfig.properties").getProperty("liveSensodyneSensitivityGummintToothpasteUrl"));
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
	    private void VerifySensodyneSensitivityGumMintBreadCrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensodyneSensitivityGumMintBreadCrumbs();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensodyneSensitivityGumMintBreadCrumbs();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }				
	 @Test(priority = 3, enabled = true)
	    private void VerifyReview_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnReviewBtn();
	         System.out.println("Verify Review clicked on Preprod Url");
	         switchingTab(secondTab);
	         sp.clickOnReviewBtn();
	         System.out.println("Verify Review clicked on Prod Url");
	    }			
	
	 @Test(priority = 4, enabled = true)
	    private void VerifyBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnBuyNowBtn();
	         System.out.println("Verify BuyNow clicked on Preprod Url");
	         switchingTab(secondTab);
	         sp.clickOnBuyNowBtn();
	         System.out.println("Verify BuyNow clicked on Prod Url");
	    }			
	 @Test(priority = 5, enabled = true)
	    private void VerifyGetCoupon_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnGetCoupons();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnGetCoupons();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 6, enabled = true)
	    private void VerifyWhitening_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnWhitening();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnWhitening();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 7, enabled = true)
	    private void VerifyCleanFresh_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnCleanFresh();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnCleanFresh();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 8, enabled = true)
	    private void VerifyIngredients_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnIngredients();
	         System.out.println("Verify Ingredients on PreProd Url");
	         switchingTab(secondTab);
	         sp.clickOnIngredients();
	        System.out.println("Verify Ingredients on Live Url");
	    }			
	 @Test(priority = 9, enabled = true)
	    private void VerifyDirections_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnDirection();
	         System.out.println("Verify Direction on PreProd Url");
	         switchingTab(secondTab);
	         sp.clickOnDirection();
	        System.out.println("Verify Direction on Live Url");
	    }			
	 @Test(priority = 10, enabled = true)
	    private void VerifyWarningActive_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnDirection();
	         System.out.println("Verify Warning on PreProd Url");
	         switchingTab(secondTab);
	         sp.clickOnDirection();
	        System.out.println("Verify Warning on Live Url");
	    }			
	 @Test(priority = 11, enabled = true)
	    private void VerifyYouTubeLink_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnYouTubeLink();
	         System.out.println("Verify YouTube on PreProd Url");
	         switchingTab(secondTab);
	         sp.clickOnYouTubeLink();
	        System.out.println("Verify YouTube on Live Url");
	    }		
	 @Test(priority = 12, enabled = true)
	    private void VerifyPopularProduct1_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPopularProducts1();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnPopularProducts1();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 13, enabled = true)
	    private void VerifyPopularProduct2_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPopularProducts2();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnPopularProducts2();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 14, enabled = true)
	    private void VerifyPopularProduct3_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPopularProducts3();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnPopularProducts3();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 15, enabled = true)
	    private void VerifyPopularProduct4_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPopularProducts4();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnPopularProducts4();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 16, enabled = true)
	    private void VerifyPopularProduct5_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPopularProducts5();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnPopularProducts5();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 17, enabled = true)
	    private void VerifyGetCoupons_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnGetCoupons1();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnGetCoupons1();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 18, enabled = true)
	    private void VerifyFindStore_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnFindStore();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnFindStore();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
