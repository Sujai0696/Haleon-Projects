package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.drbestInterdentalPage;

public class drbestInterdentalTest extends BaseClass{

	drbestInterdentalPage dc;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("drbest_deConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 dc=new drbestInterdentalPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("drbest_deConfig.properties").getProperty("preProddrbestInterdentalUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("drbest_deConfig.properties").getProperty("LivedrbestInterdentalUrl"));
		 }	
	 @Test(priority=0,enabled=true)
		public void verifydrbestcookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        dc.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        dc.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Live Url");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyVerteileLink() throws Throwable
		{
			switchingTab(firstTab);
	        dc.clickonVerteile();
	        System.out.println("Verify Vertile on Preprod Url");
	        switchingTab(secondTab);
	        dc.clickonVerteile();
	        System.out.println("Verify Vertile on Live Url");
		}				
	 @Test(priority=2,enabled=true)
		public void verifyDetailsLink() throws Throwable
		{
			switchingTab(firstTab);
	        dc.clickonDetails();
	        System.out.println("Verify Details on Preprod Url");
	        switchingTab(secondTab);
	        dc.clickonDetails();
	        System.out.println("Verify Details on Live Url");
		}				
	 @Test(priority=3,enabled=true)
		public void verifyMaterialiansLink() throws Throwable
		{
			switchingTab(firstTab);
	        dc.clickonMaterialians();
	        System.out.println("Verify Materialins on Preprod Url");
	        switchingTab(secondTab);
	        dc.clickonMaterialians();
	        System.out.println("Verify Materialins on Live Url");
		}			
	 @Test(priority=4,enabled=true)
		public void verifyTippsLink() throws Throwable
		{
			switchingTab(firstTab);
	        dc.clickonTipps();
	        System.out.println("Verify Tipps on Preprod Url");
	        switchingTab(secondTab);
	        dc.clickonTipps();
	        System.out.println("Verify Tipps on Live Url");
		}			
	 @Test(priority=5,enabled=true)
		public void verifyGrozenLink() throws Throwable
		{
			switchingTab(firstTab);
	        dc.clickonGrozen();
	        System.out.println("Verify Grozen on Preprod Url");
	        switchingTab(secondTab);
	        dc.clickonGrozen();
	        System.out.println("Verify Grozen on Live Url");
		}			
	 @Test(priority=6,enabled=true)
		public void verifyBuyNowBtnLink() throws Throwable
		{
			switchingTab(firstTab);
	        dc.clickonBuyNowBtn();
	        System.out.println("Verify BuyNow Btn on Preprod Url");
	        switchingTab(secondTab);
	        dc.clickonBuyNowBtn();
	        System.out.println("Verify BuyNow Btn on Live Url");
		}			
	 @Test(priority=7,enabled=true)
		public void verifyWarumLink() throws Throwable
		{
			switchingTab(firstTab);
	        dc.clickonWarum();
	        System.out.println("Verify WarumBtn  is Successfully on Preprod Url");
	        switchingTab(secondTab);
	        dc.clickonWarum();
	        System.out.println("Verify  WarumBtn  is Successfully on Live Url");
		}	
	 @Test(priority=8,enabled=true)
		public void verifyWiefindeLink() throws Throwable
		{
			switchingTab(firstTab);
	        dc.clickonWiefinde();
	        System.out.println("Verify Wiefinde  is Successfully on Preprod Url");
	        switchingTab(secondTab);
	        dc.clickonWiefinde();
	        System.out.println("Verify  Wiefinde  is Successfully on Live Url");
		}	
	 @Test(priority=9,enabled=true)
		public void verifyKannichLink() throws Throwable
		{
			switchingTab(firstTab);
	        dc.clickonKannich();
	        System.out.println("Verify Kannich  is Successfully on Preprod Url");
	        switchingTab(secondTab);
	        dc.clickonKannich();
	        System.out.println("Verify  Kannich is Successfully on Live Url");
		}	
	 @Test(priority=10,enabled=true)
		public void verifyWieLink() throws Throwable
		{
			switchingTab(firstTab);
	        dc.clickonWie();
	        System.out.println("Verify Wie  is Successfully on Preprod Url");
	        switchingTab(secondTab);
	        dc.clickonWie();
	        System.out.println("Verify  Wie is Successfully on Live Url");
		}	
	 @Test(priority=11,enabled=true)
		public void verifyWastunLink() throws Throwable
		{
			switchingTab(firstTab);
	        dc.clickonWastun();
	        System.out.println("Verify Wastun  is Successfully on Preprod Url");
	        switchingTab(secondTab);
	        dc.clickonWastun();
	        System.out.println("Verify  Wastun is Successfully on Live Url");
		}	
	 @Test(priority=12,enabled=true)
		public void verifyWastun1Link() throws Throwable
		{
			switchingTab(firstTab);
	        dc.clickonWastun1();
	        System.out.println("Verify Wastun1  is Successfully on Preprod Url");
	        switchingTab(secondTab);
	        dc.clickonWastun1();
	        System.out.println("Verify  Wastun1 is Successfully on Live Url");
		}
	 @Test(priority=13,enabled=true)
		public void verifyVerwendetLink() throws Throwable
		{
			switchingTab(firstTab);
	        dc.clickonVerwandat();
	        System.out.println("Verify Verwendet  is Successfully on Preprod Url");
	        switchingTab(secondTab);
	        dc.clickonVerwandat();
	        System.out.println("Verify  Verwendet is Successfully on Live Url");
		}	
	 @Test(priority=14,enabled=true)
		public void verifyWielangeLink() throws Throwable
		{
			switchingTab(firstTab);
	        dc.clickonWielange();
	        System.out.println("Verify Wielange  is Successfully on Preprod Url");
	        switchingTab(secondTab);
	        dc.clickonWielange();
	        System.out.println("Verify  Wielange is Successfully on Live Url");
		}	
	 @Test(priority=15,enabled=true)
		public void verifyWiewendeLink() throws Throwable
		{
			switchingTab(firstTab);
	        dc.clickonWiewende();
	        System.out.println("Verify Wiewende  is Successfully on Preprod Url");
	        switchingTab(secondTab);
	        dc.clickonWiewende();
	        System.out.println("Verify  Wiewende is Successfully on Live Url");
		}	
	 @Test(priority=16,enabled=true)
		public void verifyWieBruckeLink() throws Throwable
		{
			switchingTab(firstTab);
	        dc.clickonWieBrucke();
	        System.out.println("Verify WieBrucke  is Successfully on Preprod Url");
	        switchingTab(secondTab);
	        dc.clickonWieBrucke();
	        System.out.println("Verify  WieBrucke is Successfully on Live Url");
		}	
	 @Test(priority=17,enabled=true)
		public void verifyWieImplantateLink() throws Throwable
		{
			switchingTab(firstTab);
	        dc.clickonWieImplantat();
	        System.out.println("Verify WieImplantat is Successfully on Preprod Url");
	        switchingTab(secondTab);
	        dc.clickonWieImplantat();
	        System.out.println("Verify  WieImplantat is Successfully on Live Url");
		}	
	 @Test(priority=18,enabled=true)
		public void verifyGreenCleanLink() throws Throwable
		{
			switchingTab(firstTab);
	        dc.clickonGreenClean();
	        System.out.println("Verify GreenClean is Successfully on Preprod Url");
	        switchingTab(secondTab);
	        dc.clickonGreenClean();
	        System.out.println("Verify  GreenClean is Successfully on Live Url");
		}	
	 @Test(priority=19,enabled=true)
		public void verifyNachwachsendenLink() throws Throwable
		{
			switchingTab(firstTab);
	        dc.clickonNachwachsenden();
	        System.out.println("Verify Nachwachsenden is Successfully on Preprod Url");
	        switchingTab(secondTab);
	        dc.clickonNachwachsenden();
	        System.out.println("Verify  Nachwachsenden is Successfully on Live Url");
		}	
	 @Test(priority=20,enabled=true)
		public void verifyGreenCleanInterdentalLink() throws Throwable
		{
			switchingTab(firstTab);
	        dc.clickonGreenCleanInterdental();
	        System.out.println("Verify GreenCleanInterdental is Successfully on Preprod Url");
	        switchingTab(secondTab);
	        dc.clickonGreenCleanInterdental();
	        System.out.println("Verify  GreenCleanInterdental is Successfully on Live Url");
		}	
	 @Test(priority=21,enabled=true)
		public void verifyWorausbesteLink() throws Throwable
		{
			switchingTab(firstTab);
	        dc.clickonWorausbeste();
	        System.out.println("Verify Worausbeste is Successfully on Preprod Url");
	        switchingTab(secondTab);
	        dc.clickonWorausbeste();
	        System.out.println("Verify  Worausbeste is Successfully on Live Url");
		}	
	 @Test(priority=22,enabled=true)
		public void verifyWasbedutetLink() throws Throwable
		{
			switchingTab(firstTab);
	        dc.clickonWasbedutet();
	        System.out.println("Verify Wasbedutet is Successfully on Preprod Url");
	        switchingTab(secondTab);
	        dc.clickonWasbedutet();
	        System.out.println("Verify Wasbedutet is Successfully on Live Url");
		}	
	 @Test(priority=23,enabled=true)
		public void verifyBuyNow1Link() throws Throwable
		{
			switchingTab(firstTab);
	        dc.clickonBuyNow1();
	        System.out.println("Verify BuyNow1 is Successfully on Preprod Url");
	        switchingTab(secondTab);
	        dc.clickonBuyNow1();
	        System.out.println("Verify BuyNow1 is Successfully on Live Url");
		}	
	 @Test(priority=24,enabled=true)
		public void verifyWeitree1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dc.clickonWeitree();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dc.clickonWeitree();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Weitree:"+compareTwoText);
		}		
	 @Test(priority=25,enabled=true)
		public void verifyBuyNow2Link() throws Throwable
		{
			switchingTab(firstTab);
	        dc.clickonBuyNow2();
	        System.out.println("Verify BuyNow2 is Successfully on Preprod Url");
	        switchingTab(secondTab);
	        dc.clickonBuyNow2();
	        System.out.println("Verify BuyNow2 is Successfully on Live Url");
		}	
	 @Test(priority=25,enabled=true)
		public void verifyWeitree2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dc.clickonWeitree2();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dc.clickonWeitree2();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Weitree2:"+compareTwoText);
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
