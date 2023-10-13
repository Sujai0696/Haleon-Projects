package com.qa.caltrate.ca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;



public class CaltratecaHeaderPage extends BaseClass{
	
	public CaltratecaHeaderPage() {
		PageFactory.initElements(driver, this);
	}	
		
    @FindBy(xpath = "//a[@href=\"/\"]//img")
    private static WebElement CaltratecaLogo;	
			
    @FindBy(xpath = "//div[@class=\"parametrizedhtml component section language-selector m-m-y-2 first odd reference-language-selector\"]")
    private static WebElement countryselector;
	
    @FindBy(xpath = "//div[@class=\"parametrizedhtml component section language-selector m-m-y-2 first odd reference-language-selector opened\"]")
    private static WebElement countryselectorOpen;
	
    @FindBy(xpath = "//input[@type=\"text\"]")
    private static WebElement searched;
	
    @FindBy(xpath = "//button[@type=\"submit\"]")
    private static WebElement submitted;
	
    @FindBy(xpath = "//*[@class='title-heading']//self::h1[text()='Search Results']")
    private static WebElement visibilityofsearch;
	
    @FindBy(xpath = "//a[@title=\"Products\"]")
    private static WebElement products;
	
    @FindBy(xpath = "(//ul[@class=\"navigation-root navigation-branch navigation-level1\"]//child::li[1])[1]")
    private static WebElement productsopen;
    
    //caltrate tablet//
    
    @FindBy(xpath = "//span[text()='PRODUCTS']")
    private static WebElement productsmain;
    
    @FindBy(xpath = "//a[text()='Caltrate PLUS']")
    private static WebElement caltrateplus;
    
    @FindBy(xpath = "//a[text()='Caltrate with Vitamin D']")
    private static WebElement vitaminD;
    
    @FindBy(xpath = "//a[text()='Caltrate SELECT']")
    private static WebElement caltrateselect;
    
    @FindBy(xpath = "//a[text()='Caltrate']")
    private static WebElement caltrate;
    
    //caltrate chewables//
    
    @FindBy(xpath = "//a[text()='Caltrate Gummies']")
    private static WebElement caltrategummies;
    
    @FindBy(xpath = "//a[text()='Caltrate Soft Chews']")
    private static WebElement caltratesoftchews;
    
    @FindBy(xpath = "//a[text()='Caltrate PLUS Chewables']")
    private static WebElement caltratepluschewables;
    
    @FindBy(xpath = "//strong[text()='Compare all products']")
    private static WebElement compareallproducts;
    
    //coupons//
    
    @FindBy(xpath = "//a[text()='Coupons ']")
    private static WebElement coupons;
    
    
    
    
    
    
    
//Methods//
	
  	public void clickoncaltrateslogo() throws Throwable {
  		waitForPageLoadJava();
  		visibilityOf(CaltratecaLogo);
  		clickElementUsingJavaScript(CaltratecaLogo);
  		Assert.assertTrue(true);
  	}
  	public void clickonCountrySelector() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(countryselector);
  		visibilityOf(countryselectorOpen);
  		implicitWait();
  		boolean elementIsDisplayed=elementIsDisplayed(countryselectorOpen);
  		Assert.assertTrue(elementIsDisplayed);
  		implicitWait();
  		clickElementUsingJavaScript(countryselectorOpen);
  	}
  	public void clickonSearchIcon() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(searched);
  		searched.sendKeys("Caltrate Gummies");
  		clickElementUsingJavaScript(submitted);
  		visibilityOf(visibilityofsearch);
  		boolean elementIsDisplayed=elementIsDisplayed(visibilityofsearch);
  		Assert.assertTrue(elementIsDisplayed);
  		System.out.println(getElementText(visibilityofsearch));
  		
  	}
  	public void clickonproducts() throws Throwable {
  		waitForPageLoadJava();
  		moveToElement(products);
  		clickElementUsingJavaScript(products);
  		visibilityOf(productsopen);
  		boolean elementIsDisplayed=elementIsDisplayed(productsopen);
  		Assert.assertTrue(elementIsDisplayed);
  		implicitWait();
  		clickElementUsingJavaScript(productsopen);
  	}
  	public void clickonproductMain() throws Throwable {
  		waitForPageLoadJava();
  		moveToElement(products);
  		clickElementUsingJavaScript(productsmain);
  	}
  	public void clickoncaltrateplus() throws Throwable {
  		waitForPageLoadJava();
  		moveToElement(products);
  		if (isElementPresent(caltrateplus)) {
  			clickElementUsingJavaScript(caltrateplus);
		} else {
			throw new Exception("caltrate plus is not able to click");

		}
  		
  	}
  	public void clickonvitaminD() throws Throwable {
  		waitForPageLoadJava();
  		moveToElement(products);
  		if (isElementPresent(vitaminD)) {
  			clickElementUsingJavaScript(vitaminD);
		} else {
			throw new Exception("Vitamin D is not able to click");

		}
  		
  		
  	}
  	public void clickoncaltrateselect() throws Throwable {
  		waitForPageLoadJava();
  		moveToElement(products);
  		if (isElementPresent(caltrateselect)) {
  			clickElementUsingJavaScript(caltrateselect);
		} else {
			throw new Exception("caltrate select is not able to click");

		}
  	}	
  	public void clickoncaltrate() throws Throwable {
  		waitForPageLoadJava();
  		moveToElement(products);
  		if (isElementPresent(caltrate)) {
  			clickElementUsingJavaScript(caltrate);
		} else {
			throw new Exception("caltrate  is not able to click");

		}
  	}	
  	public void clickoncaltrategummies() throws Throwable {
  		waitForPageLoadJava();
  		moveToElement(products);
  		if (isElementPresent(caltrategummies)) {
  			clickElementUsingJavaScript(caltrategummies);
		} else {
			throw new Exception("caltrategummies  is not able to click");

		}
  	}	
  	public void clickoncaltratesoftchews() throws Throwable {
  		waitForPageLoadJava();
  		moveToElement(products);
  		if (isElementPresent(caltratesoftchews)) {
  			clickElementUsingJavaScript(caltratesoftchews);
		} else {
			throw new Exception("caltratesoft chews is not able to click");

		}
  	}	
  	public void clickoncaltratepluschewables() throws Throwable {
  		waitForPageLoadJava();
  		moveToElement(products);
  		if (isElementPresent(caltratepluschewables)) {
  			clickElementUsingJavaScript(caltratepluschewables);
		} else {
			throw new Exception("caltrate plus chewables is not able to click");

		}
  	}	
  	public void clickonCompareAllproducts() throws Throwable {
  		waitForPageLoadJava();
  		moveToElement(products);
  		if (isElementPresent(compareallproducts)) {
  			clickElementUsingJavaScript(compareallproducts);
		} else {
			throw new Exception("Compare all products is not able to click");

		}
  	}	
  	public void clickonCoupons() throws Throwable {
  		waitForPageLoadJava();
  		moveToElement(coupons);
  		if (isElementPresent(coupons)) {
  			clickElementUsingJavaScript(coupons);
		} else {
			throw new Exception("Coupons is not able to click");

		}
  	}	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	

}
