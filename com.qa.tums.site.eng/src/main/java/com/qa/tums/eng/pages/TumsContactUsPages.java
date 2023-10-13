package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class TumsContactUsPages extends BaseClass{

		
		public TumsContactUsPages() {
			PageFactory.initElements(driver, this);
		}	
		@FindBy(xpath = "//button[text()='Accept Cookies']")
	    private static WebElement cookieBtn;

	    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	    private static WebElement cookieClose;

		@FindBy(xpath="//ol[@class=\"breadcrumbs-list breadcrumbs-without-separator\"]//li[1]")
	    private static WebElement homebreadcrumbs;
	
		@FindBy(xpath="//li[@class=\"breadcrumb-list-item even last is-current \"]")
	    private static WebElement contactusbreadcrumbs;
	
	
		@FindBy(xpath="//a[text()='Frequently Asked Questions(FAQs)']")
	    private static WebElement FAQ;
	
	
		//methods
		
		public void clickCookieBtn() throws Exception {
			//visibilityOf(cookieBtn);
	        if (isElementPresent(cookieBtn)) {
	            elementToBeClickable(cookieBtn);
	            try {
	                if (cookieBtn.isDisplayed()) {
	                    clickElementUsingJavaScript(cookieBtn);
	                }
//	                implicitWait(10);
	               actionClick(cookieClose);
	                Assert.assertTrue(elementIsDisplayed(cookieClose));
	            } catch (Exception e) {
	            }
	        }else {
	            System.out.println("Dismiss is not presented");
	        }
		}
			public void clickonhomebreadcrumbs() throws Throwable {
				clickElementUsingJavaScript(homebreadcrumbs);
		}
			public void clickonContactusbreadcrumbs() throws Throwable {
				clickElementUsingJavaScript(contactusbreadcrumbs);
		}
			public void clickonFAQ() throws Throwable {
				clickElementUsingJavaScript(FAQ);
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	

