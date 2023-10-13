package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class LearnWhyAreVitaminsImportantPage extends BaseClass{

	public LearnWhyAreVitaminsImportantPage() {
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
	
	@FindBy(xpath = "//u[text()='Good nutrition makes for a durable immune system']")
	private static WebElement linkSupportImmunity;
	
	@FindBy(xpath = "//a[@href='/learn/articles/nutrients-and-routine/the-abc-s-of-vitamin-d/']")
	private static WebElement linkMaintainStrongBones;
	
	@FindBy(xpath = "//a[@href='/learn/articles/nutrients-and-routine/how-supplements-multivitamins-work-together/']")
	private static WebElement linkMeetingYourNutritionalNeeds;
	
	@FindBy(xpath = "//a[@href='/learn/articles/nutrients-and-routine/paleo-vitamins-supplements/']")
	private static WebElement linkPaleo;
	
	@FindBy(xpath = "//img[@title='A circle of oysters around a lemon slice on ice']//ancestor::div[@class='image component section anchor-box image-circle image-circle-large-2 first odd col-xs-12']")
	private static WebElement btnOysters;
	
	@FindBy(xpath = "//img[@title='A circle of pink salmon']//ancestor::div[@class='image component section anchor-box image-circle image-circle-large-2 even col-xs-12']")
	private static WebElement btnPinkSalmon;
	
	@FindBy(xpath = "//img[@title='A circle of almonds']//ancestor::div[@class='image component section anchor-box image-circle image-circle-large-2 odd col-xs-12']")
	private static WebElement btnAlmonds;
	
	@FindBy(xpath = "//img[@title='A circle of spinach']//ancestor::div[@class='image component section anchor-box image-circle image-circle-large-2 even col-xs-12']")
	private static WebElement btnSpinach;
	
	@FindBy(xpath = "//img[@title='A circle of halibut']//ancestor::div[@class='image component section anchor-box image-circle image-circle-large-2 odd col-xs-12']")
	private static WebElement btnHalibut;
	
	@FindBy(xpath = "//img[@title='A circle of avocado']//ancestor::div[@class='image component section anchor-box image-circle image-circle-large-2 even col-xs-12']")
	private static WebElement btnAvocados;
	
	@FindBy(xpath = "//img[@title='A circle of chickpeas']//ancestor::div[@class='image component section anchor-box image-circle image-circle-large-2 odd col-xs-12']")
	private static WebElement btnChickpeas;
	
	@FindBy(xpath = "//img[@title='A circle of plain low fat yogurt']//ancestor::div[@class='image component section anchor-box image-circle image-circle-large-2 even last col-xs-12']")
	private static WebElement btnGreekYogurt;
	
	@FindBy(xpath = "//header[@class='accordion-head']")
	private static WebElement btnShowReference;
	
	@FindBy(xpath = "//header[@class='accordion-head active']")
	private static WebElement btnHideReference;
	
	@FindBy(xpath = "(//div[contains(@class,'richText component section border rounded-pill anchor-box')])[1]")
	private static WebElement multivitamins;
	
	@FindBy(xpath = "(//div[contains(@class,'richText component section border rounded-pill anchor-box')])[2]")
	private static WebElement benefitBlends;
	
	@FindBy(xpath = "(//div[contains(@class,'richText component section border rounded-pill anchor-box')])[3]")
	private static WebElement wholeFoodBlends;
	
	@FindBy(xpath = "(//div[contains(@class,'richText component section border rounded-pill anchor-box')])[4]")
	private static WebElement seeAllProducts;
	
	@FindBy(xpath = "//strong[text()='How Do Vitamins Work?']")
	private static WebElement articleOne;
	
	@FindBy(xpath = "//strong[text()='Choosing a Daily Multivitamin']")
	private static WebElement articleTwo;
	
	@FindBy(xpath = "//strong[text()='Study: Are the Nutrients in Multivitamin Supplements Absorbed?']")
	private static WebElement articleThree;
	
	@FindBy(xpath = "//strong[text()='The 6 Nutrients Your Diet May Be Missing']")
	private static WebElement articleFour;
	
	@FindBy(xpath = "//span[text()='Keto']//ancestor::li[@class='tabs-nav-item even ']")
	private static WebElement keto;
	
	@FindBy(xpath = "//span[text()='Keto']//ancestor::li[@class='tabs-nav-item even is-active']")
	private static WebElement ketoActive;
	
	@FindBy(xpath = "//a[@href='/learn/articles/nutrients-and-routine/keto-vitamins/']")
	private static WebElement ketoLink;
	
	@FindBy(xpath = "//span[text()='Vegetarian']//ancestor::li[@class='tabs-nav-item odd ']")
	private static WebElement vegetarian;
	
	@FindBy(xpath = "//span[text()='Vegetarian']//ancestor::li[@class='tabs-nav-item odd is-active']")
	private static WebElement vegetarianActive;
	
	@FindBy(xpath = "//a[@href='/learn/articles/nutrients-and-routine/how-much-b12-should-you-take-a-day/']")
	private static WebElement vegetarianLinkOne;
	
	@FindBy(xpath = "//a[@href='/learn/articles/nutrients-and-routine/the-benefits-of-omega-3-supplements/']")
	private static WebElement vegetarianLinkTwo;
	
	@FindBy(xpath = "//span[text()='Vegan']//ancestor::li[@class='tabs-nav-item even last ']")
	private static WebElement vegan;
	
	@FindBy(xpath = "//span[text()='Vegan']//ancestor::li[@class='tabs-nav-item even last is-active']")
	private static WebElement veganActive;
	
	@FindBy(xpath = "//a[@href='/learn/articles/food-and-nutrition/vitamins-and-vegan-diet/']")
	private static WebElement veganLink;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='home']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Learn']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']//ancestor::a[text()='Why are Vitamins Important?']")
	private static WebElement breadcrumbThree;
	
	
	
	
	
	
	
	
	

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
	
	public void clickSupportImmunity() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(linkSupportImmunity);
		clickElementUsingJavaScript(linkSupportImmunity);
	}
	
	public void clickMaintainStrongBone() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(linkMaintainStrongBones);
		clickElementUsingJavaScript(linkMaintainStrongBones);
	}
	
	public void clickMeetingYourNutritionalNeeds() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(linkMeetingYourNutritionalNeeds);
		clickElementUsingJavaScript(linkMeetingYourNutritionalNeeds);
	}
	
	public void clickPaleo() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(linkPaleo);
		clickElementUsingJavaScript(linkPaleo);
	}
	
	
	
	
	
	
	public void clickOysters() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(btnOysters);
		clickElementUsingJavaScript(btnOysters);
	}
	
	public void clickPinkSalmon() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(btnPinkSalmon);
		clickElementUsingJavaScript(btnPinkSalmon);
	}
	
	public void clickAlmonds() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(btnAlmonds);
		clickElementUsingJavaScript(btnAlmonds);
	}
	
	public void clickSpinach() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(btnSpinach);
		clickElementUsingJavaScript(btnSpinach);
	}
	
	public void clickHalibut() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(btnHalibut);
		clickElementUsingJavaScript(btnHalibut);
	}
	
	public void clickAvocados() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(btnAvocados);
		clickElementUsingJavaScript(btnAvocados);
	}
	
	public void clickChickPeas() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(btnChickpeas);
		clickElementUsingJavaScript(btnChickpeas);
	}
	
	public void clickGreekYogurt() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(btnGreekYogurt);
		clickElementUsingJavaScript(btnGreekYogurt);
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
		System.out.println("Show Refrence and Hide refernce ---->Verified Successfully<----");
	}
	
	public void clickMultivitamins() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(multivitamins);
		clickElementUsingJavaScript(multivitamins);
	}
	
	public void clickBenefitBlends() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(benefitBlends);
		clickElementUsingJavaScript(benefitBlends);
	}
	
	public void clickWholeFoodBlends() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(wholeFoodBlends);
		clickElementUsingJavaScript(wholeFoodBlends);
	}
	
	public void clickSeeAllProducts() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(seeAllProducts);
		clickElementUsingJavaScript(seeAllProducts);
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
	
	
	public void clickKeto() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(keto);
		clickElementUsingJavaScript(keto);
		if (isElementPresent(ketoActive)) {
			clickElementUsingJavaScript(ketoLink);
		} else {
			throw new Exception("Navigation Keto is not active");
		}
	}
	
	
	public void clickVegetarianLinkOne() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(vegetarian);
		clickElementUsingJavaScript(vegetarian);
		if (isElementPresent(vegetarianActive)) {
			clickElementUsingJavaScript(vegetarianLinkOne);
		} else {
			throw new Exception("Navigation Vegetarian is not active");
		}
	}
	
	
	public void clickVegetarianLinkTwo() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(vegetarian);
		clickElementUsingJavaScript(vegetarian);
		if (isElementPresent(vegetarianActive)) {
			clickElementUsingJavaScript(vegetarianLinkTwo);
		} else {
			throw new Exception("Navigation Vegetarian is not active");
		}
	}
	
	public void clickVegan() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(vegan);
		clickElementUsingJavaScript(vegan);
		if (isElementPresent(veganActive)) {
			clickElementUsingJavaScript(veganLink);
		} else {
			throw new Exception("Navigation vegan is not active");
		}
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
	
	
	
	
	
	
	
}
