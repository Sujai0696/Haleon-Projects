package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.abreva.pages.AbrevakidscoldsoresPage;

public class AbrevakidscoldsoresTest extends BaseClass{
	
	AbrevakidscoldsoresPage ac;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 ac=new AbrevakidscoldsoresPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("abreva_Config.properties").getProperty("preProdAbrevakidscoldsoresUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("abreva_Config.properties").getProperty("LiveAbrevakidscoldsoresUrl"));
		 }	
	 @Test(priority=0,enabled=true)
		public void verifyAbrevacookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        ac.clickonCookieBtn();
	        System.out.println("Verify Abreva Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonCookieBtn();
	        System.out.println("Verify Abreva Cookie Popup on Live Url");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyAboutcoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonAboutcoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonAboutcoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for About Cold Sores:"+compareTwoText);
		}							
	 @Test(priority=2,enabled=true)
		public void verifyColdsoresspreadLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonColdsoresspread();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonColdsoresspread();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cold sores spread:"+compareTwoText);
		}					
	 @Test(priority=3,enabled=true)
		public void verifyColdsorestriggersLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonColdsorestriggers();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonColdsorestriggers();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cold sores triggers:"+compareTwoText);
		}				
	 @Test(priority=4,enabled=true)
		public void verifyColdsorestreatmentLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonColdsorestreatment();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonColdsorestreatment();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cold sores treatment:"+compareTwoText);
		}				
	 @Test(priority=5,enabled=true)
		public void verifyColdsoresMythsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonColdsoresmyths();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonColdsoresmyths();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cold soresMyth:"+compareTwoText);
		}				
	 @Test(priority=6,enabled=true)
		public void verifyTakecarelipsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickontakecarelips();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickontakecarelips();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Take care lips:"+compareTwoText);
		}				
	 @Test(priority=7,enabled=true)
		public void verifyColdsorepimplesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickoncoldsorevspimple();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickoncoldsorevspimple();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cold sore vs pimple:"+compareTwoText);
		}				
	 @Test(priority=8,enabled=true)
		public void verifytypescoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickontypesofcoldsoresmedicine();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickontypesofcoldsoresmedicine();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Typescoldsores medicine:"+compareTwoText);
		}				
	 @Test(priority=9,enabled=true)
		public void verifyColdsoresTeensLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonColdsoresteens();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonColdsoresteens();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cold Sores Teens:"+compareTwoText);
		}								
	 @Test(priority=10,enabled=true)
		public void verifyTreatmentOptionsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonTreatmentOptions();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonTreatmentOptions();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Treatment Options:"+compareTwoText);
		}								
	 @Test(priority=11,enabled=true)
		public void verifyFeverLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonFever();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonFever();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Fever:"+compareTwoText);
		}								
	 @Test(priority=12,enabled=true)
		public void verifySunlightLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonSunlight();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonSunlight();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Sunlight:"+compareTwoText);
		}								
	 @Test(priority=13,enabled=true)
		public void verifyColdWeatherLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonColdweather();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonColdweather();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Coldweather:"+compareTwoText);
		}								
	 @Test(priority=14,enabled=true)
		public void verifyStressLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonStress();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonStress();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Stress:"+compareTwoText);
		}								
	 @Test(priority=15,enabled=true)
		public void verifyColdsorepersonLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonColdsoreperson();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonColdsoreperson();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cold soreperson:"+compareTwoText);
		}							
	 @Test(priority=16,enabled=true)
		public void verifySignSymptomsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonSignsymptoms();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonSignsymptoms();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Sign Symptoms:"+compareTwoText);
		}					
	 @Test(priority=17,enabled=true)
		public void verifyCausesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonCauses();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonCauses();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Causes:"+compareTwoText);
		}					
	 @Test(priority=18,enabled=true)
		public void verifyMythfactsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonMythfacts();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonMythfacts();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Mythfacts:"+compareTwoText);
		}					
	 @Test(priority=19,enabled=true)
		public void verifyLearnmoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonlearnmore();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonlearnmore();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same Learnmore:"+compareTwoText);
		}				
	 @Test(priority=20,enabled=true)
		public void verifyBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonBuyNow();
	        System.out.println("Verified BuyNow is displayed on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonBuyNow();
	        System.out.println("Verified BuyNow is displayed on Live Url");
		}				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
