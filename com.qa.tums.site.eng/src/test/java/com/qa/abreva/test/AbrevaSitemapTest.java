package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.abreva.pages.AbrevaSitemapPage;


public class AbrevaSitemapTest extends BaseClass{
	
	AbrevaSitemapPage ac;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 ac=new AbrevaSitemapPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("abreva_Config.properties").getProperty("preProdAbrevaSitemapUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("abreva_Config.properties").getProperty("LiveAbrevaSitemapUrl"));
		 }	
	 @Test(priority=0,enabled=true)
		public void verifyAbrevacookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        ac.clickonCookieBtn();
	        System.out.println("Verify Abreva Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonCookieBtn();
	        System.out.println("Verify Abreva Cookie Popup on Live Url");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyHomeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonhome();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonhome();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for home:"+compareTwoText);
		}										
	 @Test(priority=2,enabled=true)
		public void verifycoldsorefirstsignsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickoncoldsorefirstsigns();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickoncoldsorefirstsigns();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for coldsorefirst signs:"+compareTwoText);
		}						
	 @Test(priority=3,enabled=true)
		public void verifycontactusLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickoncontactus();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickoncontactus();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Contact us:"+compareTwoText);
		}			
	 @Test(priority=4,enabled=true)
		public void verifyCouponsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonCoupons();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonCoupons();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Coupons:"+compareTwoText);
		}			
	 @Test(priority=5,enabled=true)
		public void verifyWheretobuyLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonWheretobuy();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonWheretobuy();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Where to buy:"+compareTwoText);
		}			
	 @Test(priority=6,enabled=true)
		public void verifyAbrevaProductsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonAbrevaProducts();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonAbrevaProducts();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Abreva Products:"+compareTwoText);
		}			
	 @Test(priority=7,enabled=true)
		public void verifyAbrevacreamLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonAbrevaCream();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonAbrevaCream();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Abreva Cream:"+compareTwoText);
		}			
	 @Test(priority=8,enabled=true)
		public void verifyAbrevacreamworksLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonAbrevaCreamworks();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonAbrevaCreamworks();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Abreva Cream works:"+compareTwoText);
		}			
	 @Test(priority=9,enabled=true)
		public void verifyAbrevacreamUseLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonAbrevaCreamuse();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonAbrevaCreamuse();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Abreva Cream Use:"+compareTwoText);
		}			
	 @Test(priority=10,enabled=true)
		public void verifyAbrevaReviewsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonAbrevaReviews();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonAbrevaReviews();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Abreva Reviews:"+compareTwoText);
		}			
	 @Test(priority=11,enabled=true)
		public void verifyWriteReviewLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonWriteReviews();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonWriteReviews();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Write Reviews:"+compareTwoText);
		}			
	 @Test(priority=12,enabled=true)
		public void verifyAboutcoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonAboutcoldsores();;
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonAboutcoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for About Cold sores:"+compareTwoText);
		}			
	 @Test(priority=13,enabled=true)
		public void verifyWhatareColdsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonWhatarecoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonWhatarecoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for What are Cold sores:"+compareTwoText);
		}			
	 @Test(priority=14,enabled=true)
		public void verifyColdsoresSpreadLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickoncoldsoresspread();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickoncoldsoresspread();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cold sores spread:"+compareTwoText);
		}			
	 @Test(priority=15,enabled=true)
		public void verifyColdsoreTriggersLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickoncoldsorestriggers();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickoncoldsorestriggers();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cold sores Triggers:"+compareTwoText);
		}			
	 @Test(priority=16,enabled=true)
		public void verifyColdsoreTreatmentLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickoncoldsorestreatment();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickoncoldsorestreatment();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cold sores Treatment:"+compareTwoText);
		}			
	 @Test(priority=17,enabled=true)
		public void verifyColdsorefactsmythLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickoncoldsoresfactsmyths();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickoncoldsoresfactsmyths();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cold sores facts myths:"+compareTwoText);
		}			
	 @Test(priority=18,enabled=true)
		public void verifyExplorecoldsorestagesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonExplorecoldstorestages();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonExplorecoldstorestages();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Explore cold store stages:"+compareTwoText);
		}			
	
	 @Test(priority=19,enabled=true)
		public void verifyTakecarewintersLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickontakecareWinters();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickontakecareWinters();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Take care winters:"+compareTwoText);
		}			
	 @Test(priority=20,enabled=true)
		public void verifyColdsorepimplesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonColdsorespimples();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonColdsorespimples();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Coldsore pimples:"+compareTwoText);
		}			
	 @Test(priority=21,enabled=true)
		public void verifyTypescoldsoresmedicineLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickontypescoldsoresmedicine();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickontypescoldsoresmedicine();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Types cold sores medicine:"+compareTwoText);
		}			
	 @Test(priority=22,enabled=true)
		public void verifykidscoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonkidscoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonkidscoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for kids cold sores:"+compareTwoText);
		}			
	 @Test(priority=23,enabled=true)
		public void verifyManagingliphealthLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonManagingliphealth();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonManagingliphealth();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for managingliphealth:"+compareTwoText);
		}			
	 @Test(priority=24,enabled=true)
		public void verifyStresscoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonstresscoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonstresscoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same forstresscold sores:"+compareTwoText);
		}			
	 @Test(priority=25,enabled=true)
		public void verifyAloeveracoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonAloeveracoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonAloeveracoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for aloe vera cold sores:"+compareTwoText);
		}			
	 @Test(priority=26,enabled=true)
		public void verifykeepgettingcoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonkeepgettingcoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonkeepgettingcoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for keep getting cold sores:"+compareTwoText);
		}			
	 @Test(priority=27,enabled=true)
		public void verifycommonlipproblemsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickoncommonlipproblems();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickoncommonlipproblems();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for commonlip problems:"+compareTwoText);
		}			
	 @Test(priority=28,enabled=true)
		public void verifyColdsorefactscheckLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickoncoldsorefactscheck();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickoncoldsorefactscheck();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cold sore facts check:"+compareTwoText);
		}			
	 @Test(priority=29,enabled=true)
		public void verifyParentsguideLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonparentsguide();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonparentsguide();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Parents guide:"+compareTwoText);
		}			
	 @Test(priority=30,enabled=true)
		public void verifyManagingTriggersLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonmanagingtriggers();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonmanagingtriggers();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for managing Triggers:"+compareTwoText);
		}			
	 @Test(priority=31,enabled=true)
		public void verifyWeatherwinterLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonWeatherwinter();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonWeatherwinter();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Weather winter:"+compareTwoText);
		}			
	 @Test(priority=32,enabled=true)
		public void verifySuncoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonSuncoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonSuncoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Sun cold sores:"+compareTwoText);
		}			
	
	 @Test(priority=33,enabled=true)
		public void verifySpotshadeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonSpotshade();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonSpotshade();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for spot shades:"+compareTwoText);
		}			
	 @Test(priority=34,enabled=true)
		public void verifygetyourzzzsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickongetyourzzzs();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickongetyourzzzs();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for get your zzzs:"+compareTwoText);
		}			
	 @Test(priority=35,enabled=true)
		public void verifygetmovingLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickongetmoving();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickongetmoving();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for get moving:"+compareTwoText);
		}			
	 @Test(priority=36,enabled=true)
		public void verifypumpyourbrainLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonpumpyourbrain();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonpumpyourbrain();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for pump your brain:"+compareTwoText);
		}			
	 @Test(priority=37,enabled=true)
		public void verifytakeiteasyLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickontakeiteasy();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickontakeiteasy();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for takeiteasy:"+compareTwoText);
		}			
	 @Test(priority=38,enabled=true)
		public void verifyfacefinancesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonfacefinances();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonfacefinances();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for face finances:"+compareTwoText);
		}			
	 @Test(priority=39,enabled=true)
		public void verifyCopeillnessLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickoncopeillness();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickoncopeillness();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cope illness:"+compareTwoText);
		}			
	 @Test(priority=40,enabled=true)
		public void verifyCoffeebreakLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickoncoffeebreak();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickoncoffeebreak();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Coffee break:"+compareTwoText);
		}			
	 @Test(priority=41,enabled=true)
		public void verifyplanforimportantdaysLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonplanimportantdays();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonplanimportantdays();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for plan important days:"+compareTwoText);
		}			
	 @Test(priority=42,enabled=true)
		public void verifyperoidpregancyLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonperoidpregancy();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonperoidpregancy();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for peroid pregancy:"+compareTwoText);
		}			
	 @Test(priority=43,enabled=true)
		public void verifyDentistvisitLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonDentistvisit();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonDentistvisit();;
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Dentist Visit:"+compareTwoText);
		}			
	 @Test(priority=44,enabled=true)
		public void verifyPreventionLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonPrevention();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonPrevention();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Prevention:"+compareTwoText);
		}			
	 @Test(priority=45,enabled=true)
		public void verifylipfillersLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonlipfillers();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonlipfillers();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for lipfillers:"+compareTwoText);
		}			
	 @Test(priority=46,enabled=true)
		public void verifySummervaccationplanningLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonsummervaccationplanning();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonsummervaccationplanning();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for summer vaccation plannning:"+compareTwoText);
		}			
	 @Test(priority=47,enabled=true)
		public void verifyAntiviralcoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonAntiviralcoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonAntiviralcoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Antiviral cold sores:"+compareTwoText);
		}			
	 @Test(priority=48,enabled=true)
		public void verifyDealingColdsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonDealingcoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonDealingcoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Dealing cold sores:"+compareTwoText);
		}			
	 @Test(priority=49,enabled=true)
		public void verifygetridcoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickongetridcoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickongetridcoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Get rid cold sores:"+compareTwoText);
		}			
	 @Test(priority=50,enabled=true)
		public void verifyfeelmoreconfidentLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonfeelmoreconfident();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonfeelmoreconfident();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for feel more confident:"+compareTwoText);
		}			
	 @Test(priority=51,enabled=true)
		public void verifyConcealcoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonConcealcoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonConcealcoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same forConceal cold sores:"+compareTwoText);
		}			
	 @Test(priority=52,enabled=true)
		public void verifykisstellLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonkisstell();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonkisstell();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for kiss tell:"+compareTwoText);
		}			
	 @Test(priority=53,enabled=true)
		public void verifyfeverblistercoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonfeverblister();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonfeverblister();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for fever blister:"+compareTwoText);
		}			
	 @Test(priority=54,enabled=true)
		public void verifywaysridcoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonwaysridcoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonwaysridcoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ways rid cold sores:"+compareTwoText);
		}			
	 
	 @Test(priority=55,enabled=true)
		public void verifyfacecoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonfacecoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonfacecoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for face cold sores:"+compareTwoText);
		}			
	 @Test(priority=55,enabled=true)
		public void verifycoldsoresremediesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickoncoldsoresremedies();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickoncoldsoresremedies();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for  cold sores remedies:"+compareTwoText);
		}			
	 @Test(priority=56,enabled=true)
		public void verifyDealcoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickondealcoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickondealcoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for  Deal cold sores:"+compareTwoText);
		}			
	 @Test(priority=57,enabled=true)
		public void verifycoldsoreconfessionLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickoncoldsoresconfession();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickoncoldsoresconfession();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for   cold sores confession:"+compareTwoText);
		}			
	 @Test(priority=58,enabled=true)
		public void verifystopspreadLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonstopspread();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonstopspread();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for   stop spread:"+compareTwoText);
		}			
	 @Test(priority=59,enabled=true)
		public void verifyhowtostopcoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonhowtostopcoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonhowtostopcoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for   how to stop cold sores:"+compareTwoText);
		}			
	 @Test(priority=60,enabled=true)
		public void verifytoothpastecoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickontoothpastecoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickontoothpastecoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for tooth paste cold sores:"+compareTwoText);
		}			
	 @Test(priority=61,enabled=true)
		public void verifynosecoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonnosecoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonnosecoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for nose cold sores:"+compareTwoText);
		}			
	 @Test(priority=62,enabled=true)
		public void verifytreatcoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickontreatcoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickontreatcoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for treat cold sores:"+compareTwoText);
		}			
	 @Test(priority=63,enabled=true)
		public void verifycoldsorescabLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickoncoldsorescab();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickoncoldsorescab();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for  cold sores scab:"+compareTwoText);
		}			
	 @Test(priority=64,enabled=true)
		public void verifycoldsorenoseLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickoncoldsorenose();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickoncoldsorenose();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for  cold sores nose:"+compareTwoText);
		}			
	 @Test(priority=65,enabled=true)
		public void verifylipcaretipsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonlipcaretips();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonlipcaretips();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for  lip care tips:"+compareTwoText);
		}			
	 @Test(priority=66,enabled=true)
		public void verifylipsayslotLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonlipsayslot();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonlipsayslot();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for  lip says lot:"+compareTwoText);
		}			
	 @Test(priority=67,enabled=true)
		public void verifychappedlipsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonchappedlips();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonchappedlips();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for chapped lips:"+compareTwoText);
		}			
	 @Test(priority=68,enabled=true)
		public void verifywheregetcoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonwheregetcoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonwheregetcoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for where get cold sores:"+compareTwoText);
		}			
	 @Test(priority=69,enabled=true)
		public void verifyAbrevaCompetionsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonAbrevacompetion();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonAbrevacompetion();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Abreva competion:"+compareTwoText);
		}			
	 @Test(priority=70,enabled=true)
		public void verifylipcareliphealthLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonlipcareliphealth();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonlipcareliphealth();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for lip care lip health:"+compareTwoText);
		}			
	 @Test(priority=71,enabled=true)
		public void verifyfuellipsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonfuellips();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonfuellips();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for fuellips:"+compareTwoText);
		}			
	 @Test(priority=72,enabled=true)
		public void verifylysinecoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonlysinecoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonlysinecoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for lysine cold sores:"+compareTwoText);
		}			
	 @Test(priority=73,enabled=true)
		public void verifylipcareroutineLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonlipcareroutine();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonlipcareroutine();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for lip care routine:"+compareTwoText);
		}			
	 @Test(priority=74,enabled=true)
		public void verifynottouchfaceLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonnottouchface();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonnottouchface();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same fornottouch face:"+compareTwoText);
		}			
	 
	 @Test(priority=75,enabled=true)
		public void verifybumpslipsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonbumpslips();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonbumpslips();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for bumps lips:"+compareTwoText);
		}			
	 @Test(priority=76,enabled=true)
		public void verifystepcareroutineLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonstepcareroutine();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonstepcareroutine();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for step care routine:"+compareTwoText);
		}			
	 
	 @Test(priority=77,enabled=true)
		public void verifyColdsoreTinglepollLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickoncoldsoretinglepoll();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickoncoldsoretinglepoll();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for cold sore tingle poll:"+compareTwoText);
		}			
	 @Test(priority=78,enabled=true)
		public void verifyFaqsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonFAQs();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonFAQs();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Faqs:"+compareTwoText);
		}			
	 @Test(priority=79,enabled=true)
		public void verifyFsorhsaLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonFsaorhsa();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonFsaorhsa();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Fsaor hsa:"+compareTwoText);
		}			
	 @Test(priority=80,enabled=true)
		public void verifywhenuseabrevaLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonwhenuseabreva();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonwhenuseabreva();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for when use abreva:"+compareTwoText);
		}			
	 
	 @Test(priority=81,enabled=true)
		public void verifyhowuseabrevaLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonhowuseabreva();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonhowuseabreva();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same forhow use abreva:"+compareTwoText);
		}			
	 @Test(priority=82,enabled=true)
		public void verifyUnderstandingcoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonunderstandingcoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonunderstandingcoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same understanding cold sores:"+compareTwoText);
		}			
	 
	 @Test(priority=83,enabled=true)
		public void verifygetridcoldsores1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickongetridcoldsores1();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickongetridcoldsores1();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same get rid cold sores1:"+compareTwoText);
		}			
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
