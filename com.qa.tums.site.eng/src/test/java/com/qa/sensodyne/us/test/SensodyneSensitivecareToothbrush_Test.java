package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneSensitivecareToothbrush_Pages;

public class SensodyneSensitivecareToothbrush_Test extends BaseClass{
	
	SensodyneSensitivecareToothbrush_Pages sp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 sp=new SensodyneSensitivecareToothbrush_Pages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("sensodyneConfig.properties").getProperty("preProdSensodynesensitivecaretoothbrushUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("sensodyneConfig.properties").getProperty("liveSensodynesensitivecaretoothbrushUrl"));
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
	    private void VerifyHomeBreadCrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnHomeBreadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnHomeBreadcrumbs();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 2, enabled = true)
	    private void VerifyourproductsBreadCrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnourproductsBreadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnourproductsBreadcrumbs();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 3, enabled = true)
	    private void VerifBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnBuyNow();
	         System.out.println("Verify Buynow in Preprod Url");
	         switchingTab(secondTab);
	         sp.clickOnBuyNow();
	         System.out.println("Verify Buynow in Live Url");
	    }		
	 @Test(priority = 4, enabled = true)
	    private void Verifyclickhere_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnclickhere();
	         System.out.println("Verify clickhere visible  in Preprod Url");
	         switchingTab(secondTab);
	         sp.clickOnclickhere();
	         System.out.println("Verify clickhere visible in Live Url");
	    }		
	 @Test(priority = 5, enabled = true)
	    private void VerifyYouTubeIcon_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitiveToothbrushYoutubeLink();
	         System.out.println("Verify YouTubeButton  in Preprod Url");
	         switchingTab(secondTab);
	         sp.clickOnSensitiveToothbrushYoutubeLink();
	         System.out.println("Verify YouTubeButton in Live Url");
	    }		
	 @Test(priority = 6, enabled = true)
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
	 @Test(priority = 7, enabled = true)
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
	 @Test(priority = 8, enabled = true)
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
	 @Test(priority = 9, enabled = true)
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
	 @Test(priority = 10, enabled = true)
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
	 @Test(priority = 11, enabled = true)
	    private void Verifygetcoupons_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnGetCoupons();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnGetCoupons();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 12, enabled = true)
	    private void Verifyfindstore_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnfindstore();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnfindstore();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
