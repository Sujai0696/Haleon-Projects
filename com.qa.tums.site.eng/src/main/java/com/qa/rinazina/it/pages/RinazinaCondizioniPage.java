package com.qa.rinazina.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;
public class RinazinaCondizioniPage extends BaseClass{
	
	public RinazinaCondizioniPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Accetta tutti i cookie']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
		private static WebElement cookieClose;
		
		@FindBy(xpath = "//li[@class=\"breadcrumb-list-item odd first \"]//ancestor::a[text()='Home']")
		private static WebElement HomeBreadcrumbs;
	
		@FindBy(xpath = "//li[@class=\"breadcrumb-list-item even last is-current \"]//ancestor::a[text()='Condizioni']")
		private static WebElement CondizioniBreadcrumbs;
	
		@FindBy(xpath = "//div[@class=\"richText component section margin-top-remove mb-fourth padding-medium-right-dt padding-xlarge-half-bottom even last col-xs-12\"]//ancestor::a[text()='Per saperne di più']")
		private static WebElement persaperenedipiu;
	
		@FindBy(xpath = "//div[@class=\"richText component section margin-top-remove-dt mb-third padding-22-left-dt padding-medium-right-dt odd last col-xs-12 col-sm-12 col-md-6 col-lg-6\"]//ancestor::a[text()='Per saperne di più']")
		private static WebElement persaperenedipiu1;
	
		@FindBy(xpath = "//div[@class=\"richText component section margin-top-remove-dt mb-third padding-medium-right-dt even last col-xs-12\"]//child::a[text()='Per saperne di più']")
		private static WebElement persaperenedipiu2;
	
		@FindBy(xpath = "//span[text()='Articoli correlati']")
		private static WebElement Heading;
	
		@FindBy(xpath = "//a[text()='Cos’è il raffreddore: gli aspetti scientifici alla base del raffreddore. ']")
		private static WebElement Articlepage1;
	
		@FindBy(xpath = "//a[text()='Qual è la correlazione tra allergie alimentari e rinite allergica? ']")
		private static WebElement Articlepage2;
	
		@FindBy(xpath = "//a[text()='Cos’è la sinusite: cause e aspetti scientifici alla base della sinusite. ']")
		private static WebElement Articlepage3;
	
		@FindBy(xpath = "//a[text()='Russamento notturno: da cosa è provocato e quali possono essere i rimedi. ']")
		private static WebElement Articlepage4;
	
	
	
	
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
			
		public void clickonHomeBreadcrumbs() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(HomeBreadcrumbs);
			pageLoad();
		}
		public void clickonCondizioniBreadcrumbs() throws Exception {
			waitForPageLoadJava();
			visibilityOf(CondizioniBreadcrumbs);
			if (isElementPresent(CondizioniBreadcrumbs)) {
				Assert.assertTrue(elementIsDisplayed(CondizioniBreadcrumbs));	
				} else {
					throw new Exception("Element CondizioniBreadcrumbs is not presented on page");
				}
				
		}
		public void clickonpersaperenedipiu() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(persaperenedipiu);
			clickElementUsingJavaScript(persaperenedipiu);
			pageLoad();
		}
		public void clickonpersaperenedipiu1() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(persaperenedipiu1);
			clickElementUsingJavaScript(persaperenedipiu1);
			pageLoad();
		}
		public void clickonpersaperenedipiu2() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(persaperenedipiu2);
			clickElementUsingJavaScript(persaperenedipiu2);
			pageLoad();
		}
		public void clickonArticlepage1() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Heading);
			clickElementUsingJavaScript(Articlepage1);
			pageLoad();
		}
		public void clickonArticlepage2() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Heading);
			clickElementUsingJavaScript(Articlepage2);
			pageLoad();
		}
		public void clickonArticlepage3() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Heading);
			clickElementUsingJavaScript(Articlepage3);
			pageLoad();
		}
		public void clickonArticlepage4() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Heading);
			clickElementUsingJavaScript(Articlepage4);
			pageLoad();
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		}

