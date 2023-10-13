package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CentrumMultivitaminsForKidsPage extends BaseClass{

	public CentrumMultivitaminsForKidsPage() {
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
	
	@FindBy(xpath = "//a[text()='multivitamins for kids']")
	private static WebElement bannerLink;
	
	@FindBy(xpath = "(//a[text()='AI'])[1]")
	private static WebElement multivitaminLinkOne;
	
	@FindBy(xpath = "(//a[text()='https://lpi.oregonstate.edu/mic/life-stages/children'])[1]")
	private static WebElement multivitaminLinkTwo;
	
	@FindBy(xpath = "(//a[text()='AI'])[2]")
	private static WebElement multivitaminLinkThree;
	
	@FindBy(xpath = "(//a[text()='https://lpi.oregonstate.edu/mic/life-stages/children'])[2]")
	private static WebElement multivitaminLinkFour;
	
	
	@FindBy(xpath = "//strong[text()='Centrum MultiGummies Kids Tropical Punch']")
	private static WebElement tropicalPunchLink;
	
	@FindBy(xpath = "//strong[text()='Centrum Organic Kids MultiGummies']")
	private static WebElement multiGummiesLink;
	
	@FindBy(xpath = "//header[@class='accordion-head']")
	private static WebElement btnShowReference;
	
	@FindBy(xpath = "//header[@class='accordion-head active']")
	private static WebElement btnHideReference;
	
	@FindBy(xpath = "//strong[text()='5 Vitamins & Minerals for Healthy Eyes']")
	private static WebElement articleOne;
	
	@FindBy(xpath = "//strong[text()='Vitamins & Minerals for Healthy Aging']")
	private static WebElement articleTwo;
	
	@FindBy(xpath = "//strong[text()='How Vitamin D Benefits Your Health']")
	private static WebElement articleThree;
	
	@FindBy(xpath = "//strong[text()='Which Vitamins are Antioxidants?']")
	private static WebElement articleFour;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='home']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Learn']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd ']//ancestor::a[text()='All Articles']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Nutrients and Routine']")
	private static WebElement breadcrumbFour;

	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']//ancestor::a[text()='Multivitamins for Kids']")
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
	
	public void clickBannerLink() throws Exception {
		waitForPageLoadJava();
		clickElementUsingJavaScript(bannerLink);
	}
	
	
	public void clickMultivitaminLinkOne() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(multivitaminLinkOne);
		clickElementUsingJavaScript(multivitaminLinkOne);
	}
	
	public void clickMultivitaminLinkTwo() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(multivitaminLinkTwo);
		clickElementUsingJavaScript(multivitaminLinkTwo);
	}
	
	public void clickMultivitaminLinkThree() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(multivitaminLinkThree);
		clickElementUsingJavaScript(multivitaminLinkThree);
	}
	
	public void clickMultivitaminLinkFour() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(multivitaminLinkFour);
		clickElementUsingJavaScript(multivitaminLinkFour);
	}
	
	public void clickTropicalPunchLink() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(tropicalPunchLink);
		clickElementUsingJavaScript(tropicalPunchLink);
	}
	
	public void clickMultiGummiesLink() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(multiGummiesLink);
		clickElementUsingJavaScript(multiGummiesLink);
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
