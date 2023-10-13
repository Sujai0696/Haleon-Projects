package com.qa.rinazina.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class RinazinaHomepagePage extends BaseClass{
	
	public RinazinaHomepagePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Accetta tutti i cookie']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//button[@id='slick-slide-control00']")
	private static WebElement carouselOne;
	
	@FindBy(xpath = "//button[text()='1']//ancestor::li[@class='slick-active']")
	private static WebElement carouselActiveOne;
	
	@FindBy(xpath = "//li[@role='presentation']//ancestor::button[text()='2']")
	private static WebElement carouselTwo;
	
	@FindBy(xpath = "//button[text()='2']//ancestor::li[@class='slick-active']")
	private static WebElement carouselActiveTwo;
	
	@FindBy(xpath = "//a[@href='/prodotti/medicinali/rinazina-spray-nasale/']//ancestor::span[text()='Scopri di più']")
	private static WebElement carouselProductTwo;
	
	@FindBy(xpath = "//li[@role='presentation']//ancestor::button[text()='3']")
	private static WebElement carouselThree;
	
	@FindBy(xpath = "//button[text()='3']//ancestor::li[@class='slick-active']")
	private static WebElement carouselActiveThree;
	
	@FindBy(xpath = "//a[@href='/prodotti/senza-medicinali/rinazina-aquamarina-spray-nasale-isotonico/']//ancestor::span[text()='Scopri di più']")
	private static WebElement carouselProductThree;
	
	@FindBy(xpath = "//p[@class=' padding-large-top padding-xlarge-half-bottom']//ancestor::span[text()='Trova la mia condizione']")
	private static WebElement travoLink;
	
	@FindBy(xpath = "//a[@href='/prodotti/medicinali/']//ancestor::span[text()='Scopri di più']")
	private static WebElement medicinaliLink;
	
	@FindBy(xpath = "//a[@href='/prodotti/senza-medicinali/']//ancestor::span[text()='Scopri di più']")
	private static WebElement prodottiSenzaMedicinaliLink;
	
	@FindBy(xpath = "//a[normalize-space()='Raffreddore, sintomi e rimedi per farlo passare.']//ancestor::div[@class='article-teaser teaserClick']")
	private static WebElement articleLinkOne;
	
	@FindBy(xpath = "//a[normalize-space()='Sintomi e rimedi contro la rinite allergica.']//ancestor::div[@class='article-teaser teaserClick']")
	private static WebElement articleLinkTwo;
	
	@FindBy(xpath = "//a[normalize-space()='Sinusite: quali sono i sintomi e come alleviarli.']//ancestor::div[@class='article-teaser teaserClick']")
	private static WebElement articleLinkThree;
	
	@FindBy(xpath = "//a[normalize-space()='Russamento notturno: da cosa è provocato e quali possono essere i rimedi.']//ancestor::div[@class='article-teaser teaserClick']")
	private static WebElement articleLinkFour;
	
	
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
	
	public void clickCarouselTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(carouselActiveOne)) {
			scrollDownUsingElement(carouselActiveOne);
			clickElementUsingJavaScript(carouselTwo);
			visibilityOf(carouselActiveTwo);
			Assert.assertTrue(elementIsDisplayed(carouselActiveTwo));
			visibilityOf(carouselProductTwo);
			clickElementUsingJavaScript(carouselProductTwo);
			pageLoad();
		} else {
			throw new Exception("Carousel one is not active");
		}
	}
	
	public void clickCarouselThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(carouselActiveOne)) {
			scrollDownUsingElement(carouselActiveOne);
			clickElementUsingJavaScript(carouselThree);
			visibilityOf(carouselActiveThree);
			Assert.assertTrue(elementIsDisplayed(carouselActiveThree));
			visibilityOf(carouselProductThree);
			clickElementUsingJavaScript(carouselProductThree);
			pageLoad();
		} else {
			throw new Exception("Carousel one is not active");
		}
	}
	
	public void clickCarouselOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(carouselActiveOne)) {
			scrollDownUsingElement(carouselActiveOne);
			clickElementUsingJavaScript(carouselThree);
			visibilityOf(carouselActiveThree);
			Assert.assertTrue(elementIsDisplayed(carouselActiveThree));
			visibilityOf(carouselOne);
			clickElementUsingJavaScript(carouselOne);
			visibilityOf(carouselActiveOne);
			Assert.assertTrue(elementIsDisplayed(carouselActiveOne));
			System.out.println("Carousel one is verified successfully");
		} else {
			throw new Exception("Carousel one is not active");
		}
	}
	
	public void clickTravoLink() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(travoLink);
		clickElementUsingJavaScript(travoLink);
		pageLoad();
	}
	
	public void clickMedicinaliLink() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(medicinaliLink);
		clickElementUsingJavaScript(medicinaliLink);
		pageLoad();
	}
	
	public void clickProdottiSenzaMedicinaliLink() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(prodottiSenzaMedicinaliLink);
		clickElementUsingJavaScript(prodottiSenzaMedicinaliLink);
		pageLoad();
	}
	
	public void clickArticleLinkOne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(articleLinkOne);
		clickElementUsingJavaScript(articleLinkOne);
		pageLoad();
	}
	
	public void clickArticleLinkTwo() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(articleLinkTwo);
		clickElementUsingJavaScript(articleLinkTwo);
		pageLoad();
	}
	
	public void clickArticleLinkThree() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(articleLinkThree);
		clickElementUsingJavaScript(articleLinkThree);
		pageLoad();
	}
	
	public void clickArticleLinkFour() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(articleLinkFour);
		clickElementUsingJavaScript(articleLinkFour);
		pageLoad();
	}
	
}

