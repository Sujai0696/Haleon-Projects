package com.qa.tums.eng.test;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.TumsfaqsPage;

public class TumsfaqsTest extends BaseClass{
	
	TumsfaqsPage faq;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
		
	}
	
	@BeforeMethod
	private void LaunchingTheUrl() throws IOException, Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("tumsConfig.properties").getProperty("faqsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("tumsConfig.properties").getProperty("faqsLiveUrl"));
	}
	
	@Test(priority = 0, enabled = true)
	private void verifyCookie() throws Exception {
		faq = new TumsfaqsPage();
		switchingTab(firstTab);
		faq.clickCookieBtn();
		System.out.println("Cookie Button is verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickCookieBtn();
		System.out.println("Cookie Button is verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadCrumbHome() throws Exception{
		switchingTab(firstTab);
		faq.clickBreadCrumbHome();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		faq.clickBreadCrumbHome();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Bread Crumb Home:"+compareTwoText);
	}
	
	@Test(priority = 2)
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
	
	@Test(priority = 3)
	private void verifyAntacidBasicsAccordionOne() throws Exception{
		switchingTab(firstTab);
		faq.clickAntacidBasicsAccordionOne();
		System.out.println("Accordion One is verified in the preprod URL");
		switchingTab(secondTab);
		faq.clickAntacidBasicsAccordionOne();
		System.out.println("Accordion One is verified in the Live URL");
	}
	
	@Test(priority = 4)
	private void verifyAntacidBasicsAccordionTwo() throws Exception{
		switchingTab(firstTab);
		faq.clickAntacidBasicsAccordionTwo();
		System.out.println("Accordion Two is verified in the preprod URL");
		switchingTab(secondTab);
		faq.clickAntacidBasicsAccordionTwo();
		System.out.println("Accordion Two is verified in the Live URL");
	}
	
	@Test(priority = 5)
	private void verifyAntacidBasicsAccordionThree() throws Exception{
		switchingTab(firstTab);
		faq.clickAntacidBasicsAccordionThree();
		System.out.println("Accordion Three is verified in the preprod URL");
		switchingTab(secondTab);
		faq.clickAntacidBasicsAccordionThree();
		System.out.println("Accordion Three is verified in the Live URL");
	}
	
	@Test(priority = 6)
	private void verifyAntacidBasicsAccordionFour() throws Exception{
		switchingTab(firstTab);
		faq.clickAntacidBasicsAccordionFour();
		System.out.println("Accordion Four is verified in the preprod URL");
		switchingTab(secondTab);
		faq.clickAntacidBasicsAccordionFour();
		System.out.println("Accordion Four is verified in the Live URL");
	}
	
	@Test(priority = 7)
	private void verifyAntacidBasicsAccordionFive() throws Exception{
		switchingTab(firstTab);
		faq.clickAntacidBasicsAccordionFive();
		System.out.println("Accordion Five is verified in the preprod URL");
		switchingTab(secondTab);
		faq.clickAntacidBasicsAccordionFive();
		System.out.println("Accordion Five is verified in the Live URL");
	}
	
	@Test(priority = 8)
	private void verifyAntacidBasicsAccordionSix() throws Exception{
		switchingTab(firstTab);
		faq.clickAntacidBasicsAccordionSix();
		System.out.println("Accordion Six is verified in the preprod URL");
		switchingTab(secondTab);
		faq.clickAntacidBasicsAccordionSix();
		System.out.println("Accordion Six is verified in the Live URL");
	}
	
	@Test(priority = 9)
	private void verifyAntacidBasicsAccordioneven() throws Exception{
		switchingTab(firstTab);
		faq.clickAntacidBasicsAccordionSeven();
		System.out.println("Accordion Seven is verified in the preprod URL");
		switchingTab(secondTab);
		faq.clickAntacidBasicsAccordionSeven();
		System.out.println("Accordion Seven is verified in the Live URL");
	}
	
	@Test(priority = 10)
	private void verifyHealthSymptomsAccordionOne() throws Exception{
		switchingTab(firstTab);
		faq.clickHealthSymptomsAccordionOne();
		System.out.println("Accordion One is verified in the preprod URL");
		switchingTab(secondTab);
		faq.clickHealthSymptomsAccordionOne();
		System.out.println("Accordion One is verified in the Live URL");
	}
	
	@Test(priority = 11)
	private void verifyHealthSymptomsAccordionTwo() throws Exception{
		switchingTab(firstTab);
		faq.clickHealthSymptomsAccordionTwo();
		System.out.println("Accordion Two is verified in the preprod URL");
		switchingTab(secondTab);
		faq.clickHealthSymptomsAccordionTwo();
		System.out.println("Accordion Two is verified in the Live URL");
	}
	
	@Test(priority = 12)
	private void verifyHealthSymptomsAccordionThree() throws Exception{
		switchingTab(firstTab);
		faq.clickHealthSymptomsAccordionThree();
		System.out.println("Accordion Three is verified in the preprod URL");
		switchingTab(secondTab);
		faq.clickHealthSymptomsAccordionThree();
		System.out.println("Accordion Three is verified in the Live URL");
	}
	
	@Test(priority = 13)
	private void verifyHealthSymptomsAccordionFour() throws Exception{
		switchingTab(firstTab);
		faq.clickHealthSymptomsAccordionFour();
		System.out.println("Accordion Four is verified in the preprod URL");
		switchingTab(secondTab);
		faq.clickHealthSymptomsAccordionFour();
		System.out.println("Accordion Four is verified in the Live URL");
	}
	
	@Test(priority = 14)
	private void verifyHealthSymptomsAccordionFive() throws Exception{
		switchingTab(firstTab);
		faq.clickHealthSymptomsAccordionFive();
		System.out.println("Accordion Five is verified in the preprod URL");
		switchingTab(secondTab);
		faq.clickHealthSymptomsAccordionFive();
		System.out.println("Accordion Five is verified in the Live URL");
	}
	
	@Test(priority = 15)
	private void verifyHealthSymptomsAccordionSix() throws Exception{
		switchingTab(firstTab);
		faq.clickHealthSymptomsAccordionSix();
		System.out.println("Accordion Six is verified in the preprod URL");
		switchingTab(secondTab);
		faq.clickHealthSymptomsAccordionSix();
		System.out.println("Accordion Six is verified in the Live URL");
	}
	
	@Test(priority = 16)
	private void verifyHealthSymptomsAccordionSeven() throws Exception{
		switchingTab(firstTab);
		faq.clickHealthSymptomsAccordionSeven();
		System.out.println("Accordion Seven is verified in the preprod URL");
		switchingTab(secondTab);
		faq.clickHealthSymptomsAccordionSeven();
		System.out.println("Accordion Seven is verified in the Live URL");
	}
	
	@Test(priority = 17)
	private void verifyHealthSymptomsAccordionEight() throws Exception{
		switchingTab(firstTab);
		faq.clickHealthSymptomsAccordionEight();
		System.out.println("Accordion Eight is verified in the preprod URL");
		switchingTab(secondTab);
		faq.clickHealthSymptomsAccordionEight();
		System.out.println("Accordion Eight is verified in the Live URL");
	}
	
	@Test(priority = 18)
	private void verifyTumsPregnancyAccordionOne() throws Exception{
		switchingTab(firstTab);
		faq.clickTumsPregnancyAccordionOne();
		System.out.println("Accordion One is verified in the preprod URL");
		switchingTab(secondTab);
		faq.clickTumsPregnancyAccordionOne();
		System.out.println("Accordion One is verified in the Live URL");
	}
	
	@Test(priority = 19)
	private void verifyTumsPregnancyAccordionTwo() throws Exception{
		switchingTab(firstTab);
		faq.clickTumsPregnancyAccordionTwo();
		System.out.println("Accordion Two is verified in the preprod URL");
		switchingTab(secondTab);
		faq.clickTumsPregnancyAccordionTwo();
		System.out.println("Accordion Two is verified in the Live URL");
	}
	
	@Test(priority = 20)
	private void verifyTumsIngredientsAccordionOne() throws Exception{
		switchingTab(firstTab);
		faq.clickTumsIngredientsAccordionOne();
		System.out.println("Accordion One is verified in the preprod URL");
		switchingTab(secondTab);
		faq.clickTumsIngredientsAccordionOne();
		System.out.println("Accordion One is verified in the Live URL");
	}
	
	@Test(priority = 21)
	private void verifyTumsIngredientsAccordionTwo() throws Exception{
		switchingTab(firstTab);
		faq.clickTumsIngredientsAccordionTwo();
		System.out.println("Accordion Two is verified in the preprod URL");
		switchingTab(secondTab);
		faq.clickTumsIngredientsAccordionTwo();
		System.out.println("Accordion Two is verified in the Live URL");
	}
	
	@Test(priority = 22)
	private void verifyTumsIngredientsAccordionThree() throws Exception{
		switchingTab(firstTab);
		faq.clickTumsIngredientsAccordionThree();
		System.out.println("Accordion Three is verified in the preprod URL");
		switchingTab(secondTab);
		faq.clickTumsIngredientsAccordionThree();
		System.out.println("Accordion Three is verified in the Live URL");
	}
	
	@Test(priority = 23)
	private void verifyTumsIngredientsAccordionFour() throws Exception{
		switchingTab(firstTab);
		faq.clickTumsIngredientsAccordionFour();
		System.out.println("Accordion Four is verified in the preprod URL");
		switchingTab(secondTab);
		faq.clickTumsIngredientsAccordionFour();
		System.out.println("Accordion Four is verified in the Live URL");
	}
	
	@Test(priority = 24)
	private void verifyTumsIngredientsAccordionFive() throws Exception{
		switchingTab(firstTab);
		faq.clickTumsIngredientsAccordionFive();
		System.out.println("Accordion Five is verified in the preprod URL");
		switchingTab(secondTab);
		faq.clickTumsIngredientsAccordionFive();
		System.out.println("Accordion Five is verified in the Live URL");
	}
	
	@Test(priority = 25)
	private void verifyTumsIngredientsAccordionSix() throws Exception{
		switchingTab(firstTab);
		faq.clickTumsIngredientsAccordionSix();
		System.out.println("Accordion Six is verified in the preprod URL");
		switchingTab(secondTab);
		faq.clickTumsIngredientsAccordionSix();
		System.out.println("Accordion Six is verified in the Live URL");
	}
	
	@Test(priority = 26)
	private void verifyTumsIngredientsAccordionSeven() throws Exception{
		switchingTab(firstTab);
		faq.clickTumsIngredientsAccordionSeven();
		System.out.println("Accordion Seven is verified in the preprod URL");
		switchingTab(secondTab);
		faq.clickTumsIngredientsAccordionSeven();
		System.out.println("Accordion Seven is verified in the Live URL");
	}
	
	@Test(priority = 27)
	private void verifyTumsIngredientsAccordionEight() throws Exception{
		switchingTab(firstTab);
		faq.clickTumsIngredientsAccordionEight();
		System.out.println("Accordion Eight is verified in the preprod URL");
		switchingTab(secondTab);
		faq.clickTumsIngredientsAccordionEight();
		System.out.println("Accordion Eight is verified in the Live URL");
	}
	
	@Test(priority = 28)
	private void verifyMiscellaneousAccordionOne() throws Exception{
		switchingTab(firstTab);
		faq.clickMiscellaneousAccordionOne();
		System.out.println("Accordion One is verified in the preprod URL");
		switchingTab(secondTab);
		faq.clickMiscellaneousAccordionOne();
		System.out.println("Accordion One is verified in the Live URL");
	}
	
	@Test(priority = 29)
	private void verifyMiscellaneousAccordionTwo() throws Exception{
		switchingTab(firstTab);
		faq.clickMiscellaneousAccordionTwo();
		System.out.println("Accordion Two is verified in the preprod URL");
		switchingTab(secondTab);
		faq.clickMiscellaneousAccordionTwo();
		System.out.println("Accordion Two is verified in the Live URL");
	}
	
	@Test(priority = 30)
	private void verifyMiscellaneousAccordionThree() throws Exception{
		switchingTab(firstTab);
		faq.clickMiscellaneousAccordionThree();
		System.out.println("Accordion Three is verified in the preprod URL");
		switchingTab(secondTab);
		faq.clickMiscellaneousAccordionThree();
		System.out.println("Accordion Three is verified in the Live URL");
	}
	
	@Test(priority = 31)
	private void verifyMiscellaneousAccordionFour() throws Exception{
		switchingTab(firstTab);
		faq.clickMiscellaneousAccordionFour();
		System.out.println("Accordion Four is verified in the preprod URL");
		switchingTab(secondTab);
		faq.clickMiscellaneousAccordionFour();
		System.out.println("Accordion Four is verified in the Live URL");
	}
	
	@Test(priority = 32)
	private void verifyMiscellaneousAccordionFive() throws Exception{
		switchingTab(firstTab);
		faq.clickMiscellaneousAccordionFive();
		System.out.println("Accordion Five is verified in the preprod URL");
		switchingTab(secondTab);
		faq.clickMiscellaneousAccordionFive();
		System.out.println("Accordion Five is verified in the Live URL");
	}
	
	@Test(priority = 33)
	private void verifyMiscellaneousAccordionSix() throws Exception{
		switchingTab(firstTab);
		faq.clickMiscellaneousAccordionSix();
		System.out.println("Accordion Six is verified in the preprod URL");
		switchingTab(secondTab);
		faq.clickMiscellaneousAccordionSix();
		System.out.println("Accordion Six is verified in the Live URL");
	}
	
	@Test(priority = 34)
	private void verifyMiscellaneousAccordionSeven() throws Exception{
		switchingTab(firstTab);
		faq.clickMiscellaneousAccordionSeven();
		System.out.println("Accordion Seven is verified in the preprod URL");
		switchingTab(secondTab);
		faq.clickMiscellaneousAccordionSeven();
		System.out.println("Accordion Seven is verified in the Live URL");
	}
	
	@Test(priority = 35)
	private void verifyWhereToBuy() throws Exception{
		switchingTab(firstTab);
		faq.clickWhereToBuy();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		faq.clickWhereToBuy();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for where to buy:"+compareTwoText);
	}
	
	@Test(priority = 36)
	private void verifyGetCoupon() throws Exception{
		switchingTab(firstTab);
		faq.clickGetCoupon();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		faq.clickGetCoupon();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Get Coupon:"+compareTwoText);
	}
	
	
	
	
	
	
	

}
