package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneProductPage;
import com.qa.sensodyne.us.page.SensodyneToothPainCausesPage;
import com.qa.tums.eng.util.Retry;

public class SensodyneProductTest extends BaseClass{
	
	SensodyneProductPage pp;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("productPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("productLiveUrl"));
	}

	@Test(priority = 0, retryAnalyzer = Retry.class)
	private void cookieButton() throws Exception {
		pp = new SensodyneProductPage();
		switchingTab(firstTab);
		pp.clickCookieBtn();
		pp.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		pp.clickCookieBtn();
		pp.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}
	
	
//	@Test(priority = 1)
//	public void verifyPrdtFilter() throws Exception{
//		switchingTab(firstTab);
//		pp.clickprdtFilter();
//		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
//		System.out.println("Product filter successfully verified in the Preprod Url");
//		switchingTab(secondTab);
//		pp.clickprdtFilter();
//		System.out.println("Product filter successfully verified in the Live Url");
//		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Get Result: "+compareTwoText);
//		
//	}
//	
//	@Test(priority = 2)
//	public void verifySensodyneNourish() throws Exception{
//		switchingTab(firstTab);
//		pp.clickSensoyneNourish();
//		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
//		switchingTab(secondTab);
//		pp.clickSensoyneNourish();
//		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Nourish: "+compareTwoText);
//	}
//	
//	
//	@Test(priority = 3)
//	public void verifySensodyneNourishPrdtOne() throws Exception{
//		switchingTab(firstTab);
//		pp.clickSensodyneNourishPrdtOne();
//		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
//		switchingTab(secondTab);
//		pp.clickSensodyneNourishPrdtOne();
//		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Nourish product one: "+compareTwoText);
//	}
//	
//	@Test(priority = 4)
//	public void verifySensodyneNourishPrdtTwo() throws Exception{
//		switchingTab(firstTab);
//		pp.clickSensodyneNourishPrdtTwo();
//		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
//		switchingTab(secondTab);
//		pp.clickSensodyneNourishPrdtTwo();
//		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Nourish product two: "+compareTwoText);
//	}
//	
//	@Test(priority = 5)
//	private void verifySensodyneNourishPrdtOneBuyNow() throws Exception {
//		switchingTab(firstTab);
//		pp.clickSensodyneNourishPrdtOneBuyNow();
//		System.out.println("Buy Now verified in Preprod URL");
//		switchingTab(secondTab);
//		pp.clickSensodyneNourishPrdtOneBuyNow();
//		System.out.println("Buy Now verified in Live URL");
//	}
//	
//	@Test(priority = 6)
//	private void verifySensodyneNourishPrdtTwoBuyNow() throws Exception {
//		switchingTab(firstTab);
//		pp.clickSensodyneNourishPrdtTwoBuyNow();
//		System.out.println("Buy Now verified in Preprod URL");
//		switchingTab(secondTab);
//		pp.clickSensodyneNourishPrdtTwoBuyNow();
//		System.out.println("Buy Now verified in Live URL");
//	}
	
	@Test(priority = 7)
	public void verifySensodyneNaturalWhite() throws Exception{
		switchingTab(firstTab);
		pp.clickSensoyneNaturalWhite();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		pp.clickSensoyneNaturalWhite();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne NaturalWhite: "+compareTwoText);
	}
	
	@Test(priority = 8)
	public void verifySensodyneNaturalWhitePrdt() throws Exception{
		switchingTab(firstTab);
		pp.clickSensoyneNaturalWhitePrdt();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		pp.clickSensoyneNaturalWhitePrdt();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne NaturalWhite: "+compareTwoText);
	}
	
	
	@Test(priority = 9)
	public void verifySensitivityAndGum() throws Exception{
		switchingTab(firstTab);
		pp.clickSensitivityAndGum();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		pp.clickSensitivityAndGum();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for sensitivity and gum: "+compareTwoText);
	}
	
	@Test(priority = 9)
	public void verifySensitivityAndGumPrdtOne() throws Exception{
		switchingTab(firstTab);
		pp.clickSensitivityAndGumPrdtOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		pp.clickSensitivityAndGumPrdtOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for sensitivity and gum Prdt One: "+compareTwoText);
	}
	
	@Test(priority = 10)
	public void verifySensitivityAndGumPrdtTwo() throws Exception{
		switchingTab(firstTab);
		pp.clickSensitivityAndGumPrdtTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		pp.clickSensitivityAndGumPrdtTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for sensitivity and gum Prdt Two: "+compareTwoText);
	}
	
	@Test(priority = 11)
	public void verifySensitivityAndGumPrdtThree() throws Exception{
		switchingTab(firstTab);
		pp.clickSensitivityAndGumPrdtThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		pp.clickSensitivityAndGumPrdtThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for sensitivity and gum Prdt Three: "+compareTwoText);
	}
	
	@Test(priority = 12)
	public void verifySensitivityAndGumPrdtFour() throws Exception{
		switchingTab(firstTab);
		pp.clickSensitivityAndGumPrdtFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		pp.clickSensitivityAndGumPrdtFour();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for sensitivity and gum Prdt Four: "+compareTwoText);
	}
	
	@Test(priority = 13)
	public void verifySensitiveCareToothBrush() throws Exception{
		switchingTab(firstTab);
		pp.clickSensitiveCareToothBrush();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		pp.clickSensitiveCareToothBrush();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for SensitiveCareToothBrush: "+compareTwoText);
	}
	
	@Test(priority = 14)
	public void verifySensitiveCareToothBrushPrdt() throws Exception{
		switchingTab(firstTab);
		pp.clickSensitiveCareToothBrushPrdt();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		pp.clickSensitiveCareToothBrushPrdt();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for SensitiveCareToothBrushPrdt: "+compareTwoText);
	}
	
	@Test(priority = 15)
	public void verifySensodyneRapidReliefPrdtOne() throws Exception{
		switchingTab(firstTab);
		pp.clickSensodyneRapidReliefPrdtOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		pp.clickSensodyneRapidReliefPrdtOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for SensodyneRapidRelief PrdtOne: "+compareTwoText);
	}
	
	@Test(priority = 16)
	public void verifySensodyneRapidReliefPrdtTwo() throws Exception{
		switchingTab(firstTab);
		pp.clickSensodyneRapidReliefPrdtTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		pp.clickSensodyneRapidReliefPrdtTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for SensodyneRapidRelief PrdtTwo: "+compareTwoText);
	}
	
	@Test(priority = 17)
	public void verifySensodyneRapidReliefPrdtThree() throws Exception{
		switchingTab(firstTab);
		pp.clickSensodyneRapidRelief();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		pp.clickSensodyneRapidRelief();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for SensodyneRapidRelief PrdtThree: "+compareTwoText);
	}
	
	@Test(priority = 18)
	public void verifySensodyneRapidRelief() throws Exception{
		switchingTab(firstTab);
		pp.clickSensodyneRapidRelief();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		pp.clickSensodyneRapidRelief();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for SensodyneRapidRelief: "+compareTwoText);
	}
	
	@Test(priority = 19)
	public void verifyRepairAndProtect() throws Exception{
		switchingTab(firstTab);
		pp.clickRepairAndProtect();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		pp.clickRepairAndProtect();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RepairAndProtect: "+compareTwoText);
	}
	
	
	@Test(priority = 20)
	public void verifyRepairAndProtectPrdtOne() throws Exception{
		switchingTab(firstTab);
		pp.clickRepairAndProtectPrdtOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		pp.clickRepairAndProtectPrdtOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RepairAndProtect PrdtOne: "+compareTwoText);
	}
	
	@Test(priority = 21)
	public void verifyRepairAndProtectPrdtTwo() throws Exception{
		switchingTab(firstTab);
		pp.clickRepairAndProtectPrdtTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		pp.clickRepairAndProtectPrdtTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RepairAndProtect PrdtTwo: "+compareTwoText);
	}
	
	@Test(priority = 22)
	public void verifyRepairAndProtectPrdtThree() throws Exception{
		switchingTab(firstTab);
		pp.clickRepairAndProtectPrdtThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		pp.clickRepairAndProtectPrdtThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RepairAndProtect PrdtThree: "+compareTwoText);
	}
	

}
