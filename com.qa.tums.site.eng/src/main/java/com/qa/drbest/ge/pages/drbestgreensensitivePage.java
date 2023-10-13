package com.qa.drbest.ge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class drbestgreensensitivePage extends BaseClass{
	
	public drbestgreensensitivePage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Akzeptieren']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
		private static WebElement cookieClose;
	
		@FindBy(xpath = "//buynow-button[@finderpage=\"/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html\"]")
		private static WebElement BuyNow1;			
		
		@FindBy(xpath = "//a[@title='Für wen eignet sich die <em>Dr.</em>BEST GreenSensitive?']")
		private static WebElement furwen;	
	
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Für wen eignet sich die <em>Dr.</em>BEST GreenSensitive?']")
		private static WebElement furwenClose;
	
		@FindBy(xpath = "//li[@class='accordion-slide first odd is-active']")
		private static WebElement furwenActive;
	
		@FindBy(xpath = "//a[@title='Wie effizient ist die Reinigungsleistung der <em>Dr.</em>BEST GreenSensitive?']")
		private static WebElement wieeffizient;
	
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Wie effizient ist die Reinigungsleistung der <em>Dr.</em>BEST GreenSensitive?']")
		private static WebElement wieeffizientClose;
	
		@FindBy(xpath = "//li[@class='accordion-slide even is-active']")
		private static WebElement wieeffizientActive;
	
		@FindBy(xpath = "//a[@title='Wie setzt sich der Name unserer <em>Dr.</em>BEST GreenSensitive zusammen?']")
		private static WebElement wiesetzt;
	
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Wie setzt sich der Name unserer <em>Dr.</em>BEST GreenSensitive zusammen?']")
		private static WebElement wiesetztClose;
	
		@FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
		private static WebElement wiesetztActive;
	
		@FindBy(xpath = "//a[@title='Worin unterscheidet sich die <em>Dr.</em>BEST GreenSensitive zu unserem bereits bestehenden Zahnbürstenportfolio?']")
		private static WebElement Worin;
	
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Worin unterscheidet sich die <em>Dr.</em>BEST GreenSensitive zu unserem bereits bestehenden Zahnbürstenportfolio?']")
		private static WebElement WorinClose;
		
		@FindBy(xpath = "//li[@class='accordion-slide even is-active']")
		private static WebElement WorinActive;
		
		@FindBy(xpath = "//a[@title='Wieso wird Biokunststoff im Griff verwendet? Was ist das und warum ist es besser als herkömmlicher Kunststoff?']")
		private static WebElement Wieso;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Wieso wird Biokunststoff im Griff verwendet? Was ist das und warum ist es besser als herkömmlicher Kunststoff?']")
		private static WebElement WiesoClose;
		
		@FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
		private static WebElement WiesoActive;
		
		@FindBy(xpath = "//a[@title='Warum verwenden wir Rizinusöl für die Borsten?']")
		private static WebElement warum;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Warum verwenden wir Rizinusöl für die Borsten?']")
		private static WebElement warumClose;
		
		@FindBy(xpath = "//li[@class='accordion-slide even is-active']")
		private static WebElement warumActive;
		
		@FindBy(xpath = "//a[@title='Woraus besteht die Verpackung?']")
		private static WebElement Woraus;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Woraus besteht die Verpackung?']")
		private static WebElement WorausClose;
		
		@FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
		private static WebElement WorausActive;
		
		@FindBy(xpath = "//a[@title='Wo wird die <em>Dr.</em>BEST GreenSensitive hergestellt?']")
		private static WebElement Wowirddie;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Wo wird die <em>Dr.</em>BEST GreenSensitive hergestellt?']")
		private static WebElement WowirddieClose;
		
		@FindBy(xpath = "//li[@class='accordion-slide even is-active']")
		private static WebElement WowirddieActive;
		
		@FindBy(xpath = "//a[@title='Was bedeutet klimaneutral?']")
		private static WebElement Wasbedeutet;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Was bedeutet klimaneutral?']")
		private static WebElement WasbedeutetClose;
		
		@FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
		private static WebElement WasbedeutetActive;
		
		@FindBy(xpath = "//a[@title='Was ist der Massenbilanzansatz?']")
		private static WebElement Wasistder;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Was ist der Massenbilanzansatz?']")
		private static WebElement WasistderClose;
		
		@FindBy(xpath = "//li[@class='accordion-slide last even is-active']")
		private static WebElement WasistderActive;
		
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet even col-xs-12 col-sm-6 col-lg-3 reference-learn_more_natural_greenclean']//img")
		private static WebElement Greenclean;
		
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet even col-xs-12 col-sm-6 col-lg-3 reference-learn_more_natural_greenclean']//child::a[text()='Mehr erfahren']")
		private static WebElement GreencleanProduct;
		
		
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet even col-xs-12 col-sm-6 col-lg-3 reference-learn_more_natural_greenclean']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement GreencleanBuyNow;
		
		@FindBy(xpath = "//div[@class='snippetReference component section green-text-box learn-more-product-snippet odd last col-xs-12 col-sm-6 col-lg-3 reference-learn_more_natural_interdental']//img")
		private static WebElement Interdentalbursten;
		
		@FindBy(xpath = "//div[@class='snippetReference component section green-text-box learn-more-product-snippet odd last col-xs-12 col-sm-6 col-lg-3 reference-learn_more_natural_interdental']//child::a[text()='Mehr erfahren']")
		private static WebElement InterdentalburstenProduct;
		
		
		@FindBy(xpath = "//div[@class='snippetReference component section green-text-box learn-more-product-snippet odd last col-xs-12 col-sm-6 col-lg-3 reference-learn_more_natural_interdental']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement InterdentalburstenBuyNow;
		
		
		
		
		
		
		
		
		
		
		
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
				public void clickonFurwen() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(furwen);
					clickElementUsingJavaScript(furwen);
					visibilityOf(furwenActive);
					boolean elementIsDisplayed=elementIsDisplayed(furwenActive);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(" furwen Tiltle:"  + getElementText(furwen));
					Thread.sleep(2000);
					clickElementUsingJavaScript(furwenClose);
					pageLoad();
				}
				public void clickonWieeffizient() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(wieeffizient);
					clickElementUsingJavaScript(wieeffizient);
					visibilityOf(wieeffizientActive);
					boolean elementIsDisplayed=elementIsDisplayed(wieeffizientActive);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(" wieeffizient Tiltle:"  + getElementText(wieeffizient));
					Thread.sleep(2000);
					clickElementUsingJavaScript(wieeffizientClose);
					pageLoad();
				}
				public void clickonWiesetzt() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(wiesetzt);
					clickElementUsingJavaScript(wiesetzt);
					visibilityOf(wiesetztActive);
					boolean elementIsDisplayed=elementIsDisplayed(wiesetztActive);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(" wiesetzt Tiltle:"  + getElementText(wiesetzt));
					Thread.sleep(2000);
					clickElementUsingJavaScript(wiesetztClose);
					pageLoad();
				}
				public void clickonWorin() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Worin);
					clickElementUsingJavaScript(Worin);
					visibilityOf(WorinActive);
					boolean elementIsDisplayed=elementIsDisplayed(WorinActive);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(" Worin Tiltle:"  + getElementText(Worin));
					Thread.sleep(2000);
					clickElementUsingJavaScript(WorinClose);
					pageLoad();
				}
				public void clickonWieso() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Wieso);
					clickElementUsingJavaScript(Wieso);
					visibilityOf(WiesoActive);
					boolean elementIsDisplayed=elementIsDisplayed(WiesoActive);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(" Wieso Tiltle:"  + getElementText(Wieso));
					Thread.sleep(2000);
					clickElementUsingJavaScript(WiesoClose);
					pageLoad();
				}
				public void clickonWarum() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(warum);
					clickElementUsingJavaScript(warum);
					visibilityOf(warumActive);
					boolean elementIsDisplayed=elementIsDisplayed(warumActive);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(" Warum Tiltle:"  + getElementText(warum));
					Thread.sleep(2000);
					clickElementUsingJavaScript(warumClose);
					pageLoad();
				}
				public void clickonWoraus() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Woraus);
					clickElementUsingJavaScript(Woraus);
					visibilityOf(WorausActive);
					boolean elementIsDisplayed=elementIsDisplayed(WorausActive);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(" Woraus Tiltle:"  + getElementText(Woraus));
					Thread.sleep(2000);
					clickElementUsingJavaScript(WorausClose);
					pageLoad();
				}
				public void clickonWowirddie() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Wowirddie);
					clickElementUsingJavaScript(Wowirddie);
					visibilityOf(WowirddieActive);
					boolean elementIsDisplayed=elementIsDisplayed(WowirddieActive);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(" Wowirddie Tiltle:"  + getElementText(Wowirddie));
					Thread.sleep(2000);
					clickElementUsingJavaScript(WowirddieClose);
					pageLoad();
				}
				public void clickonWasbedutet() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Wasbedeutet);
					clickElementUsingJavaScript(Wasbedeutet);
					visibilityOf(WasbedeutetActive);
					boolean elementIsDisplayed=elementIsDisplayed(WasbedeutetActive);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println("Wasbedeutet Tiltle:"  + getElementText(Wasbedeutet));
					Thread.sleep(2000);
					clickElementUsingJavaScript(WasbedeutetClose);
					pageLoad();
				}
				public void clickonWasistder() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Wasistder);
					clickElementUsingJavaScript(Wasistder);
					visibilityOf(WasistderActive);
					boolean elementIsDisplayed=elementIsDisplayed(WasistderActive);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println("Wasistder Tiltle:"  + getElementText(Wasistder));
					Thread.sleep(2000);
					clickElementUsingJavaScript(WasistderClose);
					pageLoad();
				}
				public void clickonGreenclean() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Greenclean);
					clickElementUsingJavaScript(Greenclean);
					pageLoad();
				}
				public void clickonGreencleanProduct() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(GreencleanProduct);
					clickElementUsingJavaScript(GreencleanProduct);
					pageLoad();
				}
				public void clickonGreenCleanBuyNow() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(GreencleanBuyNow);
					moveToElement(GreencleanBuyNow);
					if (isElementPresent(GreencleanBuyNow)) {
						actionClick(GreencleanBuyNow);
					
					} else {
						throw new Exception("GreencleanBuyNow is not present on Page");
					}
					pageLoad();
				}
				public void clickonInterdentalbursten() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Interdentalbursten);
					clickElementUsingJavaScript(Interdentalbursten);
					pageLoad();
				}
				public void clickonInterdentalburstenProduct() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(InterdentalburstenProduct);
					clickElementUsingJavaScript(InterdentalburstenProduct);
					pageLoad();
				}
				public void clickonInterdentalburstenBuyNow() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(InterdentalburstenBuyNow);
					moveToElement(InterdentalburstenBuyNow);
					if (isElementPresent(InterdentalburstenBuyNow)) {
						actionClick(InterdentalburstenBuyNow);
					
					} else {
						throw new Exception("InterdentalburstenBuyNow is not present on Page");
					}
					pageLoad();
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	

}
