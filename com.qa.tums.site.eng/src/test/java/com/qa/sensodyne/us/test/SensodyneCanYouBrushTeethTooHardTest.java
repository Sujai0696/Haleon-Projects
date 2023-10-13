package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneCanYouBrushTeethTooHardPage;
import com.qa.tums.eng.util.Retry;

public class SensodyneCanYouBrushTeethTooHardTest extends BaseClass{

	SensodyneCanYouBrushTeethTooHardPage cy;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("canYouBrushTeethTooHardPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("canYouBrushTeethTooHardLiveUrl"));
	}

	@Test(priority = 0, retryAnalyzer = Retry.class)
	private void cookieButton() throws Exception {
		cy = new SensodyneCanYouBrushTeethTooHardPage();
		switchingTab(firstTab);
		cy.clickCookieBtn();
		cy.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		cy.clickCookieBtn();
		cy.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}
	
	
	@Test(priority = 1)
	private void verifyBackToTheArticleList() throws Exception{
		switchingTab(firstTab);
		cy.clickBackToTheArticleList();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		cy.clickBackToTheArticleList();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for back to the article list: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyIsItPossibleLinkOne() throws Exception{
		switchingTab(firstTab);
		cy.clickIsItPossibleLinkOne();
		String preProdUrl = getCurrentUrl();
		switchingTab(secondTab);
		cy.clickIsItPossibleLinkOne();
		String liveUrl = getCurrentUrl();
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same findout one: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyIsItPossibleLinkTwo() throws Exception{
		switchingTab(firstTab);
		cy.clickIsItPossibleLinkTwo();
		String preProdUrl = getCurrentUrl();
		switchingTab(secondTab);
		cy.clickIsItPossibleLinkTwo();
		String liveUrl = getCurrentUrl();
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same findout two: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyDamagedCausedLink() throws Exception{
		switchingTab(firstTab);
		cy.clickDamagedCausedLink();
		String preProdUrl = getCurrentUrl();
		switchingTab(secondTab);
		cy.clickDamagedCausedLink();
		String liveUrl = getCurrentUrl();
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for damaged caused link: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyHowToBrushCorrectlyLink() throws Exception{
		switchingTab(firstTab);
		cy.clickHowToBrushCorrectlyLink();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		cy.clickHowToBrushCorrectlyLink();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for how to brush correctly link: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyRelatedArticleOne() throws Exception{
		switchingTab(firstTab);
		cy.clickRelatedArticleOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		cy.clickRelatedArticleOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article one: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyRelatedArticleTwo() throws Exception{
		switchingTab(firstTab);
		cy.clickRelatedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		cy.clickRelatedArticleTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article two: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyRelatedArticleThree() throws Exception{
		switchingTab(firstTab);
		cy.clickRelatedArticleThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		cy.clickRelatedArticleThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article three: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyRelatedArticleFour() throws Exception{
		switchingTab(firstTab);
		cy.clickRelatedArticleFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		cy.clickRelatedArticleFour();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article four: "+compareTwoText);
	}
}
