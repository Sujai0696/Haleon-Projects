package com.qa.preph.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.baseClass.BaseClass;
import com.qa.preph.pages.PrephHeaderPage;

public class PrephHeaderTest extends BaseClass{
	
	PrephHeaderPage ph;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("preph_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 ph=new PrephHeaderPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("preph_Config.properties").getProperty("preProdHomepageUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("preph_Config.properties").getProperty("liveHomepageUrl"));
		 }	
	 
	 @Test(priority=0,enabled=true)
		public void verifyPreph_cookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        ph.clickonCookieBtn();
	        System.out.println("Verify Preph Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        ph.clickonCookieBtn();
	        System.out.println("Verify Preph Cookie Popup on Live Url");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyOffersLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonOffers();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ph.clickonOffers();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Offers:"+compareTwoText);
		}										
	 @Test(priority=2,enabled=true)
		public void verifyWheretobuyLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonWheretoBuy();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ph.clickonWheretoBuy();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Where to Buy:"+compareTwoText);
		}					
	 @Test(priority=3,enabled=true)
		public void verifySignupLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonSignup();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ph.clickonSignup();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Sign up:"+compareTwoText);
		}					
	 @Test(priority=4,enabled=true)
		public void verifyCountrySelectorLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonCountrySelector();
	        System.out.println("Verified the Country Selector is Displayed on Preprod Url");
	        switchingTab(secondTab);
	        ph.clickonCountrySelector();
	       System.out.println("Verified the Country Selector is Displayed on Live Url");
		}					
	 @Test(priority=5,enabled=true)
		public void verifySearchIconLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonSearchIcon();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ph.clickonSearchIcon();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Search Icon :"+compareTwoText);
		}				
	 @Test(priority=6,enabled=true)
		public void verifyPrephLogoLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonPrephLogo();
	        System.out.println("Verified Prephlogo is Displayed on Preprod Url");
	        switchingTab(secondTab);
	        ph.clickonPrephLogo();
	       System.out.println("Verified Prephlogo is Displayed on Live Url");
		}				
	 @Test(priority=7,enabled=true)
		public void verifyProductsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonProducts();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ph.clickonProducts();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same forProducts :"+compareTwoText);
		}				
	
	 @Test(priority=8,enabled=true)
		public void verifyMedicatedWibesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonMedicatedWibes();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ph.clickonMedicatedWibes();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Medicated Wibes :"+compareTwoText);
		}				
	 @Test(priority=9,enabled=true)
		public void verifyMultisymptomscreameLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonMultisymptomscreame();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ph.clickonMultisymptomscreame();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Multi symptoms creame :"+compareTwoText);
		}				
	 @Test(priority=10,enabled=true)
		public void verifyOintmentLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonOintment();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ph.clickonOintment();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Ointment:"+compareTwoText);
		}				
	 @Test(priority=11,enabled=true)
		public void verifyTotablesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonTotables();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ph.clickonTotables();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Totables:"+compareTwoText);
		}				
	 @Test(priority=12,enabled=true)
		public void verifyCoolinggelLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonCoolinggel();;
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ph.clickonCoolinggel();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Coolinggel:"+compareTwoText);
		}				
	 @Test(priority=13,enabled=true)
		public void verifyMedicatedwipesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonMedicatedwipeswomen();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ph.clickonMedicatedwipeswomen();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Medicated wipes women:"+compareTwoText);
		}				
	 @Test(priority=14,enabled=true)
		public void verifySuppostoriesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonSuppostories();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ph.clickonSuppostories();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Suppostories:"+compareTwoText);
		}				
	 @Test(priority=15,enabled=true)
		public void verifyRapidReliefsprayLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonRapidReliefSpray();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ph.clickonRapidReliefSpray();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Rapid relief sparay:"+compareTwoText);
		}				
	 @Test(priority=16,enabled=true)
		public void verifyRapidReliefwipesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonRapidReliefwipes();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ph.clickonRapidReliefwipes();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Rapid relief wipes:"+compareTwoText);
		}				
	 @Test(priority=17,enabled=true)
		public void verifyRapidReliefLidocaineLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonRapidRelieflidocaine();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ph.clickonRapidRelieflidocaine();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Rapid reliefLidocaine:"+compareTwoText);
		}				
	 @Test(priority=18,enabled=true)
		public void verifySoothingReliefsprayLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonSoothingReliefcoolingspray();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ph.clickonSoothingReliefcoolingspray();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Soothing Relief spray:"+compareTwoText);
		}				
	 @Test(priority=19,enabled=true)
		public void verifySoothingReliefCoolingLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonSoothingCleanisingwipes();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ph.clickonSoothingCleanisingwipes();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Soothing Cleansing wipes:"+compareTwoText);
		}				
	 @Test(priority=20,enabled=true)
		public void verifySoothingReliefAntiitchingLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonSoothingReliefAntiitching();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ph.clickonSoothingReliefAntiitching();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Soothing Relief Antitching:"+compareTwoText);
		}				
	 @Test(priority=21,enabled=true)
		public void verifyReliefSprayLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonReliefSpray();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ph.clickonReliefSpray();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Relief Spray:"+compareTwoText);
		}				
	 @Test(priority=22,enabled=true)
		public void verifyLearnmoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonArticle();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ph.clickonArticle();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Article:"+compareTwoText);
		}				
	 @Test(priority=23,enabled=true)
		public void verifyVideosLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonVideos();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ph.clickonVideos();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Videos:"+compareTwoText);
		}				
	 @Test(priority=24,enabled=true)
		public void verifyFAQLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonFaq();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ph.clickonFaq();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for FAQ:"+compareTwoText);
		}				
	
	
	
	
	
	
	
	
	
	
	

}
