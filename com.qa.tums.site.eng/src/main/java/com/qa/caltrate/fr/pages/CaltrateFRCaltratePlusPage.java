package com.qa.caltrate.fr.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CaltrateFRCaltratePlusPage extends BaseClass{
	
	public CaltrateFRCaltratePlusPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='Home']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Produits']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//*[@class='breadcrumb-list-item odd last is-current ']//self::li[normalize-space()='Caltrate PLUS']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "//span[normalize-space()='ACHETER MAINTENANT']")
	private static WebElement acheterBtn;
	
	@FindBy(xpath = "//h2[normalize-space()='Caltrate PLUS 60s']")
	private static WebElement acheterText;
	
	@FindBy(xpath = "//span[contains(@class,'ps-lightbox-close')]")
	private static WebElement acheterClose;
	
	@FindBy(xpath = "//a[@tabindex='0']")
	private static WebElement acheterVisbility;
	
	@FindBy(xpath = "//a[normalize-space()='Obtenez un coupon']")
	private static WebElement coupon;
	
	@FindBy(xpath = "//a[normalize-space()='Voir tous les produits']")
	private static WebElement produits;
	
	@FindBy(xpath = "//img[contains(@src,'content/dam/cf-consumer-healthcare/bp-caltrate/fr_CA/products/product-coupon-fr.PNG?auto=format')]")
	private static WebElement imgLink;
	
	@FindBy(xpath = "//a[normalize-space()='Produits']//self::a[@class='navigation-item-title']")
	private static WebElement moveToMegaMenu;
	
	@FindBy(xpath = "//a[text()='Caltrate avec Vitamine D']")
	private static WebElement megaMenuOne;
	
	
	public void clickBreadcrumbOne ()throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(breadcrumbOne);
		clickElementUsingJavaScript(breadcrumbOne);
	}
	
	public void clickBreadcrumbTwo ()throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(breadcrumbTwo);
		clickElementUsingJavaScript(breadcrumbTwo);
	}
	
	public void textBreadcrumbThree ()throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbThree)) {
			Assert.assertTrue(elementIsDisplayed(breadcrumbThree));
			System.out.println("Breadcrumb Three is verified");
		} else {
			throw new Exception("Bredcrumb Three ia not presented in the page");
		}
	}
	
	public void clickAcheterBtn() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(acheterBtn);
		clickElementUsingJavaScript(acheterBtn);
		if (isElementPresent(acheterText)) {
			Assert.assertTrue(elementIsDisplayed(acheterText));
			visibilityOf(acheterClose);
			clickElementUsingJavaScript(acheterClose);
			implicitWait();
			if (isElementPresent(acheterVisbility)) {
				Assert.assertTrue(true);
				System.out.println("Acheter verified successdully");
			} else {
				throw new Exception("Acheter button is not closed");
			}
		} else {
			throw new Exception("Acheter is not verified");
		}
	}
	
	public void clickCoupon() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(coupon);
		clickElementUsingJavaScript(coupon);
	}
	
	public void clickProduits() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(produits);
		clickElementUsingJavaScript(produits);
	}
	
	public String clickImgLink() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(imgLink);
		clickElementUsingJavaScript(imgLink);
		pageLoad();
		String currentUrl = getCurrentUrl();
		return currentUrl;
	}
	
//	public void clickMegaMenuOne() throws Exception{
//		waitForPageLoadJava();
//		moveToElement(moveToMegaMenu);
//		visibilityOf(megaMenuOne);
//		clickElementUsingJavaScript(megaMenuOne);
//	}

}
