package com.qa.caltrate.fr.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;



public class CaltrateFrFooterPage  extends BaseClass{
	
	public CaltrateFrFooterPage() {
		PageFactory.initElements(driver, this);
	}	
		
    @FindBy(xpath = "//a[text()='Nous Rejoindre']")//contactus//
    private static WebElement NousRejoindre;		
	
	
    @FindBy(xpath = "//a[text()='Plan du site']")  //sitemap//
    private static WebElement Plandusite;	
	
   
	//Methods//
	
    public void clickonNousrejoindre() throws Throwable {
  		waitForPageLoadJava();
  		scrollDownUsingElement(NousRejoindre);
  		clickElementUsingJavaScript(NousRejoindre);
	}	
    public void clickonPlandusite() throws Throwable {
  		waitForPageLoadJava();
  		scrollDownUsingElement(Plandusite);
  		clickElementUsingJavaScript(Plandusite);
	}
	
	
	
	
	
	

}
