package com.qa.eno.co.in.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class enocoinLivingLifeAcidityFreePage extends BaseClass{
	
	public enocoinLivingLifeAcidityFreePage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/discover-eno/what-is-eno']")
		private static WebElement whatiseno;
			
		@FindBy(xpath = "//h2[text()='Our Purpose']")
		private static WebElement whatisenotxt;
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/acidity/initial-symptoms-of-acidity']")
		private static WebElement InitialSmptomsAcidity;
	
		@FindBy(xpath = "//h2[text()='A Little Acidity Is Still Too Much']")
		private static WebElement InitialSmptomsAciditytxt;
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/acidity/understanding-acidity']")
		private static WebElement UnderstandingAcidity;
	
		@FindBy(xpath = "//strong[text()='Understanding Acidity']")
		private static WebElement UnderstandingAciditytxt;
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/types-of-acidity/is-it-acidity-or-indigestion']")
		private static WebElement AcidityorIndigestion;
	
		@FindBy(xpath = "//strong[text()='Is It Acidity or Indigestion?']")
		private static WebElement AcidityorIndigestiontxt;
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/types-of-acidity/acidity-reflux-or-gerd']")
		private static WebElement AcidityorRefluxorgerd;
	
		@FindBy(xpath = "//h2[text()='Understanding The Types Of Acidity Problems And Its Remedies']")
		private static WebElement AcidityorRefluxorgerdtxt;
	
		@FindBy(xpath = "//div[@class='richText component section text-align-center even col-xs-12']//child::a[@href='/discover-eno/what-is-eno/']")
		private static WebElement Whatiseno_here;
	
		@FindBy(xpath = "//div[@class='accordion component section references-accordion first odd last col-xs-12 col-md-12 col-lg-10 col-lg-offset-1 initialized']//child::header[@class='accordion-head']")
		private static WebElement References;
	
		@FindBy(xpath = "//div[@class='accordion component section references-accordion first odd last col-xs-12 col-md-12 col-lg-10 col-lg-offset-1 initialized']//child::li[@class='accordion-slide first last odd is-active']")
		private static WebElement ReferencesOpen;
	
		@FindBy(xpath = "//div[@class='image component section zglazyload col-xs-12 related-article-1 fixed-component']//child::a[text()='Is it Acidity, Reflux or GERD']")
		private static WebElement AcidityRefluxorgerd1;
		
		@FindBy(xpath = "//h2[text()='Understanding The Types Of Acidity Problems And Its Remedies']")
		private static WebElement AcidityRefluxorgerdtxt1;
		
		@FindBy(xpath = "//div[@class='image component section zglazyload col-xs-12 related-article-2 fixed-component']//child::strong[text()='Understanding Digestive Wellness']")
		private static WebElement UnderstandingDigestiveWellness;
		
		@FindBy(xpath = "//span[text()='Uncovering the Truth Behind Keeping Your Digestive System in Tip Top Shape']")
		private static WebElement UnderstandingDigestiveWellnesstxt;
		
		
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
		
		public void clickonWhatIsEno() throws Exception {
		waitForPageLoadJava();
		clickElementUsingJavaScript(whatiseno);
		visibilityOf(whatisenotxt);
		boolean elementIsDisplayed=elementIsDisplayed(whatisenotxt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(whatisenotxt));
		pageLoad();
		}
		
		public void clickonInitialSymptomsAcidity() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(InitialSmptomsAcidity);
			visibilityOf(InitialSmptomsAciditytxt);
			boolean elementIsDisplayed=elementIsDisplayed(InitialSmptomsAciditytxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(InitialSmptomsAciditytxt));
			pageLoad();
		}
		public void clickonUnderstandingAcidity() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(InitialSmptomsAcidity);
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
			clickElementUsingJavaScript(InitialSmptomsAcidity);
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
		public void clickonAcidityorRefluxorGerd() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(InitialSmptomsAcidity);
			Thread.sleep(1000);
			clickElementUsingJavaScript(UnderstandingAcidity);
			Thread.sleep(1000);
			clickElementUsingJavaScript(AcidityorIndigestion);
			Thread.sleep(1000);
			clickElementUsingJavaScript(AcidityorRefluxorgerd);
			visibilityOf(AcidityorRefluxorgerdtxt);
			boolean elementIsDisplayed=elementIsDisplayed(AcidityorRefluxorgerdtxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(AcidityorRefluxorgerdtxt));
			pageLoad();
		}
		public void clickonWhatisEno_here() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Whatiseno_here);
			clickElementUsingJavaScript(Whatiseno_here);
			pageLoad();
		}
		public void clickonReferences() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(References);
			clickElementUsingJavaScript(References);
			visibilityOf(ReferencesOpen);
			boolean elementIsDisplayed=elementIsDisplayed(ReferencesOpen);
			Assert.assertTrue(elementIsDisplayed(ReferencesOpen));
			Thread.sleep(1000);
			clickElementUsingJavaScript(References);
			pageLoad();
		}
		public void clickonAcidityorRefluxorGerd1() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(AcidityRefluxorgerd1);
			clickElementUsingJavaScript(AcidityRefluxorgerd1);
			visibilityOf(AcidityRefluxorgerdtxt1);
			boolean elementIsDisplayed=elementIsDisplayed(AcidityRefluxorgerdtxt1);
			Assert.assertTrue(elementIsDisplayed(AcidityRefluxorgerdtxt1));
			System.out.println(getElementText(AcidityRefluxorgerdtxt1));
			pageLoad();
		}
		public void clickonUnderstandingDigestiveWellness() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(UnderstandingDigestiveWellness);
			clickElementUsingJavaScript(UnderstandingDigestiveWellness);
			visibilityOf(UnderstandingDigestiveWellnesstxt);
			boolean elementIsDisplayed=elementIsDisplayed(UnderstandingDigestiveWellnesstxt);
			Assert.assertTrue(elementIsDisplayed(UnderstandingDigestiveWellnesstxt));
			System.out.println(getElementText(UnderstandingDigestiveWellnesstxt));
			pageLoad();
		}
		//next slider//
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
