package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneNaturalWhiteToothpaste_Pages;

public class SensodyneNaturalWhiteToothpaste_Test extends BaseClass{
	
	SensodyneNaturalWhiteToothpaste_Pages sp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 sp=new SensodyneNaturalWhiteToothpaste_Pages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("sensodyneConfig.properties").getProperty("preProdSensodyneNaturalWhiteToothpasteUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("sensodyneConfig.properties").getProperty("liveSensodyneNaturalWhiteToothpasteUrl"));
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
	    private void VerifySensodyneNaturalWhitesBreadCrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensodyneNaturalWhiteBreadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensodyneNaturalWhiteBreadcrumbs();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 2, enabled = true)
	    private void VerifyBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnBuyNow();
	         System.out.println("Verify BuyNow in PreProd");
	         switchingTab(secondTab);
	         sp.clickOnBuyNow();
	         System.out.println("Verify BuyNow in Prod");
	    }
	 @Test(priority = 3, enabled = true)
	    private void VerifyIngredients_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnIngredients();
	         System.out.println("Verify Ingredients in PreProd");
	         switchingTab(secondTab);
	         sp.clickOnIngredients();
	         System.out.println("Verify Ingredients in Prod");
	    }
	 @Test(priority = 4, enabled = true)
	    private void VerifyDirections_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnDirections();
	         System.out.println("Verify Directions in PreProd");
	         switchingTab(secondTab);
	         sp.clickOnDirections();
	         System.out.println("Verify Directions in Prod");
	    }
	 @Test(priority = 5, enabled = true)
	    private void VerifyWarnings_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnWarnings();
	         System.out.println("Verify Warnings in PreProd");
	         switchingTab(secondTab);
	         sp.clickOnWarnings();
	         System.out.println("Verify Warnings in Prod");
	    }
	 @Test(priority = 6, enabled = true)
	    private void VerifyMaterials_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnMaterials();
	         System.out.println("Verify Materials in PreProd");
	         switchingTab(secondTab);
	         sp.clickOnMaterials();
	         System.out.println("Verify Materials in Prod");
	    }
	 @Test(priority = 7, enabled = true)
	    private void VerifyFrequentlyQuestion_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnQuestion();
	         System.out.println("Verify Questions in PreProd");
	         switchingTab(secondTab);
	         sp.clickOnQuestion();
	         System.out.println("Verify Questions in Prod");
	    }
	 @Test(priority = 8, enabled = true)
	    private void VerifyPopularProducts1_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPopularProducts1();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnPopularProducts1();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 9, enabled = true)
	    private void VerifyPopularProducts2_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPopularProducts2();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnPopularProducts2();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 10, enabled = true)
	    private void VerifyPopularProducts3_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPopularProducts3();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnPopularProducts3();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 11, enabled = true)
	    private void VerifyPopularProducts4_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPopularProducts4();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnPopularProducts4();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 12, enabled = true)
	    private void VerifyPopularProducts5_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPopularProducts5();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnPopularProducts5();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 13, enabled = true)
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
	 @Test(priority = 14, enabled = true)
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
