package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.abreva.pages.AbrevaColdSoresAndStressPage;
import com.qa.baseClass.BaseClass;

public class AbrevaColdSoresAndStressTest extends BaseClass{
	
	AbrevaColdSoresAndStressPage css;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("Abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		css = new AbrevaColdSoresAndStressPage();
		switchingTab(firstTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("coldSoresAndStressPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("coldSoresAndStressLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		css.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		css.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyHyperLinkManyThingsThatCanTriggerColdSores() throws Exception{
		switchingTab(firstTab);
		css.clickHyperLinkManyThingsThatCanTriggerColdSores();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		css.clickHyperLinkManyThingsThatCanTriggerColdSores();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Many Things That Can Trigger Cold Sores: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyHyperLinkColdWeather() throws Exception{
		switchingTab(firstTab);
		css.clickHyperLinkColdWeather();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		css.clickHyperLinkColdWeather();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Cold Weather: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyHyperLinkColdSoreSymptoms() throws Exception{
		switchingTab(firstTab);
		css.clickHyperLinkColdSoreSymptoms();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		css.clickHyperLinkColdSoreSymptoms();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Cold Sore Symptoms: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyHyperLinkSleep() throws Exception{
		switchingTab(firstTab);
		css.clickHyperLinkSleep();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		css.clickHyperLinkSleep();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Sleep: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyHyperLinkExercise() throws Exception{
		switchingTab(firstTab);
		css.clickHyperLinkExercise();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		css.clickHyperLinkExercise();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Exercise: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyHyperLinkLipHealth() throws Exception{
		switchingTab(firstTab);
		css.clickHyperLinkLipHealth();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		css.clickHyperLinkLipHealth();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Lip Health: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyReadOurLipCareTips() throws Exception{
		switchingTab(firstTab);
		css.clickReadOurLipCareTips();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		css.clickReadOurLipCareTips();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Read Our Lip Care Tips: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		css.clickBuyNow();
		System.out.println("Buy Now Button verified in the preprod URL");
		switchingTab(secondTab);
		css.clickBuyNow();
		System.out.println("Buy Now Button verified in the Live URL");
	}

}
