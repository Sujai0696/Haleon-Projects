package com.qa.eno.co.in.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class enocoinControlAciditybusyLifestylePage extends BaseClass{
	
	public enocoinControlAciditybusyLifestylePage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/acidity/living-life-acidity-free']")
		private static WebElement livinglifeAcidityFree;		
	
		@FindBy(xpath = "//strong[text()='Living Life Acidity Free']")
		private static WebElement livinglifeAcidityFreetxt;
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/discover-eno/what-is-eno']")
		private static WebElement whatisEno;
	
		@FindBy(xpath = "//div[@class='image component section fixed-header-img--cut switchable-image fixed-header-img fixed-component']//child::h1[text()='Discover']")
		private static WebElement whatisEnotxt;
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/dealing-with-acidity-at-night']")
		private static WebElement dealingwithAcidityNight;
	
		@FindBy(xpath = "//strong[text()='Dealing with Acidity at Night']")
		private static WebElement dealingwithAcidityNighttxt;
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/acidity/understanding-acidity']")
		private static WebElement UnderstandingAcidity;
	
		@FindBy(xpath = "//strong[text()='Understanding Acidity']")
		private static WebElement UnderstandingAciditytxt;
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/types-of-acidity/is-it-acidity-or-indigestion']")
		private static WebElement AcidityorIndigestion;
	
		@FindBy(xpath = "//strong[text()='Is It Acidity or Indigestion?']")
		private static WebElement AcidityorIndigestiontxt;
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/types-of-acidity/acidity-reflux-or-gerd']")
		private static WebElement Acidityorrefluxorgerd;
	
		@FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style first odd component col-xs-12']//child::a[@href='/all-about-acidity/constant-acidity/']")
		private static WebElement constantAcidity;
		
		@FindBy(xpath = "//h1[text()='Constant Acidity']")
		private static WebElement constantAciditytxt;
	
		@FindBy(xpath = "//div[@class='accordion component section references-accordion first odd last col-xs-12 col-md-12 col-lg-10 col-lg-offset-1 initialized']//child::header[@class='accordion-head']")
		private static WebElement References;
	
		@FindBy(xpath = "//div[@class='accordion component section references-accordion first odd last col-xs-12 col-md-12 col-lg-10 col-lg-offset-1 initialized']//child::li[@class='accordion-slide first last odd is-active']")
		private static WebElement ReferencesOpen;
	
		@FindBy(xpath = "(//div[@class='image component section zglazyload col-xs-12 related-article-1 fixed-component']//child::a[@href='/discover-eno/what-is-eno/'])[1]")
		private static WebElement WhatisEno1;
		
		@FindBy(xpath = "//h1[text()='Discover']")
		private static WebElement WhatisEnotxt1;
		
		@FindBy(xpath = "//div[@class='image component section zglazyload col-xs-12 related-article-2 fixed-component']//child::strong[text()='Why does your stomach hurt?']")
		private static WebElement whydoesStomachHurt1;
		
		@FindBy(xpath = "//strong[text()='Why Does Your Stomach Hurt?']")
		private static WebElement whydoesStomachHurttxt1;
		
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
		
		public void clickonLivingLifeAcidityFree() throws Exception {
		waitForPageLoadJava();
		clickElementUsingJavaScript(livinglifeAcidityFree);
		visibilityOf(livinglifeAcidityFreetxt);
		boolean elementIsDisplayed=elementIsDisplayed(livinglifeAcidityFreetxt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(livinglifeAcidityFreetxt));
		pageLoad();
		}
		public void clickonWhatisEno() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(livinglifeAcidityFree);
			Thread.sleep(1000);
			clickElementUsingJavaScript(whatisEno);
			visibilityOf(whatisEnotxt);
			boolean elementIsDisplayed=elementIsDisplayed(whatisEnotxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(whatisEnotxt));
			pageLoad();
			}
	
		public void clickonDealingwithAcidityNight() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(dealingwithAcidityNight);
			visibilityOf(dealingwithAcidityNighttxt);
			boolean elementIsDisplayed=elementIsDisplayed(dealingwithAcidityNighttxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(dealingwithAcidityNighttxt));
			pageLoad();
			}
		public void clickonUnderstandingAcidity() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(dealingwithAcidityNight);
			Thread.sleep(1000);
			clickElementUsingJavaScript(UnderstandingAcidity);
			visibilityOf(UnderstandingAciditytxt);
			boolean elementIsDisplayed=elementIsDisplayed(UnderstandingAciditytxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(UnderstandingAciditytxt));
			pageLoad();
			}
		public void clickonAcidityorIndigestion() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(dealingwithAcidityNight);
			Thread.sleep(1000);
			clickElementUsingJavaScript(UnderstandingAcidity);
			Thread.sleep(1000);
			clickElementUsingJavaScript(AcidityorIndigestion);
			visibilityOf(AcidityorIndigestiontxt);
			boolean elementIsDisplayed=elementIsDisplayed(AcidityorIndigestiontxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(AcidityorIndigestiontxt));
			pageLoad();
			}
		public void clickonAcidityorRefluxorgerd() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(dealingwithAcidityNight);
			Thread.sleep(1000);
			clickElementUsingJavaScript(UnderstandingAcidity);
			Thread.sleep(1000);
			clickElementUsingJavaScript(AcidityorIndigestion);
			Thread.sleep(1000);
			clickElementUsingJavaScript(Acidityorrefluxorgerd);
			pageLoad();
			}
		public void clickonConstantAcidity() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(constantAcidity);
			clickElementUsingJavaScript(constantAcidity);
			visibilityOf(constantAciditytxt);
			boolean elementIsDisplayed=elementIsDisplayed(constantAciditytxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(constantAciditytxt));
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
			clickElementUsingJavaScript(ReferencesOpen);
			pageLoad();
		}
		public void clickonWhatisEno1() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(WhatisEno1);
			clickElementUsingJavaScript(WhatisEno1);
			visibilityOf(WhatisEnotxt1);
			boolean elementIsDisplayed=elementIsDisplayed(WhatisEnotxt1);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(WhatisEnotxt1));
			pageLoad();
		}
		public void clickonWhydoesStomachHurt1() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(whydoesStomachHurt1);
			clickElementUsingJavaScript(whydoesStomachHurt1);
			visibilityOf(whydoesStomachHurttxt1);
			boolean elementIsDisplayed=elementIsDisplayed(whydoesStomachHurttxt1);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(whydoesStomachHurttxt1));
			pageLoad();
		}
		
		//slidersection//
		
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
