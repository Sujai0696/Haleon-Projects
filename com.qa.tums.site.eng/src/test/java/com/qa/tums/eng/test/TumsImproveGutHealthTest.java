package com.qa.tums.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.TumsImproveGutHealthPages;

public class TumsImproveGutHealthTest extends BaseClass {
	TumsImproveGutHealthPages ig;
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("tumsConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		ig=new TumsImproveGutHealthPages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("tumsConfig.properties").getProperty("preProdImproveguthealthUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("tumsConfig.properties").getProperty("liveImproveguthealthUrl"));
		 }
	 @Test(priority=0,enabled=true)
		public void verifyCookieLink() throws Throwable
		{
			switchingTab(firstTab);
	        ig.clickCookieBtn();
	       System.out.println("Verify Cookie Btn on Preprod Url");
	        switchingTab(secondTab);
	        ig.clickCookieBtn();
	       System.out.println("Verify Cookie Btn on Live Url");
		}		
		
	@Test(priority=1,enabled=true)
	public void verifyHomeiconBreadcrumbsLink() throws Throwable
	{
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        ig.clickonHomeiconBreadcrumbs();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        ig.clickonHomeiconBreadcrumbs();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}	
	@Test(priority=2,enabled=true)
	public void verifyguthealthimprovesBreadcrumbsLink() throws Throwable
	{
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        ig.clickonguthealthBreadcrumbs();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        //ig.clickCookiesDismissBtn();
        ig.clickonguthealthBreadcrumbs();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}	
	@Test(priority=3,enabled=true)
	public void verifySeeproductsLink() throws Throwable
	{
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        ig.clickonSeeproducts();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        ig.clickonSeeproducts();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

