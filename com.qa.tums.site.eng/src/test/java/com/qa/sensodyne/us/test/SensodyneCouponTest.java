package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneCouponPage;

public class SensodyneCouponTest extends BaseClass{
	
	SensodyneCouponPage cp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("couponPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("couponLiveUrl"));
	}

	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		cp = new SensodyneCouponPage();
		switchingTab(firstTab);
		cp.clickCookieBtn();
		cp.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		cp.clickCookieBtn();
		cp.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}
	
	@Test(priority = 1)
	public void verifyRadioButtonOne() throws Exception{
		switchingTab(firstTab);
		cp.radioButtonOne();
		switchingTab(secondTab);
		cp.radioButtonOne();
	}
	
	@Test(priority = 2)
	public void verifyRadioButtonTwo() throws Exception{
		switchingTab(firstTab);
		cp.radioButtonTwo();
		switchingTab(secondTab);
		cp.radioButtonTwo();
	}

}
