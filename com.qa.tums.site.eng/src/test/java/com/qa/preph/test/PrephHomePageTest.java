package com.qa.preph.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.preph.pages.PrephHomePage;

public class PrephHomePageTest extends BaseClass{
	
	PrephHomePage ph;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("preph_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 ph=new PrephHomePage();
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
		public void verifyCarousel1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonCarousel();
	       
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ph.clickonCarousel();
	       
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Carousel:"+compareTwoText);
		}											
	 @Test(priority=2,enabled=true)
		public void verifyCarousel2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonCarouse2();
	       
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ph.clickonCarouse2();
	       
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Carouse2:"+compareTwoText);
		}											
	 @Test(priority=3,enabled=true)
		public void verifyCarousel3Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonCarouse3();
	       
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ph.clickonCarouse3();
	       
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Carouse3:"+compareTwoText);
		}								
	 @Test(priority=4,enabled=true)
		public void verifyGetReliefLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonGetRelief();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ph.clickonGetRelief();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for GetRelief:"+compareTwoText);
		}							
	 @Test(priority=5,enabled=true)
		public void verifySeeAllProductsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonSeeAllProducts();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ph.clickonSeeAllProducts();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for seeallproducts:"+compareTwoText);
		}							
	 @Test(priority=6,enabled=true)
		public void verifyCarouselBanner1ArrowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonBannerCarouselarrow();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ph.clickonBannerCarouselarrow();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Carousel Banner Arrow1:"+compareTwoText);
		}							
	 @Test(priority=7,enabled=true)
		public void verifyMedicatedWipesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonMedicatedWipes();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ph.clickonMedicatedWipes();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Medicated Wipes1:"+compareTwoText);
		}							
	 @Test(priority=8,enabled=true)
		public void verifyRapidReliefCreameLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonRapidReliefCreame();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ph.clickonRapidReliefCreame();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Rapid Relief Creame1:"+compareTwoText);
		}							
	 @Test(priority=9,enabled=true)
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
	 @Test(priority=10,enabled=true)
		public void verifyMultiSymptomsCreameLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonMultisymptomsCreame();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ph.clickonMultisymptomsCreame();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Multi Symptoms Creame:"+compareTwoText);
		}							
	 @Test(priority=11,enabled=true)
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
	 @Test(priority=12,enabled=true)
		public void verifyMedicatedWipes1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonMedicatedWipes1();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ph.clickonMedicatedWipes1();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for MedicatedWipes1:"+compareTwoText);
		}							
	 @Test(priority=13,enabled=true)
		public void verifyRapidReliefSprayLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonRapidReliefSpray();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ph.clickonRapidReliefSpray();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for RapidReliefspray:"+compareTwoText);
		}							
	 @Test(priority=14,enabled=true)
		public void verifyMultisymptomscreameLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonMultiSymptomscreame();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ph.clickonMultiSymptomscreame();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for MultiSymptoms Creame:"+compareTwoText);
		}							
	 @Test(priority=15,enabled=true)
		public void verifyCoolingGelLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonCoolinggel();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ph.clickonCoolinggel();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cooling gel:"+compareTwoText);
		}						
	 @Test(priority=16,enabled=true)
		public void verifyTotable1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonTotable1();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ph.clickonTotable1();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Totable1:"+compareTwoText);
		}				
	 @Test(priority=17,enabled=true)
		public void verifyReadArticleLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonReadArticle();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ph.clickonReadArticle();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ReadArticle:"+compareTwoText);
		}				
	 @Test(priority=18,enabled=true)
		public void verifyWatchVideosLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonwatchvideos();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ph.clickonwatchvideos();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for watch videos:"+compareTwoText);
		}				
	 @Test(priority=19,enabled=true)
		public void verifygetcomfovideoLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonGetcomforvideo();
	        System.out.println("YouTube is verifeied on preprod Url");
	        switchingTab(secondTab);
	        ph.clickonGetcomforvideo();
	        System.out.println("YouTube is Verified on Live Url");
		}				
	 @Test(priority=20,enabled=true)
		public void verifysignupFormLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ph.clickonSignupform();
	       System.out.println("Verified SignUp Feilds on PreProd Url");
	        switchingTab(secondTab);
	        ph.clickonSignupform();
	        System.out.println("Verified SignUp Feilds on Live Url");
		}								
	
	
	
	
	
	
	
	
	
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
