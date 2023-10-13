package com.qa.caltrate.fr.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class CaltratefrSitemapPage extends BaseClass{
	
	public CaltratefrSitemapPage() {
		PageFactory.initElements(driver, this);
	}	
		
    @FindBy(xpath = "//li[text()=' Home ']")
    private static WebElement homebreadcrumbs;			
	
    @FindBy(xpath = "//a[text()='Produits']")
    private static WebElement produits;	
	
    @FindBy(xpath = "//a[text()='Caltrate Plus']")
    private static WebElement caltrateplus;	
	
    @FindBy(xpath = "//a[text()='Caltrate avec vitamine D']")
    private static WebElement caltratevitaminD;	
	
    @FindBy(xpath = "(//a[text()='Caltrate SELECT'])[2]")
    private static WebElement caltrateselect;	
	
    @FindBy(xpath = "(//a[text()='Caltrate'])[2]")
    private static WebElement caltrate;
	
    @FindBy(xpath = "(//a[text()='Gelées Caltrate'])[2]")
    private static WebElement GeléesCaltrate;
	
    @FindBy(xpath = "(//a[text()='Carrés à mâcher Caltrate'])[2]")
    private static WebElement CarrésmâcherCaltrate;
	
    @FindBy(xpath = "(//a[text()='Caltrate PLUS à croquer'])[2]")
    private static WebElement CaltratePLUScroquer;
	
    @FindBy(xpath = "//a[text()='Coupons']")
    private static WebElement coupons;
    
    @FindBy(xpath = "//a[text()='Nous rejoindre']")
    private static WebElement nousrejoinder;
    
    
  //Methods//
  	
    public void clickonHomebreadcrumbs() throws Throwable {
  		waitForPageLoadJava();
  		scrollDownUsingElement(homebreadcrumbs);
  		clickElementUsingJavaScript(homebreadcrumbs);
	}	
    public void clickonproduits() throws Throwable {
  		waitForPageLoadJava();
  		scrollDownUsingElement(produits);
  		clickElementUsingJavaScript(produits);
	}	
    public void clickoncaltrateplus() throws Throwable {
  		waitForPageLoadJava();
  		scrollDownUsingElement(caltrateplus);
  		clickElementUsingJavaScript(caltrateplus);
	}	
    public void clickoncaltrateVitaminD() throws Throwable {
  		waitForPageLoadJava();
  		scrollDownUsingElement(caltratevitaminD);
  		clickElementUsingJavaScript(caltratevitaminD);
	}	
    public void clickoncaltrateselect() throws Throwable {
  		waitForPageLoadJava();
  		scrollDownUsingElement(caltrateselect);
  		clickElementUsingJavaScript(caltrateselect);
	}	
    public void clickoncaltrate() throws Throwable {
  		waitForPageLoadJava();
  		scrollDownUsingElement(caltrate);
  		clickElementUsingJavaScript(caltrate);
	}	
    public void clickonGeelescaltrate() throws Throwable {
  		waitForPageLoadJava();
  		scrollDownUsingElement(GeléesCaltrate);
  		clickElementUsingJavaScript(GeléesCaltrate);
	}	
    public void clickonCarrésmâcherCaltrate() throws Throwable {
  		waitForPageLoadJava();
  		scrollDownUsingElement(CarrésmâcherCaltrate);
  		clickElementUsingJavaScript(CarrésmâcherCaltrate);
	}	
    public void clickonCaltratePLUScroquer() throws Throwable {
  		waitForPageLoadJava();
  		scrollDownUsingElement(CaltratePLUScroquer);
  		clickElementUsingJavaScript(CaltratePLUScroquer);
	}	
    public void clickonCoupons() throws Throwable {
  		waitForPageLoadJava();
  		scrollDownUsingElement(coupons);
  		clickElementUsingJavaScript(coupons);
	}	
    public void clickonNousrejoindre() throws Throwable {
  		waitForPageLoadJava();
  		scrollDownUsingElement(nousrejoinder);
  		clickElementUsingJavaScript(nousrejoinder);
	}	
	
	

}
