package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.drbestKinderZahnentwicklungPage;

public class drbestKinderZahnentwicklungTest extends BaseClass{
	
	drbestKinderZahnentwicklungPage dk;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("drbest_deConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 dk=new drbestKinderZahnentwicklungPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("drbest_deConfig.properties").getProperty("preProddrbeskinderzahnentwicklungUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("drbest_deConfig.properties").getProperty("LivedrbeskinderzahnentwicklungUrl"));
		 }	
	 @Test(priority=0,enabled=true)
		public void verifydrbestcookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        dk.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        dk.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Live Url");
		}							
	 @Test(priority=1,enabled=true)
		public void verifySliderText1Link() throws Throwable
		{
			switchingTab(firstTab);
	        dk.ClickonSliderText1();
	        System.out.println("Verify Slider1 is Displayed  on Preprod Url");
	        switchingTab(secondTab);
	        dk.ClickonSliderText1();
	        System.out.println("Verify Slider1 is Displayed on Live Url");
		}				
	 @Test(priority=2,enabled=true)
		public void verifyTextClick1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonSliderText2();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonSliderText2();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Slidertext2:"+compareTwoText);
		}		
	 @Test(priority=3,enabled=true)
		public void verifySliderText3Link() throws Throwable
		{
			switchingTab(firstTab);
	        dk.ClickonSliderText3();
	        System.out.println("Verify Slider3 is Displayed  on Preprod Url");
	        switchingTab(secondTab);
	        dk.ClickonSliderText3();
	        System.out.println("Verify Slider3 is Displayed on Live Url");
		}		
	 @Test(priority=4,enabled=true)
		public void verifyErsteZahneLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonErsteZahne();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonErsteZahne();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ErsteZahne:"+compareTwoText);
		}		
	 @Test(priority=5,enabled=true)
		public void verifyErsteZahneProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonErsteZahneProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonErsteZahneProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ErsteZahneproduct:"+compareTwoText);
		}		
	 @Test(priority=6,enabled=true)
		public void verifyErsteZahneBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonErsteZahneBuyNow();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonErsteZahneBuyNow();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ErsteZahneBuyNow:"+compareTwoText);
		}		
	 @Test(priority=7,enabled=true)
		public void verifyMilchzahnLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonMilchzahn();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonMilchzahn();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Milchzahn:"+compareTwoText);
		}		
	 @Test(priority=8,enabled=true)
		public void verifyMilchzahnProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonMilchzahnProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonMilchzahnProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for MilchzahnProduct:"+compareTwoText);
		}		
	 @Test(priority=9,enabled=true)
		public void verifyMilchzahnBuYNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonMilchzahnBuyNow();
	       System.out.println("MilchzahnBuYNow is Displayed on PreProd Url");
	        switchingTab(secondTab);
	        dk.ClickonMilchzahnBuyNow();
	        System.out.println("MilchzahnBuYNow is Displayed on Live Url");
		}		
	 @Test(priority=10,enabled=true)
		public void verifyJuniorZahnLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonJuniorZahn();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonJuniorZahn();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for JuniorZahn:"+compareTwoText);
		}		
	 @Test(priority=11,enabled=true)
		public void verifyJuniorZahnProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonJuniorZahnProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonJuniorZahnProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for JuniorZahnProduct:"+compareTwoText);
		}		
	 @Test(priority=12,enabled=true)
		public void verifyJuniorZahnBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonJuniorZahnBuyNow();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonJuniorZahnBuyNow();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for JuniorZahnBuyNow:"+compareTwoText);
		}		
	 @Test(priority=13,enabled=true)
		public void verifyVibrationJuniorZahnLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonVibrationJuniorZahn();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonVibrationJuniorZahn();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for VibrationJuniorZahn:"+compareTwoText);
		}		
	 @Test(priority=14,enabled=true)
		public void verifyVibrationJuniorZahnProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonVibrationJuniorZahnProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonVibrationJuniorZahnProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for VibrationJuniorZahnProduct:"+compareTwoText);
		}		
	 @Test(priority=15,enabled=true)
		public void verifyVibrationJuniorZahnBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonVibrationJuniorZahnBuyNow();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonVibrationJuniorZahnBuyNow();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for VibrationJuniorZahnBuyNow:"+compareTwoText);
		}		
	 @Test(priority=16,enabled=true)
		public void verifyCoolkidsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonCoolkids();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonCoolkids();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Coolkids:"+compareTwoText);
		}		
	 @Test(priority=17,enabled=true)
		public void verifyCoolkidsProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonCoolkidsProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonCoolkidsProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for CoolkidsProduct:"+compareTwoText);
		}		
	 @Test(priority=18,enabled=true)
		public void verifyCoolkidsBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonCoolkidsBuyNow();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonCoolkidsBuyNow();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for CoolkidsBuyNow:"+compareTwoText);
		}		
	 @Test(priority=19,enabled=true)
		public void verifyZurWebsiteLink() throws Throwable
		{
		 switchingTab(firstTab);
	        
	        String preProdUrl = dk.ClickonZurWebsite();
	        System.out.println(preProdUrl);
	        switchingTab(secondTab);
	       
	        String liveUrl = dk.ClickonZurWebsite();
	        System.out.println(liveUrl);
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ZurWebsite:"+compareTwoText);
		}	
	 @Test(priority=20,enabled=true)
		public void verifyArticle1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonArticle1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonArticle1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Article1:"+compareTwoText);
		}		
	 @Test(priority=21,enabled=true)
		public void verifyLink1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonLink1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonLink1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Link1:"+compareTwoText);
		}		
	 @Test(priority=22,enabled=true)
		public void verifyArticle2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonArticle2();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonArticle2();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Article2:"+compareTwoText);
		}		
	 @Test(priority=23,enabled=true)
		public void verifyLink2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonLink2();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonLink2();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Link2:"+compareTwoText);
		}		
	 @Test(priority=24,enabled=true)
		public void verifyArticle3Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonArticle3();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonArticle3();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Article3:"+compareTwoText);
		}		
	 @Test(priority=25,enabled=true)
		public void verifyLink3Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonLink3();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonLink3();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Link3:"+compareTwoText);
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	

}
