package com.qa.tums.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.TumsFSAorHSA_Pages;

public class TumsFSAorHSA_Test extends BaseClass{
	
	TumsFSAorHSA_Pages tc;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("tumsConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		tc=new TumsFSAorHSA_Pages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("tumsConfig.properties").getProperty("preProdTumsFSAorHSAUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("tumsConfig.properties").getProperty("liveTumsFSAorHSAUrl"));
		 }
	 @Test(priority=0,enabled=true)
		public void verifyCookieLink() throws Throwable
		{
			switchingTab(firstTab);
	        tc.clickCookieBtn();
	       System.out.println("Verify Cookie Btn on Preprod Url");
	        switchingTab(secondTab);
	        tc.clickCookieBtn();
	       System.out.println("Verify Cookie Btn on Live Url");
		}				
	
	@Test(priority=1,enabled=true)
	public void verifyhomebreadcrumbsLink() throws Throwable
	{
		switchingTab(firstTab);
        tc.clickonHSAorFSAbreadcrumbs();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        tc.clickonHSAorFSAbreadcrumbs();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}					
	@Test(priority=2,enabled=true)
	public void verifyPurchaseHSAorFSALink() throws Throwable
	{
		switchingTab(firstTab);
        tc.clickonPurchaseHSAorFSA();
        System.out.println("Verify HSAorFSA purchase on Preprod Url");
        switchingTab(secondTab);
        tc.clickonPurchaseHSAorFSA();
        System.out.println("Verify HSAorFSA purchase on Live Url");
	}				
	@Test(priority=3,enabled=true)
	public void verifymyFSALink() throws Throwable
	{
		switchingTab(firstTab);
        tc.clickonmyFSA();
        System.out.println("Verify myFSA on Preprod Url");
        switchingTab(secondTab);
        tc.clickonmyFSA();
        System.out.println("Verify myFSA on Live Url");
	}			
	@Test(priority=4,enabled=true)
	public void verifymyHSALink() throws Throwable
	{
		switchingTab(firstTab);
        tc.clickonmyHSA();
        System.out.println("Verify myHSA on Preprod Url");
        switchingTab(secondTab);
        tc.clickonmyHSA();
        System.out.println("Verify myHSA on Live Url");
	}			
	@Test(priority=5,enabled=true)
	public void verifychewybitesLink() throws Throwable
	{
		switchingTab(firstTab);
        tc.clickonChewyBites();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        tc.clickonChewyBites();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}			
	@Test(priority=6,enabled=true)
	public void verifyUltrastrengthLink() throws Throwable
	{
		switchingTab(firstTab);
        tc.clickonUltrastrength();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        tc.clickonUltrastrength();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}			
	@Test(priority=7,enabled=true)
	public void verifyRegularstrengthLink() throws Throwable
	{
		switchingTab(firstTab);
        tc.clickonRegularstrength();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        tc.clickonRegularstrength();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=8,enabled=true)
	public void verifyQuestionProductLink() throws Throwable
	{
		switchingTab(firstTab);
        tc.clickonquestionproduct();
        System.out.println("Verify Question about TUMS in Preprod Url");
        switchingTab(secondTab);
        tc.clickonquestionproduct();
        System.out.println("Verify Question about TUMS in Live Url");
	}		
	@Test(priority=9,enabled=true)
	public void verifyOurFAQCenterLink() throws Throwable
	{
		switchingTab(firstTab);
        tc.clickonOurFAQCenter();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        tc.clickonOurFAQCenter();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=10,enabled=true)
	public void verifyWheretobuyLink() throws Throwable
	{
		switchingTab(firstTab);
        tc.clickonwheretobuy();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        tc.clickonwheretobuy();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=11,enabled=true)
	public void verifygetcouponsLink() throws Throwable
	{
		switchingTab(firstTab);
        tc.clickongetcoupons();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        tc.clickongetcoupons();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
