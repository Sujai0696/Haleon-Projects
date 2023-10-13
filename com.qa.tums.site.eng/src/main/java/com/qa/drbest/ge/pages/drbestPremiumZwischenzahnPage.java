package com.qa.drbest.ge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class drbestPremiumZwischenzahnPage extends BaseClass{
	
	public drbestPremiumZwischenzahnPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Akzeptieren']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
		private static WebElement cookieClose;
		
		
		@FindBy(xpath = "//button[text()='  Produkt als Erster bewerten  ']")
		private static WebElement Review;	
	
		@FindBy(xpath = "//span[text()='Meine Bewertung für Dr.Best Zwischenzahn Mittel']")
		private static WebElement Reviewtxt;
	
		@FindBy(xpath = "//button[@class='bv-mbox-close bv-focusable']")
		private static WebElement ReviewClose;
	
		@FindBy(xpath = "//h2[text()='Weitere Produkte für eine gründliche Reinigung der Zahnzwischenräume: ']")
		private static WebElement Heading;
		
		@FindBy(xpath = "//div[@class='parametrizedhtml component section default-style even last col-xs-12 reference-buy_now_button_drbest']//child::buynow-button[@class='red']")
		private static WebElement BuyNow;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_professional_atemfrisch']//img")
		private static WebElement product1;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_professional_atemfrisch']//child::a[text()='Mehr erfahren']")
		private static WebElement productcard1;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet even last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_atemfrisch']//img")
		private static WebElement product2;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet even last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_vibration_atemfrisch']//child::a[text()='Mehr erfahren']")
		private static WebElement productcard2;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_professional_atemfrisch']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement buynow1;
	
		@FindBy(xpath = "(//buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html'])[3]")
		private static WebElement buynow2;
	
	
	
		//Methods//
		
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
		
		

		public void clickonReviewcon() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Review);
			clickElementUsingJavaScript(Review);
			visibilityOf(Reviewtxt);
			boolean elementIsDisplayed=elementIsDisplayed(Reviewtxt);
			Assert.assertTrue(elementIsDisplayed(Reviewtxt));
			System.out.println(getElementText(Reviewtxt));
			clickElementUsingJavaScript(ReviewClose);
			pageLoad();
		
		}
		public void clickonBuyNow() throws Exception {
			waitForPageLoadJava();
			moveToElement(BuyNow);
			clickElementUsingJavaScript(BuyNow);
			pageLoad();
		}
		
		public void clickonProduct1() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Heading);
			clickElementUsingJavaScript(product1);
			pageLoad();
		}
		public void clickonProductcard1() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Heading);
			clickElementUsingJavaScript(productcard1);
			pageLoad();
		}
		public void clickonProduct2() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Heading);
			clickElementUsingJavaScript(product2);
			pageLoad();
		}
		public void clickonProductcard2() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Heading);
			clickElementUsingJavaScript(productcard2);
			pageLoad();
		}
		public void clickonBuyNow1() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Heading);
				moveToElement(buynow1);
				actionClick(buynow1);
			pageLoad();
		}
		public void clickonBuyNow2() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Heading);
				moveToElement(buynow2);
				actionClick(buynow2);
				Thread.sleep(1000);
				//actionClick(buynow2);
			pageLoad();
		}
	
	
	
	
	
	
	

}
