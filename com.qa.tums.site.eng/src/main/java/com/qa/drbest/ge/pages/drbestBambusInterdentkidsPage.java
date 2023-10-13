package com.qa.drbest.ge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;



public class drbestBambusInterdentkidsPage extends BaseClass{
	
	public drbestBambusInterdentkidsPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Akzeptieren']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
		private static WebElement cookieClose;
	
		@FindBy(xpath = "//buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
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
		
		
		//FAQs//
		
		@FindBy(xpath = "//a[@title='Was unterscheidet die <em>Dr.</em>BEST Bambus-Interdent KIDS von anderen im Markt erhältlichen Bambus-Zahnbürsten?']")
		private static WebElement wasunterscheidet;		
	
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Was unterscheidet die <em>Dr.</em>BEST Bambus-Interdent KIDS von anderen im Markt erhältlichen Bambus-Zahnbürsten?']")
		private static WebElement wasunterscheidetClose;	
	
		@FindBy(xpath = "//li[@class='accordion-slide first odd is-active']")
		private static WebElement wasunterscheidetActive;
		
		@FindBy(xpath = "//a[@title='Warum ist die <em>Dr.</em>BEST Bambus-Interdent KIDS nur für Kinder ab 6 Jahren? Warum gibt es Wettbewerber, die diese Zahnbürste bereits für kleinere Kinder anbieten?']")
		private static WebElement Warum;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Warum ist die <em>Dr.</em>BEST Bambus-Interdent KIDS nur für Kinder ab 6 Jahren? Warum gibt es Wettbewerber, die diese Zahnbürste bereits für kleinere Kinder anbieten?']")
		private static WebElement WarumClose;
		
		@FindBy(xpath = "//li[@class='accordion-slide even is-active']")
		private static WebElement WarumActive;
		
		@FindBy(xpath = "//a[@title='Wie trägt die Verwendung von Bambus für die <em>Dr.</em>BEST Bambus-Interdent KIDS zum Schutz der Umwelt bei?']")
		private static WebElement Wietragt;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Wie trägt die Verwendung von Bambus für die <em>Dr.</em>BEST Bambus-Interdent KIDS zum Schutz der Umwelt bei?']")
		private static WebElement WietragtClose;
		
		@FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
		private static WebElement WietragtActive;
		
		@FindBy(xpath = "//a[@title='Was unternimmt <em>Dr.</em>BEST zusätzlich im Sinne der Nachhaltigkeit?']")
		private static WebElement Wasunternimmt;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Was unternimmt <em>Dr.</em>BEST zusätzlich im Sinne der Nachhaltigkeit?']")
		private static WebElement WasunternimmtClose;
		
		@FindBy(xpath = "//li[@class='accordion-slide even is-active']")
		private static WebElement WasunternimmtActive;
		
		@FindBy(xpath = "//a[@title='Woher stammt der Bambus, der für die Herstellung der <em>Dr.</em>BEST Bambus-Interdent KIDS verwendet wird? Wo wird die Zahnbürste weiterverarbeitet?']")
		private static WebElement Woherstammt;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Woher stammt der Bambus, der für die Herstellung der <em>Dr.</em>BEST Bambus-Interdent KIDS verwendet wird? Wo wird die Zahnbürste weiterverarbeitet?']")
		private static WebElement WoherstammtClose;
		
		@FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
		private static WebElement WoherstammtActive;
		
		@FindBy(xpath = "//a[@title='Wie stellt <em>Dr.</em>BEST sicher, dass die Zulieferer umwelt- und sozialfreundlich arbeiten?']")
		private static WebElement Wiestellt;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Wie stellt <em>Dr.</em>BEST sicher, dass die Zulieferer umwelt- und sozialfreundlich arbeiten?']")
		private static WebElement WiestelltClose;
		
		@FindBy(xpath = "//li[@class='accordion-slide even is-active']")
		private static WebElement WiestelltActive;
		
		@FindBy(xpath = "//a[@title='Fördert <em>Dr.</em>BEST mit der Verwendung von Bambus nicht die Abholzung von Natur- und Lebensräumen?']")
		private static WebElement fordert;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Fördert <em>Dr.</em>BEST mit der Verwendung von Bambus nicht die Abholzung von Natur- und Lebensräumen?']")
		private static WebElement fordertClose;
		
		@FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
		private static WebElement fordertActive;
		
		@FindBy(xpath = "//a[@title='Wie kann ich die <em>Dr.</em>BEST Bambus-Interdent KIDS umweltgerecht entsorgen?']")
		private static WebElement wiekann;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Wie kann ich die <em>Dr.</em>BEST Bambus-Interdent KIDS umweltgerecht entsorgen?']")
		private static WebElement wiekannClose;
		
		@FindBy(xpath = "//li[@class='accordion-slide even is-active']")
		private static WebElement wiekannActive;
		
		@FindBy(xpath = "//a[@title='Woraus besteht die Verpackung? Ist sie recycelbar und wie kann ich sie umweltgerecht entsorgen?']")
		private static WebElement Worausbesteht;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Woraus besteht die Verpackung? Ist sie recycelbar und wie kann ich sie umweltgerecht entsorgen?']")
		private static WebElement WorausbestehtClose;
		
		@FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
		private static WebElement WorausbestehtActive;
		
		@FindBy(xpath = "//a[@title='Was muss ich beim Zähneputzen mit der <em>Dr.</em>BEST Bambus-Interdent KIDS beachten? Gibt es einen Unterschied zu herkömmlichen Zahnbürsten?']")
		private static WebElement wasmuss;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Was muss ich beim Zähneputzen mit der <em>Dr.</em>BEST Bambus-Interdent KIDS beachten? Gibt es einen Unterschied zu herkömmlichen Zahnbürsten?']")
		private static WebElement wasmussClose;
		
		@FindBy(xpath = "//li[@class='accordion-slide last even is-active']")
		private static WebElement wasmussActive;
		
		
		
		
		
		
		
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
			boolean elementIsDisplayed=elementIsDisplayed(ReviewClose1);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Reviewtxt1));
			clickElementUsingJavaScript(ReviewClose1);
			pageLoad();
		}
		public void clickonWasunterscheidiet() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(wasunterscheidet);
			clickElementUsingJavaScript(wasunterscheidet);
			visibilityOf(wasunterscheidetActive);
			boolean elementIsDisplayed=elementIsDisplayed(wasunterscheidetActive);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(wasunterscheidet));
			Thread.sleep(2000);
			clickElementUsingJavaScript(wasunterscheidetClose);
			pageLoad();
		}
		public void clickonWarum() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Warum);
			clickElementUsingJavaScript(Warum);
			visibilityOf(WarumActive);
			boolean elementIsDisplayed=elementIsDisplayed(WarumActive);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Warum));
			Thread.sleep(2000);
			clickElementUsingJavaScript(WarumClose);
			pageLoad();
		}
		public void clickonWietragt() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Wietragt);
			clickElementUsingJavaScript(Wietragt);
			visibilityOf(WietragtActive);
			boolean elementIsDisplayed=elementIsDisplayed(WietragtActive);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Wietragt));
			Thread.sleep(2000);
			clickElementUsingJavaScript(WietragtClose);
			pageLoad();
		}
		public void clickonWasunternimmt() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Wasunternimmt);
			clickElementUsingJavaScript(Wasunternimmt);
			visibilityOf(WasunternimmtActive);
			boolean elementIsDisplayed=elementIsDisplayed(WasunternimmtActive);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Wasunternimmt));
			Thread.sleep(2000);
			clickElementUsingJavaScript(WasunternimmtClose);
			pageLoad();
		}
		public void clickonWoherstammt() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Woherstammt);
			clickElementUsingJavaScript(Woherstammt);
			visibilityOf(WoherstammtActive);
			boolean elementIsDisplayed=elementIsDisplayed(WoherstammtActive);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Woherstammt));
			Thread.sleep(2000);
			clickElementUsingJavaScript(WoherstammtClose);
			pageLoad();
		}
		public void clickonWiestellt() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Wiestellt);
			clickElementUsingJavaScript(Wiestellt);
			visibilityOf(WiestelltActive);
			boolean elementIsDisplayed=elementIsDisplayed(WiestelltActive);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Wiestellt));
			Thread.sleep(2000);
			clickElementUsingJavaScript(WiestelltClose);
			pageLoad();
		}
		public void clickonFordert() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(fordert);
			clickElementUsingJavaScript(fordert);
			visibilityOf(fordertActive);
			boolean elementIsDisplayed=elementIsDisplayed(fordertActive);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(fordert));
			Thread.sleep(2000);
			clickElementUsingJavaScript(fordertClose);
			pageLoad();
		}
		public void clickonWiekann() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(wiekann);
			clickElementUsingJavaScript(wiekann);
			visibilityOf(wiekannActive);
			boolean elementIsDisplayed=elementIsDisplayed(wiekannActive);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(wiekann));
			Thread.sleep(2000);
			clickElementUsingJavaScript(wiekannClose);
			pageLoad();
		}
		public void clickonWorausbesteht() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Worausbesteht);
			clickElementUsingJavaScript(Worausbesteht);
			visibilityOf(WorausbestehtActive);
			boolean elementIsDisplayed=elementIsDisplayed(WorausbestehtActive);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Worausbesteht));
			Thread.sleep(2000);
			clickElementUsingJavaScript(WorausbestehtClose);
			pageLoad();
		}
		public void clickonWassmuss() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(wasmuss);
			clickElementUsingJavaScript(wasmuss);
			visibilityOf(wasmussActive);
			boolean elementIsDisplayed=elementIsDisplayed(wasmussActive);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(wasmuss));
			Thread.sleep(2000);
			clickElementUsingJavaScript(wasmussActive);
			pageLoad();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
