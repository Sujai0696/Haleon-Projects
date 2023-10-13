package com.qa.eno.co.in.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.qa.baseClass.BaseClass;

public class enocoinInitialSymptomsAcidityPage extends BaseClass{
	
	public enocoinInitialSymptomsAcidityPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/acidity/living-life-acidity-free']")
		private static WebElement aciditylifefree;
		
		@FindBy(xpath = "//strong[text()='Living Life Acidity Free']")
		private static WebElement aciditylifefreetxt;
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/discover-eno/what-is-eno']")
		private static WebElement whatiseno;
		
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/acidity/understanding-acidity']")
		private static WebElement understandingAcidity;
	
		@FindBy(xpath = "//strong[text()='Understanding Acidity']")
		private static WebElement understandingAciditytxt;
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/types-of-acidity/is-it-acidity-or-indigestion']")
		private static WebElement acidityorindigestion;
	
		@FindBy(xpath = "//strong[text()='Is It Acidity or Indigestion?']")
		private static WebElement acidityorindigestiontxt;
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/types-of-acidity/acidity-reflux-or-gerd']")
		private static WebElement AcidityorReflux;
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/types-of-acidity/is-it-acidity-or-indigestion']")
		private static WebElement AcidityorIndigestion;
	
		@FindBy(xpath = "//strong[text()='Is It Acidity or Indigestion?']")
		private static WebElement AcidityorIndigestiontxt;
	
		@FindBy(xpath = "//div[@class='richText component section text-align-center even last col-xs-12']//child::a[@href='/all-about-acidity/acidity/living-life-acidity-free/']")
		private static WebElement livinglifeacidity_here;
	
		@FindBy(xpath = "//strong[text()='Living Life Acidity Free']")
		private static WebElement livinglifeacidity_heretxt;
	
		@FindBy(xpath = "//div[@class='accordion component section references-accordion first odd last col-xs-12 col-md-12 col-lg-10 col-lg-offset-1 initialized']//child::header[@class='accordion-head']")
		private static WebElement References;
	
		@FindBy(xpath = "//div[@class='accordion component section references-accordion first odd last col-xs-12 col-md-12 col-lg-10 col-lg-offset-1 initialized']//child::li[@class='accordion-slide first last odd is-active']")
		private static WebElement ReferencesOpen;
	
		@FindBy(xpath = "//div[@class='image component section zglazyload col-xs-12 related-article-1 fixed-component']//child::a[text()='Home Remedies for Acidity']")
		private static WebElement HomeRemedies;
	
		@FindBy(xpath = "//div[@class='image component section fixed-header-img--cut switchable-image fixed-header-img fixed-component']//img[@title='Home remedies for acidity']")
		private static WebElement HomeRemediestxt;
		
		@FindBy(xpath = "//div[@class='image component section zglazyload col-xs-12 related-article-2 fixed-component']//child::strong[text()='How to control acidity with a busy lifestyle']")
		private static WebElement ControlAcidity;
		
		@FindBy(xpath = "//h1[text()='How To Control Acidity With A Busy Lifestyle']")
		private static WebElement ControlAciditytxt;
		
		
		//next slider//
		
		@FindBy(xpath = "//div[@class='carousel component section quote-carousel first odd last initialized']")
		 private static WebElement mouseHoverImg;
		
		 @FindBy(xpath = "//div[@class='carousel component section quote-carousel first odd last initialized']//a[@role='button'][normalize-space()='«']")
		 private static WebElement previousArrow;
		 
		 @FindBy(xpath = "//div[@class='carousel component section quote-carousel first odd last initialized']//a[@role='button'][normalize-space()='»']")
		 private static WebElement nextArrow;
		 
		 @FindBy(xpath = "//div[@class='carousel component section quote-carousel first odd last initialized']//li[@class='carousel-slide clearfix odd first is-active']")
		 private static WebElement peopleActive;
		 
		 @FindBy(xpath = "//div[@class='carousel component section quote-carousel first odd last initialized']//li[@class='carousel-slide clearfix even last is-active']")
		private static WebElement heartburnActive;
		
		
		
		
		
	
		//Methods//
		
				public void clickonAcidityLifeFree() throws Exception {
				waitForPageLoadJava();
				clickElementUsingJavaScript(aciditylifefree);
				visibilityOf(aciditylifefreetxt);
				boolean elementIsDisplayed=elementIsDisplayed(aciditylifefreetxt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(aciditylifefreetxt));
				pageLoad();
				}
				
				public void clickonWhatisEno() throws Exception {
					waitForPageLoadJava();
					clickElementUsingJavaScript(aciditylifefree);
					Thread.sleep(1000);
					clickElementUsingJavaScript(whatiseno);
					pageLoad();
					}
				public void clickonUnderstandingAcidity() throws Exception {
					waitForPageLoadJava();
					clickElementUsingJavaScript(understandingAcidity);
					visibilityOf(understandingAciditytxt);
					boolean elementIsDisplayed=elementIsDisplayed(understandingAciditytxt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(understandingAciditytxt));
					pageLoad();
					}
				public void clickonAcidityorIndigestion() throws Exception {
					waitForPageLoadJava();
					clickElementUsingJavaScript(understandingAcidity);
					Thread.sleep(1000);
					clickElementUsingJavaScript(acidityorindigestion);
					visibilityOf(acidityorindigestiontxt);
					boolean elementIsDisplayed=elementIsDisplayed(acidityorindigestiontxt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(acidityorindigestiontxt));
					pageLoad();
					}
				
				public void clickonAcidityRefluxorgerd() throws Exception {
					waitForPageLoadJava();
					clickElementUsingJavaScript(understandingAcidity);
					Thread.sleep(1000);
					clickElementUsingJavaScript(acidityorindigestion);
					Thread.sleep(1000);
					clickElementUsingJavaScript(AcidityorReflux);
					pageLoad();
					}
				
				public void clickonAcidityorIndigestion1() throws Exception {
					waitForPageLoadJava();
					clickElementUsingJavaScript(understandingAcidity);
					Thread.sleep(1000);
					clickElementUsingJavaScript(acidityorindigestion);
					Thread.sleep(1000);
					clickElementUsingJavaScript(AcidityorReflux);
					Thread.sleep(1000);
					clickElementUsingJavaScript(AcidityorIndigestion);
					visibilityOf(AcidityorIndigestiontxt);
					boolean elementIsDisplayed=elementIsDisplayed(AcidityorIndigestiontxt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(AcidityorIndigestiontxt));
					pageLoad();
					}
				public void clickonLivinglifeAcidity_here() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(livinglifeacidity_here);
					clickElementUsingJavaScript(livinglifeacidity_here);
					visibilityOf(livinglifeacidity_heretxt);
					boolean elementIsDisplayed=elementIsDisplayed(livinglifeacidity_heretxt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(livinglifeacidity_heretxt));
					pageLoad();
				}
				
				public void clickonReferences() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(References);
					clickElementUsingJavaScript(References);
					visibilityOf(ReferencesOpen);
					boolean elementIsDisplayed=elementIsDisplayed(ReferencesOpen);
					Assert.assertTrue(elementIsDisplayed);
					Thread.sleep(1000);
					clickElementUsingJavaScript(References);
					pageLoad();
				}
				public void clickonHomeRemedies() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(HomeRemedies);
					clickElementUsingJavaScript(HomeRemedies);
					visibilityOf(HomeRemediestxt);
					boolean elementIsDisplayed=elementIsDisplayed(HomeRemediestxt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(HomeRemediestxt));
					pageLoad();
				}
				public void clickonControlAcidityBusyLifestyle() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(ControlAcidity);
					clickElementUsingJavaScript(ControlAcidity);
					visibilityOf(ControlAciditytxt);
					boolean elementIsDisplayed=elementIsDisplayed(ControlAciditytxt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(ControlAciditytxt));
					pageLoad();
				}
				//next slider//
				public void clickonDidYouKnowSection()throws Exception {
					 waitForPageLoadJava();
					 scrollDownUsingElement(mouseHoverImg);
					 clickElementUsingJavaScript(previousArrow);
					 refreshWebPage();
					 scrollDownUsingElement(mouseHoverImg);
					 clickElementUsingJavaScript(previousArrow);
					 moveToElement(mouseHoverImg);
					 doubleClickElement(mouseHoverImg);
					 System.out.println("double clicked successfully on the previous carousel Image Element");
					 visibilityOf(heartburnActive);
					 Assert.assertTrue(elementIsDisplayed(heartburnActive));
					 clickElementUsingJavaScript(nextArrow);
					 moveToElement(mouseHoverImg);
					 doubleClickElement(mouseHoverImg);
					 visibilityOf(peopleActive);
					 Assert.assertTrue(elementIsDisplayed(peopleActive));
					 System.out.println("double clicked successfully on the next carousel Image Element");
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	

}
