package com.qa.nexium.us.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class NexiumFAQPage extends BaseClass{
	
	public NexiumFAQPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='Homepage']//self::a[@href='/us/']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even last is-current ']//self::li[text()=' FAQ ']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//span[text()='What is Nexium 24HR?']//ancestor::header[@class='accordion-head active']")
	private static WebElement aboutNexium24HrAccordionOne;
	
	@FindBy(xpath = "//span[text()='What is Nexium 24HR?']//ancestor::li[@class='accordion-slide is-active first odd']")
	private static WebElement aboutNexium24HrAccordionActiveOne;
	
	@FindBy(xpath = "//span[text()='What is Nexium 24HR?']//ancestor::li[@class='accordion-slide first odd is-active']")
	private static WebElement aboutNexium24HrAccordionActiveAgainOne;
	
	@FindBy(xpath = "//span[text()='What is Nexium 24HR?']//ancestor::header[@class='accordion-head']")
	private static WebElement aboutNexium24HrAccordionCloseOne;
	
	@FindBy(xpath = "//span[text()='What is Nexium 24HR?']//ancestor::li[@class='accordion-slide first odd']")
	private static WebElement aboutNexium24HrAccordionCloseActiveOne;
	
	
	
	@FindBy(xpath = "//span[text()='Why is it called Nexium 24HR?']//ancestor::header[@class='accordion-head']")
	private static WebElement aboutNexium24HrAccordionTwo;
	
	@FindBy(xpath = "//span[text()='Why is it called Nexium 24HR?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement aboutNexium24HrAccordionActiveTwo;
	
	@FindBy(xpath = "//span[text()='Why is it called Nexium 24HR?']//ancestor::header[@class='accordion-head active']")
	private static WebElement aboutNexium24HrAccordionCloseTwo;
	
	@FindBy(xpath = "//span[text()='Why is it called Nexium 24HR?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement aboutNexium24HrAccordionCloseActiveTwo;
	
	@FindBy(xpath = "//span[text()='Is there a difference between Nexium 24HR and prescription NEXIUM?']//ancestor::header[@class='accordion-head']")
	private static WebElement aboutNexium24HrAccordionThree;
	
	@FindBy(xpath = "//span[text()='Is there a difference between Nexium 24HR and prescription NEXIUM?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement aboutNexium24HrAccordionActiveThree;
	
	@FindBy(xpath = "//span[text()='Is there a difference between Nexium 24HR and prescription NEXIUM?']//ancestor::header[@class='accordion-head active']")
	private static WebElement aboutNexium24HrAccordionCloseThree;
	
	@FindBy(xpath = "//span[text()='Is there a difference between Nexium 24HR and prescription NEXIUM?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement aboutNexium24HrAccordionCloseActiveThree;
	
	@FindBy(xpath = "//span[text()='Am I getting the same medicine in the tablet versus the capsule versus the ClearMinis™ capsule?']//ancestor::header[@class='accordion-head']")
	private static WebElement aboutNexium24HrAccordionFour;
	
	@FindBy(xpath = "//span[text()='Am I getting the same medicine in the tablet versus the capsule versus the ClearMinis™ capsule?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement aboutNexium24HrAccordionActiveFour;
	
	@FindBy(xpath = "//span[text()='Am I getting the same medicine in the tablet versus the capsule versus the ClearMinis™ capsule?']//ancestor::header[@class='accordion-head active']")
	private static WebElement aboutNexium24HrAccordionCloseFour;
	
	@FindBy(xpath = "//span[text()='Am I getting the same medicine in the tablet versus the capsule versus the ClearMinis™ capsule?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement aboutNexium24HrAccordionCloseActiveFour;
	
	@FindBy(xpath = "//span[text()='Why do some of the Nexium 24HR capsule bottles have a yellow cap?']//ancestor::header[@class='accordion-head']")
	private static WebElement aboutNexium24HrAccordionFive;
	
	@FindBy(xpath = "//span[text()='Why do some of the Nexium 24HR capsule bottles have a yellow cap?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement aboutNexium24HrAccordionActiveFive;
	
	@FindBy(xpath = "//span[text()='Why do some of the Nexium 24HR capsule bottles have a yellow cap?']//ancestor::header[@class='accordion-head active']")
	private static WebElement aboutNexium24HrAccordionCloseFive;
	
	@FindBy(xpath = "//span[text()='Why do some of the Nexium 24HR capsule bottles have a yellow cap?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement aboutNexium24HrAccordionCloseActiveFive;
	
	@FindBy(xpath = "//span[text()='Is taking Nexium 24HR safe?']//ancestor::header[@class='accordion-head']")
	private static WebElement aboutNexium24HrAccordionSix;
	
	@FindBy(xpath = "//span[text()='Is taking Nexium 24HR safe?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement aboutNexium24HrAccordionActiveSix;
	
	@FindBy(xpath = "//span[text()='Is taking Nexium 24HR safe?']//ancestor::header[@class='accordion-head active']")
	private static WebElement aboutNexium24HrAccordionCloseSix;
	
	@FindBy(xpath = "//span[text()='Is taking Nexium 24HR safe?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement aboutNexium24HrAccordionCloseActiveSix;
	
	@FindBy(xpath = "//span[text()='Why was a new warning placed on Nexium 24HR packaging? (What is different in Nexium 24HR labeling?)']//ancestor::header[@class='accordion-head']")
	private static WebElement aboutNexium24HrAccordionSeven;
	
	@FindBy(xpath = "//span[text()='Why was a new warning placed on Nexium 24HR packaging? (What is different in Nexium 24HR labeling?)']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement aboutNexium24HrAccordionActiveSeven;
	
	@FindBy(xpath = "//span[text()='Why was a new warning placed on Nexium 24HR packaging? (What is different in Nexium 24HR labeling?)']//ancestor::header[@class='accordion-head active']")
	private static WebElement aboutNexium24HrAccordionCloseSeven;
	
	@FindBy(xpath = "//span[text()='Why was a new warning placed on Nexium 24HR packaging? (What is different in Nexium 24HR labeling?)']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement aboutNexium24HrAccordionCloseActiveSeven;
	
	@FindBy(xpath = "//span[text()='Why is there a difference between the labels on your website and some of the labels on the product packaging?']//ancestor::header[@class='accordion-head']")
	private static WebElement aboutNexium24HrAccordionEight;
	
	@FindBy(xpath = "//span[text()='Why is there a difference between the labels on your website and some of the labels on the product packaging?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement aboutNexium24HrAccordionActiveEight;
	
	@FindBy(xpath = "//span[text()='Why is there a difference between the labels on your website and some of the labels on the product packaging?']//ancestor::header[@class='accordion-head active']")
	private static WebElement aboutNexium24HrAccordionCloseEight;
	
	@FindBy(xpath = "//span[text()='Why is there a difference between the labels on your website and some of the labels on the product packaging?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement aboutNexium24HrAccordionCloseActiveEight;
	
	@FindBy(xpath = "//span[text()='Does Nexium 24HR contain the active ingredient Ranitidine or NDMA (N-Nitrosodimethylamine)?']//ancestor::header[@class='accordion-head']")
	private static WebElement aboutNexium24HrAccordionNine;
	
	@FindBy(xpath = "//span[text()='Does Nexium 24HR contain the active ingredient Ranitidine or NDMA (N-Nitrosodimethylamine)?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement aboutNexium24HrAccordionActiveNine;
	
	@FindBy(xpath = "//span[text()='Does Nexium 24HR contain the active ingredient Ranitidine or NDMA (N-Nitrosodimethylamine)?']//ancestor::header[@class='accordion-head active']")
	private static WebElement aboutNexium24HrAccordionCloseNine;
	
	@FindBy(xpath = "//span[text()='Does Nexium 24HR contain the active ingredient Ranitidine or NDMA (N-Nitrosodimethylamine)?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement aboutNexium24HrAccordionCloseActiveNine;
	
	@FindBy(xpath = "//span[text()='What’s the difference between Nexium 24HR and Zantac?']//ancestor::header[@class='accordion-head']")
	private static WebElement aboutNexium24HrAccordionTen;
	
	@FindBy(xpath = "//span[text()='What’s the difference between Nexium 24HR and Zantac?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement aboutNexium24HrAccordionActiveTen;
	
	@FindBy(xpath = "//span[text()='What’s the difference between Nexium 24HR and Zantac?']//ancestor::header[@class='accordion-head active']")
	private static WebElement aboutNexium24HrAccordionCloseTen;
	
	@FindBy(xpath = "//span[text()='What’s the difference between Nexium 24HR and Zantac?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement aboutNexium24HrAccordionCloseActiveTen;
	
	@FindBy(xpath = "//span[text()='Was Nexium 24HR recalled?']//ancestor::header[@class='accordion-head']")
	private static WebElement aboutNexium24HrAccordionEleven;
	
	@FindBy(xpath = "//span[text()='Was Nexium 24HR recalled?']//ancestor::li[@class='accordion-slide last odd is-active']")
	private static WebElement aboutNexium24HrAccordionActiveEleven;
	
	@FindBy(xpath = "//span[text()='Was Nexium 24HR recalled?']//ancestor::header[@class='accordion-head active']")
	private static WebElement aboutNexium24HrAccordionCloseEleven;
	
	@FindBy(xpath = "//span[text()='Was Nexium 24HR recalled?']//ancestor::li[@class='accordion-slide last odd']")
	private static WebElement aboutNexium24HrAccordionCloseActiveEleven;
	
	@FindBy(xpath = "//span[text()='How does Nexium 24HR treat frequent heartburn?']//ancestor::header[@class='accordion-head']")
	private static WebElement howDoesNexium24HrAccordionOne;
	
	@FindBy(xpath = "//span[text()='How does Nexium 24HR treat frequent heartburn?']//ancestor::li[@class='accordion-slide first odd is-active']")
	private static WebElement howDoesNexium24HrAccordionActiveOne;
	
	@FindBy(xpath = "//span[text()='How does Nexium 24HR treat frequent heartburn?']//ancestor::header[@class='accordion-head active']")
	private static WebElement howDoesNexium24HrAccordionCloseOne;
	
	@FindBy(xpath = "//span[text()='How does Nexium 24HR treat frequent heartburn?']//ancestor::li[@class='accordion-slide first odd']")
	private static WebElement howDoesNexium24HrAccordionCloseActiveOne;
	
	@FindBy(xpath = "//span[text()='What are proton pump inhibitors?']//ancestor::header[@class='accordion-head']")
	private static WebElement howDoesNexium24HrAccordionTwo;
	
	@FindBy(xpath = "//span[text()='What are proton pump inhibitors?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement howDoesNexium24HrAccordionActiveTwo;
	
	@FindBy(xpath = "//span[text()='What are proton pump inhibitors?']//ancestor::header[@class='accordion-head active']")
	private static WebElement howDoesNexium24HrAccordionCloseTwo;
	
	@FindBy(xpath = "//span[text()='What are proton pump inhibitors?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement howDoesNexium24HrAccordionCloseActiveTwo;
	
	@FindBy(xpath = "//span[text()='What’s the difference between PPIs and H2s?']//ancestor::header[@class='accordion-head']")
	private static WebElement howDoesNexium24HrAccordionThree;
	
	@FindBy(xpath = "//span[text()='What’s the difference between PPIs and H2s?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement howDoesNexium24HrAccordionActiveThree;
	
	@FindBy(xpath = "//span[text()='What’s the difference between PPIs and H2s?']//ancestor::header[@class='accordion-head active']")
	private static WebElement howDoesNexium24HrAccordionCloseThree;
	
	@FindBy(xpath = "//span[text()='What’s the difference between PPIs and H2s?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement howDoesNexium24HrAccordionCloseActiveThree;
	
	@FindBy(xpath = "//span[text()='What is the difference between PPIs and Antacids?']//ancestor::header[@class='accordion-head']")
	private static WebElement howDoesNexium24HrAccordionFour;
	
	@FindBy(xpath = "//span[text()='What is the difference between PPIs and Antacids?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement howDoesNexium24HrAccordionActiveFour;
	
	@FindBy(xpath = "//span[text()='What is the difference between PPIs and Antacids?']//ancestor::header[@class='accordion-head active']")
	private static WebElement howDoesNexium24HrAccordionCloseFour;
	
	@FindBy(xpath = "//span[text()='What is the difference between PPIs and Antacids?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement howDoesNexium24HrAccordionCloseActiveFour;
	
	@FindBy(xpath = "//span[text()='How quickly does Nexium 24HR work?']//ancestor::header[@class='accordion-head']")
	private static WebElement howDoesNexium24HrAccordionFive;
	
	@FindBy(xpath = "//span[text()='How quickly does Nexium 24HR work?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement howDoesNexium24HrAccordionActiveFive;
	
	@FindBy(xpath = "//span[text()='How quickly does Nexium 24HR work?']//ancestor::header[@class='accordion-head active']")
	private static WebElement howDoesNexium24HrAccordionCloseFive;
	
	@FindBy(xpath = "//span[text()='How quickly does Nexium 24HR work?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement howDoesNexium24HrAccordionCloseActiveFive;
	
	@FindBy(xpath = "//span[text()='How does Nexium 24HR compare to other acid reflux medications?']//ancestor::header[@class='accordion-head']")
	private static WebElement howDoesNexium24HrAccordionSix;
	
	@FindBy(xpath = "//span[text()='How does Nexium 24HR compare to other acid reflux medications?']//ancestor::li[@class='accordion-slide last even is-active']")
	private static WebElement howDoesNexium24HrAccordionActiveSix;
	
	@FindBy(xpath = "//span[text()='How does Nexium 24HR compare to other acid reflux medications?']//ancestor::header[@class='accordion-head active']")
	private static WebElement howDoesNexium24HrAccordionCloseSix;
	
	@FindBy(xpath = "//span[text()='How does Nexium 24HR compare to other acid reflux medications?']//ancestor::li[@class='accordion-slide last even']")
	private static WebElement howDoesNexium24HrAccordionCloseActiveSix;
	
	
	
	
	
	
	
	
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
			throw new Exception("Unable to click on cookie Pop-up");
		}
	}
	
	public void clickAboutNexium24HrAccordionOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(aboutNexium24HrAccordionActiveOne)) {
			scrollDownUsingElement(aboutNexium24HrAccordionActiveOne);
			clickElementUsingJavaScript(aboutNexium24HrAccordionCloseOne);
			visibilityOf(aboutNexium24HrAccordionCloseActiveOne);
			Assert.assertTrue(elementIsDisplayed(aboutNexium24HrAccordionCloseActiveOne));
			clickElementUsingJavaScript(aboutNexium24HrAccordionOne);
			visibilityOf(aboutNexium24HrAccordionActiveAgainOne);
			Assert.assertTrue(elementIsDisplayed(aboutNexium24HrAccordionActiveAgainOne));
			System.out.println("About nexium 24 Hr Accordion One verified Successfully");
		} else {
			System.out.println("About nexium 24 Hr Accordion one is not active in the page");
			throw new Exception("About nexium 24 Hr Accordion one is not active in the page");
		}
	}
	
	
	public void clickAboutNexium24HrAccordionTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(aboutNexium24HrAccordionActiveOne)) {
			scrollDownUsingElement(aboutNexium24HrAccordionTwo);
			clickElementUsingJavaScript(aboutNexium24HrAccordionTwo);
			visibilityOf(aboutNexium24HrAccordionActiveTwo);
			Assert.assertTrue(elementIsDisplayed(aboutNexium24HrAccordionActiveTwo));
			clickElementUsingJavaScript(aboutNexium24HrAccordionCloseTwo);
			visibilityOf(aboutNexium24HrAccordionCloseActiveTwo);
			Assert.assertTrue(elementIsDisplayed(aboutNexium24HrAccordionCloseActiveTwo));
			System.out.println("About nexium 24 Hr Accordion Two verified Successfully");
		} else {
			System.out.println("About nexium 24 Hr Accordion one is not active in the page");
			throw new Exception("About nexium 24 Hr Accordion one is not active in the page");
		}
	}
	
	public void clickAboutNexium24HrAccordionThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(aboutNexium24HrAccordionActiveOne)) {
			scrollDownUsingElement(aboutNexium24HrAccordionThree);
			clickElementUsingJavaScript(aboutNexium24HrAccordionThree);
			visibilityOf(aboutNexium24HrAccordionActiveThree);
			Assert.assertTrue(elementIsDisplayed(aboutNexium24HrAccordionActiveThree));
			clickElementUsingJavaScript(aboutNexium24HrAccordionCloseThree);
			visibilityOf(aboutNexium24HrAccordionCloseActiveThree);
			Assert.assertTrue(elementIsDisplayed(aboutNexium24HrAccordionCloseActiveThree));
			System.out.println("About nexium 24 Hr Accordion Three verified Successfully");
		} else {
			System.out.println("About nexium 24 Hr Accordion Three is not active in the page");
			throw new Exception("About nexium 24 Hr Accordion Three is not active in the page");
		}
	}
	
	public void clickAboutNexium24HrAccordionFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(aboutNexium24HrAccordionActiveOne)) {
			scrollDownUsingElement(aboutNexium24HrAccordionFour);
			clickElementUsingJavaScript(aboutNexium24HrAccordionFour);
			visibilityOf(aboutNexium24HrAccordionActiveFour);
			Assert.assertTrue(elementIsDisplayed(aboutNexium24HrAccordionActiveFour));
			clickElementUsingJavaScript(aboutNexium24HrAccordionCloseFour);
			visibilityOf(aboutNexium24HrAccordionCloseActiveFour);
			Assert.assertTrue(elementIsDisplayed(aboutNexium24HrAccordionCloseActiveFour));
			System.out.println("About nexium 24 Hr Accordion Four verified Successfully");
		} else {
			System.out.println("About nexium 24 Hr Accordion Four is not active in the page");
			throw new Exception("About nexium 24 Hr Accordion Four is not active in the page");
		}
	}
	
	public void clickAboutNexium24HrAccordionFive() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(aboutNexium24HrAccordionActiveOne)) {
			scrollDownUsingElement(aboutNexium24HrAccordionFive);
			clickElementUsingJavaScript(aboutNexium24HrAccordionFive);
			visibilityOf(aboutNexium24HrAccordionActiveFive);
			Assert.assertTrue(elementIsDisplayed(aboutNexium24HrAccordionActiveFive));
			clickElementUsingJavaScript(aboutNexium24HrAccordionCloseFive);
			visibilityOf(aboutNexium24HrAccordionCloseActiveFive);
			Assert.assertTrue(elementIsDisplayed(aboutNexium24HrAccordionCloseActiveFive));
			System.out.println("About nexium 24 Hr Accordion Five verified Successfully");
		} else {
			System.out.println("About nexium 24 Hr Accordion Five is not active in the page");
			throw new Exception("About nexium 24 Hr Accordion Five is not active in the page");
		}
	}
	
	public void clickAboutNexium24HrAccordionSix() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(aboutNexium24HrAccordionActiveOne)) {
			scrollDownUsingElement(aboutNexium24HrAccordionSix);
			clickElementUsingJavaScript(aboutNexium24HrAccordionSix);
			visibilityOf(aboutNexium24HrAccordionActiveSix);
			Assert.assertTrue(elementIsDisplayed(aboutNexium24HrAccordionActiveSix));
			clickElementUsingJavaScript(aboutNexium24HrAccordionCloseSix);
			visibilityOf(aboutNexium24HrAccordionCloseActiveSix);
			Assert.assertTrue(elementIsDisplayed(aboutNexium24HrAccordionCloseActiveSix));
			System.out.println("About nexium 24 Hr Accordion Six verified Successfully");
		} else {
			System.out.println("About nexium 24 Hr Accordion Six is not active in the page");
			throw new Exception("About nexium 24 Hr Accordion Six is not active in the page");
		}
	}
	
	public void clickAboutNexium24HrAccordionSeven() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(aboutNexium24HrAccordionActiveOne)) {
			scrollDownUsingElement(aboutNexium24HrAccordionSeven);
			clickElementUsingJavaScript(aboutNexium24HrAccordionSeven);
			visibilityOf(aboutNexium24HrAccordionActiveSeven);
			Assert.assertTrue(elementIsDisplayed(aboutNexium24HrAccordionActiveSeven));
			clickElementUsingJavaScript(aboutNexium24HrAccordionCloseSeven);
			visibilityOf(aboutNexium24HrAccordionCloseActiveSeven);
			Assert.assertTrue(elementIsDisplayed(aboutNexium24HrAccordionCloseActiveSeven));
			System.out.println("About nexium 24 Hr Accordion Seven verified Successfully");
		} else {
			System.out.println("About nexium 24 Hr Accordion Seven is not active in the page");
			throw new Exception("About nexium 24 Hr Accordion Seven is not active in the page");
		}
	}
	
	public void clickAboutNexium24HrAccordionEight() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(aboutNexium24HrAccordionActiveOne)) {
			scrollDownUsingElement(aboutNexium24HrAccordionEight);
			clickElementUsingJavaScript(aboutNexium24HrAccordionEight);
			visibilityOf(aboutNexium24HrAccordionActiveEight);
			Assert.assertTrue(elementIsDisplayed(aboutNexium24HrAccordionActiveEight));
			clickElementUsingJavaScript(aboutNexium24HrAccordionCloseEight);
			visibilityOf(aboutNexium24HrAccordionCloseActiveEight);
			Assert.assertTrue(elementIsDisplayed(aboutNexium24HrAccordionCloseActiveEight));
			System.out.println("About nexium 24 Hr Accordion Eight verified Successfully");
		} else {
			System.out.println("About nexium 24 Hr Accordion Eight is not active in the page");
			throw new Exception("About nexium 24 Hr Accordion Eight is not active in the page");
		}
	}
	
	public void clickAboutNexium24HrAccordionNine() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(aboutNexium24HrAccordionActiveOne)) {
			scrollDownUsingElement(aboutNexium24HrAccordionNine);
			clickElementUsingJavaScript(aboutNexium24HrAccordionNine);
			visibilityOf(aboutNexium24HrAccordionActiveNine);
			Assert.assertTrue(elementIsDisplayed(aboutNexium24HrAccordionActiveNine));
			clickElementUsingJavaScript(aboutNexium24HrAccordionCloseNine);
			visibilityOf(aboutNexium24HrAccordionCloseActiveNine);
			Assert.assertTrue(elementIsDisplayed(aboutNexium24HrAccordionCloseActiveNine));
			System.out.println("About nexium 24 Hr Accordion Nine verified Successfully");
		} else {
			System.out.println("About nexium 24 Hr Accordion Nine is not active in the page");
			throw new Exception("About nexium 24 Hr Accordion Nine is not active in the page");
		}
	}
	
	public void clickAboutNexium24HrAccordionTen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(aboutNexium24HrAccordionActiveOne)) {
			scrollDownUsingElement(aboutNexium24HrAccordionTen);
			clickElementUsingJavaScript(aboutNexium24HrAccordionTen);
			visibilityOf(aboutNexium24HrAccordionActiveTen);
			Assert.assertTrue(elementIsDisplayed(aboutNexium24HrAccordionActiveTen));
			clickElementUsingJavaScript(aboutNexium24HrAccordionCloseTen);
			visibilityOf(aboutNexium24HrAccordionCloseActiveTen);
			Assert.assertTrue(elementIsDisplayed(aboutNexium24HrAccordionCloseActiveTen));
			System.out.println("About nexium 24 Hr Accordion Ten verified Successfully");
		} else {
			System.out.println("About nexium 24 Hr Accordion Ten is not active in the page");
			throw new Exception("About nexium 24 Hr Accordion Ten is not active in the page");
		}
	}
	
	public void clickAboutNexium24HrAccordionEleven() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(aboutNexium24HrAccordionActiveOne)) {
			scrollDownUsingElement(aboutNexium24HrAccordionEleven);
			clickElementUsingJavaScript(aboutNexium24HrAccordionEleven);
			visibilityOf(aboutNexium24HrAccordionActiveEleven);
			Assert.assertTrue(elementIsDisplayed(aboutNexium24HrAccordionActiveEleven));
			clickElementUsingJavaScript(aboutNexium24HrAccordionCloseEleven);
			visibilityOf(aboutNexium24HrAccordionCloseActiveEleven);
			Assert.assertTrue(elementIsDisplayed(aboutNexium24HrAccordionCloseActiveEleven));
			System.out.println("About nexium 24 Hr Accordion Eleven verified Successfully");
		} else {
			System.out.println("About nexium 24 Hr Accordion Eleven is not active in the page");
			throw new Exception("About nexium 24 Hr Accordion Eleven is not active in the page");
		}
	}
	
	
	public void clickHowDoesNexium24HrAccordionOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(howDoesNexium24HrAccordionOne)) {
			scrollDownUsingElement(howDoesNexium24HrAccordionOne);
			clickElementUsingJavaScript(howDoesNexium24HrAccordionOne);
			visibilityOf(howDoesNexium24HrAccordionActiveOne);
			Assert.assertTrue(elementIsDisplayed(howDoesNexium24HrAccordionActiveOne));
			clickElementUsingJavaScript(howDoesNexium24HrAccordionCloseOne);
			visibilityOf(howDoesNexium24HrAccordionCloseActiveOne);
			Assert.assertTrue(elementIsDisplayed(howDoesNexium24HrAccordionCloseActiveOne));
			System.out.println("How Does Nexium 24 Hr Accordion One verified Successfully");
		} else {
			System.out.println("How Does Nexium 24 Hr Accordion One is not active in the page");
			throw new Exception("How Does Nexium 24 Hr Accordion One is not active in the page");
		}
	}
	
	public void clickHowDoesNexium24HrAccordionTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(howDoesNexium24HrAccordionTwo)) {
			scrollDownUsingElement(howDoesNexium24HrAccordionTwo);
			clickElementUsingJavaScript(howDoesNexium24HrAccordionTwo);
			visibilityOf(howDoesNexium24HrAccordionActiveTwo);
			Assert.assertTrue(elementIsDisplayed(howDoesNexium24HrAccordionActiveTwo));
			clickElementUsingJavaScript(howDoesNexium24HrAccordionCloseTwo);
			visibilityOf(howDoesNexium24HrAccordionCloseActiveTwo);
			Assert.assertTrue(elementIsDisplayed(howDoesNexium24HrAccordionCloseActiveTwo));
			System.out.println("How Does Nexium 24 Hr Accordion Two verified Successfully");
		} else {
			System.out.println("How Does Nexium 24 Hr Accordion Two is not active in the page");
			throw new Exception("How Does Nexium 24 Hr Accordion Two is not active in the page");
		}
	}
	
	public void clickHowDoesNexium24HrAccordionThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(howDoesNexium24HrAccordionThree)) {
			scrollDownUsingElement(howDoesNexium24HrAccordionThree);
			clickElementUsingJavaScript(howDoesNexium24HrAccordionThree);
			visibilityOf(howDoesNexium24HrAccordionActiveThree);
			Assert.assertTrue(elementIsDisplayed(howDoesNexium24HrAccordionActiveThree));
			clickElementUsingJavaScript(howDoesNexium24HrAccordionCloseThree);
			visibilityOf(howDoesNexium24HrAccordionCloseActiveThree);
			Assert.assertTrue(elementIsDisplayed(howDoesNexium24HrAccordionCloseActiveThree));
			System.out.println("How Does Nexium 24 Hr Accordion Three verified Successfully");
		} else {
			System.out.println("How Does Nexium 24 Hr Accordion Three is not active in the page");
			throw new Exception("How Does Nexium 24 Hr Accordion Three is not active in the page");
		}
	}
	
	public void clickHowDoesNexium24HrAccordionFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(howDoesNexium24HrAccordionFour)) {
			scrollDownUsingElement(howDoesNexium24HrAccordionFour);
			clickElementUsingJavaScript(howDoesNexium24HrAccordionFour);
			visibilityOf(howDoesNexium24HrAccordionActiveFour);
			Assert.assertTrue(elementIsDisplayed(howDoesNexium24HrAccordionActiveFour));
			clickElementUsingJavaScript(howDoesNexium24HrAccordionCloseFour);
			visibilityOf(howDoesNexium24HrAccordionCloseActiveFour);
			Assert.assertTrue(elementIsDisplayed(howDoesNexium24HrAccordionCloseActiveFour));
			System.out.println("How Does Nexium 24 Hr Accordion Four verified Successfully");
		} else {
			System.out.println("How Does Nexium 24 Hr Accordion Four is not active in the page");
			throw new Exception("How Does Nexium 24 Hr Accordion Four is not active in the page");
		}
	}
	
	public void clickHowDoesNexium24HrAccordionFive() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(howDoesNexium24HrAccordionFive)) {
			scrollDownUsingElement(howDoesNexium24HrAccordionFive);
			clickElementUsingJavaScript(howDoesNexium24HrAccordionFive);
			visibilityOf(howDoesNexium24HrAccordionActiveFive);
			Assert.assertTrue(elementIsDisplayed(howDoesNexium24HrAccordionActiveFive));
			clickElementUsingJavaScript(howDoesNexium24HrAccordionCloseFive);
			visibilityOf(howDoesNexium24HrAccordionCloseActiveFive);
			Assert.assertTrue(elementIsDisplayed(howDoesNexium24HrAccordionCloseActiveFive));
			System.out.println("How Does Nexium 24 Hr Accordion Five verified Successfully");
		} else {
			System.out.println("How Does Nexium 24 Hr Accordion Five is not active in the page");
			throw new Exception("How Does Nexium 24 Hr Accordion Five is not active in the page");
		}
	}
	
	public void clickHowDoesNexium24HrAccordionSix() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(howDoesNexium24HrAccordionSix)) {
			scrollDownUsingElement(howDoesNexium24HrAccordionSix);
			clickElementUsingJavaScript(howDoesNexium24HrAccordionSix);
			visibilityOf(howDoesNexium24HrAccordionActiveSix);
			Assert.assertTrue(elementIsDisplayed(howDoesNexium24HrAccordionActiveSix));
			clickElementUsingJavaScript(howDoesNexium24HrAccordionCloseSix);
			visibilityOf(howDoesNexium24HrAccordionCloseActiveSix);
			Assert.assertTrue(elementIsDisplayed(howDoesNexium24HrAccordionCloseActiveSix));
			System.out.println("How Does Nexium 24 Hr Accordion Six verified Successfully");
		} else {
			System.out.println("How Does Nexium 24 Hr Accordion Six is not active in the page");
			throw new Exception("How Does Nexium 24 Hr Accordion Six is not active in the page");
		}
	}
	

}
