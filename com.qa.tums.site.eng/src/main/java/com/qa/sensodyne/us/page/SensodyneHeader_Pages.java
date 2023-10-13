package com.qa.sensodyne.us.page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneHeader_Pages extends BaseClass{
	
	public SensodyneHeader_Pages(){
		 PageFactory.initElements(driver, this);
	 }
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;

    @FindBy(xpath = "(//h2[text()='Sign Up & Save!'])[2]")
    private static WebElement gigyaForm;

    @FindBy(xpath = "//div[contains(@class,'content_hide')]")
    private static WebElement gigyaClose;
    
	 @FindBy(xpath = "(//div[@class=\"box component section top-bar-blend-bg first odd col-xs-12\"]//a)[3]")
	 private static WebElement coupon;
	
	 @FindBy(xpath = "(//div[@class=\"richText component section default-style even last\"])//child::a")
	 private static WebElement WhereToBuy;
	
	 @FindBy(xpath = "//span[text()='Sensodyne, Homepage']")
	 private static WebElement SensodyneSymbol;
	
	 @FindBy(xpath = "(//a[text()='For Professionals'])[1]")
	 private static    WebElement Professtional;
	
	 @FindBy(xpath = "//div[@class=\"select-country is-open\"]")
	 private static WebElement SelectCountry_open;
	
	 @FindBy(xpath = "//div[@class=\"select-country\"]")
	 private static  WebElement SelectCountry;
	
	 @FindBy(xpath = "(//i[@class=\"icon icon-GSK-logo\"])[1]")
	 private static WebElement GskLogo;
	
	 @FindBy(xpath = "(//button[@type=\"submit\"])[1]")
	 private static  WebElement Search;
	    
	 @FindBy(xpath = "(//div[@class=\"richText component section list-footer first odd col-xs-12\"])//li[1]")
	 private static WebElement ContactUs;
	
	 @FindBy(xpath = "(//div[@class=\"richText component section list-footer first odd col-xs-12\"])//li[2]")
	 private static  WebElement Sitemap;
	 
	 @FindBy(xpath = "(//div[@class=\"richText component section list-footer first odd col-xs-12\"])//li[3]")
	 private static  WebElement Termscondition;
	
	 @FindBy(xpath = "(//div[@class=\"richText component section list-footer first odd col-xs-12\"])//li[6]")
	 private static WebElement Accessibility;
	
	 @FindBy(xpath = "(//div[@class=\"richText component section list-footer first odd col-xs-12\"])//li[7]")
	 private static WebElement AcceptPolicy;
	 
	 @FindBy(xpath = "(//div[@class=\"richText component section list-footer first odd col-xs-12\"])//li[5]")
	 private static WebElement yourprivacychoices;
	 
	 
	 @FindBy(xpath = "(//h2[text()='Sign Up & Save!'])[1]")
	 private static WebElement GigyaformOne;
	
	 @FindBy(xpath = "(//input[@placeholder=\"First Name  *\"])[1]")
	 private static WebElement FirstName;
	
	 @FindBy(xpath = "(//input[@placeholder=\"Email  *\"])[1]")
	 private static WebElement email;
	
	 @FindBy(xpath = "(//button[@type=\"submit\"])[3]")
	 private static WebElement SubmitBtn;
	
	
	//Methods//
	 
	 public void clickCookieBtn() throws Exception {
	        elementToBeClickable(cookieBtn);
	        try {
	            if (cookieBtn.isDisplayed()) {
	                elementClick(cookieBtn);
	            }
	            visibilityOf(cookieClose);
	            Assert.assertTrue(elementIsDisplayed(cookieClose));
	            elementClick(cookieClose);
	        } catch (Exception e) {
	        }
	    }
	    public void clickGigyaForm() throws Exception {
	        elementToBeClickable(gigyaForm);
	        try {
	            if (gigyaForm.isDisplayed()) {
	                elementClick(gigyaForm);
	            }
	            visibilityOf(gigyaClose);
	            implicitWait();
	            Assert.assertTrue(elementIsDisplayed(gigyaClose));
	            elementClick(gigyaClose);
	        } catch (Exception e) {
	       }
	    }
	 
	 public void click_on_Coupon_Link() throws Exception {
			clickElementUsingJavaScript(coupon);
		}
	 public void click_on_WhereToBuy_Link() throws Exception {
			clickElementUsingJavaScript(WhereToBuy);
		}
	 public void click_on_SensodyneSymbol_Link() throws Exception {
			clickElementUsingJavaScript(SensodyneSymbol);
		}
	 public void click_on_Profestional_Link() throws Exception {
			elementClick(Professtional);
		}
	 public void click_on_SelectCountry_Link() throws Exception {
			elementClick(SelectCountry);
			visibilityOf(SelectCountry_open);
			boolean elementIsDisplayed=elementIsDisplayed(SelectCountry_open);
			Assert.assertTrue(elementIsDisplayed);
			elementClick(SelectCountry_open);
		}
	 public void click_on_GSKLogo_Link() throws Exception {
			elementClick(GskLogo);
		}
	 public void click_on_Search_Link() throws Exception {
			clickElementUsingJavaScript(Search);
		}
		
		 public void click_on_ContactUs_Link() throws Exception {
				clickElementUsingJavaScript(ContactUs);
			}
		 public void click_on_SiteMap_Link() throws Exception {
			
				clickElementUsingJavaScript(Sitemap);
			}
		 public void click_on_Termscondition_Link() throws Exception {
			 //scrollDownUsingElement(AcceptPolicy);
				clickElementUsingJavaScript(Termscondition);
			}
		 public void click_on_yourprivacychoices_Link() throws Exception {
			 //scrollDownUsingElement(AcceptPolicy);
				clickElementUsingJavaScript(yourprivacychoices);
			}
		 public void click_on_Accessibility_Link() throws Exception {
			// scrollDownUsingElement(Accessibility);
				clickElementUsingJavaScript(Accessibility);
			}
		 public void click_on_AcceptPolicy_Link() throws Exception {
			 //scrollDownUsingElement(AcceptPolicy);
				clickElementUsingJavaScript(AcceptPolicy);
			}
		 
		 
		 public void click_on_GigyaFormOne_Link() throws Exception {
			// scrollDownUsingElement(FirstName);
			 clickElementUsingJavaScript(GigyaformOne);
				elementSendKeys(FirstName, "Yogita");
				elementSendKeys(email, "yogita.patil0515@gmail.com");
				clickElementUsingJavaScript(SubmitBtn);
				//email.sendKeys(Keys.ENTER);
				
				
			}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

		 
		 
		 
		 
		 
		 

		 
		 
		 
		 
		 
}
