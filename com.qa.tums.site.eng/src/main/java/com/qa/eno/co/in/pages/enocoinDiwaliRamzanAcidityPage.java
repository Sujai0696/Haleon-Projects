package com.qa.eno.co.in.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class enocoinDiwaliRamzanAcidityPage extends BaseClass{
	
	public enocoinDiwaliRamzanAcidityPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/control-acidity-with-busy-lifestyle']")
		private static WebElement ControlAcidityLifestyle;
			
		@FindBy(xpath = "//h1[text()='How To Control Acidity With A Busy Lifestyle']")
		private static WebElement ControlAcidityLifestyletxt;
			
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/acidity/living-life-acidity-free']")
		private static WebElement livinglifeAcidityFree;
	
		@FindBy(xpath = "//strong[text()='Living Life Acidity Free']")
		private static WebElement livinglifeAcidityFreetxt;
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/discover-eno/what-is-eno']")
		private static WebElement Whatiseno;
	
		@FindBy(xpath = "//h1[text()='Discover']")
		private static WebElement Whatisenotxt;
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/acidity/understanding-acidity']")
		private static WebElement understandingAcidity;
	
		@FindBy(xpath = "//strong[text()='Understanding Acidity']")
		private static WebElement understandingAciditytxt;
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/types-of-acidity/is-it-acidity-or-indigestion']")
		private static WebElement acidityorIndigestion;
	
		@FindBy(xpath = "//strong[text()='Is It Acidity or Indigestion?']")
		private static WebElement acidityorIndigestiontxt;
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/types-of-acidity/acidity-reflux-or-gerd']")
		private static WebElement AcidityRefluxorgerd;
	
		@FindBy(xpath = "(//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style first odd last component col-xs-12']//child::a[@href='/all-about-acidity/control-acidity-with-busy-lifestyle/'])[2]")
		private static WebElement controlAcidtyLifestyle_here;
	
		@FindBy(xpath = "//h1[text()='How To Control Acidity With A Busy Lifestyle']")
		private static WebElement controlAcidtyLifestyle_heretxt;
	
		@FindBy(xpath = "//div[@class='accordion component section references-accordion even last col-xs-12 col-md-12 col-lg-10 col-lg-offset-1 initialized']//child::header[@class='accordion-head']")
		private static WebElement References;
	
		@FindBy(xpath = "//div[@class='accordion component section references-accordion even last col-xs-12 col-md-12 col-lg-10 col-lg-offset-1 initialized']//child::li[@class='accordion-slide first last odd is-active']")
		private static WebElement ReferencesOpen;
	
		@FindBy(xpath = "(//div[@class='image component section zglazyload col-xs-12 related-article-1 fixed-component']//child::a[@href='/all-about-acidity/acidity/living-life-acidity-free/'])[2]")
		private static WebElement livinglifeAcidityfree1;
		
		@FindBy(xpath = "//strong[text()='Living Life Acidity Free']")
		private static WebElement livinglifeAcidityfreetxt1;
		
		@FindBy(xpath = "//div[@class='image component section zglazyload col-xs-12 related-article-2 fixed-component']//child::a[@href='/discover-eno/what-is-eno/']//img")
		private static WebElement whatisEno1;
		
		@FindBy(xpath = "//h1[text()='Discover']")
		private static WebElement whatisEnotxt1;
		
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
	
		public void clickonControlAcidityLifestyle() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(ControlAcidityLifestyle);
			visibilityOf(ControlAcidityLifestyletxt);
			boolean elementIsDisplayed=elementIsDisplayed(ControlAcidityLifestyletxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(ControlAcidityLifestyletxt));
			pageLoad();
			}
		public void clickonLivingLifeAcidityFree() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(ControlAcidityLifestyle);
			Thread.sleep(1000);
			clickElementUsingJavaScript(livinglifeAcidityFree);
			visibilityOf(livinglifeAcidityFreetxt);
			boolean elementIsDisplayed=elementIsDisplayed(livinglifeAcidityFreetxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(livinglifeAcidityFreetxt));
			pageLoad();
			}
	
		public void clickonWhatisEno() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(ControlAcidityLifestyle);
			Thread.sleep(1000);
			clickElementUsingJavaScript(livinglifeAcidityFree);
			Thread.sleep(1000);
			clickElementUsingJavaScript(Whatiseno);
			visibilityOf(Whatisenotxt);
			boolean elementIsDisplayed=elementIsDisplayed(Whatisenotxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Whatisenotxt));
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
			implicitWait();
			clickElementUsingJavaScript(acidityorIndigestion);
			visibilityOf(acidityorIndigestiontxt);
			boolean elementIsDisplayed=elementIsDisplayed(acidityorIndigestiontxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(acidityorIndigestiontxt));
			pageLoad();
			}
		
		public void clickonAcidityRefluxorgerd() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(understandingAcidity);
			implicitWait();
			clickElementUsingJavaScript(acidityorIndigestion);
			implicitWait();
			clickElementUsingJavaScript(AcidityRefluxorgerd);
			pageLoad();
			}
		public void clickonControlAcidityLifestyle_here() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(controlAcidtyLifestyle_here);
			clickElementUsingJavaScript(controlAcidtyLifestyle_here);
			visibilityOf(controlAcidtyLifestyle_heretxt);
			boolean elementIsDisplayed=elementIsDisplayed(controlAcidtyLifestyle_heretxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(controlAcidtyLifestyle_heretxt));
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
		public void clickonLivingLifeAcidityFree1() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(livinglifeAcidityfree1);
			clickElementUsingJavaScript(livinglifeAcidityfree1);
			visibilityOf(livinglifeAcidityfreetxt1);
			boolean elementIsDisplayed=elementIsDisplayed(livinglifeAcidityfreetxt1);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(livinglifeAcidityfreetxt1));
			pageLoad();
			}
		
		public void clickonWhatisEno1() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(whatisEno1);
			clickElementUsingJavaScript(whatisEno1);
			visibilityOf(whatisEnotxt1);
			boolean elementIsDisplayed=elementIsDisplayed(whatisEnotxt1);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(whatisEnotxt1));
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
