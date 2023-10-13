package com.qa.rinazina.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class RinazinaMedicinaliPage extends BaseClass{
	
	public RinazinaMedicinaliPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Accetta tutti i cookie']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='Home']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Prodotti']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']//ancestor::a[text()='Medicinali']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "//a[@href='/prodotti/medicinali/rinazina-spray-nasale/']//ancestor::span[text()='Scopri di più']")
	private static WebElement bannerProductLink;
	
	@FindBy(xpath = "//h2[text()='Rinazina Spray Nasale']//ancestor::div[@class='product-teaser padding-small-bottom teaserClick']")
	private static WebElement nasoChiusoProductOne;
	
	@FindBy(xpath = "//h2[text()='Rinazina Gocce Nasali']//ancestor::div[@class='product-teaser padding-small-bottom teaserClick']")
	private static WebElement nasoChiusoProductTwo;
	
	@FindBy(xpath = "//h2[text()='Rinazina Doppia Azione']//ancestor::div[@class='product-teaser padding-small-bottom teaserClick']")
	private static WebElement nasoChiusoProductThree;
	
	@FindBy(xpath = "//h2[text()='Rinazina Antiallergica']//ancestor::div[@class='product-teaser padding-small-bottom teaserClick']")
	private static WebElement antiallergicaProduct;
	
	@FindBy(xpath = "//a[text()='Cos’è il raffreddore: gli aspetti scientifici alla base del raffreddore. ']//ancestor::div[@class='article-teaser teaserClick']")
	private static WebElement articoliCorrelatiOne;
	
	@FindBy(xpath = "//a[text()='Rinite allergica, cos’è: gli aspetti scientifici alla base della rinite allergica e di allergie simili. ']//ancestor::div[@class='article-teaser teaserClick']")
	private static WebElement articoliCorrelatiTwo;
	
	@FindBy(xpath = "//a[text()='Cos’è la sinusite: cause e aspetti scientifici alla base della sinusite. ']//ancestor::div[@class='article-teaser teaserClick']")
	private static WebElement articoliCorrelatiThree;
	
	@FindBy(xpath = "//a[text()='Come liberare il naso chiuso con uno spray per il naso. ']//ancestor::div[@class='article-teaser teaserClick']")
	private static WebElement articoliCorrelatiFour;
	
	
	
	
	
	public void clickCookieBtn() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(cookieBtn)) {
			elementToBeClickable(cookieBtn);
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
			throw new Exception("Unable to click on cookie Pop-up");
		}
	}
	
	
	public void clickBreadcrumbOne() throws Exception{
		waitForPageLoadJava();
		clickElementUsingJavaScript(breadcrumbOne);
		pageLoad();
	}
	
	public void clickBreadcrumbTwo() throws Exception{
		waitForPageLoadJava();
		clickElementUsingJavaScript(breadcrumbTwo);
		pageLoad();
	}
	
	public void clickBreadcrumbThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbThree)) {
			Assert.assertTrue(elementIsDisplayed(breadcrumbThree));
			System.out.println(getElementText(breadcrumbThree)+": Breadcrumb verified successfully");
		} else {
			throw new Exception("Breadcrumb Three is not presented in the page");
		}
	}
	
	public void clickBannerProductLink() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(bannerProductLink);
		clickElementUsingJavaScript(bannerProductLink);
		pageLoad();
	}
	
	public void clickNasoChiusoProductOne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(nasoChiusoProductOne);
		clickElementUsingJavaScript(nasoChiusoProductOne);
		pageLoad();
	}
	
	public void clickNasoChiusoProductTwo() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(nasoChiusoProductTwo);
		clickElementUsingJavaScript(nasoChiusoProductTwo);
		pageLoad();
	}
	
	public void clickNasoChiusoProductThree() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(nasoChiusoProductThree);
		clickElementUsingJavaScript(nasoChiusoProductThree);
		pageLoad();
	}
	
	public void clickAntiallergicaProduct() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(antiallergicaProduct);
		clickElementUsingJavaScript(antiallergicaProduct);
		pageLoad();
	}
	
	public void clickArticoliCorrelatiOne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(articoliCorrelatiOne);
		clickElementUsingJavaScript(articoliCorrelatiOne);
		pageLoad();
	}
	
	public void clickArticoliCorrelatiTwo() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(articoliCorrelatiTwo);
		clickElementUsingJavaScript(articoliCorrelatiTwo);
		pageLoad();
	}
	
	public void clickArticoliCorrelatiThree() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(articoliCorrelatiThree);
		clickElementUsingJavaScript(articoliCorrelatiThree);
		pageLoad();
	}
	
	public void clickArticoliCorrelatiFour() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(articoliCorrelatiFour);
		clickElementUsingJavaScript(articoliCorrelatiFour);
		pageLoad();
	}
	
	

}
