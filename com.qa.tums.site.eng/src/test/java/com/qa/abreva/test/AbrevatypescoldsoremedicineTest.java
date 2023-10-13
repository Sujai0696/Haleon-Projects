package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.abreva.pages.AbrevatypescoldsoremedicinePage;

public class AbrevatypescoldsoremedicineTest extends BaseClass{
	
	AbrevatypescoldsoremedicinePage ac;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 ac=new AbrevatypescoldsoremedicinePage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("abreva_Config.properties").getProperty("preProdAbrevatypescoldsoremedicineUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("abreva_Config.properties").getProperty("LiveAbrevatypescoldsoremedicineUrl"));
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
		public void verifyTinglingLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonTingling();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonTingling();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Tingling:"+compareTwoText);
		}							
	 @Test(priority=11,enabled=true)
		public void verifyColdsoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonColdsore();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonColdsore();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cold sore:"+compareTwoText);
		}							
	
	 @Test(priority=12,enabled=true)
		public void verifyOurCreamLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonOurCream();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonOurCream();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for our cream:"+compareTwoText);
		}							
	 @Test(priority=13,enabled=true)
		public void verifyFutureOutbreaksLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonFutureOutbreaks();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonFutureOutbreaks();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for  Future outbreaks:"+compareTwoText);
		}							
	 @Test(priority=13,enabled=true)
		public void verifyColdsoreEducationLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonColdsoreEducation();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonColdsoreEducation();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for  Cold Sore Educations:"+compareTwoText);
		}						
	 @Test(priority=14,enabled=true)
		public void verifyAbrevaNewsRoomLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonAbrevaNewsroom();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonAbrevaNewsroom();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for  Abreva NewsRoom:"+compareTwoText);
		}						
	 @Test(priority=15,enabled=true)
		public void verifyLearnmoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonlearnmore();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonlearnmore();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for  Learn more:"+compareTwoText);
		}						
	 @Test(priority=16,enabled=true)
		public void verifyBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonBuyNow();
	        System.out.println("Verified BuyNow is Displayed on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonBuyNow();
	       System.out.println("Verified BuyNow is Displayed on Live Url");
		}				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
