package com.qa.rinazina.it.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.rinazina.it.pages.RinazinaAllergicasprayNasalePage;

public class RinazinaAllergicasprayNasaleTest extends BaseClass{
	
	RinazinaAllergicasprayNasalePage ra;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("rinazina_itConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 ra=new RinazinaAllergicasprayNasalePage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("rinazina_itConfig.properties").getProperty("preProdRinazinaAllergicasprayNasaleUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("rinazina_itConfig.properties").getProperty("LiveRinazinaAllergicasprayNasaleUrl"));
		 }	
	 @Test(priority=0,enabled=true)
		public void verifyRinazinacookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        ra.clickonCookieBtn();
	        System.out.println("Verify Rinazina Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        ra.clickonCookieBtn();
	        System.out.println("Verify Rinazina Cookie Popup on Live Url");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyRinazinaHomeBreadcrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ra.clickonHomeBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        ra.clickonHomeBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeBreadcrumbs:"+compareTwoText);
		}			
	 @Test(priority=2,enabled=true)
		public void verifyRinazinaAntiallergicalsprayNasleBreadcrumbsLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        ra.clickonRinazinaAntiallergicalSprayNasaleBreadcrumbs();
	        System.out.println("Verify RinazinaAntiallergicalsprayNasleBreadcrumbs on Preprod Url");
	        switchingTab(secondTab);
	        ra.clickonRinazinaAntiallergicalSprayNasaleBreadcrumbs();
	        System.out.println("Verify RinazinaAntiallergicalsprayNasleBreadcrumbs on Live Url");
		}			
	 @Test(priority=3,enabled=true)
		public void verifyComesiusasLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        ra.clickonComesiusa();
	        System.out.println("Verify Comesiusa on Preprod Url");
	        switchingTab(secondTab);
	        ra.clickonComesiusa();
	        System.out.println("Verify Comesiusa on Live Url");
		}		
	 @Test(priority=4,enabled=true)
		public void verifyInformazionisulLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        ra.clickonInformazionisul();
	        System.out.println("Verify Informazionisul on Preprod Url");
	        switchingTab(secondTab);
	        ra.clickonInformazionisul();
	        System.out.println("Verify Informazionisul on Live Url");
		}		
	 @Test(priority=5,enabled=true)
		public void verifyComponentiLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        ra.clickonComponenti();
	        System.out.println("Verify Componenti on Preprod Url");
	        switchingTab(secondTab);
	        ra.clickonComponenti();
	        System.out.println("Verify Componenti on Live Url");
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
