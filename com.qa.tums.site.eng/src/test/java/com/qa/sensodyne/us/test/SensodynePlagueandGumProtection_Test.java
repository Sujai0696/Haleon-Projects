package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodynePlagueandGumProtection_Pages;

public class SensodynePlagueandGumProtection_Test extends BaseClass{
	
	SensodynePlagueandGumProtection_Pages sp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 sp=new  SensodynePlagueandGumProtection_Pages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("sensodyneConfig.properties").getProperty("preProdSensodynePlagueandGumProtectionUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("sensodyneConfig.properties").getProperty("liveSensodynePlagueandGumProtectionUrl"));
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
	    private void VerifyProductResultsBreadCrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnProductsResultBreadCrumbs();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnProductsResultBreadCrumbs();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }				
	 @Test(priority = 3, enabled = true)
	    private void VerifyPlagueandGumProtectionBreadCrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPlagueandGumProtectionBreadCrumbs();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnPlagueandGumProtectionBreadCrumbs();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 4, enabled = true)
	    private void VerifyPlagueandGumProtection_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPlagueandGumProtection();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnPlagueandGumProtection();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 5, enabled = true)
	    private void VerifyToothwhitening_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnToothwhitening();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnToothwhitening();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 6, enabled = true)
	    private void VerifyGetResults_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnGetResults();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnGetResults();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 7, enabled = true)
	    private void VerifySensitivityGum_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitivitygum();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensitivitygum();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 8, enabled = true)
	    private void VerifySensitivityGumProducts_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitivitygumCleanFreshProduct();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensitivitygumCleanFreshProduct();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 9, enabled = true)
	    private void VerifySensitivityGumCleanFreshBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitivitygumCleanFreshBuyNow();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensitivitygumCleanFreshBuyNow();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 10, enabled = true)
	    private void VerifySensitivityGumWhiteing_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitivitygumWhitening();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensitivitygumWhitening();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 11, enabled = true)
	    private void VerifySensitivityGumWhiteingBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitivitygumwhiteningBuyNow();
	        System.out.println("Verify BuyNow on Preprod Url");
	         switchingTab(secondTab);
	         sp.clickOnSensitivitygumwhiteningBuyNow();
	         System.out.println("Verify BuyNow on Prod Url");
	    }			
	 @Test(priority = 12, enabled = true)
	    private void VerifySensitivityGumMint_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitivitygumMint();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensitivitygumMint();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 13, enabled = true)
	    private void VerifySensitivityGumMintBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitivitygumMintBuyNow();
	        System.out.println("Verify BuyNow on Preprod Url");
	         switchingTab(secondTab);
	         sp.clickOnSensitivitygumMintBuyNow();
	         System.out.println("Verify BuyNow on Prod Url");
	    }			
	 @Test(priority = 14, enabled = true)
	    private void VerifySensitivityCareToothbrush_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitiveCareToothbrush();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensitiveCareToothbrush();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 15, enabled = true)
	    private void VerifySensitivecareToothbrushBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitivecareToothbrushBuyNow();
	        System.out.println("Verify BuyNow on Preprod Url");
	         switchingTab(secondTab);
	         sp.clickOnSensitivecareToothbrushBuyNow();
	         System.out.println("Verify BuyNow on Prod Url");
	    }		
	 @Test(priority = 16, enabled = true)
	    private void VerifyCompleteProtection_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnCompleteProtection();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnCompleteProtection();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 17, enabled = true)
	    private void VerifyCompleteProtectionBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnCompleteProtectionBuyNow();
	        System.out.println("Verify BuyNow on Preprod Url");
	         switchingTab(secondTab);
	         sp.clickOnCompleteProtectionBuyNow();
	         System.out.println("Verify BuyNow on Prod Url");
	    }		
	 @Test(priority = 18, enabled = true)
	    private void VerifyCompleteProtectionOnly_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnCompleteProtectionOnly();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnCompleteProtectionOnly();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 19, enabled = true)
	    private void VerifyCompleteProtectionOnlyBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnCompleteProtectionOnlyBuyNow();
	        System.out.println("Verify BuyNow on Preprod Url");
	         switchingTab(secondTab);
	         sp.clickOnCompleteProtectionOnlyBuyNow();
	         System.out.println("Verify BuyNow on Prod Url");
	    }		
	 @Test(priority = 20, enabled = true)
	    private void VerifyGetCoupon_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnGetCoupon();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnGetCoupon();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 21, enabled = true)
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
