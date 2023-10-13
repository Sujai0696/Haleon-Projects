package com.qa.eno.co.in.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.eno.co.in.pages.enocoinHeartBurnPage;

public class enocoinHeartBurnTest extends BaseClass{
	
	enocoinHeartBurnPage eh;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("eno_co_inConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 eh=new enocoinHeartBurnPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("eno_co_inConfig.properties").getProperty("preProdenoinHeartburnUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("eno_co_inConfig.properties").getProperty("LiveenoinHeartburnUrl"));
		 }					
	 @Test(priority=1,enabled=true)
		public void verifyUnderstandingHeartburnLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonUnderstandingHeartburn();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonUnderstandingHeartburn();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for UnderstandingHeartBurn:"+compareTwoText);
		}			
	 @Test(priority=2,enabled=true)
		public void verifyInitialSymptomsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonInitialSymptoms();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonInitialSymptoms();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for InitialSymptoms:"+compareTwoText);
		}			
	 @Test(priority=3,enabled=true)
		public void verifyHomeRemediesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonHomeRemedies();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonHomeRemedies();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeRemedies:"+compareTwoText);
		}			
	    //next slider//
	 
	 @Test(priority=10,enabled=true)
		public void verifyDidyouKnowSectionLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonDidYouKnowSection();
	        System.out.println("Did you know section is verified in the preprod URL");
	        switchingTab(secondTab);
	        eh.clickonDidYouKnowSection();
	        System.out.println("Did you know section is verified in the Live URL");
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
