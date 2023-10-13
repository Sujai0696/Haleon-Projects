package com.qa.tums.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.TumsAntacidchewybitesPages;

public class TumsAntacidchewybitesTest extends BaseClass {
	
	TumsAntacidchewybitesPages ta;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("tumsConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		ta=new TumsAntacidchewybitesPages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("tumsConfig.properties").getProperty("preProdTumsAntacidchewybitesUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("tumsConfig.properties").getProperty("liveTumsAntacidproductschewybitesUrl"));
		 }
	 @Test(priority=0,enabled=true)
		public void verifyCookieLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ta.clickCookieBtn();
	       System.out.println("Verify Cookie button on preprod url");
	        switchingTab(secondTab);
	        ta.clickCookieBtn();
	        System.out.println("Verify cookie on Live url");
		}		
	 
	
	@Test(priority=1,enabled=true)
	public void verifyhomebreadcrumbsLink() throws Throwable
	{
		switchingTab(firstTab);
        ta.clickonhomebreadcrumbs();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ta.clickonhomebreadcrumbs();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}				
	@Test(priority=2,enabled=true)
	public void verifyproductselectorbreadcrumbsLink() throws Throwable
	{
		switchingTab(firstTab);
        ta.clickonproductselector();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ta.clickonproductselector();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}						
	@Test(priority=3,enabled=true)
	public void verifychewybitebreadcrumbsbreadcrumbsLink() throws Throwable
	{
		switchingTab(firstTab);
        ta.clickonchewybitebreadcrumbs();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ta.clickonchewybitebreadcrumbs();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}						
	
	@Test(priority=4,enabled=true)
	public void verifyReviewLink() throws Throwable
	{
		switchingTab(firstTab);
        ta.clickonReviewBtn();
       System.out.println("Verify Review Btn on Preprod Url");
        switchingTab(secondTab);
        ta.clickonReviewBtn();
        System.out.println("Verify Review Btn on Live Url");
	}				
	@Test(priority=5,enabled=true)
	public void verifyBuyNowLink() throws Throwable
	{
		switchingTab(firstTab);
        ta.clickonBuyNowBtn();
       System.out.println("Verify BuyNow Btn on Preprod Url");
        switchingTab(secondTab);
        ta.clickonBuyNowBtn();
        System.out.println("Verify BuyNow Btn on Live Url");
	}				
	@Test(priority=6,enabled=true)
	public void verifygetcouponLink() throws Throwable
	{
		switchingTab(firstTab);
        ta.clickongetcouponBtn();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ta.clickongetcouponBtn();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}					
	@Test(priority=7,enabled=true)
	public void verifyProductdetailLink() throws Throwable
	{
		switchingTab(firstTab);
        ta.clickonproductdetail();
      System.out.println("product is Displayed on preprod url");
        switchingTab(secondTab);
        ta.clickonproductdetail();
        System.out.println("product is Displayed on Live url");
	}			
	@Test(priority=8,enabled=true)
	public void verifyDirectionLink() throws Throwable
	{
		switchingTab(firstTab);
        ta.clickonDirection();
      System.out.println("Direction is Displayed on preprod url");
        switchingTab(secondTab);
        ta.clickonDirection();
        System.out.println("Direction is Displayed on Live url");
	}		
	@Test(priority=9,enabled=true)
	public void verifyWarningLink() throws Throwable
	{
		switchingTab(firstTab);
        ta.clickonWarning();
      System.out.println("Warning is Displayed on preprod url");
        switchingTab(secondTab);
        ta.clickonWarning();
        System.out.println("Warning is Displayed on Live url");
	}		
	@Test(priority=10,enabled=true)
	public void verifyVaritiesLink() throws Throwable
	{
		switchingTab(firstTab);
        ta.clickonVarities();
      System.out.println("Varities is Displayed on preprod url");
        switchingTab(secondTab);
        ta.clickonVarities();
        System.out.println("Varities is Displayed on Live url");
	}		
	@Test(priority=11,enabled=true)
	public void verifySeeproductsLink() throws Throwable
	{
		switchingTab(firstTab);
        ta.clickonseeproducts();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ta.clickonseeproducts();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}			
	@Test(priority=12,enabled=true)
	public void verifyYoutubebtnLink() throws Throwable
	{
		switchingTab(firstTab);
        ta.clickonYoutubelink();
      System.out.println("Youtube is Displayed on preprod url");
        switchingTab(secondTab);
        ta.clickonYoutubelink();
        System.out.println("Youtube is Displayed on Live url");
	}		
	@Test(priority=13,enabled=true)
	public void verifyReadMoreLink() throws Throwable
	{
		switchingTab(firstTab);
        ta.clickonreadmore();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ta.clickonreadmore();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}			
	@Test(priority=14,enabled=true)
	public void verifyCompareAntacidLink() throws Throwable
	{
		switchingTab(firstTab);
        ta.clickoncompareAnatacid();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ta.clickoncompareAnatacid();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}			
	
	@Test(priority=15,enabled=true)
	public void verifyCoolingsensationLink() throws Throwable
	{
		switchingTab(firstTab);
        ta.clickonCoolingsensation();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ta.clickonCoolingsensation();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}			
	@Test(priority=16,enabled=true)
	public void verifyHeartburn101Link() throws Throwable
	{
		switchingTab(firstTab);
        ta.clickonHeartburn101();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ta.clickonHeartburn101();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
