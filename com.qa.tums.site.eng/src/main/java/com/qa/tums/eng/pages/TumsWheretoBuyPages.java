package com.qa.tums.eng.pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class TumsWheretoBuyPages extends BaseClass{
	
	public TumsWheretoBuyPages() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
	
	
	@FindBy(xpath="//li[@class=\"breadcrumb-list-item odd first \"]")
    private static WebElement Homebreadcrumbs;
	
	@FindBy(xpath="//li[@class=\"breadcrumb-list-item even last is-current \"]")
    private static WebElement Wheretobuybreadcrumbs;
	
	@FindBy(xpath="//select[@id=\"__ps-sku-selector-0_0\"]")
    private static WebElement dropDownClick;
	
	@FindBy(xpath="//select[@id=\"__ps-sku-selector-1_0\"]")
    private static WebElement values;
	
	@FindBy(xpath="//select[@id=\"__ps-sku-selector-2_0\"]")
    private static WebElement flavor;
	
	@FindBy(xpath="//select[@id=\"__ps-sku-selector-0_0\"]//option[1]")
    private static WebElement chewybite;
	
	@FindBy(xpath="//select[@id=\"__ps-sku-selector-1_0\"]//option[1]")
    private static WebElement chewybitesize;
	
	
	
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
	                //actionClick(cookieClose);
	            } catch (Exception e) {
	            }
	        }else {
	            System.out.println("Dismiss is not presented");
	        }
		}
		

		public void clickonHomebreadcrumbs() throws Throwable {
			clickElementUsingJavaScript(Homebreadcrumbs);
	}	
		public void clickonWheretobuybreadcrumbs() throws Throwable {
			clickElementUsingJavaScript(Wheretobuybreadcrumbs);
			
	}
		public  static void clickondropdownchewybite() {
		
			WebElement list = driver.findElement(By.xpath("//select[@id=\"__ps-sku-selector-0_0\"]"));
		    Select select = new Select(list);

		    if (select.isMultiple()) {

		        try {
		            List<WebElement> optionLists = select.getOptions();
		            //listFound = false;
		            for (int i = 0; i < optionLists.size(); i++) {
		                String text = optionLists.get(i).getText();
		                if (text.equals(list)) {
		                    optionLists.get(i).click();
		                   // listFound = true; break;
		        }
		            } 
		        }  catch (StaleElementReferenceException e) {
		            e.printStackTrace();
		        }   

		    } else {
		    
		    }

		    }
		
					
				
		
		}


