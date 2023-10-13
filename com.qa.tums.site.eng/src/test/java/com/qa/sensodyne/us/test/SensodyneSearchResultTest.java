package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneSearchResult;

public class SensodyneSearchResultTest extends BaseClass{
	SensodyneSearchResult ssr;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();	
	}
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		ssr =new SensodyneSearchResult();
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("preProdHomepageUrl"));
		ssr.clickSearchIcon();
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("liveHomepageUrl"));
		ssr.clickSearchIcon();}
		
//	@Test(priority = 1, enabled = true)
//	private void ClickSearchIcon() throws Exception {
//		ssr =new SensodyneSearchResult();
//		switchingTab(firstTab);
//		ssr.clickSearchIcon();
//		System.out.println("Clicked on search icon on preprod");
//		switchingTab(secondTab);
//		ssr.clickSearchIcon();
//		System.out.println("Clicked on search icon on live");
//		}
	
	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Exception {
	ssr =new SensodyneSearchResult();
	switchingTab(firstTab);
	ssr.clickCookieBtn();
	ssr.clickGigyaForm();
	System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
	switchingTab(secondTab);
	ssr.clickCookieBtn();
	ssr.clickGigyaForm();
	System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}
	
	@Test(priority = 10)
	private void verifySearchField() throws Exception{
		switchingTab(firstTab);
		ssr.clickSearchField();
		ssr.clickSearchSubmit();
		String preProdresult = ssr.getResult();
		switchingTab(secondTab);
		ssr.clickSearchField();
		ssr.clickSearchSubmit();
		String liveresult = ssr.getResult();
		boolean compareTwoText = compareTwoText(preProdresult, liveresult);
		System.out.println("PreProdUrl and LiveUrl are Same for searched result :"+compareTwoText);
		
	}
//	@Test(priority = 10)
//	private void verifySearchSubmit() throws Exception{
//		switchingTab(firstTab);
//		ssr.clickSearchSubmit();
//		switchingTab(secondTab);
//		ssr.clickSearchSubmit();
//	}
//	@Test(priority = 10)
//	private void verifyresult() throws Exception{
//		switchingTab(firstTab);
//		String preProdresult = ssr.getResult();
//		switchingTab(secondTab);
//		String liveresult = ssr.getResult();
//		boolean compareTwoText = compareTwoText(preProdresult, liveresult);
//		System.out.println("PreProdUrl and LiveUrl are Same for searched result :"+compareTwoText);
//	}
	
	@Test(priority = 10)
	private void verifyGetYourCoupon() throws Exception{
		switchingTab(firstTab);
		ssr.clickGetYourCoupon();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssr.clickGetYourCoupon();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);
	}
	@Test(priority = 10)
	private void verifyFindYourStore() throws Exception{
		switchingTab(firstTab);
		ssr.clickFindYourStore();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssr.clickFindYourStore();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :"+compareTwoText);
	}
	
}
