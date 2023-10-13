package com.qa.drbest.ge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class drbestZahnbuerstenPage extends BaseClass{
	
	public drbestZahnbuerstenPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Akzeptieren']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
		private static WebElement cookieClose;
		
		
		@FindBy(xpath = "//input[@name='erwachsene']")
		private static WebElement checkbox1;
		
		@FindBy(xpath = "//label[text()='Erwachsene']")
		private static WebElement checkboxtxt;
		
	
		@FindBy(xpath = "//h2[text()='Produkte nach lhren Bedürfnissen filtern']")
		private static WebElement Heading;
		
		@FindBy(xpath = "//div[@class='snippetReference component section learn-more-product-snippet erwachsene multifunktionsborsten vibration hoch-tief three-fach-reinigung first odd col-xs-6 col-md-4 col-lg-3 reference-learn_more_vibration_multi_expert']//img")
		private static WebElement vibrationmultiexpert;	
	
		@FindBy(xpath = "//input[@name='zungenreiniger']")
		private static WebElement checkbox2;	
	
		@FindBy(xpath = "//label[text()='Zungenreiniger']")
		private static WebElement checkboxtxt2;
	
		@FindBy(xpath = "//input[@name='kurzkopf']")
		private static WebElement checkbox3;
	
		@FindBy(xpath = "//label[text()='Kurzkopf']")
		private static WebElement checkboxtxt3;
	
		@FindBy(xpath = "//input[@name='zahnzwischenraume']")
		private static WebElement checkbox4;
	
		@FindBy(xpath = "//label[text()='Zahnzwischenräume']")
		private static WebElement checkboxtxt4;
	
		@FindBy(xpath = "//input[@name='mundgeruch']")
		private static WebElement checkbox5;
	
		@FindBy(xpath = "//label[text()='Zungenreinigung']")
		private static WebElement checkboxtxt5;
	
		@FindBy(xpath = "//input[@name='kinder']")
		private static WebElement checkbox6;
	
		@FindBy(xpath = "//label[text()='Kinder']")
		private static WebElement checkboxtxt6;
	
		@FindBy(xpath = "//input[@name='multifunktionsborsten']")
		private static WebElement checkbox7;
	
		@FindBy(xpath = "//label[text()='Multifunktionsborsten']")
		private static WebElement checkboxtxt7;
		
		@FindBy(xpath = "//input[@name='vibration']")
		private static WebElement checkbox8;
		
		@FindBy(xpath = "//label[text()='Vibration']")
		private static WebElement checkboxtxt8;
		
		@FindBy(xpath = "//input[@name='nachhaltige-zahnpflege']")
		private static WebElement checkbox9;
		
		@FindBy(xpath = "//label[text()='Nachhaltige Zahnpflege ']")
		private static WebElement checkboxtxt9;
		
		@FindBy(xpath = "//input[@name='zahnverfarbung-enfernung']")
		private static WebElement checkbox10;
		
		@FindBy(xpath = "//label[text()='Zahnverfärbung Enfernung']")
		private static WebElement checkboxtxt10;
		
		@FindBy(xpath = "//input[@name='wellenprofil']")
		private static WebElement checkbox11;
		
		@FindBy(xpath = "//label[text()='Wellenprofil']")
		private static WebElement checkboxtxt11;
		
		@FindBy(xpath = "//input[@name='hoch-tief']")
		private static WebElement checkbox12;
		
		@FindBy(xpath = "//label[text()='Hoch-Tief']")
		private static WebElement checkboxtxt12;
		
		
		
		
		
		
		
		
		
		
		
		
		
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
				
				
	
				public void clickonCheckbox1() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Heading);
					if (isElementPresent(checkbox1)) {
						clickElementUsingJavaScript(checkbox1);
						boolean elementIsDisplayed=elementIsDisplayed(checkboxtxt);
						Assert.assertTrue(elementIsDisplayed);
						System.out.println(getElementText(checkboxtxt));
					} else {
						throw new Exception("Checkbox is not  clicable for Erwachsene");
					}
					pageLoad();
				
				}
				public void clickonCheckbox2() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Heading);
					if (isElementPresent(checkbox2)) {
						clickElementUsingJavaScript(checkbox2);
						boolean elementIsDisplayed=elementIsDisplayed(checkboxtxt2);
						Assert.assertTrue(elementIsDisplayed);
						System.out.println(getElementText(checkboxtxt2));
					} else {
						throw new Exception("Checkbox is not clicable for Zungenreiniger");
					}
					pageLoad();
				
				}
				public void clickonCheckbox3() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Heading);
					if (isElementPresent(checkbox3)) {
						clickElementUsingJavaScript(checkbox3);
						boolean elementIsDisplayed=elementIsDisplayed(checkboxtxt3);
						Assert.assertTrue(elementIsDisplayed);
						System.out.println(getElementText(checkboxtxt3));
					} else {
						throw new Exception("Checkbox is  not clicable for Kurzkopf");
					}
					pageLoad();
				
				}
				public void clickonCheckbox4() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Heading);
					if (isElementPresent(checkbox4)) {
						clickElementUsingJavaScript(checkbox4);
						boolean elementIsDisplayed=elementIsDisplayed(checkboxtxt4);
						Assert.assertTrue(elementIsDisplayed);
						System.out.println(getElementText(checkboxtxt4));
					} else {
						throw new Exception("Checkbox is  not clicable for Zahnzwischenräume");
					}
					pageLoad();
				
				}
				public void clickonCheckbox5() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Heading);
					if (isElementPresent(checkbox5)) {
						clickElementUsingJavaScript(checkbox5);
						boolean elementIsDisplayed=elementIsDisplayed(checkboxtxt5);
						Assert.assertTrue(elementIsDisplayed);
						System.out.println(getElementText(checkboxtxt5));
					} else {
						throw new Exception("Checkbox is not clicable for Zungenreinigung");
					}
					pageLoad();
				
				}
				public void clickonCheckbox6() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Heading);
					if (isElementPresent(checkbox6)) {
						clickElementUsingJavaScript(checkbox6);
						boolean elementIsDisplayed=elementIsDisplayed(checkboxtxt6);
						Assert.assertTrue(elementIsDisplayed);
						System.out.println(getElementText(checkboxtxt6));
					} else {
						throw new Exception("Checkbox is not clicable for Kinder");
					}
					pageLoad();
				
				}
				public void clickonCheckbox7() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Heading);
					if (isElementPresent(checkbox7)) {
						clickElementUsingJavaScript(checkbox7);
						boolean elementIsDisplayed=elementIsDisplayed(checkboxtxt7);
						Assert.assertTrue(elementIsDisplayed);
						System.out.println(getElementText(checkboxtxt7));
					} else {
						throw new Exception("Checkbox is not clicable for Multifunktionsborsten");
					}
					pageLoad();
				
				}
				public void clickonCheckbox8() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Heading);
					if (isElementPresent(checkbox8)) {
						clickElementUsingJavaScript(checkbox8);
						boolean elementIsDisplayed=elementIsDisplayed(checkboxtxt8);
						Assert.assertTrue(elementIsDisplayed);
						System.out.println(getElementText(checkboxtxt8));
					} else {
						throw new Exception("Checkbox is not clicable for Vibration");
					}
					pageLoad();
				
				}
				public void clickonCheckbox9() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Heading);
					if (isElementPresent(checkbox9)) {
						clickElementUsingJavaScript(checkbox9);
						boolean elementIsDisplayed=elementIsDisplayed(checkboxtxt9);
						Assert.assertTrue(elementIsDisplayed);
						System.out.println(getElementText(checkboxtxt9));
					} else {
						throw new Exception("Checkbox is not clicable for Nachhaltige Zahnpflege ");
					}
					pageLoad();
				
				}
				public void clickonCheckbox10() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Heading);
					if (isElementPresent(checkbox10)) {
						clickElementUsingJavaScript(checkbox10);
						boolean elementIsDisplayed=elementIsDisplayed(checkboxtxt10);
						Assert.assertTrue(elementIsDisplayed);
						System.out.println(getElementText(checkboxtxt10));
					} else {
						throw new Exception("Checkbox is not clicable for Zahnverfärbung Enfernung ");
					}
					pageLoad();
				
				}
				public void clickonCheckbox11() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Heading);
					if (isElementPresent(checkbox11)) {
						clickElementUsingJavaScript(checkbox11);
						boolean elementIsDisplayed=elementIsDisplayed(checkboxtxt11);
						Assert.assertTrue(elementIsDisplayed);
						System.out.println(getElementText(checkboxtxt11));
					} else {
						throw new Exception("Checkbox is not clicable for Wellenprofil ");
					}
					pageLoad();
				
				}
				public void clickonCheckbox12() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Heading);
					if (isElementPresent(checkbox12)) {
						clickElementUsingJavaScript(checkbox12);
						boolean elementIsDisplayed=elementIsDisplayed(checkboxtxt12);
						Assert.assertTrue(elementIsDisplayed);
						System.out.println(getElementText(checkboxtxt12));
					} else {
						throw new Exception("Checkbox is not clicable for Hoch-Tief ");
					}
					pageLoad();
				
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

}