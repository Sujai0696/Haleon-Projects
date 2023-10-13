package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CentrumOmegaSupplementsPage extends BaseClass{
	
	
	public CentrumOmegaSupplementsPage() {
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
	
	@FindBy(xpath = "//a[text()='adding more fish and grass-fed meat to your diet']")
	private static WebElement omega3sAnd6sLink;
	
	@FindBy(xpath = "//u[text()='omega-3s continues to show benefits']")
	private static WebElement benefitsOfEyeBrainAndHeart;
	
	@FindBy(xpath = "//header[@class='accordion-head']")
	private static WebElement btnShowReference;

	@FindBy(xpath = "//header[@class='accordion-head active']")
	private static WebElement btnHideReference;
	
	@FindBy(xpath = "//h2[text()='Recommended Articles']")
	private static WebElement scrollToArticle;
	
	@FindBy(xpath = "//strong[text()='What’s Good for The Heart Is Good for The Brain']")
	private static WebElement articleOne;
	
	@FindBy(xpath = "//strong[text()='Strategies to Support Brain Health']")
	private static WebElement articleTwo;
	
	@FindBy(xpath = "//strong[text()='Top 5 Nutrients for Men 50+']")
	private static WebElement articleThree;
	
	@FindBy(xpath = "//strong[text()='10 Simple Ways to Live a Healthier Life']")
	private static WebElement articleFour;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='home']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Learn']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd ']//ancestor::a[text()='All Articles']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Nutrients and Routine']")
	private static WebElement breadcrumbFour;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']//ancestor::a[text()='The Benefits of Omega-3 Supplements']")
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
	
	public void clickOmega3sAnd6sLink() throws Exception {
		scrollDownUsingElement(omega3sAnd6sLink);
		clickElementUsingJavaScript(omega3sAnd6sLink);
	}
	
	public void clickBenefitsOfEyeBrainAndHeart() throws Exception {
		scrollDownUsingElement(benefitsOfEyeBrainAndHeart);
		clickElementUsingJavaScript(benefitsOfEyeBrainAndHeart);
	}
	
	
	public void clickShowReference() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(btnShowReference)) {
			scrollDownUsingElement(btnShowReference);
			clickElementUsingJavaScript(btnShowReference);
			visibilityOf(btnHideReference);
			Assert.assertTrue(elementIsDisplayed(btnHideReference));
			clickElementUsingJavaScript(btnHideReference);
			visibilityOf(btnShowReference);
			Assert.assertTrue(elementIsDisplayed(btnShowReference));
		} else {
			System.out.println("Show reference is not verified");
			Assert.assertTrue(false);
		}
	}
	
	public void clickArticleOne() throws Exception {
		scrollDownUsingElement(scrollToArticle);
		clickElementUsingJavaScript(articleOne);
	}
	
	public void clickArticleTwo() throws Exception {
		scrollDownUsingElement(scrollToArticle);
		clickElementUsingJavaScript(articleTwo);
	}
	
	public void clickArticleThree() throws Exception {
		scrollDownUsingElement(scrollToArticle);
		clickElementUsingJavaScript(articleThree);
	}
	
	public void clickArticleFour() throws Exception {
		scrollDownUsingElement(scrollToArticle);
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
