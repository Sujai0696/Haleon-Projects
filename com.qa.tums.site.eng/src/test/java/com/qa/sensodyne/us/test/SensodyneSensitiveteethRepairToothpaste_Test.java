package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneSenstiveteethRepairToothpaste_Pages;

public class SensodyneSensitiveteethRepairToothpaste_Test extends BaseClass {
	
	SensodyneSenstiveteethRepairToothpaste_Pages sp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 sp=new  SensodyneSenstiveteethRepairToothpaste_Pages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("sensodyneConfig.properties").getProperty("preProdSensodyneSensitiveteethRepairToothpasteUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("sensodyneConfig.properties").getProperty("liveSensodyneSensitiveteethRepairToothpasteUrl"));
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
	    private void VerifySensitiveTeethToothpasteBreadCrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitiveTeethToothpasteBreadCrumbs();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensitiveTeethToothpasteBreadCrumbs();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }				
	 @Test(priority = 4, enabled = true)
	    private void VerifyEnamelwear_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnEnamelwear();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnEnamelwear();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 4, enabled = true)
	    private void VerifyFastReliefSensitiveteeth_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnFastReliefSensitiveTeeth();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnFastReliefSensitiveTeeth();
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
	    private void VerifyProducts1_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnProducts1();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnProducts1();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 7, enabled = true)
	    private void VerifyProducts2_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnProducts2();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnProducts2();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 8, enabled = true)
	    private void VerifyProducts3_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnProducts3();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnProducts3();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 9, enabled = true)
	    private void VerifyBuyNow1_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnBuyNow1();
	         System.out.println("Verify BuyNow on Preprod");
	         switchingTab(secondTab);
	         sp.clickOnBuyNow1();
	         System.out.println("Verify BuyNow on prod");
	    }		
	 @Test(priority = 10, enabled = true)
	    private void VerifyBuyNow2_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnBuyNow2();
	         System.out.println("Verify BuyNow2 on Preprod");
	         switchingTab(secondTab);
	         sp.clickOnBuyNow2();
	         System.out.println("Verify BuyNow2 on prod");
	    }		
	 @Test(priority = 11, enabled = true)
	    private void VerifyBuyNow3_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnBuyNow3();
	         System.out.println("Verify BuyNow3 on Preprod");
	         switchingTab(secondTab);
	         sp.clickOnBuyNow3();
	         System.out.println("Verify BuyNow3 on prod");
	    }		
	 @Test(priority = 12, enabled = true)
	    private void VerifyGetCoupons_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnGetCoupons();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnGetCoupons();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 13, enabled = true)
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
