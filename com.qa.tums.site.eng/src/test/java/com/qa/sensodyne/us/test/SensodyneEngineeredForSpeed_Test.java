package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneEngineeredForSpeed_Pages;

public class SensodyneEngineeredForSpeed_Test extends BaseClass{
	
	SensodyneEngineeredForSpeed_Pages sp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 sp=new SensodyneEngineeredForSpeed_Pages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("sensodyneConfig.properties").getProperty("preProdSensodyneEngineeredForSpeedUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("sensodyneConfig.properties").getProperty("liveSensodyneEngineeredForSpeedUrl"));
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
	    private void VerifySensodyneInnovationBreadCrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensodyneInnovationBreadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensodyneInnovationBreadcrumbs();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 2, enabled = true)
	    private void VerifySensodyneEngineeredSpeedBreadCrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensodyneEngineeredSpeedBreadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensodyneEngineeredSpeedBreadcrumbs();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 3, enabled = true)
	    private void VerifySensodyneRapidRelief_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensodyneRapidRelief();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensodyneRapidRelief();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 4, enabled = true)
	    private void VerifySensodyneBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensodyneBuyNow();
	         System.out.println("Verify BuyNow on PreProd Url");
	         switchingTab(secondTab);
	         sp.clickOnSensodyneBuyNow();
	         System.out.println("Verify BuyNow on Live Url");
	    }	
	 @Test(priority = 5, enabled = true)
	    private void VerifySensodyneGetCoupons_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensodynGetcoupons();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensodynGetcoupons();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 5, enabled = true)
	    private void VerifySensodyneYouTubeLink_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnToothSensitivityYoutubeLink();
	         System.out.println("Verify YouTubeVideo on PreProd Url");
	         switchingTab(secondTab);
	         sp.clickOnToothSensitivityYoutubeLink();
	         System.out.println("Verify YouTubeVideo on Live Url");
	    }	
	 @Test(priority = 6, enabled = true)
	    private void VerifySensodyneYouTubeLink2_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnToothSensitivityYoutube1Link();
	         System.out.println("Verify YouTubeVideo1 on PreProd Url");
	         switchingTab(secondTab);
	         sp.clickOnToothSensitivityYoutube1Link();
	         System.out.println("Verify YouTubeVideo1 on Live Url");
	    }	
	 @Test(priority = 7, enabled = true)
	    private void VerifySensodyneUniqueFormulation_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensodyneUniqueFormulation();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensodyneUniqueFormulation();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 8, enabled = true)
	    private void VerifyRelatedArticle1_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnArticle1();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnArticle1();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 9, enabled = true)
	    private void VerifyRelatedArticle2_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnArticle2();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnArticle2();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 10, enabled = true)
	    private void VerifyRelatedArticle3_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnArticle3();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnArticle3();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 11, enabled = true)
	    private void VerifyRelatedArticle4_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnArticle4();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnArticle4();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
