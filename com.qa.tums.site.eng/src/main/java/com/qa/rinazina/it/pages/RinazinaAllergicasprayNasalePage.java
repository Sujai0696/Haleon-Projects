package com.qa.rinazina.it.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;



public class RinazinaAllergicasprayNasalePage extends BaseClass{
	
	public RinazinaAllergicasprayNasalePage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Accetta tutti i cookie']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
		private static WebElement cookieClose;
		
		@FindBy(xpath = "//li[@class=\"breadcrumb-list-item odd first \"]//child::a[text()='Home']")
		private static WebElement HomeBreadcrumbs;
	
		@FindBy(xpath = "//ol[@class=\"breadcrumbs-list breadcrumbs-without-separator\"]//child::li[@class=\"breadcrumb-list-item even last is-current \"]")
		private static WebElement RinazinaAntiallergicalsprayNasleBreadcrumbs;
	
		@FindBy(xpath = "//span[text()='Come si usa']//ancestor::header[@class=\"accordion-head\"]")
		private static WebElement accordionOne;
		
		@FindBy(xpath = "//span[text()='Come si usa']//ancestor::li[@class=\"accordion-slide first odd\"]")
		private static WebElement accordionCloseOne;
		
		@FindBy(xpath = "//ul[@class=\"accordion-container\"]")
		private static WebElement accordionActiveOne;
	
		@FindBy(xpath = "//span[text()='Informazioni sul prodotto']//ancestor::header[@class=\"accordion-head\"]")
		private static WebElement accordionTwo;
	
		@FindBy(xpath = "//span[text()='Informazioni sul prodotto']//ancestor::li[@class=\"accordion-slide even is-active\"]")
		private static WebElement accordionActiveTwo;
	
		@FindBy(xpath = "//span[text()='Informazioni sul prodotto']")
		private static WebElement accordionCloseTwo;
		
		@FindBy(xpath = "//span[text()='Componenti']//ancestor::header[@class=\"accordion-head\"]")
		private static WebElement accordionThree;
	
		@FindBy(xpath = "//li[@class=\"accordion-slide last odd is-active\"]")
		private static WebElement accordionActiveThree;
	
		@FindBy(xpath = "//span[text()='Componenti']//parent::a")
		private static WebElement accordionCloseThree;
	
	
	
	
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
					
				public void clickonHomeBreadcrumbs() throws Exception {
					waitForPageLoadJava();
					clickElementUsingJavaScript(HomeBreadcrumbs);
					pageLoad();
				}
				public void clickonRinazinaAntiallergicalSprayNasaleBreadcrumbs() throws Exception {
					waitForPageLoadJava();
					visibilityOf(RinazinaAntiallergicalsprayNasleBreadcrumbs);
					if (isElementPresent(RinazinaAntiallergicalsprayNasleBreadcrumbs)) {
						Assert.assertTrue(elementIsDisplayed(RinazinaAntiallergicalsprayNasleBreadcrumbs));	
						} else {
							throw new Exception("Element RinazinaAntiallergicalsprayNasleBreadcrumbs is not presented on page");
						}
						
				}
				public void clickonComesiusa() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(accordionOne);
					if (isElementPresent(accordionActiveOne)) {
					clickElementUsingJavaScript(accordionOne);	
						visibilityOf(accordionCloseOne);
						Assert.assertTrue(elementIsDisplayed(accordionCloseOne));
						System.out.println(getElementText(accordionOne));
					} else {
										
						throw new Exception("Element AccordionOne is not presented on page");
				}
				}
				public void clickonInformazionisul() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(accordionTwo);
					if (isElementPresent(accordionActiveOne)) {
						clickElementUsingJavaScript(accordionTwo);	
							visibilityOf(accordionActiveTwo);
							Assert.assertTrue(elementIsDisplayed(accordionActiveTwo));
							clickElementUsingJavaScript(accordionActiveTwo);
							visibilityOf(accordionCloseTwo);
							Assert.assertTrue(elementIsDisplayed(accordionCloseTwo));
							System.out.println(getElementText(accordionTwo));
						} else {
											
							throw new Exception("Element AccordionTwo is not presented on page");
					}
				}
				public void clickonComponenti() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(accordionThree);
					if (isElementPresent(accordionActiveOne)) {
						clickElementUsingJavaScript(accordionThree);	
							visibilityOf(accordionActiveThree);
							Assert.assertTrue(elementIsDisplayed(accordionActiveThree));
							clickElementUsingJavaScript(accordionActiveThree);
							visibilityOf(accordionCloseThree);
							Assert.assertTrue(elementIsDisplayed(accordionCloseThree));
							System.out.println(getElementText(accordionThree));
						} else {
											
							throw new Exception("Element AccordionThree is not presented on page");
					}
				}
	
	
	
	
	
	
	
	
	
	
	
	

}
