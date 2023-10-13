package com.qa.sensodyne.us.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneAcceptableUsePolicy;

public class SensodyneAcceptableUsePolicyTest extends BaseClass{
	SensodyneAcceptableUsePolicy sau;
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
		
	}
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("SensodyneAcceptableUsePolicyPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("SensodyneAcceptableUsePolicyLiveUrl"));
	}
	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Exception {
	sau =new SensodyneAcceptableUsePolicy();
	switchingTab(firstTab);
	sau.clickCookieBtn();
	sau.clickGigyaForm();
	System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
	switchingTab(secondTab);
	sau.clickCookieBtn();
	sau.clickGigyaForm();
	System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
}
	@Test(priority = 3)
	private void verifySensodyne() throws Exception{
		switchingTab(firstTab);
		sau.clickSensodyneLink();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		sau.clickSensodyneLink();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Get Coupon:"+compareTwoText);
	}

}
