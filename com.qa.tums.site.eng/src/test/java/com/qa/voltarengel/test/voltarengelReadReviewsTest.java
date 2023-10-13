package com.qa.voltarengel.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.voltarengel.pages.voltarengelReadReviewsPage;


public class voltarengelReadReviewsTest extends BaseClass{
	
	voltarengelReadReviewsPage vn;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("voltarengel_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		vn=new voltarengelReadReviewsPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("voltarengel_Config.properties").getProperty("preProdReadReviewsUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("voltarengel_Config.properties").getProperty("LiveReadReviewsUrl"));
		 }
	 @Test(priority=0,enabled=true)
		public void verifyGigyaformLink() throws Throwable
		{
		 switchingTab(firstTab);
	        vn.clickCookieBtn();
	        vn.clickGigyaForm();
	        System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
	        switchingTab(secondTab);
	        vn.clickCookieBtn();
	        vn.clickGigyaForm();        
	        System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
		}			
	 @Test(priority = 1, enabled = true)
	    private void VerifyHomepagebreadcrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonHomepageBreadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonHomepageBreadcrumbs();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for HomepageBreadcrumbs:"+compareTwoText);
	    }			
	 @Test(priority = 2, enabled = true)
	    private void Verifyaboutvoltaren_breadcrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonaboutvoltarenBreadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonaboutvoltarenBreadcrumbs();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for aboutVoltarenBreadcrumbs:"+compareTwoText);
	    }							
	 @Test(priority = 3, enabled = true)
	    private void VerifyReadReviewArthristPaingel_breadcrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonReadReviewVoltarenArthristpaingelBreadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonReadReviewVoltarenArthristpaingelBreadcrumbs();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for ReadReviewArthrist_Breadcrumbs:"+compareTwoText);
	    }							
	 @Test(priority = 4, enabled = true)
	    private void VerifySearchIcon_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonSearchIcon();
	         System.out.println("Verified the SearchIcon on Preprod  Url Successfully");
	         switchingTab(secondTab);
	         vn.clickonSearchIcon();
	         System.out.println("Verified the SearchIcon on Live  Url Successfully");
	    }				
	 @Test(priority = 5, enabled = true)
	    private void VerifyWriteReview_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonWriteReview();
	         System.out.println("Verified the write Review on Preprod  Url Successfully");
	         switchingTab(secondTab);
	         vn.clickonWriteReview();
	         System.out.println("Verified the write Review on Live  Url Successfully");
	    }				
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	

}
