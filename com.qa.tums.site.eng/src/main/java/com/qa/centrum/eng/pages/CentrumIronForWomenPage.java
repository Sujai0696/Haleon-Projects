package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CentrumIronForWomenPage extends BaseClass{
	
	public CentrumIronForWomenPage() {
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
	
	@FindBy(xpath = "//a[text()='over-the-counter multivitamin like Centrum']")
	private static WebElement ironDietLinkOne;
	
	@FindBy(xpath = "//a[text()='Centrum Women']")
	private static WebElement ironDietLinkTwo;
	
	@FindBy(xpath = "//a[text()='ingredients']")
	private static WebElement ironDietLinkThree;
	
	@FindBy(xpath = "//a[text()='Centrum Expert Corner']")
	private static WebElement ironDietLinkFour;
	
	@FindBy(xpath = "//header[@class='accordion-head']")
	private static WebElement btnShowReference;
	
	@FindBy(xpath = "//header[@class='accordion-head active']")
	private static WebElement btnHideReference;
	
	@FindBy(xpath = "//strong[text()='Shore Up Your Defenses: What to Eat to Support Your Immune Health']")
	private static WebElement articleOne;
	
	@FindBy(xpath = "//strong[text()='How to Make Coffee at Home']")
	private static WebElement articleTwo;
	
	@FindBy(xpath = "//strong[text()='10 Simple Ways to Live a Healthier Life']")
	private static WebElement articleThree;
	
	@FindBy(xpath = "//strong[text()='Strategies to Support Brain Health']")
	private static WebElement articleFour;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='home']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Learn']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd ']//ancestor::a[text()='All Articles']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Nutrients and Routine']")
	private static WebElement breadcrumbFour;

	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']//ancestor::a[text()='Multivitamins with Iron for Women']")
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
	
	public void clickIronDietLinkOne() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(ironDietLinkOne);
		clickElementUsingJavaScript(ironDietLinkOne);
	}
	
	public void clickIronDietLinkTwo() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(ironDietLinkTwo);
		clickElementUsingJavaScript(ironDietLinkTwo);
	}
	
	public void clickIronDietLinkThree() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(ironDietLinkThree);
		clickElementUsingJavaScript(ironDietLinkThree);
	}
	
	public void clickIronDietLinkFour() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(ironDietLinkFour);
		clickElementUsingJavaScript(ironDietLinkFour);
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
