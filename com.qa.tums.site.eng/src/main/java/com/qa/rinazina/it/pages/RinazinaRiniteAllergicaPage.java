package com.qa.rinazina.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class RinazinaRiniteAllergicaPage extends BaseClass{
	
	public RinazinaRiniteAllergicaPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Accetta tutti i cookie']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
		private static WebElement cookieClose;
		
		@FindBy(xpath = "//li[@class=\"breadcrumb-list-item odd first \"]//ancestor::a[text()='Home']")
		private static WebElement HomeBreadcrumbs;
	
		@FindBy(xpath = "//li[@class=\"breadcrumb-list-item even \"]//child::a[text()='Condizioni']")
		private static WebElement CondizioniBreadcrumbs;	
	
		@FindBy(xpath = "//li[@class=\"breadcrumb-list-item odd last is-current \"]//child::a[text()='Rinite allergica']")
		private static WebElement RiniteAllergicaBreadcrumbs;	
	
		@FindBy(xpath = "//a[text()='Per saperne di più']")
		private static WebElement persaperenedipiu;
	
		@FindBy(xpath = "//span[text()='Articoli correlati']")
		private static WebElement Heading;
	
		@FindBy(xpath = "//div[@class=\"parametrizedhtml component section default-style first odd last col-xs-12 col-md-12 reference-article-teaser\"]//child::a[text()='Cos’è il raffreddore: gli aspetti scientifici alla base del raffreddore. ']")
		private static WebElement RelatedArticle1;
	
		@FindBy(xpath = "//div[@class=\"parametrizedhtml component section default-style first odd last col-xs-12 col-md-12 reference-article-teaser\"]//child::a[text()='Rinite allergica, cos’è: gli aspetti scientifici alla base della rinite allergica e di allergie simili. ']")
		private static WebElement RelatedArticle2;
	
		@FindBy(xpath = "//div[@class=\"parametrizedhtml component section default-style first odd last col-xs-12 col-md-12 reference-article-teaser\"]//child::a[text()='Cos’è la sinusite: cause e aspetti scientifici alla base della sinusite. ']")
		private static WebElement RelatedArticle3;
	
		@FindBy(xpath = "//div[@class=\"parametrizedhtml component section default-style first odd last col-xs-12 col-md-12 reference-article-teaser\"]//child::a[text()='Russamento notturno: da cosa è provocato e quali possono essere i rimedi. ']")
		private static WebElement RelatedArticle4;
	
	
	
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
					clickElementUsingJavaScript(CondizioniBreadcrumbs);
					pageLoad();
				}
				public void clickonRinitaAllergicaBreadcrumbs() throws Exception {
					waitForPageLoadJava();
					visibilityOf(RiniteAllergicaBreadcrumbs);
					if (isElementPresent(RiniteAllergicaBreadcrumbs)) {
						Assert.assertTrue(isElementPresent(RiniteAllergicaBreadcrumbs));
					} else {
						throw new Exception("RiniteAllergicaBreadcrumbs is not display");
					}
				}
				public void clickonpersaperenedipiu() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(persaperenedipiu);
					clickElementUsingJavaScript(persaperenedipiu);
					pageLoad();
				}
				public void clickonRelatedArticle1() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Heading);
					clickElementUsingJavaScript(RelatedArticle1);
					pageLoad();
				}
	
				public void clickonRelatedArticle2() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Heading);
					clickElementUsingJavaScript(RelatedArticle2);
					pageLoad();
				}
				public void clickonRelatedArticle3() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Heading);
					clickElementUsingJavaScript(RelatedArticle3);
					pageLoad();
				}
				public void clickonRelatedArticle4() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(Heading);
					clickElementUsingJavaScript(RelatedArticle4);
					pageLoad();
				}
	
	
	
	
	
	
	
	
	
	
	

}
