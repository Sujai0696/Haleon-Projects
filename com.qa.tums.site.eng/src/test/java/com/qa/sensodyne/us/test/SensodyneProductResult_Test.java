package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneProductResult_Pages;

public class SensodyneProductResult_Test extends BaseClass{
	
	SensodyneProductResult_Pages sp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 sp=new SensodyneProductResult_Pages ();
	        switchingTab(firstTab);
	        launchURL(loadConfig("sensodyneConfig.properties").getProperty("preProdSensodyneProductResultUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("sensodyneConfig.properties").getProperty("liveSensodyneProductResultUrl"));
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
	         sp.clickOnOurProductsBreadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnOurProductsBreadcrumbs();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }						
	 @Test(priority = 2, enabled = true)
	    private void VerifyProductsResultBreadCrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnProductsResultBreadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnProductsResultBreadcrumbs();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }						
	 @Test(priority = 3, enabled = true)
	    private void VerifyProductsResultDisplay_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnProductsResultDisplay();
	         System.out.println("All Products Display in Preprod Url");
	         switchingTab(secondTab);
	         sp.clickOnProductsResultDisplay();
	         System.out.println("All Products Display in Live Url");
	    }				
	 @Test(priority = 4, enabled = true)
	    private void VerifyProductsResultDisplay1_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnProductsResultDisplay1();
	         System.out.println("Sensitive Teeth Repair Products Display in Preprod Url");
	         switchingTab(secondTab);
	         sp.clickOnProductsResultDisplay1();
	         System.out.println("Sensitive Teeth Repair Products Display in Live Url");
	    }		
	 @Test(priority = 5, enabled = true)
	    private void VerifyProductsResultDisplay2_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnProductsResultDisplay2();
	         System.out.println("Sodium Lauryl Sulphate Free Products Display in Preprod Url");
	         switchingTab(secondTab);
	         sp.clickOnProductsResultDisplay2();
	         System.out.println("Sodium Lauryl Sulphate Free Products Display in Preprod Url");
	    }		
	 @Test(priority = 6, enabled = true)
	    private void VerifyProductsResultDisplay3_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnProductsResultDisplay3();
	         System.out.println("Teeth Whitening Products Display in Preprod Url");
	         switchingTab(secondTab);
	         sp.clickOnProductsResultDisplay3();
	         System.out.println("Teeth Whitening Products Display in Live Url");
	    }		
	 @Test(priority = 7, enabled = true)
	    private void VerifyProductsResultDisplay4_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnProductsResultDisplay4();
	         System.out.println("Fast sensitive teeth relief Products Display in Preprod Url");
	         switchingTab(secondTab);
	         sp.clickOnProductsResultDisplay4();
	         System.out.println("Fast sensitive teeth relief Products Display in Preprod Url");
	    }		
	 @Test(priority = 8, enabled = true)
	    private void VerifyProductsResultDisplay5_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnProductsResultDisplay5();
	         System.out.println("Enamel straightening Products Display in Preprod Url");
	         switchingTab(secondTab);
	         sp.clickOnProductsResultDisplay5();
	         System.out.println("Enamel Straightening Products Display in Preprod Url");
	    }		
	 @Test(priority = 9, enabled = true)
	    private void VerifyProductsResultDisplay6_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnProductsResultDisplay6();
	         System.out.println("Plague and gum protection Products Display in Preprod Url");
	         switchingTab(secondTab);
	         sp.clickOnProductsResultDisplay6();
	         System.out.println("Plague and gum protection Products Display in Live Url");
	    }		
	 @Test(priority = 10, enabled = true)
	    private void VerifyProductsResultDisplay7_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnProductsResultDisplay7();
	         System.out.println("Multi-Benefits Products Display in Preprod Url");
	         switchingTab(secondTab);
	         sp.clickOnProductsResultDisplay7();
	         System.out.println("Multi-Benefits Products Display in Live Url");
	    }		
	 @Test(priority = 11, enabled = true)
	    private void VerifyProductsResultDisplay8_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnProductsResultDisplay8();
	         System.out.println("Extra Fresh Breathe Products Display in Preprod Url");
	         switchingTab(secondTab);
	         sp.clickOnProductsResultDisplay8();
	         System.out.println("Extra Fresh Breathe Products Display in Live Url");
	    }		
	 @Test(priority = 12, enabled = true)
	    private void VerifyGetReults_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnGetResult();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnGetResult();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }						
	 @Test(priority = 13, enabled = true)
	    private void VerifySensitivitygumcleanfresh_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitivitygumcleanfresh();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensitivitygumcleanfresh();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }				
//	 @Test(priority = 14, enabled = true)
//	    private void VerifySensitivitygumcleanfresh_Image_Button() throws Exception {
//		     switchingTab(firstTab);
//	         sp.clickOnSensitivitygumcleanfresh_img();
//	         System.out.println("Sensitivity gum Clean fresh Product on Preprod URL");
//	         switchingTab(secondTab);
//	         sp.clickOnSensitivitygumcleanfresh_img();
//	        System.out.println("Sensitivity gum Clean fresh Product on Live URL");
//	    }				
	 @Test(priority = 15, enabled = true)
	    private void VerifySensitivitygumcleanfresh_BuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitivityandgumcleanfresh_BuyNow();
	         System.out.println("Sensitivity gum Clean fresh Product  BuyNow on Preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnSensitivityandgumcleanfresh_BuyNow();
	        System.out.println("Sensitivity gum Clean fresh Product BuyNow on Live URL");
	    }		
	 @Test(priority = 16, enabled = true)
	    private void VerifySensitivitygumWhitening_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitivitygumwhitening();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensitivitygumwhitening();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
//	 @Test(priority = 17, enabled = true)
//	    private void VerifySensitivitygumWhitening_Image_Button() throws Exception {
//		     switchingTab(firstTab);
//	         sp.clickOnSensitivitygumwhitening_img();
//	         System.out.println("Sensitivity gum whitening Product  Image on Preprod URL");
//	         switchingTab(secondTab);
//	         sp.clickOnSensitivitygumwhitening_img();
//	        System.out.println("Sensitivity gum whitening Product  Image on Preprod URL");
//	    }		
	 @Test(priority = 18, enabled = true)
	    private void VerifySensitivitygumWhitening_BuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitivitygumwhitening_BuyNow();
	         System.out.println("Sensitivity gum whitening Product  BuyNow on Preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnSensitivitygumwhitening_BuyNow();
	        System.out.println("Sensitivity gum whitening Product  BuyNow on Preprod URL");
	    }		
	 @Test(priority = 19, enabled = true)
	    private void VerifySensitivitygumMint_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitivitygumMint();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensitivitygumMint();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
//	 @Test(priority = 20, enabled = true)
//	    private void VerifySensitivitygumMint_Image_Button() throws Exception {
//		     switchingTab(firstTab);
//	         sp.clickOnSensitivitygumMint_img();
//	         System.out.println("Sensitivity gum Mint Product on Preprod URL");
//	         switchingTab(secondTab);
//	         sp.clickOnSensitivitygumMint_img();
//	        System.out.println("Sensitivity gum Mint Product on Live URL");
//	    }		
	 @Test(priority = 21, enabled = true)
	    private void VerifySensitivitygumMint_BuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitivitygumMint_BuyNow();
	         System.out.println("Sensitivity gum Mint  Buy Now Product on Preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnSensitivitygumMint_BuyNow();
	        System.out.println("Sensitivity gum Mint  BuyNow Product on Live URL");
	    }		
	 @Test(priority = 22, enabled = true)
	    private void VerifySensitivitycaretoothbrush_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitivitycaretoothbrush();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensitivitycaretoothbrush();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
//	 @Test(priority = 23, enabled = true)
//	    private void VerifySensitivitygumcaretoothbrush_image_Button() throws Exception {
//		     switchingTab(firstTab);
//	         sp.clickOnSensitivitycaretoothbrush_img();
//	         System.out.println("Sensitivity care toothbrush Image Product on Preprod URL");
//	         switchingTab(secondTab);
//	         sp.clickOnSensitivitycaretoothbrush_img();
//	        System.out.println("Sensitivity care toothbrush Image Product on Live URL");
//	    }		
	 @Test(priority = 24, enabled = true)
	    private void VerifySensitivitygumcaretoothbrush_BuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitivitycaretoothbrush_BuyNow();
	         System.out.println("Sensitivity care toothbrush BuyNow Product on Preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnSensitivitycaretoothbrush_BuyNow();
	        System.out.println("Sensitivity care toothbrush  BuyNow Product on Live URL");
	    }		
	 @Test(priority = 25, enabled = true)
	    private void VerifyRapidReliefWhitening_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnRapidreliefWhitening();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnRapidreliefWhitening();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
//	 @Test(priority = 26, enabled = true)
//	    private void VerifyRapidreliefwhitening_image_Button() throws Exception {
//		     switchingTab(firstTab);
//	         sp.clickOnRapidreliefWhitening_img();
//	         System.out.println("Rapidrelief Whitening Product on Preprod URL");
//	         switchingTab(secondTab);
//	         sp.clickOnRapidreliefWhitening_img();
//	        System.out.println("Rapidrelief Whitening Product on Live URL");
//	    }		
	 @Test(priority = 27, enabled = true)
	    private void VerifyRapidreliefwhitening_BuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnRapidReliefwhitening_BuyNow();
	         System.out.println("Rapidrelief Whitening  BuyNow Product on Preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnRapidReliefwhitening_BuyNow();
	        System.out.println("Rapidrelief Whitening  BuyNow Product on Live URL");
	    }	
	 @Test(priority = 28, enabled = true)
	    private void VerifyRapidReliefMint_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnRapidreliefMint();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnRapidreliefMint();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
//	 @Test(priority = 29, enabled = true)
//	    private void VerifyRapidreliefmint_image_Button() throws Exception {
//		     switchingTab(firstTab);
//	         sp.clickOnRapidreliefMint_img();
//	         System.out.println("Rapidrelief Mint Image  Product on Preprod URL");
//	         switchingTab(secondTab);
//	         sp.clickOnRapidreliefMint_img();
//	        System.out.println("Rapidrelief Mint Image  Product on Live  URL");
//	    }	
	 @Test(priority = 30, enabled = true)
	    private void VerifyRapidreliefmint_BuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnRapidReliefMintBuyNow();
	         System.out.println("Rapidrelief Mint BuyNow  Product on Preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnRapidReliefMintBuyNow();
	        System.out.println("Rapidrelief Mint BuyNow  Product on Live  URL");
	    }	
	 @Test(priority = 31, enabled = true)
	    private void VerifyRapidReliefextrafresh_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnRapidreliefextrafresh();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnRapidreliefextrafresh();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
//	 @Test(priority = 32, enabled = true)
//	    private void VerifyRapidreliefextrafresh_image_Button() throws Exception {
//		     switchingTab(firstTab);
//	         sp.clickOnRapidreliefextrafresh_img();
//	         System.out.println("Rapidrelief extra fresh  Image  Product on Preprod URL");
//	         switchingTab(secondTab);
//	         sp.clickOnRapidreliefextrafresh_img();
//	        System.out.println("Rapidrelief extra fresh Image Product on Live  URL");
//	    }	
	 @Test(priority = 33, enabled = true)
	    private void VerifyRapidreliefextrafresh_BuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnRapidReliefextrafreshBuyNow();
	         System.out.println("Rapidrelief extra fresh  BuyNow Product on Preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnRapidReliefextrafreshBuyNow();
	        System.out.println("Rapidrelief extra fresh  BuyNow Product on Live  URL");
	    }	
	 @Test(priority = 34, enabled = true)
	    private void VerifyRepairprotectwhitening_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnRepairprotectwhitening();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnRepairprotectwhitening();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
//	 @Test(priority = 35, enabled = true)
//	    private void VerifyRepairprotectwhitening_image_Button() throws Exception {
//		     switchingTab(firstTab);
//	         sp.clickOnRepairprotectwhitening_img();
//	         System.out.println("Repair protect whitening image Product on Preprod URL");
//	         switchingTab(secondTab);
//	         sp.clickOnRepairprotectwhitening_img();
//	        System.out.println("Repair protect whitening image Product on Live URL");
//	    }	
	 @Test(priority = 36, enabled = true)
	    private void VerifyRepairprotectwhitening_BuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnRepairprotectwhitening_BuyNow();
	         System.out.println("Repair protect whitening BuyNow Product on Preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnRepairprotectwhitening_BuyNow();
	        System.out.println("Repair protect whitening BuyNow Product on Live URL");
	    }
	 @Test(priority = 37, enabled = true)
	    private void VerifyRepairprotectextrafresh_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnRepairprotectextrafresh();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnRepairprotectextrafresh();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
//	 @Test(priority = 38, enabled = true)
//	    private void VerifyRepairprotectextrafresh_image_Button() throws Exception {
//		     switchingTab(firstTab);
//	         sp.clickOnRepairprotectextrafresh_img();
//	         System.out.println("Repair protect extrafresh image Product on Preprod URL");
//	         switchingTab(secondTab);
//	         sp.clickOnRepairprotectextrafresh_img();
//	        System.out.println("Repair protect extrafresh image Product on Live URL");
//	    }
	 @Test(priority = 39, enabled = true)
	    private void VerifyRepairprotectextrafresh_BuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnRepairprotectextrafresh_BuyNow();
	         System.out.println("Repair protect extrafresh BuyNow Product on Preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnRepairprotectextrafresh_BuyNow();
	        System.out.println("Repair protect extrafresh BuyNow Product on Live URL");
	    }
	 @Test(priority = 40, enabled = true)
	    private void VerifyRepairandprotect_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnRepairandprotect();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnRepairandprotect();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
//	 @Test(priority = 41, enabled = true)
//	    private void VerifyRepairandprotect_image_Button() throws Exception {
//		     switchingTab(firstTab);
//	         sp.clickOnRepairandprotect_img();
//	         System.out.println("Repair protect  image Product on Preprod URL");
//	         switchingTab(secondTab);
//	         sp.clickOnRepairandprotect_img();
//	        System.out.println("Repair protect  image Product on Live URL");
//	    }
	 @Test(priority = 42, enabled = true)
	    private void VerifyRepairandprotect_BuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnRepairandprotect_BuyNow();
	         System.out.println("Repair protect  BuyNow Product on Preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnRepairandprotect_BuyNow();
	        System.out.println("Repair protect  BuyNow Product on Live URL");
	    }
	 @Test(priority = 43, enabled = true)
	    private void VerifyCompleteprotection_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnCompleteprotection();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnCompleteprotection();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
//	 @Test(priority = 44, enabled = true)
//	    private void VerifyCompleteprotection_image_Button() throws Exception {
//		     switchingTab(firstTab);
//	         sp.clickOnCompleteprotection_img();
//	         System.out.println("Complete protection Image  Product on Preprod URL");
//	         switchingTab(secondTab);
//	         sp.clickOnCompleteprotection_img();
//	        System.out.println("Complete protection Image Product on Live URL");
//	    }
	 @Test(priority = 45, enabled = true)
	    private void VerifyCompleteprotection_BuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnCompleteprotection_BuyNow();
	         System.out.println("Complete protection BuyNow Product on Preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnCompleteprotection_BuyNow();
	        System.out.println("Complete protection BuyNow Product on Live URL");
	    }
	 @Test(priority = 46, enabled = true)
	    private void VerifyTruewhiteextrafresh_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnTruewhiteextrafresh();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnTruewhiteextrafresh();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
//	 @Test(priority = 47, enabled = true)
//	    private void VerifyTruewhiteextrafresh_image_Button() throws Exception {
//		     switchingTab(firstTab);
//	         sp.clickOnTruewhiteextrafresh_img();
//	         System.out.println("Truewhite extra Product on Preprod URL");
//	         switchingTab(secondTab);
//	         sp.clickOnTruewhiteextrafresh_img();
//	        System.out.println("Truewhite extra Product on Live URL");
//	    }
	 @Test(priority = 48, enabled = true)
	    private void VerifyTruewhiteextrafresh_BuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnTruewhiteextrafresh_BuyNow();
	         System.out.println("Truewhite extra BuyNow Product on Preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnTruewhiteextrafresh_BuyNow();
	        System.out.println("Truewhite extra Buynow Product on Live URL");
	    }
	 @Test(priority = 49, enabled = true)
	    private void VerifyTruewhiteMint_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnTruewhiteMint();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnTruewhiteMint();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
//	 @Test(priority = 50, enabled = true)
//	    private void VerifyTruewhiteMint_image_Button() throws Exception {
//		     switchingTab(firstTab);
//	         sp.clickOnTruewhiteMint_img();
//	         System.out.println("Truewhite Mint image Product on Preprod URL");
//	         switchingTab(secondTab);
//	         sp.clickOnTruewhiteMint_img();
//	        System.out.println("Truewhite Mint image Product on Live URL");
//	    }
	 @Test(priority = 51, enabled = true)
	    private void VerifyTruewhiteMint_BuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnTruewhiteMint_BuyNow();
	         System.out.println("Truewhite Mint BuyNow Product on Preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnTruewhiteMint_BuyNow();
	        System.out.println("Truewhite Mint BuyNow Product on Live URL");
	    }
	 @Test(priority = 52, enabled = true)
	    private void VerifyDeepclean_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnDeepclean();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnDeepclean();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
//	 @Test(priority = 53, enabled = true)
//	    private void VerifyDeepclean_image_Button() throws Exception {
//		     switchingTab(firstTab);
//	         sp.clickOnDeepClean_img();
//	         System.out.println("Deepclean image Product on Preprod URL");
//	         switchingTab(secondTab);
//	         sp.clickOnDeepClean_img();
//	        System.out.println("Deepclean image BuyNow Product on Live URL");
//	    }
	 @Test(priority = 54, enabled = true)
	    private void VerifyDeepclean_BuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnDeepclean_BuyNow();
	         System.out.println("Deepclean BuyNow Product on Preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnDeepclean_BuyNow();
	        System.out.println("Deepclean BuyNow  Product on Live URL");
	    }
	 @Test(priority = 55, enabled = true)
	    private void VerifyExtrawhitening_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnextrawhitening();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnextrawhitening();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
//	 @Test(priority = 56, enabled = true)
//	    private void VerifyExtrawhitening_image_Button() throws Exception {
//		     switchingTab(firstTab);
//	         sp.clickOnextrawhitening_img();
//	         System.out.println("Extra whitening image Product on Preprod URL");
//	         switchingTab(secondTab);
//	         sp.clickOnextrawhitening_img();
//	        System.out.println("Extra whitening image Product on Live URL");
//	    }
	 @Test(priority = 57, enabled = true)
	    private void VerifyExtrawhitening_BuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnextrawhitening_BuyNow();
	         System.out.println("Extra whitening BuyNow Product on Preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnextrawhitening_BuyNow();
	        System.out.println("Extra whitening BuyNow Product on Live URL");
	    }
	 @Test(priority = 58, enabled = true)
	    private void VerifyFreshMint_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnFreshMint();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnFreshMint();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
//	 @Test(priority = 59, enabled = true)
//	    private void VerifyFreshMint_image_Button() throws Exception {
//		     switchingTab(firstTab);
//	         sp.clickOnFreshMint_img();
//	         System.out.println("FreshMint image Product on Preprod URL");
//	         switchingTab(secondTab);
//	         sp.clickOnFreshMint_img();
//	        System.out.println("FreshMint image  Product on Live URL");
//	    }
	 @Test(priority = 60, enabled = true)
	    private void VerifyFreshMint_BuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnFreshMint_BuyNow();
	         System.out.println("FreshMint BuyNow Product on Preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnFreshMint_BuyNow();
	        System.out.println("FreshMint BuyNow Product on Live URL");
	    }
	 @Test(priority = 61, enabled = true)
	    private void VerifyFullprotection_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnfullprotection();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnfullprotection();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
//	 @Test(priority = 62, enabled = true)
//	    private void VerifyFullprotection_image_Button() throws Exception {
//		     switchingTab(firstTab);
//	         sp.clickOnFullprotection_img();
//	         System.out.println("Fullprotection  image Product on Preprod URL");
//	         switchingTab(secondTab);
//	         sp.clickOnFullprotection_img();
//	        System.out.println("Fullprotection  image Product on Live URL");
//	    }
	 @Test(priority = 63, enabled = true)
	    private void VerifyFullprotection_BuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnFullprotection_BuyNow();
	         System.out.println("Fullprotection  BuyNow Product on Preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnFullprotection_BuyNow();
	        System.out.println("Fullprotection BuyNow Product on Live URL");
	    }
	 @Test(priority = 64, enabled = true)
	    private void VerifyTartarcontrol_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnTartarcontrol();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnTartarcontrol();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
//	 @Test(priority = 65, enabled = true)
//	    private void VerifyTartarcontrol_image_Button() throws Exception {
//		     switchingTab(firstTab);
//	         sp.clickOnTartarcontrol_img();
//	         System.out.println("Tartar control image  Product on Preprod URL");
//	         switchingTab(secondTab);
//	         sp.clickOnTartarcontrol_img();
//	        System.out.println("Tartar control image  Product on Live URL");
//	    }
	 @Test(priority = 66, enabled = true)
	    private void VerifyTartarcontrol_BuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnTartarcontrol_BuyNow();
	         System.out.println("Tartar control BuyNow  Product on Preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnTartarcontrol_BuyNow();
	        System.out.println("Tartar control BuyNow  Product on Live URL");
	    }
	 @Test(priority = 67, enabled = true)
	    private void VerifyFreshimpact_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnFreshimpact();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnFreshimpact();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
//	 @Test(priority = 68, enabled = true)
//	    private void VerifyFreshimpact_image_Button() throws Exception {
//		     switchingTab(firstTab);
//	         sp.clickOnFreshimpact_img();
//	         System.out.println("Freshimpact image Product on Preprod URL");
//	         switchingTab(secondTab);
//	         sp.clickOnFreshimpact_img();
//	        System.out.println("Freshimpact image  Product on Live URL");
//	    }
	 @Test(priority = 69, enabled = true)
	    private void VerifyFreshimpact_BuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnFreshimpact_BuyNow();
	         System.out.println("Freshimpact BuyNow Product on Preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnFreshimpact_BuyNow();
	        System.out.println("Freshimpact BuyNow  Product on Live URL");
	    }
	 @Test(priority = 70, enabled = true)
	    private void VerifyPronamelGentlewhitening_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPronamelgentlewhitening();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnPronamelgentlewhitening();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
//	 @Test(priority = 71, enabled = true)
//	    private void VerifyPronamelgentlewhitening_image_Button() throws Exception {
//		     switchingTab(firstTab);
//	         sp.clickOnPronamelgentlewhitening_img();
//	         System.out.println("Pronamel gentle whitening image Product on Preprod URL");
//	         switchingTab(secondTab);
//	         sp.clickOnPronamelgentlewhitening_img();
//	        System.out.println("Pronamel gentle whitening image Product on Live URL");
//	    }
	 @Test(priority = 72, enabled = true)
	    private void VerifyPronamelgentlewhitening_BuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPronamelgentlewhitening_BuyNow();
	         System.out.println("Pronamel gentle whitening BuYnow Product on Preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnPronamelgentlewhitening_BuyNow();
	        System.out.println("Pronamel gentle whitening BuyNow Product on Live URL");
	    }
	 @Test(priority = 73, enabled = true)
	    private void VerifyPronamelmultiaction_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPronamelmultiaction();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnPronamelmultiaction();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
//	 @Test(priority = 74, enabled = true)
//	    private void VerifyPronamelmultiaction_image_Button() throws Exception {
//		     switchingTab(firstTab);
//	         sp.clickOnPronamelmultiaction_img();
//	         System.out.println("Pronamel multiaction image Product on Preprod URL");
//	         switchingTab(secondTab);
//	         sp.clickOnPronamelmultiaction_img();
//	        System.out.println("Pronamel multiaction image Product on Live URL");
//	    }
	 @Test(priority = 75, enabled = true)
	    private void VerifyPronamelmultiaction_BuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPronamelmultiaction_BuyNow();
	         System.out.println("Pronamel multiaction BuyNow Product on Preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnPronamelmultiaction_BuyNow();
	        System.out.println("Pronamel multiaction BuyNow Product on Live URL");
	    }
	 @Test(priority = 76, enabled = true)
	    private void VerifyPronamelfreshbreathe_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPronamelfreshbreathe();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnPronamelfreshbreathe();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
//	 @Test(priority = 77, enabled = true)
//	    private void VerifyPronamelfreshbreathe_image_Button() throws Exception {
//		     switchingTab(firstTab);
//	         sp.clickOnPronamelfreshbreathe_img();
//	         System.out.println("Pronamel fresh breathe Product on Preprod URL");
//	         switchingTab(secondTab);
//	         sp.clickOnPronamelfreshbreathe_img();
//	        System.out.println("Pronamel fresh breathe Product on Live URL");
//	    }
	 @Test(priority = 78, enabled = true)
	    private void VerifyPronamelfreshbreathe_BuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPronamelfreshbreathe_BuyNow();
	         System.out.println("Pronamel fresh breathe  BuyNow Product on Preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnPronamelfreshbreathe_BuyNow();
	        System.out.println("Pronamel fresh breathe BuyNow Product on Live URL");
	    }
	 @Test(priority = 79, enabled = true)
	    private void VerifyPronameldailyprotection_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPronameldailyprotection();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnPronameldailyprotection();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
//	 @Test(priority = 80, enabled = true)
//	    private void VerifyPronameldailyprotection_image_Button() throws Exception {
//		     switchingTab(firstTab);
//	         sp.clickOnPronameldailyprotection_img();
//	         System.out.println("Pronamel daily protection image Product on Preprod URL");
//	         switchingTab(secondTab);
//	         sp.clickOnPronameldailyprotection_img();
//	        System.out.println("Pronamel daily protection image Product on Live URL");
//	    }
	 @Test(priority = 81, enabled = true)
	    private void VerifyPronameldailyprotection_BuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPronameldailyprotection_BuyNow();
	         System.out.println("Pronamel daily protection BuyNow Product on Preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnPronameldailyprotection_BuyNow();
	        System.out.println("Pronamel daily protection BuyNow Product on Live URL");
	    }
	 @Test(priority = 82, enabled = true)
	    private void VerifyPronamelmineralboostrefreshing_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPronamelmineralboostrefreshing();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnPronamelmineralboostrefreshing();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
//	 @Test(priority = 83, enabled = true)
//	    private void VerifyPronamelmineralboostrefreshing_image_Button() throws Exception {
//		     switchingTab(firstTab);
//	         sp.clickOnPronamelmineralboostrefreshing_img();
//	         System.out.println("Pronamel mineral boostrefreshing image  Product on Preprod URL");
//	         switchingTab(secondTab);
//	         sp.clickOnPronamelmineralboostrefreshing_img();
//	        System.out.println("Pronamel mineral boostrefreshing image Product on Live URL");
//	    }
	 @Test(priority = 84, enabled = true)
	    private void VerifyPronamelmineralboostrefreshing_BuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPronamelmineralboostrefreshing_BuyNow();
	         System.out.println("Pronamel mineral boostrefreshing  BuyNow Product on Preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnPronamelmineralboostrefreshing_BuyNow();
	        System.out.println("Pronamel mineral boostrefreshing BuyNow Product on Live URL");
	    }
	 @Test(priority = 85, enabled = true)
	    private void VerifyPronamelmineralboostgentlewhitening_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPronamelmineralboostgentlewhitening();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnPronamelmineralboostgentlewhitening();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
//	 @Test(priority = 86, enabled = true)
//	    private void VerifyPronamelmineralboostgentlewhitening_image_Button() throws Exception {
//		     switchingTab(firstTab);
//	         sp.clickOnPronamelmineralboostgentlewhitening_img();
//	         System.out.println("Pronamel mineral boostgentlewhitening Product on Preprod URL");
//	         switchingTab(secondTab);
//	         sp.clickOnPronamelmineralboostgentlewhitening_img();
//	        System.out.println("Pronamel mineral boostgentlewhitening Product on Live URL");
//	    }
	 @Test(priority = 87, enabled = true)
	    private void VerifyPronamelmineralboostgentlewhitening_BuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPronamelmineralboostgentlewhitening_BuyNow();
	         System.out.println("Pronamel mineral boostgentlewhitening BuyNow Product on Preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnPronamelmineralboostgentlewhitening_BuyNow();
	        System.out.println("Pronamel mineral boostgentlewhitening BuyNow Product on Live URL");
	    }
	 @Test(priority = 88, enabled = true)
	    private void Verifygetcoupon_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOngetcoupon();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOngetcoupon();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 89, enabled = true)
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
