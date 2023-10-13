package com.qa.tums.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.TumsheartburnreliefhomeremdiesPages;

public class TumsheartburnreliefhomeremdiesTest extends BaseClass{
	
	TumsheartburnreliefhomeremdiesPages th;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("tumsConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		th=new TumsheartburnreliefhomeremdiesPages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("tumsConfig.properties").getProperty("preProdTumsheartburnreliefhomeremediesUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("tumsConfig.properties").getProperty("liveTumsheartburnreliefhomeremediesUrl"));
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
	public void verifyheartburnreliefhomeremdiesbreadcrumbsLink() throws Throwable
	{
		switchingTab(firstTab);
        th.clickonheartburnreliefhomeremdies();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        th.clickonheartburnreliefhomeremdies();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}				
	@Test(priority=3,enabled=true)
	public void verifyheartburnsymptomsLink() throws Throwable
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
	public void verifyantacidsTumsLink() throws Throwable
	{
		switchingTab(firstTab);
        th.clickonantacidsTums();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        th.clickonantacidsTums();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=5,enabled=true)
	public void verifyHomeremediesLink() throws Throwable
	{
		switchingTab(firstTab);
        th.clickonhomeremedies();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        th.clickonhomeremedies();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=6,enabled=true)
	public void verifychanginglifestylehabitsLink() throws Throwable
	{
		switchingTab(firstTab);
        th.clickonchanginglifestylehabits();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        th.clickonchanginglifestylehabits();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=7,enabled=true)
	public void verifysleepingleftsideLink() throws Throwable
	{
		switchingTab(firstTab);
        th.clickonsleepingleftside();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        th.clickonsleepingleftside();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=8,enabled=true)
	public void verifyapplecidervinegarLink() throws Throwable
	{
		switchingTab(firstTab);
        th.clickonapplecidervinegar();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        th.clickonapplecidervinegar();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	
	@Test(priority=9,enabled=true)
	public void verifyclassicburningsensationLink() throws Throwable
	{
		switchingTab(firstTab);
        th.clickonclassicburningsensation();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        th.clickonclassicburningsensation();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=10,enabled=true)
	public void verifygingerrelievenauseaLink() throws Throwable
	{
		switchingTab(firstTab);
        th.clickongingerrelievenausea();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        th.clickongingerrelievenausea();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=11,enabled=true)
	public void verifyfoodcauseheartburnLink() throws Throwable
	{
		switchingTab(firstTab);
        th.clickonfoodcauseheartburn();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        th.clickonfoodcauseheartburn();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=12,enabled=true)
	public void verifytightwaistbondsLink() throws Throwable
	{
		switchingTab(firstTab);
        th.clickontightwaistbands();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        th.clickontightwaistbands();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=13,enabled=true)
	public void verifysleepingleftside1Link() throws Throwable
	{
		switchingTab(firstTab);
        th.clickonsleepingleftside1();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        th.clickonsleepingleftside1();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=14,enabled=true)
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
