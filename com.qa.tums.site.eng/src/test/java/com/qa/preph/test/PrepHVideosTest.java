package com.qa.preph.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.preph.pages.PrepHVideosPage;

public class PrepHVideosTest extends BaseClass{
	
	PrepHVideosPage pp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("preph_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 pp=new PrepHVideosPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("preph_Config.properties").getProperty("preProdVideosUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("preph_Config.properties").getProperty("LiveVideosUrl"));
		 }	
	 
	 @Test(priority=0,enabled=true)
		public void verifyPreph_cookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        pp.clickonCookieBtn();
	        System.out.println("Verify Preph Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        pp.clickonCookieBtn();
	        System.out.println("Verify Preph Cookie Popup on Live Url");
		}								
	 @Test(priority=1,enabled=true)
		public void verifyInsertPrepHvideosLink() throws Throwable
		{
			switchingTab(firstTab);
	        pp.clickonInsertPrepHvideos();
	        System.out.println("Verify Insert PrepH video on Preprod Url");
	        switchingTab(secondTab);
	        pp.clickonInsertPrepHvideos();
	        System.out.println("Verify Insert PrepH video on Live Url");
		}								
	 @Test(priority=2,enabled=true)
		public void verifyOintmentsvideosLink() throws Throwable
		{
			switchingTab(firstTab);
	        pp.clickonOintmentgelsvideos();
	        System.out.println("Verify Ointments gels creame video on Preprod Url");
	        switchingTab(secondTab);
	        pp.clickonOintmentgelsvideos();
	        System.out.println("Verify Ointments gels and creame video on Live Url");
		}					
	 @Test(priority=4,enabled=true)
		public void verifyMultisymptomscreameLink() throws Throwable
		{
			switchingTab(firstTab);
	        pp.clickonMultisymptomscreame();
	        System.out.println("Verify Multi symptoms creame video on Preprod Url");
	        switchingTab(secondTab);
	        pp.clickonMultisymptomscreame();
	        System.out.println("Verify Multi symptoms creame video on Live Url");
		}					
	 @Test(priority=5,enabled=true)
		public void verifyApplicatorLink() throws Throwable
		{
			switchingTab(firstTab);
	        pp.clickonApplicator();
	        System.out.println("Verify Applicator video on Preprod Url");
	        switchingTab(secondTab);
	        pp.clickonApplicator();
	        System.out.println("Verify Applicator video on Live Url");
		}					
	 @Test(priority=6,enabled=true)
		public void verifyHemorrhoidsruinLink() throws Throwable
		{
			switchingTab(firstTab);
	        pp.clickonHemorrhoidsruin();
	        System.out.println("Verify Hemorrhoids ruin  video on Preprod Url");
	        switchingTab(secondTab);
	        pp.clickonHemorrhoidsruin();
	        System.out.println("Verify Hemorrhoid ruin on Live Url");
		}					
	 @Test(priority=7,enabled=true)
		public void verifyDontfeelRemorseLink() throws Throwable
		{
			switchingTab(firstTab);
	        pp.clickonDontfeelremorse();
	        System.out.println("Verify Dontfeel remorse  video on Preprod Url");
	        switchingTab(secondTab);
	        pp.clickonDontfeelremorse();
	        System.out.println("Verify Hemorrhoid ruinDont feel remorse on Live Url");
		}					
	 @Test(priority=8,enabled=true)
		public void verifywhatarehemorrhoidsLink() throws Throwable
		{
			switchingTab(firstTab);
	        pp.clickonwhatarehemorrhoids();
	        System.out.println("Verify What Are hemorrhoids  video on Preprod Url");
	        switchingTab(secondTab);
	        pp.clickonwhatarehemorrhoids();
	        System.out.println("Verify What Are hemorrhoids  remorse on Live Url");
		}					
	 @Test(priority=9,enabled=true)
		public void verifyTreatHemorrhoidsymptomsLink() throws Throwable
		{
			switchingTab(firstTab);
	        pp.clickontreathemorrhoidssymptoms();
	        System.out.println("Verify Treat hemorrhoid symptoms  video on Preprod Url");
	        switchingTab(secondTab);
	        pp.clickontreathemorrhoidssymptoms();
	        System.out.println("Verify treat hemorrhoid symptoms on Live Url");
		}					
	 @Test(priority=10,enabled=true)
		public void verifyPostpartumcareLink() throws Throwable
		{
			switchingTab(firstTab);
	        pp.clickonPostpartumcare();
	        System.out.println("Verify Postpartum care  video on Preprod Url");
	        switchingTab(secondTab);
	        pp.clickonPostpartumcare();
	        System.out.println("Verify Postpartum care on Live Url");
		}					
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
