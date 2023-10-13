package com.qa.tums.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.TumsWhatIsGerdSymptomsTreatmentDietMedicationPage;

public class TumsWhatIsGerdSymptomsTreatmentDietMedicationTest extends BaseClass{
	
	TumsWhatIsGerdSymptomsTreatmentDietMedicationPage dm;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
		
	}
	
	@BeforeMethod
	private void LaunchingTheUrl() throws IOException, Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("tumsConfig.properties").getProperty("whatIsGerdSymptomsTreatmentDietMedicationPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("tumsConfig.properties").getProperty("whatIsGerdSymptomsTreatmentDietMedicationLiveUrl"));
	}
	
	@Test(priority = 0, enabled = true)
	private void verifyCookie() throws Exception {
		dm = new TumsWhatIsGerdSymptomsTreatmentDietMedicationPage();
		switchingTab(firstTab);
		dm.clickCookieBtn();
		System.out.println("Cookie Button is verified in the Preprod URL");
		switchingTab(secondTab);
		dm.clickCookieBtn();
		System.out.println("Cookie Button is verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadCrumbHome() throws Exception{
		switchingTab(firstTab);
		dm.clickBreadCrumbHome();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		dm.clickBreadCrumbHome();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Bread Crumb Home :"+compareTwoText);
	}

	@Test(priority = 2)
	private void verifyBreadCrumbOne() throws Exception{
		switchingTab(firstTab);
		dm.clickBreadCrumbOne();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		dm.clickBreadCrumbOne();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Bread Crumb one :"+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyHyperLinkOne() throws Exception{
		switchingTab(firstTab);
		dm.clickHyperLinkOne();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		dm.clickHyperLinkOne();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Hyper Link One :"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyAccordionOne() throws Exception{
		switchingTab(firstTab);
		dm.clickAccordionOne();
		System.out.println("Accordion Verified in the preprod url");
		switchingTab(secondTab);
		dm.clickAccordionOne();
		System.out.println("Accordion Verified in the live url");
	}
	
	@Test(priority = 5)
	private void verifyAccordionTwo() throws Exception{
		switchingTab(firstTab);
		dm.clickAccordionTwo();
		System.out.println("Accordion Verified in the preprod url");
		switchingTab(secondTab);
		dm.clickAccordionTwo();
		System.out.println("Accordion Verified in the live url");
	}
	
	@Test(priority = 6)
	private void verifyAccordionThree() throws Exception{
		switchingTab(firstTab);
		dm.clickAccordionThree();
		System.out.println("Accordion Verified in the preprod url");
		switchingTab(secondTab);
		dm.clickAccordionThree();
		System.out.println("Accordion Verified in the live url");
	}
	
	@Test(priority = 7)
	private void verifyAccordionFour() throws Exception{
		switchingTab(firstTab);
		dm.clickAccordionFour();
		System.out.println("Accordion Verified in the preprod url");
		switchingTab(secondTab);
		dm.clickAccordionFour();
		System.out.println("Accordion Verified in the live url");
	}
	
	@Test(priority = 8)
	private void verifyAccordionFive() throws Exception{
		switchingTab(firstTab);
		dm.clickAccordionFive();
		System.out.println("Accordion Verified in the preprod url");
		switchingTab(secondTab);
		dm.clickAccordionFive();
		System.out.println("Accordion Verified in the live url");
	}
	
	@Test(priority = 9)
	private void verifyAccordionSix() throws Exception{
		switchingTab(firstTab);
		dm.clickAccordionSix();
		System.out.println("Accordion Verified in the preprod url");
		switchingTab(secondTab);
		dm.clickAccordionSix();
		System.out.println("Accordion Verified in the live url");
	}
	
	@Test(priority = 10)
	private void verifyAccordionSeven() throws Exception{
		switchingTab(firstTab);
		dm.clickAccordionSeven();
		System.out.println("Accordion Verified in the preprod url");
		switchingTab(secondTab);
		dm.clickAccordionSeven();
		System.out.println("Accordion Verified in the live url");
	}
	
	@Test(priority = 11)
	private void verifyAccordionEight() throws Exception{
		switchingTab(firstTab);
		dm.clickAccordionEight();
		System.out.println("Accordion Verified in the preprod url");
		switchingTab(secondTab);
		dm.clickAccordionEight();
		System.out.println("Accordion Verified in the live url");
	}
	
	@Test(priority = 12)
	private void verifyAccordionEightHyperLink() throws Exception{
		switchingTab(firstTab);
		dm.clickAccordionEightHyperLink();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		dm.clickAccordionEightHyperLink();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Accordion Eight HyperLink :"+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyHyperLinkTwo() throws Exception{
		switchingTab(firstTab);
		dm.clickHyperLinkTwo();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		dm.clickHyperLinkTwo();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Two :"+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifySeeProducts() throws Exception{
		switchingTab(firstTab);
		dm.clickSeeProducts();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		dm.clickSeeProducts();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for see products:"+compareTwoText);
	}
	

}
