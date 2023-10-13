package com.qa.rinazina.it.test;

import java.io.IOException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.baseClass.BaseClass;
import com.qa.rinazina.it.pages.RinazinaIpertonicoConEucaliptoPage;

public class RinazinaIpertonicoConEucaliptoTest extends BaseClass{
	
	RinazinaIpertonicoConEucaliptoPage ice;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("rinazina_itConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("rinazina_itConfig.properties").getProperty("ipertonicoConEucaliptoPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("rinazina_itConfig.properties").getProperty("ipertonicoConEucaliptoLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		ice = new RinazinaIpertonicoConEucaliptoPage();
		switchingTab(firstTab);
		ice.clickCookieBtn();
		System.out.println("Cookie Button clicked successfully verified in the Preprod URL");
		switchingTab(secondTab);
		ice.clickCookieBtn();
		System.out.println("Cookie Button clicked successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		ice.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		ice.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One :"+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		ice.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		ice.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two :"+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		ice.clickBreadcrumbThree();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		ice.clickBreadcrumbThree();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Three :"+compareTwoText);
	}
	
	
	@Test(priority = 4)
	private void verifyBreadcrumbFour() throws Exception{
		switchingTab(firstTab);
		ice.clickBreadcrumbFour();
		System.out.println("Breadcrumb Four is successfully verified in the preprod URL");
		switchingTab(secondTab);
		ice.clickBreadcrumbFour();
		System.out.println("Breadcrumb Four is successfully verified in the Live URL");
	}
	
	@Test(priority = 5)
	private void verifyAccordionOne() throws Exception{
		switchingTab(firstTab);
		ice.clickAccordionOne();
		System.out.println("Accordion One is successfully verified in the Preprod URL");
		switchingTab(secondTab);
		ice.clickAccordionOne();
		System.out.println("Accordion One is successfully verified in the Live URL");
	}
	
	@Test(priority = 6)
	private void verifyAccordionTwo() throws Exception{
		switchingTab(firstTab);
		ice.clickAccordionTwo();
		System.out.println("Accordion Two is successfully verified in the Preprod URL");
		switchingTab(secondTab);
		ice.clickAccordionTwo();
		System.out.println("Accordion Two is successfully verified in the Live URL");
	}
	
	@Test(priority = 7)
	private void verifyAccordionThree() throws Exception{
		switchingTab(firstTab);
		ice.clickAccordionThree();
		System.out.println("Accordion Three is successfully verified in the Preprod URL");
		switchingTab(secondTab);
		ice.clickAccordionThree();
		System.out.println("Accordion Three is successfully verified in the Live URL");
	}
	
	

}
