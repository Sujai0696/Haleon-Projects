package com.qa.tums.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.TumsSymptomsPage;

public class TumsSymptomsTest extends BaseClass{
	
	TumsSymptomsPage sp ;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
		
	}
	
	@BeforeMethod
	private void LaunchingTheUrl() throws IOException, Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("tumsConfig.properties").getProperty("symptomsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("tumsConfig.properties").getProperty("symptomsLiveUrl"));
	}
	
	@Test(priority = 0, enabled = true)
	private void verifyCookie() throws Exception {
		sp = new TumsSymptomsPage();
		switchingTab(firstTab);
		sp.clickCookieBtn();
		System.out.println("Cookie Button is verified in the Preprod URL");
		switchingTab(secondTab);
		sp.clickCookieBtn();
		System.out.println("Cookie Button is verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyAntacidsSuchAsTums() throws Exception{
		switchingTab(firstTab);
		sp.clickAntacidsSuchAsTums();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		sp.clickAntacidsSuchAsTums();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Antacids Such As Tums:"+compareTwoText);
		
	}

	@Test(priority = 2)
	private void verifyAccordionOne() throws Exception{
		switchingTab(firstTab);
		sp.clickAccordionOne();
		System.out.println("Accordion One verified in the preprod url");
		switchingTab(secondTab);
		sp.clickAccordionOne();
		System.out.println("Accordion One verified in the live url");
	}
	
	@Test(priority = 3)
	private void verifyAccordionTwo() throws Exception{
		switchingTab(firstTab);
		sp.clickAccordionTwo();
		System.out.println("Accordion Two verified in the preprod url");
		switchingTab(secondTab);
		sp.clickAccordionTwo();
		System.out.println("Accordion Two verified in the live url");
	}
	
	@Test(priority = 4)
	private void verifyAccordionTwoHyperLink() throws Exception{
		switchingTab(firstTab);
		sp.clickAccordionTwoHyperLink();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		sp.clickAccordionTwoHyperLink();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Accordion Two HyperLink :"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyAccordionThree() throws Exception{
		switchingTab(firstTab);
		sp.clickAccordionThree();
		System.out.println("Accordion Three verified in the preprod url");
		switchingTab(secondTab);
		sp.clickAccordionThree();
		System.out.println("Accordion Three verified in the live url");
	}
	
	@Test(priority = 6)
	private void verifyAccordionFour() throws Exception{
		switchingTab(firstTab);
		sp.clickAccordionFour();
		System.out.println("Accordion Four verified in the preprod url");
		switchingTab(secondTab);
		sp.clickAccordionFour();
		System.out.println("Accordion Four verified in the live url");
	}
	
	@Test(priority = 7)
	private void verifyAccordionFive() throws Exception{
		switchingTab(firstTab);
		sp.clickAccordionFive();
		System.out.println("Accordion Five verified in the preprod url");
		switchingTab(secondTab);
		sp.clickAccordionFive();
		System.out.println("Accordion Five verified in the live url");
	}
	
	@Test(priority = 8)
	private void verifyAccordionFiveHyperLink() throws Exception{
		switchingTab(firstTab);
		sp.clickAccordionFiveHyperLink();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		sp.clickAccordionFiveHyperLink();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Accordion Five HyperLink :"+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyAccordionSix() throws Exception{
		switchingTab(firstTab);
		sp.clickAccordionSix();
		System.out.println("Accordion Six verified in the preprod url");
		switchingTab(secondTab);
		sp.clickAccordionSix();
		System.out.println("Accordion Six verified in the live url");
	}
	
	@Test(priority = 10)
	private void verifyAccordionSeven() throws Exception{
		switchingTab(firstTab);
		sp.clickAccordionSeven();
		System.out.println("Accordion Seven verified in the preprod url");
		switchingTab(secondTab);
		sp.clickAccordionSeven();
		System.out.println("Accordion Seven verified in the live url");
	}
	
	
	@Test(priority =11)
	private void verifyShowReference() throws Exception{
		switchingTab(firstTab);
		sp.clickShowReference();
		System.out.println("Show Reference verified in the preprod url");
		switchingTab(secondTab);
		sp.clickShowReference();
		System.out.println("Show Reference verified in the live url");
	}
	
	
	@Test(priority = 12)
	private void verifyLearnMoreArticleOne() throws Exception{
		switchingTab(firstTab);
		sp.clickLearnMoreArticleOne();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		sp.clickLearnMoreArticleOne();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for lern more article one :"+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyLearnMoreArticleTwo() throws Exception{
		switchingTab(firstTab);
		sp.clickLearnMoreArticleTwo();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		sp.clickLearnMoreArticleTwo();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for lern more article Two :"+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyLearnMoreArticleThree() throws Exception{
		switchingTab(firstTab);
		sp.clickLearnMoreArticleThree();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		sp.clickLearnMoreArticleThree();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for lern more article Three :"+compareTwoText);
	}

	@Test(priority = 15)
	private void verifyRelatedArticleOne() throws Exception{
		switchingTab(firstTab);
		sp.clickRelatedArticleOne();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		sp.clickRelatedArticleOne();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Related Article One:"+compareTwoText);
	}
	
	@Test(priority = 16)
	private void verifyRelatedArticleTwo() throws Exception{
		switchingTab(firstTab);
		sp.clickRelatedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		sp.clickRelatedArticleTwo();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Related Article Two:"+compareTwoText);
	}
	
	@Test(priority = 17)
	private void verifyRelatedArticleThree() throws Exception{
		switchingTab(firstTab);
		sp.clickRelatedArticleThree();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		sp.clickRelatedArticleThree();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Related Article Three:"+compareTwoText);
	}
	
	@Test(priority = 18)
	private void verifyRelatedArticleFour() throws Exception{
		switchingTab(firstTab);
		sp.clickRelatedArticleFour();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		sp.clickRelatedArticleFour();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Related Article Four:"+compareTwoText);
	}
	
	@Test(priority = 19)
	private void verifySeeProducts() throws Exception{
		switchingTab(firstTab);
		sp.clickSeeProducts();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		sp.clickSeeProducts();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for see products:"+compareTwoText);
	}
	
	@Test(priority = 20)
	private void verifyBreadCrumbHome() throws Exception{
		switchingTab(firstTab);
		sp.clickBreadCrumbHome();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		sp.clickBreadCrumbHome();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Bread Crumb Home:"+compareTwoText);
	}

	@Test(priority = 21)
	private void verifyBreadCrumbOne() throws Exception{
		switchingTab(firstTab);
		sp.clickBreadCrumbOne();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		sp.clickBreadCrumbOne();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Bread Crumb one:"+compareTwoText);
	}
	
}
