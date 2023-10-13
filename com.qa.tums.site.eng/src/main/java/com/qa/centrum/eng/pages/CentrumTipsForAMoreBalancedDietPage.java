package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CentrumTipsForAMoreBalancedDietPage extends BaseClass{
	
	public CentrumTipsForAMoreBalancedDietPage() {
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
	
	@FindBy(xpath = "//h2[text()='4. Avoid Cigarettes']")
	private static WebElement scrollToOverAllHealth;
	
	@FindBy(xpath = "//u[text()='support your overall health.']")
	private static WebElement linkOverAllHealth;
	
	@FindBy(xpath = "//header[@class='accordion-head']")
	private static WebElement btnShowReference;
	
	@FindBy(xpath = "//header[@class='accordion-head active']")
	private static WebElement btnHideReference;
	
	@FindBy(xpath = "//div[@class='image component section anchor-box article-featured first odd col-xs-12']")
	private static WebElement nutrientsYourDiet;
	
	@FindBy(xpath = "//div[@class='image component section anchor-box article-featured even col-xs-12']")
	private static WebElement boostYourEnergy;
	
	@FindBy(xpath = "//div[@class='image component section anchor-box article-featured odd col-xs-12']")
	private static WebElement healtheirLife;
	
	@FindBy(xpath = "//div[@class='image component section anchor-box article-featured even last col-xs-12']")
	private static WebElement brainHealth;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='home']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Learn']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd ']//ancestor::a[text()='All Articles']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Food & Nutrition']")
	private static WebElement breadcrumbFour;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']//ancestor::a[text()='4 Tips for a More Balanced Diet']")
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
	
	public void clickLinkOverAllHealth() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(scrollToOverAllHealth);
		clickElementUsingJavaScript(linkOverAllHealth);
	}
	
	public void clickShowReference() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(btnShowReference);
		clickElementUsingJavaScript(btnShowReference);
		visibilityOf(btnHideReference);
		Assert.assertTrue(elementIsDisplayed(btnHideReference));
		clickElementUsingJavaScript(btnHideReference);
		visibilityOf(btnShowReference);
		Assert.assertTrue(elementIsDisplayed(btnShowReference));
		
	}
	
	public void clickNutrientsYourDiet() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(nutrientsYourDiet);
		clickElementUsingJavaScript(nutrientsYourDiet);
	}
	
	public void clickBoostYourEnergy() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(boostYourEnergy);
		clickElementUsingJavaScript(boostYourEnergy);
	}
	
	public void clickHealtheirLife() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(healtheirLife);
		clickElementUsingJavaScript(healtheirLife);
		
	}
	
	public void clickBrainHealth() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(brainHealth);
		clickElementUsingJavaScript(brainHealth);
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
