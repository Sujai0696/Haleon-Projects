package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CentrumSupportBrainHealthPage extends BaseClass{
	
	public CentrumSupportBrainHealthPage() {
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

	
	@FindBy(xpath = "//a[text()='Physical Activity Guidelines for Americans']")
	private static WebElement goodHealthLink;
	
	@FindBy(xpath = "//u[text()='Vitamin C is a powerful antioxidant']")
	private static WebElement feedYourHeadLinkOne;
	
	@FindBy(xpath = "//u[text()='oxidative stress, which affects brain health.']")
	private static WebElement feedYourHeadLinkTwo;
	
	@FindBy(xpath = "//u[text()='help satisfy vitamin B12 needs']")
	private static WebElement feedYourHeadLinkThree;
	
	@FindBy(xpath = "//u[text()='Omega-3 fats support the structure of brain cell membranes']")
	private static WebElement feedYourHeadLinkFour;
	
	@FindBy(xpath = "//u[text()='nutrient-rich diet']")
	private static WebElement feedYourHeadLinkFive;
	
	@FindBy(xpath = "//header[@class='accordion-head']")
	private static WebElement btnShowReference;

	@FindBy(xpath = "//header[@class='accordion-head active']")
	private static WebElement btnHideReference;
	
	@FindBy(xpath = "//strong[text()='What’s Good for The Heart Is Good for The Brain']")
	private static WebElement articleOne;
	
	@FindBy(xpath = "//strong[text()='Top 5 Nutrients for Men 50+']")
	private static WebElement articleTwo;
	
	@FindBy(xpath = "//strong[text()='6 Simple Ways to Boost Your Energy']")
	private static WebElement articleThree;
	
	@FindBy(xpath = "//strong[text()='5 Vitamins for Women Over 50']")
	private static WebElement articleFour;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='home']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Learn']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd ']//ancestor::a[text()='All Articles']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Health & Lifestyle Tips']")
	private static WebElement breadcrumbFour;

	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']//ancestor::a[text()='Strategies to Support Brain Health']")
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

	
	public void clickGoodHealthLink() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(goodHealthLink);
		clickElementUsingJavaScript(goodHealthLink);
	}

	public void clickFeedYourHeadLinkOne() throws Exception {
		waitForPageLoadJava();
		scrollupUsingElement(feedYourHeadLinkOne);
		clickElementUsingJavaScript(feedYourHeadLinkOne);
	}
	
	public void clickFeedYourHeadLinkTwo() throws Exception {
		waitForPageLoadJava();
		scrollupUsingElement(feedYourHeadLinkTwo);
		clickElementUsingJavaScript(feedYourHeadLinkTwo);
	}
	
	public void clickFeedYourHeadLinkThree() throws Exception {
		waitForPageLoadJava();
		scrollupUsingElement(feedYourHeadLinkThree);
		clickElementUsingJavaScript(feedYourHeadLinkThree);
	}
	
	public void clickFeedYourHeadLinkFour() throws Exception {
		waitForPageLoadJava();
		scrollupUsingElement(feedYourHeadLinkFour);
		clickElementUsingJavaScript(feedYourHeadLinkFour);
	}
	
	public void clickFeedYourHeadLinkFive() throws Exception {
		waitForPageLoadJava();
		scrollupUsingElement(feedYourHeadLinkFive);
		clickElementUsingJavaScript(feedYourHeadLinkFive);
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
