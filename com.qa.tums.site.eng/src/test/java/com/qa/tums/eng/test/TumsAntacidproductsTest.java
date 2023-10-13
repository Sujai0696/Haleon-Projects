package com.qa.tums.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.TumsAntacidproductsPages;

public class TumsAntacidproductsTest extends BaseClass{
	
	TumsAntacidproductsPages ts;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("tumsConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		ts=new TumsAntacidproductsPages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("tumsConfig.properties").getProperty("preProdTumsAntacidproductsUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("tumsConfig.properties").getProperty("liveTumsAntacidproductsUrl"));
		 }
	 @Test(priority=0,enabled=true)
		public void verifyCookieLink() throws Throwable
		{
			switchingTab(firstTab);
	        ts.clickCookieBtn();
	       System.out.println("Verify Cookie Btn on Preprod Url");
	        switchingTab(secondTab);
	        ts.clickCookieBtn();
	       System.out.println("Verify Cookie Btn on Live Url");
		}		
	
	@Test(priority=1,enabled=true)
	public void verifyhomebreadcrumbsLink() throws Throwable
	{
		switchingTab(firstTab);
        ts.clickonhomebreadcrumbs();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonhomebreadcrumbs();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}				
	@Test(priority=2,enabled=true)
	public void verifyproductselectorbreadcrumbsLink() throws Throwable
	{
		switchingTab(firstTab);
        ts.clickonproductselector();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonproductselector();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}				
	@Test(priority=3,enabled=true)
	public void verifySmoothiesLink() throws Throwable
	{
		switchingTab(firstTab);
        ts.clickonsmoothies();
       System.out.println("Smoothis is clicable on preprod url");
        switchingTab(secondTab);
        ts.clickonsmoothies();
       System.out.println("Smoothis is clicable on Live url");
	}				
	@Test(priority=4,enabled=true)
	public void verifytabletsLink() throws Throwable
	{
		switchingTab(firstTab);
        ts.clickontablets();
       System.out.println("Tablet is clicable on preprod url");
        switchingTab(secondTab);
        ts.clickontablets();
       System.out.println("Tablet is clicable on Live url");
	}				
	@Test(priority=5,enabled=true)
	public void verifytchewsLink() throws Throwable
	{
		switchingTab(firstTab);
        ts.clickonchews();
       System.out.println("Chew is clicable on preprod url");
        switchingTab(secondTab);
        ts.clickonchews();
       System.out.println("Chew is clicable on Live url");
	}				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
