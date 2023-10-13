package com.qa.drbest.ge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class DrBestProfessionalPolimedKurzkop extends BaseClass{

	public DrBestProfessionalPolimedKurzkop() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Akzeptieren']")
	private static WebElement cookieBtn;
	
	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "//buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
	private static WebElement BuyNow1;					

	@FindBy(xpath = "//div[@class='parametrizedhtml component section default-style even col-xs-12 col-sm-3 col-md-3 reference-bvinlinerating']//child::button[@class='bv_button_buttonMinimalist bv_war_button ']")
	private static WebElement Review;		

	@FindBy(xpath = "//span[text()='Meine Bewertung für Dr.BEST Polimed Kurzkopf']")
	private static WebElement Reviewtxt;

	@FindBy(xpath = "//button[@class='bv-mbox-close bv-focusable']//span[text()=' ✘ ']")
	private static WebElement ReviewClose;

//	@FindBy(xpath = "//div[@class='bv-action-bar']//child::button[text()=' Jetzt Produkt bewerten  ']")
//	private static WebElement Review1;
//
//	@FindBy(xpath = "//span[@class='bv-mbox-breadcrumb-item']")
//	private static WebElement Reviewtxt1;
//
//	@FindBy(xpath = "//button[@class='bv-mbox-close bv-focusable']")
//	private static WebElement ReviewClose1;

	@FindBy(xpath = "//h2[text()='Weitere Produkte für bessere Reinigungsergebnisse']")
	private static WebElement Heading;

	@FindBy(xpath = "(//figure)[1]")
	private static WebElement DrBESTVibrationPolimedImage;

	@FindBy(xpath = "(//a[text()='Mehr erfahren'])[1]")
	private static WebElement MehrErfahren1;
	
	@FindBy(xpath = "(//div[@class='component-content']//buynow-button)[2]")
	private static WebElement JetztKaufen1;
	
	@FindBy(xpath = "(//figure)[2]")
	private static WebElement DrBESTVibrationMultiExpertImage;

	@FindBy(xpath = "(//a[text()='Mehr erfahren'])[2]")
	private static WebElement MehrErfahren2;
	
	@FindBy(xpath = "(//div[@class='component-content']//buynow-button)[2]")
	private static WebElement JetztKaufen2;
	
	
	
	
	
	
	

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
				
			public void clickonBuyNow1() throws Exception {
				waitForPageLoadJava();
				moveToElement(BuyNow1);
				if (isElementPresent(BuyNow1)) {
					actionClick(BuyNow1);
					
				} else {
					throw new Exception("BuyNow1 is not displayed on Page");
				}
				pageLoad();
			}
			public void clickonReview() throws Exception {
				waitForPageLoadJava();
				scrollDownUsingElement(Review);
				clickElementUsingJavaScript(Review);
				visibilityOf(Reviewtxt);
				boolean elementIsDisplayed=elementIsDisplayed(Reviewtxt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(Reviewtxt));
				clickElementUsingJavaScript(ReviewClose);
				pageLoad();
				
			}
//			public void clickonReview1() throws Exception {
//				waitForPageLoadJava();
//				scrollDownUsingElement(Review1);
//				clickElementUsingJavaScript(Review1);
//				visibilityOf(Reviewtxt1);
//				boolean elementIsDisplayed=elementIsDisplayed(Reviewtxt1);
//				Assert.assertTrue(elementIsDisplayed);
//				System.out.println(getElementText(Reviewtxt1));
//				clickElementUsingJavaScript(ReviewClose1);
//				pageLoad();
//				
//			}
			public void clickonDrBESTVibrationPolimedImage() throws Exception {
				waitForPageLoadJava();
				scrollDownUsingElement(Heading);
				clickElementUsingJavaScript(DrBESTVibrationPolimedImage);
				pageLoad();
			}
			public void clickonMehrErfahren1() throws Exception {
				waitForPageLoadJava();
				scrollDownUsingElement(Heading);
				clickElementUsingJavaScript(MehrErfahren1);
				pageLoad();
			}
			public void clickonJetztKaufen1() throws Exception {
				waitForPageLoadJava();
				scrollDownUsingElement(Heading);
				moveToElement(JetztKaufen1);
				if (isElementPresent(JetztKaufen1)) {
					actionClick(JetztKaufen1);
				
				} else {
					throw new Exception("JetztKaufen1 is not present on Page");
				}
				pageLoad();
			}
			public void clickonDrBESTVibrationMultiExpertImage() throws Exception {
				waitForPageLoadJava();
				scrollDownUsingElement(Heading);
				clickElementUsingJavaScript(DrBESTVibrationMultiExpertImage);
				pageLoad();
			}
			public void clickonMehrErfahren2() throws Exception {
				waitForPageLoadJava();
				scrollDownUsingElement(Heading);
				clickElementUsingJavaScript(MehrErfahren2);
				pageLoad();
			}
			public void clickonJetztKaufen2() throws Exception {
				waitForPageLoadJava();
				scrollDownUsingElement(Heading);
				moveToElement(JetztKaufen2);
				if (isElementPresent(JetztKaufen2)) {
					actionClick(JetztKaufen2);
				
				} else {
					throw new Exception("PawpatrolBuyNow is not present on Page");
				}
				pageLoad();
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

}


