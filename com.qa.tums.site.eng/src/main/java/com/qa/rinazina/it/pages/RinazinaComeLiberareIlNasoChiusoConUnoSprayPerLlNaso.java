package com.qa.rinazina.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class RinazinaComeLiberareIlNasoChiusoConUnoSprayPerLlNaso extends BaseClass{
	public RinazinaComeLiberareIlNasoChiusoConUnoSprayPerLlNaso() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Accetta tutti i cookie']")
	private static WebElement cookieBtn;
	
    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
    
    @FindBy(xpath = "//a[text()='Home']")
	private static WebElement Bread_Home;
    
    @FindBy(xpath = "//a[text()='Consigli sulla salute nasale']")
	private static WebElement Bread_ConsigliSullaSaluteNasale;
    
    @FindBy(xpath = "//span[@class='button-green']")
	private static WebElement PerSaperneDiPiùBtn;

    @FindBy(xpath = "//a[text()='Sinusite: quali sono i sintomi e come alleviarli. ']//ancestor::div[@class='article-teaser teaserClick']")
  	private static WebElement ArticleOne;
    
    @FindBy(xpath = "//a[text()='Rinite allergica, cos’è: gli aspetti scientifici alla base della rinite allergica e di allergie simili. ']//ancestor::div[@class='article-teaser teaserClick']")
  	private static WebElement ArticleTwo;
    
    @FindBy(xpath = "//a[text()='Come si respira: cos’è e come avviene la respirazione? ']//ancestor::div[@class='article-teaser teaserClick']")
  	private static WebElement ArticleThree;
    
    @FindBy(xpath = "//a[text()='Naso sempre chiuso: cos’è e quali sono le cause della congestione nasale persistente? ']//ancestor::div[@class='article-teaser teaserClick']")
  	private static WebElement ArticleFour;
   
    
    
    
    
    public void clickonCookieBtn() throws Exception {
		waitForPageLoadJava();
		if(isElementPresent(cookieBtn)) {
			elementToBeClickable(cookieBtn);
			try {
				if(cookieBtn.isDisplayed()) {
					clickElementUsingJavaScript(cookieBtn);
				}
				implicitWait();
				visibilityOf(cookieClose);
				Assert.assertTrue(elementIsDisplayed(cookieClose));
			}
			catch (Exception e) {
				
			}
		}else {
			System.out.println("Dismiss is not presented");
			throw new Exception("Unable to click on cookie Pop-up");
		}
		}
    public void clickOnBread_Home() throws Throwable {
		moveToElement(Bread_Home);
		clickElementUsingJavaScript(Bread_Home);
	}
    
    public void clickOnBread_ConsigliSullaSaluteNasale() throws Throwable {
		moveToElement(Bread_ConsigliSullaSaluteNasale);
		clickElementUsingJavaScript(Bread_ConsigliSullaSaluteNasale);
	}
    public void clickOnPerSaperneDiPiùBtn() throws Throwable {
		moveToElement(PerSaperneDiPiùBtn);
		clickElementUsingJavaScript(PerSaperneDiPiùBtn);
	}
    public void clickOnArticleOne() throws Throwable {
		moveToElement(ArticleOne);
		clickElementUsingJavaScript(ArticleOne);
	}
    public void clickOnArticleTwo() throws Throwable {
		moveToElement(ArticleTwo);
		clickElementUsingJavaScript(ArticleTwo);
	}
    public void clickOnArticleThree() throws Throwable {
		moveToElement(ArticleThree);
		clickElementUsingJavaScript(ArticleThree);
	}
    public void clickOnArticleFour() throws Throwable {
		moveToElement(ArticleFour);
		clickElementUsingJavaScript(ArticleFour);
	}
   
}
