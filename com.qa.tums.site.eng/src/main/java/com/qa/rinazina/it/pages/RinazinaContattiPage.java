package com.qa.rinazina.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;
public class RinazinaContattiPage extends BaseClass{
	
	public RinazinaContattiPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Accetta tutti i cookie']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
		private static WebElement cookieClose;
		
		@FindBy(xpath = "//li[@class=\"breadcrumb-list-item odd first \"]//ancestor::a[text()='Home']")
		private static WebElement HomeBreadcrumbs;
	
		@FindBy(xpath = "//li[@class=\"breadcrumb-list-item even last is-current \"]//child::a[text()='Contatti']")
		private static WebElement ContattiBreadcrumbs;	
		
	
	
	
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
		public void clickonContattiBreadcrumbs() throws Exception {
			waitForPageLoadJava();
			visibilityOf(ContattiBreadcrumbs);
			if (isElementPresent(ContattiBreadcrumbs)) {
				Assert.assertTrue(elementIsDisplayed(ContattiBreadcrumbs));
				
			} else {
				throw new Exception("Element ContattiBreadcrumbs is not presented on page");
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
