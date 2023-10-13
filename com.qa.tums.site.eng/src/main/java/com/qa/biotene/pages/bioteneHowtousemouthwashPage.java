package com.qa.biotene.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class bioteneHowtousemouthwashPage extends BaseClass{
	
	public bioteneHowtousemouthwashPage() {
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
	private static WebElement livingwithdrymouth_Breadcrumbs;				
			
	@FindBy(xpath = "//a[text()='How to Use Mouthwash']")
	private static WebElement howtousemouthwash_Breadcrumbs;
	
	@FindBy(xpath = "//a[text()='living with dry mouth']")
	private static WebElement livingwithdrymouth;
	
	@FindBy(xpath = "//strong[text()=' Living Well with Dry Mouth Management ']")
	private static WebElement livingwithdrymouth_txt;
	
	@FindBy(xpath = "//a[text()='Biotène Dry Mouth Oral Rinse']")
	private static WebElement biotenedrymouthoralrinse;
	
	@FindBy(xpath = "//div[@class='richText component section mouthwash-banner-text product-title-text first odd omega']")
	private static WebElement biotenedrymouthoralrinse_txt;
	
	@FindBy(xpath = "//a[text()='mouthwashes and other products']")
	private static WebElement mouthwashesotherproducts;
	
	@FindBy(xpath = "//h1[text()='Biotène Dry Mouth Products']")
	private static WebElement mouthwashesotherproducts_txt;
	
	
	
	
	
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
	public void clickonLivingwithdrymouthBreadcrumbs() throws Exception {	
		waitForPageLoadJava();
		clickElementUsingJavaScript(livingwithdrymouth_Breadcrumbs);
		pageLoad();
	}
	public void clickonHowtousemouthwashBreadcrumbs() throws Exception {	
		waitForPageLoadJava();
		clickElementUsingJavaScript(howtousemouthwash_Breadcrumbs);
		pageLoad();
	}	
	public void clickonLivingwithdrymouth() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(livingwithdrymouth);
		clickElementUsingJavaScript(livingwithdrymouth);
		visibilityOf(livingwithdrymouth_txt);
		boolean elementIsDisplayed=elementIsDisplayed(livingwithdrymouth_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(livingwithdrymouth_txt));
		pageLoad();
	}	
	public void clickonBiotenedrymouthOralrinse() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(biotenedrymouthoralrinse);
		clickElementUsingJavaScript(biotenedrymouthoralrinse);
		visibilityOf(biotenedrymouthoralrinse_txt);
		boolean elementIsDisplayed=elementIsDisplayed(biotenedrymouthoralrinse_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(biotenedrymouthoralrinse_txt));
		pageLoad();
	}	
	public void clickonMouthwashesotherProducts() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(mouthwashesotherproducts);
		clickElementUsingJavaScript(mouthwashesotherproducts);
		visibilityOf(mouthwashesotherproducts_txt);
		boolean elementIsDisplayed=elementIsDisplayed(mouthwashesotherproducts_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(mouthwashesotherproducts_txt));
		pageLoad();
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
