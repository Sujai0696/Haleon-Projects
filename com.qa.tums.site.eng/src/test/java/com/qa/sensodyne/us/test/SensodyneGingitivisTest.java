package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneGingitivisPage;
import com.qa.sensodyne.us.page.SensodyneSensitivityToColdPage;
import com.qa.tums.eng.util.Retry;

public class SensodyneGingitivisTest extends BaseClass{
	
	SensodyneGingitivisPage gp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("gingivitisPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("gingivitisLiveUrl"));
	}

	@Test(priority = 0, retryAnalyzer = Retry.class)
	private void cookieButton() throws Exception {
		gp = new SensodyneGingitivisPage();
		switchingTab(firstTab);
		gp.clickCookieBtn();
		gp.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		gp.clickCookieBtn();
		gp.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyNoticingBlood() throws Exception{
		switchingTab(firstTab);
		gp.clickNoticingBlood();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		gp.clickNoticingBlood();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Noticing Blood: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyGingitivis() throws Exception{
		switchingTab(firstTab);
		gp.clickGingitivis();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		gp.clickGingitivis();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Gingitivis: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyOralHygiene() throws Exception{
		switchingTab(firstTab);
		gp.clickOralHygiene();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		gp.clickOralHygiene();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Oral Hygiene: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyFlossingAtLeast() throws Exception{
		switchingTab(firstTab);
		gp.clickFlossingAtLeast();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		gp.clickFlossingAtLeast();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Flossing At Least: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifySensodyneSensitivityGum() throws Exception{
		switchingTab(firstTab);
		gp.clickSensodyneSensitivityGum();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		gp.clickSensodyneSensitivityGum();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Sensitivity Gum: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyProductTextOne() throws Exception{
		switchingTab(firstTab);
		gp.clickProductTextOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		gp.clickProductTextOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product Text One:"+compareTwoText);
	}


	@Test(priority = 7)
	private void verifyProductTextTwo() throws Exception{
		switchingTab(firstTab);
		gp.clickProductTextTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		gp.clickProductTextTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product Text Two:"+compareTwoText);
	}

	@Test(priority = 8)
	private void verifyProductTextThree() throws Exception{
		switchingTab(firstTab);
		gp.clickProductTextThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		gp.clickProductTextThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product Text Three:"+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyProductImageOne() throws Exception{
		switchingTab(firstTab);
		gp.clickProductImageOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		gp.clickProductImageOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product Image One:"+compareTwoText);
	}

	@Test(priority = 10)
	private void verifyProductImageTwo() throws Exception{
		switchingTab(firstTab);
		gp.clickProductImageTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		gp.clickProductImageTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product Image Two:"+compareTwoText);
	}

	@Test(priority = 11)
	private void verifyProductImageThree() throws Exception{
		switchingTab(firstTab);
		gp.clickProductImageThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		gp.clickProductImageThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product Image Three:"+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyBuyNowOne() throws Exception{
		switchingTab(firstTab);
		gp.clickBuyNowOne();
		System.out.println("Write a buy now button one verified successfully in the preprod Url");
		switchingTab(secondTab);
		gp.clickBuyNowOne();
		System.out.println("Write a buy now button one verified successfully in the live Url");
	}

	@Test(priority = 13)
	private void verifyBuyNowTwo() throws Exception{
		switchingTab(firstTab);
		gp.clickBuyNowTwo();
		System.out.println("Write a buy now button Two verified successfully in the preprod Url");
		switchingTab(secondTab);
		gp.clickBuyNowTwo();
		System.out.println("Write a buy now button Two verified successfully in the live Url");
	}

	@Test(priority = 14)
	private void verifyBuyNowThree() throws Exception{
		switchingTab(firstTab);
		gp.clickBuyNowThree();
		System.out.println("Write a buy now button three verified successfully in the preprod Url");
		switchingTab(secondTab);
		gp.clickBuyNowThree();
		System.out.println("Write a buy now button three verified successfully in the live Url");
	}
	
	@Test(priority = 15)
	private void verifyProductCardLearnMoreOne() throws Exception{
		switchingTab(firstTab);
		gp.clickProductCardLearnMoreOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		gp.clickProductCardLearnMoreOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products card learn more one :"+compareTwoText);
	}

	@Test(priority = 16)
	private void verifyProductCardLearnMoreTwo() throws Exception{
		switchingTab(firstTab);
		gp.clickProductCardLearnMoreTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		gp.clickProductCardLearnMoreTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products card learn more two :"+compareTwoText);
	}

	@Test(priority = 17)
	private void verifyProductCardLearnMoreThree() throws Exception{
		switchingTab(firstTab);
		gp.clickProductCardLearnMoreThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		gp.clickProductCardLearnMoreThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products card learn more three :"+compareTwoText);
	}


	@Test(priority = 18)
	private void verifyRadioButtonOne() throws Exception{
		switchingTab(firstTab);
		gp.clickRadioButtonOne();
		System.out.println("Radio Button one is verified in the preprod Url");
		switchingTab(secondTab);
		gp.clickRadioButtonOne();
		System.out.println("Radio Button one is verified in the live Url");
	}
	
	@Test(priority = 19)
	private void verifyRadioButtonTwo() throws Exception{
		switchingTab(firstTab);
		gp.clickRadioButtonTwo();
		System.out.println("Radio Button two is verified in the preprod Url");
		switchingTab(secondTab);
		gp.clickRadioButtonTwo();
		System.out.println("Radio Button two is verified in the live Url");
	}
	
	@Test(priority = 20)
	private void verifyRadioButtonThree() throws Exception{
		switchingTab(firstTab);
		gp.clickRadioButtonThree();
		System.out.println("Radio Button three is verified in the preprod Url");
		switchingTab(secondTab);
		gp.clickRadioButtonThree();
		System.out.println("Radio Button three is verified in the live Url");
	}
	
	@Test(priority = 21)
	private void verifyRadioButtonFour() throws Exception{
		switchingTab(firstTab);
		gp.clickRadioButtonFour();
		System.out.println("Radio Button four is verified in the preprod Url");
		switchingTab(secondTab);
		gp.clickRadioButtonFour();
		System.out.println("Radio Button four is verified in the live Url");
	}
	
	@Test(priority = 22)
	private void verifyRadioButtonFive() throws Exception{
		switchingTab(firstTab);
		gp.clickRadioButtonFive();
		System.out.println("Radio Button five is verified in the preprod Url");
		switchingTab(secondTab);
		gp.clickRadioButtonFive();
		System.out.println("Radio Button five is verified in the live Url");
	}
	
	@Test(priority = 23)
	private void verifyRadioButtonSix() throws Exception{
		switchingTab(firstTab);
		gp.clickRadioButtonSix();
		System.out.println("Radio Button Six is verified in the preprod Url");
		switchingTab(secondTab);
		gp.clickRadioButtonSix();
		System.out.println("Radio Button Six is verified in the live Url");
	}
	
	@Test(priority = 24)
	private void verifyRelatedArticleOne() throws Exception{
		switchingTab(firstTab);
		gp.clickRelatedArticleOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		gp.clickRelatedArticleOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article one: "+compareTwoText);
	}
	

	@Test(priority = 25)
	private void verifyRelatedArticleTwo() throws Exception{
		switchingTab(firstTab);
		gp.clickRelatedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		gp.clickRelatedArticleTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article two: "+compareTwoText);
	}
	

	@Test(priority = 26)
	private void verifyRelatedArticleThree() throws Exception{
		switchingTab(firstTab);
		gp.clickRelatedArticleThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		gp.clickRelatedArticleThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article three: "+compareTwoText);
	}
	

	@Test(priority = 27)
	private void verifyRelatedArticleFour() throws Exception{
		switchingTab(firstTab);
		gp.clickRelatedArticleFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		gp.clickRelatedArticleFour();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article Four: "+compareTwoText);
	}
	
	@Test(priority = 28)
	private void verifyBreadCrumb() throws Exception{
		switchingTab(firstTab);
		gp.clickBreadCrumb();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		gp.clickBreadCrumb();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Bread Crumb: "+compareTwoText);
	}

	
	
	
	
}
