package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneenamelstrengtheningToothpaste_Pages;

public class SensodyneenamelstrengtheningToothpaste_Test extends BaseClass{
	
	SensodyneenamelstrengtheningToothpaste_Pages sp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 sp=new  SensodyneenamelstrengtheningToothpaste_Pages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("sensodyneConfig.properties").getProperty("preProdSensodyneenamelstrengtheningToothpasteUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("sensodyneConfig.properties").getProperty("liveSensodyneenamelstrengtheningToothpasteUrl"));
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
	    private void VerifyenamelProtectionBreadCrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnEnamelProtectionBreadCrumbs();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnEnamelProtectionBreadCrumbs();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }				
	 @Test(priority = 4, enabled = true)
	    private void VerifyMultiBenefitToothpaste_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnMultiBenefitToothpaste();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnMultiBenefitToothpaste();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 5, enabled = true)
	    private void Verifyfastreliefsensitivity_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnFastreliefsensitivity();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnFastreliefsensitivity();
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
	    private void VerifySensitiveCareToothbrush_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitiveCareToothbrush();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensitiveCareToothbrush();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 8, enabled = true)
	    private void VerifySensitiveCareToothbrushBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitiveCareToothbrushBuyNow();
	         System.out.println("Buynow for Preprod Url");
	         switchingTab(secondTab);
	         sp.clickOnSensitiveCareToothbrushBuyNow();
	         System.out.println("Buynow for prod Url");
	    }			
	 @Test(priority = 9, enabled = true)
	    private void VerifyPronamelgentlewhitening_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPronamelGentleWhitening();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnPronamelGentleWhitening();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 10, enabled = true)
	    private void VerifyPronamelGentlewhiteningBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPronamelGentleWhiteningBuyNow();
	         System.out.println("Buynow for pronamel gentle whitening Preprod Url");
	         switchingTab(secondTab);
	         sp.clickOnPronamelGentleWhiteningBuyNow();
	         System.out.println("Buynow for pronamel gentle whitening prod Url");
	    }		
	 @Test(priority = 11, enabled = true)
	    private void VerifyPronamelMultiAction_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPronamelMultiAction();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnPronamelMultiAction();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 12, enabled = true)
	    private void VerifyPronamelMultiActionBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPronamelMultiAction();
	         System.out.println("Buynow for pronamel MultiAction Preprod Url");
	         switchingTab(secondTab);
	         sp.clickOnPronamelMultiAction();
	         System.out.println("Buynow for pronamel MultiAction prod Url");
	    }		
	 @Test(priority = 13, enabled = true)
	    private void VerifyPronamelFreshBreathe_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPronamelFreshBreathe();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnPronamelFreshBreathe();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 14, enabled = true)
	    private void VerifyPronamelFreshbreatheBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPronamelFreshBreatheBuyNow();
	         System.out.println("Buynow for pronamel freshbreathe Preprod Url");
	         switchingTab(secondTab);
	         sp.clickOnPronamelFreshBreatheBuyNow();
	         System.out.println("Buynow for pronamel freshbreathe prod Url");
	    }		
	@Test(priority = 15, enabled = true)
    private void VerifyPronamelDailyProtection_Button() throws Exception {
	     switchingTab(firstTab);
        sp.clickOnPronamelDailyProtection();
        String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
        switchingTab(secondTab);
        sp.clickOnPronamelDailyProtection();
        String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
   }			
	@Test(priority = 16, enabled = true)
    private void VerifyPronamelDailyProtectionBuyNow_Button() throws Exception {
	     switchingTab(firstTab);
         sp.clickOnPronamelDailyProtection_BuyNow();
         System.out.println("Buynow for pronamel DailyProtection Preprod Url");
         switchingTab(secondTab);
         sp.clickOnPronamelDailyProtection_BuyNow();
         System.out.println("Buynow for pronamel DailyProtection prod Url");
    }		
	@Test(priority = 17, enabled = true)
    private void VerifyPronamelStrongBrightEnamel_Button() throws Exception {
	     switchingTab(firstTab);
        sp.clickOnPronamelStrongBrightEnamel();
        String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
        switchingTab(secondTab);
        sp.clickOnPronamelStrongBrightEnamel();
        String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
   }			
	@Test(priority = 18, enabled = true)
    private void VerifyPronamelStrongBrightEnamelBuyNow_Button() throws Exception {
	     switchingTab(firstTab);
         sp.clickOnPronamelStrongBrightEnamel();
         System.out.println("Buynow for pronamel StrongBright Enamel Preprod Url");
         switchingTab(secondTab);
         sp.clickOnPronamelStrongBrightEnamel();
         System.out.println("Buynow for pronamel StrongBright Enamel prod Url");
    }		
	@Test(priority = 19, enabled = true)
    private void VerifyPronamelMineralBoost_Button() throws Exception {
	     switchingTab(firstTab);
        sp.clickOnPronamelMineralBoost();
        String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
        switchingTab(secondTab);
        sp.clickOnPronamelMineralBoost();
        String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
   }			
	@Test(priority = 20, enabled = true)
    private void VerifyPronamelMineralBoostBuyNow_Button() throws Exception {
	     switchingTab(firstTab);
         sp.clickOnPronamelMineralBoost_BuyNow();
         System.out.println("Buynow for pronamel Mineral Boost Preprod Url");
         switchingTab(secondTab);
         sp.clickOnPronamelMineralBoost_BuyNow();
         System.out.println("Buynow for pronamel Mineral Boost prod Url");
    }		
	@Test(priority = 21, enabled = true)
    private void VerifyPronamelMineralBoostGentlewhitening_Button() throws Exception {
	     switchingTab(firstTab);
        sp.clickOnPronamelMineralBoostGentlewhitening();
        String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
        switchingTab(secondTab);
        sp.clickOnPronamelMineralBoostGentlewhitening();
        String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
   }		
	@Test(priority = 22, enabled = true)
    private void VerifyPronamelMineralBoostGentlewhiteningBuyNow_Button() throws Exception {
	     switchingTab(firstTab);
         sp.clickOnPronamelMineralBoostGentlewhitening_BuyNow();
         System.out.println("Buynow for pronamel Mineral Boost gentle whitening Preprod Url");
         switchingTab(secondTab);
         sp.clickOnPronamelMineralBoostGentlewhitening_BuyNow();
         System.out.println("Buynow for pronamel Mineral Boost gentle whitening  Prod Url");
    }		
	@Test(priority = 23, enabled = true)
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
	@Test(priority = 24, enabled = true)
    private void VerifyFindStore_Button() throws Exception {
	     switchingTab(firstTab);
        sp.clickOnFindyourStore();
        String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
        switchingTab(secondTab);
        sp.clickOnFindyourStore();
        String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
   }		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
