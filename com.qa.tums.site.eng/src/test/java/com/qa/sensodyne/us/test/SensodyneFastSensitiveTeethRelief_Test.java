package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneFastSensitiveTeethRelief_Pages;

public class SensodyneFastSensitiveTeethRelief_Test extends BaseClass {
	
	SensodyneFastSensitiveTeethRelief_Pages sp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 sp=new SensodyneFastSensitiveTeethRelief_Pages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("sensodyneConfig.properties").getProperty("preProdSensodyneFastSensitiveTeethReliefUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("sensodyneConfig.properties").getProperty("liveSensodyneFastSensitiveTeethReliefUrl"));
		 }
	 @Test(priority = 0, enabled = true)
		private void cookieButton() throws Exception {
		switchingTab(firstTab);
		sp.clickCookieBtn();
		sp.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		sp.clickCookieBtn();
		sp.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}
	 @Test(priority = 1, enabled = true)
	    private void VerifyFastSensitiveTeethRelief_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnFastSensitiveTeethRelief();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnFastSensitiveTeethRelief();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 2, enabled = true)
	    private void VerifyProductResultBreadCrumb_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnProductResult();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnProductResult();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 3, enabled = true)
	    private void VerifyToothPastefastSensitiveReliefBreadCrumb_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnToothPasteReliefBreadCrumb();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnToothPasteReliefBreadCrumb();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 4, enabled = true)
	    private void VerifyHelpsWhitenTeeth_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnHelpsWhitenTeeth();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnHelpsWhitenTeeth();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 5, enabled = true)
	    private void VerifySensitiveTeethRepair_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitiveTeethRepair();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensitiveTeethRepair();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 6, enabled = true)
	    private void VerifyGetResults_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnGetResults();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnGetResults();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 7, enabled = true)
	    private void VerifySensitiveCareTeethBrush_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitiveCareToothBrush();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensitiveCareToothBrush();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 8, enabled = true)
	    private void VerifySensitivecareToothBrushBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitiveCareToothBrush_BuyNow();
	        System.out.println("BuyNow for SensitivitecareToothBrush in Preprod");
	         switchingTab(secondTab);
	         sp.clickOnSensitiveCareToothBrush_BuyNow();
	         System.out.println("BuyNow for SensitivitecareToothBrush in Prod");	   
	         }
	 @Test(priority = 9, enabled = true)
	    private void VerifySensitiveCareTeethBrushProduct_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitiveCareToothBrush_Product();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensitiveCareToothBrush_Product();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 10, enabled = true)
	    private void VerifyRapidReliefWhitening_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnRapidReliefWhitening();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnRapidReliefWhitening();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 11, enabled = true)
	    private void VerifyRapidReliefWhiteningBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnRapidReliefWhitening_BuyNow();
	        System.out.println("BuyNow  for RapidRelief on PreprodUrl");
	         switchingTab(secondTab);
	         sp.clickOnRapidReliefWhitening_BuyNow();
	         System.out.println("BuyNow  for RapidRelief on LiveUrl");
	    }
	 @Test(priority = 12, enabled = true)
	    private void VerifyRapidReliefWhiteningProduct_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnRapidReliefWhitening_Product();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnRapidReliefWhitening_Product();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 13, enabled = true)
	    private void VerifyRapidReliefMint_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnRapidReliefMint();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnRapidReliefMint();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 14, enabled = true)
	    private void VerifyRapidMintBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnRapidReliefMint_BuyNow();
	        System.out.println("BuyNow  for RapidRelief Mint on PreprodUrl");
	         switchingTab(secondTab);
	         sp.clickOnRapidReliefMint_BuyNow();
	         System.out.println("BuyNow  for RapidRelief Mint on LiveUrl");
	    }
	 @Test(priority = 15, enabled = true)
	    private void VerifyRapidReliefMintProduct_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnRapidReliefMintProduct();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnRapidReliefMintProduct();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 16, enabled = true)
	    private void VerifyRapidReliefExtraFresh_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnRapidReliefExtrafresh();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnRapidReliefExtrafresh();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 17, enabled = true)
	    private void VerifyRapidExtraFreshBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnRapidReliefExtraFresh_BuyNow();
	        System.out.println("BuyNow  for RapidRelief ExtraFresh on PreprodUrl");
	         switchingTab(secondTab);
	         sp.clickOnRapidReliefExtraFresh_BuyNow();
	         System.out.println("BuyNow  for RapidRelief ExtraFresh on LiveUrl");
	    }
	 @Test(priority = 18, enabled = true)
	    private void VerifyCoupons_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnGetCoupons();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnGetCoupons();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 19, enabled = true)
	    private void VerifyFindStore_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnFindStore();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnFindStore();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
