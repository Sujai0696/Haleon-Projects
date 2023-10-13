package com.qa.tums.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.TumsHowTumsWorkPages;

public class TumsHowTumsWorkTest extends BaseClass {
	
	TumsHowTumsWorkPages ht;
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("tumsConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		ht=new TumsHowTumsWorkPages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("tumsConfig.properties").getProperty("preProdHowtumsworkUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("tumsConfig.properties").getProperty("liveHowtumsworkUrl"));
		 }
	 @Test(priority=0,enabled=true)
		public void verifyCookieLink() throws Throwable
		{
			switchingTab(firstTab);
	        ht.clickCookieBtn();
	       System.out.println("Verify Cookie Btn on Preprod Url");
	        switchingTab(secondTab);
	        ht.clickCookieBtn();
	       System.out.println("Verify Cookie Btn on Live Url");
		}		
	
	@Test(priority=1,enabled=true)
	public void verifyheartburnLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ht.clickonheartburns();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ht.clickonheartburns();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}	
	@Test(priority=2,enabled=true)
	public void verifyhowtumssworkLink() throws Throwable
	{
	   
		switchingTab(firstTab);
        ht.clickonhowtumsswork();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ht.clickonhowtumsswork();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}
	@Test(priority=3,enabled=true)
	public void verifyhomeiconLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ht.clickOnHomeIcon();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ht.clickOnHomeIcon();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}
	@Test(priority=4,enabled=true)
	public void verifybreadcrumbLink() throws Throwable
	{
		switchingTab(firstTab);
        ht.clickOnHeartBurn101();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ht.clickOnHeartBurn101();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}
	@Test(priority=5,enabled=true)
	public void verifyspicyorfattyacidsLink() throws Throwable
	{
		switchingTab(firstTab);
        ht.clickOnspicyorfattyacids();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ht.clickOnspicyorfattyacids();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}
	@Test(priority=6,enabled=true)
	public void verifyYoutubeLink() throws Throwable
	{
		switchingTab(firstTab);
        ht.clickonYouTubeLink();
        System.out.println("Verify youtube on Preprod url");
        switchingTab(secondTab);
        ht.clickonYouTubeLink();
        System.out.println("Verify youtube on Live url");
	}
	@Test(priority=7,enabled=true)
	public void verifyantacidsLink() throws Throwable
	{
		switchingTab(firstTab);
        ht.clickOnantiacids();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ht.clickOnantiacids();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}
	@Test(priority=7,enabled=true)
	public void verifySeeproductsLink() throws Throwable
	{
		switchingTab(firstTab);
        ht.clickOnseeproducts();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ht.clickOnseeproducts();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
