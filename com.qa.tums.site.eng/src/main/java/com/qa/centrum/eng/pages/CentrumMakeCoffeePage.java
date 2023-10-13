package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CentrumMakeCoffeePage extends BaseClass{
	
	public CentrumMakeCoffeePage() {
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage gigya-heading first odd component col-xs-12']")
	private static WebElement gigyaForm;

	@FindBy(xpath = "//div[contains(@class,'content_hide')]")
	private static WebElement gigyaClose;
	
	@FindBy(xpath = "//a[text()='Expert Corner']")
	private static WebElement frenchPressLinkOne;
	
	@FindBy(xpath = "//a[text()='nutrition']")
	private static WebElement frenchPressLinkTwo;
	
	@FindBy(xpath = "//a[text()='wellness']")
	private static WebElement frenchPressLinkThree;
	
	@FindBy(xpath = "//strong[text()='5 Things to Do When Not Feeling Well and Bored']")
	private static WebElement articleOne;
	
	@FindBy(xpath = "//strong[text()='Tips for Working From Home With Kids']")
	private static WebElement articleTwo;
	
	@FindBy(xpath = "//strong[text()='5 Healthy Homemade Lunch Ideas for Adults']")
	private static WebElement articleThree;
	
	@FindBy(xpath = "//strong[text()='Establishing a Self-Care Routine']")
	private static WebElement articleFour;
	
	@FindBy(xpath = "//a[text()='home']//ancestor::li[@class='breadcrumb-list-item odd first ']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//a[text()='Learn']//ancestor::li[@class='breadcrumb-list-item even ']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//a[text()='All Articles']//ancestor::li[@class='breadcrumb-list-item odd ']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "//a[text()='Health & Lifestyle Tips']//ancestor::li[@class='breadcrumb-list-item even ']")
	private static WebElement breadcrumbFour;
	
	@FindBy(xpath = "//a[text()='How to Make Coffee at Home']//ancestor::li[@class='breadcrumb-list-item odd last is-current ']")
	private static WebElement breadcrumbFive;
	
	
	public void clickCookieBtn() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(cookieBtn)) {
			elementToBeClickable(cookieBtn);
			try {
				if (cookieBtn.isDisplayed()) {
					elementClick(cookieBtn);
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
	
	public void clickFrenchPressOne() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(frenchPressLinkOne);
		clickElementUsingJavaScript(frenchPressLinkOne);
	}
	
	public void clickFrenchPressTwo() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(frenchPressLinkTwo);
		clickElementUsingJavaScript(frenchPressLinkTwo);
	}
	
	public void clickFrenchPressThree() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(frenchPressLinkThree);
		clickElementUsingJavaScript(frenchPressLinkThree);
	}
	
	public void clickArticleOne() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(articleOne);
		clickElementUsingJavaScript(articleOne);
	}
	
	public void clickArticleTwo() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(articleTwo);
		clickElementUsingJavaScript(articleTwo);
	}
	
	public void clickArticleThree() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(articleThree);
		clickElementUsingJavaScript(articleThree);
	}
	
	public void clickArticleFour() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(articleFour);
		clickElementUsingJavaScript(articleFour);
	}
	
	public void clickBreadcrumbOne() throws Exception{
		waitForPageLoadJava();
		visibilityOf(breadcrumbOne);
		clickElementUsingJavaScript(breadcrumbOne);
	}
	
	public void clickBreadcrumbTwo() throws Exception{
		waitForPageLoadJava();
		visibilityOf(breadcrumbTwo);
		clickElementUsingJavaScript(breadcrumbTwo);
	}
	
	public void clickBreadcrumbThree() throws Exception{
		waitForPageLoadJava();
		visibilityOf(breadcrumbThree);
		clickElementUsingJavaScript(breadcrumbThree);
	}
	
	public void clickBreadcrumbFour() throws Exception{
		waitForPageLoadJava();
		visibilityOf(breadcrumbFour);
		clickElementUsingJavaScript(breadcrumbFour);
	}
	
	public void clickBreadcrumbFive() throws Exception{
		waitForPageLoadJava();
		visibilityOf(breadcrumbFive);
		clickElementUsingJavaScript(breadcrumbFive);
	}
	
}
