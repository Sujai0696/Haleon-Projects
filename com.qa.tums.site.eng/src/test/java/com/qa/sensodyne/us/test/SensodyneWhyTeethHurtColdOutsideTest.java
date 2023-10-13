package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneWhyTeethHurtColdOutsidePage;
import com.qa.tums.eng.util.Retry;

public class SensodyneWhyTeethHurtColdOutsideTest extends BaseClass{
	
	SensodyneWhyTeethHurtColdOutsidePage wt;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("whyTeethHurtColdOutsidePreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("whyTeethHurtColdOutsideLiveUrl"));
	}

	@Test(priority = 0, retryAnalyzer = Retry.class)
	private void cookieButton() throws Exception {
		wt = new SensodyneWhyTeethHurtColdOutsidePage();
		switchingTab(firstTab);
		wt.clickCookieBtn();
		wt.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		wt.clickCookieBtn();
		wt.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}
	
	
	@Test(priority = 1)
	private void verifyBackToTheArticleList() throws Exception{
		switchingTab(firstTab);
		wt.clickBackToTheArticleList();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		wt.clickBackToTheArticleList();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for back to the article list: "+compareTwoText);
	}
	
	
	@Test(priority = 2)
	private void verifyIfYourTeethLinkOne() throws Exception{
		switchingTab(firstTab);
		wt.clickIfYourTeethLinkOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		wt.clickIfYourTeethLinkOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for if your teeth link one: "+compareTwoText);
	}
	
//	@Test(priority = 4)
//	private void verifyIfYourTeethLinkTwo() throws Exception{
//		switchingTab(firstTab);
//		wt.clickIfYourTeethLinkTwo();
//		String preProdUrl = getCurrentUrl();
//		switchingTab(secondTab);
//		wt.clickIfYourTeethLinkTwo();
//		String liveUrl = getCurrentUrl();
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for if your teeth link two: "+compareTwoText);
//	}
	
	@Test(priority = 3)
	private void verifyIfYourTeethLinkThree() throws Exception{
		switchingTab(firstTab);
		wt.clickIfYourTeethLinkThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		wt.clickIfYourTeethLinkThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for if your teeth link three: "+compareTwoText);
	}
	
	
//	@Test(priority = 5)
//	private void verifyLivingWithToothSensitivityLinkOne() throws Exception{
//		switchingTab(firstTab);
//		wt.clickLivingWithToothSensitivityLinkOne();
//		String preProdUrl = getCurrentUrl();
//		switchingTab(secondTab);
//		wt.clickLivingWithToothSensitivityLinkOne();
//		String liveUrl = getCurrentUrl();
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for living with tooth senditivity link one : "+compareTwoText);
//	}
	
	@Test(priority = 6)
	private void verifyLivingWithToothSensitivityLinkTwo() throws Exception{
		switchingTab(firstTab);
		wt.clickLivingWithToothSensitivityLinkTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		wt.clickLivingWithToothSensitivityLinkTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for living with tooth senditivity link two : "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyLivingWithToothSensitivityLinkThree() throws Exception{
		switchingTab(firstTab);
		wt.clickLivingWithToothSensitivityLinkThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		wt.clickLivingWithToothSensitivityLinkThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for living with tooth senditivity link three : "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyHowToFixToothSensitivityLink() throws Exception{
		switchingTab(firstTab);
		wt.clickHowToFixToothSensitivityLink();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		wt.clickHowToFixToothSensitivityLink();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for how to fix tooth sensitivity: "+compareTwoText);
		
	}
	
	@Test(priority = 9)
	private void verifyRelatedArticleOne() throws Exception{
		switchingTab(firstTab);
		wt.clickRelatedArticleOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		wt.clickRelatedArticleOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article one: "+compareTwoText);
	}
	

	@Test(priority = 10)
	private void verifyRelatedArticleTwo() throws Exception{
		switchingTab(firstTab);
		wt.clickRelatedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		wt.clickRelatedArticleTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article two: "+compareTwoText);
	}
	

	@Test(priority = 11)
	private void verifyRelatedArticleThree() throws Exception{
		switchingTab(firstTab);
		wt.clickRelatedArticleThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		wt.clickRelatedArticleThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article three: "+compareTwoText);
	}
	

	@Test(priority = 12)
	private void verifyRelatedArticleFour() throws Exception{
		switchingTab(firstTab);
		wt.clickRelatedArticleFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		wt.clickRelatedArticleFour();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article Four: "+compareTwoText);
	}
	

}
