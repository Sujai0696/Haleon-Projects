package com.qa.voltarengel.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.voltarengel.pages.VoltarengelKneeBracesForOsteoarthritis;

public class VoltarengelKneeBracesForOsteoarthritisTest extends BaseClass{
	VoltarengelKneeBracesForOsteoarthritis vkb;
	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadConfig("voltarengel_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		vkb = new VoltarengelKneeBracesForOsteoarthritis();
		switchingTab(firstTab);
		launchURL(loadConfig("voltarengel_Config.properties").getProperty("VoltarengelKneeBracesForOsteoarthritisPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("voltarengel_Config.properties").getProperty("VoltarengelKneeBracesForOsteoarthritisLiveUrl"));
	}
	
	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Exception {
	vkb =new VoltarengelKneeBracesForOsteoarthritis();
	switchingTab(firstTab);
	vkb.clickCookieBtn();
	vkb.clickGigyaForm();
	System.out.println("Cookie Button and email popup closed successfully in the Preprod URL");
	switchingTab(secondTab);
	vkb.clickCookieBtn();
	vkb.clickGigyaForm();
	System.out.println("Cookie Button and email popup closed successfully in the Live URL");
}
	@Test(priority = 2, enabled = true)
	private void verifyWhatOsteoarthritisIs() throws Throwable {
		switchingTab(firstTab);
		vkb.clickonWhatOsteoarthritisIs();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vkb.clickonWhatOsteoarthritisIs();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
		}
	@Test(priority = 2, enabled = true)
	private void verifyKneePain() throws Throwable {
		switchingTab(firstTab);
		vkb.clickonKneePain();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vkb.clickonKneePain();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
		}
	@Test(priority = 2, enabled = true)
	private void verifyManageArthritisInSocialSettings() throws Throwable {
		switchingTab(firstTab);
		vkb.clickonManageArthritisInSocialSettings();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vkb.clickonManageArthritisInSocialSettings();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
		}
	@Test(priority = 2, enabled = true)
	private void verifyManagingArthritisWithYourFamily() throws Throwable {
		switchingTab(firstTab);
		vkb.clickonManagingArthritisWithYourFamily();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vkb.clickonManagingArthritisWithYourFamily();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
		}
	@Test(priority = 11)
	private void verifyShowReference() throws Exception{
	switchingTab(firstTab);
	vkb.clickShowReference();
	System.out.println("Show reference verified in the preprod URL");
	switchingTab(secondTab);
	vkb.clickShowReference();
	System.out.println("Show reference verified in the Live URL");
	}
	
	@Test(priority = 2, enabled = true)
	private void verifyGetCoupon() throws Throwable {
		switchingTab(firstTab);
		vkb.clickonGetCoupon();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vkb.clickonGetCoupon();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
		}
	
	@Test(priority = 16)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		vkb.clickBuyNow();
		System.out.println("Buy Now Button verified in the preprod URL");
		switchingTab(secondTab);
		vkb.clickBuyNow();
		System.out.println("Buy Now Button verified in the Live URL");
	}

}
