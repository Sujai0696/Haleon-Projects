package com.qa.eno.co.in.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.eno.co.in.pages.enocoinFooterPage;

public class enocoinFooterTest extends BaseClass{
	
	enocoinFooterPage ef;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("eno_co_inConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 ef=new enocoinFooterPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("eno_co_inConfig.properties").getProperty("preProdenoinHomepageUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("eno_co_inConfig.properties").getProperty("liveenoinHomepageUrl"));
		 }					
	 @Test(priority=1,enabled=true)
		public void verifyAboutAcidityLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ef.clickonaboutAcidity();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ef.clickonaboutAcidity();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AboutAcidity:"+compareTwoText);
		}			
	 @Test(priority=2,enabled=true)
		public void verifyAcidityRefluxLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ef.clickonAcidityReflux();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ef.clickonAcidityReflux();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Acidity Reflux:"+compareTwoText);
		}			
	 @Test(priority=3,enabled=true)
		public void verifyManagingAcidityLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ef.clickonManagingAcidity();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ef.clickonManagingAcidity();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Managing Acidity:"+compareTwoText);
		}			
	 @Test(priority=4,enabled=true)
		public void verifyDigestiveConditionsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ef.clickonDigestiveConditions();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ef.clickonDigestiveConditions();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Digestive Conditions:"+compareTwoText);
		}			
	 @Test(priority=5,enabled=true)
		public void verifyDigestiveWellnessLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ef.clickonDigestiveWellness();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ef.clickonDigestiveWellness();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for DigestiveWellness:"+compareTwoText);
		}			
	 @Test(priority=6,enabled=true)
		public void verifyProductsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ef.clickonProducts();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ef.clickonProducts();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Products:"+compareTwoText);
		}		
	 @Test(priority=7,enabled=true)
		public void verifyEnoFruitSaltLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ef.clickonEnoFruitsalts();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ef.clickonEnoFruitsalts();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ProductsnoFruitSalt:"+compareTwoText);
		}		
	 @Test(priority=8,enabled=true)
		public void verifyHowEnoWorksLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ef.clickonHowEnoWorks();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ef.clickonHowEnoWorks();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HowEnoWorks:"+compareTwoText);
		}		
	 @Test(priority=9,enabled=true)
		public void verifyOurStoryLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ef.clickonOurStory();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ef.clickonOurStory();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for OurStory:"+compareTwoText);
		}		
	 @Test(priority=10,enabled=true)
		public void verifyLatestCampaignsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ef.clickonlatestCampaigns();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ef.clickonlatestCampaigns();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for LatestCampaigns:"+compareTwoText);
		}		
	 @Test(priority=11,enabled=true)
		public void verifyConnectwithUsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ef.clickonConnectwithUs();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ef.clickonConnectwithUs();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ConnectwithUs:"+compareTwoText);
		}		
	 @Test(priority=12,enabled=true)
		public void verifyContactUsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ef.clickonContactUs();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ef.clickonContactUs();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ContactUs:"+compareTwoText);
		}		
	 @Test(priority=12,enabled=true)
		public void verifyFAQLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ef.clickonFAQ();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ef.clickonFAQ();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for FAQ:"+compareTwoText);
		}		
	 @Test(priority=13,enabled=true)
		public void verifyWhereToBuyLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ef.clickonWhereToBuy();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ef.clickonWhereToBuy();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Wheretobuy:"+compareTwoText);
		}		
	 @Test(priority=14,enabled=true)
		public void verifyCookiePolicyLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ef.clickonCookiePolicy();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ef.clickonCookiePolicy();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for CookiePolicy:"+compareTwoText);
		}		
	 @Test(priority=15,enabled=true)
		public void verifySiteMapLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ef.clickonSiteMap();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        ef.clickonSiteMap();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for SiteMap:"+compareTwoText);
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
