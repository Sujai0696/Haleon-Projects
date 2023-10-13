package com.qa.drbest.ge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class drbestbeifestenZahnspangenPage extends BaseClass{
	
	public drbestbeifestenZahnspangenPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Akzeptieren']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
		private static WebElement cookieClose;		
		
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_professional_polimed_kurzkopf']//img")
		private static WebElement PolimedKurzkopf;		
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_professional_polimed_kurzkopf']//child::a[text()='Mehr erfahren']")
		private static WebElement PolimedKurzkopfProduct;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet first odd col-xs-6 col-sm-4 col-lg-3 reference-learn_more_professional_polimed_kurzkopf']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement PolimedKurzkopfBuyNow;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet even col-xs-6 col-sm-4 col-lg-3 reference-learn_more_professional_multi_expert']//child::a[@href='/zahnbuersten/professional-multi-expert/']")
		private static WebElement MultiexpertProduct;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet even col-xs-6 col-sm-4 col-lg-3 reference-learn_more_professional_multi_expert']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement MultiexpertBuyNow;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet odd last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_cool_kids']//img")
		private static WebElement CoolKids;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet odd last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_cool_kids']//child::a[text()='Mehr erfahren']")
		private static WebElement CoolKidsProduct;
	
		@FindBy(xpath = "//div[@class='snippetReference component section element-margin-90 learn-more-product-snippet odd last col-xs-6 col-sm-4 col-lg-3 reference-learn_more_kinder_cool_kids']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement CoolKidsBuyNow;
	
		@FindBy(xpath = "//div[@class='richText component section default-style first odd last col-xs-12 col-md-12']//child::a[text()='Zur Website']")
		private static WebElement ZurWebsite;
	
		@FindBy(xpath = "//div[@class='image component section image-margin-25 zglazyload first odd']//child::a[@href='/zahnpflege/kinderzahnentwicklung/']")
		private static WebElement Article1;
	
		@FindBy(xpath = "//div[@class='richText component section default-style even last']//child::a[@href='/zahnpflege/kinderzahnentwicklung/']")
		private static WebElement Link1;
	
		@FindBy(xpath = "//div[@class='image component section image-margin-25 zglazyload first odd']//child::a[@href='/zahnpflege/zahnputztechnik-kinder/']")
		private static WebElement Article2;
	
		@FindBy(xpath = "//div[@class='richText component section default-style even last']//child::a[@href='/zahnpflege/zahnputztechnik-kinder/']")
		private static WebElement Link2;
	
		@FindBy(xpath = "//div[@class='image component section image-margin-25 zglazyload first odd']//child::a[@href='/zahnpflege/schutz-vor-karies/']")
		private static WebElement Article3;
		
		@FindBy(xpath = "//div[@class='richText component section default-style even last']//child::a[@href='/zahnpflege/schutz-vor-karies/']")
		private static WebElement Link3;
		
	
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
				public void ClickonPolimedKurzkopf() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(PolimedKurzkopf);
					visibilityOf(PolimedKurzkopf);
					clickElementUsingJavaScript(PolimedKurzkopf);
					pageLoad();
				}
				public void ClickonPolimedKurzkopfProduct() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(PolimedKurzkopfProduct);
					visibilityOf(PolimedKurzkopfProduct);
					clickElementUsingJavaScript(PolimedKurzkopfProduct);
					pageLoad();
				}
				public void ClickonPolimedKurzkopfBuyNow() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(PolimedKurzkopfBuyNow);
					moveToElement(PolimedKurzkopfBuyNow);
					if (isElementPresent(PolimedKurzkopfBuyNow)) {
						actionClick(PolimedKurzkopfBuyNow);
					} else {
						throw new Exception("PolimedKurzkopfBuyNow is not Displayed on Page");
					}
					pageLoad();
				}
				public void ClickonMultiExpertProduct() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(MultiexpertProduct);
					visibilityOf(MultiexpertProduct);
					clickElementUsingJavaScript(MultiexpertProduct);
					pageLoad();
				}
				public void ClickonMultiExpertBuyNow() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(MultiexpertBuyNow);
					moveToElement(MultiexpertBuyNow);
					if (isElementPresent(MultiexpertBuyNow)) {
						actionClick(MultiexpertBuyNow);
					} else {
						throw new Exception("MultiexpertBuyNow is not Displayed on Page");
					}
					pageLoad();
				}
				public void ClickonCoolKids() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(CoolKids);
					visibilityOf(CoolKids);
					clickElementUsingJavaScript(CoolKids);
					pageLoad();
				}
				public void ClickonCoolKidsProduct() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(CoolKidsProduct);
					visibilityOf(CoolKids);
					clickElementUsingJavaScript(CoolKidsProduct);
					pageLoad();
				}
				public void ClickonCoolKidsBuyNow() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(CoolKidsBuyNow);
					moveToElement(CoolKidsBuyNow);
					if (isElementPresent(CoolKidsBuyNow)) {
						actionClick(CoolKidsBuyNow);
					} else {
						throw new Exception("CoolKidsBuyNow is not Displayed on Page");
					}
					pageLoad();
				}
//				public String ClickonZurWebsite() throws Exception {
//					waitForPageLoadJava();
//					scrollDownUsingElement(ZurWebsite);
//					
//					clickElementUsingJavaScript(ZurWebsite);
//					pageLoad();
//					String currenturl=getCurrentUrl();
//					return currenturl;
//							
//				}
				public void ClickonArticle1() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Article1);
					clickElementUsingJavaScript(Article1);
					pageLoad();
				}
				public void ClickonLink1() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Link1);
					clickElementUsingJavaScript(Link1);
					pageLoad();
				}
				public void ClickonArticle2() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Article2);
					clickElementUsingJavaScript(Article2);
					pageLoad();
				}
				public void ClickonLink2() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Link2);
					clickElementUsingJavaScript(Link2);
					pageLoad();
				}
				public void ClickonArticle3() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Article3);
					clickElementUsingJavaScript(Article3);
					pageLoad();
				}
				public void ClickonLink3() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Link3);
					clickElementUsingJavaScript(Link3);
					pageLoad();
				}
				
				
				
				
				
				
				
				
				
				
				
				

}
