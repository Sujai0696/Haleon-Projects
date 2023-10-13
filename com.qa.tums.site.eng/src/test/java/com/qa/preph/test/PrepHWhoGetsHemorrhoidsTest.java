package com.qa.preph.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.preph.pages.PrepHWhoGetsHemorrhoids;

public class PrepHWhoGetsHemorrhoidsTest extends BaseClass{
	PrepHWhoGetsHemorrhoids pwg;
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("preph_es_Config.properties").getProperty("browser"));
		launchTwoUrl();
		
	}
	@BeforeMethod
	
	private void launchingTheUrl() throws Exception {
		pwg =new PrepHWhoGetsHemorrhoids();
		switchingTab(firstTab);
		launchURL(loadConfig("preph_Config.properties").getProperty("PrepHWhoGetsHemorrhoidsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("preph_Config.properties").getProperty("PrepHWhoGetsHemorrhoidsLiveUrl"));
	}
	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Exception {
	pwg =new PrepHWhoGetsHemorrhoids();
	switchingTab(firstTab);
	pwg.clickCookieBtn();
	System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
	switchingTab(secondTab);
	pwg.clickCookieBtn();
	System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
}
	@Test(priority = 2)
	private void verifyBreadHome() throws Exception{
		pwg =new PrepHWhoGetsHemorrhoids();
		switchingTab(firstTab);
		pwg.clickBreadHome();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pwg.clickBreadHome();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 3)
	private void verifyBreadArticles() throws Exception{
		switchingTab(firstTab);
		pwg.clickBreadArticles();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pwg.clickBreadArticles();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 4)
	private void verifyHemorrhoids() throws Exception{
		switchingTab(firstTab);
		pwg.clickHemorrhoids();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pwg.clickHemorrhoids();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 5)
	private void verifyTypeOfHemorrhoids() throws Exception{
		switchingTab(firstTab);
		pwg.clickTypeOfHemorrhoids();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pwg.clickTypeOfHemorrhoids();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 6)
	private void verifyAfterGivingBirth() throws Exception{
		switchingTab(firstTab);
		pwg.clickAfterGivingBirth();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pwg.clickAfterGivingBirth();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 7)
	private void verifyHomeRemedies() throws Exception{
		pwg =new PrepHWhoGetsHemorrhoids();
		switchingTab(firstTab);
		pwg.clickHomeRemedies();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pwg.clickHomeRemedies();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 8)
	private void verifyHighFiberFoods() throws Exception{
		switchingTab(firstTab);
		pwg.clickHighFiberFoods();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pwg.clickHighFiberFoods();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 6)
	private void verifyPreparationHSoothingReliefCoolingSpray() throws Exception{
		switchingTab(firstTab);
		pwg.clickPreparationHSoothingReliefCoolingSpray();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pwg.clickPreparationHSoothingReliefCoolingSpray();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 7)
	private void verifyPreparationHSoothingReliefAntiItchCream() throws Exception{
		pwg =new PrepHWhoGetsHemorrhoids();
		switchingTab(firstTab);
		pwg.clickPreparationHSoothingReliefAntiItchCream();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pwg.clickPreparationHSoothingReliefAntiItchCream();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 8)
	private void verifyPreparationHRapidReliefTotableWipes() throws Exception{
		switchingTab(firstTab);
		pwg.clickPreparationHRapidReliefTotableWipes();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pwg.clickPreparationHRapidReliefTotableWipes();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 8)
	private void verifyRelievingHemorrhoidSymptoms() throws Exception{
		switchingTab(firstTab);
		pwg.clickRelievingHemorrhoidSymptoms();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pwg.clickRelievingHemorrhoidSymptoms();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 13)
	private void verifyArticle1() throws Exception{
		switchingTab(firstTab);
		pwg.clickArticle1();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pwg.clickArticle1();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 14)
	private void verifyArticle2() throws Exception{
		switchingTab(firstTab);
		pwg.clickArticle2();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pwg.clickArticle2();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 15)
	private void verifyArticle3() throws Exception{
		switchingTab(firstTab);
		pwg.clickArticle3();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pwg.clickArticle3();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}


}
