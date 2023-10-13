package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class PrepHNewslettersignupPage extends BaseClass{
	
	public PrepHNewslettersignupPage() {
		PageFactory.initElements(driver, this);
	}	
	
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;
	
	@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[@id='onetrust-banner-sdk']")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//a[text()='Homepage (US)']")
	private static WebElement HomeBreadcrumbs;		
	
	@FindBy(xpath = "//li[text()=' Sign up ']")
	private static WebElement signupBreadcrumbs;		
	
	@FindBy(xpath = "//h1[text()='Keep Your Caboose In the Know']")
	private static WebElement signup_txt_Breadcrumbs;	
	
	@FindBy(xpath = "//input[@placeholder='First Name*']")
	private static WebElement firstname;	
	
	@FindBy(xpath = "//input[@placeholder='Last Name*']")
	private static WebElement lastname;	
	
	@FindBy(xpath = "//input[@placeholder='Email*']")
	private static WebElement email;	
	
	@FindBy(xpath = "//button[text()=' SIGN UP ']")
	private static WebElement submit;
	
	
	
	
	
	
	
	
	
	//Methods//
	
			public void clickonCookieBtn() throws Exception {
				waitForPageLoadJava();
				if(isElementPresent(cookieBtn)) {
					elementToBeClickable(cookieBtn);
					try {
						if(cookieBtn.isDisplayed()) {
							clickElementUsingJavaScript(cookieBtn);
						}
						implicitWait();
						visibilityOf(cookieClose);
						Assert.assertTrue(elementIsDisplayed(cookieClose));
					}
					catch (Exception e) {
						
					}
				}else {
					System.out.println("Dismiss is not presented");
					throw new Exception("Unable to click on cookie Pop-up");
				}
				}
			
			
				public void clickonHomeBreadcrumbs() throws Exception{
			    	waitForPageLoadJava();
					moveToElement(HomeBreadcrumbs);
					if (isElementPresent(HomeBreadcrumbs)) {
						clickElementUsingJavaScript(HomeBreadcrumbs);
						pageLoad();
					} else {
						throw new Exception("HomeBreadcrumbs are not Present on Page");
					}
					
				}	
				public void clickonSignupBreadcrumbs() throws Exception{
			    	waitForPageLoadJava();
					moveToElement(signupBreadcrumbs);
					scrollDownUsingElement(signupBreadcrumbs);
					if (isElementPresent(signupBreadcrumbs)) {
						clickElementUsingJavaScript(signupBreadcrumbs);
						visibilityOf(signup_txt_Breadcrumbs);
						boolean elementIsDisplayed=elementIsDisplayed(signup_txt_Breadcrumbs);
						Assert.assertTrue(elementIsDisplayed(signup_txt_Breadcrumbs));
						System.out.println(getElementText(signup_txt_Breadcrumbs));
						pageLoad();
					} else {
						throw new Exception("signup_txt_Breadcrumbs are not Present on Page");
					}
					
				}	
				public void clickonSignupform() throws Exception{
			    	waitForPageLoadJava();
					moveToElement(signupBreadcrumbs);
					firstname.sendKeys("yogita");
					String nameValue = firstname.getAttribute("value");
			        String expectedName = "yogita";
			        if (nameValue.equals(expectedName)) {
			            System.out.println("Name field verification passed.");
			        } else {
			            System.out.println("Name field verification failed.");
			        }
					//SurName//
			        lastname.sendKeys("Patil");
			        String surnameValue = lastname.getAttribute("value");
			        String expectedSurname = "Patil";
			        if (surnameValue.equals(expectedSurname)) {
			            System.out.println("Surname field verification passed.");
			        } else {
			            System.out.println("Surname field verification failed.");
			        }
			        //emails//
			        email.sendKeys("yogita.patil0515@gmail.com");
					String emailname=email.getAttribute("value");
					String expectedemailname="yogita.patil0515@gmail.com";
					if (emailname.equals(expectedemailname)) {
						System.out.println("Email is verified on form");
						
					} else {
						System.out.println("Email is not Verified on Form");
					}
					submit.click();
					
					
					
					
					
					
					
					
					
					
					
					
				}	
	
	
	
	
	
	
	
	
	
	
	
	

}
