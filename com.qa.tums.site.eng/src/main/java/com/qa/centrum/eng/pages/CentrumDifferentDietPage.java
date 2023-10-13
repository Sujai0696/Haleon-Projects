package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CentrumDifferentDietPage extends BaseClass{
	
	public CentrumDifferentDietPage() {
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
	
	@FindBy(xpath = "//u[text()='Vitamin D is another essential vitamin for everyone']")
	private static WebElement vitaminDLinkOne;
	
	@FindBy(xpath = "//u[text()='supports bone growth.']")
	private static WebElement vitaminDLinkTwo;
	
	@FindBy(xpath = "//u[text()='You can try eating more vitamin B12 fortified foods like soymilk, cereals and nutritional yeast']")
	private static WebElement vitaminB12link;
	
	@FindBy(xpath = "//u[text()='These important fatty acids support your heart and brain function,']")
	private static WebElement omega3Link;
	
	@FindBy(xpath = "//u[text()='take vitamin supplements when you need them']")
	private static WebElement nutritionalSupportLinkOne;
	
	@FindBy(xpath = "//a[text()='Centrum']")
	private static WebElement nutritionalSupportLinkTwo;
	
	@FindBy(xpath = "//a[text()='ingredients']")
	private static WebElement nutritionalSupportLinkThree;
	
	@FindBy(xpath = "//a[text()='multivitamin']")
	private static WebElement nutritionalSupportLinkFour;
	
	@FindBy(xpath = "//header[@class='accordion-head']")
	private static WebElement btnShowReference;
	
	@FindBy(xpath = "//header[@class='accordion-head active']")
	private static WebElement btnHideReference;
	
	@FindBy(xpath = "//a[text()='Vitamins and Minerals for Healthy Eyes']")
	private static WebElement articleOne;
	
	@FindBy(xpath = "//a[text()='Wellness Quick Tips']")
	private static WebElement articleTwo;
	
	@FindBy(xpath = "//a[text()='10 Simple Ways to Live a Healthier Life']")
	private static WebElement articleThree;
	
	@FindBy(xpath = "//a[text()='How Vitamins Can Easily Fit Into My Regimen and Lifestyle']")
	private static WebElement articleFour;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='home']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Learn']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd ']//ancestor::a[text()='All Articles']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Food & Nutrition']")
	private static WebElement breadcrumbFour;

	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']//ancestor::a[text()='Different Diets & VMS: Vegan']")
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

	
	public void clickVitaminDLinkOne() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(vitaminDLinkOne);
		clickElementUsingJavaScript(vitaminDLinkOne);
	}
	
	public void clickVitaminDLinkTwo() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(vitaminDLinkTwo);
		clickElementUsingJavaScript(vitaminDLinkTwo);
	}
	
	public void clickVitaminB12Link() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(vitaminB12link);
		clickElementUsingJavaScript(vitaminB12link);
	}
	
	public void clickOmega3Link() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(omega3Link);
		clickElementUsingJavaScript(omega3Link);
	}
	
	public void clickNutritionalSupportLinkOne() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(nutritionalSupportLinkOne);
		clickElementUsingJavaScript(nutritionalSupportLinkOne);
	}
	
	public void clickNutritionalSupportLinkTwo() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(nutritionalSupportLinkTwo);
		clickElementUsingJavaScript(nutritionalSupportLinkTwo);
	}
	
	public void clickNutritionalSupportLinkThree() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(nutritionalSupportLinkThree);
		clickElementUsingJavaScript(nutritionalSupportLinkThree);
	}
	
	public void clickNutritionalSupportLinkFour() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(nutritionalSupportLinkFour);
		clickElementUsingJavaScript(nutritionalSupportLinkFour);
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
