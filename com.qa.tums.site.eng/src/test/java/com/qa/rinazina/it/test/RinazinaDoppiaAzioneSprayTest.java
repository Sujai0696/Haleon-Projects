package com.qa.rinazina.it.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.rinazina.it.pages.RinazinaDoppiaAzioneSprayPage;

public class RinazinaDoppiaAzioneSprayTest extends BaseClass{
	
	 RinazinaDoppiaAzioneSprayPage rd;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("rinazina_itConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 rd=new RinazinaDoppiaAzioneSprayPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("rinazina_itConfig.properties").getProperty("preProdRinazinaDoppiaAzioneSprayUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("rinazina_itConfig.properties").getProperty("LiveRinazinaDoppiaAzioneSprayUrl"));
		 }	
	 @Test(priority=0,enabled=true)
		public void verifyRinazinacookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        rd.clickonCookieBtn();
	        System.out.println("Verify Rinazina Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        rd.clickonCookieBtn();
	        System.out.println("Verify Rinazina Cookie Popup on Live Url");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyRinazinaHomeBreadcrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rd.clickonHomeBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rd.clickonHomeBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeBreadcrumbs:"+compareTwoText);
		}			
	 @Test(priority=2,enabled=true)
		public void verifyRinazinaProdottiBreadcrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rd.clickonProdottiBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rd.clickonProdottiBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for RinazinaProdottiBreadcrumbs:"+compareTwoText);
		}			
	 @Test(priority=3,enabled=true)
		public void verifyMedicinaliBreadcrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rd.clickonMedicinaliBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rd.clickonMedicinaliBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for MedicinaliBreadcrumbs:"+compareTwoText);
		}			
	 @Test(priority=4,enabled=true)
		public void verifyRinazinaDoppiaAzioneBreadcrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rd.clickonRinazinaDoppiaAzioneBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rd.clickonRinazinaDoppiaAzioneBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for RinazinaDoppiaAzioneBreadcrumbs:"+compareTwoText);
		}				
	@Test(priority=5,enabled=true)
	public void verifyComesiusaLink() throws Throwable
	{
	 switchingTab(firstTab);
        rd.clickonComesiusa();
       System.out.println("Verify Comesiusa on Preprod  Url");
        switchingTab(secondTab);
        rd.clickonComesiusa();
        System.out.println("Verify Comesiusa on Live  Url");
	}			
 @Test(priority=6,enabled=true)
	public void verifyInformaizionisulLink() throws Throwable
	{
	 switchingTab(firstTab);
        rd.clickonInformazionisul();
        System.out.println("Verify Informaizionisul on Preprod  Url");
        switchingTab(secondTab);
        rd.clickonInformazionisul();
        System.out.println("Verify Informaizionisul on Live Url");
	}			
 @Test(priority=7,enabled=true)
	public void verifyComponentiLink() throws Throwable
	{
	 switchingTab(firstTab);
        rd.clickonComponenti();
       System.out.println("Verify Componenti on Preprod  Url");
        switchingTab(secondTab);
        rd.clickonComponenti();
       System.out.println("Verify Componenti on Live Url");
	}			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
