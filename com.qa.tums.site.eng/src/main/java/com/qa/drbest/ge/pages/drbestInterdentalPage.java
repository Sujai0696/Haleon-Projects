package com.qa.drbest.ge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class drbestInterdentalPage extends BaseClass{
	
	public drbestInterdentalPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Akzeptieren']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
		private static WebElement cookieClose;	
		
		@FindBy(xpath = "//div[@class='richText component section default-style first odd col-xs-12 col-sm-2']//child::span[text()='Vorteile']")
		private static WebElement vorteile;	
	
		@FindBy(xpath = "//div[@class='richText component section default-style even col-xs-12 col-sm-2']//child::span[text()='Details']")
		private static WebElement details;	
	
		@FindBy(xpath = "//div[@class='richText component section default-style odd col-xs-12 col-sm-2']//child::span[text()='Materialien']")
		private static WebElement Materialian;	
	
		@FindBy(xpath = "//div[@class='richText component section default-style even col-xs-12 col-sm-2']//child::span[text()='Tipps']")
		private static WebElement Tipps;	
	
		@FindBy(xpath = "//div[@class='richText component section default-style odd last col-xs-12 col-sm-2']//child::span[text()='Größen']")
		private static WebElement grozen;	
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section fixed-element even col-xs-12 reference-buy-now-button-blue']//buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement buynowbtn;	
	
		@FindBy(xpath = "//span[text()='Fragen & Antworten']")
		private static WebElement heading;	
	
		@FindBy(xpath = "//span[text()='Warum sollte ich Interdentalbürsten verwenden?']")
		private static WebElement Warum;	
	
		@FindBy(xpath = "//li[@class='accordion-slide first odd is-active']")
		private static WebElement WarumActive;	
	
		@FindBy(xpath = "//header[@class='accordion-head']//child::span[text()='Warum sollte ich Interdentalbürsten verwenden?']")
		private static WebElement WarumClose;	
	
		@FindBy(xpath = "//span[text()='Wie finde ich die richtige Größe?']")
		private static WebElement Wiefinde;
	
		@FindBy(xpath = "//header[@class='accordion-head']//child::span[text()='Wie finde ich die richtige Größe?']")
		private static WebElement WiefindeClose;
		
		@FindBy(xpath = "//li[@class='accordion-slide even is-active']")
		private static WebElement WiefindeActive;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::span[text()='Kann ich für alle Zahnzwischenräume die gleiche Größe verwenden?']")
		private static WebElement KannichClose;
		
		@FindBy(xpath = "//span[text()='Kann ich für alle Zahnzwischenräume die gleiche Größe verwenden?']")
		private static WebElement Kannich;
		
		@FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
		private static WebElement KannichActive;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::span[text()='Wie wende ich Interdentalbürsten richtig an?']")
		private static WebElement WieClose;
		
		@FindBy(xpath = "//li[@class='accordion-slide even is-active']")
		private static WebElement WieActive;
		
		@FindBy(xpath = "//span[text()='Wie wende ich Interdentalbürsten richtig an?']")
		private static WebElement Wie;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::span[text()='Was tun, wenn die Bürste nicht in meine Zahnzwischenräume passt?']")
		private static WebElement wastunClose;
		
		@FindBy(xpath = "//span[text()='Was tun, wenn die Bürste nicht in meine Zahnzwischenräume passt?']")
		private static WebElement wastun;
		
		@FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
		private static WebElement wastunActive;
		
		@FindBy(xpath = "//span[text()='Was tun, wenn mein Zahnfleisch nach der Anwendung einer Interdentalbürste blutet?']")
		private static WebElement wastun1;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::span[text()='Was tun, wenn mein Zahnfleisch nach der Anwendung einer Interdentalbürste blutet?']")
		private static WebElement wastunClose1;
		
		@FindBy(xpath = "//li[@class='accordion-slide even is-active']")
		private static WebElement wastunActive1;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::span[text()='Verwendet man die Interdentalbürste mit oder ohne Zahnpasta?']")
		private static WebElement VerwendantClose;
		
		@FindBy(xpath = "//span[text()='Verwendet man die Interdentalbürste mit oder ohne Zahnpasta?']")
		private static WebElement Verwendant;
		
		@FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
		private static WebElement VerwendantActive;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::span[text()='Wie lange kann ich die Interdentalbürste verwenden?']")
		private static WebElement WielangeClose;
		
		@FindBy(xpath = "//span[text()='Wie lange kann ich die Interdentalbürste verwenden?']")
		private static WebElement Wielange;
		
		@FindBy(xpath = "//li[@class='accordion-slide even is-active']")
		private static WebElement WielangeActive;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::span[text()='Wie wende ich die Interdentalbürste bei einer festsitzenden Zahnspange oder einem Retainer an?']")
		private static WebElement WiewendeClose;
		
		@FindBy(xpath = "//span[text()='Wie wende ich die Interdentalbürste bei einer festsitzenden Zahnspange oder einem Retainer an?']")
		private static WebElement Wiewende;
		
		@FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
		private static WebElement WiewendeActive;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::span[text()='Wie wende ich die Interdentalbürste bei einer Brücke an?']")
		private static WebElement WieBruckeClose;
		
		@FindBy(xpath = "//span[text()='Wie wende ich die Interdentalbürste bei einer Brücke an?']")
		private static WebElement WieBrucke;
		
		@FindBy(xpath = "//li[@class='accordion-slide even is-active']")
		private static WebElement WieBruckeActive;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::span[text()='Wie wende ich die Interdentalbürste bei einem Implantat an?']")
		private static WebElement WieImplantatClose;
		
		@FindBy(xpath = "//span[text()='Wie wende ich die Interdentalbürste bei einem Implantat an?']")
		private static WebElement WieImplantat;
		
		@FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
		private static WebElement WieImplantatActive;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Was unterscheidet die <em>Dr.</em>BEST GreenClean INTERDENTAL von anderen Interdentalbürsten?']")
		private static WebElement GreenCleanClose;
		
		@FindBy(xpath = "//a[@title='Was unterscheidet die <em>Dr.</em>BEST GreenClean INTERDENTAL von anderen Interdentalbürsten?']")
		private static WebElement GreenClean;
		
		@FindBy(xpath = "//li[@class='accordion-slide even is-active']")
		private static WebElement GreenCleanActive;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::span[text()='Was genau ist mit „nachwachsenden Rohstoffen“ gemeint?']")
		private static WebElement nachwachsendenClose;
		
		@FindBy(xpath = "//span[text()='Was genau ist mit „nachwachsenden Rohstoffen“ gemeint?']")
		private static WebElement nachwachsenden;
		
		@FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
		private static WebElement nachwachsendenActive;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::span[text()='BEST GreenClean INTERDENTAL biologisch abbaubar oder recycelbar? Wie kann man die GreenClean INTERDENTAL entsorgen?']")
		private static WebElement greenCleanInterdentalClose;
		
		@FindBy(xpath = "//span[text()='BEST GreenClean INTERDENTAL biologisch abbaubar oder recycelbar? Wie kann man die GreenClean INTERDENTAL entsorgen?']")
		private static WebElement greenCleanInterdental;
	
		@FindBy(xpath = "//li[@class='accordion-slide even is-active']")
		private static WebElement greenCleanInterdentalActive;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Woraus besteht die Verpackung der <em>Dr.</em>BEST GreenClean INTERDENTAL? Ist sie recycelbar und wie kann ich sie umweltgerecht entsorgen?']")
		private static WebElement WorausbesteClose;
		
		@FindBy(xpath = "//a[@title='Woraus besteht die Verpackung der <em>Dr.</em>BEST GreenClean INTERDENTAL? Ist sie recycelbar und wie kann ich sie umweltgerecht entsorgen?']")
		private static WebElement Worausbeste;
		
		@FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
		private static WebElement WorausbesteActive;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::span[text()='Was bedeutet Klimaneutralität?']")
		private static WebElement WasbedutetClose;
		
		@FindBy(xpath = "//span[text()='Was bedeutet Klimaneutralität?']")
		private static WebElement Wasbedutet;
		
		@FindBy(xpath = "//li[@class='accordion-slide last even is-active']")
		private static WebElement WasbedutetActive;
		
		@FindBy(xpath = "(//div[@class='parametrizedhtml component section default-style odd col-xs-12 reference-buy-now-button-blue']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html'])[1]")
		private static WebElement BuyNow1;
		
		@FindBy(xpath = "(//a[@href='/zahnbuersten/bambus-interdent/'])[4]")
		private static WebElement weitree1;
		
		@FindBy(xpath = "(//div[@class='parametrizedhtml component section default-style odd col-xs-12 reference-buy-now-button-blue']//child::buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html'])[2]")
		private static WebElement BuyNow2;
		
		@FindBy(xpath = "(//a[@href='/zahnbuersten/green-clean/'])[4]")
		private static WebElement weitree2;
		
		
		
		
		
		
		
		
		
		
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
		public void clickonVerteile() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(vorteile);
			pageLoad();
		}
		public void clickonDetails() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(details);
			pageLoad();
		}
		public void clickonMaterialians() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(Materialian);
			pageLoad();
		}
		public void clickonTipps() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(Tipps);
			pageLoad();
		}
		public void clickonGrozen() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(grozen);
			pageLoad();
		}
		public void clickonBuyNowBtn() throws Exception {
			waitForPageLoadJava();
			moveToElement(buynowbtn);
			if (isElementPresent(buynowbtn)) {
				actionClick(buynowbtn);
			} else {
				throw new Exception("BuyNow is not displayed on page");
			}
			pageLoad();
		}
		public void clickonWarum() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(Warum);
			visibilityOf(WarumActive);
			boolean elementIsDisplayed=elementIsDisplayed(WarumActive);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Warum));
			Thread.sleep(2000);
			clickElementUsingJavaScript(WarumClose);
			pageLoad();
		}
		public void clickonWiefinde() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(Wiefinde);
			visibilityOf(WiefindeActive);
			boolean elementIsDisplayed=elementIsDisplayed(WiefindeActive);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Wiefinde));
			Thread.sleep(2000);
			clickElementUsingJavaScript(WiefindeClose);
			pageLoad();
		}
		public void clickonKannich() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(Kannich);
			visibilityOf(KannichActive);
			boolean elementIsDisplayed=elementIsDisplayed(KannichActive);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Kannich));
			Thread.sleep(2000);
			clickElementUsingJavaScript(KannichClose);
			pageLoad();
		}
		public void clickonWie() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(Wie);
			visibilityOf(WieActive);
			boolean elementIsDisplayed=elementIsDisplayed(WieActive);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Wie));
			Thread.sleep(2000);
			clickElementUsingJavaScript(WieClose);
			pageLoad();
		}
		public void clickonWastun() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(wastun);
			visibilityOf(wastunActive);
			boolean elementIsDisplayed=elementIsDisplayed(wastunActive);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(wastun));
			Thread.sleep(2000);
			clickElementUsingJavaScript(wastunClose);
			pageLoad();
		}
		public void clickonWastun1() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(wastun1);
			visibilityOf(wastunActive1);
			boolean elementIsDisplayed=elementIsDisplayed(wastunActive1);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(wastun1));
			Thread.sleep(2000);
			clickElementUsingJavaScript(wastunClose1);
			pageLoad();
		}
		public void clickonVerwandat() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(Verwendant);
			visibilityOf(VerwendantActive);
			boolean elementIsDisplayed=elementIsDisplayed(VerwendantActive);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Verwendant));
			Thread.sleep(2000);
			clickElementUsingJavaScript(VerwendantClose);
			pageLoad();
		}
		public void clickonWielange() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(Wielange);
			visibilityOf(WielangeActive);
			boolean elementIsDisplayed=elementIsDisplayed(WielangeActive);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Wielange));
			Thread.sleep(2000);
			clickElementUsingJavaScript(WielangeClose);
			pageLoad();
		}
		public void clickonWiewende() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(Wiewende);
			visibilityOf(WiewendeActive);
			boolean elementIsDisplayed=elementIsDisplayed(WiewendeActive);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Wiewende));
			Thread.sleep(2000);
			clickElementUsingJavaScript(WiewendeClose);
			pageLoad();
		}
		public void clickonWieBrucke() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(WieBrucke);
			visibilityOf(WieBruckeActive);
			boolean elementIsDisplayed=elementIsDisplayed(WieBruckeActive);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(WieBrucke));
			Thread.sleep(2000);
			clickElementUsingJavaScript(WieBruckeClose);
			pageLoad();
		}
		public void clickonWieImplantat() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(WieImplantat);
			visibilityOf(WieImplantatActive);
			boolean elementIsDisplayed=elementIsDisplayed(WieImplantatActive);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(WieImplantat));
			Thread.sleep(2000);
			clickElementUsingJavaScript(WieImplantatClose);
			pageLoad();
		}
		public void clickonGreenClean() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(GreenClean);
			visibilityOf(GreenCleanActive);
			boolean elementIsDisplayed=elementIsDisplayed(GreenCleanActive);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(GreenClean));
			Thread.sleep(2000);
			clickElementUsingJavaScript(GreenCleanClose);
			pageLoad();
		}
		public void clickonNachwachsenden() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(nachwachsenden);
			visibilityOf(nachwachsendenActive);
			boolean elementIsDisplayed=elementIsDisplayed(nachwachsendenActive);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(nachwachsenden));
			Thread.sleep(2000);
			clickElementUsingJavaScript(nachwachsendenClose);
			pageLoad();
		}
		public void clickonGreenCleanInterdental() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(greenCleanInterdental);
			visibilityOf(greenCleanInterdentalActive);
			boolean elementIsDisplayed=elementIsDisplayed(greenCleanInterdentalActive);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(greenCleanInterdental));
			Thread.sleep(2000);
			clickElementUsingJavaScript(greenCleanInterdentalClose);
			pageLoad();
		}
		public void clickonWorausbeste() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(Worausbeste);
			visibilityOf(WorausbesteActive);
			boolean elementIsDisplayed=elementIsDisplayed(WorausbesteActive);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Worausbeste));
			Thread.sleep(2000);
			clickElementUsingJavaScript(WorausbesteClose);
			pageLoad();
		}
		public void clickonWasbedutet() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(Wasbedutet);
			visibilityOf(WasbedutetActive);
			boolean elementIsDisplayed=elementIsDisplayed(WasbedutetActive);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Wasbedutet));
			Thread.sleep(2000);
			clickElementUsingJavaScript(WasbedutetClose);
			pageLoad();
		}
		public void clickonBuyNow1() throws Exception {
			waitForPageLoadJava();
			moveToElement(BuyNow1);
			if (isElementPresent(BuyNow1)) {
				actionClick(BuyNow1);
			} else {
				throw new Exception("BuyNow1 is not Displayed on page");
			}
		}
		public void clickonWeitree() throws Exception {
			waitForPageLoadJava();
			//scrollDownUsingElement(weitree1);
			clickElementUsingJavaScript(weitree1);
			pageLoad();
		}
		public void clickonBuyNow2() throws Exception {
			waitForPageLoadJava();
			moveToElement(BuyNow2);
			if (isElementPresent(BuyNow2)) {
				actionClick(BuyNow2);
			} else {
				throw new Exception("BuyNow2 is not Displayed on page");
			}
		}
		public void clickonWeitree2() throws Exception {
			waitForPageLoadJava();
			//scrollDownUsingElement(weitree2);
			clickElementUsingJavaScript(weitree2);
			pageLoad();
		}
		
		
		
		
		
		
	
	
	
	

}
