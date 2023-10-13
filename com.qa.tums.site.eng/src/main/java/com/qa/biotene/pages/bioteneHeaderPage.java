package com.qa.biotene.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class bioteneHeaderPage extends BaseClass{
	
	public bioteneHeaderPage() {
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

	
		//Header//
		
		@FindBy(xpath = "//div[@class='box component section header-top-box first odd']//child::a[text()='FIND THE RIGHT PRODUCT FOR YOU']")
		private static WebElement FindRightProduct;
	
		@FindBy(xpath = "//div[@class='box component section header-top-box first odd']//child::a[text()='SAVE NOW']")
		private static WebElement saveNow;
	
		@FindBy(xpath = "//div[@class='box component section header-top-box first odd']//child::a[text()='SHOP NOW']")
		private static WebElement shopeNow;
	
		@FindBy(xpath = "//div[@class='searchBox component section default-style even grid_3']//input[@type='text']")
		private static WebElement Search;
		
		@FindBy(xpath = "//div[@class='searchBox component section default-style even grid_3']//child::button[@type='submit']")
		private static WebElement Submit;
	
		@FindBy(xpath = "//div[@class='richText component section wdm-banner-img faq-banner-text first odd last grid_12 alpha omega']//div[@class='richText-content']")
		private static WebElement SearchResult;
	
		@FindBy(xpath = "//div[@class='image component section biotene-logo first odd grid_2 alpha']//img")
		private static WebElement BioteneLogo;
	
		@FindBy(xpath = "//ul[@class='navigation-root navigation-branch navigation-level1']//child::li[@class='odd first navigation-item navigation-level1 page-what-is-dry-mouth']//a")
		private static WebElement whatisdrymouth;
	
		@FindBy(xpath = "//ul[@class='navigation-root navigation-branch navigation-level1']//child::li[@class='even navigation-item navigation-level1 page-dry-mouth-health-impacts']//a")
		private static WebElement impactonoralHealth;
		
		@FindBy(xpath = "(//ul[@class='navigation-root navigation-branch navigation-level1']//li[@class='odd navigation-item navigation-level1 page-dry-mouth-products prod-menu']//a)[1]")
		private static WebElement BioteneProducts;
		
		@FindBy(xpath = "//ul[@class='navigation-root navigation-branch navigation-level1']//li[@class='even navigation-item navigation-level1 page-living-with-dry-mouth']//a")
		private static WebElement livingwithdrymouth;
		
		@FindBy(xpath = "(//ul[@class='navigation-root navigation-branch navigation-level1']//li[@class='odd last navigation-item navigation-level1 page-do-i-have-dry-mouth']//a)[1]")
		private static WebElement SelfAssesment;
		
		
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
	
		//Header//
		
			public void ClickonFindtheRightProduct() throws Exception {
				waitForPageLoadJava();
				clickElementUsingJavaScript(FindRightProduct);
				pageLoad();
			}
			public void ClickonSaveNow() throws Exception {
				waitForPageLoadJava();
				clickElementUsingJavaScript(saveNow);
				pageLoad();
			}
			public void ClickonShopNow() throws Exception {
				waitForPageLoadJava();
				clickElementUsingJavaScript(shopeNow);
				pageLoad();
			}
			public void ClickonSearchIcon() throws Exception {
				waitForPageLoadJava();
				clickElementUsingJavaScript(Search);
				Search.sendKeys("what-is-dry-mouth/");
				clickElementUsingJavaScript(Submit);
				visibilityOf(SearchResult);
				boolean elementIsDisplayed=elementIsDisplayed(SearchResult);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(SearchResult));
				pageLoad();
			}
			public void ClickonBioteneLogo() throws Exception {
				waitForPageLoadJava();
				clickElementUsingJavaScript(BioteneLogo);
				pageLoad();
			}
			public void ClickonWhatisdrymouth() throws Exception {
				waitForPageLoadJava();
				clickElementUsingJavaScript(whatisdrymouth);
				pageLoad();
			}
			public void ClickonBioteneProducts() throws Exception {
				waitForPageLoadJava();
				clickElementUsingJavaScript(BioteneProducts);
				pageLoad();
			}
			public void ClickonLivingwithdrymouth() throws Exception {
				waitForPageLoadJava();
				clickElementUsingJavaScript(livingwithdrymouth);
				pageLoad();
			}
			public void ClickonSelfAssesment() throws Exception {
				waitForPageLoadJava();
				clickElementUsingJavaScript(SelfAssesment);
				pageLoad();
			}
	
	
	
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

}
