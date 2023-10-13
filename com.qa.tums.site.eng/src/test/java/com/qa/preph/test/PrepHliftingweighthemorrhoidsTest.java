package com.qa.preph.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.preph.pages.PrepHliftingweighthemorrhoidsPage;


public class PrepHliftingweighthemorrhoidsTest extends BaseClass{
	
	PrepHliftingweighthemorrhoidsPage plw;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("preph_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 plw=new PrepHliftingweighthemorrhoidsPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("preph_Config.properties").getProperty("preProdLiftingWeightHemorrhoidsUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("preph_Config.properties").getProperty("LiveLiftingWeightHemorrhoidsUrl"));
		 }	
	 
	 @Test(priority=0,enabled=true)
		public void verifyPreph_cookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        plw.clickonCookieBtn();
	        System.out.println("Verify Preph Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        plw.clickonCookieBtn();
	        System.out.println("Verify Preph Cookie Popup on Live Url");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyHomeBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        plw.clickonHomeBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        plw.clickonHomeBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeBreadcrumbs:"+compareTwoText);
		}												
	 @Test(priority=2,enabled=true)
		public void verifyArticleBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        plw.clickonArticleBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        plw.clickonArticleBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ArticleBreadcrumbs:"+compareTwoText);
		}							
	 @Test(priority=3,enabled=true)
		public void verifyLiftingWeightBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        plw.clickonLiftingWeightsBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        plw.clickonLiftingWeightsBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for LiftingweightBreadcrumbs:"+compareTwoText);
		}							
	 @Test(priority=4,enabled=true)
		public void verifyHemorrhoids1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        plw.clickonHemorrhoids1();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        plw.clickonHemorrhoids1();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Hemorrhoids1:"+compareTwoText);
		}							
	 @Test(priority=5,enabled=true)
		public void verifyHemorrhoids2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        plw.clickonHemorrhoids2();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        plw.clickonHemorrhoids2();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Hemorrhoids2:"+compareTwoText);
		}						
	 @Test(priority=6,enabled=true)
		public void verifyExercisePreventsHemorrhoidsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        plw.clickonExercisepreventsHemorrhoids();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        plw.clickonExercisepreventsHemorrhoids();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ExercisePreventsHemorrhoids:"+compareTwoText);
		}						
	 @Test(priority=7,enabled=true)
		public void verifyTreatpersentlypainfulhemorrhoidsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        plw.clickonTreatpersententlypainfulhermmohoids();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        plw.clickonTreatpersententlypainfulhermmohoids();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for treatpersentlypainfulhemorrhoids:"+compareTwoText);
		}						
	 @Test(priority=8,enabled=true)
		public void verifyReadMore1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        plw.clickonReadMore1();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        plw.clickonReadMore1();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Readmore1:"+compareTwoText);
		}					
	 @Test(priority=9,enabled=true)
		public void verifyReadMore2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        plw.clickonReadMore2();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        plw.clickonReadMore2();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Readmore2:"+compareTwoText);
		}					
	 @Test(priority=10,enabled=true)
		public void verifyReadMore3Link() throws Throwable
		{
		 switchingTab(firstTab);
	        plw.clickonReadMore3();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        plw.clickonReadMore3();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Readmore3:"+compareTwoText);
		}					
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
