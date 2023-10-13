package com.qa.drbest.ge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class drbestgreencleanPage extends BaseClass{
	
	public drbestgreencleanPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Akzeptieren']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
		private static WebElement cookieClose;
	
		@FindBy(xpath = "//buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement BuyNow1;			
	
		@FindBy(xpath = "//a[@title='Was unterscheidet die <em>Dr.</em>BEST GreenClean von anderen Zahnbürsten?']")
		private static WebElement Wasunterscheidiet;	
	
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Was unterscheidet die <em>Dr.</em>BEST GreenClean von anderen Zahnbürsten?']")
		private static WebElement WasunterscheidietClose;
	
		@FindBy(xpath = "//li[@class='accordion-slide first odd is-active']")
		private static WebElement WasunterscheidietActive;
	
		@FindBy(xpath = "//a[@title='Warum verwendet <em>Dr.</em>BEST Rizinusöl für die Herstellung der Borsten?']")
		private static WebElement Warumverwendet;
	
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Warum verwendet <em>Dr.</em>BEST Rizinusöl für die Herstellung der Borsten?']")
		private static WebElement WarumverwendetClose;
	
		@FindBy(xpath = "//li[@class='accordion-slide even is-active']")
		private static WebElement WarumverwendetActive;
	
		@FindBy(xpath = "//a[@title='Wieso wird Biokunststoff im Griff verwendet? Was ist das und warum ist das besser als herkömmlicher Kunststoff?']")
		private static WebElement wieso;
	
		@FindBy(xpath = "//header[@class='accordion-head']//a[@title='Wieso wird Biokunststoff im Griff verwendet? Was ist das und warum ist das besser als herkömmlicher Kunststoff?']")
		private static WebElement wiesoClose;
	
		@FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
		private static WebElement wiesoActive;
	
		@FindBy(xpath = "//a[@title='Was genau ist mit „nachwachsenden Rohstoffen“ gemeint?']")
		private static WebElement wasgenau;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Was genau ist mit „nachwachsenden Rohstoffen“ gemeint?']")
		private static WebElement wasgenauClose;
		
		@FindBy(xpath = "//li[@class='accordion-slide even is-active']")
		private static WebElement wasgenauActive;
		
		@FindBy(xpath = "//a[@title='Wieso wirkt sich die Verwendung von Biokunststoff positiv auf das Klima aus?']")
		private static WebElement Wiesowirkt;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Wieso wirkt sich die Verwendung von Biokunststoff positiv auf das Klima aus?']")
		private static WebElement WiesowirktClose;
		
		@FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
		private static WebElement WiesowirktActive;
	
		@FindBy(xpath = "//a[@title='Was bedeutet klimaneutral?']")
		private static WebElement Wasbedeutet;
	
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Was bedeutet klimaneutral?']")
		private static WebElement WasbedeutetClose;
		
		@FindBy(xpath = "//li[@class='accordion-slide even is-active']")
		private static WebElement WasbedeutetActive;
		
		@FindBy(xpath = "//a[@title='Woher stammt der Biokunststoff, der für den Griff der <em>Dr.</em>BEST GreenClean Zahnbürste verwendet wird?']")
		private static WebElement Woherstammt;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Woher stammt der Biokunststoff, der für den Griff der <em>Dr.</em>BEST GreenClean Zahnbürste verwendet wird?']")
		private static WebElement WoherstammtClose;
		
		@FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
		private static WebElement WoherstammtActive;
		
		@FindBy(xpath = "//a[@title='Wo wird die <em>Dr.</em>BEST GreenClean hergestellt?']")
		private static WebElement Wowird;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Wo wird die <em>Dr.</em>BEST GreenClean hergestellt?']")
		private static WebElement WowirdClose;
		
		@FindBy(xpath = "//li[@class='accordion-slide even is-active']")
		private static WebElement WowirdActive;
		
		@FindBy(xpath = "//a[@title='Ist die <em>Dr.</em>BEST GreenClean biologisch abbaubar oder recycelbar? Wie kann man die <em>Dr.</em>BEST GreenClean entsorgen?']")
		private static WebElement istdie;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Ist die <em>Dr.</em>BEST GreenClean biologisch abbaubar oder recycelbar? Wie kann man die <em>Dr.</em>BEST GreenClean entsorgen?']")
		private static WebElement istdieClose;
		
		@FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
		private static WebElement istdieActive;
		
		@FindBy(xpath = "//a[@title='Woraus besteht die Verpackung? Ist sie recycelbar und wie kann ich sie umweltgerecht entsorgen?']")
		private static WebElement Worausbesteht;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Woraus besteht die Verpackung? Ist sie recycelbar und wie kann ich sie umweltgerecht entsorgen?']")
		private static WebElement WorausbestehtClose;
		
		@FindBy(xpath = "//li[@class='accordion-slide even is-active']")
		private static WebElement WorausbestehtActive;
		
		@FindBy(xpath = "//a[@title='Was ist der Massenbilanzansatz?']")
		private static WebElement Massenibilan;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Was ist der Massenbilanzansatz?']")
		private static WebElement MassenibilanClose;
		
		@FindBy(xpath = "//li[@class='accordion-slide last odd is-active']")
		private static WebElement MassenibilanActive;
		
		
		
	
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
	
		public void clickonWasunterscheidiet() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Wasunterscheidiet);
			clickElementUsingJavaScript(Wasunterscheidiet);
			visibilityOf(WasunterscheidietActive);
			boolean elementIsDisplayed=elementIsDisplayed(WasunterscheidietActive);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Wasunterscheidiet));
			Thread.sleep(2000);
			clickElementUsingJavaScript(WasunterscheidietClose);
			pageLoad();
		}
		public void clickonWarumverwendent() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Warumverwendet);
			clickElementUsingJavaScript(Warumverwendet);
			visibilityOf(WarumverwendetActive);
			boolean elementIsDisplayed=elementIsDisplayed(WarumverwendetActive);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Warumverwendet));
			Thread.sleep(2000);
			clickElementUsingJavaScript(WarumverwendetClose);
			pageLoad();
		}
		public void clickonWeiso() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(wieso);
			clickElementUsingJavaScript(wieso);
			visibilityOf(wiesoActive);
			boolean elementIsDisplayed=elementIsDisplayed(wiesoActive);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(wieso));
			Thread.sleep(2000);
			clickElementUsingJavaScript(wiesoClose);
			pageLoad();
		}
		public void clickonWasgenau() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(wasgenau);
			clickElementUsingJavaScript(wasgenau);
			visibilityOf(wasgenauActive);
			boolean elementIsDisplayed=elementIsDisplayed(wasgenauActive);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(" Wasgenau Tiltle:"  + getElementText(wasgenau));
			Thread.sleep(2000);
			clickElementUsingJavaScript(wasgenauClose);
			pageLoad();
		}
		public void clickonWiesowirkt() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Wiesowirkt);
			clickElementUsingJavaScript(Wiesowirkt);
			visibilityOf(WiesowirktActive);
			boolean elementIsDisplayed=elementIsDisplayed(WiesowirktActive);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(" Wiesowirkt Tiltle:"  + getElementText(Wiesowirkt));
			Thread.sleep(2000);
			clickElementUsingJavaScript(WiesowirktClose);
			pageLoad();
		}
		public void clickonWasbedeutet() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Wasbedeutet);
			clickElementUsingJavaScript(Wasbedeutet);
			visibilityOf(WasbedeutetActive);
			boolean elementIsDisplayed=elementIsDisplayed(WasbedeutetActive);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(" Wasbedeutet Tiltle:"  + getElementText(Wasbedeutet));
			Thread.sleep(2000);
			clickElementUsingJavaScript(WasbedeutetClose);
			pageLoad();
		}
		public void clickonWoherstammt() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Woherstammt);
			clickElementUsingJavaScript(Woherstammt);
			visibilityOf(WoherstammtActive);
			boolean elementIsDisplayed=elementIsDisplayed(WoherstammtActive);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(" Woherstammt Tiltle:"  + getElementText(Woherstammt));
			Thread.sleep(2000);
			clickElementUsingJavaScript(WoherstammtClose);
			pageLoad();
		}
	
		public void clickonWowird() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Wowird);
			clickElementUsingJavaScript(Wowird);
			visibilityOf(WowirdActive);
			boolean elementIsDisplayed=elementIsDisplayed(WowirdActive);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(" Wowird Tiltle:"  + getElementText(Wowird));
			Thread.sleep(2000);
			clickElementUsingJavaScript(WowirdClose);
			pageLoad();
		}
		public void clickonIstdie() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(istdie);
			clickElementUsingJavaScript(istdie);
			visibilityOf(istdieActive);
			boolean elementIsDisplayed=elementIsDisplayed(istdieActive);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(" Istdie Tiltle:"  + getElementText(istdie));
			Thread.sleep(2000);
			clickElementUsingJavaScript(istdieClose);
			pageLoad();
		}
		public void clickonWorausbesteht() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Worausbesteht);
			clickElementUsingJavaScript(Worausbesteht);
			visibilityOf(WorausbestehtActive);
			boolean elementIsDisplayed=elementIsDisplayed(WorausbestehtActive);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(" Worausbesteht Tiltle:"  + getElementText(Worausbesteht));
			Thread.sleep(2000);
			clickElementUsingJavaScript(WorausbestehtClose);
			pageLoad();
		}
		public void clickonMassenibilan() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Massenibilan);
			clickElementUsingJavaScript(Massenibilan);
			visibilityOf(MassenibilanActive);
			boolean elementIsDisplayed=elementIsDisplayed(MassenibilanActive);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(" Massenibilan Tiltle:"  + getElementText(Massenibilan));
			Thread.sleep(2000);
			clickElementUsingJavaScript(MassenibilanClose);
			pageLoad();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
