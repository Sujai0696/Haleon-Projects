package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneManagingSensitiveTeethPage;
import com.qa.tums.eng.util.Retry;

public class SensodyneManagingSensitiveTeethTest extends BaseClass{
	
	SensodyneManagingSensitiveTeethPage mst;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("managingSensitiveTeethPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("managingSensitiveTeethLiveUrl"));
	}

	@Test(priority = 0, retryAnalyzer = Retry.class)
	private void cookieButton() throws Exception {
		mst = new SensodyneManagingSensitiveTeethPage();
		switchingTab(firstTab);
		mst.clickCookieBtn();
		mst.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		mst.clickCookieBtn();
		mst.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}

	@Test(priority = 1)
	private void verifyFindOutOne() throws Exception{
		switchingTab(firstTab);
		mst.clickFindOutOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		mst.clickFindOutOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same findout one: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyCheckThemOut() throws Exception{
		switchingTab(firstTab);
		mst.clickCheckThemOut();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		mst.clickCheckThemOut();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same check them out: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyFindOutTwo() throws Exception{
		switchingTab(firstTab);
		mst.clickFindOutTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		mst.clickFindOutTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same findout Two: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyFindOutThree() throws Exception{
		switchingTab(firstTab);
		mst.clickFindOutThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		mst.clickFindOutThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same findout Three: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyFindTheRightToothPaste() throws Exception{
		switchingTab(firstTab);
		mst.clickFindTheRightToothPaste();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		mst.clickFindTheRightToothPaste();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for find the right tooth paste: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyBreadCrumb() throws Exception{
		switchingTab(firstTab);
		mst.clickBreadCrumb();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		mst.clickBreadCrumb();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for breadcrumb: "+compareTwoText);
	}

}
