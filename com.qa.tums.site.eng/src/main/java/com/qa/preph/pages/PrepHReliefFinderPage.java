package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class PrepHReliefFinderPage extends BaseClass{
	
	public PrepHReliefFinderPage() {
		PageFactory.initElements(driver, this);
	}	
	
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;
	
	@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[@id='onetrust-banner-sdk']")
	private static WebElement cookieClose;	
	
	@FindBy(xpath = "//a[text()=' TAKE THE QUIZ ']")
	private static WebElement takequiz;	
	
	@FindBy(xpath = "//p[text()='Pain/Soreness']")
	private static WebElement painsoreness;	
	
	@FindBy(xpath = "//label[@class='checked']")
	private static WebElement painsoreness_Active;	
	
	@FindBy(xpath = "//a[@id='step-1']")
	private static WebElement next1;	
	
	@FindBy(xpath = "(//div[@class='rf-symptom-area']//child::label[@class='checked']//img)[2]")
	private static WebElement InternalActive;	
	
	@FindBy(xpath = "//p[text()='Internal']")
	private static WebElement Internal;	
	
	@FindBy(xpath = "//a[@id='step-2']")
	private static WebElement next2;	
	
	@FindBy(xpath = "//p[text()='Slightly Uncomfortable']")
	private static WebElement slightlyuncomfortable;	
	
	@FindBy(xpath = "(//label[@class='checked'])[3]")
	private static WebElement slightlyuncomfortable_Active;	
	
	@FindBy(xpath = "//a[@id='step-3']")
	private static WebElement next3;	
	
	@FindBy(xpath = "//h3[text()='Your Personal Relief Plan']")
	private static WebElement displayproduct;	
	
	
	
	
	
	
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
			public void clickonRelieFinderquiz() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(takequiz);
				moveToElement(takequiz);
				if (isElementPresent(takequiz)) {
					clickElementUsingJavaScript(takequiz);
					moveToElement(painsoreness);
					clickElementUsingJavaScript(painsoreness);
					visibilityOf(painsoreness_Active);
					boolean elementIsDisplayed=elementIsDisplayed(painsoreness_Active);
					Assert.assertTrue(elementIsDisplayed(painsoreness_Active));
					clickElementUsingJavaScript(next1);
					implicitWait();
					if (Internal.isEnabled() && Internal.getText().contains("Internal")) {
						clickElementUsingJavaScript(Internal);
						System.out.println("Internal radio button is  selected on quiz");
					} else {
						System.out.println("Internal radio button is not selected on quiz");
					}
					clickElementUsingJavaScript(next2);
					if (slightlyuncomfortable.isEnabled() && slightlyuncomfortable.getText().contains("Slightly Uncomfortable")) {
						clickElementUsingJavaScript(slightlyuncomfortable);
						System.out.println("slightly uncomfortable is clicable on Page");
						
					} else {
						System.out.println("slightly uncomfortable is  not clicable on Page");
					}
					implicitWait();
					clickElementUsingJavaScript(next3);
					implicitWait();
					visibilityOf(displayproduct);
					boolean elementIsDisplayed1=elementIsDisplayed(displayproduct);
					Assert.assertTrue(elementIsDisplayed(displayproduct));
					System.out.println(getElementText(displayproduct));
					
					
					
					
					
					
					
					
					
				}
					
				
			}	
			
			
			
			
			
			
			
			
			
			
			
			
			
	
	
	
	
	
	
	
	

}
