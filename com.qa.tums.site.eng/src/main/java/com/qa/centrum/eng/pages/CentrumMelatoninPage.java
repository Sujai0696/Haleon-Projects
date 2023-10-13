package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CentrumMelatoninPage extends BaseClass{
	
	public CentrumMelatoninPage() {
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
	
	@FindBy(xpath = "//a[text()='overall wellness']")
	private static WebElement melatoninLink;
	
	@FindBy(xpath = "(//a[text()='Centrum Gummy Rest & Rejuvenate'])[1]")
	private static WebElement howMuchMelatoninLink;
	
	@FindBy(xpath = "//a[text()='completing your self-care routine']")
	private static WebElement restfulSleepLinkOne;
	
	@FindBy(xpath = "(//a[text()='Centrum Gummy Rest & Rejuvenate'])[2]")
	private static WebElement restfulSleepLinkTwo;
	
	@FindBy(xpath = "//header[@class='accordion-head']")
	private static WebElement btnShowReference;
	
	@FindBy(xpath = "//header[@class='accordion-head active']")
	private static WebElement btnHideReference;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='home']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Learn']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd ']//ancestor::a[text()='All Articles']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Nutrients and Routine']")
	private static WebElement breadcrumbFour;

	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']//ancestor::a[text()='How Much Melatonin Should I Take?']")
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
	
	public void clickMelatoninLink() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(melatoninLink);
		clickElementUsingJavaScript(melatoninLink);
	}
	
	public void clickHowMuchMelatoninLink() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(howMuchMelatoninLink);
		clickElementUsingJavaScript(howMuchMelatoninLink);
	}
	
	public void clickRestfulSleepLinkOne() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(restfulSleepLinkOne);
		clickElementUsingJavaScript(restfulSleepLinkOne);
	}
	
	public void clickRestfulSleepLinkTwo() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(restfulSleepLinkTwo);
		clickElementUsingJavaScript(restfulSleepLinkTwo);
	}
	
	public void clickShowReference() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(btnShowReference);
		clickElementUsingJavaScript(btnShowReference);
		visibilityOf(btnHideReference);
		Assert.assertTrue(elementIsDisplayed(btnHideReference));
		clickElementUsingJavaScript(btnShowReference);
		visibilityOf(btnShowReference);
		Assert.assertTrue(elementIsDisplayed(btnShowReference));
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
