package com.qa.tums.eng.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.xml.xpath.XPath;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.stdDSA;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class TumsfaqsPage extends BaseClass{

	

	public TumsfaqsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "//a[text()='TUMS Home']")
	private static WebElement breadCrumbHome;

	@FindBy(xpath = "//div[@class='selected-item-js']")
	private static WebElement dropDownClick;

	@FindBy(xpath = "//li[@class='filter-item-js default-state-js active-js']")
	private static WebElement topic;

	@FindBy(xpath = "//ul[@class='filter-list-js']//ancestor::li")
	private static List<WebElement> values;

	@FindBy(xpath = "//ul[@class='filter-list-js']//ancestor::li[contains(@class,'active-js')]")
	private static WebElement active;

	@FindBy(xpath = "//span[text()='What are TUMS used for and how do they work?']//ancestor::li[@class='accordion-slide is-active first odd']")
	private static WebElement antacidBasicsAccordionActiveOne;
	
	@FindBy(xpath = "//span[text()='What are TUMS used for and how do they work?']//ancestor::header[@class='accordion-head']")
	private static WebElement antacidBasicsAccordionOne;
	
	@FindBy(xpath = "//span[text()='What are TUMS used for and how do they work?']//ancestor::li[@class='accordion-slide first odd']")
	private static WebElement antacidBasicsAccordionClosedOne;

	@FindBy(xpath = "//span[text()='How long does it take for TUMS to work?']//ancestor::header[@class='accordion-head']")
	private static WebElement antacidBasicsAccordionTwo;
	
	@FindBy(xpath = "//span[text()='How long does it take for TUMS to work?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement antacidBasicsAccordionActiveTwo;
	
	@FindBy(xpath = "//span[text()='How long does it take for TUMS to work?']//ancestor::a[@aria-expanded='false']")
	private static WebElement antacidBasicsAccordionClosedTwo;

	@FindBy(xpath = "//span[text()='How many TUMS can I take?']//ancestor::header[@class='accordion-head']")
	private static WebElement antacidBasicsAccordionThree;
	
	@FindBy(xpath = "//span[text()='How many TUMS can I take?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement antacidBasicsAccordionActiveThree;
	
	@FindBy(xpath = "//span[text()='How many TUMS can I take?']//ancestor::a[@aria-expanded='false']")
	private static WebElement antacidBasicsAccordionClosedThree;
	
	@FindBy(xpath = "//span[text()='What are TUMS made of? What is the active ingredient?']//ancestor::header[@class='accordion-head']")
	private static WebElement antacidBasicsAccordionFour;
	
	@FindBy(xpath = "//span[text()='What are TUMS made of? What is the active ingredient?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement antacidBasicsAccordionActiveFour;
	
	@FindBy(xpath = "//span[text()='What are TUMS made of? What is the active ingredient?']//ancestor::a[@aria-expanded='false']")
	private static WebElement antacidBasicsAccordionClosedFour;
	
	@FindBy(xpath = "//span[text()='How much calcium is in TUMS? Can I take it as a calcium supplement?']//ancestor::header[@class='accordion-head']")
	private static WebElement antacidBasicsAccordionFive;
	
	@FindBy(xpath = "//span[text()='How much calcium is in TUMS? Can I take it as a calcium supplement?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement antacidBasicsAccordionActiveFive;
	
	@FindBy(xpath = "//span[text()='How much calcium is in TUMS? Can I take it as a calcium supplement?']//ancestor::a[@aria-expanded='false']")
	private static WebElement antacidBasicsAccordionClosedFive;
	
	@FindBy(xpath = "//span[text()='Can kids take TUMS?']//ancestor::header[@class='accordion-head']")
	private static WebElement antacidBasicsAccordionSix;
	
	@FindBy(xpath = "//span[text()='Can kids take TUMS?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement antacidBasicsAccordionActiveSix;
	
	@FindBy(xpath = "//span[text()='Can kids take TUMS?']//ancestor::a[@aria-expanded='false']")
	private static WebElement antacidBasicsAccordionClosedSix;
	
	@FindBy(xpath = "//span[text()='How do I take TUMS?']//ancestor::header[@class='accordion-head']")
	private static WebElement antacidBasicsAccordionSeven;
	
	@FindBy(xpath = "//span[text()='How do I take TUMS?']//ancestor::li[@class='accordion-slide last odd is-active']")
	private static WebElement antacidBasicsAccordionActiveSeven;
	
	@FindBy(xpath = "//span[text()='How do I take TUMS?']//ancestor::a[@aria-expanded='false']")
	private static WebElement antacidBasicsAccordionClosedSeven;
	
	@FindBy(xpath = "//span[text()='Do TUMS help with gas?']//ancestor::header[@class='accordion-head']")
	private static WebElement healthSymptomsAccordionOne;
	
	@FindBy(xpath = "//span[text()='Do TUMS help with gas?']//ancestor::li[@class='accordion-slide is-active first odd']")
	private static WebElement healthSymptomsAccordionActiveOne;
	
	@FindBy(xpath = "//span[text()='Do TUMS help with gas?']//ancestor::a[@aria-expanded='true']")
	private static WebElement healthSymptomsAccordionClosedOne;
	
	@FindBy(xpath = "//span[text()='Do TUMS help with nausea and upset stomach?']//ancestor::header[@class='accordion-head']")
	private static WebElement healthSymptomsAccordionTwo;
	
	@FindBy(xpath = "//span[text()='Do TUMS help with nausea and upset stomach?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement healthSymptomsAccordionActiveTwo;
	
	@FindBy(xpath = "//span[text()='Do TUMS help with nausea and upset stomach?']//ancestor::a[@aria-expanded='false']")
	private static WebElement healthSymptomsAccordionClosedTwo;
	
	@FindBy(xpath = "//span[text()='Do TUMS help acid reflux and GERD?']//ancestor::header[@class='accordion-head']")
	private static WebElement healthSymptomsAccordionThree;
	
	@FindBy(xpath = "//span[text()='Do TUMS help acid reflux and GERD?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement healthSymptomsAccordionActiveThree;
	
	@FindBy(xpath = "//span[text()='Do TUMS help acid reflux and GERD?']//ancestor::a[@aria-expanded='false']")
	private static WebElement healthSymptomsAccordionClosedThree;
	
	@FindBy(xpath = "//span[text()='Do TUMS help with diarrhea?']//ancestor::header[@class='accordion-head']")
	private static WebElement healthSymptomsAccordionFour;
	
	@FindBy(xpath = "//span[text()='Do TUMS help with diarrhea?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement healthSymptomsAccordionActiveFour;
	
	@FindBy(xpath = "//span[text()='Do TUMS help with diarrhea?']//ancestor::a[@aria-expanded='false']")
	private static WebElement healthSymptomsAccordionClosedFour;
	
	@FindBy(xpath = "//span[text()='Do TUMS help with heartburn?']//ancestor::header[@class='accordion-head']")
	private static WebElement healthSymptomsAccordionFive;
	
	@FindBy(xpath = "//span[text()='Do TUMS help with heartburn?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement healthSymptomsAccordionActiveFive;
	
	@FindBy(xpath = "//span[text()='Do TUMS help with heartburn?']//ancestor::a[@aria-expanded='false']")
	private static WebElement healthSymptomsAccordionClosedFive;
	
	@FindBy(xpath = "//span[text()='Do TUMS help with bloating?']//ancestor::header[@class='accordion-head']")
	private static WebElement healthSymptomsAccordionSix;
	
	@FindBy(xpath = "//span[text()='Do TUMS help with bloating?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement healthSymptomsAccordionActiveSix;
	
	@FindBy(xpath = "//span[text()='Do TUMS help with bloating?']//ancestor::a[@aria-expanded='false']")
	private static WebElement healthSymptomsAccordionClosedSix;
	
	@FindBy(xpath = "//span[text()='Do TUMS help with constipation?']//ancestor::header[@class='accordion-head']")
	private static WebElement healthSymptomsAccordionSeven;
	
	@FindBy(xpath = "//span[text()='Do TUMS help with constipation?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement healthSymptomsAccordionActiveSeven;
	
	@FindBy(xpath = "//span[text()='Do TUMS help with constipation?']//ancestor::a[@aria-expanded='false']")
	private static WebElement healthSymptomsAccordionClosedSeven;
	
	@FindBy(xpath = "//span[text()='Do TUMS help with indigestion?']//ancestor::header[@class='accordion-head']")
	private static WebElement healthSymptomsAccordionEight;
	
	@FindBy(xpath = "//span[text()='Do TUMS help with indigestion?']//ancestor::li[@class='accordion-slide last even is-active']")
	private static WebElement healthSymptomsAccordionActiveEight;
	
	@FindBy(xpath = "//span[text()='Do TUMS help with indigestion?']//ancestor::a[@aria-expanded='false']")
	private static WebElement healthSymptomsAccordionClosedEight;
	
	@FindBy(xpath = "//span[text()='Can you take TUMS while pregnant?']//ancestor::header[@class='accordion-head']")
	private static WebElement tumsPregnancyAccordionOne;
	
	@FindBy(xpath = "//span[text()='Can you take TUMS while pregnant?']//ancestor::li[@class='accordion-slide is-active first odd']")
	private static WebElement tumsPregnancyAccordionActiveOne;
	
	@FindBy(xpath = "//span[text()='Can you take TUMS while pregnant?']//ancestor::a[@aria-expanded='true']")
	private static WebElement tumsPregnancyAccordionClosedOne;
	
	@FindBy(xpath = "//span[text()='What is the maximum dosage of TUMS for pregnant women?']//ancestor::header[@class='accordion-head']")
	private static WebElement tumsPregnancyAccordionTwo;
	
	@FindBy(xpath = "//span[text()='What is the maximum dosage of TUMS for pregnant women?']//ancestor::li[@class='accordion-slide last even is-active']")
	private static WebElement tumsPregnancyAccordionActiveTwo;
	
	@FindBy(xpath = "//span[text()='What is the maximum dosage of TUMS for pregnant women?']//ancestor::a[@aria-expanded='false']")
	private static WebElement tumsPregnancyAccordionClosedTwo;
	
	@FindBy(xpath = "//span[text()='Are TUMS gluten free?']//ancestor::header[@class='accordion-head']")
	private static WebElement tumsIngredientsAccordionOne;
	
	@FindBy(xpath = "//span[text()='Are TUMS gluten free?']//ancestor::li[@class='accordion-slide is-active first odd']")
	private static WebElement tumsIngredientsAccordionActiveOne;
	
	@FindBy(xpath = "//span[text()='Are TUMS gluten free?']//ancestor::a[@aria-expanded='true']")
	private static WebElement tumsIngredientsAccordionClosedOne;
	
	@FindBy(xpath = "//span[text()='Do TUMS have sugar?']//ancestor::header[@class='accordion-head']")
	private static WebElement tumsIngredientsAccordionTwo;
	
	@FindBy(xpath = "//span[text()='Do TUMS have sugar?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement tumsIngredientsAccordionActiveTwo;
	
	@FindBy(xpath = "//span[text()='Do TUMS have sugar?']//ancestor::a[@aria-expanded='false']")
	private static WebElement tumsIngredientsAccordionClosedTwo;
	
	@FindBy(xpath = "//span[text()='How many carbohydrates are in TUMS antacids?']//ancestor::header[@class='accordion-head']")
	private static WebElement tumsIngredientsAccordionThree;
	
	@FindBy(xpath = "//span[text()='How many carbohydrates are in TUMS antacids?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement tumsIngredientsAccordionActiveThree;
	
	@FindBy(xpath = "//span[text()='How many carbohydrates are in TUMS antacids?']//ancestor::a[@aria-expanded='false']")
	private static WebElement tumsIngredientsAccordionClosedThree;
	
	@FindBy(xpath = "//span[text()='Are TUMS products Kosher?']//ancestor::header[@class='accordion-head']")
	private static WebElement tumsIngredientsAccordionFour;
	
	@FindBy(xpath = "//span[text()='Are TUMS products Kosher?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement tumsIngredientsAccordionActiveFour;
	
	@FindBy(xpath = "//span[text()='Are TUMS products Kosher?']//ancestor::a[@aria-expanded='false']")
	private static WebElement tumsIngredientsAccordionClosedFour;
	
	@FindBy(xpath = "//span[text()='Can TUMS antacids be taken by people who cannot tolerate dairy products?']//ancestor::header[@class='accordion-head']")
	private static WebElement tumsIngredientsAccordionFive;
	
	@FindBy(xpath = "//span[text()='Can TUMS antacids be taken by people who cannot tolerate dairy products?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement tumsIngredientsAccordionActiveFive;
	
	@FindBy(xpath = "//span[text()='Can TUMS antacids be taken by people who cannot tolerate dairy products?']//ancestor::a[@aria-expanded='false']")
	private static WebElement tumsIngredientsAccordionClosedFive;
	
	@FindBy(xpath = "//span[text()='Do TUMS antacids contain animal by-products?']//ancestor::header[@class='accordion-head']")
	private static WebElement tumsIngredientsAccordionSix;
	
	@FindBy(xpath = "//span[text()='Do TUMS antacids contain animal by-products?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement tumsIngredientsAccordionActiveSix;
	
	@FindBy(xpath = "//span[text()='Do TUMS antacids contain animal by-products?']//ancestor::a[@aria-expanded='false']")
	private static WebElement tumsIngredientsAccordionClosedSix;
	
	@FindBy(xpath = "//span[text()='Do TUMS antacids contain aluminum?']//ancestor::header[@class='accordion-head']")
	private static WebElement tumsIngredientsAccordionSeven;
	
	@FindBy(xpath = "//span[text()='Do TUMS antacids contain aluminum?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement tumsIngredientsAccordionActiveSeven;
	
	@FindBy(xpath = "//span[text()='Do TUMS antacids contain aluminum?']//ancestor::a[@aria-expanded='false']")
	private static WebElement tumsIngredientsAccordionClosedSeven;
	
	@FindBy(xpath = "//span[text()='What is the active ingredient in TUMS antacids and where does it come from?']//ancestor::header[@class='accordion-head']")
	private static WebElement tumsIngredientsAccordionEight;
	
	@FindBy(xpath = "//span[text()='What is the active ingredient in TUMS antacids and where does it come from?']//ancestor::li[@class='accordion-slide last even is-active']")
	private static WebElement tumsIngredientsAccordionActiveEight;
	
	@FindBy(xpath = "//span[text()='What is the active ingredient in TUMS antacids and where does it come from?']//ancestor::a[@aria-expanded='false']")
	private static WebElement tumsIngredientsAccordionClosedEight;
	
	@FindBy(xpath = "//span[text()='Can I take TUMS with alcohol?']//ancestor::header[@class='accordion-head']")
	private static WebElement miscellaneousAccordionOne;
	
	@FindBy(xpath = "//span[text()='Can I take TUMS with alcohol?']//ancestor::li[@class='accordion-slide is-active first odd']")
	private static WebElement miscellaneousAccordionActiveOne;
	
	@FindBy(xpath = "//span[text()='Can I take TUMS with alcohol?']//ancestor::a[@aria-expanded='true']")
	private static WebElement miscellaneousAccordionClosedOne;
	
	@FindBy(xpath = "//span[text()='Are TUMS bottles recyclable?']//ancestor::header[@class='accordion-head']")
	private static WebElement miscellaneousAccordionTwo;
	
	@FindBy(xpath = "//span[text()='Are TUMS bottles recyclable?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement miscellaneousAccordionActiveTwo;
	
	@FindBy(xpath = "//span[text()='Are TUMS bottles recyclable?']//ancestor::a[@aria-expanded='false']")
	private static WebElement miscellaneousAccordionClosedTwo;
	
	@FindBy(xpath = "//span[text()='Can I take TUMS with other drugs or medications?']//ancestor::header[@class='accordion-head']")
	private static WebElement miscellaneousAccordionThree;
	
	@FindBy(xpath = "//span[text()='Can I take TUMS with other drugs or medications?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement miscellaneousAccordionActiveThree;
	
	@FindBy(xpath = "//span[text()='Can I take TUMS with other drugs or medications?']//ancestor::a[@aria-expanded='false']")
	private static WebElement miscellaneousAccordionClosedThree;
	
	@FindBy(xpath = "//span[text()='Do TUMS expire?']//ancestor::header[@class='accordion-head']")
	private static WebElement miscellaneousAccordionFour;
	
	@FindBy(xpath = "//span[text()='Do TUMS expire?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement miscellaneousAccordionActiveFour;
	
	@FindBy(xpath = "//span[text()='Do TUMS expire?']//ancestor::a[@aria-expanded='false']")
	private static WebElement miscellaneousAccordionClosedFour;
	
	@FindBy(xpath = "//span[text()='Can I give my dog TUMS?']//ancestor::header[@class='accordion-head']")
	private static WebElement miscellaneousAccordionFive;
	
	@FindBy(xpath = "//span[text()='Can I give my dog TUMS?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement miscellaneousAccordionActiveFive;
	
	@FindBy(xpath = "//span[text()='Can I give my dog TUMS?']//ancestor::a[@aria-expanded='false']")
	private static WebElement miscellaneousAccordionClosedFive;
	
	@FindBy(xpath = "//span[text()='Can I use an HSA or FSA to buy TUMS products?']//ancestor::header[@class='accordion-head']")
	private static WebElement miscellaneousAccordionSix;
	
	@FindBy(xpath = "//span[text()='Can I use an HSA or FSA to buy TUMS products?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement miscellaneousAccordionActiveSix;
	
	@FindBy(xpath = "//span[text()='Can I use an HSA or FSA to buy TUMS products?']//ancestor::a[@aria-expanded='false']")
	private static WebElement miscellaneousAccordionClosedSix;
	
	@FindBy(xpath = "//span[text()='What are the side effects of TUMS?']//ancestor::header[@class='accordion-head']")
	private static WebElement miscellaneousAccordionSeven;
	
	@FindBy(xpath = "//span[text()='What are the side effects of TUMS?']//ancestor::li[@class='accordion-slide last odd is-active']")
	private static WebElement miscellaneousAccordionActiveSeven;
	
	@FindBy(xpath = "//span[text()='What are the side effects of TUMS?']//ancestor::a[@aria-expanded='false']")
	private static WebElement miscellaneousAccordionClosedSeven;
	
	@FindBy(xpath = "//a[@id='wheretobuy']")
	private static WebElement whereToBuy;
	
	@FindBy(xpath = "//a[@id='getcoupons']")
	private static WebElement getCoupon;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	public void clickCookieBtn() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(cookieBtn)) {
			elementToBeClickable(cookieBtn);
			try {
				if (cookieBtn.isDisplayed()) {
					clickElementUsingJavaScript(cookieBtn);
				}
				implicitWait();
				Assert.assertTrue(elementIsDisplayed(cookieClose));
			} catch (Exception e) {
			}
		}else {
			System.out.println("Dismiss is not presented");
			Assert.assertTrue(false);
		}
	}

	public void clickBreadCrumbHome() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(breadCrumbHome);
		clickElementUsingJavaScript(breadCrumbHome);
	}

	public ArrayList<String> clickDropDown() throws Exception{
		waitForPageLoadJava();
		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0; i < values.size(); i++) {
			
			scrollDownUsingElement(dropDownClick);
			clickElementUsingJavaScript(dropDownClick);
			Thread.sleep(3000);
			if (getElementWithIndex(By.xpath("//ul[@class='filter-list-js']//ancestor::li"), i).isDisplayed()) {
				WebElement ewi = getElementWithIndex(By.xpath("//ul[@class='filter-list-js']//ancestor::li"), i);
				clickElementUsingJavaScript(ewi);
				String text = ewi.getText();
				System.out.println(ewi.getText());
				al.add(text);
			}
//			Collections.sort(al);
		} return al;
	}
	
	
	public ArrayList<String> clickDropDownOne() throws Exception{
		waitForPageLoadJava();
		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0; i < values.size(); i++) {
			scrollDownUsingElement(dropDownClick);
			clickElementUsingJavaScript(dropDownClick);
			Thread.sleep(3000);
			if (getElementWithIndex(By.xpath("//ul[@class='filter-list-js']//ancestor::li"), i).isDisplayed()) {
				WebElement ewi = getElementWithIndex(By.xpath("//ul[@class='filter-list-js']//ancestor::li"), i);
				clickElementUsingJavaScript(ewi);
				String text = ewi.getText();
				System.out.println(ewi.getText());
				al.add(text);
			}
//			Collections.sort(al);
		} return al;
	}
	
	public void clickAntacidBasicsAccordionOne() throws Exception{
		waitForPageLoadJava(); 
		if (isElementPresent(antacidBasicsAccordionActiveOne)) {
			scrollDownUsingElement(antacidBasicsAccordionActiveOne);
			clickElementUsingJavaScript(antacidBasicsAccordionOne);
			visibilityOf(antacidBasicsAccordionClosedOne);
			Assert.assertTrue(elementIsDisplayed(antacidBasicsAccordionClosedOne));
			System.out.println(getElementText(antacidBasicsAccordionOne));
			System.out.println("Accordion verified successfully");
		} else {
			System.out.println("Accordion is not verified");
			Assert.assertTrue(false);
		}
	}
	
	public void clickAntacidBasicsAccordionTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(antacidBasicsAccordionTwo)) {
			scrollDownUsingElement(antacidBasicsAccordionTwo);
			clickElementUsingJavaScript(antacidBasicsAccordionTwo);
			visibilityOf(antacidBasicsAccordionActiveTwo);
			Assert.assertTrue(elementIsDisplayed(antacidBasicsAccordionActiveTwo));
			clickElementUsingJavaScript(antacidBasicsAccordionTwo);
			visibilityOf(antacidBasicsAccordionClosedTwo);
			Assert.assertTrue(elementIsDisplayed(antacidBasicsAccordionClosedTwo));
			System.out.println(getElementText(antacidBasicsAccordionTwo));
			System.out.println("Accordion Verified successfully");
		} else {
			System.out.println("Accordion is not verified");
			Assert.assertTrue(false);
		}
	}
	
	public void clickAntacidBasicsAccordionThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(antacidBasicsAccordionThree)) {
			scrollDownUsingElement(antacidBasicsAccordionThree);
			clickElementUsingJavaScript(antacidBasicsAccordionThree);
			visibilityOf(antacidBasicsAccordionActiveThree);
			Assert.assertTrue(elementIsDisplayed(antacidBasicsAccordionActiveThree));
			clickElementUsingJavaScript(antacidBasicsAccordionThree);
			visibilityOf(antacidBasicsAccordionClosedThree);
			Assert.assertTrue(elementIsDisplayed(antacidBasicsAccordionClosedThree));
			System.out.println(getElementText(antacidBasicsAccordionThree));
			System.out.println("Accordion Verified successfully");
		} else {
			System.out.println("Accordion is not verified");
			Assert.assertTrue(false);
		}
	}
	
	public void clickAntacidBasicsAccordionFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(antacidBasicsAccordionFour)) {
			scrollDownUsingElement(antacidBasicsAccordionFour);
			clickElementUsingJavaScript(antacidBasicsAccordionFour);
			visibilityOf(antacidBasicsAccordionActiveFour);
			Assert.assertTrue(elementIsDisplayed(antacidBasicsAccordionActiveFour));
			clickElementUsingJavaScript(antacidBasicsAccordionFour);
			visibilityOf(antacidBasicsAccordionClosedFour);
			Assert.assertTrue(elementIsDisplayed(antacidBasicsAccordionClosedFour));
			System.out.println(getElementText(antacidBasicsAccordionFour));
			System.out.println("Accordion Verified successfully");
		} else {
			System.out.println("Accordion is not verified");
			Assert.assertTrue(false);
		}
	}
	
	public void clickAntacidBasicsAccordionFive() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(antacidBasicsAccordionFive)) {
			scrollDownUsingElement(antacidBasicsAccordionFive);
			clickElementUsingJavaScript(antacidBasicsAccordionFive);
			visibilityOf(antacidBasicsAccordionActiveFive);
			Assert.assertTrue(elementIsDisplayed(antacidBasicsAccordionActiveFive));
			clickElementUsingJavaScript(antacidBasicsAccordionFive);
			visibilityOf(antacidBasicsAccordionClosedFive);
			Assert.assertTrue(elementIsDisplayed(antacidBasicsAccordionClosedFive));
			System.out.println(getElementText(antacidBasicsAccordionFive));
			System.out.println("Accordion Verified successfully");
		} else {
			System.out.println("Accordion is not verified");
			Assert.assertTrue(false);
		}
	}
	
	public void clickAntacidBasicsAccordionSix() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(antacidBasicsAccordionSix)) {
			scrollDownUsingElement(antacidBasicsAccordionSix);
			clickElementUsingJavaScript(antacidBasicsAccordionSix);
			visibilityOf(antacidBasicsAccordionActiveSix);
			Assert.assertTrue(elementIsDisplayed(antacidBasicsAccordionActiveSix));
			clickElementUsingJavaScript(antacidBasicsAccordionSix);
			visibilityOf(antacidBasicsAccordionClosedSix);
			Assert.assertTrue(elementIsDisplayed(antacidBasicsAccordionClosedSix));
			System.out.println(getElementText(antacidBasicsAccordionSix));
			System.out.println("Accordion Verified successfully");
		} else {
			System.out.println("Accordion is not verified");
			Assert.assertTrue(false);
		}
	}
	
	public void clickAntacidBasicsAccordionSeven() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(antacidBasicsAccordionSeven)) {
			scrollDownUsingElement(antacidBasicsAccordionSeven);
			clickElementUsingJavaScript(antacidBasicsAccordionSeven);
			visibilityOf(antacidBasicsAccordionActiveSeven);
			Assert.assertTrue(elementIsDisplayed(antacidBasicsAccordionActiveSeven));
			clickElementUsingJavaScript(antacidBasicsAccordionSeven);
			visibilityOf(antacidBasicsAccordionClosedSeven);
			Assert.assertTrue(elementIsDisplayed(antacidBasicsAccordionClosedSeven));
			System.out.println(getElementText(antacidBasicsAccordionSeven));
			System.out.println("Accordion Verified successfully");
		} else {
			System.out.println("Accordion is not verified");
			Assert.assertTrue(false);
		}
	}
	
	public void clickHealthSymptomsAccordionOne() throws Exception{
		waitForPageLoadJava(); 
		if (isElementPresent(healthSymptomsAccordionActiveOne)) {
			scrollDownUsingElement(healthSymptomsAccordionActiveOne);
			clickElementUsingJavaScript(healthSymptomsAccordionOne);
			visibilityOf(healthSymptomsAccordionClosedOne);
			Assert.assertTrue(elementIsDisplayed(healthSymptomsAccordionClosedOne));
			System.out.println(getElementText(healthSymptomsAccordionOne));
			System.out.println("Accordion verified successfully");
		} else {
			System.out.println("Accordion is not verified");
			Assert.assertTrue(false);
		}
	}
	
	public void clickHealthSymptomsAccordionTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(healthSymptomsAccordionTwo)) {
			scrollDownUsingElement(healthSymptomsAccordionTwo);
			clickElementUsingJavaScript(healthSymptomsAccordionTwo);
			visibilityOf(healthSymptomsAccordionActiveTwo);
			Assert.assertTrue(elementIsDisplayed(healthSymptomsAccordionActiveTwo));
			clickElementUsingJavaScript(healthSymptomsAccordionTwo);
			visibilityOf(healthSymptomsAccordionClosedTwo);
			Assert.assertTrue(elementIsDisplayed(healthSymptomsAccordionClosedTwo));
			System.out.println(getElementText(healthSymptomsAccordionTwo));
			System.out.println("Accordion Verified successfully");
		} else {
			System.out.println("Accordion is not verified");
			Assert.assertTrue(false);
		}
	}
	
	public void clickHealthSymptomsAccordionThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(healthSymptomsAccordionThree)) {
			scrollDownUsingElement(healthSymptomsAccordionThree);
			clickElementUsingJavaScript(healthSymptomsAccordionThree);
			visibilityOf(healthSymptomsAccordionActiveThree);
			Assert.assertTrue(elementIsDisplayed(healthSymptomsAccordionActiveThree));
			clickElementUsingJavaScript(healthSymptomsAccordionThree);
			visibilityOf(healthSymptomsAccordionClosedThree);
			Assert.assertTrue(elementIsDisplayed(healthSymptomsAccordionClosedThree));
			System.out.println(getElementText(healthSymptomsAccordionThree));
			System.out.println("Accordion Verified successfully");
		} else {
			System.out.println("Accordion is not verified");
			Assert.assertTrue(false);
		}
	}
	
	public void clickHealthSymptomsAccordionFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(healthSymptomsAccordionFour)) {
			scrollDownUsingElement(healthSymptomsAccordionFour);
			clickElementUsingJavaScript(healthSymptomsAccordionFour);
			visibilityOf(healthSymptomsAccordionActiveFour);
			Assert.assertTrue(elementIsDisplayed(healthSymptomsAccordionActiveFour));
			clickElementUsingJavaScript(healthSymptomsAccordionFour);
			visibilityOf(healthSymptomsAccordionClosedFour);
			Assert.assertTrue(elementIsDisplayed(healthSymptomsAccordionClosedFour));
			System.out.println(getElementText(healthSymptomsAccordionFour));
			System.out.println("Accordion Verified successfully");
		} else {
			System.out.println("Accordion is not verified");
			Assert.assertTrue(false);
		}
	}
	
	public void clickHealthSymptomsAccordionFive() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(healthSymptomsAccordionFive)) {
			scrollDownUsingElement(healthSymptomsAccordionFive);
			clickElementUsingJavaScript(healthSymptomsAccordionFive);
			visibilityOf(healthSymptomsAccordionActiveFive);
			Assert.assertTrue(elementIsDisplayed(healthSymptomsAccordionActiveFive));
			clickElementUsingJavaScript(healthSymptomsAccordionFive);
			visibilityOf(healthSymptomsAccordionClosedFive);
			Assert.assertTrue(elementIsDisplayed(healthSymptomsAccordionClosedFive));
			System.out.println(getElementText(healthSymptomsAccordionFive));
			System.out.println("Accordion Verified successfully");
		} else {
			System.out.println("Accordion is not verified");
			Assert.assertTrue(false);
		}
	}
	
	public void clickHealthSymptomsAccordionSix() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(healthSymptomsAccordionSix)) {
			scrollDownUsingElement(healthSymptomsAccordionSix);
			clickElementUsingJavaScript(healthSymptomsAccordionSix);
			visibilityOf(healthSymptomsAccordionActiveSix);
			Assert.assertTrue(elementIsDisplayed(healthSymptomsAccordionActiveSix));
			clickElementUsingJavaScript(healthSymptomsAccordionSix);
			visibilityOf(healthSymptomsAccordionClosedSix);
			Assert.assertTrue(elementIsDisplayed(healthSymptomsAccordionClosedSix));
			System.out.println(getElementText(healthSymptomsAccordionSix));
			System.out.println("Accordion Verified successfully");
		} else {
			System.out.println("Accordion is not verified");
			Assert.assertTrue(false);
		}
	}
	
	public void clickHealthSymptomsAccordionSeven() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(healthSymptomsAccordionSeven)) {
			scrollDownUsingElement(healthSymptomsAccordionSeven);
			clickElementUsingJavaScript(healthSymptomsAccordionSeven);
			visibilityOf(healthSymptomsAccordionActiveSeven);
			Assert.assertTrue(elementIsDisplayed(healthSymptomsAccordionActiveSeven));
			clickElementUsingJavaScript(healthSymptomsAccordionSeven);
			visibilityOf(healthSymptomsAccordionClosedSeven);
			Assert.assertTrue(elementIsDisplayed(healthSymptomsAccordionClosedSeven));
			System.out.println(getElementText(healthSymptomsAccordionSeven));
			System.out.println("Accordion Verified successfully");
		} else {
			System.out.println("Accordion is not verified");
			Assert.assertTrue(false);
		}
	}
	
	
	public void clickHealthSymptomsAccordionEight() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(healthSymptomsAccordionEight)) {
			scrollDownUsingElement(healthSymptomsAccordionEight);
			clickElementUsingJavaScript(healthSymptomsAccordionEight);
			visibilityOf(healthSymptomsAccordionActiveEight);
			Assert.assertTrue(elementIsDisplayed(healthSymptomsAccordionActiveEight));
			clickElementUsingJavaScript(healthSymptomsAccordionEight);
			visibilityOf(healthSymptomsAccordionClosedEight);
			Assert.assertTrue(elementIsDisplayed(healthSymptomsAccordionClosedEight));
			System.out.println(getElementText(healthSymptomsAccordionEight));
			System.out.println("Accordion Verified successfully");
		} else {
			System.out.println("Accordion is not verified");
			Assert.assertTrue(false);
		}
	}
	
	public void clickTumsPregnancyAccordionOne() throws Exception{
		waitForPageLoadJava(); 
		if (isElementPresent(tumsPregnancyAccordionActiveOne)) {
			scrollDownUsingElement(tumsPregnancyAccordionActiveOne);
			clickElementUsingJavaScript(tumsPregnancyAccordionOne);
			visibilityOf(tumsPregnancyAccordionClosedOne);
			Assert.assertTrue(elementIsDisplayed(tumsPregnancyAccordionClosedOne));
			System.out.println(getElementText(tumsPregnancyAccordionOne));
			System.out.println("Accordion verified successfully");
		} else {
			System.out.println("Accordion is not verified");
			Assert.assertTrue(false);
		}
	}
	
	public void clickTumsPregnancyAccordionTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(tumsPregnancyAccordionTwo)) {
			scrollDownUsingElement(tumsPregnancyAccordionTwo);
			clickElementUsingJavaScript(tumsPregnancyAccordionTwo);
			visibilityOf(tumsPregnancyAccordionActiveTwo);
			Assert.assertTrue(elementIsDisplayed(tumsPregnancyAccordionActiveTwo));
			clickElementUsingJavaScript(tumsPregnancyAccordionTwo);
			visibilityOf(tumsPregnancyAccordionClosedTwo);
			Assert.assertTrue(elementIsDisplayed(tumsPregnancyAccordionClosedTwo));
			System.out.println(getElementText(tumsPregnancyAccordionTwo));
			System.out.println("Accordion Verified successfully");
		} else {
			System.out.println("Accordion is not verified");
			Assert.assertTrue(false);
		}
	}

	public void clickTumsIngredientsAccordionOne() throws Exception{
		waitForPageLoadJava(); 
		if (isElementPresent(tumsIngredientsAccordionActiveOne)) {
			scrollDownUsingElement(tumsIngredientsAccordionActiveOne);
			clickElementUsingJavaScript(tumsIngredientsAccordionOne);
			visibilityOf(tumsIngredientsAccordionClosedOne);
			Assert.assertTrue(elementIsDisplayed(tumsIngredientsAccordionClosedOne));
			System.out.println(getElementText(tumsIngredientsAccordionOne));
			System.out.println("Accordion verified successfully");
		} else {
			System.out.println("Accordion is not verified");
			Assert.assertTrue(false);
		}
	}
	
	public void clickTumsIngredientsAccordionTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(tumsIngredientsAccordionTwo)) {
			scrollDownUsingElement(tumsIngredientsAccordionTwo);
			clickElementUsingJavaScript(tumsIngredientsAccordionTwo);
			visibilityOf(tumsIngredientsAccordionActiveTwo);
			Assert.assertTrue(elementIsDisplayed(tumsIngredientsAccordionActiveTwo));
			clickElementUsingJavaScript(tumsIngredientsAccordionTwo);
			visibilityOf(tumsIngredientsAccordionClosedTwo);
			Assert.assertTrue(elementIsDisplayed(tumsIngredientsAccordionClosedTwo));
			System.out.println(getElementText(tumsIngredientsAccordionTwo));
			System.out.println("Accordion Verified successfully");
		} else {
			System.out.println("Accordion is not verified");
			Assert.assertTrue(false);
		}
	}
	
	public void clickTumsIngredientsAccordionThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(tumsIngredientsAccordionThree)) {
			scrollDownUsingElement(tumsIngredientsAccordionThree);
			clickElementUsingJavaScript(tumsIngredientsAccordionThree);
			visibilityOf(tumsIngredientsAccordionActiveThree);
			Assert.assertTrue(elementIsDisplayed(tumsIngredientsAccordionActiveThree));
			clickElementUsingJavaScript(tumsIngredientsAccordionThree);
			visibilityOf(tumsIngredientsAccordionClosedThree);
			Assert.assertTrue(elementIsDisplayed(tumsIngredientsAccordionClosedThree));
			System.out.println(getElementText(tumsIngredientsAccordionThree));
			System.out.println("Accordion Verified successfully");
		} else {
			System.out.println("Accordion is not verified");
			Assert.assertTrue(false);
		}
	}
	
	public void clickTumsIngredientsAccordionFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(tumsIngredientsAccordionFour)) {
			scrollDownUsingElement(tumsIngredientsAccordionFour);
			clickElementUsingJavaScript(tumsIngredientsAccordionFour);
			visibilityOf(tumsIngredientsAccordionActiveFour);
			Assert.assertTrue(elementIsDisplayed(tumsIngredientsAccordionActiveFour));
			clickElementUsingJavaScript(tumsIngredientsAccordionFour);
			visibilityOf(tumsIngredientsAccordionClosedFour);
			Assert.assertTrue(elementIsDisplayed(tumsIngredientsAccordionClosedFour));
			System.out.println(getElementText(tumsIngredientsAccordionFour));
			System.out.println("Accordion Verified successfully");
		} else {
			System.out.println("Accordion is not verified");
			Assert.assertTrue(false);
		}
	}
	
	public void clickTumsIngredientsAccordionFive() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(tumsIngredientsAccordionFive)) {
			scrollDownUsingElement(tumsIngredientsAccordionFive);
			clickElementUsingJavaScript(tumsIngredientsAccordionFive);
			visibilityOf(tumsIngredientsAccordionActiveFive);
			Assert.assertTrue(elementIsDisplayed(tumsIngredientsAccordionActiveFive));
			clickElementUsingJavaScript(tumsIngredientsAccordionFive);
			visibilityOf(tumsIngredientsAccordionClosedFive);
			Assert.assertTrue(elementIsDisplayed(tumsIngredientsAccordionClosedFive));
			System.out.println(getElementText(tumsIngredientsAccordionFive));
			System.out.println("Accordion Verified successfully");
		} else {
			System.out.println("Accordion is not verified");
			Assert.assertTrue(false);
		}
	}
	
	public void clickTumsIngredientsAccordionSix() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(tumsIngredientsAccordionSix)) {
			scrollDownUsingElement(tumsIngredientsAccordionSix);
			clickElementUsingJavaScript(tumsIngredientsAccordionSix);
			visibilityOf(tumsIngredientsAccordionActiveSix);
			Assert.assertTrue(elementIsDisplayed(tumsIngredientsAccordionActiveSix));
			clickElementUsingJavaScript(tumsIngredientsAccordionSix);
			visibilityOf(tumsIngredientsAccordionClosedSix);
			Assert.assertTrue(elementIsDisplayed(tumsIngredientsAccordionClosedSix));
			System.out.println(getElementText(tumsIngredientsAccordionSix));
			System.out.println("Accordion Verified successfully");
		} else {
			System.out.println("Accordion is not verified");
			Assert.assertTrue(false);
		}
	}
	
	public void clickTumsIngredientsAccordionSeven() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(tumsIngredientsAccordionSeven)) {
			scrollDownUsingElement(tumsIngredientsAccordionSeven);
			clickElementUsingJavaScript(tumsIngredientsAccordionSeven);
			visibilityOf(tumsIngredientsAccordionActiveSeven);
			Assert.assertTrue(elementIsDisplayed(tumsIngredientsAccordionActiveSeven));
			clickElementUsingJavaScript(tumsIngredientsAccordionSeven);
			visibilityOf(tumsIngredientsAccordionClosedSeven);
			Assert.assertTrue(elementIsDisplayed(tumsIngredientsAccordionClosedSeven));
			System.out.println(getElementText(tumsIngredientsAccordionSeven));
			System.out.println("Accordion Verified successfully");
		} else {
			System.out.println("Accordion is not verified");
			Assert.assertTrue(false);
		}
	}
	
	public void clickTumsIngredientsAccordionEight() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(tumsIngredientsAccordionEight)) {
			scrollDownUsingElement(tumsIngredientsAccordionEight);
			clickElementUsingJavaScript(tumsIngredientsAccordionEight);
			visibilityOf(tumsIngredientsAccordionActiveEight);
			Assert.assertTrue(elementIsDisplayed(tumsIngredientsAccordionActiveEight));
			clickElementUsingJavaScript(tumsIngredientsAccordionEight);
			visibilityOf(tumsIngredientsAccordionClosedEight);
			Assert.assertTrue(elementIsDisplayed(tumsIngredientsAccordionClosedEight));
			System.out.println(getElementText(tumsIngredientsAccordionEight));
			System.out.println("Accordion Verified successfully");
		} else {
			System.out.println("Accordion is not verified");
			Assert.assertTrue(false);
		}
	}
	
	
	public void clickMiscellaneousAccordionOne() throws Exception{
		waitForPageLoadJava(); 
		if (isElementPresent(miscellaneousAccordionActiveOne)) {
			scrollDownUsingElement(miscellaneousAccordionActiveOne);
			clickElementUsingJavaScript(miscellaneousAccordionOne);
			visibilityOf(miscellaneousAccordionClosedOne);
			Assert.assertTrue(elementIsDisplayed(miscellaneousAccordionClosedOne));
			System.out.println(getElementText(miscellaneousAccordionOne));
			System.out.println("Accordion verified successfully");
		} else {
			System.out.println("Accordion is not verified");
			Assert.assertTrue(false);
		}
	}
	
	public void clickMiscellaneousAccordionTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(miscellaneousAccordionTwo)) {
			scrollDownUsingElement(miscellaneousAccordionTwo);
			clickElementUsingJavaScript(miscellaneousAccordionTwo);
			visibilityOf(miscellaneousAccordionActiveTwo);
			Assert.assertTrue(elementIsDisplayed(miscellaneousAccordionActiveTwo));
			clickElementUsingJavaScript(miscellaneousAccordionTwo);
			visibilityOf(miscellaneousAccordionClosedTwo);
			Assert.assertTrue(elementIsDisplayed(miscellaneousAccordionClosedTwo));
			System.out.println(getElementText(miscellaneousAccordionTwo));
			System.out.println("Accordion Verified successfully");
		} else {
			System.out.println("Accordion is not verified");
			Assert.assertTrue(false);
		}
	}
	
	public void clickMiscellaneousAccordionThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(miscellaneousAccordionThree)) {
			scrollDownUsingElement(miscellaneousAccordionThree);
			clickElementUsingJavaScript(miscellaneousAccordionThree);
			visibilityOf(miscellaneousAccordionActiveThree);
			Assert.assertTrue(elementIsDisplayed(miscellaneousAccordionActiveThree));
			clickElementUsingJavaScript(miscellaneousAccordionThree);
			visibilityOf(miscellaneousAccordionClosedThree);
			Assert.assertTrue(elementIsDisplayed(miscellaneousAccordionClosedThree));
			System.out.println(getElementText(miscellaneousAccordionThree));
			System.out.println("Accordion Verified successfully");
		} else {
			System.out.println("Accordion is not verified");
			Assert.assertTrue(false);
		}
	}
	
	public void clickMiscellaneousAccordionFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(miscellaneousAccordionFour)) {
			scrollDownUsingElement(miscellaneousAccordionFour);
			clickElementUsingJavaScript(miscellaneousAccordionFour);
			visibilityOf(miscellaneousAccordionActiveFour);
			Assert.assertTrue(elementIsDisplayed(miscellaneousAccordionActiveFour));
			clickElementUsingJavaScript(miscellaneousAccordionFour);
			visibilityOf(miscellaneousAccordionClosedFour);
			Assert.assertTrue(elementIsDisplayed(miscellaneousAccordionClosedFour));
			System.out.println(getElementText(miscellaneousAccordionFour));
			System.out.println("Accordion Verified successfully");
		} else {
			System.out.println("Accordion is not verified");
			Assert.assertTrue(false);
		}
	}
	
	public void clickMiscellaneousAccordionFive() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(miscellaneousAccordionFive)) {
			scrollDownUsingElement(miscellaneousAccordionFive);
			clickElementUsingJavaScript(miscellaneousAccordionFive);
			visibilityOf(miscellaneousAccordionActiveFive);
			Assert.assertTrue(elementIsDisplayed(miscellaneousAccordionActiveFive));
			clickElementUsingJavaScript(miscellaneousAccordionFive);
			visibilityOf(miscellaneousAccordionClosedFive);
			Assert.assertTrue(elementIsDisplayed(miscellaneousAccordionClosedFive));
			System.out.println(getElementText(miscellaneousAccordionFive));
			System.out.println("Accordion Verified successfully");
		} else {
			System.out.println("Accordion is not verified");
			Assert.assertTrue(false);
		}
	}
	
	public void clickMiscellaneousAccordionSix() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(miscellaneousAccordionSix)) {
			scrollDownUsingElement(miscellaneousAccordionSix);
			clickElementUsingJavaScript(miscellaneousAccordionSix);
			visibilityOf(miscellaneousAccordionActiveSix);
			Assert.assertTrue(elementIsDisplayed(miscellaneousAccordionActiveSix));
			clickElementUsingJavaScript(miscellaneousAccordionSix);
			visibilityOf(miscellaneousAccordionClosedSix);
			Assert.assertTrue(elementIsDisplayed(miscellaneousAccordionClosedSix));
			System.out.println(getElementText(miscellaneousAccordionSix));
			System.out.println("Accordion Verified successfully");
		} else {
			System.out.println("Accordion is not verified");
			Assert.assertTrue(false);
		}
	}
	
	public void clickMiscellaneousAccordionSeven() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(miscellaneousAccordionSeven)) {
			scrollDownUsingElement(miscellaneousAccordionSeven);
			clickElementUsingJavaScript(miscellaneousAccordionSeven);
			visibilityOf(miscellaneousAccordionActiveSeven);
			Assert.assertTrue(elementIsDisplayed(miscellaneousAccordionActiveSeven));
			clickElementUsingJavaScript(miscellaneousAccordionSeven);
			visibilityOf(miscellaneousAccordionClosedSeven);
			Assert.assertTrue(elementIsDisplayed(miscellaneousAccordionClosedSeven));
			System.out.println(getElementText(miscellaneousAccordionSeven));
			System.out.println("Accordion Verified successfully");
		} else {
			System.out.println("Accordion is not verified");
			Assert.assertTrue(false);
		}
	}
	
	public void clickWhereToBuy() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(whereToBuy);
		clickElementUsingJavaScript(whereToBuy);
	}
	
	public void clickGetCoupon() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(getCoupon);
		clickElementUsingJavaScript(getCoupon);
	}
	
	
	
	
	
	

}
