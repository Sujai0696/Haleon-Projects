package com.qa.caltrate.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.eng.pages.CaltrateSitemapPage;


public class CaltrateSitemapTest extends BaseClass {
	
	CaltrateSitemapPage cc;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("caltrateConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		cc=new CaltrateSitemapPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("caltrateConfig.properties").getProperty("preProdSitemapUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("caltrateConfig.properties").getProperty("LiveSitemapUrl"));
		 }
	 @Test(priority=0,enabled=true)
		public void verifyCookieLink() throws Throwable
		{
		 switchingTab(firstTab);
	        cc.clickCookieBtn();
	        System.out.println("Cookie in preprod url");
	        switchingTab(secondTab);
	        cc.clickCookieBtn();
	        System.out.println("Cookie  in Live url");
		}		
	 @Test(priority=1,enabled=true)
		public void verifyhomebreadcrumbsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonHomebreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonHomebreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}				
	 @Test(priority=2,enabled=true)
		public void verifySitemapbreadcrumbsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonsitemapbreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonsitemapbreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}						
	 @Test(priority=3,enabled=true)
		public void verifycaltrateHomepageLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickoncaltratehomepage();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickoncaltratehomepage();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}					
	 @Test(priority=4,enabled=true)
		public void verifyproductsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonproducts();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonproducts();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}			
	 @Test(priority=5,enabled=true)
		public void verifycaltrate600d3Link() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickoncaltrate600d3();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickoncaltrate600d3();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}			
	 @Test(priority=6,enabled=true)
		public void verifycaltrate600d3softchewsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickoncaltrate600d3softchews();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickoncaltrate600d3softchews();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}			
	 @Test(priority=7,enabled=true)
		public void verifycaltrategummybitesLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickoncaltrategummybites();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickoncaltrategummybites();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}			
	 @Test(priority=8,enabled=true)
		public void verifycaltrate600d3MineralsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickoncaltrate600d3Minerals();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickoncaltrate600d3Minerals();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}			
	 @Test(priority=9,enabled=true)
		public void verifycaltrate600d3MineralschewablesLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickoncaltrate600d3Mineralschewables();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickoncaltrate600d3Mineralschewables();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=10,enabled=true)
		public void verifycaltrate600d3MineralMinisLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickoncaltrate600d3Mineralsminis();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickoncaltrate600d3Mineralsminis();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=11,enabled=true)
		public void verifywhychoosecaltrateLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonwhychoosecaltrate();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonwhychoosecaltrate();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=12,enabled=true)
		public void verifyBonehealthcentralLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonbonehealthcentral();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonbonehealthcentral();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=13,enabled=true)
		public void verifycalciumcarbonateLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonbonehealthcentral();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonbonehealthcentral();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=14,enabled=true)
		public void verifyVitaminDLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonVitaminD();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonVitaminD();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=15,enabled=true)
		public void verifyOestoroposisLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonosteoporosis();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonosteoporosis();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=16,enabled=true)
		public void verifyCalciumsupplementsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickoncalciumsupplements();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickoncalciumsupplements();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=17,enabled=true)
		public void verifyhealthcareprofessionLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonhealthcareprofession();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonhealthcareprofession();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=18,enabled=true)
		public void verifyOestoporosismedicineenoughLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonosteoporsismedicine();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonosteoporsismedicine();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=19,enabled=true)
		public void verifyFAQLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonfaq();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonfaq();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	
	 @Test(priority=20,enabled=true)
		public void verifyCouponsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickoncoupons();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickoncoupons();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=21,enabled=true)
		public void verifywheretobuyLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonwheretobuy();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonwheretobuy();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=22,enabled=true)
		public void verifyqualityLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonquality();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonquality();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=23,enabled=true)
		public void verifybonehealthcalciumLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonbonehealthcalcium();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonbonehealthcalcium();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=24,enabled=true)
		public void verifycalciumvitaminDLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickoncalciumvitaminD();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickoncalciumvitaminD();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=25,enabled=true)
		public void verifyTrustcalciumsupplementsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonTrustcalciumsupplements();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonTrustcalciumsupplements();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=26,enabled=true)
		public void verifycalciumcarbonatecitrateLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickoncalciumcarbonateCitrate();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickoncalciumcarbonateCitrate();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=27,enabled=true)
		public void verifyHelpreduceRiskLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonHelpreducerisk();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonHelpreducerisk();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=28,enabled=true)
		public void verifySurgeonReportLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonSurgeonReport();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonSurgeonReport();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=29,enabled=true)
		public void verifyVitaminDdeficiencyLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonVitaminDdeficiency();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonVitaminDdeficiency();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=30,enabled=true)
		public void verifyBenefitsofVitaminDLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonBenefitsVitaminD();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonBenefitsVitaminD();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=31,enabled=true)
		public void verifySummerstrongshakeLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonsummerstrongshake();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonsummerstrongshake();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=32,enabled=true)
		public void verifyArgulasaladLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonArgulasalad();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonArgulasalad();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=33,enabled=true)
		public void verifykalechipsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonkalechips();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonkalechips();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=34,enabled=true)
		public void verifynextdayturkeysoupLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonnextdayturkeysoup();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonnextdayturkeysoup();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=35,enabled=true)
		public void verifySalmonCakesLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonSalmoncakes();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonSalmoncakes();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=36,enabled=true)
		public void verifyCheesycauliflowerSoupLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickoncheesycauliflowerSoup();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickoncheesycauliflowerSoup();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=37,enabled=true)
		public void verifycupmilkfavouriteSoupLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickoncupmilksoupFavourite();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickoncupmilksoupFavourite();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=38,enabled=true)
		public void verifyWorkyourupperbodyLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonWorkyourupperbody();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonWorkyourupperbody();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=39,enabled=true)
		public void verifyActivateyourMusclesLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonActivateyourMuscles();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonActivateyourMuscles();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=40,enabled=true)
		public void verifyPumpkinseedsupportLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonPumpkinseedSupport();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonPumpkinseedSupport();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=41,enabled=true)
		public void verifyUseMilkaddAlmondLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonUseMilkaddAlmond();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonUseMilkaddAlmond();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=42,enabled=true)
		public void verifyConversioncalciumLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonConversionCalcium();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonConversionCalcium();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=43,enabled=true)
		public void verifyBreakfastBananaLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonBreakfastBanana();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonBreakfastBanana();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=44,enabled=true)
		public void verifySesameSeedsgoodLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonsesameseed();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonsesameseed();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=45,enabled=true)
		public void verifyToolsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickontools();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickontools();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=46,enabled=true)
		public void verifyCaltrateBeyondBonesLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCaltrateBeyondBones();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonCaltrateBeyondBones();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=47,enabled=true)
		public void verifyCalciumateveryAgeLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCalciumatEveryAge();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonCalciumatEveryAge();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 
	 
	 
	 
	 
	 
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
