package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneWheretobuy_Pages;

public class SensodyneWheretobuy_Test extends BaseClass{
	SensodyneWheretobuy_Pages sp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 sp=new SensodyneWheretobuy_Pages ();
	        switchingTab(firstTab);
	        launchURL(loadConfig("sensodyneConfig.properties").getProperty("preProdSensodyneWheretobuyUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("sensodyneConfig.properties").getProperty("liveSensodyneWheretobuyUrl"));
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
	    private void VerifyWheretobuyBreadCrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnwheretobuyBreadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnwheretobuyBreadcrumbs();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 2, enabled = true)
	    private void Verifyfindspecificproduct_Button() throws Exception {
		 switchingTab(firstTab);
         sp.clickOnfindspecificproduct();
         System.out.println("Specific product displayed on preprod URL");
         switchingTab(secondTab);
         sp.clickOnfindspecificproduct();
         System.out.println("Specific product displayed on Live URL");
	    }	
	 @Test(priority = 3, enabled = true)
	    private void VerifyBuyonline_Button() throws Exception {
		 switchingTab(firstTab);
         sp.clickOnBuyonline();
        System.out.println("Buyonline displayed on preprod URL");
        switchingTab(secondTab);
        sp.clickOnBuyonline();
        System.out.println("Buyonline displayed on Live URL");
	    }	
	 @Test(priority = 4, enabled = true)
	    private void VerifyBuylocal_Button() throws Exception {
		 switchingTab(firstTab);
        sp.clickOnBuylocal();
        System.out.println("Buylocal displayed on preprod URL");
        switchingTab(secondTab);
        sp.clickOnBuylocal();
        System.out.println("Buylocal displayed on Live URL");
	    }	
	 @Test(priority = 5, enabled = true)
	    private void Verifysearch_Button() throws Exception {
		 switchingTab(firstTab);
     sp.clickOnsearch();
     System.out.println("search displayed on preprod URL");
     switchingTab(secondTab);
     sp.clickOnsearch();
     System.out.println("search displayed on Live URL");
	    }
	 
	 @Test(priority = 5, enabled = true)
	    private void Verifyretailers_Button() throws Exception {
		 switchingTab(firstTab);
		    sp.clickOnretailers();
	        System.out.println("All Retailers displayed on preprod URL");
	        switchingTab(secondTab);
	        sp.clickOnretailers();
	        System.out.println("All Retailers displayed on Live URL");
		    }	
	 @Test(priority = 6, enabled = true)
	    private void Verifyexploreourproducts_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnexploreproducts();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnexploreproducts();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 7, enabled = true)
	    private void Verifysave1_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsave1();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnsave1();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
