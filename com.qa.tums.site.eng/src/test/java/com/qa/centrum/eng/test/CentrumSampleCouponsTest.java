package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.CentrumCouponsPage;
import com.qa.tums.eng.util.DataProviderCode;

public class CentrumSampleCouponsTest extends BaseClass{
	
	CentrumCouponsPage cc;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL("https://haleonstaging1:Health2023@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/coupons/");
		switchingTab(secondTab);
		launchURL("https://www.centrum.com/coupons/");
	}


	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		cc = new CentrumCouponsPage();
		switchingTab(firstTab);
		cc.clickCookieBtn();
//		cc.clickGigyaForm();
		switchingTab(secondTab);
		cc.clickCookieBtn();
//		cc.clickGigyaForm();
	}
	
	@Test(priority = 1, dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class)
	private void verifyGigyaForm(String name, String email, String date, String month, String year) throws Exception {
		switchingTab(firstTab);
		cc.txtFirstName(name);
		cc.txtEmail(email);
		cc.txtDate(date);
		cc.txtMonth(month);
		cc.txtYear(year);
		cc.btnSubmit();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
//		System.out.println("Gigya Form successfully submitted in the PreProd URL");
		switchingTab(secondTab);
		cc.txtFirstName(name);
		cc.txtEmail(email);
		cc.txtDate(date);
		cc.txtMonth(month);
		cc.txtYear(year);
		cc.btnSubmit();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
//		System.out.println("Gigya Form successfully submitted in the Live URL");
	}
	
	@Test(priority = 2, dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class)
	private void verifyGigyaFormTwo(String name, String email, String date, String month, String year) throws Exception {
		switchingTab(firstTab);
		cc.txtFirstName(name);
		cc.txtEmail(email);
		cc.txtDate(date);
		cc.txtMonth(month);
		cc.txtYear(year);
		cc.btnSubmit();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
//		System.out.println("Gigya Form successfully submitted in the PreProd URL");
		switchingTab(secondTab);
		cc.txtFirstName(name);
		cc.txtEmail(email);
		cc.txtDate(date);
		cc.txtMonth(month);
		cc.txtYear(year);
		cc.btnSubmit();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
//		System.out.println("Gigya Form successfully submitted in the Live URL");
	}
	
	@Test(priority = 3, dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class)
	private void verifyGigyaFormThree(String name, String email, String date, String month, String year) throws Exception {
		switchingTab(firstTab);
		cc.txtFirstName(name);
		cc.txtEmail(email);
		cc.txtDate(date);
		cc.txtMonth(month);
		cc.txtYear(year);
		cc.btnSubmit();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
//		System.out.println("Gigya Form successfully submitted in the PreProd URL");
		switchingTab(secondTab);
		cc.txtFirstName(name);
		cc.txtEmail(email);
		cc.txtDate(date);
		cc.txtMonth(month);
		cc.txtYear(year);
		cc.btnSubmit();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
//		System.out.println("Gigya Form successfully submitted in the Live URL");
	}
	
	@Test(priority = 4, dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class)
	private void verifyGigyaFormFour(String name, String email, String date, String month, String year) throws Exception {
		switchingTab(firstTab);
		cc.txtFirstName(name);
		cc.txtEmail(email);
		cc.txtDate(date);
		cc.txtMonth(month);
		cc.txtYear(year);
		cc.btnSubmit();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
//		System.out.println("Gigya Form successfully submitted in the PreProd URL");
		switchingTab(secondTab);
		cc.txtFirstName(name);
		cc.txtEmail(email);
		cc.txtDate(date);
		cc.txtMonth(month);
		cc.txtYear(year);
		cc.btnSubmit();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
//		System.out.println("Gigya Form successfully submitted in the Live URL");
	}
	
	@Test(priority = 5, dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class)
	private void verifyGigyaFormFive(String name, String email, String date, String month, String year) throws Exception {
		switchingTab(firstTab);
		cc.txtFirstName(name);
		cc.txtEmail(email);
		cc.txtDate(date);
		cc.txtMonth(month);
		cc.txtYear(year);
		cc.btnSubmit();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
//		System.out.println("Gigya Form successfully submitted in the PreProd URL");
		switchingTab(secondTab);
		cc.txtFirstName(name);
		cc.txtEmail(email);
		cc.txtDate(date);
		cc.txtMonth(month);
		cc.txtYear(year);
		cc.btnSubmit();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
//		System.out.println("Gigya Form successfully submitted in the Live URL");
	}
	
	@Test(priority = 6, dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class)
	private void verifyGigyaFormSix(String name, String email, String date, String month, String year) throws Exception {
		switchingTab(firstTab);
		cc.txtFirstName(name);
		cc.txtEmail(email);
		cc.txtDate(date);
		cc.txtMonth(month);
		cc.txtYear(year);
		cc.btnSubmit();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
//		System.out.println("Gigya Form successfully submitted in the PreProd URL");
		switchingTab(secondTab);
		cc.txtFirstName(name);
		cc.txtEmail(email);
		cc.txtDate(date);
		cc.txtMonth(month);
		cc.txtYear(year);
		cc.btnSubmit();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
//		System.out.println("Gigya Form successfully submitted in the Live URL");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

//	@Test(priority = 2)
//	private void verifyRecommendedArticleOne() throws Exception {
//		switchingTab(firstTab);
//		cc.clickRecommendedArticleOne();
//		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
//		switchingTab(secondTab);
//		cc.clickRecommendedArticleOne();
//		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
//	}
//	
//	@Test(priority = 3)
//	private void verifyRecommendedArticleTwo() throws Exception {
//		switchingTab(firstTab);
//		cc.clickRecommendedArticleTwo();
//		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
//		switchingTab(secondTab);
//		cc.clickRecommendedArticleTwo();
//		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
//	}
}
