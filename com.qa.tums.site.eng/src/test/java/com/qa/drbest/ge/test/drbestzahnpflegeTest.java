package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.drbestzahnpflegePage;

public class drbestzahnpflegeTest extends BaseClass{
	
	drbestzahnpflegePage dg;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("drbest_deConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 dg=new drbestzahnpflegePage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("drbest_deConfig.properties").getProperty("preProddrbestzahnpflegeUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("drbest_deConfig.properties").getProperty("LivedrbestzahnpflegeUrl"));
		 }	
	 @Test(priority=0,enabled=true)
		public void verifydrbestcookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        dg.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        dg.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Live Url");
		}	
	 @Test(priority=1,enabled=true)
		public void verifyQuiz1Link() throws Throwable
		{
			switchingTab(firstTab);
	        dg.clickonQuiz1();
	        System.out.println("Verify drbest Quiz on Preprod Url");
	        switchingTab(secondTab);
	        dg.clickonQuiz1();
	        System.out.println("Verify drbest Quiz on Live Url");
		}				
	 @Test(priority=2,enabled=true)
		public void verifyQuiz2Link() throws Throwable
		{
			switchingTab(firstTab);
	        dg.clickonQuiz2();
	        System.out.println("Verify drbest Quiz2 on Preprod Url");
	        switchingTab(secondTab);
	        dg.clickonQuiz2();
	        System.out.println("Verify drbest Quiz2 on Live Url");
		}				
	 @Test(priority=3,enabled=true)
		public void verifyQuiz3Link() throws Throwable
		{
			switchingTab(firstTab);
	        dg.clickonQuiz3();
	        System.out.println("Verify drbest Quiz3 on Preprod Url");
	        switchingTab(secondTab);
	        dg.clickonQuiz3();
	        System.out.println("Verify drbest Quiz3 on Live Url");
		}				
	 @Test(priority=4,enabled=true)
		public void verifyQuiz4Link() throws Throwable
		{
			switchingTab(firstTab);
	        dg.clickonQuiz4();
	        System.out.println("Verify drbest Quiz4 on Preprod Url");
	        switchingTab(secondTab);
	        dg.clickonQuiz4();
	        System.out.println("Verify drbest Quiz4 on Live Url");
		}				
	 @Test(priority=5,enabled=true)
		public void verifyQuiz5Link() throws Throwable
		{
			switchingTab(firstTab);
	        dg.clickonQuiz5();
	        System.out.println("Verify drbest Quiz5 on Preprod Url");
	        switchingTab(secondTab);
	        dg.clickonQuiz5();
	        System.out.println("Verify drbest Quiz5 on Live Url");
		}				
	 @Test(priority=6,enabled=true)
		public void verifyQuiz6Link() throws Throwable
		{
			switchingTab(firstTab);
	        dg.clickonQuiz6();
	        System.out.println("Verify drbest Quiz5 on Preprod Url");
	        switchingTab(secondTab);
	        dg.clickonQuiz6();
	        System.out.println("Verify drbest Quiz5 on Live Url");
		}
	 @Test(priority=7,enabled=true)
		public void verifyQuiz7Link() throws Throwable
		{
			switchingTab(firstTab);
	        dg.clickonQuiz7();
	        System.out.println("Verify drbest Quiz7 on Preprod Url");
	        switchingTab(secondTab);
	        dg.clickonQuiz7();
	        System.out.println("Verify drbest Quiz7 on Live Url");
		}	
	 @Test(priority=8,enabled=true)
		public void verifyQuiz8Link() throws Throwable
		{
			switchingTab(firstTab);
	        dg.clickonQuiz8();
	        System.out.println("Verify drbest Quiz8 on Preprod Url");
	        switchingTab(secondTab);
	        dg.clickonQuiz8();
	        System.out.println("Verify drbest Quiz8 on Live Url");
		}			
	 @Test(priority=9,enabled=true)
		public void verifyDiegangLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickonDiegang();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.clickonDiegang();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Diegang:"+compareTwoText);
		}		
	 @Test(priority=10,enabled=true)
		public void verifyDiegang1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickonDiegang1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.clickonDiegang1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Diegang1:"+compareTwoText);
		}		
	 @Test(priority=11,enabled=true)
		public void verifyHilfsmittelLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickonHilfsmittel();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.clickonHilfsmittel();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Hilfsmittel:"+compareTwoText);
		}		
	 @Test(priority=12,enabled=true)
		public void verifyHilfsmittel1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickonHilfsmittel1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.clickonHilfsmittel1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Hilfsmittel1:"+compareTwoText);
		}		
	 @Test(priority=13,enabled=true)
		public void verifyParodontotisLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickonParodontis();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.clickonParodontis();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Parodontotis:"+compareTwoText);
		}		
	 @Test(priority=14,enabled=true)
		public void verifyParodontotis1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickonParodontis1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.clickonParodontis1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Parodontotis1:"+compareTwoText);
		}		
	 @Test(priority=15,enabled=true)
		public void verifyZahneLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickonZahne();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.clickonZahne();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Zahne:"+compareTwoText);
		}		
	 @Test(priority=16,enabled=true)
		public void verifyZahne1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickonZahne1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.clickonZahne1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Zahne1:"+compareTwoText);
		}		
	 @Test(priority=17,enabled=true)
		public void verifyKinderLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickonKindern();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.clickonKindern();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Kinder:"+compareTwoText);
		}		
	 @Test(priority=18,enabled=true)
		public void verifyKinder1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickonKindern1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.clickonKindern1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Kinder1:"+compareTwoText);
		}		
	 @Test(priority=19,enabled=true)
		public void verifyfestsitzendenLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickonfestsitzenden();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.clickonfestsitzenden();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for festsitzenden:"+compareTwoText);
		}		
	 @Test(priority=20,enabled=true)
		public void verifyfestsitzenden1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickonfestsitzenden1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.clickonfestsitzenden1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for festsitzenden1:"+compareTwoText);
		}		
	 @Test(priority=21,enabled=true)
		public void verifyStichwortLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickonStichwort();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.clickonStichwort();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Stichwort:"+compareTwoText);
		}		
	 @Test(priority=22,enabled=true)
		public void verifyStichwort1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickonStichwort1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.clickonStichwort1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Stichwort1:"+compareTwoText);
		}		
	 @Test(priority=23,enabled=true)
		public void verifygebissentwicklungLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickongebissentwicklung();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.clickongebissentwicklung();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for gebissentwicklung:"+compareTwoText);
		}		
	 @Test(priority=24,enabled=true)
		public void verifygebissentwicklung1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickongebissentwicklung();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.clickongebissentwicklung1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for gebissentwicklung1:"+compareTwoText);
		}		
	 @Test(priority=25,enabled=true)
		public void verifykaimethodeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickonkaimethode();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.clickonkaimethode();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for kaimethode:"+compareTwoText);
		}		
	 @Test(priority=26,enabled=true)
		public void verifykaimethode1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickonkaimethode1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.clickonkaimethode1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for kaimethode1:"+compareTwoText);
		}		
	 @Test(priority=27,enabled=true)
		public void verifyMundgerchLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickonMundgeruch();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.clickonMundgeruch();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Mundgerch:"+compareTwoText);
		}		
	 @Test(priority=28,enabled=true)
		public void verifyMundgerch1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickonMundgeruch1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.clickonMundgeruch1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Mundgerch1:"+compareTwoText);
		}		
	 @Test(priority=29,enabled=true)
		public void verifyErnahrungLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickonErnahrung();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.clickonErnahrung();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Ernahrung:"+compareTwoText);
		}		
	 @Test(priority=30,enabled=true)
		public void verifyErnahrung1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickonErnahrung1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.clickonErnahrung1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Ernahrung1:"+compareTwoText);
		}		
	 @Test(priority=31,enabled=true)
		public void verifyKariesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickonKaires();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.clickonKaires();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Karies:"+compareTwoText);
		}		
	 @Test(priority=32,enabled=true)
		public void verifyKaries1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickonKaires1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.clickonKaires1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Karies1:"+compareTwoText);
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
