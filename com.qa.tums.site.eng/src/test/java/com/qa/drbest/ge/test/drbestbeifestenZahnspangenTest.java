package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.drbestbeifestenZahnspangenPage;

public class drbestbeifestenZahnspangenTest extends BaseClass{
	
	drbestbeifestenZahnspangenPage dk;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("drbest_deConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 dk=new drbestbeifestenZahnspangenPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("drbest_deConfig.properties").getProperty("preProddrbesbeifestenZahnspangenUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("drbest_deConfig.properties").getProperty("LivedrbesbeifestenZahnspangenUrl"));
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
		public void verifyPolimedKurzkopfLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonPolimedKurzkopf();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonPolimedKurzkopf();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for PolimedKurzkopf:"+compareTwoText);
		}		
	 @Test(priority=2,enabled=true)
		public void verifyPolimedKurzkopfProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonPolimedKurzkopfProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonPolimedKurzkopfProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for PolimedKurzkopf product:"+compareTwoText);
		}		
	 @Test(priority=3,enabled=true)
		public void verifyPolimedKurzkopfBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonPolimedKurzkopfBuyNow();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonPolimedKurzkopfBuyNow();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for PolimedKurzkopf BuyNow:"+compareTwoText);
		}		
	 @Test(priority=4,enabled=true)
		public void verifyMultiExpertProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonMultiExpertProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonMultiExpertProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for MultiExpert Product:"+compareTwoText);
		}		
	 @Test(priority=5,enabled=true)
		public void verifyMultiExpertBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonMultiExpertBuyNow();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonMultiExpertBuyNow();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for MultiExpert BuyNow:"+compareTwoText);
		}		
	 @Test(priority=6,enabled=true)
		public void verifyCoolkidsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonCoolKids();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonCoolKids();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for CoolKids:"+compareTwoText);
		}		
	 @Test(priority=7,enabled=true)
		public void verifyCoolkidsProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonCoolKidsProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonCoolKidsProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for CoolKids Product:"+compareTwoText);
		}		
	 @Test(priority=8,enabled=true)
		public void verifyCoolkidsBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonCoolKidsBuyNow();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonCoolKidsBuyNow();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for CoolKidsBuyNow:"+compareTwoText);
		}		
	
//	 @Test(priority=9,enabled=true)
//		public void verifyZurWebsiteLink() throws Throwable
//		{
//		 switchingTab(firstTab);
//	        dk.ClickonZurWebsite();
//	        String preProdUrl = dk.ClickonZurWebsite();
//	        System.out.println(preProdUrl);
//	        switchingTab(secondTab);
//	        
//	        String liveUrl = dk.ClickonZurWebsite();
//	        System.out.println(liveUrl);
//	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//	        System.out.println("Preprod URL and Live URL are same for ZurWebsite:"+compareTwoText);
//		}		
	 @Test(priority=9,enabled=true)
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
	 @Test(priority=10,enabled=true)
		public void verifyRelatedLink1Link() throws Throwable
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
	 @Test(priority=11,enabled=true)
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
	 @Test(priority=12,enabled=true)
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
	 @Test(priority=13,enabled=true)
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
	
	 @Test(priority=14,enabled=true)
		public void verifyLink3Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonLink3();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonLink3();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Link3"+compareTwoText);
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
