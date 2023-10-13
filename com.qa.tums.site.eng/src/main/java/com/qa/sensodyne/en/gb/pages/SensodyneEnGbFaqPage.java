package com.qa.sensodyne.en.gb.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneEnGbFaqPage extends BaseClass{
	
	public SensodyneEnGbFaqPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Accept All Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='Home']//self::a[@href='/en-gb/']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even last is-current ']//ancestor::a[text()='FAQs']//self::a[@href='/en-gb/faqs/']")
	private static WebElement breadcrumbThree;
	
	
	@FindBy(xpath = "//span[text()='What causes sensitive teeth to hurt?']//ancestor::header[@class='accordion-head']")
	private static WebElement toothSensitivityAccTwo;
	
	@FindBy(xpath = "//span[text()='What causes sensitive teeth to hurt?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement toothSensitivityAccActiveTwo;
	
	@FindBy(xpath = "//span[text()='What causes sensitive teeth to hurt?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement toothSensitivityAccCloseTwo;
	
	@FindBy(xpath = "//span[text()='Are sensitive teeth common?']//ancestor::header[@class='accordion-head']")
	private static WebElement toothSensitivityAccThree;
	
	@FindBy(xpath = "//span[text()='Are sensitive teeth common?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement toothSensitivityAccActiveThree;
	
	@FindBy(xpath = "//span[text()='Are sensitive teeth common?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement toothSensitivityAccCloseThree;
	
	@FindBy(xpath = "//span[text()='Can overbrushing cause sensitive teeth?']//ancestor::header[@class='accordion-head']")
	private static WebElement toothSensitivityAccFour;
	
	@FindBy(xpath = "//span[text()='Can overbrushing cause sensitive teeth?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement toothSensitivityAccActiveFour;
	
	@FindBy(xpath = "//span[text()='Can overbrushing cause sensitive teeth?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement toothSensitivityAccCloseFour;
	
	@FindBy(xpath = "//span[text()='Are sensitive teeth a sign of a more serious dental problem?']//ancestor::header[@class='accordion-head']")
	private static WebElement toothSensitivityAccFive;
	
	@FindBy(xpath = "//span[text()='Are sensitive teeth a sign of a more serious dental problem?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement toothSensitivityAccActiveFive;
	
	@FindBy(xpath = "//span[text()='Are sensitive teeth a sign of a more serious dental problem?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement toothSensitivityAccCloseFive;
	
	@FindBy(xpath = "//span[text()='What can I do to help my sensitive teeth?']//ancestor::header[@class='accordion-head']")
	private static WebElement toothSensitivityAccSix;
	
	@FindBy(xpath = "//span[text()='What can I do to help my sensitive teeth?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement toothSensitivityAccActiveSix;
	
	@FindBy(xpath = "//span[text()='What can I do to help my sensitive teeth?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement toothSensitivityAccCloseSix;
	
	@FindBy(xpath = "//span[text()='What is the No.1 dentist recommended toothpaste for sensitive teeth?']//ancestor::header[@class='accordion-head']")
	private static WebElement toothSensitivityAccSeven;
	
	@FindBy(xpath = "//span[text()='What is the No.1 dentist recommended toothpaste for sensitive teeth?']//ancestor::li[@class='accordion-slide last odd is-active']")
	private static WebElement toothSensitivityAccActiveSeven;
	
	@FindBy(xpath = "//span[text()='What is the No.1 dentist recommended toothpaste for sensitive teeth?']//ancestor::li[@class='accordion-slide last odd']")
	private static WebElement toothSensitivityAccCloseSeven;
	
	
	@FindBy(xpath = "//span[text()='How often should I use Sensodyne toothpaste?']//ancestor::header[@class='accordion-head']")
	private static WebElement howSensodyneWorksAccTwo;
	
	@FindBy(xpath = "//span[text()='How often should I use Sensodyne toothpaste?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement howSensodyneWorksAccActiveTwo;
	
	@FindBy(xpath = "//span[text()='How often should I use Sensodyne toothpaste?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement howSensodyneWorksAccCloseTwo;
	
	@FindBy(xpath = "//span[text()='Will my teeth become sensitive again if I stop using Sensodyne?']//ancestor::header[@class='accordion-head']")
	private static WebElement howSensodyneWorksAccThree;
	
	@FindBy(xpath = "//span[text()='Will my teeth become sensitive again if I stop using Sensodyne?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement howSensodyneWorksAccActiveThree;
	
	@FindBy(xpath = "//span[text()='Will my teeth become sensitive again if I stop using Sensodyne?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement howSensodyneWorksAccCloseThree;
	
	@FindBy(xpath = "//span[text()='Does Sensodyne toothpaste help prevent cavities?']//ancestor::header[@class='accordion-head']")
	private static WebElement howSensodyneWorksAccFour;
	
	@FindBy(xpath = "//span[text()='Does Sensodyne toothpaste help prevent cavities?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement howSensodyneWorksAccActiveFour;
	
	@FindBy(xpath = "//span[text()='Does Sensodyne toothpaste help prevent cavities?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement howSensodyneWorksAccCloseFour;
	
	@FindBy(xpath = "//span[text()='Can I use Sensodyne toothpaste every day?']//ancestor::header[@class='accordion-head']")
	private static WebElement howSensodyneWorksAccFive;
	
	@FindBy(xpath = "//span[text()='Can I use Sensodyne toothpaste every day?']//ancestor::li[@class='accordion-slide last odd is-active']")
	private static WebElement howSensodyneWorksAccActiveFive;
	
	@FindBy(xpath = "//span[text()='Can I use Sensodyne toothpaste every day?']//ancestor::li[@class='accordion-slide last odd']")
	private static WebElement howSensodyneWorksAccCloseFive;
	
	
	
	@FindBy(xpath = "//span[text()='Does Sensodyne toothpaste have fluoride?']//ancestor::header[@class='accordion-head']")
	private static WebElement sensodyneIngredientsAccTwo;
	
	@FindBy(xpath = "//span[text()='Does Sensodyne toothpaste have fluoride?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement sensodyneIngredientsAccActiveTwo;
	
	@FindBy(xpath = "//span[text()='Does Sensodyne toothpaste have fluoride?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement sensodyneIngredientsAccCloseTwo;
	
	@FindBy(xpath = "//span[text()='What is stannous fluoride and how is it used in Sensodyne toothpaste?']//ancestor::header[@class='accordion-head']")
	private static WebElement sensodyneIngredientsAccThree;
	
	@FindBy(xpath = "//span[text()='What is stannous fluoride and how is it used in Sensodyne toothpaste?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement sensodyneIngredientsAccActiveThree;
	
	@FindBy(xpath = "//span[text()='What is stannous fluoride and how is it used in Sensodyne toothpaste?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement sensodyneIngredientsAccCloseThree;
	
	@FindBy(xpath = "//span[text()='What is potassium nitrate and how is it used in Sensodyne toothpaste?']//ancestor::header[@class='accordion-head']")
	private static WebElement sensodyneIngredientsAccFour;
	
	@FindBy(xpath = "//span[text()='What is potassium nitrate and how is it used in Sensodyne toothpaste?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement sensodyneIngredientsAccActiveFour;
	
	@FindBy(xpath = "//span[text()='What is potassium nitrate and how is it used in Sensodyne toothpaste?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement sensodyneIngredientsAccCloseFour;
	
	@FindBy(xpath = "//span[text()='Does Sensodyne toothpaste contain triclosan?']//ancestor::header[@class='accordion-head']")
	private static WebElement sensodyneIngredientsAccFive;
	
	@FindBy(xpath = "//span[text()='Does Sensodyne toothpaste contain triclosan?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement sensodyneIngredientsAccActiveFive;
	
	@FindBy(xpath = "//span[text()='Does Sensodyne toothpaste contain triclosan?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement sensodyneIngredientsAccCloseFive;
	
	@FindBy(xpath = "//span[text()='Is Sensodyne toothpaste gluten free?']//ancestor::header[@class='accordion-head']")
	private static WebElement sensodyneIngredientsAccSix;
	
	@FindBy(xpath = "//span[text()='Is Sensodyne toothpaste gluten free?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement sensodyneIngredientsAccActiveSix;
	
	@FindBy(xpath = "//span[text()='Is Sensodyne toothpaste gluten free?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement sensodyneIngredientsAccCloseSix;
	
	@FindBy(xpath = "//span[text()='Are Sensodyne toothpastes kosher?']//ancestor::header[@class='accordion-head']")
	private static WebElement sensodyneIngredientsAccSeven;
	
	@FindBy(xpath = "//span[text()='Are Sensodyne toothpastes kosher?']//ancestor::li[@class='accordion-slide last odd is-active']")
	private static WebElement sensodyneIngredientsAccActiveSeven;
	
	@FindBy(xpath = "//span[text()='Are Sensodyne toothpastes kosher?']//ancestor::li[@class='accordion-slide last odd']")
	private static WebElement sensodyneIngredientsAccCloseSeven;
	
	
	@FindBy(xpath = "//span[text()='How does Sensodyne Rapid Relief toothpaste work?']//ancestor::header[@class='accordion-head']")
	private static WebElement sensodyneProductsAccTwo;
	
	@FindBy(xpath = "//span[text()='How does Sensodyne Rapid Relief toothpaste work?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement sensodyneProductsAccActiveTwo;
	
	@FindBy(xpath = "//span[text()='How does Sensodyne Rapid Relief toothpaste work?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement sensodyneProductsAccCloseTwo;
	
	@FindBy(xpath = "//span[text()='Is Sensodyne Rapid Relief toothpaste right for me?']//ancestor::header[@class='accordion-head']")
	private static WebElement sensodyneProductsAccThree;
	
	@FindBy(xpath = "//span[text()='Is Sensodyne Rapid Relief toothpaste right for me?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement sensodyneProductsAccActiveThree;
	
	@FindBy(xpath = "//span[text()='Is Sensodyne Rapid Relief toothpaste right for me?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement sensodyneProductsAccCloseThree;
	
	@FindBy(xpath = "//span[text()='How often should I use Sensodyne Rapid Relief toothpaste?']//ancestor::header[@class='accordion-head']")
	private static WebElement sensodyneProductsAccFour;
	
	@FindBy(xpath = "//span[text()='How often should I use Sensodyne Rapid Relief toothpaste?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement sensodyneProductsAccActiveFour;
	
	@FindBy(xpath = "//span[text()='How often should I use Sensodyne Rapid Relief toothpaste?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement sensodyneProductsAccCloseFour;
	
	@FindBy(xpath = "//span[text()='Is Sensodyne an abrasive toothpaste?']//ancestor::header[@class='accordion-head']")
	private static WebElement sensodyneProductsAccFive;
	
	@FindBy(xpath = "//span[text()='Is Sensodyne an abrasive toothpaste?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement sensodyneProductsAccActiveFive;
	
	@FindBy(xpath = "//span[text()='Is Sensodyne an abrasive toothpaste?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement sensodyneProductsAccCloseFive;
	
	@FindBy(xpath = "//span[text()='Is Sensodyne toothpaste available in a travel-sized tube?']//ancestor::header[@class='accordion-head']")
	private static WebElement sensodyneProductsAccSix;
	
	@FindBy(xpath = "//span[text()='Is Sensodyne toothpaste available in a travel-sized tube?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement sensodyneProductsAccActiveSix;
	
	@FindBy(xpath = "//span[text()='Is Sensodyne toothpaste available in a travel-sized tube?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement sensodyneProductsAccCloseSix;
	
	@FindBy(xpath = "//span[text()='Can kids use Sensodyne toothpaste?']//ancestor::header[@class='accordion-head']")
	private static WebElement sensodyneProductsAccSeven;
	
	@FindBy(xpath = "//span[text()='Can kids use Sensodyne toothpaste?']//ancestor::li[@class='accordion-slide last odd is-active']")
	private static WebElement sensodyneProductsAccActiveSeven;
	
	@FindBy(xpath = "//span[text()='Can kids use Sensodyne toothpaste?']//ancestor::li[@class='accordion-slide odd even']")
	private static WebElement sensodyneProductsAccCloseSeven;
	
	
	
	
	
	
	
	
	
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
	
	public void clickBreadcrumbOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbOne)) {
			scrollDownUsingElement(breadcrumbOne);
			clickElementUsingJavaScript(breadcrumbOne);
			pageLoad();
			System.out.println("Breadcrumb One clicked successfully");
		} else {
			System.out.println("Breadcrumb One is not presented in the page");
			throw new Exception("Breadcrumb One is not presented in the page");
		}
	}


	public void clickBreadcrumbThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbThree)) {
			scrollDownUsingElement(breadcrumbThree);
//			String href = breadcrumbThree.getAttribute("href");
//	        boolean hasValidUrl = href != null && !href.isEmpty();
//	        Assert.assertFalse(hasValidUrl);
			clickElementUsingJavaScript(breadcrumbThree);
			pageLoad();
			System.out.println("Breadcrumb Three verified successfully");
		} else {
			System.out.println("Breadcrumb Three is not presented in the page");
			throw new Exception("Breadcrumb Three is not presented in the page");
		}
	}
	
	public void clickToothSensitivityAccTwo() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(toothSensitivityAccTwo)) {
			scrollDownUsingElement(toothSensitivityAccTwo);
			clickElementUsingJavaScript(toothSensitivityAccTwo);
			visibilityOf(toothSensitivityAccActiveTwo);
			Assert.assertTrue(elementIsDisplayed(toothSensitivityAccActiveTwo));
			clickElementUsingJavaScript(toothSensitivityAccTwo);
			visibilityOf(toothSensitivityAccCloseTwo);
			Assert.assertTrue(elementIsDisplayed(toothSensitivityAccCloseTwo));
			System.out.println("toothSensitivity Accordion two verfied Successfully");
		} else {
			System.out.println("toothSensitivity Accordion two is not presented in the page");
			throw new Exception("toothSensitivity Accordion two is not presented in the page");
		}
	}
	
	public void clickToothSensitivityAccThree() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(toothSensitivityAccThree)) {
			scrollDownUsingElement(toothSensitivityAccThree);
			clickElementUsingJavaScript(toothSensitivityAccThree);
			visibilityOf(toothSensitivityAccActiveThree);
			Assert.assertTrue(elementIsDisplayed(toothSensitivityAccActiveThree));
			clickElementUsingJavaScript(toothSensitivityAccThree);
			visibilityOf(toothSensitivityAccCloseThree);
			Assert.assertTrue(elementIsDisplayed(toothSensitivityAccCloseThree));
			System.out.println("toothSensitivity Accordion Three verfied Successfully");
		} else {
			System.out.println("toothSensitivity Accordion Three is not presented in the page");
			throw new Exception("toothSensitivity Accordion Three is not presented in the page");
		}
	}
	
	public void clickToothSensitivityAccFour() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(toothSensitivityAccFour)) {
			scrollDownUsingElement(toothSensitivityAccFour);
			clickElementUsingJavaScript(toothSensitivityAccFour);
			visibilityOf(toothSensitivityAccActiveFour);
			Assert.assertTrue(elementIsDisplayed(toothSensitivityAccActiveFour));
			clickElementUsingJavaScript(toothSensitivityAccFour);
			visibilityOf(toothSensitivityAccCloseFour);
			Assert.assertTrue(elementIsDisplayed(toothSensitivityAccCloseFour));
			System.out.println("toothSensitivity Accordion Four verfied Successfully");
		} else {
			System.out.println("toothSensitivity Accordion Four is not presented in the page");
			throw new Exception("toothSensitivity Accordion Four is not presented in the page");
		}
	}
	
	public void clickToothSensitivityAccFive() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(toothSensitivityAccFive)) {
			scrollDownUsingElement(toothSensitivityAccFive);
			clickElementUsingJavaScript(toothSensitivityAccFive);
			visibilityOf(toothSensitivityAccActiveFive);
			Assert.assertTrue(elementIsDisplayed(toothSensitivityAccActiveFive));
			clickElementUsingJavaScript(toothSensitivityAccFive);
			visibilityOf(toothSensitivityAccCloseFive);
			Assert.assertTrue(elementIsDisplayed(toothSensitivityAccCloseFive));
			System.out.println("toothSensitivity Accordion Five verfied Successfully");
		} else {
			System.out.println("toothSensitivity Accordion Five is not presented in the page");
			throw new Exception("toothSensitivity Accordion Five is not presented in the page");
		}
	}
	
	public void clickToothSensitivityAccSix() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(toothSensitivityAccSix)) {
			scrollDownUsingElement(toothSensitivityAccSix);
			clickElementUsingJavaScript(toothSensitivityAccSix);
			visibilityOf(toothSensitivityAccActiveSix);
			Assert.assertTrue(elementIsDisplayed(toothSensitivityAccActiveSix));
			clickElementUsingJavaScript(toothSensitivityAccSix);
			visibilityOf(toothSensitivityAccCloseSix);
			Assert.assertTrue(elementIsDisplayed(toothSensitivityAccCloseSix));
			System.out.println("toothSensitivity Accordion Six verfied Successfully");
		} else {
			System.out.println("toothSensitivity Accordion Six is not presented in the page");
			throw new Exception("toothSensitivity Accordion Six is not presented in the page");
		}
	}
	
	public void clickToothSensitivityAccSeven() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(toothSensitivityAccSeven)) {
			scrollDownUsingElement(toothSensitivityAccSeven);
			clickElementUsingJavaScript(toothSensitivityAccSeven);
			visibilityOf(toothSensitivityAccActiveSeven);
			Assert.assertTrue(elementIsDisplayed(toothSensitivityAccActiveSeven));
			clickElementUsingJavaScript(toothSensitivityAccSeven);
			visibilityOf(toothSensitivityAccCloseSeven);
			Assert.assertTrue(elementIsDisplayed(toothSensitivityAccCloseSeven));
			System.out.println("toothSensitivity Accordion Seven verfied Successfully");
		} else {
			System.out.println("toothSensitivity Accordion Seven is not presented in the page");
			throw new Exception("toothSensitivity Accordion Seven is not presented in the page");
		}
	}
	
	public void clickHowSensodyneWorksAccTwo() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(howSensodyneWorksAccTwo)) {
			scrollDownUsingElement(howSensodyneWorksAccTwo);
			clickElementUsingJavaScript(howSensodyneWorksAccTwo);
			visibilityOf(howSensodyneWorksAccActiveTwo);
			Assert.assertTrue(elementIsDisplayed(howSensodyneWorksAccActiveTwo));
			clickElementUsingJavaScript(howSensodyneWorksAccTwo);
			visibilityOf(howSensodyneWorksAccCloseTwo);
			Assert.assertTrue(elementIsDisplayed(howSensodyneWorksAccCloseTwo));
			System.out.println("howSensodyneWorks Accordion Two verfied Successfully");
		} else {
			System.out.println("howSensodyneWorks Accordion Two is not presented in the page");
			throw new Exception("howSensodyneWorks Accordion Two is not presented in the page");
		}
	}
	
	public void clickHowSensodyneWorksAccThree() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(howSensodyneWorksAccThree)) {
			scrollDownUsingElement(howSensodyneWorksAccThree);
			clickElementUsingJavaScript(howSensodyneWorksAccThree);
			visibilityOf(howSensodyneWorksAccActiveThree);
			Assert.assertTrue(elementIsDisplayed(howSensodyneWorksAccActiveThree));
			clickElementUsingJavaScript(howSensodyneWorksAccThree);
			visibilityOf(howSensodyneWorksAccCloseThree);
			Assert.assertTrue(elementIsDisplayed(howSensodyneWorksAccCloseThree));
			System.out.println("howSensodyneWorks Accordion Three verfied Successfully");
		} else {
			System.out.println("howSensodyneWorks Accordion Three is not presented in the page");
			throw new Exception("howSensodyneWorks Accordion Three is not presented in the page");
		}
	}
	
	public void clickHowSensodyneWorksAccFour() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(howSensodyneWorksAccFour)) {
			scrollDownUsingElement(howSensodyneWorksAccFour);
			clickElementUsingJavaScript(howSensodyneWorksAccFour);
			visibilityOf(howSensodyneWorksAccActiveFour);
			Assert.assertTrue(elementIsDisplayed(howSensodyneWorksAccActiveFour));
			clickElementUsingJavaScript(howSensodyneWorksAccFour);
			visibilityOf(howSensodyneWorksAccCloseFour);
			Assert.assertTrue(elementIsDisplayed(howSensodyneWorksAccCloseFour));
			System.out.println("howSensodyneWorks Accordion Four verfied Successfully");
		} else {
			System.out.println("howSensodyneWorks Accordion Four is not presented in the page");
			throw new Exception("howSensodyneWorks Accordion Four is not presented in the page");
		}
	}
	
	public void clickHowSensodyneWorksAccFive() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(howSensodyneWorksAccFive)) {
			scrollDownUsingElement(howSensodyneWorksAccFive);
			clickElementUsingJavaScript(howSensodyneWorksAccFive);
			visibilityOf(howSensodyneWorksAccActiveFive);
			Assert.assertTrue(elementIsDisplayed(howSensodyneWorksAccActiveFive));
			clickElementUsingJavaScript(howSensodyneWorksAccFive);
			visibilityOf(howSensodyneWorksAccCloseFive);
			Assert.assertTrue(elementIsDisplayed(howSensodyneWorksAccCloseFive));
			System.out.println("howSensodyneWorks Accordion Five verfied Successfully");
		} else {
			System.out.println("howSensodyneWorks Accordion Five is not presented in the page");
			throw new Exception("howSensodyneWorks Accordion Five is not presented in the page");
		}
	}
	
	
	public void clickSensodyneIngredientsAccTwo() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(sensodyneIngredientsAccTwo)) {
			scrollDownUsingElement(sensodyneIngredientsAccTwo);
			clickElementUsingJavaScript(sensodyneIngredientsAccTwo);
			visibilityOf(sensodyneIngredientsAccActiveTwo);
			Assert.assertTrue(elementIsDisplayed(sensodyneIngredientsAccActiveTwo));
			clickElementUsingJavaScript(sensodyneIngredientsAccTwo);
			visibilityOf(sensodyneIngredientsAccCloseTwo);
			Assert.assertTrue(elementIsDisplayed(sensodyneIngredientsAccCloseTwo));
			System.out.println("sensodyneIngredients Accordion Two verfied Successfully");
		} else {
			System.out.println("sensodyneIngredients Accordion Two is not presented in the page");
			throw new Exception("sensodyneIngredients Accordion Two is not presented in the page");
		}
	}
	
	public void clickSensodyneIngredientsAccThree() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(sensodyneIngredientsAccThree)) {
			scrollDownUsingElement(sensodyneIngredientsAccThree);
			clickElementUsingJavaScript(sensodyneIngredientsAccThree);
			visibilityOf(sensodyneIngredientsAccActiveThree);
			Assert.assertTrue(elementIsDisplayed(sensodyneIngredientsAccActiveThree));
			clickElementUsingJavaScript(sensodyneIngredientsAccThree);
			visibilityOf(sensodyneIngredientsAccCloseThree);
			Assert.assertTrue(elementIsDisplayed(sensodyneIngredientsAccCloseThree));
			System.out.println("sensodyneIngredients Accordion Three verfied Successfully");
		} else {
			System.out.println("sensodyneIngredients Accordion Three is not presented in the page");
			throw new Exception("sensodyneIngredients Accordion Three is not presented in the page");
		}
	}
	
	public void clickSensodyneIngredientsAccFour() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(sensodyneIngredientsAccFour)) {
			scrollDownUsingElement(sensodyneIngredientsAccFour);
			clickElementUsingJavaScript(sensodyneIngredientsAccFour);
			visibilityOf(sensodyneIngredientsAccActiveFour);
			Assert.assertTrue(elementIsDisplayed(sensodyneIngredientsAccActiveFour));
			clickElementUsingJavaScript(sensodyneIngredientsAccFour);
			visibilityOf(sensodyneIngredientsAccCloseFour);
			Assert.assertTrue(elementIsDisplayed(sensodyneIngredientsAccCloseFour));
			System.out.println("sensodyneIngredients Accordion Four verfied Successfully");
		} else {
			System.out.println("sensodyneIngredients Accordion Four is not presented in the page");
			throw new Exception("sensodyneIngredients Accordion Four is not presented in the page");
		}
	}
	
	public void clickSensodyneIngredientsAccFive() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(sensodyneIngredientsAccFive)) {
			scrollDownUsingElement(sensodyneIngredientsAccFive);
			clickElementUsingJavaScript(sensodyneIngredientsAccFive);
			visibilityOf(sensodyneIngredientsAccActiveFive);
			Assert.assertTrue(elementIsDisplayed(sensodyneIngredientsAccActiveFive));
			clickElementUsingJavaScript(sensodyneIngredientsAccFive);
			visibilityOf(sensodyneIngredientsAccCloseFive);
			Assert.assertTrue(elementIsDisplayed(sensodyneIngredientsAccCloseFive));
			System.out.println("sensodyneIngredients Accordion Five verfied Successfully");
		} else {
			System.out.println("sensodyneIngredients Accordion Five is not presented in the page");
			throw new Exception("sensodyneIngredients Accordion Five is not presented in the page");
		}
	}
	
	public void clickSensodyneIngredientsAccSix() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(sensodyneIngredientsAccSix)) {
			scrollDownUsingElement(sensodyneIngredientsAccSix);
			clickElementUsingJavaScript(sensodyneIngredientsAccSix);
			visibilityOf(sensodyneIngredientsAccActiveSix);
			Assert.assertTrue(elementIsDisplayed(sensodyneIngredientsAccActiveSix));
			clickElementUsingJavaScript(sensodyneIngredientsAccSix);
			visibilityOf(sensodyneIngredientsAccCloseSix);
			Assert.assertTrue(elementIsDisplayed(sensodyneIngredientsAccCloseSix));
			System.out.println("sensodyneIngredients Accordion Six verfied Successfully");
		} else {
			System.out.println("sensodyneIngredients Accordion Six is not presented in the page");
			throw new Exception("sensodyneIngredients Accordion Six is not presented in the page");
		}
	}
	
	public void clickSensodyneIngredientsAccSeven() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(sensodyneIngredientsAccSeven)) {
			scrollDownUsingElement(sensodyneIngredientsAccSeven);
			clickElementUsingJavaScript(sensodyneIngredientsAccSeven);
			visibilityOf(sensodyneIngredientsAccActiveSeven);
			Assert.assertTrue(elementIsDisplayed(sensodyneIngredientsAccActiveSeven));
			clickElementUsingJavaScript(sensodyneIngredientsAccSeven);
			visibilityOf(sensodyneIngredientsAccCloseSeven);
			Assert.assertTrue(elementIsDisplayed(sensodyneIngredientsAccCloseSeven));
			System.out.println("sensodyneIngredients Accordion Seven verfied Successfully");
		} else {
			System.out.println("sensodyneIngredients Accordion Seven is not presented in the page");
			throw new Exception("sensodyneIngredients Accordion Seven is not presented in the page");
		}
	}
	
	public void clickSensodyneProductsAccTwo() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(sensodyneProductsAccTwo)) {
			scrollDownUsingElement(sensodyneProductsAccTwo);
			clickElementUsingJavaScript(sensodyneProductsAccTwo);
			visibilityOf(sensodyneProductsAccActiveTwo);
			Assert.assertTrue(elementIsDisplayed(sensodyneProductsAccActiveTwo));
			clickElementUsingJavaScript(sensodyneProductsAccTwo);
			visibilityOf(sensodyneProductsAccCloseTwo);
			Assert.assertTrue(elementIsDisplayed(sensodyneProductsAccCloseTwo));
			System.out.println("sensodyneProducts Accordion Two verfied Successfully");
		} else {
			System.out.println("sensodyneProducts Accordion Two is not presented in the page");
			throw new Exception("sensodyneProducts Accordion Two is not presented in the page");
		}
	}
	
	public void clickSensodyneProductsAccThree() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(sensodyneProductsAccThree)) {
			scrollDownUsingElement(sensodyneProductsAccThree);
			clickElementUsingJavaScript(sensodyneProductsAccThree);
			visibilityOf(sensodyneProductsAccActiveThree);
			Assert.assertTrue(elementIsDisplayed(sensodyneProductsAccActiveThree));
			clickElementUsingJavaScript(sensodyneProductsAccThree);
			visibilityOf(sensodyneProductsAccCloseThree);
			Assert.assertTrue(elementIsDisplayed(sensodyneProductsAccCloseThree));
			System.out.println("sensodyneProducts Accordion Three verfied Successfully");
		} else {
			System.out.println("sensodyneProducts Accordion Three is not presented in the page");
			throw new Exception("sensodyneProducts Accordion Three is not presented in the page");
		}
	}
	
	public void clickSensodyneProductsAccFour() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(sensodyneProductsAccFour)) {
			scrollDownUsingElement(sensodyneProductsAccFour);
			clickElementUsingJavaScript(sensodyneProductsAccFour);
			visibilityOf(sensodyneProductsAccActiveFour);
			Assert.assertTrue(elementIsDisplayed(sensodyneProductsAccActiveFour));
			clickElementUsingJavaScript(sensodyneProductsAccFour);
			visibilityOf(sensodyneProductsAccCloseFour);
			Assert.assertTrue(elementIsDisplayed(sensodyneProductsAccCloseFour));
			System.out.println("sensodyneProducts Accordion Four verfied Successfully");
		} else {
			System.out.println("sensodyneProducts Accordion Four is not presented in the page");
			throw new Exception("sensodyneProducts Accordion Four is not presented in the page");
		}
	}
	
	public void clickSensodyneProductsAccFive() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(sensodyneProductsAccFive)) {
			scrollDownUsingElement(sensodyneProductsAccFive);
			clickElementUsingJavaScript(sensodyneProductsAccFive);
			visibilityOf(sensodyneProductsAccActiveFive);
			Assert.assertTrue(elementIsDisplayed(sensodyneProductsAccActiveFive));
			clickElementUsingJavaScript(sensodyneProductsAccFive);
			visibilityOf(sensodyneProductsAccCloseFive);
			Assert.assertTrue(elementIsDisplayed(sensodyneProductsAccCloseFive));
			System.out.println("sensodyneProducts Accordion Five verfied Successfully");
		} else {
			System.out.println("sensodyneProducts Accordion Five is not presented in the page");
			throw new Exception("sensodyneProducts Accordion Five is not presented in the page");
		}
	}
	
	public void clickSensodyneProductsAccSix() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(sensodyneProductsAccSix)) {
			scrollDownUsingElement(sensodyneProductsAccSix);
			clickElementUsingJavaScript(sensodyneProductsAccSix);
			visibilityOf(sensodyneProductsAccActiveSix);
			Assert.assertTrue(elementIsDisplayed(sensodyneProductsAccActiveSix));
			clickElementUsingJavaScript(sensodyneProductsAccSix);
			visibilityOf(sensodyneProductsAccCloseSix);
			Assert.assertTrue(elementIsDisplayed(sensodyneProductsAccCloseSix));
			System.out.println("sensodyneProducts Accordion Six verfied Successfully");
		} else {
			System.out.println("sensodyneProducts Accordion Six is not presented in the page");
			throw new Exception("sensodyneProducts Accordion Six is not presented in the page");
		}
	}
	
	public void clickSensodyneProductsAccSeven() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(sensodyneProductsAccSeven)) {
			scrollDownUsingElement(sensodyneProductsAccSeven);
			clickElementUsingJavaScript(sensodyneProductsAccSeven);
			visibilityOf(sensodyneProductsAccActiveSeven);
			Assert.assertTrue(elementIsDisplayed(sensodyneProductsAccActiveSeven));
			clickElementUsingJavaScript(sensodyneProductsAccSeven);
			visibilityOf(sensodyneProductsAccCloseSeven);
			Assert.assertTrue(elementIsDisplayed(sensodyneProductsAccCloseSeven));
			System.out.println("sensodyneProducts Accordion Seven verfied Successfully");
		} else {
			System.out.println("sensodyneProducts Accordion Seven is not presented in the page");
			throw new Exception("sensodyneProducts Accordion Seven is not presented in the page");
		}
	}
	
	
	
	
	
	
	
	
	
}
