package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.drbestSitemapPage;

public class drbestSitemapTest extends BaseClass{
	
	drbestSitemapPage dk;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("drbest_deConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 dk=new drbestSitemapPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("drbest_deConfig.properties").getProperty("preProddrbestSiteMapUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("drbest_deConfig.properties").getProperty("LivedrbestSiteMapUrl"));
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
		public void verifyOrginalLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonOriginal();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonOriginal();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Original:"+compareTwoText);
		}		
	 @Test(priority=2,enabled=true)
		public void verifyHochTiefLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonHochTief();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonHochTief();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Hochthief:"+compareTwoText);
		}		
	 @Test(priority=3,enabled=true)
		public void verifySchwingkopfLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonSchwingkopf();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonSchwingkopf();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Schwingkopf:"+compareTwoText);
		}		
	 @Test(priority=4,enabled=true)
		public void verifyInterdentAktivLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonInterdentAktiv();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonInterdentAktiv();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for InterdentAktiv:"+compareTwoText);
		}		
	 @Test(priority=5,enabled=true)
		public void verifyZwishenzahnLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonZwishzahn();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonZwishzahn();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Zwishenzahn:"+compareTwoText);
		}		
	 @Test(priority=6,enabled=true)
		public void verifyXZwishenzahnLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonXZwishzahn();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonXZwishzahn();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for XZwishenzahn:"+compareTwoText);
		}		
	 @Test(priority=7,enabled=true)
		public void verifyNaturlichWeiLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonNaturlichWei();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonNaturlichWei();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for NaturlichWei:"+compareTwoText);
		}		
	 @Test(priority=8,enabled=true)
		public void verifyPolimedLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonPolimed();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonPolimed();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Polimed:"+compareTwoText);
		}		
	 @Test(priority=9,enabled=true)
		public void verifyPolimedKurzkopfLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonPolimedKurzkopf();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonPolimedKurzkopf();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Polimedkurzkopf:"+compareTwoText);
		}		
	 @Test(priority=10,enabled=true)
		public void verifyVibrationPolimedLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonVibrationPolimed();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonVibrationPolimed();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Vibration Polimed:"+compareTwoText);
		}		
	 @Test(priority=11,enabled=true)
		public void verifyVibrationMultiExpertLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonVibrationMultiExpert();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonVibrationMultiExpert();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Vibration MultiExpert:"+compareTwoText);
		}		
	 @Test(priority=12,enabled=true)
		public void verifyVibrationJuniorZahnLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonVibrationJuniorzahn();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonVibrationJuniorzahn();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Vibration JuniorZahn:"+compareTwoText);
		}		
	 @Test(priority=13,enabled=true)
		public void verifyVibrationAtemfrischLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonVibrationAtemfrisch();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonVibrationAtemfrisch();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Vibration Atemfrisch:"+compareTwoText);
		}		
	 @Test(priority=14,enabled=true)
		public void verifyBambusIntedentKIDSLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonBambusInterdentKIDS();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonBambusInterdentKIDS();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for BambusInterdentKIDS:"+compareTwoText);
		}		
	 @Test(priority=15,enabled=true)
		public void verifyBambusIntedentLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonBambusInterdent();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonBambusInterdent();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for BambusInterdent:"+compareTwoText);
		}		
	 @Test(priority=16,enabled=true)
		public void verifyGreenCleanLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonGreenClean();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonGreenClean();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for GreenClean:"+compareTwoText);
		}		
	 @Test(priority=17,enabled=true)
		public void verifyInterdentalburstenLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonInterdentalbursten();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonInterdentalbursten();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Interdentalbursten:"+compareTwoText);
		}		
	 @Test(priority=18,enabled=true)
		public void verifyGreenSensitiveLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonGreenSensitive();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonGreenSensitive();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Greensensitive:"+compareTwoText);
		}		
	 @Test(priority=19,enabled=true)
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
	 @Test(priority=20,enabled=true)
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
	 @Test(priority=21,enabled=true)
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
	 @Test(priority=22,enabled=true)
		public void verifyCoolKidsLink() throws Throwable
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
	 @Test(priority=23,enabled=true)
		public void verifyPawPatrolLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonPawpatrol();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonPawpatrol();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Pawpatrol:"+compareTwoText);
		}		
	 @Test(priority=24,enabled=true)
		public void verifyWieoftLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonWieoft();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonWieoft();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Wieoft:"+compareTwoText);
		}		
	 @Test(priority=25,enabled=true)
		public void verifyZahnputztechnikLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonZahnputztechnik();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonZahnputztechnik();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Zahnputztechnik:"+compareTwoText);
		}		
	 @Test(priority=26,enabled=true)
		public void verifyHilfsmittelLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonHilfsmittel();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonHilfsmittel();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Hilfsmittel:"+compareTwoText);
		}		
	 @Test(priority=27,enabled=true)
		public void verifyMundgeruchLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonMundgeruch();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonMundgeruch();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Mundgeruch:"+compareTwoText);
		}		
	 @Test(priority=28,enabled=true)
		public void verifyWeissereZahneLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonWeisserenezahne();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonWeisserenezahne();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for WeissereZahne:"+compareTwoText);
		}		
	 @Test(priority=29,enabled=true)
		public void verifyErnahrungZahneLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonErnahrungZahne();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonErnahrungZahne();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same forErnahrungZahne :"+compareTwoText);
		}		
	 @Test(priority=30,enabled=true)
		public void verifyParodontitisLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonParodontitis();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonParodontitis();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Parodontiis :"+compareTwoText);
		}		
	 @Test(priority=31,enabled=true)
		public void verifySchutzKariesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonSchutzKaries();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonSchutzKaries();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for SchutzKaries :"+compareTwoText);
		}		
	 @Test(priority=32,enabled=true)
		public void verifyEmpfindlichLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonEmpfindliche();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonEmpfindliche();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Empfindlich :"+compareTwoText);
		}		
	 @Test(priority=33,enabled=true)
		public void verifyZahnputztechnikKinderLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonZahnputztechnikKinder();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonZahnputztechnikKinder();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ZahnputztechnikKinder :"+compareTwoText);
		}		
	 @Test(priority=34,enabled=true)
		public void verifyKinderzahnetwicklungLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonKinderzahnentwicklung();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonKinderzahnentwicklung();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Kinderzahnetwicklung :"+compareTwoText);
		}		
	 @Test(priority=35,enabled=true)
		public void verifyZahnspangenLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonZahnspangen();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonZahnspangen();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Zahnspangen :"+compareTwoText);
		}		
	 @Test(priority=36,enabled=true)
		public void verifyPflegeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonPflege();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonPflege();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for pflege :"+compareTwoText);
		}		
	 @Test(priority=37,enabled=true)
		public void verifyBiokunstuffLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonBiokunstuff();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonBiokunstuff();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for BioKunstuff :"+compareTwoText);
		}		
	
	 @Test(priority=38,enabled=true)
		public void verifyBambusLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonBambus();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonBambus();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Bambus :"+compareTwoText);
		}		
	 @Test(priority=39,enabled=true)
		public void verifyUmweltfreundlicheLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonUmweltfreundliche();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonUmweltfreundliche();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Umweltfreundliche :"+compareTwoText);
		}		
	 @Test(priority=40,enabled=true)
		public void verifyKlimashutzprojektLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonKlimashutzprojekt();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonKlimashutzprojekt();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Klimashutzprojekt :"+compareTwoText);
		}		
	 @Test(priority=41,enabled=true)
		public void verifySystemZahnpflegeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonSystemZahnpflege();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonSystemZahnpflege();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for SystemZahnpflege :"+compareTwoText);
		}		
	 @Test(priority=42,enabled=true)
		public void verifyFlexzoneLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonFlexzone();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonFlexzone();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Flexzone :"+compareTwoText);
		}		
	 @Test(priority=43,enabled=true)
		public void verifyKugelgelenkLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonKugelgelenk();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonKugelgelenk();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Kugelgelen :"+compareTwoText);
		}		
	 @Test(priority=44,enabled=true)
		public void verifyZungeriningerLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonZungenreininger();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonZungenreininger();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Zungenringer :"+compareTwoText);
		}		
	 @Test(priority=45,enabled=true)
		public void verifyVibrationLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonVibration();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonVibration();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Vibration :"+compareTwoText);
		}		
	 @Test(priority=46,enabled=true)
		public void verifySeidenfeinLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonSeidenfein();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonSeidenfein();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Seidenfein :"+compareTwoText);
		}		
	 @Test(priority=47,enabled=true)
		public void verifyPolimed1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonPolimed1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonPolimed1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Polimed1 :"+compareTwoText);
		}		
	 @Test(priority=48,enabled=true)
		public void verifyBambooInterdentLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonBambooInterdent();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonBambooInterdent();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for BambooInterdent :"+compareTwoText);
		}		
	 @Test(priority=49,enabled=true)
		public void verifyVerpackungLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonVerpackung();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonVerpackung();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Verpackung :"+compareTwoText);
		}		
	 @Test(priority=50,enabled=true)
		public void verifyGreenClean1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonGreenClean1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonGreenClean1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for GreenClean1 :"+compareTwoText);
		}		
	 @Test(priority=51,enabled=true)
		public void verifySiteMapLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonSitemap();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonSitemap();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Sitemap :"+compareTwoText);
		}		
	 @Test(priority=52,enabled=true)
		public void verifyImpressumLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonImpressum();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonImpressum();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Impressum :"+compareTwoText);
		}		
	 @Test(priority=53,enabled=true)
		public void verifyNutzungsbedingungenLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonNutzungsbeding();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonNutzungsbeding();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for  Nutzungsbedingunge:"+compareTwoText);
		}		
	 @Test(priority=54,enabled=true)
		public void verifyDatenschutzrichtlinieLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonDatenschutzrichtlinie();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonDatenschutzrichtlinie();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Datenschutzrichtlinie :"+compareTwoText);
		}		
	 @Test(priority=55,enabled=true)
		public void verifyCookiesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonCookies();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonCookies();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cookies :"+compareTwoText);
		}		
	 @Test(priority=56,enabled=true)
		public void verifyKontaktLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonKontakt();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonKontakt();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Kontakt :"+compareTwoText);
		}		
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
