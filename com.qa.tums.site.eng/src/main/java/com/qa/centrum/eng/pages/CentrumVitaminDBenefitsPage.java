package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CentrumVitaminDBenefitsPage extends BaseClass{

	public CentrumVitaminDBenefitsPage() {
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
	
	@FindBy(xpath = "//u[text()='support your immune system']")
	private static WebElement ImmuneSystemOne;
	
	@FindBy(xpath = "//u[text()='well-balanced diet']")
	private static WebElement ImmuneSystemTwo;
	
	@FindBy(xpath = "//u[text()='Vitamin D increases your body’s absorption of calcium, which in turn helps you build strong, healthy bones']")
	private static WebElement boneHealthLink;
	
	@FindBy(xpath = "//u[text()='Not only is vitamin D good for your bones—it’s good for your mind, too!']")
	private static WebElement cognitiveFunctionLinkOne;
	
	@FindBy(xpath = "//u[text()='vitamin D may also help us as we age']")
	private static WebElement cognitiveFunctionLinkTwo;
	
	@FindBy(xpath = "//a[text()='Centrum® Multivitamin']")
	private static WebElement happinessLinkOne;
	
	@FindBy(xpath = "//a[text()='The ABC’s of Vitamin D']")
	private static WebElement happinessLinkTwo;
	
	@FindBy(xpath = "//header[@class='accordion-head']")
	private static WebElement btnShowReference;
	
	@FindBy(xpath = "//header[@class='accordion-head active']")
	private static WebElement btnHideReference;
	
	@FindBy(xpath = "//strong[text()='5 Things to Do When Not Feeling Well and Bored']")
	private static WebElement articleOne;
	
	@FindBy(xpath = "//strong[text()='Tips for Working From Home With Kids']")
	private static WebElement articleTwo;
	
	@FindBy(xpath = "//strong[text()='5 Healthy Homemade Lunch Ideas for Adults']")
	private static WebElement articleThree;
	
	@FindBy(xpath = "//strong[text()='The ABCs of Vitamin D']")
	private static WebElement articleFour;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='home']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Learn']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd ']//ancestor::a[text()='All Articles']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Nutrients and Routine']")
	private static WebElement breadcrumbFour;

	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']//ancestor::a[text()='How Vitamin D Benefits Your Health']")
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
	
	public void clickImmuneSystemOne() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(ImmuneSystemOne);
		clickElementUsingJavaScript(ImmuneSystemOne);
	}
	
	public void clickImmuneSystemTwo() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(ImmuneSystemTwo);
		clickElementUsingJavaScript(ImmuneSystemTwo);
	}
	
	public void clickBoneHealthLink() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(boneHealthLink);
		clickElementUsingJavaScript(boneHealthLink);
	}
	
	public void clickCognitiveFunctionLinkOne() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(cognitiveFunctionLinkOne);
		clickElementUsingJavaScript(cognitiveFunctionLinkOne);
	}
	
	public void clickCognitiveFunctionLinkTwo() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(cognitiveFunctionLinkTwo);
		clickElementUsingJavaScript(cognitiveFunctionLinkTwo);
	}
	
	public void clickHappinessLinkOne() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(happinessLinkOne);
		clickElementUsingJavaScript(happinessLinkOne);
	}
	
	public void clickHappinessLinkTwo() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(happinessLinkTwo);
		clickElementUsingJavaScript(happinessLinkTwo);
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
