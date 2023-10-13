package com.qa.voltarengel.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.voltarengel.pages.VoltarengelJointPainMedicinePage;

public class VoltarengelJointPainMedicineTest extends BaseClass{
	
	VoltarengelJointPainMedicinePage jpm;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("voltarengel_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		jpm = new VoltarengelJointPainMedicinePage();
		switchingTab(firstTab);
		launchURL(loadConfig("voltarengel_Config.properties").getProperty("jointPainMedicinePreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("voltarengel_Config.properties").getProperty("jointPainMedicineLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		jpm.clickCookieBtn();
		jpm.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Pop-up successfully verified in the Preprod URL");
		switchingTab(secondTab);
		jpm.clickCookieBtn();
		jpm.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Pop-up successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		jpm.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		jpm.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		jpm.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		jpm.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		jpm.clickBreadcrumbThree();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		jpm.clickBreadcrumbThree();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Three: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyHyperLinkVoltarenArthritisPainGel() throws Exception{
		switchingTab(firstTab);
		jpm.clickHyperLinkVoltarenArthritisPainGel();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		jpm.clickHyperLinkVoltarenArthritisPainGel();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Hyper Link Voltaren Arthritis Pain Gel: "+compareTwoText);
	}
	
	
	@Test(priority = 5)
	private void verifyHyperLinkAdvil() throws Exception{
		switchingTab(firstTab);
		jpm.clickHyperLinkAdvil();
		String preProdUrl = getCurrentUrl();
		switchingTab(secondTab);
		jpm.clickHyperLinkAdvil();
		String liveUrl = getCurrentUrl();
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Hyper Link Advil: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyHyperLinkAboutPain() throws Exception{
		switchingTab(firstTab);
		jpm.clickHyperLinkAboutPain();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		jpm.clickHyperLinkAboutPain();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Hyper Link About Pain: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyHyperLinkManagingYourArthritisSymptoms() throws Exception{
		switchingTab(firstTab);
		jpm.clickHyperLinkManagingYourArthritisSymptoms();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		jpm.clickHyperLinkManagingYourArthritisSymptoms();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Hyper Link Managing Your Arthritis Symptoms: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyShowReference() throws Exception{
		switchingTab(firstTab);
		jpm.clickShowReference();
		System.out.println("Show reference verified in the preprod URL");
		switchingTab(secondTab);
		jpm.clickShowReference();
		System.out.println("Show reference verified in the Live URL");
	}
	
	@Test(priority = 9)
	private void verifyRelatedArticleReadMoreOne() throws Exception{
		switchingTab(firstTab);
		jpm.clickRelatedArticleReadMoreOne();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		jpm.clickRelatedArticleReadMoreOne();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Related Article Read More One: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyRelatedArticleReadMoreTwo() throws Exception{
		switchingTab(firstTab);
		jpm.clickRelatedArticleReadMoreTwo();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		jpm.clickRelatedArticleReadMoreTwo();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Related Article Read More Two: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyGetCoupons() throws Exception{
		switchingTab(firstTab);
		jpm.clickGetCoupons();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		jpm.clickGetCoupons();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Get Coupons: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		jpm.clickBuyNow();
		System.out.println("Buy Now Button verified in the preprod URL");
		switchingTab(secondTab);
		jpm.clickBuyNow();
		System.out.println("Buy Now Button verified in the Live URL");
	}
	
	

}
