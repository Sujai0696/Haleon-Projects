package com.qa.drbest.ge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class drbestVibrationJuniorzahnPage extends BaseClass {
	
	public drbestVibrationJuniorzahnPage() {
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
	
		@FindBy(xpath = "//span[@class='bv-mbox-breadcrumb-item']")
		private static WebElement Reviewtxt;
	
		@FindBy(xpath = "//button[@class='bv-mbox-close bv-focusable']")
		private static WebElement ReviewClose;
	
		@FindBy(xpath = "//div[@class='bv-action-bar']//child::button[text()=' Jetzt Produkt bewerten  ']")
		private static WebElement Review1;
	
		@FindBy(xpath = "//span[@class='bv-mbox-breadcrumb-item']")
		private static WebElement Reviewtxt1;
	
		@FindBy(xpath = "//button[@class='bv-mbox-close bv-focusable']")
		private static WebElement ReviewClose1;
	
		@FindBy(xpath = "//h2[text()='Passende Kinderzahnbürsten für andere Altersgruppen:']")
		private static WebElement Heading;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_milchzahn']//img")
		private static WebElement Milchzahn;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_milchzahn']//child::a[text()='Mehr erfahren']")
		private static WebElement MilchzahnProduct;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_milchzahn']//child::buynow-button[@product=\"4\"]")
		private static WebElement MilchzahnBuyNow;
		
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet even col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_paw_patrol']//img")
		private static WebElement Pawpatrol;
		
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet even col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_paw_patrol']//child::a[text()='Mehr erfahren']")
		private static WebElement PawpatrolProduct;
		
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet even col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_paw_patrol']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement PawpatrolBuyNow;
		
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 kinder learn-more-product-snippet odd last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_cool_kids']//img")
		private static WebElement coolkids;
		
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 kinder learn-more-product-snippet odd last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_cool_kids']//child::a[text()='Mehr erfahren']")
		private static WebElement coolkidsproduct;
		
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 kinder learn-more-product-snippet odd last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_cool_kids']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement coolkidsBuyNow;
		
		
		
		
		
		
	
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
				public void clickonReview1() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Review1);
					clickElementUsingJavaScript(Review1);
					visibilityOf(Reviewtxt1);
					boolean elementIsDisplayed=elementIsDisplayed(Reviewtxt1);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(Reviewtxt1));
					clickElementUsingJavaScript(ReviewClose1);
					pageLoad();
					
				}
				public void clickonMilichzahn() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Heading);
					clickElementUsingJavaScript(Milchzahn);
					pageLoad();
				}
				public void clickonMilichzahnProduct() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Heading);
					clickElementUsingJavaScript(MilchzahnProduct);
					pageLoad();
				}
				public void clickonMilichzahnBuyNow() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Heading);
					moveToElement(MilchzahnBuyNow);
					if (isElementPresent(MilchzahnBuyNow)) {
						actionClick(MilchzahnBuyNow);
					
					} else {
						throw new Exception("MilchzahnBuyNow is not present on Page");
					}
					pageLoad();
				}
				public void clickonPawPatrol() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Heading);
					clickElementUsingJavaScript(Pawpatrol);
					pageLoad();
				}
				public void clickonPawPatrolProduct() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Heading);
					clickElementUsingJavaScript(PawpatrolProduct);
					pageLoad();
				}
				public void clickonPawPatrolBuyNow() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Heading);
					moveToElement(PawpatrolBuyNow);
					if (isElementPresent(PawpatrolBuyNow)) {
						actionClick(PawpatrolBuyNow);
					
					} else {
						throw new Exception("PawpatrolBuyNow is not present on Page");
					}
					pageLoad();
				}
				public void clickonCoolkids() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Heading);
					clickElementUsingJavaScript(coolkids);
					pageLoad();
				}
				public void clickonCoolkidsProduct() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Heading);
					clickElementUsingJavaScript(coolkidsproduct);
					pageLoad();
				}
				public void clickonCoolkidsBuyNow() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Heading);
					moveToElement(coolkidsBuyNow);
					if (isElementPresent(coolkidsBuyNow)) {
						actionClick(coolkidsBuyNow);
					
					} else {
						throw new Exception("coolkidsBuyNow is not present on Page");
					}
					pageLoad();
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

}
