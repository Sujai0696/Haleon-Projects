package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneSodiumlaurylsulphateToothpaste_Pages;

public class SensodyneSodiumlaurylsulphateToothpaste_Test extends BaseClass {
	
	SensodyneSodiumlaurylsulphateToothpaste_Pages sp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 sp=new  SensodyneSodiumlaurylsulphateToothpaste_Pages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("sensodyneConfig.properties").getProperty("preProdSensodyneSodiumLaurylsulphateToothpasteUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("sensodyneConfig.properties").getProperty("liveSensodyneSodiumLaurylsulphateToothpasteUrl"));
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
	    private void VerifySodiumLaurylsulphateBreadCrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSodiumLaurylSulphateToothpasteBreadCrumbs();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSodiumLaurylSulphateToothpasteBreadCrumbs();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }					
	 @Test(priority = 4, enabled = true)
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
	 @Test(priority = 5, enabled = true)
	    private void VerifyTarTarcontrol_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnTartarControl();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnTartarControl();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 6, enabled = true)
	    private void VerifyFreshBreathe_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnFreshBreathe();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnFreshBreathe();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 7, enabled = true)
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
	 @Test(priority = 8, enabled = true)
	    private void VerifySensitivecare_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitivvecare();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensitivvecare();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 9, enabled = true)
	    private void VerifySensitivecareProducts_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitivvecareProducts();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensitivvecareProducts();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 10, enabled = true)
	    private void VerifyBuyNowSensitiveCare_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitivecareBuyNow();
	        System.out.println("Verify BuyNow on Preprod");
	         switchingTab(secondTab);
	         sp.clickOnSensitivecareBuyNow();
	         System.out.println("Verify Buynow on Live Url");
	    }		
	 @Test(priority = 11, enabled = true)
	    private void VerifyTrueWhite_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnTrueWhite();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnTrueWhite();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 12, enabled = true)
	    private void VerifyTrueWhiteProducts_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnTrueWhiteProducts();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnTrueWhiteProducts();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 13, enabled = true)
	    private void VerifyTrueWhiteBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnTrueWhiteBuyNow();
	        System.out.println("Verify BuyNow on Preprod url");
	         switchingTab(secondTab);
	         sp.clickOnTrueWhiteBuyNow();
	         System.out.println("Verify BuyNow on Live url");
	    }
	 @Test(priority = 14, enabled = true)
	    private void VerifyTrueWhiteMint_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnTrueWhiteMint();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnTrueWhiteMint();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
//	 @Test(priority = 15, enabled = true)
//	    private void VerifyTrueWhiteMintProduct_Button() throws Exception {
//		     switchingTab(firstTab);
//	         sp.clickOnTrueWhiteMintProduct();
//	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
//	         switchingTab(secondTab);
//	         sp.clickOnTrueWhiteMintProduct();
//	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
//	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
//	    }		
	 @Test(priority = 16, enabled = true)
	    private void VerifyTrueWhiteMintBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnTrueWhiteMintBuyNow();
	         System.out.println("Verify BuyNow on Preprod Url");
	         switchingTab(secondTab);
	         sp.clickOnTrueWhiteMintBuyNow();
	         System.out.println("Verify BuyNow on Live Url");
	    }		
	 @Test(priority = 17, enabled = true)
	    private void VerifyExtraWhitening_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnExtraWhitening();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnExtraWhitening();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
//	 @Test(priority = 18, enabled = true)
//	    private void VerifyExtraWhiteningProduct_Button() throws Exception {
//		     switchingTab(firstTab);
//	         sp.clickOnExtraWhiteningProduct();
//	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
//	         switchingTab(secondTab);
//	         sp.clickOnExtraWhiteningProduct();
//	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
//	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
//	    }		
	 @Test(priority = 19, enabled = true)
	    private void VerifyExtrawhiteningBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnExtraWhiteningBuyNow();
	         System.out.println("Verify BuyNow  of ExtraWhitening on Preprod Url");
	         switchingTab(secondTab);
	         sp.clickOnExtraWhiteningBuyNow();
	         System.out.println("Verify BuyNow of Extrawhitening on Live Url");
	    }		
	 @Test(priority = 20, enabled = true)
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
	 @Test(priority = 21, enabled = true)
	    private void VerifyFreshMintProduct_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnFreshMint_Product();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnFreshMint_Product();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 22, enabled = true)
	    private void VerifyFreshMintBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnFreshMintBuyNow();
	         System.out.println("Verify BuyNow  of FreshMint on Preprod Url");
	         switchingTab(secondTab);
	         sp.clickOnFreshMintBuyNow();
	         System.out.println("Verify BuyNow of  FreshMint on Live Url");
	    }		
	 @Test(priority = 23, enabled = true)
	    private void VerifyFullprotection_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnFullProtection();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnFullProtection();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 24, enabled = true)
	    private void VerifyFullprotectionProduct_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnFullProtection_Product();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnFullProtection_Product();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 25, enabled = true)
	    private void VerifyFullprotectionBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnFullprotectionBuyNow();
	         System.out.println("Verify BuyNow  of Fullprotection on Preprod Url");
	         switchingTab(secondTab);
	         sp.clickOnFullprotectionBuyNow();
	         System.out.println("Verify BuyNow of  Fullprotection on Live Url");
	    }		
	 @Test(priority = 26, enabled = true)
	    private void VerifyTartarControl_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnTarTarControl();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnTarTarControl();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
//	 @Test(priority = 27, enabled = true)
//	    private void VerifyTartarControlProduct_Button() throws Exception {
//		     switchingTab(firstTab);
//	         sp.clickOnTarTarControl_product();
//	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
//	         switchingTab(secondTab);
//	         sp.clickOnTarTarControl_product();
//	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
//	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
//	    }		
	 @Test(priority = 28, enabled = true)
	    private void VerifyTarTarControl_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnTarTarControlBuyNow();
	         System.out.println("Verify BuyNow  of TartarControl on Preprod Url");
	         switchingTab(secondTab);
	         sp.clickOnTarTarControlBuyNow();
	         System.out.println("Verify BuyNow of  TartarControl on Live Url");
	    }		
	
	 @Test(priority = 29, enabled = true)
	    private void VerifyFreshImpact_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnFreshImpact();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnFreshImpact();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	
	 @Test(priority = 30, enabled = true)
	    private void VerifyFreshImpactProduct_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnFreshImpact_Product();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnFreshImpact_Product();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 31, enabled = true)
	    private void VerifyFreshImpactBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnFreshImpactBuyNow();
	         System.out.println("Verify BuyNow  of FreshImpact on Preprod Url");
	         switchingTab(secondTab);
	         sp.clickOnFreshImpactBuyNow();
	         System.out.println("Verify BuyNow of  FreshImpact on Live Url");
	    }		
	 @Test(priority = 32, enabled = true)
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
	 @Test(priority = 33, enabled = true)
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
