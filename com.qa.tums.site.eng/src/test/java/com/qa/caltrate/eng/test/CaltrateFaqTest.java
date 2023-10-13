package com.qa.caltrate.eng.test;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.eng.pages.CaltrateCalciumAtEveryAgePage;
import com.qa.caltrate.eng.pages.CaltrateFaqPage;

public class CaltrateFaqTest extends BaseClass{
	
	CaltrateFaqPage faq;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("caltrateConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("caltrateConfig.properties").getProperty("faqPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("caltrateConfig.properties").getProperty("faqLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		faq = new CaltrateFaqPage();
		switchingTab(firstTab);
		faq.clickCookieBtn();
//		faq.clickGigyaForm();
		System.out.println("Cookie Button clicked successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickCookieBtn();
//		faq.clickGigyaForm();
		System.out.println("Cookie Button clicked successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyDropDown() throws Exception{
		switchingTab(firstTab);
		ArrayList<String> clickDropDown = faq.clickDropDown();
		System.out.println(clickDropDown);
		switchingTab(secondTab);
		ArrayList<String> clickDropDownOne = faq.clickDropDownOne();
		System.out.println(clickDropDownOne);
		boolean compareTwoTextList = compareTwoTextList(clickDropDown, clickDropDownOne);
		System.out.println("PreProdUrl and LiveUrl are Same for drop downs :" + compareTwoTextList);
	}
	
	@Test(priority = 2)
	private void verifyAccordionOne() throws Exception{
		switchingTab(firstTab);
		faq.clickAccordionOne();
		System.out.println("Accordion one is verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickAccordionOne();
		System.out.println("Accordion one is verified in the Live URL");
	}
	
	@Test(priority = 3)
	private void verifyAccordionTwo() throws Exception{
		switchingTab(firstTab);
		faq.clickAccordionTwo();
		System.out.println("Accordion one is verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickAccordionTwo();
		System.out.println("Accordion one is verified in the Live URL");
	}
	
	@Test(priority = 4)
	private void verifyAccordionThree() throws Exception{
		switchingTab(firstTab);
		faq.clickAccordionThree();
		System.out.println("Accordion one is verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickAccordionThree();
		System.out.println("Accordion one is verified in the Live URL");
	}
	
	@Test(priority = 5)
	private void verifyAccordionFour() throws Exception{
		switchingTab(firstTab);
		faq.clickAccordionFour();
		System.out.println("Accordion one is verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickAccordionFour();
		System.out.println("Accordion one is verified in the Live URL");
	}
	
	@Test(priority = 6)
	private void verifyAccordionFive() throws Exception{
		switchingTab(firstTab);
		faq.clickAccordionFive();
		System.out.println("Accordion one is verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickAccordionFive();
		System.out.println("Accordion one is verified in the Live URL");
	}
	
	@Test(priority = 7)
	private void verifyAccordionSix() throws Exception{
		switchingTab(firstTab);
		faq.clickAccordionSix();
		System.out.println("Accordion one is verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickAccordionSix();
		System.out.println("Accordion one is verified in the Live URL");
	}
	
	@Test(priority = 8)
	private void verifyAccordionSeven() throws Exception{
		switchingTab(firstTab);
		faq.clickAccordionSeven();
		System.out.println("Accordion one is verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickAccordionSeven();
		System.out.println("Accordion one is verified in the Live URL");
	}
	
	@Test(priority = 9)
	private void verifyAccordionEight() throws Exception{
		switchingTab(firstTab);
		faq.clickAccordionEight();
		System.out.println("Accordion one is verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickAccordionEight();
		System.out.println("Accordion one is verified in the Live URL");
	}
	
	@Test(priority = 10)
	private void verifyAccordionNine() throws Exception{
		switchingTab(firstTab);
		faq.clickAccordionNine();
		System.out.println("Accordion one is verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickAccordionNine();
		System.out.println("Accordion one is verified in the Live URL");
	}
	
	@Test(priority = 11)
	private void verifyAccordionTen() throws Exception{
		switchingTab(firstTab);
		faq.clickAccordionTen();
		System.out.println("Accordion one is verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickAccordionTen();
		System.out.println("Accordion one is verified in the Live URL");
	}
	
	@Test(priority = 12)
	private void verifyAccordionEleven() throws Exception{
		switchingTab(firstTab);
		faq.clickAccordionEleven();
		System.out.println("Accordion one is verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickAccordionEleven();
		System.out.println("Accordion one is verified in the Live URL");
	}
	
	@Test(priority = 13)
	private void verifyAccordionTweleve() throws Exception{
		switchingTab(firstTab);
		faq.clickAccordionTweleve();
		System.out.println("Accordion one is verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickAccordionTweleve();
		System.out.println("Accordion one is verified in the Live URL");
	}
	
	@Test(priority = 14)
	private void verifyAccordionThirteen() throws Exception{
		switchingTab(firstTab);
		faq.clickAccordionThirteen();
		System.out.println("Accordion one is verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickAccordionThirteen();
		System.out.println("Accordion one is verified in the Live URL");
	}
	
	@Test(priority = 15)
	private void verifyAccordionFourteen() throws Exception{
		switchingTab(firstTab);
		faq.clickAccordionFourteen();
		System.out.println("Accordion one is verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickAccordionFourteen();
		System.out.println("Accordion one is verified in the Live URL");
	}
	
	@Test(priority = 16)
	private void verifyAccordionFifteen() throws Exception{
		switchingTab(firstTab);
		faq.clickAccordionFifteen();
		System.out.println("Accordion one is verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickAccordionFifteen();
		System.out.println("Accordion one is verified in the Live URL");
	}
	
	@Test(priority = 17)
	private void verifyAccordionSixteen() throws Exception{
		switchingTab(firstTab);
		faq.clickAccordionSixteen();
		System.out.println("Accordion one is verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickAccordionSixteen();
		System.out.println("Accordion one is verified in the Live URL");
	}
	
	@Test(priority = 18)
	private void verifyAccordionSeventeen() throws Exception{
		switchingTab(firstTab);
		faq.clickAccordionSeventeen();
		System.out.println("Accordion one is verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickAccordionSeventeen();
		System.out.println("Accordion one is verified in the Live URL");
	}
	
	@Test(priority = 19)
	private void verifyAccordionEighteen() throws Exception{
		switchingTab(firstTab);
		faq.clickAccordionEigthteen();
		System.out.println("Accordion one is verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickAccordionEigthteen();
		System.out.println("Accordion one is verified in the Live URL");
	}
	
	@Test(priority = 20)
	private void verifyAccordionNineteen() throws Exception{
		switchingTab(firstTab);
		faq.clickAccordionNineteen();
		System.out.println("Accordion one is verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickAccordionNineteen();
		System.out.println("Accordion one is verified in the Live URL");
	}
	
	@Test(priority = 21)
	private void verifyAccordionTwenty() throws Exception{
		switchingTab(firstTab);
		faq.clickAccordionTwenty();
		System.out.println("Accordion one is verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickAccordionTwenty();
		System.out.println("Accordion one is verified in the Live URL");
	}
	
	
	@Test(priority = 22)
	private void verifyAccordionTwentyOne() throws Exception{
		switchingTab(firstTab);
		faq.clickAccordionTwentyOne();
		System.out.println("Accordion one is verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickAccordionTwentyOne();
		System.out.println("Accordion one is verified in the Live URL");
	}
	
	
	
	
	

}
