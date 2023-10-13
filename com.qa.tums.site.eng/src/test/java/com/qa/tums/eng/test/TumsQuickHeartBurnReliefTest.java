package com.qa.tums.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.TumsQuickHeartBurnReliefPages;

public class TumsQuickHeartBurnReliefTest extends BaseClass {
	TumsQuickHeartBurnReliefPages qh;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("tumsConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		qh=new TumsQuickHeartBurnReliefPages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("tumsConfig.properties").getProperty("preProdUpsetQuickheartburnreliefUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("tumsConfig.properties").getProperty("liveUpsetQuickheartburnreliefUrl"));
		 }
	 @Test(priority=0,enabled=true)
		public void verifyCookieLink() throws Throwable
		{
			switchingTab(firstTab);
	        qh.clickCookieBtn();
	       System.out.println("Verify Cookie Btn on Preprod Url");
	        switchingTab(secondTab);
	        qh.clickCookieBtn();
	       System.out.println("Verify Cookie Btn on Live Url");
		}		
	  
	 
	  
	  @Test(priority=1,enabled=true) 
	  public void verifybreadcrumbLink() throws Exception { 
		  switchingTab(firstTab);
			//ig.clickCookiesDismissBtn();
	        qh.clickonbreadcrumb();
	        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
	        switchingTab(secondTab);
	       // ig.clickCookiesDismissBtn();
	        qh.clickonbreadcrumb();
	        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}
	  
	  @Test(priority=2,enabled=true) 
	  public void verifyQuickheartburnreliefBreadcrumbsLink() throws Exception { 
		  switchingTab(firstTab);
			//ig.clickCookiesDismissBtn();
	        qh.clickonQuickheartburnreliefbreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
	        switchingTab(secondTab);
	       // ig.clickCookiesDismissBtn();
	        qh.clickonQuickheartburnreliefbreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}
	  
	 
//	@Test(priority=5,enabled=true)
//	public void verifytwitterLink() throws Exception {
//		qh=new QuickHeartBurnReliefPages();
//		qh.clickontwitter();
//	}
//	@Test(priority=6,enabled=true)
//	public void verifyfacebookLink() {
//		qh=new QuickHeartBurnReliefPages();
//		qh.clickonfacebook();
//	}
//	@Test(priority=7,enabled=true)
//	public void verifygoogleLink() {
//		qh=new QuickHeartBurnReliefPages();
//		qh.clickongmail();
//	}
	@Test(priority=3,enabled = true)
	public void verifysymptonLink() throws Exception {
		 switchingTab(firstTab);
			//ig.clickCookiesDismissBtn();
	        qh.clickonsymptons();
	        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
	        switchingTab(secondTab);
	       // ig.clickCookiesDismissBtn();
	        qh.clickonsymptons();
	        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}
	@Test(priority=4,enabled=true)
	public void verifycausesLink() throws Exception {
		 switchingTab(firstTab);
			//ig.clickCookiesDismissBtn();
	        qh.clickoncauses();
	        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
	        switchingTab(secondTab);
	       // ig.clickCookiesDismissBtn();
	        qh.clickoncauses();
	        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}
	@Test(priority=5,enabled=true)
	public void verifypreganantLink() throws Exception {
		 switchingTab(firstTab);
			//ig.clickCookiesDismissBtn();
	        qh.clickonpreganant();
	        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
	        switchingTab(secondTab);
	       // ig.clickCookiesDismissBtn();
	        qh.clickonpreganant();
	        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}
	@Test(priority=6,enabled=true)
	public void verifyhowtumsworks() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonhowtumswork();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonhowtumswork();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		
	}
	@Test(priority=7,enabled=true)
	public void verifyreduceburn() throws Exception
	{
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonhowtumswork();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonhowtumswork();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		
	}
	@Test(priority=8,enabled=true)
	public void verifystressLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonstress();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonstress();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}
	@Test(priority=9,enabled=true)
	public void verifyrelievestressLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonreliefstress();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonreliefstress();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}
	@Test(priority=10,enabled=true)
	public void verifyantacidsLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonantacids();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonantacids();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}
	@Test(priority=16,enabled=true)
	public void verifymedicationLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonmedication();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonmedication();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}
	@Test(priority=17,enabled=true)
	public void verifylifstyleLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonlifestyle();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonlifestyle();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}
	@Test(priority=18,enabled=true)
	public void verifymanageLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonmanageheartburn();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonmanageheartburn();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}
	@Test(priority=11,enabled=true)
	public void verifyantacidhelpLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonantacidhelp();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonantacidhelp();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}
	@Test(priority=12,enabled=true)
	public void verifyworseLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonworse();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonworse();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}
	@Test(priority=13,enabled=true)
	public void verifycalciumLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickoncalciumcarbonate();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickoncalciumcarbonate();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}
	@Test(priority=14,enabled=true)
	public void verifyshapewearLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonshapewear();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonshapewear();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}
	@Test(priority=15,enabled=true)
	public void verifyrefluxLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonAcidreflux();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonAcidreflux();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}
	@Test(priority=16,enabled=true)
	public void verifynightLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonheartburnnight();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonheartburnnight();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}
	@Test(priority=17,enabled =true)
	public void verifyindigestionLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickoncausesindigestion();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickoncausesindigestion();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}
	@Test(priority=18,enabled=true)
	public void verifyacidreflux() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonknowaboutacidreflux();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonknowaboutacidreflux();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}
	@Test(priority=19,enabled=true)
	public void verifyspicyfoodLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonspicyfood();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonspicyfood();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}
	@Test(priority=20,enabled=true)
	public void verifyjogginLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonjogging();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonjogging();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}
	@Test(priority=21,enabled=true)
	public void verifachalasiaLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonachalasia();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonachalasia();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}
	@Test(priority=22,enabled=true)
	public void verifybestbedspillowLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonbestbedspillows();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonbestbedspillows();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}
	@Test(priority=23,enabled=true)
	public void verifyreduceacidLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonfoodreduceacid();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonfoodreduceacid();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}
	@Test(priority=24,enabled=true)
	public void verifyspotsignLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonspotsignacidrefluxchildren();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonspotsignacidrefluxchildren();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}
	@Test(priority=25,enabled=true)
	public void verifydietreduceLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickondietreduce();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickondietreduce();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}
	@Test(priority=26,enabled=true)
	public void verifycauseacidLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickoncauseacid();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickoncauseacid();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}
	@Test(priority=27,enabled=true)
	public void verifybarfoodLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonbarfood();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonbarfood();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}
	@Test(priority=28,enabled=true)
	public void verifypostmealLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonpostmeal();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonpostmeal();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}
	@Test(priority=29,enabled=true)
	public void verifywontcauseLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonwontcause();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonwontcause();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}
	@Test(priority=30,enabled=true)
	public void verifyonconnectionweightLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonconnectionweight();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonconnectionweight();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}
	@Test(priority=31,enabled=true)
	public void verifyonbingeLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonbinge();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonbinge();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}
	@Test(priority=32,enabled=true)
	public void verifyonvinegarLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonvinegar();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonvinegar();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}
	@Test(priority=33,enabled=true)
	public void verifyonsaladLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonsalad();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonsalad();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}
	@Test(priority=34,enabled=true)
	public void verifyonbusinesslunchLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonbusinesslunch();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonbusinesslunch();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}
	@Test(priority=35,enabled=true)
	public void verifyonfirstdateLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonfirstdate();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonfirstdate();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}
	@Test(priority=36,enabled=true)
	public void verifyonoccasionalLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonoccasional();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonoccasional();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}
	@Test(priority=37,enabled=true)
	public void verifyonsymptonsfoodLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonsymptonsfood();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonsymptonsfood();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}
	@Test(priority=38,enabled=true)
	public void verifyonhomeremediesLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonhomeremedies();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonhomeremedies();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}
	@Test(priority=39,enabled=true)
	public void verifyonholidaykitLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonholidaykit();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonholidaykit();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}
	@Test(priority=40,enabled=true)
	public void verifyonholidaymealLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonholidaymeal();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonholidaymeal();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}
	@Test(priority=41,enabled=true)
	public void verifyonthoughtspartyLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonthoughtsparty();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonthoughtsparty();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}
	@Test(priority=42,enabled=true)
	public void verifyonwaysavoidheartburnLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonwaystoavoidheartburn();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonwaystoavoidheartburn();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}
	@Test(priority=43,enabled=true)
	public void verifyonnewyearpartyLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonnewyearparty();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonnewyearparty();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}
	@Test(priority=44,enabled=true)
	public void verifyonfootballsundayLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonfootballsunday();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonfootballsunday();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}	
	@Test(priority=45,enabled=true)
	public void verifyonchoclatesavoidLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonchoclatesavoid();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonchoclatesavoid();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}
	@Test(priority=46,enabled=true)
	public void verifyonhealthfoodLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonhealthfoods();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonhealthfoods();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}	
	@Test(priority=47,enabled=true)
	public void verifyonindigestionremediesLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonindigestionremedies();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonindigestionremedies();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}	
	@Test(priority=48,enabled=true)
	public void verifyonimprovehealthLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonimprovehealth();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonimprovehealth();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}	
	@Test(priority=49,enabled=true)
	public void verifyonnaturalremediesLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonnaturalremedies();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonnaturalremedies();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}
	@Test(priority=50,enabled=true)
	public void verifyonheartburnexerciseLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonheartnurnexercise();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonheartnurnexercise();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}
	@Test(priority=51,enabled=true)
	public void verifyongasreliefLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickongasburnrelief();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickongasburnrelief();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}
	@Test(priority=52,enabled=true)
	public void verifyonproductrightLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonproductright();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonproductright();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}
	@Test(priority=61,enabled=true)
	public void verifyonseeproductsLink() throws Exception {
		switchingTab(firstTab);
		//ig.clickCookiesDismissBtn();
        qh.clickonseeproduct();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
       // ig.clickCookiesDismissBtn();
        qh.clickonseeproduct();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	
	}
	
}
