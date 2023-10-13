package com.qa.rinazina.it.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.rinazina.it.pages.RinazinagocceNasaliPage;

public class RinazinagocceNasaliTest extends BaseClass{
	
	RinazinagocceNasaliPage rs;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("rinazina_itConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 rs=new RinazinagocceNasaliPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("rinazina_itConfig.properties").getProperty("preProdRinazinagocceNasaliUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("rinazina_itConfig.properties").getProperty("LiveRinazinagocceNasaliUrl"));
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
		public void verifyRinazinaProdottiBreadcrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rs.clickonProdottiBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rs.clickonProdottiBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for RinazinaProdottiBreadcrumbs:"+compareTwoText);
		}			
	 @Test(priority=3,enabled=true)
		public void verifyMedicinaliBreadcrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rs.clickonMedicinaliBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rs.clickonMedicinaliBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for MedicinaliBreadcrumbs:"+compareTwoText);
		}			
	 @Test(priority=4,enabled=true)
		public void verifyRinazinagocceNasaliBreadcrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rs.clickonRinazinagocceNasaleBreadcrumbs();
	       System.out.println("Verify RinazinagocceNasaliBreadcrumbs on Preprod Url ");
	        switchingTab(secondTab);
	        rs.clickonRinazinagocceNasaleBreadcrumbs();
	        System.out.println("Verify RinazinagocceNasaliBreadcrumbs on Live Url ");
		}			
	 @Test(priority=5,enabled=true)
		public void verifyComeutilizareRinazinaLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rs.clickonComeutilizzareRinazina();
	        System.out.println("Verify ComeutilizareRinazina on Preprod Url ");
	        switchingTab(secondTab);
	        rs.clickonComeutilizzareRinazina();
	        System.out.println("Verify ComeutilizareRinazina on Live Url ");
		}			
	 @Test(priority=6,enabled=true)
		public void verifyInformaizionisulLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rs.clickonInformazionisul();
	        System.out.println("Verify Informaizionisul on Preprod url");
	        switchingTab(secondTab);
	        rs.clickonInformazionisul();
	        System.out.println("Verify Informaizionisul on Live url");
		}			
	 @Test(priority=7,enabled=true)
		public void verifyComponentiLink() throws Throwable
		{
		 switchingTab(firstTab);
		 	rs.clickonComponenti();
	        System.out.println("Verify componenti on preprod Url " );
	        switchingTab(secondTab);
	       rs.clickonComponenti();
	        System.out.println("Verify componenti on Live Url " );
		}			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
