package com.qa.rinazina.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class RinazinaConsigliSullaSaluteNasale extends BaseClass{
	public RinazinaConsigliSullaSaluteNasale() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Accetta tutti i cookie']")
	private static WebElement cookieBtn;
	
    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
    
    @FindBy(xpath = "//a[text()='Home']")
	private static WebElement Bread_Home;
    
    @FindBy(xpath = "//a[text()='Cos’è la sinusite: cause e aspetti scientifici alla base della sinusite. ']//ancestor::div[@class='article-teaser-big teaserClick active']")
	private static WebElement FirstArticleImage;
    
    //Article one text
    @FindBy(xpath = "//div[contains(@class,'article-teaser-big teaserClick')]//a[text()='Cos’è la sinusite: cause e aspetti scientifici alla base della sinusite. ']")
	private static WebElement FirstArticle;
    
    @FindBy(xpath = "//img[contains(@src,'content/dam/cf-consumer-healthcare/otrivin-v3/it_IT/desktop/Articles/snippet-images/article-snippet-img-5.jpg?auto=format')]")
	private static WebElement SecondArticleImage;
    
    @FindBy(xpath = "//img[contains(@src,'content/dam/cf-consumer-healthcare/otrivin-v3/it_IT/desktop/Articles/snippet-images/article-snippet-img-6.jpg?auto=format')]")
	private static WebElement ThirdArticleImage;
    
    @FindBy(xpath = "//img[contains(@src,'content/dam/cf-consumer-healthcare/otrivin-v3/it_IT/desktop/Articles/snippet-images/article-snippet-img-13.jpg?auto=format')]")
	private static WebElement FourthArticleImage;
    
    @FindBy(xpath = "//img[contains(@src,'content/dam/cf-consumer-healthcare/otrivin-v3/it_IT/desktop/Articles/snippet-images/article-snippet-img-9.jpg?auto=format')]")
	private static WebElement FifthArticleImage;
    
    @FindBy(xpath = "//img[contains(@src,'content/dam/cf-consumer-healthcare/otrivin-v3/it_IT/desktop/Articles/snippet-images/article-snippet-img-12.jpg?auto=format')]")
	private static WebElement SixthArticleImage;
    
    @FindBy(xpath = "//img[contains(@src,'content/dam/cf-consumer-healthcare/otrivin-v3/it_IT/desktop/Articles/snippet-images/article-snippet-img-10.jpg?auto=format')]")
	private static WebElement SeventArticleImage;
    
    @FindBy(xpath = "//img[contains(@src,'content/dam/cf-consumer-healthcare/otrivin-v3/it_IT/desktop/Articles/snippet-images/article-snippet-img-14.jpg?auto=format')]")
	private static WebElement EighthArticleImage;
    
    @FindBy(xpath = "//img[contains(@src,'content/dam/cf-consumer-healthcare/otrivin-v3/it_IT/desktop/Articles/snippet-images/article-snippet-img-15.jpg?auto=format')]")
	private static WebElement NinethArticleImage;
    
    @FindBy(xpath = "//img[contains(@src,'content/dam/cf-consumer-healthcare/otrivin-v3/it_IT/desktop/Articles/snippet-images/article-snippet-img-16.jpg?auto=format')]")
	private static WebElement TenthArticleImage;
    
    @FindBy(xpath = "//img[contains(@src,'content/dam/cf-consumer-healthcare/otrivin-v3/it_IT/desktop/Articles/snippet-images/article-snippet-img-8.jpg?auto=format')]")
	private static WebElement EleventhArticleImage;
    
    @FindBy(xpath = "//img[contains(@src,'content/dam/cf-consumer-healthcare/otrivin-v3/it_IT/desktop/Articles/snippet-images/article-snippet-img-1.jpg?auto=format')]")
	private static WebElement TwelthArticleImage;
    
    @FindBy(xpath = "//img[contains(@src,'content/dam/cf-consumer-healthcare/otrivin-v3/it_IT/desktop/Articles/snippet-images/article-snippet-img-2.jpg?auto=format')]")
	private static WebElement ThirteenthArticleImage;
    
    @FindBy(xpath = "//img[contains(@src,'content/dam/cf-consumer-healthcare/otrivin-v3/it_IT/desktop/Articles/snippet-images/article-snippet-img-3.jpg?auto=format')]")
	private static WebElement FourteenthArticleImage;
    
    @FindBy(xpath = "//img[contains(@src,'content/dam/cf-consumer-healthcare/otrivin-v3/it_IT/desktop/Articles/snippet-images/article-snippet-img-4.jpg?auto=format')]")
	private static WebElement FifteenthArticleImage;
    
    @FindBy(xpath = "//div[contains(@class,'article-teaser-vertical teaserClick')]//a[text()='Cos’è il raffreddore: gli aspetti scientifici alla base del raffreddore. ']")
	private static WebElement SecondArticle;
    
    @FindBy(xpath = "(//a[text()='Rinite allergica, cos’è: gli aspetti scientifici alla base della rinite allergica e di allergie simili. '])[3]")
	private static WebElement ThirdArticle;
    
    @FindBy(xpath = "(//a[text()='Polline, Allergia e Rinite: quali sono le correlazioni? '])[3]")
	private static WebElement FourthArticle;
    
    @FindBy(xpath = "//div[contains(@class,'article-teaser teaserClick')]//a[text()='Qual è la correlazione tra allergie alimentari e rinite allergica? ']")
	private static WebElement FifthArticle;
    
    @FindBy(xpath = "(//a[text()='Come si respira: cos’è e come avviene la respirazione? '])[3]")
	private static WebElement SixthArticle;
    
    @FindBy(xpath = "(//a[text()='Naso sempre chiuso: cos’è e quali sono le cause della congestione nasale persistente? '])[3]")
	private static WebElement SeventhArticle;
    
    @FindBy(xpath = "(//a[text()='Puoi detergere il naso e ripristinare la sua funzione di filtro grazie a un lavaggio con soluzione salina. '])[3]")
	private static WebElement EighthArticle;
    
    @FindBy(xpath = "(//a[text()='Lavaggi nasali: a cosa servono e come farli. '])[3]")
	private static WebElement NinethArticle;
    
    @FindBy(xpath = "(//a[text()='Gocce nasali per dare sollievo alla congestione nasale. '])[3]")
	private static WebElement TenthArticle;
    
    @FindBy(xpath = "(//a[text()='Come liberare il naso chiuso con uno spray per il naso. '])[3]")
	private static WebElement EleventhArticle;
    
    @FindBy(xpath = "(//a[text()='Raffreddore, sintomi e rimedi per farlo passare. '])")
	private static WebElement TwelthArticle;
    
    @FindBy(xpath = "(//a[text()='Sintomi e rimedi contro la rinite allergica. '])")
	private static WebElement ThirteenthArticle;

    @FindBy(xpath = "(//a[text()='Sinusite: quali sono i sintomi e come alleviarli. '])")
   	private static WebElement FourteenthArticle;
    
    @FindBy(xpath = "(//a[text()='Russamento notturno: da cosa è provocato e quali possono essere i rimedi. '])")
   	private static WebElement FifteenthArticle;
    
    
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
    
    public void clickOnFirstArticleImage() throws Throwable {
		moveToElement(FirstArticleImage);
		clickElementUsingJavaScript(FirstArticleImage);
	}
    
    public void clickOnFirstArticle() throws Throwable {
		moveToElement(FirstArticle);
		clickElementUsingJavaScript(FirstArticle);
	}
    
    public void clickOnSecondArticleImage() throws Throwable {
		moveToElement(SecondArticleImage);
		clickElementUsingJavaScript(SecondArticleImage);
	}
    public void clickOnThirdArticleImage() throws Throwable {
		moveToElement(ThirdArticleImage);
		clickElementUsingJavaScript(ThirdArticleImage);
	}
    public void clickOnFourthArticleImage() throws Throwable {
		moveToElement(FourthArticleImage);
		clickElementUsingJavaScript(FourthArticleImage);
	}
    
    public void clickOnFifthArticleImage() throws Throwable {
		moveToElement(FifthArticleImage);
		clickElementUsingJavaScript(FifthArticleImage);
	}
    
    public void clickOnSixthArticleImage() throws Throwable {
		moveToElement(SixthArticleImage);
		clickElementUsingJavaScript(SixthArticleImage);
	}
    
    public void clickOnSeventArticleImage() throws Throwable {
		moveToElement(SeventArticleImage);
		clickElementUsingJavaScript(SeventArticleImage);
	}
    public void clickOnEighthArticleImage() throws Throwable {
		moveToElement(EighthArticleImage);
		clickElementUsingJavaScript(EighthArticleImage);
	}
    public void clickOnNinethArticleImage() throws Throwable {
		moveToElement(NinethArticleImage);
		clickElementUsingJavaScript(NinethArticleImage);
	}
    
    public void clickOnTenthArticleImage() throws Throwable {
		moveToElement(TenthArticleImage);
		clickElementUsingJavaScript(TenthArticleImage);
	}
    
    public void clickOnEleventhArticleImage() throws Throwable {
		moveToElement(EleventhArticleImage);
		clickElementUsingJavaScript(EleventhArticleImage);
	}
    
    public void clickOnTwelthArticleImage() throws Throwable {
		moveToElement(TwelthArticleImage);
		clickElementUsingJavaScript(TwelthArticleImage);
	}
    public void clickOnThirteenthArticleImage() throws Throwable {
		moveToElement(ThirteenthArticleImage);
		clickElementUsingJavaScript(ThirteenthArticleImage);
	}
    public void clickOnFourteenthArticleImage() throws Throwable {
		moveToElement(FourteenthArticleImage);
		clickElementUsingJavaScript(FourteenthArticleImage);
	}
    
    public void clickOnFifteenthArticleImage() throws Throwable {
		moveToElement(FifteenthArticleImage);
		clickElementUsingJavaScript(FifteenthArticleImage);
	}
    
    public void clickOnSecondArticle() throws Throwable {
		moveToElement(SecondArticle);
		clickElementUsingJavaScript(SecondArticle);
	}
    
    public void clickOnThirdArticle() throws Throwable {
		moveToElement(ThirdArticle);
		clickElementUsingJavaScript(ThirdArticle);
	}
    public void clickOnFourthArticle() throws Throwable {
		moveToElement(FourthArticle);
		clickElementUsingJavaScript(FourthArticle);
	}
    public void clickOnFifthArticle() throws Throwable {
		moveToElement(FifthArticle);
		clickElementUsingJavaScript(FifthArticle);
	}
    
    public void clickOnSixthArticle() throws Throwable {
		moveToElement(SixthArticle);
		clickElementUsingJavaScript(SixthArticle);
	}
    
    public void clickOnSeventhArticle() throws Throwable {
		moveToElement(SeventhArticle);
		clickElementUsingJavaScript(SeventhArticle);
	}
    
    public void clickOnEighthArticle() throws Throwable {
		moveToElement(EighthArticle);
		clickElementUsingJavaScript(EighthArticle);
	}
    public void clickOnNinethArticle() throws Throwable {
		moveToElement(NinethArticle);
		clickElementUsingJavaScript(NinethArticle);
	}
    public void clickOnTenthArticle() throws Throwable {
		moveToElement(TenthArticle);
		clickElementUsingJavaScript(TenthArticle);
	}
    
    public void clickOnEleventhArticle() throws Throwable {
		moveToElement(EleventhArticle);
		clickElementUsingJavaScript(EleventhArticle);
	}
    
    public void clickOnTwelthArticle() throws Throwable {
		moveToElement(TwelthArticle);
		clickElementUsingJavaScript(TwelthArticle);
	}
    public void clickOnThirteenthArticle() throws Throwable {
		moveToElement(ThirteenthArticle);
		clickElementUsingJavaScript(ThirteenthArticle);
	}
    public void clickOnFourteenthArticle() throws Throwable {
		moveToElement(FourteenthArticle);
		clickElementUsingJavaScript(FourteenthArticle);
	}
    
    public void clickOnFifteenthArticle() throws Throwable {
		moveToElement(FifteenthArticle);
		clickElementUsingJavaScript(FifteenthArticle);
	}
}
  

