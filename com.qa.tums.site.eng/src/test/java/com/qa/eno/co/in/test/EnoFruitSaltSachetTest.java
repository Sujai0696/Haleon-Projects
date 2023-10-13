package com.qa.eno.co.in.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.eno.co.in.pages.EnoFruitSaltSachetPage;

public class EnoFruitSaltSachetTest extends BaseClass{
	
	EnoFruitSaltSachetPage fss;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("eno_co_inConfig.properties").getProperty("browser"));
		launchTwoUrl();
		
	}
	
	@BeforeMethod
	private void LaunchingTheUrl() throws IOException, Exception {
		fss = new EnoFruitSaltSachetPage();
		switchingTab(firstTab);
		launchURL(loadConfig("eno_co_inConfig.properties").getProperty("enoFruitSaltSachetPreprodUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("eno_co_inConfig.properties").getProperty("enoFruitSaltSachetLiveUrl"));
	}
	
	@Test(priority = 0)
	private void verifyFlavourTwoLemon() throws Exception{
		switchingTab(firstTab);
		refreshWebPage();
		fss.clickFlavourTwoLemon();
		System.out.println("Lemon Flavor is verified in the Preprod URL");
		switchingTab(secondTab);
		refreshWebPage();
		fss.clickFlavourTwoLemon();
		System.out.println("Lemon Flavor is verified in the Live URL");
		
	}
	
	@Test(priority = 1)
	private void verifyFlavourThreeCola() throws Exception{
		switchingTab(firstTab);
		refreshWebPage();
		fss.clickFlavourThreeCola();
		System.out.println("Cola Flavor is verified in the Preprod URL");
		switchingTab(secondTab);
		refreshWebPage();
		fss.clickFlavourThreeCola();
		System.out.println("Cola Flavor is verified in the Live URL");
		
	}
	
	@Test(priority = 2)
	private void verifyFlavourFourOrange() throws Exception{
		switchingTab(firstTab);
		refreshWebPage();
		fss.clickFlavourFourOrange();
		System.out.println("Orange Flavor is verified in the Preprod URL");
		switchingTab(secondTab);
		refreshWebPage();
		fss.clickFlavourFourOrange();
		System.out.println("Orange Flavor is verified in the Live URL");
	}
	
	@Test(priority = 3)
	private void verifyFlavourFiveLimao() throws Exception{
		switchingTab(firstTab);
		refreshWebPage();
		fss.clickFlavourFiveLimao();
		System.out.println("Limao Flavor is verified in the Preprod URL");
		switchingTab(secondTab);
		refreshWebPage();
		fss.clickFlavourFiveLimao();
		System.out.println("Limao Flavor is verified in the Live URL");
	}
	
	@Test(priority = 4)
	private void verifyFlavourSixMusambi() throws Exception{
		switchingTab(firstTab);
		refreshWebPage();
		fss.clickFlavourSixMusambi();
		System.out.println("Musambi Flavor is verified in the Preprod URL");
		switchingTab(secondTab);
		refreshWebPage();
		fss.clickFlavourSixMusambi();
		System.out.println("Musambi Flavor is verified in the Live URL");
	}
	
	
	@Test(priority = 5)
	private void verifyBottleAndSachet() throws Exception{
		switchingTab(firstTab);
		refreshWebPage();
		fss.clickBottleAndSachet();
		System.out.println("Bottle and Sachet is verified in the Preprod URL");
		switchingTab(secondTab);
		refreshWebPage();
		fss.clickBottleAndSachet();
		System.out.println("Bottle and Sachet is verified in the Live URL");
	}
	
	@Test(priority = 6)
	private void verifyPrecautions() throws Exception{
		switchingTab(firstTab);
		fss.clickPrecautions();
		System.out.println("Precautions accordion is verified in the Preprod URL");
		switchingTab(secondTab);
		fss.clickPrecautions();
		System.out.println("Precautions accordion is verified in the Live URL");
	}
	
	@Test(priority = 7)
	private void verifyEnoSachetImg() throws Exception{
		switchingTab(firstTab);
		fss.clickEnoSachetImg();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		fss.clickEnoSachetImg();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Eno Sachet Img : "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyEnoSachetText() throws Exception{
		switchingTab(firstTab);
		fss.clickEnoSachetText();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		fss.clickEnoSachetText();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Eno Sachet Text : "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyEnoBottleImg() throws Exception{
		switchingTab(firstTab);
		fss.clickEnoBottleImg();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		fss.clickEnoBottleImg();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Eno Bottle Img : "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyEnoBottleText() throws Exception{
		switchingTab(firstTab);
		fss.clickEnoBottleText();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		fss.clickEnoBottleText();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Eno Bottle Text : "+compareTwoText);
	}
	

}
