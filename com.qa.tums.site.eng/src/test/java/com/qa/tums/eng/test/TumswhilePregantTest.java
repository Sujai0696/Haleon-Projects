package com.qa.tums.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.TumswhilePregantPages;

public class TumswhilePregantTest extends BaseClass{
	
	TumswhilePregantPages tr;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("tumsConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		tr=new TumswhilePregantPages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("tumsConfig.properties").getProperty("preProdTumswhilepregantUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("tumsConfig.properties").getProperty("liveTumswhilepregantUrl"));
		 }
	 @Test(priority=0,enabled=true)
		public void verifyCookieLink() throws Throwable
		{
			switchingTab(firstTab);
	        tr.clickCookieBtn();
	       System.out.println("Verify Cookie Btn on Preprod Url");
	        switchingTab(secondTab);
	        tr.clickCookieBtn();
	       System.out.println("Verify Cookie Btn on Live Url");
		}				
	
	@Test(priority=1,enabled=true)
	public void verifyhomebreadcrumbsLink() throws Throwable
	{
		switchingTab(firstTab);
        tr.clickonHeartburn101breadcrumbs();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        tr.clickonHeartburn101breadcrumbs();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}				
	@Test(priority=2,enabled=true)
	public void verifyTumspregancyLink() throws Throwable
	{
		switchingTab(firstTab);
        tr.clickonTumspregancy();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        tr.clickonTumspregancy();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}				
	@Test(priority=3,enabled=true)
	public void verifyTumsVideoLink() throws Throwable
	{
		switchingTab(firstTab);
        tr.clickonyoutube();  
       
       System.out.println("Video on preprod url");
        switchingTab(secondTab);
        tr.clickonyoutube();
       
       System.out.println("Video on Live url");
	}				
	@Test(priority=4,enabled=true)
	public void verifyTumspregancyTumswhilepregantLink() throws Throwable
	{
		switchingTab(firstTab);
        tr.clickonCantakeTumsonpregancy();
        System.out.println("Display Tums while pregant on preprod");
        switchingTab(secondTab);
        tr.clickonCantakeTumsonpregancy();
       System.out.println("Display Tums while pregant on Live");
	}				
	@Test(priority=5,enabled=true)
	public void verifyrecommendedbrandLink() throws Throwable
	{
		switchingTab(firstTab);
        tr.clickonrecommendedbrand();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        tr.clickonrecommendedbrand();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}				
	@Test(priority=6,enabled=true)
	public void verifycausesheartburnLink() throws Throwable
	{
		switchingTab(firstTab);
        tr.clickoncausesheartburn();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        tr.clickoncausesheartburn();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}				
	@Test(priority=7,enabled=true)
	public void verifysafeduringpregancyLink() throws Throwable
	{
		switchingTab(firstTab);
        tr.clickonsafeduringpregancy();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        tr.clickonsafeduringpregancy();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}				
	@Test(priority=8,enabled=true)
	public void verifyReferencesLink() throws Throwable
	{
		switchingTab(firstTab);
        tr.clickonReferences();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        tr.clickonReferences();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}				
	@Test(priority=9,enabled=true)
	public void verifyHeartburnsymptomsLink() throws Throwable
	{
		switchingTab(firstTab);
        tr.clickonheartburnsymptoms();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        tr.clickonheartburnsymptoms();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}				
	@Test(priority=10,enabled=true)
	public void verifyHeartburncausesLink() throws Throwable
	{
		switchingTab(firstTab);
        tr.clickonheartburncauses();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        tr.clickonheartburncauses();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}				
	
	@Test(priority=11,enabled=true)
	public void verifyfindingreliefLink() throws Throwable
	{
		switchingTab(firstTab);
        tr.clickonfindingrelief();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        tr.clickonfindingrelief();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}				
	@Test(priority=12,enabled=true)
	public void verifyKnowaboutheartburnpregancyLink() throws Throwable
	{
		switchingTab(firstTab);
        tr.clickonKnowaboutheartburnpregancy();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        tr.clickonKnowaboutheartburnpregancy();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}				
	@Test(priority=13,enabled=true)
	public void verifycausesheartburnpregancyLink() throws Throwable
	{
		switchingTab(firstTab);
        tr.clickoncausesheartburnpregancy();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        tr.clickoncausesheartburnpregancy();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}				
	@Test(priority=14,enabled=true)
	public void verifydealwithheartburnLink() throws Throwable
	{
		switchingTab(firstTab);
        tr.clickondealwithheartburn();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        tr.clickondealwithheartburn();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}			
	@Test(priority=15,enabled=true)
	public void verifyRemediesforpregancyLink() throws Throwable
	{
		switchingTab(firstTab);
        tr.clickonremediesduringpregancy();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        tr.clickonremediesduringpregancy();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}			
	@Test(priority=16,enabled=true)
	public void verifyStayhealthyLink() throws Throwable
	{
		switchingTab(firstTab);
        tr.clickonstayhealthy();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        tr.clickonstayhealthy();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}			
	@Test(priority=17,enabled=true)
	public void verifyfoodduringpregancyLink() throws Throwable
	{
		switchingTab(firstTab);
        tr.clickonfoodduringpregancy();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        tr.clickonfoodduringpregancy();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}			
	@Test(priority=18,enabled=true)
	public void verifyHeartburnearlysignLink() throws Throwable
	{
		switchingTab(firstTab);
        tr.clickonearlypregancysign();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        tr.clickonearlypregancysign();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}			
	
	@Test(priority=19,enabled=true)
	public void verifyprobioticpregancyLink() throws Throwable
	{
		switchingTab(firstTab);
        tr.clickonprobioticpregancy();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        tr.clickonprobioticpregancy();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}			
	
	@Test(priority=20,enabled=true)
	public void verifyseeproductsLink() throws Throwable
	{
		switchingTab(firstTab);
        tr.clickonseeproducts();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        tr.clickonseeproducts();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
