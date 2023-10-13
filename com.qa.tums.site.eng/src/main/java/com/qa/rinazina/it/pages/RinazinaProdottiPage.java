package com.qa.rinazina.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class RinazinaProdottiPage extends BaseClass{
	
	public RinazinaProdottiPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Accetta tutti i cookie']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='Home']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even last is-current ']//ancestor::a[text()='Prodotti']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//h2[text()='Rinazina Spray Nasale']//ancestor::div[@class='product-teaser padding-small-bottom teaserClick']")
	private static WebElement medicinaliProductOne;
	
	@FindBy(xpath = "//h2[text()='Rinazina Gocce Nasali']//ancestor::div[@class='product-teaser padding-small-bottom teaserClick']")
	private static WebElement medicinaliProductTwo;
	
	@FindBy(xpath = "//h2[text()='Rinazina Doppia Azione']//ancestor::div[@class='product-teaser padding-small-bottom teaserClick']")
	private static WebElement medicinaliProductThree;
	
	@FindBy(xpath = "//h2[text()='Rinazina Antiallergica']//ancestor::div[@class='product-teaser padding-small-bottom teaserClick']")
	private static WebElement medicinaliProductFour;
	
	@FindBy(xpath = "//a[@href='/prodotti/medicinali/']//ancestor::span[text()='Scopri di più']")
	private static WebElement scopriDiOne;
	
	@FindBy(xpath = "//h2[text()='Rinazina Aquamarina Spray Nasale Ipertonico.']//ancestor::div[@class='product-teaser padding-small-bottom teaserClick']")
	private static WebElement prodottiSenzaProductOne;
	
	@FindBy(xpath = "//h2[text()='Rinazina Aquamarina Spray Nasale Isotonico']//ancestor::div[@class='product-teaser padding-small-bottom teaserClick']")
	private static WebElement prodottiSenzaProductTwo;
	
	@FindBy(xpath = "//h2[text()='Rinazina Aquamarina Family Spray Nasale Isotonico Delicato']//ancestor::div[@class='product-teaser padding-small-bottom teaserClick']")
	private static WebElement prodottiSenzaProductThree;
	
	@FindBy(xpath = "//a[@href='/prodotti/senza-medicinali/']//ancestor::span[text()='Scopri di più']")
	private static WebElement scopriDiTwo;
	
	
	
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
		if (isElementPresent(breadcrumbTwo)) {
			Assert.assertTrue(elementIsDisplayed(breadcrumbTwo));
			System.out.println(getElementText(breadcrumbTwo)+": Breadcrumb verified successfully");
		} else {
			throw new Exception("Breadcrumb Two is not presented in the page");
		}
	}
	
	public void clickMedicinaliProductOne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(medicinaliProductOne);
		clickElementUsingJavaScript(medicinaliProductOne);
		pageLoad();
	}
	
	public void clickMedicinaliProductTwo() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(medicinaliProductTwo);
		clickElementUsingJavaScript(medicinaliProductTwo);
		pageLoad();
	}
	
	public void clickMedicinaliProductThree() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(medicinaliProductThree);
		clickElementUsingJavaScript(medicinaliProductThree);
		pageLoad();
	}
	
	public void clickMedicinaliProductFour() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(medicinaliProductFour);
		clickElementUsingJavaScript(medicinaliProductFour);
		pageLoad();
	}
	
	public void clickFindOutMoreOne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(scopriDiOne);
		clickElementUsingJavaScript(scopriDiOne);
		pageLoad();
	}
	
	public void clickProdottiSenzaProductOne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(prodottiSenzaProductOne);
		clickElementUsingJavaScript(prodottiSenzaProductOne);
		pageLoad();
	}
	
	public void clickProdottiSenzaProductTwo() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(prodottiSenzaProductTwo);
		clickElementUsingJavaScript(prodottiSenzaProductTwo);
		pageLoad();
	}
	
	public void clickProdottiSenzaProductThree() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(prodottiSenzaProductThree);
		clickElementUsingJavaScript(prodottiSenzaProductThree);
		pageLoad();
	}
	
	public void clickFindOutMoreTwo() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(scopriDiTwo);
		clickElementUsingJavaScript(scopriDiTwo);
		pageLoad();
	}
}
