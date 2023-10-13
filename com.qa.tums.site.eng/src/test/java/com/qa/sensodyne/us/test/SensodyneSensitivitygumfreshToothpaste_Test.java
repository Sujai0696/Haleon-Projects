package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneSensitivitygumfreshToothpaste_Pages;

public class SensodyneSensitivitygumfreshToothpaste_Test extends BaseClass{
	
	SensodyneSensitivitygumfreshToothpaste_Pages sp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 sp=new SensodyneSensitivitygumfreshToothpaste_Pages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("sensodyneConfig.properties").getProperty("preProdSensodyneSensitivityFreshToothpasteUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("sensodyneConfig.properties").getProperty("liveSensodyneSensitivityFreshToothpasteUrl"));
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
	    private void VerifyGumFreshcleanToothpasteBreadCrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitivityGumCleanFreshBreadCrumbs();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensitivityGumCleanFreshBreadCrumbs();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }						
	 @Test(priority = 3, enabled = true)
	    private void VerifyBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnBuyNowLink();
	        System.out.println("Verify BuyNow on Preprod url");
	         switchingTab(secondTab);
	         sp.clickOnBuyNowLink();
	        System.out.println("Verify BuyNow on Prod url");
	    }						
	 @Test(priority = 4, enabled = true)
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
	 @Test(priority = 5, enabled = true)
	    private void VerifyWhitening_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnWhitening();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnWhitening();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 6, enabled = true)
	    private void VerifyIngredients_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnIngredients();
	         System.out.println("Verify Ingredients on Preprod url");
	         switchingTab(secondTab);
	         sp.clickOnIngredients();
	        System.out.println("Verify Ingredients on Live url");	    }			
	
	 @Test(priority = 7, enabled = true)
	    private void VerifyDirections_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnDirections();
	         System.out.println("Verify Direction on Preprod url");
	         switchingTab(secondTab);
	         sp.clickOnDirections();
	        System.out.println("Verify Direction on Live url");	    
	        }			
	 @Test(priority = 8, enabled = true)
	    private void VerifyWarnings_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnWarnings();
	         System.out.println("Verify Warnings on Preprod url");
	         switchingTab(secondTab);
	         sp.clickOnWarnings();
	        System.out.println("Verify Warnings on Live url");	    
	        }		
	 @Test(priority = 9, enabled = true)
	    private void VerifyYouTubeLink_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnYoutubelink();
	         System.out.println("Verify YouTube on Preprod url");
	         switchingTab(secondTab);
	         sp.clickOnYoutubelink();
	        System.out.println("Verify YouTube on Live url");	    
	        }	
	 @Test(priority = 10, enabled = true)
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
	 @Test(priority = 11, enabled = true)
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
	 @Test(priority = 12, enabled = true)
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
	 @Test(priority = 13, enabled = true)
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
	 @Test(priority = 14, enabled = true)
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
	 @Test(priority = 15, enabled = true)
	    private void VerifyGetYourCoupon_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnGetyourCoupon();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnGetyourCoupon();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	
	 @Test(priority = 16, enabled = true)
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
