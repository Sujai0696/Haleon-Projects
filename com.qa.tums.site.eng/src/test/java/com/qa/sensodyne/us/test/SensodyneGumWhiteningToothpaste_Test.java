package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneGumWhiteningToothpaste_Pages;

public class SensodyneGumWhiteningToothpaste_Test extends BaseClass {
	
	SensodyneGumWhiteningToothpaste_Pages sp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 sp=new SensodyneGumWhiteningToothpaste_Pages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("sensodyneConfig.properties").getProperty("preProdSensodyneGumWhiteningToothpasteUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("sensodyneConfig.properties").getProperty("liveSensodyneGumWhiteningToothpasteUrl"));
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
	    private void VerifySensitivityGumWhiteningBreadCrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnOurSensitivityGumWhiteningBreadCrumbs();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnOurSensitivityGumWhiteningBreadCrumbs();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 3, enabled = true)
	    private void VerifyBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnBuyNowButton();
	         System.out.println("Verify BuyNow on Preprod Url");
	         switchingTab(secondTab);
	         sp.clickOnBuyNowButton();
	         System.out.println("Verify BuyNow on Live Url");
	    }		
	 @Test(priority = 4, enabled = true)
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
	 @Test(priority = 5, enabled = true)
	    private void VerifyMint_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnMint();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnMint();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 6, enabled = true)
	    private void VerifyCleanFresh_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnCleanandFresh();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnCleanandFresh();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 7, enabled = true)
	    private void VerifyIngredients_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnIngredients();
	        System.out.println("Verify Ingredients Clickable or not on Preprod ");
	         switchingTab(secondTab);
	         sp.clickOnIngredients();
	         System.out.println("Verify Ingredients Clickable or not on Live");
	    }		
	 @Test(priority = 8, enabled = true)
	    private void VerifyDirection_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnDirections();
	        System.out.println("Verify Direction Clickable or not on Preprod ");
	         switchingTab(secondTab);
	         sp.clickOnDirections();
	         System.out.println("Verify Direction Clickable or not on Live");
	    }		
	 @Test(priority = 9, enabled = true)
	    private void VerifyWarning_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnWarnings();
	        System.out.println("Verify Warning Clickable or not on Preprod ");
	         switchingTab(secondTab);
	         sp.clickOnWarnings();
	         System.out.println("Verify Warning Clickable or not on Live");
	    }		
	 @Test(priority = 10, enabled = true)
	    private void VerifyYouTubeLink_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnYouTubeLink();
	        System.out.println("Verify YouTube on Preprod ");
	         switchingTab(secondTab);
	         sp.clickOnYouTubeLink();
	         System.out.println("Verify YouTube on Live");
	    }		
	 @Test(priority = 11, enabled = true)
	    private void VerifyPopularProduct1_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPopularProduct1();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnPopularProduct1();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 12, enabled = true)
	    private void VerifyPopularProduct2_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPopularProduct2();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnPopularProduct2();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 13, enabled = true)
	    private void VerifyPopularProduct3_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPopularProduct3();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnPopularProduct3();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 14, enabled = true)
	    private void VerifyPopularProduct4_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPopularProduct4();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnPopularProduct4();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 15, enabled = true)
	    private void VerifyPopularProduct5_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPopularProduct5();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnPopularProduct5();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 16, enabled = true)
	    private void VerifyGetYourCoupon_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnGetyourcoupon();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnGetyourcoupon();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 17, enabled = true)
	    private void VerifyFinfYourstore_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnFinfYourStore();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnFinfYourStore();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
