package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneTeethWhiteningToothPastes_Pages;

public class SensodyneTeethWhiteningToothPastes_Test extends BaseClass {
	
	SensodyneTeethWhiteningToothPastes_Pages sp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 sp=new SensodyneTeethWhiteningToothPastes_Pages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("sensodyneConfig.properties").getProperty("preProdSensodyneTeethWhiteningToothpastesUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("sensodyneConfig.properties").getProperty("liveSensodyneTeethWhiteningToothpastesUrl"));
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
	    private void VerifyWhiteningTeeth_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnTeethWhiteningToothpastes();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnTeethWhiteningToothpastes();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 2, enabled = true)
	    private void VerifyWhiteningTeethBreadcrumb_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnTeethWhiteningToothpastesBreadcrumb();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnTeethWhiteningToothpastesBreadcrumb();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 3, enabled = true)
	    private void VerifyFreshenBreathen_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnFreshenbreathe();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnFreshenbreathe();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 4, enabled = true)
	    private void VerifySensitiveTeethRepair_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitiveTeethRepair();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensitiveTeethRepair();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 5, enabled = true)
	    private void Verifyplaguegumprotection_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnplaguegumprotection();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnplaguegumprotection();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 6, enabled = true)
	    private void VerifyResults_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnResults();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnResults();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 7, enabled = true)
	    private void VerifySensitiveGumWhitening_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitiveGumWhitening();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensitiveGumWhitening();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 8, enabled = true)
	    private void VerifySensitiveGumWhiteningBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitiveGumWhitening_BuyNow();
	        System.out.println("BuyNow for Sensitivite and gum whitening in Preprod");
	         switchingTab(secondTab);
	         sp.clickOnSensitiveGumWhitening_BuyNow();
	         System.out.println("BuyNow for Sensitivite and gum whitening in Prod");	   
	         }
	 @Test(priority = 9, enabled = true)
	    private void VerifySensitiveGumWhiteningImg_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitiveGumWhitening_Img();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensitiveGumWhitening_Img();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 
	 @Test(priority = 10, enabled = true)
	    private void VerifySensitiveCareToothBrush_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitiveCareToothBrush();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensitiveCareToothBrush();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 11, enabled = true)
	    private void VerifySensitiveCareToothBrushBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitiveCareToothBrush_BuyNow();
	        System.out.println("BuyNow for Sensitivite and gum whitening in Preprod");
	         switchingTab(secondTab);
	         sp.clickOnSensitiveCareToothBrush_BuyNow();
	         System.out.println("BuyNow for Sensitivite and gum whitening in Prod");	   
	         }
	 @Test(priority = 12, enabled = true)
	    private void VerifySensitiveCareToothBrushImg_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitiveCareToothBrush_Img();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensitiveCareToothBrush_Img();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 13, enabled = true)
	    private void VerifyRepairProtectWhitening_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnRepairProtectWhitening();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnRepairProtectWhitening();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 14, enabled = true)
	    private void VerifyRepairProtectWhiteningBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnRepairProtectWhitening_BuyNow();
	        System.out.println("BuyNow for RepairProtect whitening in Preprod");
	         switchingTab(secondTab);
	         sp.clickOnRepairProtectWhitening_BuyNow();
	         System.out.println("BuyNow for RepairProtect whitening in Prod");	   
	         }
	 @Test(priority = 15, enabled = true)
	    private void VerifyRepairProtectWhiteningImg_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnRepairProtectWhiteningImg();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnRepairProtectWhiteningImg();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 16, enabled = true)
	    private void VerifyExtraTrueWhiteFresh_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnExtraFreshToothPaste();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnExtraFreshToothPaste();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 17, enabled = true)
	    private void VerifyExtraFreshTrueWhiteBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnExtraFreshTrueWhite_BuyNow();
	        System.out.println("BuyNow for RepairProtect whitening in Preprod");
	         switchingTab(secondTab);
	         sp.clickOnExtraFreshTrueWhite_BuyNow();
	         System.out.println("BuyNow for RepairProtect whitening in Prod");	   
	         }
	 @Test(priority = 18, enabled = true)
	    private void VerifyExtraTrueWhiteFreshProduct_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnExtraFreshToothPasteProduct();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnExtraFreshToothPasteProduct();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 19, enabled = true)
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
	 @Test(priority = 20, enabled = true)
	    private void VerifyTrueWhiteMintBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnTrueWhiteMint_BuyNow();
	        System.out.println("BuyNow for TrueWhiteMint in Preprod");
	         switchingTab(secondTab);
	         sp.clickOnTrueWhiteMint_BuyNow();
	         System.out.println("BuyNow for TrueWhiteMint in Prod");	   
	         }
	 @Test(priority = 21, enabled = true)
	    private void VerifyTrueWhiteMintProduct_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnTrueWhiteMint_Product();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnTrueWhiteMint_Product();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 22, enabled = true)
	    private void VerifyDeepClean_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnDeepClean();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnDeepClean();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 23, enabled = true)
	    private void VerifyDeepCleanBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnDeepClean_BuyNow();
	        System.out.println("BuyNow for TrueWhiteMint in Preprod");
	         switchingTab(secondTab);
	         sp.clickOnDeepClean_BuyNow();
	         System.out.println("BuyNow for TrueWhiteMint in Prod");	   
	         }
	 @Test(priority = 24, enabled = true)
	    private void VerifyDeepCleanProduct_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnDeepClean_Product();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnDeepClean_Product();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 25, enabled = true)
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
	 @Test(priority = 26, enabled = true)
	    private void VerifyExtraWhiteningBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnExtraWhitening_BuyNow();
	        System.out.println("BuyNow for ExtraWhitening in Preprod");
	         switchingTab(secondTab);
	         sp.clickOnExtraWhitening_BuyNow();
	         System.out.println("BuyNow for Extrawhitening  in Prod");	   
	         }
	 @Test(priority = 26, enabled = true)
	    private void VerifyExtraWhiteningProduct_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnExtraWhitening_Product();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnExtraWhitening_Product();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 27, enabled = true)
	    private void VerifyFullProtectionToothPaste_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnFullProtectionToothpaste();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnFullProtectionToothpaste();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 28, enabled = true)
	    private void VerifyFullProtectionToothPasteBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnExtraWhitening_BuyNow();
	        System.out.println("BuyNow for FullprotectionToothpaste in Preprod");
	         switchingTab(secondTab);
	         sp.clickOnExtraWhitening_BuyNow();
	         System.out.println("BuyNow for FullprotectionToothpaste  in Prod");	   
	         }
	 @Test(priority = 29, enabled = true)
	    private void VerifyFullProtectionToothPasteProduct_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnFullProtectionToothpaste_Product();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnFullProtectionToothpaste_Product();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 30, enabled = true)
	    private void VerifyTartarControl_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnTartarControl();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnTartarControl();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 31, enabled = true)
	    private void VerifyTarTarControlBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnTartarControl_BuyNow();
	        System.out.println("BuyNow for TartarControl in Preprod");
	         switchingTab(secondTab);
	         sp.clickOnTartarControl_BuyNow();
	         System.out.println("BuyNow for TartarControl in Prod");	   
	         }
	 @Test(priority = 32, enabled = true)
	    private void VerifyTartarControlProduct_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnTartarControl_Product();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnTartarControl_Product();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 33, enabled = true)
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
	 @Test(priority = 34, enabled = true)
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
