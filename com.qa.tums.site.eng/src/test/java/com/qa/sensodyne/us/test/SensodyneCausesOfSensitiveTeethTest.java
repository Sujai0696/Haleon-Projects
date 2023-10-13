package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneCausesOfSensitiveTeethPage;
import com.qa.tums.eng.util.Retry;

public class SensodyneCausesOfSensitiveTeethTest extends BaseClass{
	
	SensodyneCausesOfSensitiveTeethPage cs;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("causesOfSensitiveTeethPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("causesOfSensitiveTeethLiveUrl"));
	}

	@Test(priority = 0, retryAnalyzer = Retry.class)
	private void cookieButton() throws Exception {
		cs = new SensodyneCausesOfSensitiveTeethPage();
		switchingTab(firstTab);
		cs.clickCookieBtn();
		cs.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		cs.clickCookieBtn();
		cs.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}
	
	
	@Test(priority = 1)
	private void verifyBackToTheArticleList() throws Exception{
		switchingTab(firstTab);
		cs.clickBackToTheArticleList();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		cs.clickBackToTheArticleList();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for back to the article list: "+compareTwoText);
	}

	@Test(priority = 2)
	private void verifyEnamelWearLink() throws Exception{
		switchingTab(firstTab);
		cs.clickEnamelWearLink();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		cs.clickEnamelWearLink();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for enamel wear link: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyGumRecession() throws Exception{
		switchingTab(firstTab);
		cs.clickGumRecession();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		cs.clickGumRecession();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Gum Recession: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyAcidicFoodsAndDrinks() throws Exception{
		switchingTab(firstTab);
		cs.clickAcidicFoodsAndDrinks();
		String preProdUrl = getCurrentUrl();
		switchingTab(secondTab);
		cs.clickAcidicFoodsAndDrinks();
		String liveUrl = getCurrentUrl();
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for acidic foods and drinks: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifySpeciallyFormulated() throws Exception{
		switchingTab(firstTab);
		cs.clickSpeciallyFormulated();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		cs.clickSpeciallyFormulated();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Specially Formulated: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyExploreOurProducts() throws Exception{
		switchingTab(firstTab);
		cs.clickExploreOurProducts();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		cs.clickExploreOurProducts();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Explore Our Products: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyRelatedArticleOne() throws Exception{
		switchingTab(firstTab);
		cs.clickRelatedArticleOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		cs.clickRelatedArticleOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyRelatedArticleTwo() throws Exception{
		switchingTab(firstTab);
		cs.clickRelatedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		cs.clickRelatedArticleTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article two: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyRelatedArticleThree() throws Exception{
		switchingTab(firstTab);
		cs.clickRelatedArticleThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		cs.clickRelatedArticleThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article three: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyRelatedArticleFour() throws Exception{
		switchingTab(firstTab);
		cs.clickRelatedArticleFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		cs.clickRelatedArticleFour();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article Four: "+compareTwoText);
	}
	
}
