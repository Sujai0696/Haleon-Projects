package com.qa.biotene.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class BioteneDryMouthProductsPage extends BaseClass{
	
	public BioteneDryMouthProductsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "//div[@class='box component section close-button first odd alpha']//ancestor::div[@class='component-content']//self::div[@style]")
	private static WebElement emailBtn;

	@FindBy(xpath = "//div[@class='box component section cf-popup-form first odd last alpha']")
	private static WebElement emailClose;

	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='Home']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even last is-current ']//ancestor::a[text()='BIOTÈNE® PRODUCTS']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//h3[text()='Dry Mouth Oral Rinse']//following::a[@href='/dry-mouth-products/mouthwash/']//img")
	private static WebElement learnMoreOne;
	
	@FindBy(xpath = "//h3[text()='Dry Mouth Gentle Oral Rinse']//following::a[@href='/dry-mouth-products/gentle-oral-rinse/']//img")
	private static WebElement learnMoreTwo;
	
	@FindBy(xpath = "//h3[text()='Moisturizing Spray']//following::a[@href='/dry-mouth-products/moisturizing-mouth-spray/']//img")
	private static WebElement learnMoreThree;
	
	@FindBy(xpath = "//h3[text()='Fluoride Toothpaste']//following::a[@href='/dry-mouth-products/fresh-mint-toothpaste/']//img")
	private static WebElement learnMoreFour;
	
	@FindBy(xpath = "//h3[text()='Fluoride Toothpaste']//following::a[@href='/dry-mouth-products/gentle-toothpaste/']//img")
	private static WebElement learnMoreFive;
	
	@FindBy(xpath = "//h3[text()='Oralbalance']//following::a[@href='/dry-mouth-products/moisturizing-gel/']//img")
	private static WebElement learnMoreSix;
	
	@FindBy(xpath = "//h3[text()='Dry Mouth Lozenge']//following::a[@href='/dry-mouth-products/lozenges/']//img")
	private static WebElement learnMoreSeven;
	
	
	
	
	
	
	
	
	
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

	public void clickEmailBtn() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(emailBtn)) {
			elementToBeClickable(emailBtn);
			try {
				if (emailBtn.isDisplayed()) {
					clickElementUsingJavaScript(emailBtn);
				}
				implicitWait();
				Assert.assertFalse(elementIsDisplayed(emailClose));
			} catch (Exception e) {
			}
		}else {
			System.out.println("Email Pop-Up is not presented");
			throw new Exception("Unable to click on Email Pop-up");
		}
	}
	
	public void clickBreadcrumbOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbOne)) {
			clickElementUsingJavaScript(breadcrumbOne);
			System.out.println("Breadcrumb one clicked successfully");
		} else {
			System.out.println("Breadcrumb one is not presented in the page");
			throw new Exception("Breadcrumb one is not presented in the page");
		}
	}
	
	public void clickBreadcrumbTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbTwo)) {
			clickElementUsingJavaScript(breadcrumbTwo);
			System.out.println("Breadcrumb Two clicked successfully");
		} else {
			System.out.println("Breadcrumb Two is not presented in the page");
			throw new Exception("Breadcrumb Two is not presented in the page");
		}
	}
	
	public void clickLearnMoreOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(learnMoreOne)) {
			scrollDownUsingElement(learnMoreOne);
			clickElementUsingJavaScript(learnMoreOne);
			System.out.println("Learn More One is clicked successfully");
		} else {
			System.out.println("Learn More One is not presented in page");
			throw new Exception("Learn More One is not presented in page");
		}
	}
	public void clickLearnMoreTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(learnMoreTwo)) {
			scrollDownUsingElement(learnMoreTwo);
			clickElementUsingJavaScript(learnMoreTwo);
			System.out.println("Learn More Two is clicked successfully");
		} else {
			System.out.println("Learn More Two is not presented in page");
			throw new Exception("Learn More Two is not presented in page");
		}
	}
	
	public void clickLearnMoreThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(learnMoreThree)) {
			scrollDownUsingElement(learnMoreThree);
			clickElementUsingJavaScript(learnMoreThree);
			System.out.println("Learn More Three is clicked successfully");
		} else {
			System.out.println("Learn More Three is not presented in page");
			throw new Exception("Learn More Three is not presented in page");
		}
	}
	
	public void clickLearnMoreFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(learnMoreFour)) {
			scrollDownUsingElement(learnMoreFour);
			clickElementUsingJavaScript(learnMoreFour);
			System.out.println("Learn More Four is clicked successfully");
		} else {
			System.out.println("Learn More Four is not presented in page");
			throw new Exception("Learn More Four is not presented in page");
		}
	}
	
	public void clickLearnMoreFive() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(learnMoreFive)) {
			scrollDownUsingElement(learnMoreFive);
			clickElementUsingJavaScript(learnMoreFive);
			System.out.println("Learn More Five is clicked successfully");
		} else {
			System.out.println("Learn More Five is not presented in page");
			throw new Exception("Learn More Five is not presented in page");
		}
	}
	
	public void clickLearnMoreSix() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(learnMoreSix)) {
			scrollDownUsingElement(learnMoreSix);
			clickElementUsingJavaScript(learnMoreSix);
			System.out.println("Learn More Six is clicked successfully");
		} else {
			System.out.println("Learn More Six is not presented in page");
			throw new Exception("Learn More Six is not presented in page");
		}
	}
	
	public void clickLearnMoreSeven() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(learnMoreSeven)) {
			scrollDownUsingElement(learnMoreSeven);
			clickElementUsingJavaScript(learnMoreSeven);
			System.out.println("Learn More Seven is clicked successfully");
		} else {
			System.out.println("Learn More Seven is not presented in page");
			throw new Exception("Learn More Seven is not presented in page");
		}
	}
	
	
	
	

}
