package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class TumsProbioticDuringPregancyPages extends BaseClass{
	
	public TumsProbioticDuringPregancyPages() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
	
	@FindBy(xpath="//div[@class=\"breadcrumbs component section default-style first odd last col-xs-12\"]//child::a")
    private static WebElement homebreadcrumbs;
	
	@FindBy(xpath="(//li[@class=\"breadcrumb-list-item even \"])[2]//a")
    private static WebElement heartburn101breadcrumbs;
		
	@FindBy(xpath="//div[@class=\"breadcrumbs component section default-style first odd last col-xs-12\"]//child::li[4]")
    private static WebElement probioticduringpregancybreadcrumbs;
	
	@FindBy(xpath="(//a[@href=\"/antacid-products/ultra-1000/\"])[3]")
    private static WebElement Tums;
	
	@FindBy(xpath="//a[text()='taking TUMS while pregnant']")
    private static WebElement Tumswhilepregant;
	
	@FindBy(xpath="//a[text()='remedies for pregnancy and heartburn']")
    private static WebElement remediesforpregancy;
	
	@FindBy(xpath="//a[text()='See products']")
    private static WebElement seeproducts;
	
	
	
	
	
	
	
	
	//methods
	
	public void clickCookieBtn() throws Exception {
		//visibilityOf(cookieBtn);
        if (isElementPresent(cookieBtn)) {
            elementToBeClickable(cookieBtn);
            try {
                if (cookieBtn.isDisplayed()) {
                    clickElementUsingJavaScript(cookieBtn);
                }
              implicitWait();
               actionClick(cookieClose);
                Assert.assertTrue(elementIsDisplayed(cookieClose));
            } catch (Exception e) {
            }
        }else {
            System.out.println("Dismiss is not presented");
        }
	}
	
			public void clickonhomebreadcrumbs() throws Throwable {
				moveToElement(homebreadcrumbs);
				clickElementUsingJavaScript(homebreadcrumbs);
		}
			public void clickonheartburn101breadcrumbsButton() throws Exception {
		
			     elementClick(heartburn101breadcrumbs);
			      }
			public void clickonprobioticduringpregancybreadcrumbsButton() throws Exception {
			   
			     elementClick(probioticduringpregancybreadcrumbs);
			      }
			
			public void clickonTumsButton() throws Exception {
				   
			    clickElementUsingJavaScript(Tums);
			      }
			public void clickonTumswhilepregantButton() throws Exception {
				   
			    clickElementUsingJavaScript(Tumswhilepregant);
			      }
			public void clickonremediesforpregantButton() throws Exception {
				   
			    clickElementUsingJavaScript(remediesforpregancy);
			      }
			public void clickonseeproductsButton() throws Exception {
				   
			    clickElementUsingJavaScript(seeproducts);
			      }
	
	
	
	
	
	
	
	
	
	
	
	
	

}
