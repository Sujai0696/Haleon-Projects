package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.Sensodynevspronamel_Pages;

public class Sensodynevspronamel_Test extends BaseClass{
	
	Sensodynevspronamel_Pages sp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 sp=new Sensodynevspronamel_Pages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("sensodyneConfig.properties").getProperty("preProdSensodynevspronamelUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("sensodyneConfig.properties").getProperty("liveSensodynevspronamelUrl"));
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
	    private void VerifyRecognizingSensitiveTeethBreadCrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnRecognizingsensitiveteethBreadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnRecognizingsensitiveteethBreadcrumbs();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 2, enabled = true)
	    private void VerifysensodynepronamelBreadCrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsensodynepronamelBreadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnsensodynepronamelBreadcrumbs();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 3, enabled = true)
	    private void VerifysensitivityRelief_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsensitivityrelief();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnsensitivityrelief();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 4, enabled = true)
	    private void VerifyAcidweakened_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnacidweakened();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnacidweakened();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 5, enabled = true)
	    private void VerifyYesbtn_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnYesBtn();
	         System.out.println("Verify The Yes button on Preprod Url");
	         switchingTab(secondTab);
	         sp.clickOnYesBtn();
	        System.out.println("Verify the Yes button on Live Url");
	    }		
	 @Test(priority = 6, enabled = true)
	    private void VerifyNobtn_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnNoBtn();
	         System.out.println("Verify The No button on Preprod Url");
	         switchingTab(secondTab);
	         sp.clickOnNoBtn();
	        System.out.println("Verify the No button on Live Url");
	    }		
	 @Test(priority = 7, enabled = true)
	    private void VerifyRelatedArticle1_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnRelatedArticle1();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnRelatedArticle1();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 8, enabled = true)
	    private void VerifyRelatedArticle2_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnRelatedArticle2();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnRelatedArticle2();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 9, enabled = true)
	    private void VerifyRelatedArticle3_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnRelatedArticle3();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnRelatedArticle3();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 10, enabled = true)
	    private void VerifyRelatedArticle4_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnRelatedArticle4();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnRelatedArticle4();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
