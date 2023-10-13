package com.qa.caltrate.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.eng.pages.CaltrateCouponsPage;
import com.qa.caltrate.eng.pages.CaltrateWhereToBuyPage;

public class CaltrateWhereToBuyTest extends BaseClass{
	
	CaltrateWhereToBuyPage wb;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("caltrateConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("caltrateConfig.properties").getProperty("whereTobuyPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("caltrateConfig.properties").getProperty("whereTobuyLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		wb = new CaltrateWhereToBuyPage();
		switchingTab(firstTab);
		wb.clickCookieBtn();
//		wb.clickGigyaForm();
		System.out.println("Cookie Button clicked successfully verified in the Preprod URL");
		switchingTab(secondTab);
		wb.clickCookieBtn();
//		wb.clickGigyaForm();
		System.out.println("Cookie Button clicked successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		wb.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		wb.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One :"+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		wb.textBreadcrumbTwo();
		System.out.println("Breadcrumb Two successfully verified in the preprod URL");
		switchingTab(secondTab);
		wb.textBreadcrumbTwo();
		System.out.println("Breadcrumb Two successfully verified in the live URL");
	}

}
