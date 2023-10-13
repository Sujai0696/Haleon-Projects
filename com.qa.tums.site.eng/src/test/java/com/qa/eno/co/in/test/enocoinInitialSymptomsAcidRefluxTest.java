package com.qa.eno.co.in.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.eno.co.in.pages.enocoinInitialSymptomsAcidRefluxPage;

public class enocoinInitialSymptomsAcidRefluxTest extends BaseClass{
	
	enocoinInitialSymptomsAcidRefluxPage ec;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("eno_co_inConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 ec=new enocoinInitialSymptomsAcidRefluxPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("eno_co_inConfig.properties").getProperty("preProdenoinInitialSymptomsAcidRefluxUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("eno_co_inConfig.properties").getProperty("LiveenoinInitialSymptomsAcidRefluxUrl"));
		 }					
	 @Test(priority=1,enabled=true)
		public void verifyHomeRemediesAcidRefluxLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ec.clickonHomeRemediesAcidRelux();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ec.clickonHomeRemediesAcidRelux();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeRemediesAcidReflux:"+compareTwoText);
		}							
	 @Test(priority=2,enabled=true)
		public void verifyUnderstandingHeartburnLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ec.clickonUnderstandingHeartburn();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ec.clickonUnderstandingHeartburn();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Understanding HeartBurn:"+compareTwoText);
		}		
	 @Test(priority=3,enabled=true)
		public void verifyHomeRemediesHeartBurnLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ec.clickonHomeRemediesHeartBurn();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ec.clickonHomeRemediesHeartBurn();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeRemedies HeartBurn:"+compareTwoText);
		}		
	 @Test(priority=4,enabled=true)
		public void verifyInitialSymptomsHeartburnLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ec.clickonInitialSymptomsHeartburn();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ec.clickonInitialSymptomsHeartburn();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for InitialSymptoms HeartBurn:"+compareTwoText);
		}		
	 @Test(priority=5,enabled=true)
		public void verifyAcidityRefluxorGerdLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ec.clickonAcidityRefluxorgerd();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ec.clickonAcidityRefluxorgerd();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AcidityReluxorgerd:"+compareTwoText);
		}		
	 @Test(priority=6,enabled=true)
		public void verifyAcidityorIndigestionLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ec.clickonAcidityorIndigestion();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ec.clickonAcidityorIndigestion();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AcidityorIndigestion:"+compareTwoText);
		}		
	 @Test(priority=7,enabled=true)
		public void verifyReferencesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ec.clickonReferences();
	        System.out.println("Verified References Successfully on pReprod Url");
	        switchingTab(secondTab);
	        ec.clickonReferences();
	        System.out.println("Verified References Successfully on Live Url");
		}		
	 @Test(priority=7,enabled=true)
		public void verifyAcidRefluxBabisChildrenLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ec.clickonAcidRefluxChildren();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ec.clickonAcidRefluxChildren();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AcidRefluxChildren:"+compareTwoText);
		}		
	 @Test(priority=8,enabled=true)
		public void verifyConstantAcidityLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ec.clickonConstantAcidity();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ec.clickonConstantAcidity();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ConstantAcidity:"+compareTwoText);
		}		
	 @Test(priority=9,enabled=true)
		public void verifyDidyouKnowSectionLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ec.clickonDidYouKnowSection();
	        System.out.println("Did you know section is verified in the preprod URL");
	        switchingTab(secondTab);
	        ec.clickonDidYouKnowSection();
	        System.out.println("Did you know section is verified in the Live URL");
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
