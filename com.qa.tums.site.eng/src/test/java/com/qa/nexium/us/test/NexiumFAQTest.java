package com.qa.nexium.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.nexium.us.pages.NexiumFAQPage;

public class NexiumFAQTest extends BaseClass{
	
	NexiumFAQPage faq;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("nexiumUS_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		faq = new NexiumFAQPage();
		switchingTab(firstTab);
		launchURL(loadConfig("nexiumUS_Config.properties").getProperty("faqPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("nexiumUS_Config.properties").getProperty("faqLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		faq.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyAboutNexium24HrAccordionone() throws Exception {
		switchingTab(firstTab);
		faq.clickAboutNexium24HrAccordionOne();
		System.out.println("About nexium 24 Hr Accordion One successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickAboutNexium24HrAccordionOne();
		System.out.println("About nexium 24 Hr Accordion One successfully verified in the Live URL");
	}
	
	@Test(priority = 2)
	private void verifyAboutNexium24HrAccordionTwo() throws Exception {
		switchingTab(firstTab);
		faq.clickAboutNexium24HrAccordionTwo();
		System.out.println("About nexium 24 Hr Accordion Two successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickAboutNexium24HrAccordionTwo();
		System.out.println("About nexium 24 Hr Accordion Two successfully verified in the Live URL");
	}
	
	@Test(priority = 3)
	private void verifyAboutNexium24HrAccordionThree() throws Exception {
		switchingTab(firstTab);
		faq.clickAboutNexium24HrAccordionThree();
		System.out.println("About nexium 24 Hr Accordion Three successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickAboutNexium24HrAccordionThree();
		System.out.println("About nexium 24 Hr Accordion Three successfully verified in the Live URL");
	}
	
	@Test(priority = 4)
	private void verifyAboutNexium24HrAccordionFour() throws Exception {
		switchingTab(firstTab);
		faq.clickAboutNexium24HrAccordionFour();
		System.out.println("About nexium 24 Hr Accordion Four successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickAboutNexium24HrAccordionFour();
		System.out.println("About nexium 24 Hr Accordion Four successfully verified in the Live URL");
	}
	
	@Test(priority = 5)
	private void verifyAboutNexium24HrAccordionFive() throws Exception {
		switchingTab(firstTab);
		faq.clickAboutNexium24HrAccordionFive();
		System.out.println("About nexium 24 Hr Accordion Five successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickAboutNexium24HrAccordionFive();
		System.out.println("About nexium 24 Hr Accordion Five successfully verified in the Live URL");
	}
	
	@Test(priority = 6)
	private void verifyAboutNexium24HrAccordionSix() throws Exception {
		switchingTab(firstTab);
		faq.clickAboutNexium24HrAccordionSix();
		System.out.println("About nexium 24 Hr Accordion Six successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickAboutNexium24HrAccordionSix();
		System.out.println("About nexium 24 Hr Accordion Six successfully verified in the Live URL");
	}
	
	@Test(priority = 7)
	private void verifyAboutNexium24HrAccordionSeven() throws Exception {
		switchingTab(firstTab);
		faq.clickAboutNexium24HrAccordionSeven();
		System.out.println("About nexium 24 Hr Accordion Seven successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickAboutNexium24HrAccordionSeven();
		System.out.println("About nexium 24 Hr Accordion Seven successfully verified in the Live URL");
	}
	
	@Test(priority = 8)
	private void verifyAboutNexium24HrAccordionEight() throws Exception {
		switchingTab(firstTab);
		faq.clickAboutNexium24HrAccordionEight();
		System.out.println("About nexium 24 Hr Accordion Eight successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickAboutNexium24HrAccordionEight();
		System.out.println("About nexium 24 Hr Accordion Eight successfully verified in the Live URL");
	}
	
	@Test(priority = 9)
	private void verifyAboutNexium24HrAccordionNine() throws Exception {
		switchingTab(firstTab);
		faq.clickAboutNexium24HrAccordionNine();
		System.out.println("About nexium 24 Hr Accordion Nine successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickAboutNexium24HrAccordionNine();
		System.out.println("About nexium 24 Hr Accordion Nine successfully verified in the Live URL");
	}
	
	@Test(priority = 10)
	private void verifyAboutNexium24HrAccordionTen() throws Exception {
		switchingTab(firstTab);
		faq.clickAboutNexium24HrAccordionTen();
		System.out.println("About nexium 24 Hr Accordion Ten successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickAboutNexium24HrAccordionTen();
		System.out.println("About nexium 24 Hr Accordion Ten successfully verified in the Live URL");
	}
	
	@Test(priority = 11)
	private void verifyAboutNexium24HrAccordionEleven() throws Exception {
		switchingTab(firstTab);
		faq.clickAboutNexium24HrAccordionEleven();
		System.out.println("About nexium 24 Hr Accordion Eleven successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickAboutNexium24HrAccordionEleven();
		System.out.println("About nexium 24 Hr Accordion Eleven successfully verified in the Live URL");
	}
	
	@Test(priority = 12)
	private void verifyHowDoesNexium24HrAccordionOne() throws Exception {
		switchingTab(firstTab);
		faq.clickHowDoesNexium24HrAccordionOne();
		System.out.println("About nexium 24 Hr Accordion One successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickHowDoesNexium24HrAccordionOne();
		System.out.println("About nexium 24 Hr Accordion One successfully verified in the Live URL");
	}
	
	@Test(priority = 13)
	private void verifyHowDoesNexium24HrAccordionTwo() throws Exception {
		switchingTab(firstTab);
		faq.clickHowDoesNexium24HrAccordionTwo();
		System.out.println("About nexium 24 Hr Accordion Two successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickHowDoesNexium24HrAccordionTwo();
		System.out.println("About nexium 24 Hr Accordion Two successfully verified in the Live URL");
	}
	
	@Test(priority = 14)
	private void verifyHowDoesNexium24HrAccordionThree() throws Exception {
		switchingTab(firstTab);
		faq.clickHowDoesNexium24HrAccordionThree();
		System.out.println("About nexium 24 Hr Accordion Three successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickHowDoesNexium24HrAccordionThree();
		System.out.println("About nexium 24 Hr Accordion Three successfully verified in the Live URL");
	}
	
	@Test(priority = 15)
	private void verifyHowDoesNexium24HrAccordionFour() throws Exception {
		switchingTab(firstTab);
		faq.clickHowDoesNexium24HrAccordionFour();
		System.out.println("About nexium 24 Hr Accordion Four successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickHowDoesNexium24HrAccordionFour();
		System.out.println("About nexium 24 Hr Accordion Four successfully verified in the Live URL");
	}
	
	@Test(priority = 16)
	private void verifyHowDoesNexium24HrAccordionFive() throws Exception {
		switchingTab(firstTab);
		faq.clickHowDoesNexium24HrAccordionFive();
		System.out.println("About nexium 24 Hr Accordion Five successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickHowDoesNexium24HrAccordionFive();
		System.out.println("About nexium 24 Hr Accordion Five successfully verified in the Live URL");
	}
	
	@Test(priority = 17)
	private void verifyHowDoesNexium24HrAccordionSix() throws Exception {
		switchingTab(firstTab);
		faq.clickHowDoesNexium24HrAccordionSix();
		System.out.println("About nexium 24 Hr Accordion Six successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickHowDoesNexium24HrAccordionSix();
		System.out.println("About nexium 24 Hr Accordion Six successfully verified in the Live URL");
	}

}
