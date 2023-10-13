package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevaReviewsPage extends BaseClass{
	
	public AbrevaReviewsPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//button[text()='Accept Cookies']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[@id='onetrust-banner-sdk']")
		private static WebElement cookieClose;
				
		@FindBy(xpath = "//div[@class='navigation component section aria-label-js first odd last initialized']//a[@href='/cold-sore-products/abreva-cream/']")
		private static WebElement abrevaproducts;			
	
		@FindBy(xpath = "//h1[text()='About Abreva Cold Sore Cream']")
		private static WebElement abrevaproducts_txt;	
	
		@FindBy(xpath = "//a[@href='/cold-sore-products/how-abreva-cream-works/']")
		private static WebElement abrevacreamworks;	
	
		@FindBy(xpath = "//h1[text()='HOW ABREVA WORKS']")
		private static WebElement abrevacreamworks_txt;	
	
		@FindBy(xpath = "//a[@href='/cold-sore-products/how-to-use-abreva-cream/']")
		private static WebElement useabrevacream;	
	
		@FindBy(xpath = "//h1[text()='HOW TO USE ABREVA CREAM TO TREAT COLD SORES']")
		private static WebElement useabrevacream_txt;	
	
		@FindBy(xpath = "//a[@href='/cold-sore-products/abreva-reviews/']")
		private static WebElement abrevareviews;	
	
		@FindBy(xpath = "//h1[text()='Abreva Reviews']")
		private static WebElement abrevareviews_txt;	
	
	
	
	
	
	
	
	
	
	
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
		public void clickonAbrevaProducts() throws Exception {	
			waitForPageLoadJava();
			moveToElement(abrevaproducts);
			clickElementUsingJavaScript(abrevaproducts);
			visibilityOf(abrevaproducts_txt);
			boolean elementIsDisplayed=elementIsDisplayed(abrevaproducts_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(abrevaproducts_txt));
			pageLoad();
		}
		public void clickonAbrevaCreamworks() throws Exception {	
			waitForPageLoadJava();
			//moveToElement(abrevacreamworks);
			clickElementUsingJavaScript(abrevacreamworks);
			visibilityOf(abrevacreamworks_txt);
			boolean elementIsDisplayed=elementIsDisplayed(abrevacreamworks_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(abrevacreamworks_txt));
			pageLoad();
		}
		public void clickonUseAbrevacream() throws Exception {	
			waitForPageLoadJava();
			moveToElement(useabrevacream);
			clickElementUsingJavaScript(useabrevacream);
			visibilityOf(useabrevacream_txt);
			boolean elementIsDisplayed=elementIsDisplayed(useabrevacream_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(useabrevacream_txt));
			pageLoad();
		}
		public void clickonAbrevaReview() throws Exception {	
			waitForPageLoadJava();
			moveToElement(abrevareviews);
			clickElementUsingJavaScript(abrevareviews);
			visibilityOf(abrevareviews_txt);
			boolean elementIsDisplayed=elementIsDisplayed(abrevareviews_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(abrevareviews_txt));
			pageLoad();
		}
	
	
	
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
