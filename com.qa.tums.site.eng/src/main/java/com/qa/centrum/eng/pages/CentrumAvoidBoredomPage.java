package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CentrumAvoidBoredomPage extends BaseClass{

	public CentrumAvoidBoredomPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "//h2[@class='heading']")
	private static WebElement gigyaForm;

	@FindBy(xpath = "//div[contains(@class,'content_hide')]")
	private static WebElement gigyaClose;
	
	@FindBy(xpath = "//a[text()='food and nutrition']")
	private static WebElement getCraftyLinkOne;
	
	@FindBy(xpath = "//a[text()='immune support']")
	private static WebElement getCraftyLinkTwo;
	
	@FindBy(xpath = "//u[text()='stress management']")
	private static WebElement getCraftyLinkThree;
	
	@FindBy(xpath = "//a[text()='Learning Center']")
	private static WebElement getCraftyLinkFour;
	
	@FindBy(xpath = "//strong[text()='Establishing a Self-Care Routine']")
	private static WebElement articleOne;
	
	@FindBy(xpath = "//strong[text()='5 Healthy Homemade Lunch Ideas for Adults']")
	private static WebElement articleTwo;
	
	@FindBy(xpath = "//strong[text()='The ABCs of Vitamin D']")
	private static WebElement articleThree;
	
	@FindBy(xpath = "//strong[text()='How to Take Vitamins and When You Should Take Them']")
	private static WebElement articleFour;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='home']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Learn']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd ']//ancestor::a[text()='All Articles']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Health & Lifestyle Tips']")
	private static WebElement breadcrumbFour;

	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']//ancestor::a[text()='How to Avoid Boredom When You’re Sick']")
	private static WebElement breadcrumbFive;
	
	
	public void clickCookieBtn() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(cookieBtn)) {
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
			try {
				if (gigyaForm.isDisplayed()) {
					clickElementUsingJavaScript(gigyaForm);
				}
				implicitWait();
				Assert.assertTrue(elementIsDisplayed(gigyaClose));
			} catch (Exception e) {
			}
		} else {
			System.out.println("gigya is not presented");
		}
	}
	
	public void clickGetCraftyLinkOne() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(getCraftyLinkOne);
		clickElementUsingJavaScript(getCraftyLinkOne);
	}
	
	public void clickGetCraftyLinkTwo() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(getCraftyLinkTwo);
		clickElementUsingJavaScript(getCraftyLinkTwo);
	}
	
	public void clickGetCraftyLinkThree() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(getCraftyLinkThree);
		clickElementUsingJavaScript(getCraftyLinkThree);
	}
	
	public void clickGetCraftyLinkFour() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(getCraftyLinkFour);
		clickElementUsingJavaScript(getCraftyLinkFour);
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
