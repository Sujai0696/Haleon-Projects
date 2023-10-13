package com.qa.caltrate.ca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class CaltrateSiteMapPage extends BaseClass{
	
	public CaltrateSiteMapPage() {
		PageFactory.initElements(driver, this);
	}	
		
    @FindBy(xpath = "//strong[text()='Products']")
    private static WebElement products;	
		
    @FindBy(xpath = "//strong[text()='Caltrate with Vitamin D']")
    private static WebElement CaltrateVitaminD;	
	
    @FindBy(xpath = "//strong[text()='Caltrate Plus']")
    private static WebElement Caltrateplus;	
		
    @FindBy(xpath = "//strong[text()='Caltrate Select']")
    private static WebElement Caltrateselect;	
	
    @FindBy(xpath = "//strong[text()='Caltrate']")
    private static WebElement Caltrate;
	
    @FindBy(xpath = "//strong[text()='Caltrate Gummies']")
    private static WebElement CaltrateGummies;
	
    @FindBy(xpath = "//strong[text()='Caltrate Soft Chews']")
    private static WebElement Caltratesoftchews;
	
    @FindBy(xpath = "//strong[text()='Caltrate Plus Chewables']")
    private static WebElement Caltratepluschewables;
	
    @FindBy(xpath = "//strong[text()='Coupons']")
    private static WebElement coupons;
	
    @FindBy(xpath = "//strong[text()='Contact Us']")
    private static WebElement contactus;
	
	
	
	
	
	
//Methods//
	
  	public void clickonProducts() throws Throwable {
  		waitForPageLoadJava();
  		scrollDownUsingElement(products);
  		clickElementUsingJavaScript(products);
  
  }	
  	public void clickonCaltratePlus() throws Throwable {
  		waitForPageLoadJava();
  		scrollDownUsingElement(Caltrateplus);
  		clickElementUsingJavaScript(Caltrateplus);
  	
  }	
  	public void clickonCaltrateVitaminD() throws Throwable {
  		waitForPageLoadJava();
  		scrollDownUsingElement(CaltrateVitaminD);
  		clickElementUsingJavaScript(CaltrateVitaminD);
  	
  }	
  	public void clickonCaltrateSelect() throws Throwable {
  		waitForPageLoadJava();
  		scrollDownUsingElement(Caltrateselect);
  		clickElementUsingJavaScript(Caltrateselect);
  	
  }	
  	public void clickonCaltrate() throws Throwable {
  		waitForPageLoadJava();
  		scrollDownUsingElement(Caltrate);
  		clickElementUsingJavaScript(Caltrate);
  	
  }	
  	public void clickonCaltrategummies() throws Throwable {
  		waitForPageLoadJava();
  		scrollDownUsingElement(CaltrateGummies);
  		clickElementUsingJavaScript(CaltrateGummies);
  	
  }	
  	public void clickonCaltratesoftchew() throws Throwable {
  		waitForPageLoadJava();
  		scrollDownUsingElement(Caltratesoftchews);
  		clickElementUsingJavaScript(Caltratesoftchews);
  	
  }	
  	public void clickonCaltratepluschewables() throws Throwable {
  		waitForPageLoadJava();
  		scrollDownUsingElement(Caltratepluschewables);
  		clickElementUsingJavaScript(Caltratepluschewables);
  	
  }	
  	public void clickoncoupons() throws Throwable {
  		waitForPageLoadJava();
  		scrollDownUsingElement(coupons);
  		clickElementUsingJavaScript(coupons);
  	
  }	
  	public void clickoncontactus() throws Throwable {
  		waitForPageLoadJava();
  		scrollDownUsingElement(contactus);
  		clickElementUsingJavaScript(contactus);
  	
  }	
	
	
	
	

}
