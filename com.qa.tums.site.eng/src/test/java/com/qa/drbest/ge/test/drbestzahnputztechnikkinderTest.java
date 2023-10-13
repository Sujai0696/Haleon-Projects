package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.drbestzahnputztechnikkinderPage;

public class drbestzahnputztechnikkinderTest extends BaseClass{
	
	drbestzahnputztechnikkinderPage db;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("drbest_deConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 db=new drbestzahnputztechnikkinderPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("drbest_deConfig.properties").getProperty("preProddrbeszahnputztechnikinderUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("drbest_deConfig.properties").getProperty("LivedrbeszahnputztechnikinderUrl"));
		 }	
	 @Test(priority=0,enabled=true)
		public void verifydrbestcookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        db.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        db.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Live Url");
		}								
	 @Test(priority=1,enabled=true)
		public void verifyKindesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        db.clickonKindes();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        db.clickonKindes();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Kindes:"+compareTwoText);
		}		
	 @Test(priority=2,enabled=true)
		public void verifyErsteZahneLink() throws Throwable
		{
		 switchingTab(firstTab);
	        db.clickonErsteZahne();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        db.clickonErsteZahne();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ErsteZahne:"+compareTwoText);
		}		
	 @Test(priority=3,enabled=true)
		public void verifyErsteZahneProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        db.clickonErsteZahneProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        db.clickonErsteZahneProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ErsteZahne Product:"+compareTwoText);
		}		
	 @Test(priority=4,enabled=true)
		public void verifyErsteZahneBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        db.clickonErsteZahneBuYNow();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        db.clickonErsteZahneBuYNow();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ErsteZahne BuyNow:"+compareTwoText);
		}		
	 @Test(priority=5,enabled=true)
		public void verifyBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        db.clickonBuYNow();
	       System.out.println("Verify the Links on Preprod Url");
	        switchingTab(secondTab);
	        db.clickonBuYNow();
	        System.out.println("Verify the Links on Live Url");
		}		
	 @Test(priority=5,enabled=true)
		public void verifyMilchzahnLink() throws Throwable
		{
		 switchingTab(firstTab);
	        db.clickonMilchzahn();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        db.clickonMilchzahn();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Milchzahn:"+compareTwoText);
		}		
	 @Test(priority=6,enabled=true)
		public void verifyMilchzahnProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        db.clickonMilchzahnProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        db.clickonMilchzahnProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for MilchzahnProduct:"+compareTwoText);
		}		
	 @Test(priority=7,enabled=true)
		public void verifyMilchzahnBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        db.clickonMilchzahnBuYNow();
	       System.out.println("MilchzahnBuyNow is Displayed on Preprod Url");
	        switchingTab(secondTab);
	        db.clickonMilchzahnBuYNow();
	       System.out.println("MilchzahnBuyNow is Displayed on Live Url");
		}		
	 @Test(priority=8,enabled=true)
		public void verifyArticle1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        db.clickonArticle1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        db.clickonArticle1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Article1:"+compareTwoText);
		}		
	 @Test(priority=9,enabled=true)
		public void verifyRelatedLink1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        db.clickonLink1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        db.clickonLink1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Link1:"+compareTwoText);
		}		
	 @Test(priority=10,enabled=true)
		public void verifyArticle2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        db.clickonArticle2();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        db.clickonArticle2();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Article2:"+compareTwoText);
		}		
	 @Test(priority=11,enabled=true)
		public void verifyRelatedLink2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        db.clickonLink2();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        db.clickonLink2();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Link2:"+compareTwoText);
		}		
	 @Test(priority=12,enabled=true)
		public void verifyArticle3Link() throws Throwable
		{
		 switchingTab(firstTab);
	        db.clickonArticle3();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        db.clickonArticle3();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Article3:"+compareTwoText);
		}		
	 @Test(priority=13,enabled=true)
		public void verifyRelatedlink33Link() throws Throwable
		{
		 switchingTab(firstTab);
	        db.clickonlink3();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        db.clickonlink3();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Link3:"+compareTwoText);
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
