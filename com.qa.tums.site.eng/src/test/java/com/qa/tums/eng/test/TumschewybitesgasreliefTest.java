package com.qa.tums.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.TumschewybitesgasreliefPages;

public class TumschewybitesgasreliefTest extends BaseClass{
	
	TumschewybitesgasreliefPages tc;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("tumsConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		tc=new TumschewybitesgasreliefPages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("tumsConfig.properties").getProperty("preProdTumschewybitesgasreliefUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("tumsConfig.properties").getProperty("liveTumschewybitesgasreliefUrl"));
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
        tc.clickonhomebreadcrumbs();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        tc.clickonhomebreadcrumbs();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}				
	@Test(priority=2,enabled=true)
	public void verifyproductselectorbreadcrumbsLink() throws Throwable
	{
		switchingTab(firstTab);
        tc.clickonproductselector();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        tc.clickonproductselector();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}						
	@Test(priority=3,enabled=true)
	public void verifychewybitegasreliefbreadcrumbsLink() throws Throwable
	{
		switchingTab(firstTab);
        tc.clickonchewybitegasreliefbreadcrumbs();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        tc.clickonchewybitegasreliefbreadcrumbs();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}	
	@Test(priority=4,enabled=true)
	public void verifyReviewLink() throws Throwable
	{
		switchingTab(firstTab);
        tc.clickonReviewBtn();
       System.out.println("Verify Review Btn on Preprod Url");
        switchingTab(secondTab);
        tc.clickonReviewBtn();
        System.out.println("Verify Review Btn on Live Url");
	}				
	@Test(priority=5,enabled=true)
	public void verifyBuyNowLink() throws Throwable
	{
		switchingTab(firstTab);
        tc.clickonBuyNowBtn();
       System.out.println("Verify BuyNow Btn on Preprod Url");
        switchingTab(secondTab);
        tc.clickonBuyNowBtn();
        System.out.println("Verify BuyNow Btn on Live Url");
	}				
	@Test(priority=6,enabled=true)
	public void verifygetcouponLink() throws Throwable
	{
		switchingTab(firstTab);
        tc.clickongetcoupon();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        tc.clickongetcoupon();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}			
	@Test(priority=7,enabled=true)
	public void verifyProductdetailLink() throws Throwable
	{
		switchingTab(firstTab);
        tc.clickonproductdetail();
      System.out.println("product is Displayed on preprod url");
        switchingTab(secondTab);
        tc.clickonproductdetail();
        System.out.println("product is Displayed on Live url");
	}			
	@Test(priority=8,enabled=true)
	public void verifyDirectionLink() throws Throwable
	{
		switchingTab(firstTab);
        tc.clickonDirection();
      System.out.println("Direction is Displayed on preprod url");
        switchingTab(secondTab);
        tc.clickonDirection();
        System.out.println("Direction is Displayed on Live url");
	}		
	@Test(priority=9,enabled=true)
	public void verifyWarningLink() throws Throwable
	{
		switchingTab(firstTab);
        tc.clickonWarning();
      System.out.println("Warning is Displayed on preprod url");
        switchingTab(secondTab);
        tc.clickonWarning();
        System.out.println("Warning is Displayed on Live url");
	}		
	@Test(priority=10,enabled=true)
	public void verifyVaritiesLink() throws Throwable
	{
		switchingTab(firstTab);
        tc.clickonVarities();
      System.out.println("Varities is Displayed on preprod url");
        switchingTab(secondTab);
        tc.clickonVarities();
        System.out.println("Varities is Displayed on Live url");
	}		
	@Test(priority=11,enabled=true)
	public void verifySeeproductsLink() throws Throwable
	{
		switchingTab(firstTab);
        tc.clickonseeproducts();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        tc.clickonseeproducts();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}			
	@Test(priority=12,enabled=true)
	public void verifyYoutubebtnLink() throws Throwable
	{
		switchingTab(firstTab);
		tc.clickCookieBtn();
        tc.clickonYouTubeLink();
      System.out.println("Youtube is Displayed on preprod url");
        switchingTab(secondTab);
        tc.clickonYouTubeLink();
        System.out.println("Youtube is Displayed on Live url");
	}		
	@Test(priority=13,enabled=true)
	public void verifyReadMoreLink() throws Throwable
	{
		switchingTab(firstTab);
        tc.clickonreadmore();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        tc.clickonreadmore();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}			
	@Test(priority=14,enabled=true)
	public void verifyCompareAntacidLink() throws Throwable
	{
		switchingTab(firstTab);
        tc.clickoncompareAnatacid();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        tc.clickoncompareAnatacid();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}			
	
	@Test(priority=15,enabled=true)
	public void verifyCoolingsensationLink() throws Throwable
	{
		switchingTab(firstTab);
        tc.clickonCoolingsensation();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        tc.clickonCoolingsensation();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}			
	@Test(priority=16,enabled=true)
	public void verifyHeartburn101Link() throws Throwable
	{
		switchingTab(firstTab);
        tc.clickonHeartburn101();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        tc.clickonHeartburn101();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
