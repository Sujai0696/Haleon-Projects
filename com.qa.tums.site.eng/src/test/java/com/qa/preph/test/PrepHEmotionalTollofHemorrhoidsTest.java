package com.qa.preph.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.preph.pages.PrepHEmotionalTollofHemorrhoids;

public class PrepHEmotionalTollofHemorrhoidsTest extends BaseClass{
	PrepHEmotionalTollofHemorrhoids pet;
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("preph_Config.properties").getProperty("browser"));
		launchTwoUrl();
		
	}
	@BeforeMethod
	
	private void launchingTheUrl() throws Exception {
		pet =new PrepHEmotionalTollofHemorrhoids();
		switchingTab(firstTab);
		launchURL(loadConfig("preph_Config.properties").getProperty("PrepHEmotionalTollofHemorrhoidsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("preph_Config.properties").getProperty("PrepHEmotionalTollofHemorrhoidsLiveUrl"));
	}
	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Exception {
	pet =new PrepHEmotionalTollofHemorrhoids();
	switchingTab(firstTab);
	pet.clickCookieBtn();
	System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
	switchingTab(secondTab);
	pet.clickCookieBtn();
	System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
}
	@Test(priority = 2)
	private void verifyBreadHome() throws Exception{
		pet =new PrepHEmotionalTollofHemorrhoids();
		switchingTab(firstTab);
		pet.clickBreadHome();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pet.clickBreadHome();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 3)
	private void verifyBreadArticles() throws Exception{
		switchingTab(firstTab);
		pet.clickBreadArticles();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pet.clickBreadArticles();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 4)
	private void verifyHemorrhoidsLink1() throws Exception{
		switchingTab(firstTab);
		pet.clickHemorrhoidsLink1();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pet.clickHemorrhoidsLink1();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 5)
	private void verifyFlareUp() throws Exception{
		switchingTab(firstTab);
		pet.clickFlareUp();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pet.clickFlareUp();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 6)
	private void verifyHemorrhoidsLink2() throws Exception{
		switchingTab(firstTab);
		pet.clickHemorrhoidsLink2();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pet.clickHemorrhoidsLink2();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 7)
	private void verifyStressCanHaveNegativeEffectOnHemorrhoids() throws Exception{
		pet =new PrepHEmotionalTollofHemorrhoids();
		switchingTab(firstTab);
		pet.clickStressCanHaveNegativeEffectOnHemorrhoids();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pet.clickStressCanHaveNegativeEffectOnHemorrhoids();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 8)
	private void verifyCauseHemorrhoidFlareUps() throws Exception{
		switchingTab(firstTab);
		pet.clickCauseHemorrhoidFlareUps();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pet.clickCauseHemorrhoidFlareUps();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 3)
	private void verifyCauseHemorrhoidFlareUps2() throws Exception{
		switchingTab(firstTab);
		pet.clickCauseHemorrhoidFlareUps2();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pet.clickCauseHemorrhoidFlareUps2();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 4)
	private void verifyCauseHemorrhoids() throws Exception{
		switchingTab(firstTab);
		pet.clickCauseHemorrhoids();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pet.clickCauseHemorrhoids();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 5)
	private void verifyStressRelievers() throws Exception{
		switchingTab(firstTab);
		pet.clickStressRelievers();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pet.clickStressRelievers();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 9)
	private void verifyArticle1() throws Exception{
		switchingTab(firstTab);
		pet.clickArticle1();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pet.clickArticle1();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 10)
	private void verifyArticle2() throws Exception{
		switchingTab(firstTab);
		pet.clickArticle2();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pet.clickArticle2();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}
	@Test(priority = 11)
	private void verifyArticle3() throws Exception{
		switchingTab(firstTab);
		pet.clickArticle3();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		pet.clickArticle3();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Products One:"+compareTwoText);
	}


}
