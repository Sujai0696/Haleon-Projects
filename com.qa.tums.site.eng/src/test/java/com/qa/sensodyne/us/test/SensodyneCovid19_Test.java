package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneCovid19_Pages;

public class SensodyneCovid19_Test extends BaseClass{
	
	SensodyneCovid19_Pages sp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 sp=new SensodyneCovid19_Pages ();
	        switchingTab(firstTab);
	        launchURL(loadConfig("sensodyneConfig.properties").getProperty("preProdSensodyneCovid19Url"));
			switchingTab(secondTab);
			launchURL(loadConfig("sensodyneConfig.properties").getProperty("liveSensodyneCovid19Url"));
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
	    private void VerifyCovid19BreadCrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickCovid19Breadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickCovid19Breadcrumbs();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 2, enabled = true)
	    private void VerifyDentalemergency_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnDentalemergency();
	         System.out.println("Dental emeregency display on preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnDentalemergency();
	         System.out.println("Dental emeregency display on Live URL");
	    }		
	 @Test(priority = 3, enabled = true)
	    private void VerifyConsiderDentalemergency_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnConsiderDentalemergency();
	         System.out.println("Consider Dental emeregency display on preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnConsiderDentalemergency();
	         System.out.println("Consider Dental emeregency display on Live URL");
	    }	
	 @Test(priority = 4, enabled = true)
	    private void VerifyFindyourToothpaste_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.ClickOnfindyourToothpaste();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.ClickOnfindyourToothpaste();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 5, enabled = true)
	    private void VerifyGetyourCoupon_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.ClickOngetyourcoupon();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.ClickOngetyourcoupon();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
