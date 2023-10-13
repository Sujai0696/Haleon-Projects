package com.qa.eno.co.in.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class enocoinInitialSymptomsAcidRefluxPage extends BaseClass{
	
	public enocoinInitialSymptomsAcidRefluxPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/home-remedies-for-acid-reflux']")
		private static WebElement homeremediesAcidReflux;		
		
		@FindBy(xpath = "//h1[text()='Home Remedies']")
		private static WebElement homeremediesAcidRefluxtxt;	
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/heartburn/understanding-heartburn']")
		private static WebElement understandingHeartburn;
	
		@FindBy(xpath = "//h1[text()='Understanding Heartburn']")
		private static WebElement understandingHeartburntxt;
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/heartburn/home-remedies-for-heartburn']")
		private static WebElement HomeRemediesHeartburn;
	
		@FindBy(xpath = "//h1[text()='Home Remedies']")
		private static WebElement HomeRemediesHeartburntxt;
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/heartburn/initial-symptoms-of-heartburn']")
		private static WebElement InitialSymptomsHeartburn;
	
		@FindBy(xpath = "//h1[text()='Initial Symptoms']")
		private static WebElement InitialSymptomsHeartburntxt;
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/types-of-acidity/acidity-reflux-or-gerd']")
		private static WebElement Acidityrefluxorgerd;
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/types-of-acidity/is-it-acidity-or-indigestion']")
		private static WebElement AcidityorIndigestion;
	
		@FindBy(xpath = "//strong[text()='Is It Acidity or Indigestion?']")
		private static WebElement AcidityorIndigestiontxt;
	
		@FindBy(xpath = "//div[@class='accordion component section references-accordion first odd last col-xs-12 col-md-12 col-lg-10 col-lg-offset-1 initialized']//child::header[@class='accordion-head']")
		private static WebElement References;
	
		@FindBy(xpath = "//li[@class='accordion-slide first last odd is-active']")
		private static WebElement ReferencesOpen;
	
		@FindBy(xpath = "(//div[@class='image component section zglazyload col-xs-12 related-article-1 fixed-component']//child::a[@href='/all-about-acidity/acid-reflux-babies-children/'])[2]")
		private static WebElement AcidRefluxChildren;
		
		@FindBy(xpath = "//h1[text()='Acid Re flux In']")
		private static WebElement AcidRefluxChildrentxt;
		
		@FindBy(xpath = "(//div[@class='image component section zglazyload col-xs-12 related-article-2 fixed-component']//child::a[@href='/all-about-acidity/constant-acidity/'])[2]")
		private static WebElement ConstantAcidity;
		
		@FindBy(xpath = "//h1[text()='Constant Acidity']")
		private static WebElement ConstantAciditytxt;
		
		//Slider Section//
		
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
		
		public void clickonHomeRemediesAcidRelux() throws Exception {
		waitForPageLoadJava();
		clickElementUsingJavaScript(homeremediesAcidReflux);
		visibilityOf(homeremediesAcidRefluxtxt);
		boolean elementIsDisplayed=elementIsDisplayed(homeremediesAcidRefluxtxt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(homeremediesAcidRefluxtxt));
		pageLoad();
		}
		public void clickonUnderstandingHeartburn() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(homeremediesAcidReflux);
			Thread.sleep(1000);
			clickElementUsingJavaScript(understandingHeartburn);
			visibilityOf(understandingHeartburntxt);
			boolean elementIsDisplayed=elementIsDisplayed(understandingHeartburntxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(understandingHeartburntxt));
			pageLoad();
			}
		public void clickonHomeRemediesHeartBurn() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(homeremediesAcidReflux);
			Thread.sleep(1000);
			clickElementUsingJavaScript(understandingHeartburn);
			Thread.sleep(1000);
			clickElementUsingJavaScript(HomeRemediesHeartburn);
			visibilityOf(HomeRemediesHeartburntxt);
			boolean elementIsDisplayed=elementIsDisplayed(HomeRemediesHeartburntxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(HomeRemediesHeartburntxt));
			pageLoad();
			}
		public void clickonInitialSymptomsHeartburn() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(homeremediesAcidReflux);
			Thread.sleep(1000);
			clickElementUsingJavaScript(understandingHeartburn);
			Thread.sleep(1000);
			clickElementUsingJavaScript(HomeRemediesHeartburn);
			Thread.sleep(1000);
			clickElementUsingJavaScript(InitialSymptomsHeartburn);
			visibilityOf(InitialSymptomsHeartburntxt);
			boolean elementIsDisplayed=elementIsDisplayed(InitialSymptomsHeartburntxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(InitialSymptomsHeartburntxt));
			pageLoad();
			}
		public void clickonAcidityRefluxorgerd() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(Acidityrefluxorgerd);
			pageLoad();
		}
		public void clickonAcidityorIndigestion() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(Acidityrefluxorgerd);
			Thread.sleep(1000);
			clickElementUsingJavaScript(AcidityorIndigestion);
			visibilityOf(AcidityorIndigestiontxt);
			boolean elementIsDisplayed=elementIsDisplayed(AcidityorIndigestiontxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(AcidityorIndigestiontxt));
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
		public void clickonAcidRefluxChildren() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(AcidRefluxChildren);
			clickElementUsingJavaScript(AcidRefluxChildren);
			visibilityOf(AcidRefluxChildrentxt);
			boolean elementIsDisplayed=elementIsDisplayed(AcidRefluxChildrentxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(AcidRefluxChildrentxt));
			pageLoad();
		}
		public void clickonConstantAcidity() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(ConstantAcidity);
			clickElementUsingJavaScript(ConstantAcidity);
			visibilityOf(ConstantAciditytxt);
			boolean elementIsDisplayed=elementIsDisplayed(ConstantAciditytxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(ConstantAciditytxt));
			pageLoad();
		}
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
