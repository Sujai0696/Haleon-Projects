package com.qa.rinazina.it.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.rinazina.it.pages.RinazinaCondizioniPage;


public class RinazinaCondizioniTest extends BaseClass{
	
	RinazinaCondizioniPage rm;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("rinazina_itConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 rm=new RinazinaCondizioniPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("rinazina_itConfig.properties").getProperty("preProdRinazinaCondizioniUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("rinazina_itConfig.properties").getProperty("LiveRinazinaCondizioniUrl"));
		 }	
	 @Test(priority=0,enabled=true)
		public void verifyRinazinacookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        rm.clickonCookieBtn();
	        System.out.println("Verify Rinazina Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        rm.clickonCookieBtn();
	        System.out.println("Verify Rinazina Cookie Popup on Live Url");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyRinazinaHomeBreadcrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rm.clickonHomeBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rm.clickonHomeBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeBreadcrumbs:"+compareTwoText);
		}			
	 @Test(priority=2,enabled=true)
		public void verifyRinazinaCondizioniBreadcrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rm.clickonCondizioniBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rm.clickonCondizioniBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeBreadcrumbs:"+compareTwoText);
		}			
	
	 @Test(priority=3,enabled=true)
		public void verifyRinazinaPersaperenedipiuLink() throws Throwable
		{
		 switchingTab(firstTab);
	        rm.clickonpersaperenedipiu();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rm.clickonpersaperenedipiu();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Persaperenedipiu:"+compareTwoText);
		}			
	 @Test(priority=4,enabled=true)
		public void verifyRinazinaPersaperenedipiu1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        rm.clickonpersaperenedipiu1();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rm.clickonpersaperenedipiu1();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Persaperenedipiu1:"+compareTwoText);
		}			
	 @Test(priority=5,enabled=true)
		public void verifyRinazinaPersaperenedipiu2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        rm.clickonpersaperenedipiu2();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rm.clickonpersaperenedipiu2();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Persaperenedipiu2:"+compareTwoText);
		}			
	 @Test(priority=5,enabled=true)
		public void verifyRelatedArticle1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        rm.clickonArticlepage1();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rm.clickonArticlepage1();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for RelatedArticle1:"+compareTwoText);
		}		
	 @Test(priority=6,enabled=true)
		public void verifyRelatedArticle2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        rm.clickonArticlepage2();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rm.clickonArticlepage2();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for RelatedArticle2:"+compareTwoText);
		}		
	 @Test(priority=7,enabled=true)
		public void verifyRelatedArticle3Link() throws Throwable
		{
		 switchingTab(firstTab);
	        rm.clickonArticlepage3();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rm.clickonArticlepage3();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for RelatedArticle3:"+compareTwoText);
		}		
	 @Test(priority=8,enabled=true)
		public void verifyRelatedArticle4Link() throws Throwable
		{
		 switchingTab(firstTab);
	        rm.clickonArticlepage4();
	        String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
	        switchingTab(secondTab);
	        rm.clickonArticlepage4();
	        String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for RelatedArticle4:"+compareTwoText);
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
