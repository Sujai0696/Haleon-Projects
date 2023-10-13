package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.drbestempfindlichePage;

public class drbestempfindlicheTest extends BaseClass{
	
	drbestempfindlichePage dp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("drbest_deConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 dp=new drbestempfindlichePage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("drbest_deConfig.properties").getProperty("preProddrbestempfindlicheUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("drbest_deConfig.properties").getProperty("LivedrbestempfindlicheUrl"));
		 }	
	 @Test(priority=0,enabled=true)
		public void verifydrbestcookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        dp.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        dp.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Live Url");
		}										
	 @Test(priority=1,enabled=true)
		public void verifySlide1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dp.ClickonSlide1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dp.ClickonSlide1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Slide1:"+compareTwoText);
		}			
	 @Test(priority=2,enabled=true)
		public void verifySlide2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dp.ClickonSlide2();
	        System.out.println("Element2 is visible on Preprod url");
	        switchingTab(secondTab);
	        dp.ClickonSlide2();
	        System.out.println("Element2 is visible on Live url");
		}			
	 @Test(priority=3,enabled=true)
		public void verifySlide3Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dp.ClickonSlide3();
	        System.out.println("Element3 is visible on Preprod url");
	        switchingTab(secondTab);
	        dp.ClickonSlide3();
	        System.out.println("Element3 is visible on Live url");
		}		
	 @Test(priority=4,enabled=true)
		public void verifySlide4Link() throws Throwable
		{
		 switchingTab(firstTab);
		 	dp.ClickonSlide4();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dp.ClickonSlide4();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Slide4:"+compareTwoText); 
		}		
	 @Test(priority=5,enabled=true)
		public void verifySlide5Link() throws Throwable
		{
		 switchingTab(firstTab);
		 	dp.ClickonSlide5();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dp.ClickonSlide5();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Slide5:"+compareTwoText); 
		}		
	 @Test(priority=6,enabled=true)
		public void verifyPolimedLink() throws Throwable
		{
		 switchingTab(firstTab);
		 	dp.ClickonPolimed();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dp.ClickonPolimed();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Polimed:"+compareTwoText); 
		}		
	 @Test(priority=7,enabled=true)
		public void verifyPolimedProductLink() throws Throwable
		{
		 switchingTab(firstTab);
		 	dp.ClickonPolimedProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dp.ClickonPolimedProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for PolimedProduct:"+compareTwoText); 
		}		
	 @Test(priority=8,enabled=true)
		public void verifyPolimedBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
		 	dp.ClickonPolimedBuyNow();
	        System.out.println("Verified PolimedBuyNow on Preprod url");
	        switchingTab(secondTab);
	        dp.ClickonPolimedBuyNow();
	        System.out.println("Verified PolimedBuyNow on Live url");
		}		
	 @Test(priority=9,enabled=true)
		public void verifyMultiExpertLink() throws Throwable
		{
		 switchingTab(firstTab);
		 	dp.ClickonMultiExpertProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dp.ClickonMultiExpertProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for MultiExpert:"+compareTwoText); 
		}		
	 @Test(priority=10,enabled=true)
		public void verifyMultiExpertBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
		 	dp.ClickonMultiExpertBuyNow();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dp.ClickonMultiExpertBuyNow();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for MultiExpert  BuyNow:"+compareTwoText); 
		}		
	 @Test(priority=11,enabled=true)
		public void verifyArticle1Link() throws Throwable
		{
		 switchingTab(firstTab);
		 	dp.ClickonArticle1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dp.ClickonArticle1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Article1:"+compareTwoText); 
		}		
	 @Test(priority=12,enabled=true)
		public void verifyLink1Link() throws Throwable
		{
		 switchingTab(firstTab);
		 	dp.ClickonLink1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dp.ClickonLink1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Link1:"+compareTwoText); 
		}		
	 @Test(priority=13,enabled=true)
		public void verifyArticle2Link() throws Throwable
		{
		 switchingTab(firstTab);
		 	dp.ClickonArticle2();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dp.ClickonArticle2();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Article2:"+compareTwoText); 
		}		
	 @Test(priority=14,enabled=true)
		public void verifyLink2Link() throws Throwable
		{
		 switchingTab(firstTab);
		 	dp.ClickonLink2();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dp.ClickonLink2();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Link2:"+compareTwoText); 
		}		
	 @Test(priority=15,enabled=true)
		public void verifyArticle3Link() throws Throwable
		{
		 switchingTab(firstTab);
		 	dp.ClickonArticle3();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dp.ClickonArticle3();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Article3:"+compareTwoText); 
		}		
	 @Test(priority=16,enabled=true)
		public void verifyLink3Link() throws Throwable
		{
		 switchingTab(firstTab);
		 	dp.ClickonLink3();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dp.ClickonLink3();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Link3:"+compareTwoText); 
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
