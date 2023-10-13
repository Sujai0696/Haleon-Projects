package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneCompleteProtectionToothpaste_Pages;

public class SensodyneCompleteProtectionToothpaste_Test extends BaseClass{
	
	SensodyneCompleteProtectionToothpaste_Pages sp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 sp=new  SensodyneCompleteProtectionToothpaste_Pages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("sensodyneConfig.properties").getProperty("preProdSensodyneCompleteProtectionToothpasteUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("sensodyneConfig.properties").getProperty("liveSensodyneCompleteProtectionToothpasteUrl"));
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
	         sp.clickOnProductsResultsBreadCrumbs();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnProductsResultsBreadCrumbs();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }				
	 @Test(priority = 3, enabled = true)
	    private void VerifyCompleteProtectionToothpasteBreadCrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnCompleteProtectionToothpasteBreadCrumbs();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnCompleteProtectionToothpasteBreadCrumbs();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }				
	 @Test(priority = 4, enabled = true)
	    private void VerifyToothWhitening_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnToothWhitening();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnToothWhitening();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 5, enabled = true)
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
	 @Test(priority = 6, enabled = true)
	    private void Verifysensitivitygumcleanfresh_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsensitivitygumcleanfresh();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnsensitivitygumcleanfresh();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 7, enabled = true)
	    private void Verifysensitivitygumcleanfresh_Image_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsensitivitygumcleanfresh_img();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnsensitivitygumcleanfresh_img();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 8, enabled = true)
	    private void Verifysensitivitygumcleanfresh_BuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsensitivitygumcleanfresh_BuyNow();
	        System.out.println("BuyNow button on preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnsensitivitygumcleanfresh_BuyNow();
	         System.out.println("BuyNow button on live URL");
	    }			
	 @Test(priority = 9, enabled = true)
	    private void Verifysensitivitygum_Mint_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsensitivitygum_mint();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnsensitivitygum_mint();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 10, enabled = true)
	    private void Verifysensitivitygum_Mint_Image_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsensitivitygum_mint_image();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnsensitivitygum_mint_image();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 11, enabled = true)
	    private void VerifysensitivitygumMint_BuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsensitivitygum_mint_BuyNow();
	        System.out.println("BuyNow button on preprod URL for Sensitivitygum_Mint");
	         switchingTab(secondTab);
	         sp.clickOnsensitivitygum_mint_BuyNow();
	         System.out.println("BuyNow button on Live URL for Sensitivitygum_Mint");
	    }			
	 @Test(priority = 12, enabled = true)
	    private void VerifysensitivitycareToothbrush_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsensitivitycaretoothbrush();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnsensitivitycaretoothbrush();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 13, enabled = true)
	    private void VerifysensitivitycareToothbrush_Image_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsensitivitycaretoothbrush_Img();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnsensitivitycaretoothbrush_Img();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 14, enabled = true)
	    private void Verifysensitivitycaretoothbrush_BuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsensitivitycaretoothbrush_BuyNow();
	        System.out.println("BuyNow button on preprod URL on Sensitivecare toothbrush");
	         switchingTab(secondTab);
	         sp.clickOnsensitivitycaretoothbrush_BuyNow();
	         System.out.println("BuyNow button on live URL on Sensitivecare toothbrush");
	    }			
	 @Test(priority = 15, enabled = true)
	    private void Verifycompleteprotectionextrafresh_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOncompleteprotectionextrafresh();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOncompleteprotectionextrafresh();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 16, enabled = true)
	    private void Verifycompleteprotectionextrafresh_Image_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOncompleteprotectionextrafresh_Image();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOncompleteprotectionextrafresh_Image();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 17, enabled = true)
	    private void Verifycompleteprotectionextrafresh_BuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnCompleteprotectionextrafresh_BuyNow();
	        System.out.println("BuyNow button on preprod URL for complete protection extra fresh");
	         switchingTab(secondTab);
	         sp.clickOnCompleteprotectionextrafresh_BuyNow();
	         System.out.println("BuyNow button on Live URL for complete protection extra fresh");
	    }		
	 @Test(priority = 18, enabled = true)
	    private void Verifycompleteprotection_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOncompleteprotection();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOncompleteprotection();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 19, enabled = true)
	    private void Verifycompleteprotection_Image_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOncompleteprotection_Image();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOncompleteprotection_Image();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 20, enabled = true)
	    private void Verifycompleteprotection_BuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnCompleteprotection_BuyNow();
	        System.out.println("BuyNow button on preprod URL for complete protection");
	         switchingTab(secondTab);
	         sp.clickOnCompleteprotection_BuyNow();
	         System.out.println("BuyNow button on Live URL for complete protection");
	    }		
	 @Test(priority = 21, enabled = true)
	    private void Verifyfullprotection_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnfullprotection();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnfullprotection();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 22, enabled = true)
	    private void Verifyfullprotection_Image_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnfullprotection_Image();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnfullprotection_Image();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 23, enabled = true)
	    private void Verifyfullprotection_BuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnfullprotection_BuyNow();
	        System.out.println("BuyNow button on preprod URL for full protection");
	         switchingTab(secondTab);
	         sp.clickOnfullprotection_BuyNow();
	         System.out.println("BuyNow button on Live URL for full protection");
	    }		
	 @Test(priority = 24, enabled = true)
	    private void VerifyGetyourcoupon_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOngetcoupon();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOngetcoupon();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 25, enabled = true)
	    private void Verifyfindyourstore_Button() throws Exception {
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
