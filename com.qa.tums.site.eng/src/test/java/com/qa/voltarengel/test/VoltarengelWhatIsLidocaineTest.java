package com.qa.voltarengel.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.voltarengel.pages.VoltarengelWhatIsLidocaine;

public class VoltarengelWhatIsLidocaineTest extends BaseClass{
	VoltarengelWhatIsLidocaine vgw;
	@BeforeClass
	private void launchingTheBrowser() throws Exception {
		browserLaunch(loadConfig("voltarengel_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		vgw = new VoltarengelWhatIsLidocaine();
		switchingTab(firstTab);
		launchURL(loadConfig("voltarengel_Config.properties").getProperty("VoltarengelWhatIsLidocainePreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("voltarengel_Config.properties").getProperty("VoltarengelWhatIsLidocaineLiveUrl"));
	}
	
	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Exception {
	vgw =new VoltarengelWhatIsLidocaine();
	switchingTab(firstTab);
	vgw.clickCookieBtn();
	vgw.clickGigyaForm();
	System.out.println("Cookie Button and email popup closed successfully in the Preprod URL");
	switchingTab(secondTab);
	vgw.clickCookieBtn();
	vgw.clickGigyaForm();
	System.out.println("Cookie Button and email popup closed successfully in the Live URL");
}
	@Test(priority = 2, enabled = true)
	private void verifyManageTheirPainTopically() throws Throwable {
		switchingTab(firstTab);
		vgw.clickonManageTheirPainTopically();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vgw.clickonManageTheirPainTopically();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
		}
	@Test(priority = 11)
	private void verifyShowReference() throws Exception{
	switchingTab(firstTab);
	vgw.clickShowReference();
	System.out.println("Show reference verified in the preprod URL");
	switchingTab(secondTab);
	vgw.clickShowReference();
	System.out.println("Show reference verified in the Live URL");
	}
	@Test(priority = 2, enabled = true)
	private void verifyOverTheCounterDiclofenacGel() throws Throwable {
		switchingTab(firstTab);
		vgw.clickonOverTheCounterDiclofenacGel();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vgw.clickonOverTheCounterDiclofenacGel();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
		}
	@Test(priority = 2, enabled = true)
	private void verifyHowOTCArthritisCreamsWork() throws Throwable {
		switchingTab(firstTab);
		vgw.clickonHowOTCArthritisCreamsWork();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vgw.clickonHowOTCArthritisCreamsWork();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
		}
	@Test(priority = 2, enabled = true)
	private void verifyGetCoupon() throws Throwable {
		switchingTab(firstTab);
		vgw.clickonGetCoupon();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		vgw.clickonGetCoupon();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
		}
	
	@Test(priority = 16)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		vgw.clickBuyNow();
		System.out.println("Buy Now Button verified in the preprod URL");
		switchingTab(secondTab);
		vgw.clickBuyNow();
		System.out.println("Buy Now Button verified in the Live URL");
	}

}
