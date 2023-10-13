package com.qa.drbest.ge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class drbestKinderjuniorzahnPage extends BaseClass{
	
	public drbestKinderjuniorzahnPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Akzeptieren']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
		private static WebElement cookieClose;
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section default-style even last col-xs-12 col-md-12 reference-buy_now_button_drbest']//child::buynow-button[@class='red']")
		private static WebElement BuyNow1;			
	
		@FindBy(xpath = "//button[@class='bv_button_buttonMinimalist bv_war_button ']")
		private static WebElement Review;	
	
		@FindBy(xpath = "//span[@class='bv-mbox-breadcrumb-item']")
		private static WebElement Reviewtxt;	
	
		@FindBy(xpath = "//button[@class='bv-mbox-close bv-focusable']")
		private static WebElement ReviewClose;	
	
		@FindBy(xpath = "//button[@class='bv-write-review-label bv-text-link bv-focusable bv-submission-button bv-first-to-review']")
		private static WebElement Review1;	
	
		@FindBy(xpath = "//span[@class='bv-mbox-breadcrumb-item']")
		private static WebElement Reviewtxt1;	
	
		@FindBy(xpath = "//button[@class='bv-mbox-close bv-focusable']")
		private static WebElement ReviewClose1;	
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_milchzahn']//img")
		private static WebElement Milchzahn;	
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_milchzahn']//child::a[text()='Mehr erfahren']")
		private static WebElement MilchzahnProduct;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_milchzahn']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement MilchzahnBuyNow;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet even col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_paw_patrol']//img")
		private static WebElement PawPatrol;
		
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet even col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_paw_patrol']//child::a[text()='Mehr erfahren']")
		private static WebElement PawPatrolProduct;
		
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet even col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_paw_patrol']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement PawPatrolBuyNow;
		
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet odd last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_cool_kids']//img")
		private static WebElement Coolkids;
		
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet odd last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_cool_kids']//child::a[text()='Mehr erfahren']")
		private static WebElement CoolkidsProduct;
		
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet odd last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_cool_kids']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement CoolkidsBuyNow;
		
		
		
	
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
				public void clickonMilchzahn() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Milchzahn);
					clickElementUsingJavaScript(Milchzahn);
					pageLoad();
				}
				public void clickonMilchzahnProduct() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(MilchzahnProduct);
					clickElementUsingJavaScript(MilchzahnProduct);
					pageLoad();
				}
				public void clickonMilchzahnBuyNow() throws Exception {
					waitForPageLoadJava();
					moveToElement(MilchzahnBuyNow);
					if (isElementPresent(MilchzahnBuyNow)) {
						actionClick(MilchzahnBuyNow);
						
					} else {
						throw new Exception("MilchzahnBuyNow is not displayed on Page");
					}
					pageLoad();
				}
				public void clickonPawPatrol() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(PawPatrol);
					clickElementUsingJavaScript(PawPatrol);
					pageLoad();
				}
				public void clickonPawPatrolProduct() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(PawPatrolProduct);
					clickElementUsingJavaScript(PawPatrolProduct);
					pageLoad();
				}
				public void clickonPawPatrolBuyNow() throws Exception {
					waitForPageLoadJava();
					moveToElement(PawPatrolBuyNow);
					if (isElementPresent(PawPatrolBuyNow)) {
						actionClick(PawPatrolBuyNow);
						
					} else {
						throw new Exception("PawPatrolBuyNow is not displayed on Page");
					}
					pageLoad();
				}
				public void clickonCoolKids() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Coolkids);
					clickElementUsingJavaScript(Coolkids);
					pageLoad();
				}
				public void clickonCoolKidsProduct() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(CoolkidsProduct);
					clickElementUsingJavaScript(CoolkidsProduct);
					pageLoad();
				}
				public void clickonCoolKidsBuyNow() throws Exception {
					waitForPageLoadJava();
					moveToElement(CoolkidsBuyNow);
					if (isElementPresent(CoolkidsBuyNow)) {
						actionClick(CoolkidsBuyNow);
						
					} else {
						throw new Exception("CoolkidsBuyNow is not displayed on Page");
					}
					pageLoad();
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	
	

}
