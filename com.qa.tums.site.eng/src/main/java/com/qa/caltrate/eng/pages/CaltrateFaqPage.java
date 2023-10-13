package com.qa.caltrate.eng.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CaltrateFaqPage extends BaseClass{
	
	public CaltrateFaqPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage gigya-heading first odd component col-xs-12 active']")
	private static WebElement gigyaForm;

	@FindBy(xpath = "//div[contains(@class,'content_hide')]")
	private static WebElement gigyaClose;
	
	@FindBy(xpath = "//div[@class='selected-item-js']")
	private static WebElement dropDownClick;
	
	@FindBy(xpath = "//div[@class='filter-container-js opened-js']")
	private static WebElement topic;
	
	@FindBy(xpath = "//ul[@class='filter-list-js']//ancestor::li")
	private static List<WebElement> values;
	
	@FindBy(xpath = "//ul[@class='filter-list-js']//ancestor::li[contains(@class,'active-js')]")
	private static WebElement active;

	@FindBy(xpath = "//span[normalize-space()='WHAT IS CALCIUM?']//ancestor::header[@class='accordion-head']")
	private static WebElement accordionOne;

	@FindBy(xpath = "//span[normalize-space()='WHAT IS CALCIUM?']//ancestor::li[@class='accordion-slide first odd is-active']")
	private static WebElement accordionActiveOne;
	
	@FindBy(xpath = "//span[normalize-space()='WHAT IS CALCIUM?']//ancestor::li[@class='accordion-slide first odd']")
	private static WebElement accordionClosedOne;
	
	
	@FindBy(xpath = "//span[normalize-space()='WHAT IS CALCIUM CARBONATE, AND WHAT ARE ITS ADVANTAGES?']//ancestor::header[@class='accordion-head']")
	private static WebElement accordionTwo;
	
	@FindBy(xpath = "//span[normalize-space()='WHAT IS CALCIUM CARBONATE, AND WHAT ARE ITS ADVANTAGES?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement accordionActiveTwo;
	
	@FindBy(xpath = "//span[normalize-space()='WHAT IS CALCIUM CARBONATE, AND WHAT ARE ITS ADVANTAGES?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement accordionClosedTwo;
	
	@FindBy(xpath = "//span[normalize-space()='HOW WELL IS THE CALCIUM IN CALTRATE TABLETS ABSORBED?']//ancestor::header[@class='accordion-head']")
	private static WebElement accordionThree;
	
	@FindBy(xpath = "//span[normalize-space()='HOW WELL IS THE CALCIUM IN CALTRATE TABLETS ABSORBED?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement accordionActiveThree;
	
	@FindBy(xpath = "//span[normalize-space()='HOW WELL IS THE CALCIUM IN CALTRATE TABLETS ABSORBED?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement accordionClosedThree;
	
	
	
	@FindBy(xpath = "//span[normalize-space()='WHY SHOULD CALCIUM BE TAKEN IN CONJUNCTION WITH VITAMIN D?']//ancestor::header[@class='accordion-head']")
	private static WebElement accordionFour;
	
	@FindBy(xpath = "//span[normalize-space()='WHY SHOULD CALCIUM BE TAKEN IN CONJUNCTION WITH VITAMIN D?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement accordionActiveFour;
	
	@FindBy(xpath = "//span[normalize-space()='WHY SHOULD CALCIUM BE TAKEN IN CONJUNCTION WITH VITAMIN D?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement accordionClosedFour;
	
	
	@FindBy(xpath = "//span[normalize-space()='WHY WAS THE LEVEL OF VITAMIN D IN THE CALTRATE TABLET AND SOFT CHEWS CHANGED TO 800 IU?']//ancestor::header[@class='accordion-head']")
	private static WebElement accordionFive;
	
	@FindBy(xpath = "//span[normalize-space()='WHY WAS THE LEVEL OF VITAMIN D IN THE CALTRATE TABLET AND SOFT CHEWS CHANGED TO 800 IU?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement accordionActiveFive;
	
	@FindBy(xpath = "//span[normalize-space()='WHY WAS THE LEVEL OF VITAMIN D IN THE CALTRATE TABLET AND SOFT CHEWS CHANGED TO 800 IU?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement accordionClosedFive;
	
	
	@FindBy(xpath = "//span[normalize-space()='WHAT IS OSTEOPOROSIS?']//ancestor::header[@class='accordion-head']")
	private static WebElement accordionSix;
	
	@FindBy(xpath = "//span[normalize-space()='WHAT IS OSTEOPOROSIS?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement accordionActiveSix;
	
	@FindBy(xpath = "//span[normalize-space()='WHAT IS OSTEOPOROSIS?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement accordionClosedSix;
	
	
	@FindBy(xpath = "//span[normalize-space()='WHY IS CALCIUM IMPORTANT?']//ancestor::header[@class='accordion-head']")
	private static WebElement accordionSeven;
	
	@FindBy(xpath = "//span[normalize-space()='WHY IS CALCIUM IMPORTANT?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement accordionActiveSeven;
	
	@FindBy(xpath = "//span[normalize-space()='WHY IS CALCIUM IMPORTANT?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement accordionClosedSeven;
	
	
	@FindBy(xpath = "//span[normalize-space()='WHAT IS THE RECOMMENDED DAILY CALCIUM INTAKE FOR WOMEN AND MEN?']//ancestor::header[@class='accordion-head']")
	private static WebElement accordionEight;
	
	@FindBy(xpath = "//span[normalize-space()='WHAT IS THE RECOMMENDED DAILY CALCIUM INTAKE FOR WOMEN AND MEN?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement accordionActiveEight;
	
	@FindBy(xpath = "//span[normalize-space()='WHAT IS THE RECOMMENDED DAILY CALCIUM INTAKE FOR WOMEN AND MEN?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement accordionClosedEight;
	
	
	@FindBy(xpath = "//span[normalize-space()='CAN WOMEN WHO TAKE ESTROGEN STILL BENEFIT FROM A CALCIUM SUPPLEMENT?']//ancestor::header[@class='accordion-head']")
	private static WebElement accordionNine;
	
	@FindBy(xpath = "//span[normalize-space()='CAN WOMEN WHO TAKE ESTROGEN STILL BENEFIT FROM A CALCIUM SUPPLEMENT?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement accordionActiveNine;
	
	@FindBy(xpath = "//span[normalize-space()='CAN WOMEN WHO TAKE ESTROGEN STILL BENEFIT FROM A CALCIUM SUPPLEMENT?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement accordionClosedNine;
	
	
	@FindBy(xpath = "//span[normalize-space()='HOW IS CALTRATE DIFFERENT FROM OTHER CALCIUM SUPPLEMENTS?']//ancestor::header[@class='accordion-head']")
	private static WebElement accordionTen;
	
	@FindBy(xpath = "//span[normalize-space()='HOW IS CALTRATE DIFFERENT FROM OTHER CALCIUM SUPPLEMENTS?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement accordionActiveTen;
	
	@FindBy(xpath = "//span[normalize-space()='HOW IS CALTRATE DIFFERENT FROM OTHER CALCIUM SUPPLEMENTS?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement accordionClosedTen;
	
	
	@FindBy(xpath = "//span[normalize-space()='WHAT FORMULAS IS CALTRATE AVAILABLE IN?']//ancestor::header[@class='accordion-head']")
	private static WebElement accordionEleven;
	
	@FindBy(xpath = "//span[normalize-space()='WHAT FORMULAS IS CALTRATE AVAILABLE IN?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement accordionActiveEleven;
	
	@FindBy(xpath = "//span[normalize-space()='WHAT FORMULAS IS CALTRATE AVAILABLE IN?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement accordionClosedEleven;
	
	
	@FindBy(xpath = "//span[normalize-space()='IS CALTRATE SAFE?']//ancestor::header[@class='accordion-head']")
	private static WebElement accordionTweleve;
	
	@FindBy(xpath = "//span[normalize-space()='IS CALTRATE SAFE?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement accordionActiveTweleve;
	
	@FindBy(xpath = "//span[normalize-space()='IS CALTRATE SAFE?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement accordionClosedTweleve;
	
	
	@FindBy(xpath = "//span[normalize-space()='HOW MANY CALTRATE TABLETS OR CHEWABLE TABLETS DO YOU NEED TO TAKE, AND WHEN SHOULD YOU TAKE THEM?']//ancestor::header[@class='accordion-head']")
	private static WebElement accordionThirteen;
	
	@FindBy(xpath = "//span[normalize-space()='HOW MANY CALTRATE TABLETS OR CHEWABLE TABLETS DO YOU NEED TO TAKE, AND WHEN SHOULD YOU TAKE THEM?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement accordionActiveThirteen;
	
	@FindBy(xpath = "//span[normalize-space()='HOW MANY CALTRATE TABLETS OR CHEWABLE TABLETS DO YOU NEED TO TAKE, AND WHEN SHOULD YOU TAKE THEM?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement accordionClosedThirteen;
	
	
	@FindBy(xpath = "//span[normalize-space()='HOW MANY CALTRATE SOFT CHEWS DO YOU NEED TO TAKE, AND WHEN SHOULD YOU TAKE THEM?']//ancestor::header[@class='accordion-head']")
	private static WebElement accordionFourteen;
	
	@FindBy(xpath = "//span[normalize-space()='HOW MANY CALTRATE SOFT CHEWS DO YOU NEED TO TAKE, AND WHEN SHOULD YOU TAKE THEM?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement accordionActiveFourteen;
	
	@FindBy(xpath = "//span[normalize-space()='HOW MANY CALTRATE SOFT CHEWS DO YOU NEED TO TAKE, AND WHEN SHOULD YOU TAKE THEM?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement accordionClosedFourteen;
	
	
	@FindBy(xpath = "//span[normalize-space()='HOW MANY CALTRATE GUMMY BITES DO YOU NEED TO TAKE, AND WHEN SHOULD YOU TAKE THEM?']//ancestor::header[@class='accordion-head']")
	private static WebElement accordionFifteen;
	
	@FindBy(xpath = "//span[normalize-space()='HOW MANY CALTRATE GUMMY BITES DO YOU NEED TO TAKE, AND WHEN SHOULD YOU TAKE THEM?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement accordionActiveFifteen;
	
	@FindBy(xpath = "//span[normalize-space()='HOW MANY CALTRATE GUMMY BITES DO YOU NEED TO TAKE, AND WHEN SHOULD YOU TAKE THEM?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement accordionClosedFifteen;
	
	
	@FindBy(xpath = "//span[normalize-space()='HOW DO YOU BREAK A TABLET IN HALF?']//ancestor::header[@class='accordion-head']")
	private static WebElement accordionSixteen;
	
	@FindBy(xpath = "//span[normalize-space()='HOW DO YOU BREAK A TABLET IN HALF?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement accordionActiveSixteen;
	
	@FindBy(xpath = "//span[normalize-space()='HOW DO YOU BREAK A TABLET IN HALF?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement accordionClosedSixteen;
	
	
	@FindBy(xpath = "//span[normalize-space()='CAN THE PRODUCT BE CRUSHED AND SPRINKLED OVER FOOD?']//ancestor::header[@class='accordion-head']")
	private static WebElement accordionSeventeen;
	
	@FindBy(xpath = "//span[normalize-space()='CAN THE PRODUCT BE CRUSHED AND SPRINKLED OVER FOOD?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement accordionActiveSeventeen;
	
	@FindBy(xpath = "//span[normalize-space()='CAN THE PRODUCT BE CRUSHED AND SPRINKLED OVER FOOD?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement accordionClosedSeventeen;
	
	
	@FindBy(xpath = "//span[normalize-space()='CAN THIS PRODUCT BE TAKEN WITH A MULTIVITAMIN?']//ancestor::header[@class='accordion-head']")
	private static WebElement accordionEighteen;
	
	@FindBy(xpath = "//span[normalize-space()='CAN THIS PRODUCT BE TAKEN WITH A MULTIVITAMIN?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement accordionActiveEighteen;
	
	@FindBy(xpath = "//span[normalize-space()='CAN THIS PRODUCT BE TAKEN WITH A MULTIVITAMIN?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement accordionClosedEighteen;
	
	
	@FindBy(xpath = "//span[normalize-space()='DO CALTRATE PRODUCTS CONTAIN SUGAR?']//ancestor::header[@class='accordion-head']")
	private static WebElement accordionNineteen;
	
	@FindBy(xpath = "//span[normalize-space()='DO CALTRATE PRODUCTS CONTAIN SUGAR?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement accordionActiveNineteen;
	
	@FindBy(xpath = "//span[normalize-space()='DO CALTRATE PRODUCTS CONTAIN SUGAR?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement accordionClosedNineteen;
	
	
	@FindBy(xpath = "//span[normalize-space()='WHY CAN’T YOU FIND THE CALTRATE 600 PRODUCT AT YOUR LOCAL RETAILER?']//ancestor::header[@class='accordion-head']")
	private static WebElement accordionTwenty;
	
	@FindBy(xpath = "//span[normalize-space()='WHY CAN’T YOU FIND THE CALTRATE 600 PRODUCT AT YOUR LOCAL RETAILER?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement accordionActiveTwenty;
	
	@FindBy(xpath = "//span[normalize-space()='WHY CAN’T YOU FIND THE CALTRATE 600 PRODUCT AT YOUR LOCAL RETAILER?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement accordionClosedTwenty;
	
	
	@FindBy(xpath = "//span[normalize-space()='WHY WAS THE SUGGESTED USE CHANGED FROM (1) TABLET TWICE DAILY TO (1) TABLET UP TO TWO TIMES DAILY?']//ancestor::header[@class='accordion-head']")
	private static WebElement accordionTwentyOne;
	
	@FindBy(xpath = "//span[normalize-space()='WHY WAS THE SUGGESTED USE CHANGED FROM (1) TABLET TWICE DAILY TO (1) TABLET UP TO TWO TIMES DAILY?']//ancestor::li[@class='accordion-slide last odd is-active']")
	private static WebElement accordionActiveTwentyOne;
	
	@FindBy(xpath = "//span[normalize-space()='WHY WAS THE SUGGESTED USE CHANGED FROM (1) TABLET TWICE DAILY TO (1) TABLET UP TO TWO TIMES DAILY?']//ancestor::li[@class='accordion-slide last odd']")
	private static WebElement accordionClosedTwentyOne;
	
	

	
	
	
	
	
	
	
	
	
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
		}
	}

	public void clickGigyaForm() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(gigyaForm)) {
			elementToBeClickable(gigyaForm);
			try {
				if (gigyaForm.isDisplayed()) {
					elementClick(gigyaForm);
				}
				implicitWait();
				Assert.assertTrue(elementIsDisplayed(gigyaClose));
			} catch (Exception e) {
			}
		} else {
			System.out.println("gigya is not presented");
		}
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
	
	
	
	public void clickAccordionOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(accordionOne)) {
			scrollDownUsingElement(accordionOne);
			clickElementUsingJavaScript(accordionOne);
			visibilityOf(accordionActiveOne);
			Assert.assertTrue(elementIsDisplayed(accordionActiveOne));
			clickElementUsingJavaScript(accordionOne);
			visibilityOf(accordionClosedOne);
			Assert.assertTrue(elementIsDisplayed(accordionClosedOne));
			System.out.println(getElementText(accordionOne));
			System.out.println("Accordion Verified successfully");
				
		} else {
			throw new Exception("Accordion one is not verified");
		}
	}
	
	public void clickAccordionTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(accordionTwo)) {
			scrollDownUsingElement(accordionTwo);
			clickElementUsingJavaScript(accordionTwo);
			visibilityOf(accordionActiveTwo);
			Assert.assertTrue(elementIsDisplayed(accordionActiveTwo));
			clickElementUsingJavaScript(accordionTwo);
			visibilityOf(accordionClosedTwo);
			Assert.assertTrue(elementIsDisplayed(accordionClosedTwo));
			System.out.println(getElementText(accordionTwo));
			System.out.println("Accordion Verified successfully");
				
		} else {
			throw new Exception("Accordion Two is not verified");
		}
	}
	
	public void clickAccordionThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(accordionThree)) {
			scrollDownUsingElement(accordionThree);
			clickElementUsingJavaScript(accordionThree);
			visibilityOf(accordionActiveThree);
			Assert.assertTrue(elementIsDisplayed(accordionActiveThree));
			clickElementUsingJavaScript(accordionThree);
			visibilityOf(accordionClosedThree);
			Assert.assertTrue(elementIsDisplayed(accordionClosedThree));
			System.out.println(getElementText(accordionThree));
			System.out.println("Accordion Verified successfully");
				
		} else {
			throw new Exception("Accordion Three is not verified");
		}
	}
	
	public void clickAccordionFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(accordionFour)) {
			scrollDownUsingElement(accordionFour);
			clickElementUsingJavaScript(accordionFour);
			visibilityOf(accordionActiveFour);
			Assert.assertTrue(elementIsDisplayed(accordionActiveFour));
			clickElementUsingJavaScript(accordionFour);
			visibilityOf(accordionClosedFour);
			Assert.assertTrue(elementIsDisplayed(accordionClosedFour));
			System.out.println(getElementText(accordionFour));
			System.out.println("Accordion Verified successfully");
				
		} else {
			throw new Exception("Accordion Four is not verified");
		}
	}
	
	public void clickAccordionFive() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(accordionFive)) {
			scrollDownUsingElement(accordionFive);
			clickElementUsingJavaScript(accordionFive);
			visibilityOf(accordionActiveFive);
			Assert.assertTrue(elementIsDisplayed(accordionActiveFive));
			clickElementUsingJavaScript(accordionFive);
			visibilityOf(accordionClosedFive);
			Assert.assertTrue(elementIsDisplayed(accordionClosedFive));
			System.out.println(getElementText(accordionFive));
			System.out.println("Accordion Verified successfully");
				
		} else {
			throw new Exception("Accordion Five is not verified");
		}
	}
	
	
	public void clickAccordionSix() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(accordionSix)) {
			scrollDownUsingElement(accordionSix);
			clickElementUsingJavaScript(accordionSix);
			visibilityOf(accordionActiveSix);
			Assert.assertTrue(elementIsDisplayed(accordionActiveSix));
			clickElementUsingJavaScript(accordionSix);
			visibilityOf(accordionClosedSix);
			Assert.assertTrue(elementIsDisplayed(accordionClosedSix));
			System.out.println(getElementText(accordionSix));
			System.out.println("Accordion Verified successfully");
				
		} else {
			throw new Exception("Accordion Six is not verified");
		}
	}
	
	public void clickAccordionSeven() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(accordionSeven)) {
			scrollDownUsingElement(accordionSeven);
			clickElementUsingJavaScript(accordionSeven);
			visibilityOf(accordionActiveSeven);
			Assert.assertTrue(elementIsDisplayed(accordionActiveSeven));
			clickElementUsingJavaScript(accordionSeven);
			visibilityOf(accordionClosedSeven);
			Assert.assertTrue(elementIsDisplayed(accordionClosedSeven));
			System.out.println(getElementText(accordionSeven));
			System.out.println("Accordion Verified successfully");
				
		} else {
			throw new Exception("Accordion Seven is not verified");
		}
	}
	
	public void clickAccordionEight() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(accordionEight)) {
			scrollDownUsingElement(accordionEight);
			clickElementUsingJavaScript(accordionEight);
			visibilityOf(accordionActiveEight);
			Assert.assertTrue(elementIsDisplayed(accordionActiveEight));
			clickElementUsingJavaScript(accordionEight);
			visibilityOf(accordionClosedEight);
			Assert.assertTrue(elementIsDisplayed(accordionClosedEight));
			System.out.println(getElementText(accordionEight));
			System.out.println("Accordion Verified successfully");
				
		} else {
			throw new Exception("Accordion Eight is not verified");
		}
	}
	
	public void clickAccordionNine() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(accordionNine)) {
			scrollDownUsingElement(accordionNine);
			clickElementUsingJavaScript(accordionNine);
			visibilityOf(accordionActiveNine);
			Assert.assertTrue(elementIsDisplayed(accordionActiveNine));
			clickElementUsingJavaScript(accordionNine);
			visibilityOf(accordionClosedNine);
			Assert.assertTrue(elementIsDisplayed(accordionClosedNine));
			System.out.println(getElementText(accordionNine));
			System.out.println("Accordion Verified successfully");
				
		} else {
			throw new Exception("Accordion Nine is not verified");
		}
	}
	
	
	public void clickAccordionTen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(accordionTen)) {
			scrollDownUsingElement(accordionTen);
			clickElementUsingJavaScript(accordionTen);
			visibilityOf(accordionActiveTen);
			Assert.assertTrue(elementIsDisplayed(accordionActiveTen));
			clickElementUsingJavaScript(accordionTen);
			visibilityOf(accordionClosedTen);
			Assert.assertTrue(elementIsDisplayed(accordionClosedTen));
			System.out.println(getElementText(accordionTen));
			System.out.println("Accordion Verified successfully");
				
		} else {
			throw new Exception("Accordion Ten is not verified");
		}
	}
	
	public void clickAccordionEleven() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(accordionEleven)) {
			scrollDownUsingElement(accordionEleven);
			clickElementUsingJavaScript(accordionEleven);
			visibilityOf(accordionActiveEleven);
			Assert.assertTrue(elementIsDisplayed(accordionActiveEleven));
			clickElementUsingJavaScript(accordionEleven);
			visibilityOf(accordionClosedEleven);
			Assert.assertTrue(elementIsDisplayed(accordionClosedEleven));
			System.out.println(getElementText(accordionEleven));
			System.out.println("Accordion Verified successfully");
				
		} else {
			throw new Exception("Accordion Eleven is not verified");
		}
	}
	
	public void clickAccordionTweleve() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(accordionTweleve)) {
			scrollDownUsingElement(accordionTweleve);
			clickElementUsingJavaScript(accordionTweleve);
			visibilityOf(accordionActiveTweleve);
			Assert.assertTrue(elementIsDisplayed(accordionActiveTweleve));
			clickElementUsingJavaScript(accordionTweleve);
			visibilityOf(accordionClosedTweleve);
			Assert.assertTrue(elementIsDisplayed(accordionClosedTweleve));
			System.out.println(getElementText(accordionTweleve));
			System.out.println("Accordion Verified successfully");
				
		} else {
			throw new Exception("Accordion Tweleve is not verified");
		}
	}
	
	public void clickAccordionThirteen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(accordionThirteen)) {
			scrollDownUsingElement(accordionThirteen);
			clickElementUsingJavaScript(accordionThirteen);
			visibilityOf(accordionActiveThirteen);
			Assert.assertTrue(elementIsDisplayed(accordionActiveThirteen));
			clickElementUsingJavaScript(accordionThirteen);
			visibilityOf(accordionClosedThirteen);
			Assert.assertTrue(elementIsDisplayed(accordionClosedThirteen));
			System.out.println(getElementText(accordionThirteen));
			System.out.println("Accordion Verified successfully");
				
		} else {
			throw new Exception("Accordion Thirteen is not verified");
		}
	}
	
	public void clickAccordionFourteen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(accordionFourteen)) {
			scrollDownUsingElement(accordionFourteen);
			clickElementUsingJavaScript(accordionFourteen);
			visibilityOf(accordionActiveFourteen);
			Assert.assertTrue(elementIsDisplayed(accordionActiveFourteen));
			clickElementUsingJavaScript(accordionFourteen);
			visibilityOf(accordionClosedFourteen);
			Assert.assertTrue(elementIsDisplayed(accordionClosedFourteen));
			System.out.println(getElementText(accordionFourteen));
			System.out.println("Accordion Verified successfully");
				
		} else {
			throw new Exception("Accordion Fourteen is not verified");
		}
	}
	
	public void clickAccordionFifteen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(accordionFifteen)) {
			scrollDownUsingElement(accordionFifteen);
			clickElementUsingJavaScript(accordionFifteen);
			visibilityOf(accordionActiveFifteen);
			Assert.assertTrue(elementIsDisplayed(accordionActiveFifteen));
			clickElementUsingJavaScript(accordionFifteen);
			visibilityOf(accordionClosedFifteen);
			Assert.assertTrue(elementIsDisplayed(accordionClosedFifteen));
			System.out.println(getElementText(accordionFifteen));
			System.out.println("Accordion Verified successfully");
				
		} else {
			throw new Exception("Accordion Fifteen is not verified");
		}
	}
	
	
	public void clickAccordionSixteen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(accordionSixteen)) {
			scrollDownUsingElement(accordionSixteen);
			clickElementUsingJavaScript(accordionSixteen);
			visibilityOf(accordionActiveSixteen);
			Assert.assertTrue(elementIsDisplayed(accordionActiveSixteen));
			clickElementUsingJavaScript(accordionSixteen);
			visibilityOf(accordionClosedSixteen);
			Assert.assertTrue(elementIsDisplayed(accordionClosedSixteen));
			System.out.println(getElementText(accordionSixteen));
			System.out.println("Accordion Verified successfully");
				
		} else {
			throw new Exception("Accordion Sixteen is not verified");
		}
	}
	
	public void clickAccordionSeventeen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(accordionSeventeen)) {
			scrollDownUsingElement(accordionSeventeen);
			clickElementUsingJavaScript(accordionSeventeen);
			visibilityOf(accordionActiveSeventeen);
			Assert.assertTrue(elementIsDisplayed(accordionActiveSeventeen));
			clickElementUsingJavaScript(accordionSeventeen);
			visibilityOf(accordionClosedSeventeen);
			Assert.assertTrue(elementIsDisplayed(accordionClosedSeventeen));
			System.out.println(getElementText(accordionSeventeen));
			System.out.println("Accordion Verified successfully");
				
		} else {
			throw new Exception("Accordion Seventeen is not verified");
		}
	}
	
	
	public void clickAccordionEigthteen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(accordionEighteen)) {
			scrollDownUsingElement(accordionEighteen);
			clickElementUsingJavaScript(accordionEighteen);
			visibilityOf(accordionActiveEighteen);
			Assert.assertTrue(elementIsDisplayed(accordionActiveEighteen));
			clickElementUsingJavaScript(accordionEighteen);
			visibilityOf(accordionClosedEighteen);
			Assert.assertTrue(elementIsDisplayed(accordionClosedEighteen));
			System.out.println(getElementText(accordionEighteen));
			System.out.println("Accordion Verified successfully");
				
		} else {
			throw new Exception("Accordion Eighteen is not verified");
		}
	}
	
	
	public void clickAccordionNineteen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(accordionNineteen)) {
			scrollDownUsingElement(accordionNineteen);
			clickElementUsingJavaScript(accordionNineteen);
			visibilityOf(accordionActiveNineteen);
			Assert.assertTrue(elementIsDisplayed(accordionActiveNineteen));
			clickElementUsingJavaScript(accordionNineteen);
			visibilityOf(accordionClosedNineteen);
			Assert.assertTrue(elementIsDisplayed(accordionClosedNineteen));
			System.out.println(getElementText(accordionNineteen));
			System.out.println("Accordion Verified successfully");
				
		} else {
			throw new Exception("Accordion Nineteen is not verified");
		}
	}
	
	
	public void clickAccordionTwenty() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(accordionTwenty)) {
			scrollDownUsingElement(accordionTwenty);
			clickElementUsingJavaScript(accordionTwenty);
			visibilityOf(accordionActiveTwenty);
			Assert.assertTrue(elementIsDisplayed(accordionActiveTwenty));
			clickElementUsingJavaScript(accordionTwenty);
			visibilityOf(accordionClosedTwenty);
			Assert.assertTrue(elementIsDisplayed(accordionClosedTwenty));
			System.out.println(getElementText(accordionTwenty));
			System.out.println("Accordion Verified successfully");
				
		} else {
			throw new Exception("Accordion Twenty is not verified");
		}
	}
	
	public void clickAccordionTwentyOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(accordionTwentyOne)) {
			scrollDownUsingElement(accordionTwentyOne);
			clickElementUsingJavaScript(accordionTwentyOne);
			visibilityOf(accordionActiveTwentyOne);
			Assert.assertTrue(elementIsDisplayed(accordionActiveTwentyOne));
			clickElementUsingJavaScript(accordionTwentyOne);
			visibilityOf(accordionClosedTwentyOne);
			Assert.assertTrue(elementIsDisplayed(accordionClosedTwentyOne));
			System.out.println(getElementText(accordionTwentyOne));
			System.out.println("Accordion Verified successfully");
				
		} else {
			throw new Exception("Accordion Twentyone is not verified");
		}
	}
	
	
}
