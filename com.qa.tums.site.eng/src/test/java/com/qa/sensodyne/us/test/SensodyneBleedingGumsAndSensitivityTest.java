package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneBleedingGumsAndSensitivityPage;
import com.qa.tums.eng.util.ExtentManager;

public class SensodyneBleedingGumsAndSensitivityTest extends BaseClass{
	
	SensodyneBleedingGumsAndSensitivityPage bg;
	
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("bleedingGumsAndSensitivityPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("bleedingGumsAndSensitivityLiveUrl"));
	}

	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		bg = new SensodyneBleedingGumsAndSensitivityPage();
		switchingTab(firstTab);
		bg.clickCookieBtn();
		bg.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		bg.clickCookieBtn();
		bg.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}
	
	
	@Test(priority = 1)
	private void VerifyTwingeOfPain() throws Exception{
		switchingTab(firstTab);
		bg.clickTwingeOfPain();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		bg.clickTwingeOfPain();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for View Products:"+compareTwoText);
	}
	
	
	@Test(priority = 2)
	private void verifyRadioButtonOne() throws Exception{
		switchingTab(firstTab);
		bg.clickRadioButtonOne();
		System.out.println("Radio Button one is verified in the preprod Url");
		switchingTab(secondTab);
		bg.clickRadioButtonOne();
		System.out.println("Radio Button one is verified in the live Url");
	}
	
	@Test(priority = 3)
	private void verifyRadioButtonTwo() throws Exception{
		switchingTab(firstTab);
		bg.clickRadioButtonTwo();
		System.out.println("Radio Button two is verified in the preprod Url");
		switchingTab(secondTab);
		bg.clickRadioButtonTwo();
		System.out.println("Radio Button two is verified in the live Url");
	}
	
	@Test(priority = 4)
	private void verifyRadioButtonThree() throws Exception{
		switchingTab(firstTab);
		bg.clickRadioButtonThree();
		System.out.println("Radio Button three is verified in the preprod Url");
		switchingTab(secondTab);
		bg.clickRadioButtonThree();
		System.out.println("Radio Button three is verified in the live Url");
	}
	
	@Test(priority = 5)
	private void verifyRadioButtonFour() throws Exception{
		switchingTab(firstTab);
		bg.clickRadioButtonFour();
		System.out.println("Radio Button four is verified in the preprod Url");
		switchingTab(secondTab);
		bg.clickRadioButtonFour();
		System.out.println("Radio Button four is verified in the live Url");
	}
	
	@Test(priority = 6)
	private void verifyRadioButtonFive() throws Exception{
		switchingTab(firstTab);
		bg.clickRadioButtonFive();
		System.out.println("Radio Button five is verified in the preprod Url");
		switchingTab(secondTab);
		bg.clickRadioButtonFive();
		System.out.println("Radio Button five is verified in the live Url");
	}
	
	@Test(priority = 7)
	private void verifyRadioButtonSix() throws Exception{
		switchingTab(firstTab);
		bg.clickRadioButtonSix();
		System.out.println("Radio Button Six is verified in the preprod Url");
		switchingTab(secondTab);
		bg.clickRadioButtonSix();
		System.out.println("Radio Button Six is verified in the live Url");
	}
	
	@Test(priority = 8)
	private void verifySensodyneSensitivityAndGumLink() throws Exception{
		switchingTab(firstTab);
		bg.clickSensodyneSensitivityAndGumLink();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		bg.clickSensodyneSensitivityAndGumLink();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne sensitivity and gum :"+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyLearMoreLink() throws Exception{
		switchingTab(firstTab);
		bg.clickLearnMoreLink();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		bg.clickLearnMoreLink();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for learn more :"+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyRelatedArticleOne() throws Exception{
		switchingTab(firstTab);
		bg.clickRealatedArticleOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		bg.clickRealatedArticleOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyRelatedArticleTwo() throws Exception{
		switchingTab(firstTab);
		bg.clickRealatedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		bg.clickRealatedArticleTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article two :"+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyRelatedArticleThree() throws Exception{
		switchingTab(firstTab);
		bg.clickRealatedArticleThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		bg.clickRealatedArticleThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article three :"+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyRelatedArticleFour() throws Exception{
		switchingTab(firstTab);
		bg.clickRealatedArticleFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		bg.clickRealatedArticleFour();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article Four :"+compareTwoText);
	}

}
