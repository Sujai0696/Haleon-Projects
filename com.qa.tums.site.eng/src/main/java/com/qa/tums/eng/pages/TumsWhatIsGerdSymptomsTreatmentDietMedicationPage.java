package com.qa.tums.eng.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class TumsWhatIsGerdSymptomsTreatmentDietMedicationPage extends BaseClass{
	
	public TumsWhatIsGerdSymptomsTreatmentDietMedicationPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//a[text()='TUMS Home']")
	private static WebElement breadCrumbHome;
	
	@FindBy(xpath = "//a[text()='Heartburn 101']")
	private static WebElement breadCrumbOne;
	
	@FindBy(xpath = "//a[@href='/about-heartburn/causes/']//following::u[text()='heartburn']")
	private static WebElement hyperLinkOne;
	
	@FindBy(xpath = "//span[text()='What is GERD?']//ancestor::li[@class='accordion-slide is-active first odd']")
	private static WebElement accordionActiveOne;
	
	@FindBy(xpath = "//span[text()='What is GERD?']//ancestor::header[@class='accordion-head']")
	private static WebElement accordionOne;
	
	@FindBy(xpath = "//li[@class='accordion-slide first odd']")
	private static WebElement accordionClosedOne;
	
	@FindBy(xpath = "//span[text()='What causes GERD?']//ancestor::header[@class='accordion-head']")
	private static WebElement  accordionTwo;
	
	@FindBy(xpath = "//span[text()='What causes GERD?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement accordionActiveTwo;
	
	@FindBy(xpath = "//a[@aria-expanded='false']")
	private static WebElement accordionClosed;
	
	@FindBy(xpath = "//span[text()='What are the symptoms of GERD?']//ancestor::header[@class='accordion-head']")
	private static WebElement accordionThree;
	
	@FindBy(xpath = "//span[text()='What are the symptoms of GERD?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement accordionActiveThree;
	
	@FindBy(xpath = "//span[text()='How is GERD diagnosed?']//ancestor::header[@class='accordion-head']")
	private static WebElement accordionFour;
	
	@FindBy(xpath = "//span[text()='How is GERD diagnosed?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement accordionActiveFour;
	
	@FindBy(xpath = "//span[text()='What is the treatment for GERD?']//ancestor::Header[@class='accordion-head']")
	private static WebElement accordionFive;
	
	@FindBy(xpath = "//span[text()='What is the treatment for GERD?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement accordionActiveFive;
	
	@FindBy(xpath = "//span[text()='Can diet relieve GERD symptoms?']//ancestor::header[@class='accordion-head']")
	private static WebElement accordionSix;
	
	@FindBy(xpath = "//span[text()='Can diet relieve GERD symptoms?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement accordionActiveSix;
	
	@FindBy(xpath = "//span[text()='Is there medication for GERD?']//ancestor::header[@class='accordion-head']")
	private static WebElement accordionSeven;
	
	@FindBy(xpath = "//span[text()='Is there medication for GERD?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement accordionActiveSeven;
	
	@FindBy(xpath = "//span[text()='Do TUMS help acid reflux and GERD?']//ancestor::header[@class='accordion-head']")
	private static WebElement accordionEight;
	
	@FindBy(xpath = "//span[text()='Do TUMS help acid reflux and GERD?']//ancestor::li[@class='accordion-slide last even is-active']")
	private static WebElement accordionActiveEight;
	
	@FindBy(xpath = "//a[text()='TUMS Ultra Strength 1000']")
	private static WebElement accordionEightHyperLink;
	
	@FindBy(xpath = "//a[text()='TUMS Naturals']")
	private static WebElement hyperLinkTwo;
	
	@FindBy(id = "seeproducts-link")
	private static WebElement seeProducts;
	
	
	
	
	
	
	
	
	
	public void clickCookieBtn() throws Exception {
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
	
	public void clickBreadCrumbHome() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(breadCrumbHome);
		clickElementUsingJavaScript(breadCrumbHome);
	}
	
	public void clickBreadCrumbOne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(breadCrumbOne);
		clickElementUsingJavaScript(breadCrumbOne);
	}
	
	public void clickHyperLinkOne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(hyperLinkOne);
		clickElementUsingJavaScript(hyperLinkOne);
	}
	
	public void clickAccordionOne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(accordionActiveOne);
		if (isElementPresent(accordionActiveOne)) {
			Assert.assertTrue(elementIsDisplayed(accordionActiveOne));
			elementToBeClickable(accordionOne);
			clickElementUsingJavaScript(accordionOne);
			implicitWait();
			Assert.assertTrue(elementIsDisplayed(accordionClosedOne));
			System.out.println(getElementText(accordionOne));
		} else {
			System.out.println("Accordion is not active");
			Assert.assertTrue(false);
		}
	}
	
	public void clickAccordionTwo() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(accordionTwo);
		if (isElementPresent(accordionTwo)) {
			clickElementUsingJavaScript(accordionTwo);
			Assert.assertTrue(elementIsDisplayed(accordionActiveTwo));
			implicitWait();
			clickElementUsingJavaScript(accordionTwo);
			visibilityOf(accordionClosed);
			Assert.assertTrue(elementIsDisplayed(accordionClosed));
			System.out.println(getElementText(accordionTwo));
		} else {
			System.out.println("Accordion is not active");
			Assert.assertTrue(false);
		}
	}
	
	public void clickAccordionThree() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(accordionThree);
		if (isElementPresent(accordionThree)) {
			clickElementUsingJavaScript(accordionThree);
			Assert.assertTrue(elementIsDisplayed(accordionActiveThree));
			implicitWait();
			clickElementUsingJavaScript(accordionThree);
			visibilityOf(accordionClosed);
			Assert.assertTrue(elementIsDisplayed(accordionClosed));
			System.out.println(getElementText(accordionThree));
		} else {
			System.out.println("Accordion is not active");
			Assert.assertTrue(false);
		}
	}
	
	public void clickAccordionFour() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(accordionFour);
		if (isElementPresent(accordionFour)) {
			clickElementUsingJavaScript(accordionFour);
			Assert.assertTrue(elementIsDisplayed(accordionActiveFour));
			implicitWait();
			clickElementUsingJavaScript(accordionFour);
			visibilityOf(accordionClosed);
			Assert.assertTrue(elementIsDisplayed(accordionClosed));
			System.out.println(getElementText(accordionFour));
		} else {
			System.out.println("Accordion is not active");
			Assert.assertTrue(false);
		}
	}
	
	public void clickAccordionFive() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(accordionFive);
		if (isElementPresent(accordionFive)) {
			clickElementUsingJavaScript(accordionFive);
			Assert.assertTrue(elementIsDisplayed(accordionActiveFive));
			implicitWait();
			clickElementUsingJavaScript(accordionFive);
			visibilityOf(accordionClosed);
			Assert.assertTrue(elementIsDisplayed(accordionClosed));
			System.out.println(getElementText(accordionFive));
		} else {
			System.out.println("Accordion is not active");
			Assert.assertTrue(false);
		}
	}
	
	public void clickAccordionSix() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(accordionSix);
		if (isElementPresent(accordionSix)) {
			clickElementUsingJavaScript(accordionSix);
			Assert.assertTrue(elementIsDisplayed(accordionActiveSix));
			implicitWait();
			clickElementUsingJavaScript(accordionSix);
			visibilityOf(accordionClosed);
			Assert.assertTrue(elementIsDisplayed(accordionClosed));
			System.out.println(getElementText(accordionSix));
		} else {
			System.out.println("Accordion is not active");
			Assert.assertTrue(false);
		}
	}
	
	public void clickAccordionSeven() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(accordionSeven);
		if (isElementPresent(accordionSeven)) {
			clickElementUsingJavaScript(accordionSeven);
			Assert.assertTrue(elementIsDisplayed(accordionActiveSeven));
			implicitWait();
			clickElementUsingJavaScript(accordionSeven);
			visibilityOf(accordionClosed);
			Assert.assertTrue(elementIsDisplayed(accordionClosed));
			System.out.println(getElementText(accordionSeven));
		} else {
			System.out.println("Accordion is not active");
			Assert.assertTrue(false);
		}
	}
	
	public void clickAccordionEight() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(accordionEight);
		if (isElementPresent(accordionEight)) {
			clickElementUsingJavaScript(accordionEight);
			Assert.assertTrue(elementIsDisplayed(accordionActiveEight));
			implicitWait();
			clickElementUsingJavaScript(accordionEight);
			visibilityOf(accordionClosed);
			Assert.assertTrue(elementIsDisplayed(accordionClosed));
			System.out.println(getElementText(accordionEight));
		} else {
			System.out.println("Accordion is not active");
			Assert.assertTrue(false);
		}
	}
	
	public void clickAccordionEightHyperLink() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(accordionEight);
		clickElementUsingJavaScript(accordionEight);
		elementToBeClickable(accordionEightHyperLink);
		clickElementUsingJavaScript(accordionEightHyperLink);
	}
	
	public void clickHyperLinkTwo() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(hyperLinkTwo);
		clickElementUsingJavaScript(hyperLinkTwo);
	}
	
	public void clickSeeProducts() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(seeProducts);
		clickElementUsingJavaScript(seeProducts);
	}
}
