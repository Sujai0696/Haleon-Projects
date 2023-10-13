package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneUnusualNewYearResolutionsPage;
import com.qa.tums.eng.util.Retry;

public class SensodyneUnusualNewYearResolutionsTest extends BaseClass{
	
	SensodyneUnusualNewYearResolutionsPage un;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("unusalNewYearResolutionsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("unusalNewYearResolutionsLiveUrl"));
	}

	@Test(priority = 0, retryAnalyzer = Retry.class)
	private void cookieButton() throws Exception {
		un = new SensodyneUnusualNewYearResolutionsPage();
		switchingTab(firstTab);
		un.clickCookieBtn();
		un.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		un.clickCookieBtn();
		un.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}
	
	
	@Test(priority = 1)
	private void verifyBackToTheArticleList() throws Exception{
		switchingTab(firstTab);
		un.clickBackToTheArticleList();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		un.clickBackToTheArticleList();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for back to the article list: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyTakeControlOfToothSensitivityLinkOne() throws Exception{
		switchingTab(firstTab);
		un.clickTakeControlOfToothSensitivityLinkOne();
		String preProdUrl = getCurrentUrl();
		switchingTab(secondTab);
		un.clickTakeControlOfToothSensitivityLinkOne();
		String liveUrl = getCurrentUrl();
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for tooth sensitivity link one: "+compareTwoText);
	}
	
	
	@Test(priority = 3)
	private void verifyTakeControlOfToothSensitivityLinkTwo() throws Exception{
		switchingTab(firstTab);
		un.clickTakeControlOfToothSensitivityLinkTwo();
		String preProdUrl = getCurrentUrl();
		switchingTab(secondTab);
		un.clickTakeControlOfToothSensitivityLinkTwo();
		String liveUrl = getCurrentUrl();
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for tooth sensitivity link two: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyTeachYourselfSomethingLink() throws Exception{
		switchingTab(firstTab);
		un.clickTeachYourselfSomethingLink();
		String preProdUrl = getCurrentUrl();
		switchingTab(secondTab);
		un.clickTeachYourselfSomethingLink();
		String liveUrl = getCurrentUrl();
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for teach yourself something link: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyReadABookLink() throws Exception{
		switchingTab(firstTab);
		un.clickReadABookLink();
		String preProdUrl = getCurrentUrl();
		switchingTab(secondTab);
		un.clickReadABookLink();
		String liveUrl = getCurrentUrl();
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for read a book link: "+compareTwoText);
	}
	
	@Test(priority = 6)
	public void verifyRelatedArticleOne() throws Exception{
		switchingTab(firstTab);
		un.clickRelatedArticleOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		un.clickRelatedArticleOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article one: "+compareTwoText);
	}
	
	@Test(priority = 7)
	public void verifyRelatedArticleTwo() throws Exception{
		switchingTab(firstTab);
		un.clickRelatedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		un.clickRelatedArticleTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article two: "+compareTwoText);
	}
	
	@Test(priority = 8)
	public void verifyRelatedArticleThree() throws Exception{
		switchingTab(firstTab);
		un.clickRelatedArticleThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		un.clickRelatedArticleThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article three: "+compareTwoText);
	}
	
	@Test(priority = 9)
	public void verifyRelatedArticleFour() throws Exception{
		switchingTab(firstTab);
		un.clickRelatedArticleFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		un.clickRelatedArticleFour();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article four: "+compareTwoText);
	}
	

}
