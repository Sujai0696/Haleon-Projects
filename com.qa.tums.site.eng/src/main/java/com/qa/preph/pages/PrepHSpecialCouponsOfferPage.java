package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class PrepHSpecialCouponsOfferPage extends BaseClass{
	
	public PrepHSpecialCouponsOfferPage() {
		PageFactory.initElements(driver, this);
	}	
	
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;
	
	@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[@id='onetrust-banner-sdk']")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//a[text()='Homepage (US)']")
	private static WebElement HomeBreadcrumbs;		
		
	@FindBy(xpath = "//li[text()=' Offers ']")
	private static WebElement offerBreadcrumbs;		
	
	@FindBy(xpath = "//h1[text()='Save and shop Preparation H']")
	private static WebElement offer_txt_Breadcrumbs;	
	
	@FindBy(xpath = "//input[@placeholder='First Name*']")
	private static WebElement firstname;	
	
	@FindBy(xpath = "//input[@placeholder='Last Name*']")
	private static WebElement lastname;	
	
	@FindBy(xpath = "//input[@placeholder='Email*']")
	private static WebElement emailname;	
	
	@FindBy(xpath = "//input[@placeholder='Day*']")
	private static WebElement day;	
	
	@FindBy(xpath = "//input[@placeholder='Month*']")
	private static WebElement month;	
	
	@FindBy(xpath = "//input[@placeholder='Year*']")
	private static WebElement year;
	
	@FindBy(xpath = "(//input[@type='radio'])[2]")
	private static WebElement radiobutton;
	
	@FindBy(xpath = "//span[text()='Female']")
	private static WebElement female;
	
	@FindBy(xpath = "(//input[@type='radio'])[3]")
	private static WebElement radiobuttonchildren;
	
	@FindBy(xpath = "//span[text()='Yes']")
	private static WebElement Yes;
	
	@FindBy(xpath = "//input[@placeholder='Zip Code']")
	private static WebElement zipcode;
	
	@FindBy(xpath = "//button[text()=' SUBMIT ']")
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
		public void clickonOfferBreadcrumbs() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(offerBreadcrumbs);
			if (isElementPresent(offerBreadcrumbs)) {
				clickElementUsingJavaScript(offerBreadcrumbs);
				visibilityOf(offer_txt_Breadcrumbs);
				boolean elementIsDisplayed=elementIsDisplayed(offer_txt_Breadcrumbs);
				Assert.assertTrue(elementIsDisplayed(offer_txt_Breadcrumbs));
				System.out.println(getElementText(offer_txt_Breadcrumbs));
				pageLoad();
			} else {
				throw new Exception("offerBreadcrumbs are not Present on Page");
			}
			
		}	
		public void clickonCouponsForm() throws Exception{
	    	waitForPageLoadJava();
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
	        // Enter the email ID value
	        String emailID = "yogita.patil0515@gmail.com";
	        emailname.sendKeys(emailID);

	        // Retrieve the value from the email ID field
	        String emailValue = emailname.getAttribute("value");

	        // Verify the email ID value using regular expression
	        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
	        if (emailValue.matches(emailRegex)) {
	            System.out.println("Email ID verification passed!");
	        } else {
	            System.out.println("Email ID verification failed!");
	        }
//day,month,year//
	        
	     // Enter the respective values into the fields
	        String dayValue = "15";
	        String monthValue = "05";
	        String yearValue = "1987";
	        day.sendKeys(dayValue);
	        month.sendKeys(monthValue);
	        year.sendKeys(yearValue);

	        // Retrieve the values from the fields
	        String retrievedDayValue = day.getAttribute("value");
	        String retrievedMonthValue = month.getAttribute("value");
	        String retrievedYearValue = year.getAttribute("value");

	        // Verify the day, month, and year values
	        if (retrievedDayValue.equals(dayValue) &&
	                retrievedMonthValue.equals(monthValue) &&
	                retrievedYearValue.equals(yearValue)) {
	            System.out.println("Date verification passed!");
	        } else {
	            System.out.println("Date verification failed!");
	        }
	        
	        
	        
	        
	        
			
		//gender//
		female.click();
		if (radiobutton.isSelected()) {
			System.out.println("Gender verification passed!");
			
		} else {
			System.out.println("Gender verification failed!");
		}
		//childrenopionion//
		Yes.click();
		if (radiobuttonchildren.isSelected()) {
			System.out.println("Childern are under age 18");
			
		} else {
			System.out.println("Childern are  not under age 18");
		}
		//zipcode//
		zipcode.sendKeys("422101");
		String zipcodevalue=zipcode.getAttribute("value");
		
		//verify zipcode value by Regular Expression//
		
		String zipcodeRegex="\\d{6}";
		if (zipcodevalue.matches(zipcodeRegex)) {
			System.out.println("Zip code  Verification Passed");
			
		} else {
			System.out.println("Zip code  Verification Failed");
		}
		submit.click();
		
		
		
		
		
		
		
		
		}	
	
	
	
	
	
	
	
	
	
	
	

}
