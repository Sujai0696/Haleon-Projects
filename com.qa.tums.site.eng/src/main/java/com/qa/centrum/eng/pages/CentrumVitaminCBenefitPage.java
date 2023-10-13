package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CentrumVitaminCBenefitPage extends BaseClass{

	public CentrumVitaminCBenefitPage() {
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
	
	@FindBy(xpath = "//a[text()='Vitamin C']")
	private static WebElement vitaminCLink;
	
	@FindBy(xpath = "//a[text()='vitamin A']")
	private static WebElement vitaminCLinkOne;
	
	@FindBy(xpath = "//a[text()='vitamin E']")
	private static WebElement vitaminCLinkTwo;
	
	@FindBy(xpath = "//a[text()='selenium']")
	private static WebElement vitaminCLinkThree;
	
	@FindBy(xpath = "//a[text()='beta carotene']")
	private static WebElement vitaminCLinkFour;
	
	@FindBy(xpath = "//strong[text()='Centrum Organic Men Multigummies']")
	private static WebElement productWithVitaminLinkOne;
	
	@FindBy(xpath = "//strong[text()='Centrum Organic Women Multigummies']")
	private static WebElement productWithVitaminLinkTwo;
	
	@FindBy(xpath = "//strong[text()='Centrum Minis Immune Support Women']")
	private static WebElement productWithVitaminLinkThree;
	
	@FindBy(xpath = "//strong[text()='Centrum Minis Immune Support Men']")
	private static WebElement productWithVitaminLinkFour;
	
	@FindBy(xpath = "//header[@class='accordion-head']")
	private static WebElement btnShowReference;
	
	@FindBy(xpath = "//header[@class='accordion-head active']")
	private static WebElement btnHideReference;
	
	@FindBy(xpath = "//strong[text()='Paleo Vitamins and Supplements']")
	private static WebElement articleOne;
	
	@FindBy(xpath = "//strong[text()='How Supplements and Multivitamins Work Together']")
	private static WebElement articleTwo;
	
	@FindBy(xpath = "//strong[text()='Multivitamins for Kids: What You Need to Know']")
	private static WebElement articleThree;
	
	@FindBy(xpath = "//strong[text()='Keto Vitamins']")
	private static WebElement articleFour;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='home']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Learn']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd ']//ancestor::a[text()='All Articles']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Nutrients and Routine']")
	private static WebElement breadcrumbFour;

	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']//ancestor::a[text()='Vitamin C Benefits']")
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
	
	public void clickVitaminCLink() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(vitaminCLink);
		clickElementUsingJavaScript(vitaminCLink);
	}
	
	public void clickVitaminCLinkOne() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(vitaminCLinkOne);
		clickElementUsingJavaScript(vitaminCLinkOne);
	}
	
	public void clickVitaminCLinkTwo() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(vitaminCLinkTwo);
		clickElementUsingJavaScript(vitaminCLinkTwo);
	}
	
	public void clickVitaminCLinkThree() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(vitaminCLinkThree);
		clickElementUsingJavaScript(vitaminCLinkThree);
	}
	
	public void clickVitaminCLinkFour() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(vitaminCLinkFour);
		clickElementUsingJavaScript(vitaminCLinkFour);
	}
	
	public void clickProductWithVitaminLinkOne() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(productWithVitaminLinkOne);
		clickElementUsingJavaScript(productWithVitaminLinkOne);
	}
	
	public void clickProductWithVitaminLinkTwo() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(productWithVitaminLinkTwo);
		clickElementUsingJavaScript(productWithVitaminLinkTwo);
	}
	
	public void clickProductWithVitaminLinkThree() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(productWithVitaminLinkThree);
		clickElementUsingJavaScript(productWithVitaminLinkThree);
	}
	
	public void clickProductWithVitaminLinkFour() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(productWithVitaminLinkFour);
		clickElementUsingJavaScript(productWithVitaminLinkFour);
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
