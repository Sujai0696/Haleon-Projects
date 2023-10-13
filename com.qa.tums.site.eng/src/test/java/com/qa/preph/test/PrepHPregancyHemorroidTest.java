package com.qa.preph.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.preph.pages.PrepHPregancyHemorroidsPage;

public class PrepHPregancyHemorroidTest extends BaseClass{
	
	PrepHPregancyHemorroidsPage pph;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("preph_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 pph=new PrepHPregancyHemorroidsPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("preph_Config.properties").getProperty("preProdpregancyandhemorroidsUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("preph_Config.properties").getProperty("LivepregancyandhemorroidsUrl"));
		 }	
	 
	 @Test(priority=0,enabled=true)
		public void verifyPreph_cookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        pph.clickonCookieBtn();
	        System.out.println("Verify Preph Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        pph.clickonCookieBtn();
	        System.out.println("Verify Preph Cookie Popup on Live Url");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyHomeBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pph.clickonHomeBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pph.clickonHomeBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeBreadcrumbs:"+compareTwoText);
		}									
	 @Test(priority=2,enabled=true)
		public void verifyVideoBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pph.clickonVideo_Breadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pph.clickonVideo_Breadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Video_Breadcrumbs:"+compareTwoText);
		}												
	 @Test(priority=3,enabled=true)
		public void verifyPregancyHemorrhoid_BreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pph.clickonPregancyHemorrhoids_Breadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pph.clickonPregancyHemorrhoids_Breadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for PregancyHemorrhoids_Breadcrumbs:"+compareTwoText);
		}							
	 @Test(priority=4,enabled=true)
		public void verifyPregancyHemorrhoid_VideoLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pph.clickonVideoPregancyHemorrhoids();
	      System.out.println("Verified Pregancy Hemorrhoid is Present and played successfully on Preprod Url");
	        switchingTab(secondTab);
	        pph.clickonVideoPregancyHemorrhoids();
	        System.out.println("Verified Pregancy Hemorrhoid is Present and played successfully on Live Url");
		}							
	 @Test(priority=5,enabled=true)
		public void verifyMedicatedWipeswomenLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pph.clickonMedicatedWipeswomen();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pph.clickonMedicatedWipeswomen();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Medicatedwipeswomen:"+compareTwoText);
		}							
	 @Test(priority=6,enabled=true)
		public void verifyRelatedVideos1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        pph.clickonRelatedVideo1();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pph.clickonRelatedVideo1();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Related Video1:"+compareTwoText);
		}							
	 @Test(priority=7,enabled=true)
		public void verifyRelatedVideos2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        pph.clickonRelatedVideo2();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pph.clickonRelatedVideo2();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Related Video2:"+compareTwoText);
		}							
	 @Test(priority=8,enabled=true)
		public void verifyRelatedVideos3Link() throws Throwable
		{
		 switchingTab(firstTab);
	        pph.clickonRelatedVideo3();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pph.clickonRelatedVideo3();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Related Video3:"+compareTwoText);
		}							
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
