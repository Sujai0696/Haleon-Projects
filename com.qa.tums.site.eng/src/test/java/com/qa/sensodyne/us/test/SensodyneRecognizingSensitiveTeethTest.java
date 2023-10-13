package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneRecognizingSensitiveTeethPage;
import com.qa.tums.eng.util.Retry;

public class SensodyneRecognizingSensitiveTeethTest extends BaseClass{
	
	SensodyneRecognizingSensitiveTeethPage rst;
	

	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("recognizingSensitiveTeethPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("recognizingSensitiveTeethLiveUrl"));
	}

	@Test(priority = 0, retryAnalyzer = Retry.class)
	private void cookieButton() throws Exception {
		rst = new SensodyneRecognizingSensitiveTeethPage();
		switchingTab(firstTab);
		rst.clickCookieBtn();
		rst.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		rst.clickCookieBtn();
		rst.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyLearnMore() throws Exception{
		switchingTab(firstTab);
		rst.clickLearnMore();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		rst.clickLearnMore();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for learn how: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyMythVsTruth() throws Exception{
		switchingTab(firstTab);
		rst.clickMythVsTruth();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		rst.clickMythVsTruth();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for myth vs truth: "+compareTwoText);
	}

	@Test(priority = 3)
	private void verifySensitivityAfterATrip() throws Exception{
		switchingTab(firstTab);
		rst.clickSensitivityAfterATrip();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		rst.clickSensitivityAfterATrip();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for sensitivity after a trip: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyCavityOrSensitiveTeeth() throws Exception{
		switchingTab(firstTab);
		rst.clickCavityOrSensitiveTeeth();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		rst.clickCavityOrSensitiveTeeth();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for cavity or sensitive teeth: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifySensodyneOrPronamel() throws Exception{
		switchingTab(firstTab);
		rst.clickSensodyneOrPronamel();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		rst.clickSensodyneOrPronamel();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for snesodyne or pronamel: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyFindTheRightToothPaste() throws Exception{
		switchingTab(firstTab);
		rst.clickFindTheRightToothPaste();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		rst.clickFindTheRightToothPaste();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for find the right tooth paste: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyBreadCrumb() throws Exception{
		switchingTab(firstTab);
		rst.clickBreadCrumb();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		rst.clickBreadCrumb();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for breadcrumb: "+compareTwoText);
	}
}
