package com.qa.sensodyne.us.test;


import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneExtraFreshBreatheToothpaste_Pages;

public class SensodyneExtraFreshBreatheToothpaste_Test extends BaseClass{
	
	SensodyneExtraFreshBreatheToothpaste_Pages sp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 sp=new SensodyneExtraFreshBreatheToothpaste_Pages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("sensodyneConfig.properties").getProperty("preProdSensodyneExtraFreshbreatheToothpasteUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("sensodyneConfig.properties").getProperty("liveSensodyneExtraFreshbreatheToothpasteUrl"));
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
	    private void VerifyExtraFreshBreathe_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnExtraFreshBreathe();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnExtraFreshBreathe();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 2, enabled = true)
	    private void VerifyExtraFreshBreatheBreadCrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnExtraFreshBreathe_BreadCrumbs();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnExtraFreshBreathe_BreadCrumbs();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 3, enabled = true)
	    private void VerifySensitiveTeethRelief_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitiveTeethRelief();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensitiveTeethRelief();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 4, enabled = true)
	    private void VerifyTeethWhiteningTeethPaste_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnTeethWhiteningTeethPaste();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnTeethWhiteningTeethPaste();
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
	    private void VerifySensitiveCareToothBrush_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitivecareToothBrush();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensitivecareToothBrush();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 7, enabled = true)
	    private void VerifySensitiveCareToothBrushProduct_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitivecareToothBrushProduct();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensitivecareToothBrushProduct();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 8, enabled = true)
	    private void VerifySensitiveCareTeethBrush_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitiveCareToothBrush_BuyNow();
	        System.out.println("BuyNow  for SensitiveCare TeethBrush on PreprodUrl");
	         switchingTab(secondTab);
	         sp.clickOnSensitiveCareToothBrush_BuyNow();
	         System.out.println("BuyNow  for SensitiveCare TeethBrush on LiveUrl");
	    }
	 @Test(priority = 9, enabled = true)
	    private void VerifySensitivitygumcleanfresh_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsensitivitygumcleanfresh();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnsensitivitygumcleanfresh();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 10, enabled = true)
	    private void VerifySensitivitygumcleanfresh_BuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitivitygumcleanfresh_BuyNow();
	         System.out.println("Preprod UrL for BuyNow on sensitivitygumcleanfresh");
	         switchingTab(secondTab);
	         sp.clickOnSensitivitygumcleanfresh_BuyNow();
	         System.out.println("Live  UrL for BuyNow on sensitivitygumcleanfresh");
	    }
	 @Test(priority = 11, enabled = true)
	    private void Verifyrapidreliefextrafresh_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnrapidreliefextrafresh();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnrapidreliefextrafresh();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 12, enabled = true)
	    private void Verifyrapidreliefextrafresh_BuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnrapidreliefextrafresh_BuyNow();
	         System.out.println("Preprod UrL for BuyNow on rapidrelief extra fresh");
	         switchingTab(secondTab);
	         sp.clickOnrapidreliefextrafresh_BuyNow();
	         System.out.println("Live UrL for BuyNow on rapidrelief extra fresh");
	    }
	 @Test(priority = 13, enabled = true)
	    private void Verifyrepairprotectextrafresh_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnrepairprotectextrafresh();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnrepairprotectextrafresh();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 14, enabled = true)
	    private void Verifyrepairextrafresh_BuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnrepairprotectextrafresh_BuyNow();
	         System.out.println("Preprod UrL for BuyNow on repairprotect extra fresh");
	         switchingTab(secondTab);
	         sp.clickOnrepairprotectextrafresh_BuyNow();
	         System.out.println("Live UrL for BuyNow on repairprotect extra fresh");
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
	    private void Verifycompleteprotectionextrafresh_BuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOncompleteprotectionextrafresh_BuyNow();
	         System.out.println("BuyNow on Preprod URL for completeprotection extra fresh");
	         switchingTab(secondTab);
	         sp.clickOncompleteprotectionextrafresh_BuyNow();
	         System.out.println("BuyNow on Preprod URL for completeprotection extra fresh");
	    }
	 @Test(priority = 17, enabled = true)
	    private void Verifyfreshmint_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnfreshmint();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnfreshmint();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 18, enabled = true)
	    private void Verifyfreshmint_BuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnfreshmint_BuyNow();
	         System.out.println("BuyNow on Preprod URL for freshmint");
	         switchingTab(secondTab);
	         sp.clickOnfreshmint_BuyNow();
	         System.out.println("BuyNow on Preprod URL for freshmint");
	    }
	 @Test(priority = 19, enabled = true)
	    private void Verifyfreshimpact_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnfreshimpact();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnfreshimpact();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 20, enabled = true)
	    private void Verifyfreshimpact_BuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnfreshimpact_BuyNow();
	         System.out.println("BuyNow on Preprod URL for freshimpact");
	         switchingTab(secondTab);
	         sp.clickOnfreshimpact_BuyNow();
	         System.out.println("BuyNow on Preprod URL for freshimpact");
	    }
	 @Test(priority = 21, enabled = true)
	    private void Verifygetyourcoupon_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOngetcoupon();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOngetcoupon();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 22, enabled = true)
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
