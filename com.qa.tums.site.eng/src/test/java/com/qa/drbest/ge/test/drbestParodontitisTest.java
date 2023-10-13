package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.drbestParodontitisPage;

public class drbestParodontitisTest extends BaseClass{
	
	drbestParodontitisPage dp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("drbest_deConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 dp=new drbestParodontitisPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("drbest_deConfig.properties").getProperty("preProddrbestParodontitisUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("drbest_deConfig.properties").getProperty("LivedrbestParodontitisUrl"));
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
		public void verifyLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dp.ClickonBassTechnik();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dp.ClickonBassTechnik();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for BasTechnik:"+compareTwoText);
		}		
	 @Test(priority=2,enabled=true)
		public void verifySlide1Link() throws Throwable
		{
			switchingTab(firstTab);
	        dp.ClickonSlide1();
	        System.out.println("Verify drbest Slide1 on Preprod Url");
	        switchingTab(secondTab);
	        dp.ClickonSlide1();
	        System.out.println("Verify drbest Slide1 on Live Url");
		}				
	 @Test(priority=3,enabled=true)
		public void verifySlide2Link() throws Throwable
		{
			switchingTab(firstTab);
	        dp.ClickonSlide2();
	        System.out.println("Verify drbest Slide2 on Preprod Url");
	        switchingTab(secondTab);
	        dp.ClickonSlide2();
	        System.out.println("Verify drbest Slide2 on Live Url");
		}				
	 @Test(priority=4,enabled=true)
		public void verifySlide3Link() throws Throwable
		{
			switchingTab(firstTab);
	        dp.ClickonSlide3();
	        System.out.println("Verify drbest Slide3 on Preprod Url");
	        switchingTab(secondTab);
	        dp.ClickonSlide3();
	        System.out.println("Verify drbest Slide3 on Live Url");
		}				
	 @Test(priority=5,enabled=true)
		public void verifySlide4Link() throws Throwable
		{
			switchingTab(firstTab);
	        dp.ClickonSlide4();
	        System.out.println("Verify drbest Slide4 on Preprod Url");
	        switchingTab(secondTab);
	        dp.ClickonSlide4();
	        System.out.println("Verify drbest Slide4 on Live Url");
		}				
	 @Test(priority=6,enabled=true)
		public void verifyInterdentAktivLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dp.ClickonInterdentAktiv();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dp.ClickonInterdentAktiv();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for InterdentAktiv:"+compareTwoText);
		}		
	 @Test(priority=7,enabled=true)
		public void verifyInterdentAktivProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dp.ClickonInterdentAktivProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dp.ClickonInterdentAktivProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for InterdentAktiv Product:"+compareTwoText);
		}		
	 @Test(priority=8,enabled=true)
		public void verifyInterdentAktivBuynowLink() throws Throwable
		{
			switchingTab(firstTab);
	        dp.ClickonInterdentAktivBuyNow();
	        System.out.println("Verify drbest  InterdentAktivBuynow on Preprod Url");
	        switchingTab(secondTab);
	        dp.ClickonInterdentAktivBuyNow();
	        System.out.println("Verify drbest InterdentAktivBuynow on Live Url");
		}			
	 @Test(priority=9,enabled=true)
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
	 @Test(priority=10,enabled=true)
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
	 @Test(priority=11,enabled=true)
		public void verifyPolimedBuynowLink() throws Throwable
		{
			switchingTab(firstTab);
	        dp.ClickonPolimedBuyNow();
	        System.out.println("Verify drbest  Polimed Buynow on Preprod Url");
	        switchingTab(secondTab);
	        dp.ClickonPolimedBuyNow();
	        System.out.println("Verify drbest Polimed Buynow on Live Url");
		}			
	 @Test(priority=12,enabled=true)
		public void verifyMultiExpertProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dp.ClickonMultiExpertProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dp.ClickonMultiExpertProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for MultiExpertProduct:"+compareTwoText);
		}		
	 @Test(priority=13,enabled=true)
		public void verifyMultiExpertBuynowLink() throws Throwable
		{
			switchingTab(firstTab);
	        dp.ClickonMultiExpertBuyNow();
	        System.out.println("Verify drbest  MultExpert  Buynow on Preprod Url");
	        switchingTab(secondTab);
	        dp.ClickonMultiExpertBuyNow();
	        System.out.println("Verify drbest MultiExpert Buynow on Live Url");
		}
	 @Test(priority=14,enabled=true)
		public void verifyQuiz1Link() throws Throwable
		{
			switchingTab(firstTab);
	        dp.clickonQuiz1();
	        System.out.println("Verify drbest Quiz on Preprod Url");
	        switchingTab(secondTab);
	        dp.clickonQuiz1();
	        System.out.println("Verify drbest Quiz on Live Url");
		}				
	 @Test(priority=15,enabled=true)
		public void verifyQuiz2Link() throws Throwable
		{
			switchingTab(firstTab);
	        dp.clickonQuiz2();
	        System.out.println("Verify drbest Quiz2 on Preprod Url");
	        switchingTab(secondTab);
	        dp.clickonQuiz2();
	        System.out.println("Verify drbest Quiz2 on Live Url");
		}				
	 @Test(priority=16,enabled=true)
		public void verifyQuiz3Link() throws Throwable
		{
			switchingTab(firstTab);
	        dp.clickonQuiz3();
	        System.out.println("Verify drbest Quiz3 on Preprod Url");
	        switchingTab(secondTab);
	        dp.clickonQuiz3();
	        System.out.println("Verify drbest Quiz3 on Live Url");
		}				
	 @Test(priority=17,enabled=true)
		public void verifyQuiz4Link() throws Throwable
		{
			switchingTab(firstTab);
	        dp.clickonQuiz4();
	        System.out.println("Verify drbest Quiz4 on Preprod Url");
	        switchingTab(secondTab);
	        dp.clickonQuiz4();
	        System.out.println("Verify drbest Quiz4 on Live Url");
		}				
	 @Test(priority=18,enabled=true)
		public void verifyQuiz5Link() throws Throwable
		{
			switchingTab(firstTab);
	        dp.clickonQuiz5();
	        System.out.println("Verify drbest Quiz5 on Preprod Url");
	        switchingTab(secondTab);
	        dp.clickonQuiz5();
	        System.out.println("Verify drbest Quiz5 on Live Url");
		}				
	 @Test(priority=19,enabled=true)
		public void verifyQuiz6Link() throws Throwable
		{
			switchingTab(firstTab);
	        dp.clickonQuiz6();
	        System.out.println("Verify drbest Quiz5 on Preprod Url");
	        switchingTab(secondTab);
	        dp.clickonQuiz6();
	        System.out.println("Verify drbest Quiz5 on Live Url");
		}
	 @Test(priority=20,enabled=true)
		public void verifyQuiz7Link() throws Throwable
		{
			switchingTab(firstTab);
	        dp.clickonQuiz7();
	        System.out.println("Verify drbest Quiz7 on Preprod Url");
	        switchingTab(secondTab);
	        dp.clickonQuiz7();
	        System.out.println("Verify drbest Quiz7 on Live Url");
		}	
	 @Test(priority=21,enabled=true)
		public void verifyQuiz8Link() throws Throwable
		{
			switchingTab(firstTab);
	        dp.clickonQuiz8();
	        System.out.println("Verify drbest Quiz8 on Preprod Url");
	        switchingTab(secondTab);
	        dp.clickonQuiz8();
	        System.out.println("Verify drbest Quiz8 on Live Url");
		}			
	 @Test(priority=22,enabled=true)
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
	 @Test(priority=23,enabled=true)
		public void verifyRelatedLink1Link() throws Throwable
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
	 @Test(priority=24,enabled=true)
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
	 @Test(priority=25,enabled=true)
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
	 @Test(priority=26,enabled=true)
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
	 @Test(priority=27,enabled=true)
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
