package com.qa.tums.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.TumsCouponPage;
import com.qa.tums.eng.pages.TumsSymptomsPage;

public class TumsCouponTest extends BaseClass {
	
	TumsCouponPage cp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
		
	}
	
	@BeforeMethod
	private void LaunchingTheUrl() throws IOException, Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("tumsConfig.properties").getProperty("couponPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("tumsConfig.properties").getProperty("couponLiveUrl"));
	}
	
	@Test(priority = 0, enabled = true)
	private void verifyCookie() throws Exception {
		cp = new TumsCouponPage();
		switchingTab(firstTab);
		cp.clickCookieBtn();
		System.out.println("Cookie Button is verified in the Preprod URL");
		switchingTab(secondTab);
		cp.clickCookieBtn();
		System.out.println("Cookie Button is verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadCrumbHome() throws Exception{
		switchingTab(firstTab);
		cp.clickBreadCrumbHome();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		cp.clickBreadCrumbHome();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Bread Crumb Home:"+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifySeeProducts() throws Exception{
		switchingTab(firstTab);
		cp.clickSeeProducts();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		cp.clickSeeProducts();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for see products:"+compareTwoText);
	}
	
	

}
