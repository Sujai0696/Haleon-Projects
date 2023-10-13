package com.qa.drbest.ge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class drbestBambusInterdentPage extends BaseClass{
	
	public drbestBambusInterdentPage() {
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
	
		@FindBy(xpath = "//div[@class='bv-action-bar']")
		private static WebElement Review1;	
	
		@FindBy(xpath = "//span[@class='bv-mbox-breadcrumb-item']")
		private static WebElement Reviewtxt1;	
	
		@FindBy(xpath = "//button[@class='bv-mbox-close bv-focusable']")
		private static WebElement ReviewClose1;		
	
		@FindBy(xpath = "//a[@title='Was unterscheidet die <em>Dr.</em>BEST Bambus-Interdent von anderen im Markt erhältlichen Bambus-Zahnbürsten?']")
		private static WebElement BambusInterdenttxt;
	
		@FindBy(xpath = "//h3[@class='accordion-title component']//child::a[@title='Was unterscheidet die <em>Dr.</em>BEST Bambus-Interdent von anderen im Markt erhältlichen Bambus-Zahnbürsten?']")
		private static WebElement BambusInterdentClose;
	
		@FindBy(xpath = "//li[@class='accordion-slide first odd is-active']")
		private static WebElement BambusInterdentActive;
	
		@FindBy(xpath = "//a[@title='Es sind bereits andere Zahnbürsten aus Bambus erhältlich. Warum gibt es erst jetzt eine von <em>Dr.</em>BEST?']")
		private static WebElement Warumgibt;
	
		@FindBy(xpath = "//li[@class='accordion-slide even is-active']")
		private static WebElement WarumgibtActive;
	
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Es sind bereits andere Zahnbürsten aus Bambus erhältlich. Warum gibt es erst jetzt eine von <em>Dr.</em>BEST?']")
		private static WebElement WarumgibtClose;
	
		@FindBy(xpath = "//a[@title='Wie trägt die Verwendung von Bambus für die <em>Dr.</em>BEST Bambus-Interdent Zahnbürste zum Schutz der Umwelt bei?']")
		private static WebElement Wietragt;
	
		@FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
		private static WebElement WietragtActive;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Wie trägt die Verwendung von Bambus für die <em>Dr.</em>BEST Bambus-Interdent Zahnbürste zum Schutz der Umwelt bei?']")
		private static WebElement WietragtClose;
		
		@FindBy(xpath = "//a[@title='Was unternimmt <em>Dr.</em>BEST zusätzlich im Sinne der Nachhaltigkeit?']")
		private static WebElement Wasunternimmt;
		
		@FindBy(xpath = "//li[@class='accordion-slide even is-active']")
		private static WebElement WasunternimmtActive;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Was unternimmt <em>Dr.</em>BEST zusätzlich im Sinne der Nachhaltigkeit?']")
		private static WebElement WasunternimmtClose;
		
		@FindBy(xpath = "//a[@title='Woher stammt der Bambus, der für die Herstellung der <em>Dr.</em>BEST Bambus-Interdent Zahnbürste verwendet wird? Wo wird die Zahnbürste weiterverarbeitet?']")
		private static WebElement Woherstammt;
		
		@FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
		private static WebElement WoherstammtActive;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Woher stammt der Bambus, der für die Herstellung der <em>Dr.</em>BEST Bambus-Interdent Zahnbürste verwendet wird? Wo wird die Zahnbürste weiterverarbeitet?']")
		private static WebElement WoherstammtClose;
		
		@FindBy(xpath = "//a[@title='Wie stellt <em>Dr.</em>BEST sicher, dass die Zulieferer umwelt- und sozialfreundlich arbeiten?']")
		private static WebElement wiestellt;
		
		@FindBy(xpath = "//li[@class='accordion-slide even is-active']")
		private static WebElement wiestelltActive;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Wie stellt <em>Dr.</em>BEST sicher, dass die Zulieferer umwelt- und sozialfreundlich arbeiten?']")
		private static WebElement wiestelltClose;
		
		@FindBy(xpath = "//a[@title='Fördert <em>Dr.</em>BEST mit der Verwendung von Bambus nicht die Abholzung von Natur- und Lebensräumen? Wird durch den Abbau von Bambus der Lebensraum der Pandas stark beeinträchtigt?']")
		private static WebElement Fordert;
		
		@FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
		private static WebElement FordertActive;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Fördert <em>Dr.</em>BEST mit der Verwendung von Bambus nicht die Abholzung von Natur- und Lebensräumen? Wird durch den Abbau von Bambus der Lebensraum der Pandas stark beeinträchtigt?']")
		private static WebElement FordertClose;
		
		@FindBy(xpath = "//a[@title='Wie kann ich die Bambus-Interdent Zahnbürste umweltgerecht entsorgen?']")
		private static WebElement Wiekann;
		
		@FindBy(xpath = "//li[@class='accordion-slide even is-active']")
		private static WebElement WiekannActive;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Wie kann ich die Bambus-Interdent Zahnbürste umweltgerecht entsorgen?']")
		private static WebElement WiekannClose;
		
		@FindBy(xpath = "//a[@title='Woraus besteht die Verpackung? Ist sie recycelbar und wie kann ich sie umweltgerecht entsorgen?']")
		private static WebElement Woraus;
		
		@FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
		private static WebElement WorausActive;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Woraus besteht die Verpackung? Ist sie recycelbar und wie kann ich sie umweltgerecht entsorgen?']")
		private static WebElement WorausClose;
		
		@FindBy(xpath = "//a[@title='Was muss ich beim Zähneputzen mit der <em>Dr.</em>BEST Bambus-Interdent beachten? Gibt es einen Unterschied zu herkömmlichen Zahnbürsten?']")
		private static WebElement Wasmuss;
		
		@FindBy(xpath = "//li[@class='accordion-slide even is-active']")
		private static WebElement WasmussActive;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Was muss ich beim Zähneputzen mit der <em>Dr.</em>BEST Bambus-Interdent beachten? Gibt es einen Unterschied zu herkömmlichen Zahnbürsten?']")
		private static WebElement WasmussClose;
		
		@FindBy(xpath = "//a[@title='Warum hat sich der Bambusgriff der Zahnbürste verfärbt?']")
		private static WebElement Warumhat;
		
		@FindBy(xpath = "//li[@class='accordion-slide last odd is-active']")
		private static WebElement WarumhatActive;
		
		@FindBy(xpath = "//header[@class='accordion-head']//child::a[@title='Warum hat sich der Bambusgriff der Zahnbürste verfärbt?']")
		private static WebElement WarumhatClose;
		
		
		
		
		
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
//				public void clickonReview1() throws Exception {
//					waitForPageLoadJava();
//					scrollDownUsingElement(Review1);
//					clickElementUsingJavaScript(Review1);
//					//visibilityOf(Reviewtxt1);
//					boolean elementIsDisplayed=elementIsDisplayed(ReviewClose1);
//					Assert.assertTrue(elementIsDisplayed);
//					//System.out.println(getElementText(Reviewtxt1));
//					clickElementUsingJavaScript(ReviewClose1);
//					pageLoad();
//				}
				public void clickonBambusInterdent() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(BambusInterdenttxt);
					clickElementUsingJavaScript(BambusInterdenttxt);
					visibilityOf(BambusInterdentActive);
					boolean elementIsDisplayed=elementIsDisplayed(BambusInterdentActive);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(BambusInterdenttxt));
					Thread.sleep(2000);
					clickElementUsingJavaScript(BambusInterdentClose);
					pageLoad();
				}
				public void clickonWarumgibt() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(BambusInterdenttxt);
					clickElementUsingJavaScript(Warumgibt);
					visibilityOf(WarumgibtActive);
					boolean elementIsDisplayed=elementIsDisplayed(WarumgibtActive);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(Warumgibt));
					Thread.sleep(2000);
					clickElementUsingJavaScript(WarumgibtClose);
					pageLoad();
				}
				public void clickonWietragt() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Warumgibt);
					clickElementUsingJavaScript(Wietragt);
					visibilityOf(WietragtActive);
					boolean elementIsDisplayed=elementIsDisplayed(WietragtActive);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(Wietragt));
					Thread.sleep(2000);
					clickElementUsingJavaScript(WietragtClose);
					pageLoad();
				}
				public void clickonWasunterimmt() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Warumgibt);
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
					scrollDownUsingElement(Warumgibt);
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
					scrollDownUsingElement(Warumgibt);
					clickElementUsingJavaScript(wiestellt);
					visibilityOf(wiestelltActive);
					boolean elementIsDisplayed=elementIsDisplayed(wiestelltActive);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(wiestellt));
					Thread.sleep(2000);
					clickElementUsingJavaScript(wiestelltClose);
					pageLoad();
				}
				public void clickonFordert() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(wiestellt);
					clickElementUsingJavaScript(Fordert);
					visibilityOf(FordertActive);
					boolean elementIsDisplayed=elementIsDisplayed(FordertActive);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(Fordert));
					Thread.sleep(2000);
					clickElementUsingJavaScript(FordertClose);
					pageLoad();
				}
				public void clickonWiekann() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Wiekann);
					clickElementUsingJavaScript(Wiekann);
					visibilityOf(WiekannActive);
					boolean elementIsDisplayed=elementIsDisplayed(WiekannActive);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(Wiekann));
					Thread.sleep(2000);
					clickElementUsingJavaScript(WiekannClose);
					pageLoad();
				}
				public void clickonWoraus() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Woraus);
					clickElementUsingJavaScript(Woraus);
					visibilityOf(WorausActive);
					boolean elementIsDisplayed=elementIsDisplayed(WorausActive);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(Woraus));
					Thread.sleep(2000);
					clickElementUsingJavaScript(WorausClose);
					pageLoad();
				}
				public void clickonWassmuss() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Wasmuss);
					clickElementUsingJavaScript(Wasmuss);
					visibilityOf(WasmussActive);
					boolean elementIsDisplayed=elementIsDisplayed(WasmussActive);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(Wasmuss));
					Thread.sleep(2000);
					clickElementUsingJavaScript(WasmussClose);
					pageLoad();
				}
				public void clickonWarumhat() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Warumhat);
					clickElementUsingJavaScript(Warumhat);
					visibilityOf(WarumhatActive);
					boolean elementIsDisplayed=elementIsDisplayed(WarumhatActive);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(Warumhat));
					Thread.sleep(2000);
					clickElementUsingJavaScript(WarumhatClose);
					pageLoad();
				}
	
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	

}
