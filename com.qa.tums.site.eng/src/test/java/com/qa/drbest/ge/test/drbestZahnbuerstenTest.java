package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.drbestZahnbuerstenPage;

public class drbestZahnbuerstenTest extends BaseClass{
	
	drbestZahnbuerstenPage dz;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("drbest_deConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 dz=new drbestZahnbuerstenPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("drbest_deConfig.properties").getProperty("preProddrbestZahnbuerstenUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("drbest_deConfig.properties").getProperty("LivedrbestZahnbuerstenUrl"));
		 }	
	 @Test(priority=0,enabled=true)
		public void verifydrbestcookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        dz.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        dz.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Live Url");
		}							
//	 @Test(priority=1,enabled=true)
//		public void verifyVibrationmultiexpertLink() throws Throwable
//		{
//		 switchingTab(firstTab);
//	        dz.clickonVibrationmultiexpert();
//	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
//	        switchingTab(secondTab);
//	        dz.clickonVibrationmultiexpert();
//	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
//	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//	        System.out.println("Preprod URL and Live URL are same for Vibration multi Expert:"+compareTwoText);
//		}		
	 @Test(priority=2,enabled=true)
		public void verifyCheckbox1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dz.clickonCheckbox1();
	        System.out.println("Erwachsene is Verified successfully on Preprod Url");
	        switchingTab(secondTab);
	        dz.clickonCheckbox1();
	       System.out.println("Erwachsene is Verified successfully on Live Url");
		}		
	 @Test(priority=3,enabled=true)
		public void verifyCheckbox2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dz.clickonCheckbox2();
	        System.out.println("Zungenreiniger is Verified successfully on Preprod Url");
	        switchingTab(secondTab);
	        dz.clickonCheckbox2();
	       System.out.println("Zungenreiniger is Verified successfully on Live Url");
		}		
	 @Test(priority=4,enabled=true)
		public void verifyCheckbox3Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dz.clickonCheckbox3();
	        System.out.println("Kurzkopf is Verified successfully on Preprod Url");
	        switchingTab(secondTab);
	        dz.clickonCheckbox3();
	       System.out.println("Kurzkopf is Verified successfully on Live Url");
		}		
	 @Test(priority=5,enabled=true)
		public void verifyCheckbox4Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dz.clickonCheckbox4();
	        System.out.println("Zahnzwischenräume is Verified successfully on Preprod Url");
	        switchingTab(secondTab);
	        dz.clickonCheckbox4();
	       System.out.println("Zahnzwischenräume is Verified successfully on Live Url");
		}		
	 @Test(priority=6,enabled=true)
		public void verifyCheckbox5Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dz.clickonCheckbox5();
	        System.out.println("Zungenreinigung is Verified successfully on Preprod Url");
	        switchingTab(secondTab);
	        dz.clickonCheckbox5();
	       System.out.println("Zungenreinigung is Verified successfully on Live Url");
		}		
	 @Test(priority=7,enabled=true)
		public void verifyCheckbox6Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dz.clickonCheckbox6();
	        System.out.println("Kinder is Verified successfully on Preprod Url");
	        switchingTab(secondTab);
	        dz.clickonCheckbox6();
	       System.out.println("Kinder is Verified successfully on Live Url");
		}		
	 @Test(priority=8,enabled=true)
		public void verifyCheckbox7Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dz.clickonCheckbox7();
	        System.out.println("Multifunktionsborsten is Verified successfully on Preprod Url");
	        switchingTab(secondTab);
	        dz.clickonCheckbox7();
	       System.out.println("Multifunktionsborsten is Verified successfully on Live Url");
		}		
	 @Test(priority=9,enabled=true)
		public void verifyCheckbox8Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dz.clickonCheckbox8();
	        System.out.println("Vibration is Verified successfully on Preprod Url");
	        switchingTab(secondTab);
	        dz.clickonCheckbox8();
	       System.out.println("Vibration is Verified successfully on Live Url");
		}		
	 @Test(priority=10,enabled=true)
		public void verifyCheckbox9Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dz.clickonCheckbox9();
	        System.out.println("Nachhaltige Zahnpflege  is Verified successfully on Preprod Url");
	        switchingTab(secondTab);
	        dz.clickonCheckbox9();
	       System.out.println("Nachhaltige Zahnpflege  is Verified successfully on Live Url");
		}		
	 @Test(priority=11,enabled=true)
		public void verifyCheckbox10Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dz.clickonCheckbox10();
	        System.out.println("Zahnverfärbung Enfernung  is Verified successfully on Preprod Url");
	        switchingTab(secondTab);
	        dz.clickonCheckbox10();
	       System.out.println("Zahnverfärbung Enfernung  is Verified successfully on Live Url");
		}		
	 @Test(priority=12,enabled=true)
		public void verifyCheckbox11Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dz.clickonCheckbox11();
	        System.out.println("Wellenprofil is Verified successfully on Preprod Url");
	        switchingTab(secondTab);
	        dz.clickonCheckbox11();
	       System.out.println("Wellenprofil is Verified successfully on Live Url");
		}		
	 @Test(priority=13,enabled=true)
		public void verifyCheckbox12Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dz.clickonCheckbox12();
	        System.out.println("Hoch-Tief is Verified successfully on Preprod Url");
	        switchingTab(secondTab);
	        dz.clickonCheckbox12();
	       System.out.println("Hoch-Tief is Verified successfully on Live Url");
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
