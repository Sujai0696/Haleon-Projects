package com.qa.tums.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;

import com.qa.tums.eng.pages.TumsHowtoReduceHeartBurnPages;

public class TumsHowtoReduceHeartBurnTest extends BaseClass {
	TumsHowtoReduceHeartBurnPages hr;
	

	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("tumsConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		hr=new TumsHowtoReduceHeartBurnPages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("tumsConfig.properties").getProperty("preProdHowtoReduceHeartBurnUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("tumsConfig.properties").getProperty("liveHowtoReduceHeartBurnUrl"));
		 }
	@Test(priority=1,enabled=true)
	public void verifyheartburnLink() throws Throwable
	{
		//hr=new HowtoReduceHeartBurnPages();
		
		switchingTab(firstTab);
        hr.clickonheartburns();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        hr.clickonheartburns();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}	
	@Test(priority=2,enabled=true)
	public void verifyreduceHeartBurnLink() throws Throwable
	{
		//hr=new HowtoReduceHeartBurnPages();
		//hr.clickCookiesDismissBtn();
		
		switchingTab(firstTab);
        hr.clickonreduceheartburn();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        hr.clickonreduceheartburn();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}
	@Test(priority=3,enabled=true)
	public void verifyhomeiconLink() throws Throwable
	{
		//hr=new HowtoReduceHeartBurnPages();
		//hr.clickCookiesDismissBtn();
		switchingTab(firstTab);
        hr.clickOnHomeIcon();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        hr.clickOnHomeIcon();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}
	@Test(priority=4,enabled=true)
	public void verifybreadcrumbLink() throws Throwable
	{
		//hr=new HowtoReduceHeartBurnPages();
		//hr.clickCookiesDismissBtn();
		switchingTab(firstTab);
        hr.clickOnHeartBurn101();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        hr.clickOnHeartBurn101();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}
//	@Test(priority=5,enabled=true)
//	public void verifytwitterLink() throws Throwable
//	{
//		//hr=new HowtoReduceHeartBurnPages();
//		//hr.clickCookiesDismissBtn();
//		switchingTab(firstTab);
//        hr.clickOnTwitter();
//       System.out.println("Click on Twitter on Preprod url");
//        switchingTab(secondTab);
//        hr.clickOnTwitter();
//        System.out.println("Click on Twitter on Preprod url");
//       
//	}
//	@Test(priority=6,enabled=true)
//	public void verifyfacebookLink() throws Throwable
//	{
//		//hr=new HowtoReduceHeartBurnPages();
//		//hr.clickCookiesDismissBtn();
//		switchingTab(firstTab);
//        hr.clickOnFaceBook();
//      System.out.println("Click on Facebook on Preprod url");
//        switchingTab(secondTab);
//        hr.clickOnFaceBook();
//        System.out.println("Click on Facebook on Live url");
//	}
//	@Test(priority=7,enabled=true)
//	public void verifyemailLink() throws Throwable
//	{
//		//hr=new HowtoReduceHeartBurnPages();
//		//hr.clickCookiesDismissBtn();
//		
//		switchingTab(firstTab);
//        hr.clickOnGmail();
//       System.out.println("Verify Gmail on preprod url");
//        switchingTab(secondTab);
//        hr.clickOnGmail();
//        System.out.println("Verify Gmail on Live url");
//	}
	@Test(priority=8,enabled=true)
	public void verifyspicyfoodLink() throws Throwable
	{
		switchingTab(firstTab);
        hr.clickOnspicyfood();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        hr.clickOnspicyfood();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
