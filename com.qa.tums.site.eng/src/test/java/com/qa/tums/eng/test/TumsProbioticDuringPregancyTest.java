package com.qa.tums.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.TumsProbioticDuringPregancyPages;

public class TumsProbioticDuringPregancyTest extends BaseClass{

	TumsProbioticDuringPregancyPages pd;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("tumsConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		pd=new TumsProbioticDuringPregancyPages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("tumsConfig.properties").getProperty("preProdProbioticDuringPregancyUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("tumsConfig.properties").getProperty("liveProbioticDuringPregancyUrl"));
		 }
	 
	 @Test(priority=0,enabled=true)
		public void verifyCookieLink() throws Throwable
		{
			switchingTab(firstTab);
	        pd.clickCookieBtn();
	       System.out.println("Verify Cookie Btn on Preprod Url");
	        switchingTab(secondTab);
	        pd.clickCookieBtn();
	       System.out.println("Verify Cookie Btn on Live Url");
		}		
	
	@Test(priority=1,enabled=true)
	public void verifyhomebreadcrumbsLink() throws Throwable
	{
		switchingTab(firstTab);
        pd.clickonhomebreadcrumbs();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        pd.clickonhomebreadcrumbs();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}	
	@Test(priority=2,enabled=true)
	public void verifyHeartburn101breadcrumbsLink() throws Throwable
	{
		switchingTab(firstTab);
        pd.clickonheartburn101breadcrumbsButton();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        pd.clickonheartburn101breadcrumbsButton();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}	
	@Test(priority=3,enabled=true)
	public void verifyProbioticduringpregancybreadcrumbsLink() throws Throwable
	{
		switchingTab(firstTab);
        pd.clickonprobioticduringpregancybreadcrumbsButton();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        pd.clickonprobioticduringpregancybreadcrumbsButton();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}	
	@Test(priority=4,enabled=true)
	public void verifyTumsLink() throws Throwable
	{
		switchingTab(firstTab);
        pd.clickonTumsButton();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        pd.clickonTumsButton();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}	
	@Test(priority=5,enabled=true)
	public void verifyTumswhilepregantLink() throws Throwable
	{
		switchingTab(firstTab);
        pd.clickonTumswhilepregantButton();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        pd.clickonTumswhilepregantButton();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}	
	@Test(priority=6,enabled=true)
	public void verifyRemediesforpregantLink() throws Throwable
	{
		switchingTab(firstTab);
        pd.clickonremediesforpregantButton();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        pd.clickonremediesforpregantButton();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}	
	@Test(priority=7,enabled=true)
	public void verifyseeproductsLink() throws Throwable
	{
		switchingTab(firstTab);
        pd.clickonseeproductsButton();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        pd.clickonseeproductsButton();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
