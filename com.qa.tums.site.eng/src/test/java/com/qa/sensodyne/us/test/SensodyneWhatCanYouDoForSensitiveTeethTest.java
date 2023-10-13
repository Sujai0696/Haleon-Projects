package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneWhatCanYouDoForSensitiveTeethPage;
import com.qa.tums.eng.util.Retry;

public class SensodyneWhatCanYouDoForSensitiveTeethTest extends BaseClass{
	
	SensodyneWhatCanYouDoForSensitiveTeethPage st;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("whatCanYouDoForSensitiveTeethPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("whatCanYouDoForSensitiveTeethLiveUrl"));
	}

	@Test(priority = 0, retryAnalyzer = Retry.class)
	private void cookieButton() throws Exception {
		st = new SensodyneWhatCanYouDoForSensitiveTeethPage();
		switchingTab(firstTab);
		st.clickCookieBtn();
		st.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		st.clickCookieBtn();
		st.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}
	
	
	@Test(priority = 1)
	private void verifyBackToTheArticleList() throws Exception{
		switchingTab(firstTab);
		st.clickBackToTheArticleList();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		st.clickBackToTheArticleList();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for back to the article list: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyAcademyOfGeneralDentistry() throws Exception{
		switchingTab(firstTab);
		st.clickAcademyOfGeneralDentistry();
		String preProdUrl = getCurrentUrl();
		switchingTab(secondTab);
		st.clickAcademyOfGeneralDentistry();
		String liveUrl = getCurrentUrl();
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for academy of general dentistry: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifySensitiveTeeth() throws Exception{
		switchingTab(firstTab);
		st.clickSensitiveTeeth();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		st.clickSensitiveTeeth();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensitive Teeth: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifySeveralReasons() throws Exception{
		switchingTab(firstTab);
		st.clickSeveralReasons();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		st.clickSeveralReasons();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Several Reasons: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyWhenYouEatCertainFoods() throws Exception{
		switchingTab(firstTab);
		st.clickWhenYouEatCertainFoods();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		st.clickWhenYouEatCertainFoods();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for When You Eat Certain Foods: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyGingivitis() throws Exception{
		switchingTab(firstTab);
		st.clickGingivitis();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		st.clickGingivitis();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Gingivitis: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifySensodyneRapidReleif() throws Exception{
		switchingTab(firstTab);
		st.clickSensodyneRapidReleif();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		st.clickSensodyneRapidReleif();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Rapid Releif: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifySwitchToAToothbrushLink() throws Exception{
		switchingTab(firstTab);
		st.clickSwitchToAToothbrush();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		st.clickSwitchToAToothbrush();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for switch to a tooth brush link: "+compareTwoText);
	}

	@Test(priority = 9)
	private void verifyEnamelErosion() throws Exception{
		switchingTab(firstTab);
		st.clickEnamelErosion();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		st.clickEnamelErosion();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Enamel Erosion: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyRelatedArticleOne() throws Exception{
		switchingTab(firstTab);
		st.clickRelatedArticleOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		st.clickRelatedArticleOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article one: "+compareTwoText);
	}
	

	@Test(priority = 11)
	private void verifyRelatedArticleTwo() throws Exception{
		switchingTab(firstTab);
		st.clickRelatedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		st.clickRelatedArticleTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article two: "+compareTwoText);
	}
	

	@Test(priority = 12)
	private void verifyRelatedArticleThree() throws Exception{
		switchingTab(firstTab);
		st.clickRelatedArticleThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		st.clickRelatedArticleThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article three: "+compareTwoText);
	}
	

	@Test(priority = 13)
	private void verifyRelatedArticleFour() throws Exception{
		switchingTab(firstTab);
		st.clickRelatedArticleFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		st.clickRelatedArticleFour();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article Four: "+compareTwoText);
	}
}
