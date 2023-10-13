package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.stdDSA;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CentrumDietMayBeMissingPage extends BaseClass{

	public CentrumDietMayBeMissingPage() {
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

	@FindBy(xpath = "//h2[text()='2. Vitamin C']")
	private static WebElement scrollToVitacminC;

	@FindBy(xpath = "//u[text()='Vitamin C’s more well-known function is its role in immunity support']")
	private static WebElement vitaminCImmuneSupport;

	@FindBy(xpath = "//u[text()='its antioxidant abilities']")
	private static WebElement vitaminCAntioxidantAbilities;

	@FindBy(xpath = "//u[text()='Vitamin D plays a role in helping the body to absorb and use calcium']")
	private static WebElement vitaminDLinkOne;

	@FindBy(xpath = "//u[text()='support bone health']")
	private static WebElement vitaminDLinkTwo;

	@FindBy(xpath = "//header[@class='accordion-head']")
	private static WebElement btnShowReference;

	@FindBy(xpath = "//header[@class='accordion-head active']")
	private static WebElement btnHideReference;

	@FindBy(xpath = "//h2[text()='4. Vitamin E']")
	private static WebElement scrollToVitaminE;

	@FindBy(xpath = "//u[text()='Vitamin E supports heart and brain health as well as immune function.']")
	private static WebElement vitaminELinkImmuneFunction;

	@FindBy(xpath = "//h2[text()='6. Magnesium']")
	private static WebElement scrollTomagnesium; 

	@FindBy(xpath = "//u[text()='balanced diet']")
	private static WebElement magnesiumLinkBalancedDiet;

	@FindBy(xpath = "//h2[text()='Recommended Articles']")
	private static WebElement scrollToArticles;

	@FindBy(xpath = "//strong[text()='Shore Up Your Defenses: What to Eat to Support Your Immune Health']")
	private static WebElement articleOne;

	@FindBy(xpath = "//strong[text()='4 Tips for a More Balanced Diet']")
	private static WebElement articleTwo;

	@FindBy(xpath = "//strong[text()='10 Simple Ways to Live a Healthier Life']")
	private static WebElement articleThree;

	@FindBy(xpath = "//strong[text()='Establishing a Self-Care Routine']")
	private static WebElement articleFour;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='home']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Learn']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd ']//ancestor::a[text()='All Articles']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Food & Nutrition']")
	private static WebElement breadcrumbFour;

	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']//ancestor::a[text()='The 6 Nutrients Your Diet May Be Missing']")
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


	public void clickVitaminCImmuneSupport() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(vitaminCImmuneSupport);
		clickElementUsingJavaScript(vitaminCImmuneSupport);
	}

	public void clickVitaminCAntioxidantAbilities() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(vitaminCAntioxidantAbilities);
		clickElementUsingJavaScript(vitaminCAntioxidantAbilities);
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

	public void clickVitaminELinkImmuneFunction() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(vitaminELinkImmuneFunction);
		clickElementUsingJavaScript(vitaminELinkImmuneFunction);
	}

	public void clickMagnesiumLinkBalancedDiet() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(magnesiumLinkBalancedDiet);
		clickElementUsingJavaScript(magnesiumLinkBalancedDiet);
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
