package com.qa.caltrate.fr.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class CaltrateoffresspecialesPage extends BaseClass{
	
	public CaltrateoffresspecialesPage() {
		PageFactory.initElements(driver, this);
	}	
		
    @FindBy(xpath = "//a[text()='Home']")
    private static WebElement homebreadcrumbs;			
	
    @FindBy(xpath = "//li[text()=' Coupons ']")
    private static WebElement couponsbreadcrumbs;	
	
    @FindBy(xpath = "//div[@class=\"image component section image-w-auto odd col-xs-12\"]//child::img")
    private static WebElement economizemaintantCard;	
	
    @FindBy(xpath = "//a[text()='d’économies santé de Haleon']")
    private static WebElement déconomiessantédeHaleon;
	
    @FindBy(xpath = "//div[@class=\"image component section image-w-auto even last col-xs-12\"]//child::img")
    private static WebElement couponsImage;
	
	
	
	
	
	
	
	
	
	
	
//Methods//
	
    public void clickonHomebreadcrumbs() throws Throwable {
  		waitForPageLoadJava();
  		scrollDownUsingElement(homebreadcrumbs);
  		clickElementUsingJavaScript(homebreadcrumbs);
	}	
    public void clickonCouponsbreadcrumbs() throws Throwable {
  		waitForPageLoadJava();
  		scrollDownUsingElement(couponsbreadcrumbs);
  		clickElementUsingJavaScript(couponsbreadcrumbs);
	}	
    public void clickoneconomizemaintantCards() throws Throwable {
  		waitForPageLoadJava();
  		scrollDownUsingElement(economizemaintantCard);
  		clickElementUsingJavaScript(economizemaintantCard);
	}	
    public void clickonedeconomiessantehaleon() throws Throwable {
  		waitForPageLoadJava();
  		scrollDownUsingElement(déconomiessantédeHaleon);
  		clickElementUsingJavaScript(déconomiessantédeHaleon);
  		
	}	
    public String clickonCouponsImage() throws Throwable {
  		waitForPageLoadJava();
  		scrollDownUsingElement(couponsImage);
  		clickElementUsingJavaScript(couponsImage);
  		String currentUrl=getCurrentUrl();
  		return currentUrl;
  		
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
