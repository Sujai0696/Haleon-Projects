package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneFallTreatsCausingToothSensitivityPage;
import com.qa.tums.eng.util.Retry;

public class SensodyneFallTreatsCausingToothSensitivityTest extends BaseClass{
	
	SensodyneFallTreatsCausingToothSensitivityPage ft;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("fallTreatscausingToothSensitivityPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("fallTreatscausingToothSensitivityLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		ft = new SensodyneFallTreatsCausingToothSensitivityPage();
		switchingTab(firstTab);
		ft.clickCookieBtn();
		ft.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		ft.clickCookieBtn();
		ft.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}
	
	
	@Test(priority = 1)
	private void verifyBackToTheArticleList() throws Exception{
		switchingTab(firstTab);
		ft.clickBackToTheArticleList();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ft.clickBackToTheArticleList();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for back to the article list: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyTakeAMomentAndAssess() throws Exception{
		switchingTab(firstTab);
		ft.clickTakeAMomentAndAssess();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ft.clickTakeAMomentAndAssess();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Take A Moment And Assess: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyReallySweetLink() throws Exception{
		switchingTab(firstTab);
		ft.clickReallySweet();
		String preProdUrl = getCurrentUrl();
		switchingTab(secondTab);
		ft.clickReallySweet();
		String liveUrl = getCurrentUrl();
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for really sweet Link: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyHotColdLink() throws Exception{
		switchingTab(firstTab);
		ft.clickHotColdLink();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ft.clickHotColdLink();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for hot cold link: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyGumDisease() throws Exception{
		switchingTab(firstTab);
		ft.clickGumDisease();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ft.clickGumDisease();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Gum Disease: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifySensodyneRapidReleif() throws Exception{
		switchingTab(firstTab);
		ft.clickSensodyneRapidReleif();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ft.clickSensodyneRapidReleif();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Rapid Releif: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyRelatedArticleOne() throws Exception{
		switchingTab(firstTab);
		ft.clickRelatedArticleOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ft.clickRelatedArticleOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article one: "+compareTwoText);
	}
	

	@Test(priority = 8)
	private void verifyRelatedArticleTwo() throws Exception{
		switchingTab(firstTab);
		ft.clickRelatedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ft.clickRelatedArticleTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article two: "+compareTwoText);
	}
	

	@Test(priority = 9)
	private void verifyRelatedArticleThree() throws Exception{
		switchingTab(firstTab);
		ft.clickRelatedArticleThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ft.clickRelatedArticleThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article three: "+compareTwoText);
	}
	

	@Test(priority = 10)
	private void verifyRelatedArticleFour() throws Exception{
		switchingTab(firstTab);
		ft.clickRelatedArticleFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ft.clickRelatedArticleFour();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article Four: "+compareTwoText);
	}

}
