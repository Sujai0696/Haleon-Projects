package com.qa.tums.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.TumsUpsetStomachPages;

public class TumsUpsetStomachTest extends BaseClass {
	TumsUpsetStomachPages us;
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("tumsConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		us=new TumsUpsetStomachPages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("tumsConfig.properties").getProperty("preProdUpsetStomachaftereatingUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("tumsConfig.properties").getProperty("liveUpsetStomachaftereatingUrl"));
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
	public void verifyUpsetBreadcrumbsLink() throws Throwable
	{
		
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        us.clickonupsetstomach();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        us.clickonupsetstomach();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}
	@Test(priority=2,enabled=true)
	public void verifyupsetstomachBreadcrumbsLink() throws Throwable
	{
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        us.clickonupsetstomachBreadcrumbs();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        us.clickonupsetstomachBreadcrumbs();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}
//	@Test(priority=3,enabled=true)
//	public void verifytwitterLink() throws Throwable
//	{
//		us=new UpsetStomachPages();
//		us.clickCookiesDismissBtn();
//		us.clickOnHeadTwitter();
//	}
//	@Test(priority=4,enabled=true)
//	public void verifyFacebookLink() throws Throwable
//	{
//		us=new UpsetStomachPages();
//		us.clickCookiesDismissBtn();
//		us.clickOnHeadFace();
//	}
//	@Test(priority=5,enabled=true)
//	public void verifyemailLink() throws Throwable
//	{
//		us=new UpsetStomachPages();
//		us.clickCookiesDismissBtn();
//		us.clickOnemail();
//	}
	@Test(priority=3,enabled=true)
	public void verifyindigestionheartburnLink() throws Throwable
	{
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        us.clickonindigsetionheartbuen();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        us.clickonindigsetionheartbuen();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}
	@Test(priority=4,enabled=true)
	public void verifyupsetstomachLink() throws Throwable
	{
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        us.clickonupsetstomach();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        us.clickonupsetstomach();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}
	@Test(priority=5,enabled=true)
	public void verifyheartburnsLink() throws Throwable
	{
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        us.clickonheartburns();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        us.clickonheartburns();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}
	@Test(priority=6,enabled=true)
	public void verifyGerdLink() throws Throwable
	{
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        us.clickongerd();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        us.clickongerd();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}
	@Test(priority=7,enabled=true)
	public void verifyTrysaladLink() throws Throwable
	{
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        us.clickontrysalad();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        us.clickontrysalad();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}
	
	@Test(priority=8,enabled=true)
	public void verifySeeproductsLink() throws Throwable
	{
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        us.clickonseeproducts();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        us.clickonseeproducts();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
