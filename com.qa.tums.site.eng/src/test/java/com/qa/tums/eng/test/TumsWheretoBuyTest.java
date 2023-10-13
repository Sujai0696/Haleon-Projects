package com.qa.tums.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.TumsWheretoBuyPages;

public class TumsWheretoBuyTest extends BaseClass{
	
	TumsWheretoBuyPages us;
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("tumsConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		us=new TumsWheretoBuyPages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("tumsConfig.properties").getProperty("preProdTumsWheretoBuyUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("tumsConfig.properties").getProperty("liveTumsWheretoBuyUrl"));
		 }
	 @Test(priority=0,enabled=true)
		public void verifyCookieLink() throws Throwable
		{
			switchingTab(firstTab);
	        us.clickCookieBtn();
	       System.out.println("Verify Cookie Btn on Preprod Url");
	        switchingTab(secondTab);
	        us.clickCookieBtn();
	       System.out.println("Verify Cookie Btn on Live Url");
		}		
		
	@Test(priority=1,enabled=true)
	public void verifyHomeBreadcrumbsLink() throws Throwable
	{
		
		switchingTab(firstTab);
		
        us.clickonHomebreadcrumbs();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
      
        us.clickonHomebreadcrumbs();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}	
	@Test(priority=2,enabled=true)
	public void verifyWheretoBuyBreadcrumbsLink() throws Throwable
	{
		
		switchingTab(firstTab);
		
        us.clickonWheretobuybreadcrumbs();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
      
        us.clickonWheretobuybreadcrumbs();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}	
	@Test(priority=3,enabled=true)
	public void verifyDropdownchewybiteLink() throws Throwable
	{
		
		switchingTab(firstTab);
		
        us.clickondropdownchewybite();
       System.out.println("Chewybites is displayed on Preprod url");
        switchingTab(secondTab);
      
        us.clickondropdownchewybite();
       System.out.println("Chewybites is displayed on Live url");
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
