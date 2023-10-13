package com.qa.tums.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.TumsheartburnduringpregancyPages;

public class TumsheartburnduringpregancyTest extends BaseClass {
	
	TumsheartburnduringpregancyPages th;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("tumsConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		th=new TumsheartburnduringpregancyPages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("tumsConfig.properties").getProperty("preProdTumsheartburnduringpregancyUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("tumsConfig.properties").getProperty("liveTumsheartburnduringpregancyUrl"));
		 }
	 @Test(priority=0,enabled=true)
		public void verifyCookieLink() throws Throwable
		{
			switchingTab(firstTab);
	        th.clickCookieBtn();
	       System.out.println("Verify Cookie Btn on Preprod Url");
	        switchingTab(secondTab);
	        th.clickCookieBtn();
	       System.out.println("Verify Cookie Btn on Live Url");
		}		
	
	@Test(priority=1,enabled=true)
	public void verifyhomebreadcrumbsLink() throws Throwable
	{
		switchingTab(firstTab);
        th.clickonHeartburn101breadcrumbs();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        th.clickonHeartburn101breadcrumbs();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}				
	@Test(priority=2,enabled=true)
	public void verifypregancydigestionremediesLink() throws Throwable
	{
		switchingTab(firstTab);
        th.clickonpregancydigestionremedies();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        th.clickonpregancydigestionremedies();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}				
	@Test(priority=3,enabled=true)
	public void verifyHeartburnsymptomsLink() throws Throwable
	{
		switchingTab(firstTab);
        th.clickonheartburnsymptoms();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        th.clickonheartburnsymptoms();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}			
	@Test(priority=4,enabled=true)
	public void verifyDietLink() throws Throwable
	{
		switchingTab(firstTab);
        th.clickondiet();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        th.clickondiet();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}			
	@Test(priority=5,enabled=true)
	public void verifyheartburnreliefLink() throws Throwable
	{
		switchingTab(firstTab);
        th.clickonheartburnrelief();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        th.clickonheartburnrelief();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}			
	@Test(priority=6,enabled=true)
	public void verifyAntacidsLink() throws Throwable
	{
		switchingTab(firstTab);
        th.clickonantacids();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        th.clickonantacids();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}			
	@Test(priority=7,enabled=true)
	public void verifyDigestiveissuesLink() throws Throwable
	{
		switchingTab(firstTab);
        th.clickondigestiveissues();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        th.clickondigestiveissues();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}			
	@Test(priority=8,enabled=true)
	public void verifyTumssiteLink() throws Throwable
	{
		switchingTab(firstTab);
        th.clickontumsite();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        th.clickontumsite();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}			
	@Test(priority=9,enabled=true)
	public void verifyseeproductsLink() throws Throwable
	{
		switchingTab(firstTab);
        th.clickonseeproducts();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        th.clickonseeproducts();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
