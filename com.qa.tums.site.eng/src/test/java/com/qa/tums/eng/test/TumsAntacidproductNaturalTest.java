package com.qa.tums.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.TumsAntacidproductNaturalPages;

public class TumsAntacidproductNaturalTest extends BaseClass{
	
	TumsAntacidproductNaturalPages ts;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("tumsConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		ts=new TumsAntacidproductNaturalPages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("tumsConfig.properties").getProperty("preProdTumsAntacidproductsNaturalUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("tumsConfig.properties").getProperty("liveTumsAntacidproductsNaturalUrl"));
		 }
	 @Test(priority=0,enabled=true)
		public void verifyCookieLink() throws Throwable
		{
			switchingTab(firstTab);
	        ts.clickCookieBtn();
	        System.out.println("Cookie Button is verified in Preprod Url");
	        switchingTab(secondTab);
	        ts.clickCookieBtn();
	        System.out.println("Cookie Button is verified in Live Url");
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
	public void verifyTumsnaturalLink() throws Throwable
	{
		switchingTab(firstTab);
        ts.clickontumsnatural();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickontumsnatural();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}
	@Test(priority=4,enabled=true)
	public void verifyTumsnaturalReviewLink() throws Throwable
	{
		switchingTab(firstTab);
        ts.clickonTumsnaturalReview();
      System.out.println("Review is Displayed on preprod url");
        switchingTab(secondTab);
        ts.clickonTumsnaturalReview();
        System.out.println("Review is Displayed on Live url");
	}		
	
	@Test(priority=5,enabled=true)
	public void verifyTumsnaturalBuyNowLink() throws Throwable
	{
		switchingTab(firstTab);
        ts.clickonTumsnaturalBuynow();
      System.out.println("BuyNow is Displayed on preprod url");
        switchingTab(secondTab);
        ts.clickonTumsnaturalBuynow();
        System.out.println("BuyNow is Displayed on Live url");
	}			
	@Test(priority=6,enabled=true)
	public void verifygetcouponsLink() throws Throwable
	{
		switchingTab(firstTab);
        ts.clickongetcoupons();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickongetcoupons();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}			
	@Test(priority=7,enabled=true)
	public void verifyProductdetailLink() throws Throwable
	{
		switchingTab(firstTab);
        ts.clickonproductdetail();
      System.out.println("product is Displayed on preprod url");
        switchingTab(secondTab);
        ts.clickonproductdetail();
        System.out.println("product is Displayed on Live url");
	}			
	@Test(priority=8,enabled=true)
	public void verifyDirectionLink() throws Throwable
	{
		switchingTab(firstTab);
        ts.clickonDirection();
      System.out.println("Direction is Displayed on preprod url");
        switchingTab(secondTab);
        ts.clickonDirection();
        System.out.println("Direction is Displayed on Live url");
	}		
	@Test(priority=9,enabled=true)
	public void verifyWarningLink() throws Throwable
	{
		switchingTab(firstTab);
        ts.clickonWarning();
      System.out.println("Warning is Displayed on preprod url");
        switchingTab(secondTab);
        ts.clickonWarning();
        System.out.println("Warning is Displayed on Live url");
	}		
	@Test(priority=10,enabled=true)
	public void verifyVaritiesLink() throws Throwable
	{
		switchingTab(firstTab);
        ts.clickonVarities();
      System.out.println("Varities is Displayed on preprod url");
        switchingTab(secondTab);
        ts.clickonVarities();
        System.out.println("Varities is Displayed on Live url");
	}		
	@Test(priority=11,enabled=true)
	public void verifySeeproductsLink() throws Throwable
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
	@Test(priority=12,enabled=true)
	public void verifyYoutubebtnLink() throws Throwable
	{
		switchingTab(firstTab);
        ts.clickonYouTubeLink();
      System.out.println("Youtube is Displayed on preprod url");
        switchingTab(secondTab);
        ts.clickonYouTubeLink();
        System.out.println("Youtube is Displayed on Live url");
	}		
	@Test(priority=13,enabled=true)
	public void verifyReadMoreLink() throws Throwable
	{
		switchingTab(firstTab);
        ts.clickonreadmore();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonreadmore();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}			
	@Test(priority=14,enabled=true)
	public void verifyCompareAntacidLink() throws Throwable
	{
		switchingTab(firstTab);
        ts.clickoncompareAnatacid();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickoncompareAnatacid();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}			
	
	@Test(priority=15,enabled=true)
	public void verifyCoolingsensationLink() throws Throwable
	{
		switchingTab(firstTab);
        ts.clickonCoolingsensation();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonCoolingsensation();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}			
	@Test(priority=16,enabled=true)
	public void verifyHeartburn101Link() throws Throwable
	{
		switchingTab(firstTab);
        ts.clickonHeartburn101();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonHeartburn101();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
