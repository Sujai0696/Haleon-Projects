package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneHeader_Pages;

public class SensodyneHeader_Test extends BaseClass{
	
	SensodyneHeader_Pages sp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 sp=new SensodyneHeader_Pages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("sensodyneConfig.properties").getProperty("preProdHomepageUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("sensodyneConfig.properties").getProperty("liveHomepageUrl"));
		 }
	 @Test(priority = 0, enabled = true)
		private void cookieButton() throws Exception {
		 sp=new SensodyneHeader_Pages();
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
	    private void Coupon_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.click_on_Coupon_Link();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.click_on_Coupon_Link();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 2, enabled = true)
	    private void WhereToBuy_Button() throws Exception {
	         switchingTab(firstTab);
	         sp.click_on_WhereToBuy_Link();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.click_on_WhereToBuy_Link();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 3, enabled = true)
	    private void SensodyneSymbol_Button() throws Exception {
	         switchingTab(firstTab);
	         sp.click_on_SensodyneSymbol_Link();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.click_on_SensodyneSymbol_Link();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 4, enabled = true)
	    private void Profestional_Button() throws Exception {
	         switchingTab(firstTab);
	         sp.click_on_Profestional_Link();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.click_on_Profestional_Link();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 5, enabled = true)
	    private void SelectCountry_Button() throws Exception {
	         switchingTab(firstTab);
	         sp.click_on_SelectCountry_Link();
	         System.out.println("Verify SelectCountry in PreProd");
	         switchingTab(secondTab);
	         sp.click_on_SelectCountry_Link();
	        System.out.println("Verify SelectCountry in Prod");
	    }
	 @Test(priority = 6, enabled = true)
	    private void GSKLogo_Button() throws Exception {
	         switchingTab(firstTab);
	         sp.click_on_GSKLogo_Link();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.click_on_GSKLogo_Link();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 7, enabled = true)
	    private void Search_Button() throws Exception {
	         switchingTab(firstTab);
	         sp.click_on_Search_Link();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.click_on_Search_Link();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 
	 @Test(priority = 8, enabled = true)
	    private void ContactUs_Button() throws Exception {
	         switchingTab(firstTab);
	         sp.click_on_ContactUs_Link();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.click_on_ContactUs_Link();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 9, enabled = true)
	    private void SiteMap_Button() throws Exception {
	         switchingTab(firstTab);
	         sp.click_on_SiteMap_Link();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.click_on_SiteMap_Link();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 10, enabled = true)
	    private void Termsconditions_Button() throws Exception {
	         switchingTab(firstTab);
	         sp.click_on_Termscondition_Link();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.click_on_Termscondition_Link();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 11, enabled = true)
	    private void Accessibility_Button() throws Exception {
	         switchingTab(firstTab);
	         sp.click_on_Accessibility_Link();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.click_on_Accessibility_Link();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 12, enabled = true)
	    private void yourprivacychoices_Button() throws Exception {
	         switchingTab(firstTab);
	         sp.click_on_yourprivacychoices_Link();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.click_on_yourprivacychoices_Link();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 13, enabled = true)
	    private void AcceptPolicy_Button() throws Exception {
	         switchingTab(firstTab);
	         sp.click_on_AcceptPolicy_Link();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.click_on_AcceptPolicy_Link();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 14, enabled = true)
	    private void GigyaFormOne_Button() throws Exception {
	         switchingTab(firstTab);
	         sp.click_on_GigyaFormOne_Link();
	        System.out.println("Gigyaform is Displayed in PreProd Url");
	         switchingTab(secondTab);
	         sp.click_on_GigyaFormOne_Link();
	         System.out.println("Gigyaform is Displayed in Live Url");
		      
	         
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
