package com.qa.rinazina.it.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.rinazina.it.pages.RinazinaSitemapPage;

public class RinazinaSitemapTest extends BaseClass{
	
	RinazinaSitemapPage rs;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("rinazina_itConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 rs=new RinazinaSitemapPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("rinazina_itConfig.properties").getProperty("preProdRinazinaSitemapUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("rinazina_itConfig.properties").getProperty("LiveRinazinaSitemapUrl"));
		 }	
	 @Test(priority=0,enabled=true)
		public void verifyRinazinacookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        rs.clickonCookieBtn();
	        System.out.println("Verify Rinazina Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        rs.clickonCookieBtn();
	        System.out.println("Verify Rinazina Cookie Popup on Live Url");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyRinazinaHomeBreadcrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rs.clickonHomeBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rs.clickonHomeBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeBreadcrumbs:"+compareTwoText);
		}			
	 @Test(priority=2,enabled=true)
		public void verifyRinazinaSitemapBreadcrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rs.clickonSitemapBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rs.clickonSitemapBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for RinazinaSitemapBreadcrumbs:"+compareTwoText);
		}				
	 @Test(priority=3,enabled=true)
		public void verifyProdottiLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rs.clickonProdotti();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rs.clickonProdotti();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Prodotti:"+compareTwoText);
		}				
	 @Test(priority=4,enabled=true)
		public void verifyMedicnaliLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rs.clickonMedicinali();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rs.clickonMedicinali();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Medicinali:"+compareTwoText);
		}			
	 @Test(priority=5,enabled=true)
		public void verifyRinazinasprayNasaleLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rs.clickonRinazinasprayNasale();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rs.clickonRinazinasprayNasale();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Medicinali:"+compareTwoText);
		}			
	 @Test(priority=6,enabled=true)
		public void verifyRinazinaGocciNasaliLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rs.clickonRinazinaGocciNasali();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rs.clickonRinazinaGocciNasali();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for RinazinaGocciNasali:"+compareTwoText);
		}			
	 @Test(priority=7,enabled=true)
		public void verifyDoppiaAzionesprayNasaleLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rs.clickonDoppiaAzionesprayNasale();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rs.clickonDoppiaAzionesprayNasale();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for DoppiaAzionesprayNasale:"+compareTwoText);
		}			
	
	 @Test(priority=8,enabled=true)
		public void verifyAntiallergicaSprayNasaleLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rs.clickonAntiallergicaSprayNasale();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rs.clickonAntiallergicaSprayNasale();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AntiallergicaSprayNasale:"+compareTwoText);
		}		
	 @Test(priority=9,enabled=true)
		public void verifySenzaMedicinaliLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rs.clickonSenzaMedicinali();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rs.clickonSenzaMedicinali();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for SenzaMedicinali:"+compareTwoText);
		}		
	 @Test(priority=10,enabled=true)
		public void verifyRinazinaAquamarinaLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rs.clickonRinazinaAquamarine();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rs.clickonRinazinaAquamarine();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for RinazinaAquamarina:"+compareTwoText);
		}		
	 @Test(priority=11,enabled=true)
		public void verifyRinazinaAquamarinaIstonicoLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rs.clickonRinazinaAquamarineIstonico();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rs.clickonRinazinaAquamarineIstonico();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for RinazinaAquamarinaIstonico:"+compareTwoText);
		}		
	 @Test(priority=12,enabled=true)
		public void verifyCondizioniLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rs.clickonCondizioni();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rs.clickonCondizioni();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Condizioni:"+compareTwoText);
		}		
	 @Test(priority=13,enabled=true)
		public void verifyRaffreddoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rs.clickonRaffreddore();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rs.clickonRaffreddore();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Raffreddore:"+compareTwoText);
		}		
	 @Test(priority=14,enabled=true)
		public void verifySinusitesintomiLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rs.clickonSinusitesintomi();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rs.clickonSinusitesintomi();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Sinusitesintomi:"+compareTwoText);
		}		
	 @Test(priority=15,enabled=true)
		public void verifyRiniteallergicaLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rs.clickonRiniteallergica();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rs.clickonRiniteallergica();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Riniteallergica:"+compareTwoText);
		}		
	 @Test(priority=16,enabled=true)
		public void verifyRussamentonotturnoLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rs.clickonRussamentoNotturno();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rs.clickonRussamentoNotturno();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Russamentonotturno:"+compareTwoText);
		}		
	 @Test(priority=17,enabled=true)
		public void verifyConsigillisulaLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rs.clickonConsigilisula();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rs.clickonConsigilisula();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Consigillisula:"+compareTwoText);
		}		
	
	 @Test(priority=18,enabled=true)
		public void verifyComeliberareilLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rs.clickonComeliberareil();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rs.clickonComeliberareil();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Consigillisula:"+compareTwoText);
		}		
	 @Test(priority=19,enabled=true)
		public void verifyGoccenasaliperdaresolllievoLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rs.clickonGoccenasaliperdaresolllievo();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rs.clickonGoccenasaliperdaresolllievo();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Goccenasaliperdaresolllievo:"+compareTwoText);
		}		
	 @Test(priority=20,enabled=true)
		public void verifyPuoidetergereilnasoLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rs.clickonPuoidetergereilnaso();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rs.clickonPuoidetergereilnaso();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Puoidetergereilnaso:"+compareTwoText);
		}		
	 @Test(priority=21,enabled=true)
		public void verifyLavagginasaliLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rs.clickonLavagginasali();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rs.clickonLavagginasali();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Lavagginasali:"+compareTwoText);
		}		
	 @Test(priority=22,enabled=true)
		public void verifyQualelacorrelazioneLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rs.clickonqualelacorrelazione();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rs.clickonqualelacorrelazione();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Qualelacorrelazione:"+compareTwoText);
		}		
	 @Test(priority=23,enabled=true)
		public void verifyNasosemprechiusoLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rs.clickonNasosemprechiuso();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rs.clickonNasosemprechiuso();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Nasosemprechiuso:"+compareTwoText);
		}		
	 @Test(priority=24,enabled=true)
		public void verifyCoseilraffreddoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rs.clickonCoseilraffreddore();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rs.clickonCoseilraffreddore();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Coseilraffreddore:"+compareTwoText);
		}		
	 @Test(priority=25,enabled=true)
		public void verifyRiniteallergicacoseLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rs.clickonRiniteallergicacose();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rs.clickonRiniteallergicacose();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Riniteallergicacose:"+compareTwoText);
		}		
	 @Test(priority=26,enabled=true)
		public void verifyCoselaSinusiteLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rs.clickonCoselaSinusite();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rs.clickonCoselaSinusite();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for CoselaSinusite:"+compareTwoText);
		}		
	 @Test(priority=27,enabled=true)
		public void verifyPollineAllergicaRiniteLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rs.clickonPollineAllergicaRinite();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rs.clickonPollineAllergicaRinite();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for PollineAllergicaRinite:"+compareTwoText);
		}		
	 @Test(priority=28,enabled=true)
		public void verifyComesrespiraLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rs.clickonComesirespira();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rs.clickonComesirespira();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Comesrespira:"+compareTwoText);
		}		
	 @Test(priority=29,enabled=true)
		public void verifyConattatiLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rs.clickonContatti();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rs.clickonContatti();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Conattati:"+compareTwoText);
		}		
	
	
	
	
	
	
	
	
	
	
	

}
