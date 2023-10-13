package com.qa.biotene.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class biotenedrymouthrelieftipsPage extends BaseClass{
	
	public biotenedrymouthrelieftipsPage() {
		PageFactory.initElements(driver, this);
	}		
	
	@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']//self::button[text()='Accept Cookies']")
	private static WebElement cookieBtn;
	
	@FindBy(xpath = "//div[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "//div[@class='box component section close-button first odd alpha']//child::div[@class='component-content']")
	private static WebElement emailpopup_Close;

	@FindBy(xpath = "//div[@class='box component section close-button first odd alpha']//ancestor::div[@class='component-content']//self::div[@style]")
	private static WebElement email_text;
	
	@FindBy(xpath = "//a[text()='Home']")
	private static WebElement Home_Breadcrumbs;		
		
	@FindBy(xpath = "//a[text()='LIVING WITH DRY MOUTH']")
	private static WebElement livingdrymouth_Breadcrumbs;			
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even last is-current ']")
	private static WebElement tipsdrymouth_breadcrumbs;	
	
	@FindBy(xpath = "//a[text()='DO BETTER THIS YEAR WITH BIOTÈNE®']")
	private static WebElement dobetterthisyear;	
	
	@FindBy(xpath = "//div[@class='richText component section richtext-speakbetter first odd grid_6 alpha']//a[@href='/living-with-dry-mouth/dry-mouth-tips/all-day-symptom-relief/']")
	private static WebElement dailyroutine;	
	
	@FindBy(xpath = "//div[@class='box component section wdm-banner-box wdm-banner-box--background-flipped first odd']")
	private static WebElement dailyroutine_txt;	
	
	@FindBy(xpath = "//div[@class='richText component section richtext-brushbetter first odd grid_6 alpha']//a[text()='non-irritating fluoride toothpaste like Biotène']")
	private static WebElement nonirratingfluroide;	
	
	@FindBy(xpath = "//h1[text()='Biotène Fluoride Toothpaste Fresh Mint Original']")
	private static WebElement nonirratingfluroide_txt;	
	
	@FindBy(xpath = "//div[@class='richText component section footer-pod footer-one first odd grid_4 alpha']//child::a[@href='/living-with-dry-mouth/feeling-dry-mouth-at-night/']")
	private static WebElement Readmore1;	
	
	@FindBy(xpath = "//h1[text()='Relieve Symptoms from Dry Mouth at Night']")
	private static WebElement Readmore1_txt;
	
	@FindBy(xpath = "//div[@class='richText component section footer-pod footer-two even grid_4']//child::a[@href='/what-is-dry-mouth/dry-mouth-symptoms/']")
	private static WebElement Readmore2;
	
	@FindBy(xpath = "//h1[text()='Dry Mouth Symptoms & Remedies']")
	private static WebElement Readmore_txt2;
	
	@FindBy(xpath = "//div[@class='richText component section three footer-pod footer-three odd last grid_4 omega']//child::a[@href='/living-with-dry-mouth/how-to-freshen-bad-breath/']")
	private static WebElement Readmore3;
	
	@FindBy(xpath = "//h1[text()='FRESHEN BAD BREATH CAUSED BY DRY MOUTH']")
	private static WebElement Readmore_txt3;
	
	
	
	
	
	
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
			public void clickonEmailBtn() throws Exception {	
			waitForPageLoadJava();
			if(isElementPresent(email_text)) {
				elementToBeClickable(email_text);
				try {
					if(email_text.isDisplayed()) {
						clickElementUsingJavaScript(email_text);
					}
					implicitWait();
					visibilityOf(emailpopup_Close);
					Assert.assertTrue(elementIsDisplayed(emailpopup_Close));
				}
				catch (Exception e) {
					
				}
			}else {
				System.out.println("Email Pop-Up is not presented");
				throw new Exception("Unable to click on Email Pop-up");
			}
			}
			
			public void clickonHomeBreadcrumbs() throws Exception {	
				waitForPageLoadJava();
				clickElementUsingJavaScript(Home_Breadcrumbs);
				pageLoad();
			}
			public void clickonlivingdrymouthBreadcrumbs() throws Exception {	
				waitForPageLoadJava();
				clickElementUsingJavaScript(livingdrymouth_Breadcrumbs);
				pageLoad();
			}
			public void clickonTipsbioteneBreadcrumbs() throws Exception {	
				waitForPageLoadJava();
				clickElementUsingJavaScript(tipsdrymouth_breadcrumbs);
				pageLoad();
			}
			public void clickonbetteryearBiotene() throws Exception {	
				waitForPageLoadJava();
				clickElementUsingJavaScript(dobetterthisyear);
				pageLoad();
			}
			public void clickondailyroutine() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(dailyroutine);
				clickElementUsingJavaScript(dailyroutine);
				pageLoad();
			}
			public void clickonnonirratingFluroide() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(nonirratingfluroide);
				clickElementUsingJavaScript(nonirratingfluroide);
				visibilityOf(nonirratingfluroide_txt);
				boolean elementIsDisplayed=elementIsDisplayed(nonirratingfluroide_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(nonirratingfluroide_txt));
				pageLoad();
			}
			public void clickonReadmore1() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(Readmore1);
				clickElementUsingJavaScript(Readmore1);
				visibilityOf(Readmore1_txt);
				boolean elementIsDisplayed=elementIsDisplayed(Readmore1_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(Readmore1_txt));
				pageLoad();
			}
			public void clickonReadmore2() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(Readmore2);
				clickElementUsingJavaScript(Readmore2);
				visibilityOf(Readmore_txt2);
				boolean elementIsDisplayed=elementIsDisplayed(Readmore_txt2);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(Readmore_txt2));
				pageLoad();
			}
			public void clickonReadmore3() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(Readmore3);
				clickElementUsingJavaScript(Readmore3);
				visibilityOf(Readmore_txt3);
				boolean elementIsDisplayed=elementIsDisplayed(Readmore_txt3);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(Readmore_txt3));
				pageLoad();
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
