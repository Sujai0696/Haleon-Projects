package com.qa.caltrate.fr.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CaltrateHeaderFrPage extends BaseClass{
	
	public CaltrateHeaderFrPage() {
		PageFactory.initElements(driver, this);
	}	
		
    @FindBy(xpath = "//div[@class=\"image component section megamenu-logo megamenu-bottom-center even col-xs-12 col-md-push-4\"]//child::img")
    private static WebElement CaltrateFrLogo;			
	
    @FindBy(xpath = "//div[@class=\"parametrizedhtml component section language-selector m-m-y-2 first odd reference-language-selector\"]")
    private static WebElement CountryselectorFr;	
	
    @FindBy(xpath = "//div[@class=\"parametrizedhtml component section language-selector m-m-y-2 first odd reference-language-selector opened\"]")
    private static WebElement CountryselectorFrOpen;
	
    @FindBy(xpath = "//input[@type=\"text\"]")
    private static WebElement search;
	
    @FindBy(xpath = "//button[@type=\"submit\"]")
    private static WebElement btnsubmit;
    
    @FindBy(xpath = "//h1[text()='Résultats De Recherche']//self::h1")
    private static WebElement visibilityofsearchIcon;
	
    @FindBy(xpath = "//a[text()='Produits ']")
    private static WebElement produits;
    
    @FindBy(xpath = "//li[@class=\"odd first has-children navigation-item navigation-level1 page-produits current-js is-active\"]")
    private static WebElement produitsopen;
    
	
    @FindBy(xpath = "//span[text()='PRODUITS']")
    private static WebElement mainproduits;
    
    @FindBy(xpath = "//a[text()='Caltrate PLUS']")
    private static WebElement caltrateplus;
    
    @FindBy(xpath = "//a[text()='Caltrate avec Vitamine D']")
    private static WebElement vitaminD;
    
    @FindBy(xpath = "//a[text()='Caltrate SELECT']")
    private static WebElement caltrateselect;
    
    @FindBy(xpath = "//a[text()='Caltrate']")
    private static WebElement caltrate;
    
    @FindBy(xpath = "//a[text()='Gelées Caltrate']")
    private static WebElement GeléesCaltrate;
    
    @FindBy(xpath = "//a[text()='Carrés à mâcher Caltrate']")
    private static WebElement CarrésàmâcherCaltrate;
    
    @FindBy(xpath = "//a[text()='Caltrate PLUS à croquer']")
    private static WebElement caltatePLUScroquer;
    
    @FindBy(xpath = "//strong[text()='Comparer tous les produits']")
    private static WebElement Comparertouslesproduits;
    
    @FindBy(xpath = "//a[text()='Coupons ']")
    private static WebElement Coupons;
    
    
    
    
	
	//Methods//
	
    public void clickonCaltrateFrLogo() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(CaltrateFrLogo);
	}
    public void clickonCountrySelector() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(CountryselectorFr);
  		visibilityOf(CountryselectorFrOpen);
  		boolean elementIsDisplayed=elementIsDisplayed(CountryselectorFrOpen);
  		Assert.assertTrue(elementIsDisplayed);
  		clickElementUsingJavaScript(CountryselectorFrOpen);
	}
    public void clickonSearchIcon() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(search);
  		search.sendKeys("Coupons");
  		clickElementUsingJavaScript(btnsubmit);
  		visibilityOf(visibilityofsearchIcon);
  		boolean elementIsDisplayed=elementIsDisplayed(visibilityofsearchIcon);
  		Assert.assertTrue(elementIsDisplayed);
  		System.out.println(getElementText(visibilityofsearchIcon));
	}
    public void clickonProduitsheading() throws Throwable {
  		waitForPageLoadJava();
  		//moveToElement(produits);
  		clickElementUsingJavaScript(produits);
//  		visibilityOf(produitsopen);
//  		boolean elementIsDisplayed=elementIsDisplayed(produitsopen);
//  		Assert.assertTrue(elementIsDisplayed);
//  		clickElementUsingJavaScript(produitsopen);
	}
    public void clickonMainproducts() throws Throwable {
  		waitForPageLoadJava();
  		moveToElement(produits);
  		if (isElementPresent(mainproduits)) {
  			clickElementUsingJavaScript(mainproduits);
		} else {
			throw new Exception("Main produit is not able to click");

		}
    }
    public void clickoncaltrateplus() throws Throwable {
  		waitForPageLoadJava();
  		moveToElement(produits);
  		if (isElementPresent(caltrateplus)) {
  			clickElementUsingJavaScript(caltrateplus);
		} else {
			throw new Exception("Caltrate plus is not able to click");

		}
    }
    public void clickoncaltrateselect() throws Throwable {
  		waitForPageLoadJava();
  		moveToElement(produits);
  		if (isElementPresent(caltrateselect)) {
  			clickElementUsingJavaScript(caltrateselect);
		} else {
			throw new Exception("Caltrate select is not able to click");

		}
    }
    public void clickoncaltrate() throws Throwable {
  		waitForPageLoadJava();
  		moveToElement(produits);
  		if (isElementPresent(caltrate)) {
  			clickElementUsingJavaScript(caltrate);
		} else {
			throw new Exception("Caltrate  is not able to click");

		}
    }
    public void clickonGeléesCaltrate() throws Throwable {
  		waitForPageLoadJava();
  		moveToElement(produits);
  		if (isElementPresent(GeléesCaltrate)) {
  			clickElementUsingJavaScript(GeléesCaltrate);
		} else {
			throw new Exception("GeléesCaltrate  is not able to click");

		}
    }
    public void clickonCarrésàmâcherCaltrate() throws Throwable {
  		waitForPageLoadJava();
  		moveToElement(produits);
  		if (isElementPresent(CarrésàmâcherCaltrate)) {
  			clickElementUsingJavaScript(CarrésàmâcherCaltrate);
		} else {
			throw new Exception("CarrésàmâcherCaltrate  is not able to click");

		}
    }
    public void clickoncaltatePLUScroquer() throws Throwable {
  		waitForPageLoadJava();
  		moveToElement(produits);
  		if (isElementPresent(caltatePLUScroquer)) {
  			clickElementUsingJavaScript(caltatePLUScroquer);
		} else {
			throw new Exception("caltatePLUScroquer  is not able to click");

		}
    }
    public void clickonComparertouslesproduits() throws Throwable {
  		waitForPageLoadJava();
  		moveToElement(produits);
  		if (isElementPresent(Comparertouslesproduits)) {
  			clickElementUsingJavaScript(Comparertouslesproduits);
		} else {
			throw new Exception("Comparertouslesproduits  is not able to click");

		}
    }
    public void clickonCoupons() throws Throwable {
  		waitForPageLoadJava();
  		moveToElement(produits);
  		if (isElementPresent(Coupons)) {
  			clickElementUsingJavaScript(Coupons);
		} else {
			throw new Exception("Coupons  is not able to click");

		}
    }
    
    
	

}
