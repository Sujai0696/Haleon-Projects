package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneGumHealthPage;
import com.qa.sensodyne.us.page.SensodyneManagingSensitiveTeethPage;
import com.qa.tums.eng.util.Retry;

public class SensodyneGumHealthTest extends BaseClass{
	
	SensodyneGumHealthPage gh;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("gumHealthPreprodUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("gumHealthLiveUrl"));
	}

	@Test(priority = 0, retryAnalyzer = Retry.class)
	private void cookieButton() throws Exception {
		gh = new SensodyneGumHealthPage();
		switchingTab(firstTab);
		gh.clickCookieBtn();
		gh.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		gh.clickCookieBtn();
		gh.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyLearnMoreOne() throws Exception{
		switchingTab(firstTab);
		gh.clickLearnMoreOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		gh.clickLearnMoreOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same learn more one: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyFindOutWhy() throws Exception{
		switchingTab(firstTab);
		gh.clickFindOutWhy();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		gh.clickFindOutWhy();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same find out why: "+compareTwoText);
	}

	@Test(priority = 3)
	private void verifyLearnMoreTwo() throws Exception{
		switchingTab(firstTab);
		gh.clickLearnMoreTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		gh.clickLearnMoreTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same learn more two: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyLearnMoreThree() throws Exception{
		switchingTab(firstTab);
		gh.clickLearnMoreThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		gh.clickLearnMoreThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same learn more three: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyLearnMoreFour() throws Exception{
		switchingTab(firstTab);
		gh.clickLearnMoreFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		gh.clickLearnMoreFour();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same learn more four: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyFindOutOne() throws Exception{
		switchingTab(firstTab);
		gh.clickFindOutOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		gh.clickFindOutOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same find out one: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyFindOutTwo() throws Exception{
		switchingTab(firstTab);
		gh.clickFindOutTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		gh.clickFindOutTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same find out two: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyLearnMoreFive() throws Exception{
		switchingTab(firstTab);
		gh.clickLearnMoreFive();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		gh.clickLearnMoreFive();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same learn more five: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyLearnMoreSix() throws Exception{
		switchingTab(firstTab);
		gh.clickLearnMoreSix();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		gh.clickLearnMoreSix();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same learn more six: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyLearnMoreSeven() throws Exception{
		switchingTab(firstTab);
		gh.clickLearnMoreSeven();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		gh.clickLearnMoreSeven();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same learn more seven: "+compareTwoText);
	}
	
	
	@Test(priority = 10)
	private void verifyFindTheRightToothPaste() throws Exception{
		switchingTab(firstTab);
		gh.clickFindTheRightToothPaste();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		gh.clickFindTheRightToothPaste();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for find the right tooth paste: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyBreadCrumb() throws Exception{
		switchingTab(firstTab);
		gh.clickBreadCrumb();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		gh.clickBreadCrumb();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for breadcrumb: "+compareTwoText);
	}
	
}
