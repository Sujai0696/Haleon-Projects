package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneNourishSensitivityToothpaste_Pages;


public class SensodyneNourishSensitivityToothpaste_Test extends BaseClass{
	
	SensodyneNourishSensitivityToothpaste_Pages sp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 sp=new SensodyneNourishSensitivityToothpaste_Pages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("sensodyneConfig.properties").getProperty("preProdSensodyneNourishSenitivityToothpasteUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("sensodyneConfig.properties").getProperty("liveSensodyneNourishSenitivityToothpasteUrl"));
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
	    private void VerifyOurProductsMainBreadCrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnOurProductsMainBreadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnOurProductsMainBreadcrumbs();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 3, enabled = true)
	    private void VerifyOurBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnBuyNow();
	        System.out.println("Buynow button Verfy in Preprod Url");
	         switchingTab(secondTab);
	         sp.clickOnOurProductsMainBreadcrumbs();
	         System.out.println("Buynow button Verfy in prod Url");
	    }
	 @Test(priority = 4, enabled = true)
	    private void VerifyToothpasteGentlySoothing_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnToothpasteGentlySoothing();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnToothpasteGentlySoothing();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 5)
	    private void VerifyIngredientsTableForm_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnIngredientsTable();
	        System.out.println("Verify Ingredients is clickable on PreProd Url");
	         switchingTab(secondTab);
	         sp.clickOnIngredientsTable();
	         System.out.println("Verify Ingredients is clickable on Prod Url");
	    }
	 
	 @Test(priority = 6)
	    private void VerifyDirectionsTableForm_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnDirectionsTable();
	        System.out.println("Verify Directions is clickable on PreProd Url");
	         switchingTab(secondTab);
	         sp.clickOnDirectionsTable();
	         System.out.println("Verify Directions is clickable on Prod Url");
	    }
	 @Test(priority = 7)
	    private void VerifyWarningsTableForm_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnWarningsTable();
	        System.out.println("Verify Warnings is clickable on PreProd Url");
	         switchingTab(secondTab);
	         sp.clickOnWarningsTable();
	         System.out.println("Verify Warnings is clickable on Prod Url");
	    }
	 @Test(priority = 8)
	    private void VerifyMaterialsTableForm_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnMaterialTable();
	        System.out.println("Verify Warnings is clickable on PreProd Url");
	         switchingTab(secondTab);
	         sp.clickOnMaterialTable();
	         System.out.println("Verify Warnings is clickable on Prod Url");
	    }
	 @Test(priority = 9)
	    private void VerifyDietaryTableForm_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnDietaryTable();
	        System.out.println("Verify Warnings is clickable on PreProd Url");
	         switchingTab(secondTab);
	         sp.clickOnDietaryTable();
	         System.out.println("Verify Warnings is clickable on Prod Url");
	    }
	 @Test(priority = 10)
	    private void VerifyFrequentlyQuestion1_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnQuestion1();
	        System.out.println("Verify Question is clickable on PreProd Url");
	         switchingTab(secondTab);
	         sp.clickOnQuestion1();
	         System.out.println("Verify Question is clickable on Prod Url");
	    }
	 @Test(priority = 11)
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
	 @Test(priority = 12)
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
	 @Test(priority = 13)
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
	 @Test(priority = 13)
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
	 @Test(priority = 14)
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
	 @Test(priority = 14)
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
	 @Test(priority = 15, enabled = true)
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
