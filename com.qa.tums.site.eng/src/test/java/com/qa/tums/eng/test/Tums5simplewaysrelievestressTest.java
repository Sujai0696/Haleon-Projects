package com.qa.tums.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.Tums5simplewaysrelievestressPages;


public class Tums5simplewaysrelievestressTest extends BaseClass {
	
	Tums5simplewaysrelievestressPages ts;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("tumsConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		ts=new Tums5simplewaysrelievestressPages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("tumsConfig.properties").getProperty("preProdTums5simplewaysrelievestressUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("tumsConfig.properties").getProperty("liveTums5simplewaysrelievestressUrl"));
		 }
	 @Test(priority=0,enabled=true)
		public void verifyCookieLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ts.clickCookieBtn();
	        System.out.println("Cookie in preprod url");
	        switchingTab(secondTab);
	        ts.clickCookieBtn();
	        System.out.println("Cookie  in Live url");
		}		
	
	@Test(priority=1,enabled=true)
	public void verifyhomebreadcrumbsLink() throws Throwable
	{
		switchingTab(firstTab);
        ts.clickonHeartburn101breadcrumbs();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonHeartburn101breadcrumbs();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}				
	
	@Test(priority=2,enabled=true)
	public void verifyfivewaysrelievestressbreadcrumbsLink() throws Throwable
	{
		switchingTab(firstTab);
        ts.clickonfivewaysrelievestress();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonfivewaysrelievestress();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}				
	
	@Test(priority=3,enabled=true)
	public void verifystressditrimentalLink() throws Throwable
	{
		switchingTab(firstTab);
        ts.clickonstressditrimental();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonstressditrimental();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}				
	@Test(priority=4,enabled=true)
	public void verifywellbalanceddietLink() throws Throwable
	{
		switchingTab(firstTab);
        ts.clickonwellbalanceddiet();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonwellbalanceddiet();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}				
	@Test(priority=5,enabled=true)
	public void verifydailyworkoutsLink() throws Throwable
	{
		switchingTab(firstTab);
        ts.clickondailyworkouts();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickondailyworkouts();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}			
	@Test(priority=6,enabled=true)
	public void verifyheartburntriggersLink() throws Throwable
	{
		switchingTab(firstTab);
        ts.clickonheartburntriggers();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonheartburntriggers();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}			
	@Test(priority=7,enabled=true)
	public void verifylifestylechangeheartburnLink() throws Throwable
	{
		switchingTab(firstTab);
        ts.clickonlifestylechangeheartburn();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonlifestylechangeheartburn();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}			
	@Test(priority=8,enabled=true)
	public void verifyseeproductsLink() throws Throwable
	{
		switchingTab(firstTab);
        ts.clickonseeproducts();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonseeproducts();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
