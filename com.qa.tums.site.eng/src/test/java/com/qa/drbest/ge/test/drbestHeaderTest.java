package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.drbestHeaderPage;

public class drbestHeaderTest extends BaseClass{
	
	drbestHeaderPage dh;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("drbest_deConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 dh=new drbestHeaderPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("drbest_deConfig.properties").getProperty("preProddrbestHomepageUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("drbest_deConfig.properties").getProperty("livedrbestHomepageUrl"));
		 }	
	 @Test(priority=0,enabled=true)
		public void verifydrbestcookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        dh.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        dh.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Live Url");
		}							
	 @Test(priority=1,enabled=true)
		public void verifydrbestLogoLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickondrbestlogo();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickondrbestlogo();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for drbestLogo:"+compareTwoText);
		}		
	 @Test(priority=2,enabled=true)
		public void verifyVibrationmultiexpertLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonvibrationmultiexpert();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonvibrationmultiexpert();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Vibrationmultiexpert:"+compareTwoText);
		}		
	 @Test(priority=3,enabled=true)
		public void verifyVibrationpolimedLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonvibrationpolimed();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonvibrationpolimed();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Vibrationpolimed:"+compareTwoText);
		}		
	 @Test(priority=4,enabled=true)
		public void verifyVibrationAtemfrischLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonvibrationAtemfrisch();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonvibrationAtemfrisch();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for VibrationAtemfrisch:"+compareTwoText);
		}		
	 @Test(priority=5,enabled=true)
		public void verifyErsteZahneLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonErsteZahne();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonErsteZahne();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ErsteZahne:"+compareTwoText);
		}		
	 @Test(priority=6,enabled=true)
		public void verifyMilchzahnLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonMilchzahn();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonMilchzahn();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Milchzahn:"+compareTwoText);
		}		
	 @Test(priority=7,enabled=true)
		public void verifyPawpatrolLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonpawpatrol();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonpawpatrol();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Pawpatrol:"+compareTwoText);
		}		
	 @Test(priority=8,enabled=true)
		public void verifyJuniorjahnLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonjuniorzahn();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonjuniorzahn();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Juniorjahn:"+compareTwoText);
		}		
	 @Test(priority=9,enabled=true)
		public void verifyCoolkidsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickoncoolkids();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickoncoolkids();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Coolkids:"+compareTwoText);
		}		
	 @Test(priority=10,enabled=true)
		public void verifyVibrationJuniorzahnLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonVibrationjuniorjahn();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonVibrationjuniorjahn();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for VibrationJuniorzahn:"+compareTwoText);
		}		
	 @Test(priority=11,enabled=true)
		public void verifyBambusInterdentkidsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonBambusInterdentkids();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonBambusInterdentkids();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for BambusInterdentkids:"+compareTwoText);
		}		
	 @Test(priority=12,enabled=true)
		public void verifyGreensensitiveLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickongreensensitive();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickongreensensitive();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Greensensitive:"+compareTwoText);
		}		
	 @Test(priority=13,enabled=true)
		public void verifylimitededitionsLink() throws Throwable
		{
		 switchingTab(firstTab);
		 	dh.clickonlimitededitions();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonlimitededitions();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for limitedEditions:"+compareTwoText);
		}		
	 @Test(priority=14,enabled=true)
		public void verifySummereditionsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonsummereditions();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonsummereditions();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Summereditions:"+compareTwoText);
		}		
	 @Test(priority=15,enabled=true)
		public void verifyBienenEditionsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonbieneeditions();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonbieneeditions();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for BienenEditions:"+compareTwoText);
		}		
	 @Test(priority=16,enabled=true)
		public void verifyBambusInterdentLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonbambusinterdent();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonbambusinterdent();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for BambusInterdent:"+compareTwoText);
		}		
	 @Test(priority=17,enabled=true)
		public void verifybambusInterdentkidsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonbambusinterdentkids();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonbambusinterdentkids();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for BambusInterdentkids:"+compareTwoText);
		}		
	 @Test(priority=18,enabled=true)
		public void verifygreencleanLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickongreenclean();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickongreenclean();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Greenclean:"+compareTwoText);
		}		
	 @Test(priority=19,enabled=true)
		public void verifyInterdentalBurstenLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonInterdentalbursten();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonInterdentalbursten();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for InterdentalBursten:"+compareTwoText);
		}		
	 @Test(priority=20,enabled=true)
		public void verifypolimedLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonpolimed();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonpolimed();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for polimed:"+compareTwoText);
		}		
	 @Test(priority=21,enabled=true)
		public void verifypolimedkurzkopfLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonpolimedkurzkopf();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonpolimedkurzkopf();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for polimedkurzkopf:"+compareTwoText);
		}		
	 @Test(priority=22,enabled=true)
		public void verifyAtemfrischLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonatemfrisch();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonatemfrisch();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Atemfrisch:"+compareTwoText);
		}		
	 @Test(priority=23,enabled=true)
		public void verifyNaturlichLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonaturich();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonaturich();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Naturlich:"+compareTwoText);
		}		
	 @Test(priority=24,enabled=true)
		public void verifyzwischenzahnLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonzwischenzahn();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonzwischenzahn();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for zwischenzahn:"+compareTwoText);
		}		
	 @Test(priority=25,enabled=true)
		public void verifyzwischenzahn1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonzwischenzahn1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonzwischenzahn1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for zwischenzahn1:"+compareTwoText);
		}		
	 @Test(priority=26,enabled=true)
		public void verifyinterdentaktivLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickoninterdentaktiv();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickoninterdentaktiv();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Interdentktiv:"+compareTwoText);
		}		
	 @Test(priority=27,enabled=true)
		public void verifyhochthiefLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonhochtief();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonhochtief();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for hochthief:"+compareTwoText);
		}		
	 @Test(priority=28,enabled=true)
		public void verifyschwingkopfLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonschwingkopf();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonschwingkopf();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for schwingkop:"+compareTwoText);
		}		
	 @Test(priority=29,enabled=true)
		public void verifyoriginalLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonOriginal();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonOriginal();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for original:"+compareTwoText);
		}		
	 @Test(priority=30,enabled=true)
		public void verifyBetatungLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonBeratung();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonBeratung();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Betatung:"+compareTwoText);
		}
	 @Test(priority=31,enabled=true)
		public void verifyEmpfindlicheLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonempfindlichezahne();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonempfindlichezahne();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Empfindliche:"+compareTwoText);
		}
	 @Test(priority=32,enabled=true)
		public void verifyErnährungundZähneLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonErnährungundZähne();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonErnährungundZähne();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ErnährungundZähne:"+compareTwoText);
		}
	 @Test(priority=33,enabled=true)
		public void verifykinderzahentwicklungLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonkinderzahentwicklung();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonkinderzahentwicklung();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for kinderzahentwicklung:"+compareTwoText);
		}
	 @Test(priority=34,enabled=true)
		public void verifyMundgeruchLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonMunderuch();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonMunderuch();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for munderch:"+compareTwoText);
		}
	 @Test(priority=35,enabled=true)
		public void verifyParodontitisLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonparodontitis();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonparodontitis();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Parodontitis:"+compareTwoText);
		}
	 @Test(priority=36,enabled=true)
		public void verifySchutzvorkariesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonschutzvorkaries();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonschutzvorkaries();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Schutzvorkaries:"+compareTwoText);
		}
	 @Test(priority=37,enabled=true)
		public void verifyWeisserenezahneLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonWeisserezahne();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonWeisserezahne();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Weisserenezahne:"+compareTwoText);
		}
	 @Test(priority=38,enabled=true)
		public void verifyZahnpflegebeiLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonZahnpfegebei();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonZahnpfegebei();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Zahnpflegebei:"+compareTwoText);
		}
	 @Test(priority=39,enabled=true)
		public void verifyZahnpflegebeizahnersatzLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonZahnpfegebeizahnersatz();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonZahnpfegebeizahnersatz();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Zahnpflegebeizahnersatz:"+compareTwoText);
		}
	 @Test(priority=40,enabled=true)
		public void verifyHilfsmitteLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonhilfsmittel();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonhilfsmittel();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Hilfsmitte:"+compareTwoText);
		}
	 @Test(priority=41,enabled=true)
		public void verifyZahnputztechnikLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonZahnputztechnik();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonZahnputztechnik();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Zahnputztechnik:"+compareTwoText);
		}
	 @Test(priority=42,enabled=true)
		public void verifyZahnputztechnikKindeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonZahnputztechnikKinde();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonZahnputztechnikKinde();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ZahnputztechnikKinde:"+compareTwoText);
		}
	 @Test(priority=43,enabled=true)
		public void verifyNachhaltigkeitLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonNachhaltigkeit();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonNachhaltigkeit();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Nachhaltigkeit:"+compareTwoText);
		}
	 @Test(priority=44,enabled=true)
		public void verifyBambusLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonBambus();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonBambus();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Bambus:"+compareTwoText);
		}
	 @Test(priority=45,enabled=true)
		public void verifyBiokunststoffLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonBiokunststoff();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonBiokunststoff();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Biokunststoff:"+compareTwoText);
		}
	 @Test(priority=46,enabled=true)
		public void verifyUmweltfreundlicheVerpackungLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonUmweltfreundlicheVerpackung();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonUmweltfreundlicheVerpackung();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for UmweltfreundlicheVerpackung:"+compareTwoText);
		}
	 @Test(priority=47,enabled=true)
		public void verifyKlimaschutzprojektLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonKlimaschutzprojekt();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonKlimaschutzprojekt();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Klimaschutzprojekt:"+compareTwoText);
		}
	 @Test(priority=48,enabled=true)
		public void verifyBESTForschungLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonBESTForschung();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonBESTForschung();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for BESTForschung:"+compareTwoText);
		}
	 @Test(priority=48,enabled=true)
		public void verifySearchIconLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonSearchIcon();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonSearchIcon();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for searchIcon:"+compareTwoText);
		}
	 
	 
	 
	 
	
	
	
	
	

}
