package com.qa.voltarengel.test;
import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.voltarengel.pages.voltarengelHomepagePages;

public class voltarengelHomepageTest extends BaseClass{
	
	voltarengelHomepagePages vh;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("voltarengel_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		vh=new voltarengelHomepagePages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("voltarengel_Config.properties").getProperty("preProdHomepageUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("voltarengel_Config.properties").getProperty("liveHomepageUrl"));
		 }
	 @Test(priority=0,enabled=true)
		public void verifyGigyaformLink() throws Throwable
		{
		 switchingTab(firstTab);
	        vh.clickCookieBtn();
	        vh.clickGigyaForm();
	        System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
	        switchingTab(secondTab);
	        vh.clickCookieBtn();
	        vh.clickGigyaForm();        
	        System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
		}			
	 @Test(priority = 1, enabled = true)
	    private void VerifyDiscoverdifferences_Button() throws Exception {
		     switchingTab(firstTab);
	         vh.clickonDiscoverdifference();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vh.clickonDiscoverdifference();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Discoverdifferences:"+compareTwoText);
	    }		
	 @Test(priority = 2, enabled = true)
	    private void Verifylearnmorecaregivers_Button() throws Exception {
		     switchingTab(firstTab);
	         vh.clickonLearnmore_caregivers();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vh.clickonLearnmore_caregivers();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Learnmorecaregivers:"+compareTwoText);
	    }		
	 @Test(priority = 3, enabled = true)
	    private void VerifyReadmoreArthristFriendly_Button() throws Exception {
		     switchingTab(firstTab);
	         vh.clickonReadmoreArthristfriendly();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vh.clickonReadmoreArthristfriendly();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for ReadmoreArthristFriendly:"+compareTwoText);
	    }		
	 @Test(priority = 4, enabled = true)
	    private void VerifyFindoutmorevoltarenarthristgel_Button() throws Exception {
		     switchingTab(firstTab);
	         vh.clickonFindoutmore_Arthristpaingel();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vh.clickonFindoutmore_Arthristpaingel();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for findout_voltarengel:"+compareTwoText);
	    }		
	 @Test(priority = 5, enabled = true)
	    private void VerifyReadReview_Button() throws Exception {
		     switchingTab(firstTab);
	         vh.clickonReadReview();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vh.clickonReadReview();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for ReadReview:"+compareTwoText);
	    }		
	 @Test(priority = 6, enabled = true)
	    private void VerifyWriteReview_Button() throws Exception {
		     switchingTab(firstTab);
	         vh.clickonWriteReview();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vh.clickonWriteReview();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for WriteReview:"+compareTwoText);
	    }		
	 @Test(priority = 7, enabled = true)
	    private void VerifyLetsgo_Button() throws Exception {
		     switchingTab(firstTab);
	         vh.clickonletsgo();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vh.clickonletsgo();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Letsgo:"+compareTwoText);
	    }		
	 @Test(priority = 8, enabled = true)
	    private void Verifywhatisvoltaren_learnmore_Button() throws Exception {
		     switchingTab(firstTab);
	         vh.clickonWhatisVoltarenArthrist_learnmore();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vh.clickonWhatisVoltarenArthrist_learnmore();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for whatisvoltarenArthrist_learnmore:"+compareTwoText);
	    }		
	 @Test(priority = 9, enabled = true)
	    private void VerifySignupsave_Button() throws Exception {
		     switchingTab(firstTab);
	         vh.clickonSignupsave();
	        System.out.println("Verified the details on Form for preprod url");
	         switchingTab(secondTab);
	         vh.clickonSignupsave();
	         System.out.println("Verified the details on Form for Live url");
	    }		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
