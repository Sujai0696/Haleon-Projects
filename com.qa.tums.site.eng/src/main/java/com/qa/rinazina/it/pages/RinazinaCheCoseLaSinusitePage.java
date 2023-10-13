package com.qa.rinazina.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class RinazinaCheCoseLaSinusitePage extends BaseClass{
	
	public RinazinaCheCoseLaSinusitePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Accetta tutti i cookie']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	

	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='Home']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Consigli sulla salute nasale']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']//ancestor::a[text()='Cos è la sinusite: cause e aspetti scientifici alla base della sinusite.']")
	private static WebElement breadcrumbThree;
		
	@FindBy(xpath = "//a[@href='/prodotti/medicinali/rinazina-spray-nasale/']//ancestor::strong[text()='spray decongestionante']")
	private static WebElement sprayDecongestionanteLink;
	
	@FindBy(xpath = "//*[@href='/prodotti/medicinali/rinazina-spray-nasale/']//self::a[text()='Per saperne di più']")
	private static WebElement perSaperneDiLink;
	
	@FindBy(xpath = "//a[text()='Cos’è il raffreddore: gli aspetti scientifici alla base del raffreddore. ']//ancestor::div[@class='article-teaser teaserClick']")
	private static WebElement articleOne;
	
	@FindBy(xpath = "//a[text()='Lavaggi nasali: a cosa servono e come farli. ']//ancestor::div[@class='article-teaser teaserClick']")
	private static WebElement articleTwo;
	
	@FindBy(xpath = "//a[text()='Sinusite: quali sono i sintomi e come alleviarli. ']//ancestor::div[@class='article-teaser teaserClick']")
	private static WebElement articleThree;
	
	@FindBy(xpath = "//a[text()='Come liberare il naso chiuso con uno spray per il naso. ']//ancestor::div[@class='article-teaser teaserClick']")
	private static WebElement articleFour;
	
	
	
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
	
	public void clickSprayDecongestionanteLink() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(sprayDecongestionanteLink);
		clickElementUsingJavaScript(sprayDecongestionanteLink);
		pageLoad();
	}
	
	
	public void clickPerSaperneDiLink() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(perSaperneDiLink);
		clickElementUsingJavaScript(perSaperneDiLink);
		pageLoad();
	}
	
	public void clickArticleOne() throws  Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(articleOne);
		clickElementUsingJavaScript(articleOne);
		pageLoad();
	}
	
	public void clickArticleTwo() throws  Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(articleTwo);
		clickElementUsingJavaScript(articleTwo);
		pageLoad();
	}
	
	public void clickArticleThree() throws  Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(articleThree);
		clickElementUsingJavaScript(articleThree);
		pageLoad();
	}
	
	public void clickArticleFour() throws  Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(articleFour);
		clickElementUsingJavaScript(articleFour);
		pageLoad();
	}

}
