package com.qa.eno.co.in.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class enocoinUnderstandingDigestiveWellnessPage extends BaseClass{
	
	public enocoinUnderstandingDigestiveWellnessPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/types-of-acidity/acidity-reflux-or-gerd']")
		private static WebElement acidityrefluxorgerd;		
	
		@FindBy(xpath = "//h2[text()='Understanding The Types Of Acidity Problems And Its Remedies']")
		private static WebElement acidityrefluxorgerdtxt;	
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/acidity/understanding-acidity']")
		private static WebElement understandingAcidity;	
	
		@FindBy(xpath = "//strong[text()='Understanding Acidity']")
		private static WebElement understandingAciditytxt;	
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/control-acidity-with-busy-lifestyle']")
		private static WebElement controlaciditylifestyle;	
	
		@FindBy(xpath = "//h1[text()='How To Control Acidity With A Busy Lifestyle']")
		private static WebElement controlaciditylifestyletxt;	
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/acidity/living-life-acidity-free']")
		private static WebElement livinglifeAcidityfree;	
	
		@FindBy(xpath = "//strong[text()='Living Life Acidity Free']")
		private static WebElement livinglifeAcidityfreetxt;
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/discover-eno/what-is-eno']")
		private static WebElement whatiseno;
	
		@FindBy(xpath = "//h1[text()='Discover']")
		private static WebElement whatisenotxt;
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/types-of-acidity/why-does-your-stomach-hurt']")
		private static WebElement whydoesstomachhurt;
	
		@FindBy(xpath = "//strong[text()='Why Does Your Stomach Hurt?']")
		private static WebElement whydoesstomachhurttxt;
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/types-of-acidity/is-it-acidity-or-indigestion']")
		private static WebElement AcidityorIndigestion;
		
		@FindBy(xpath = "//strong[text()='Is It Acidity or Indigestion?']")
		private static WebElement AcidityorIndigestiontxt;
		
		@FindBy(xpath = "//div[@class='richText component section text-align-center even col-xs-12']//child::a[@href='/all-about-acidity/acidity/understanding-acidity/']")
		private static WebElement understandingAcidity_here;
		
		@FindBy(xpath = "//strong[text()='Understanding Acidity']")
		private static WebElement understandingAcidity_heretxt;
		
		@FindBy(xpath = "//div[@class='richText component section text-align-center even col-xs-12']//child::a[@href='/all-about-acidity/home-remedies-for-indigestion/']")
		private static WebElement homeremedies_here;
	
		@FindBy(xpath = "//strong[text()='Home Remedies for Indigestion']")
		private static WebElement homeremedies_heretxt;
	
		@FindBy(xpath = "//div[@class='richText component section text-align-center even col-xs-12']//child::a[@href='/all-about-acidity/acidity/home-remedies-for-acidity/']")
		private static WebElement homeremediesacidity_here;
		
		@FindBy(xpath = "//h1[text()='Home Remedies']")
		private static WebElement homeremediesacidity_heretxt;
		
		@FindBy(xpath = "//div[@class='richText component section text-align-center even col-xs-12']//child::a[@href='/discover-eno/what-is-eno/']")
		private static WebElement whatiseno_here;
		
		@FindBy(xpath = "//h1[text()='Discover']")
		private static WebElement whatiseno_heretxt;
		
		@FindBy(xpath = "//div[@class='accordion component section references-accordion first odd last col-xs-12 col-md-12 col-lg-10 col-lg-offset-1 initialized']//child::header[@class='accordion-head']")
		private static WebElement References;
		
		@FindBy(xpath = "//li[@class='accordion-slide first last odd is-active']")
		private static WebElement ReferencesOpen;
		
		@FindBy(xpath = "//div[@class='image component section zglazyload col-xs-12 related-article-1 fixed-component']//child::a[@href='/all-about-acidity/acidity/living-life-acidity-free/']//strong[text()='Living life acidity free']")
		private static WebElement livinglifeAcidityFree1;
		
		@FindBy(xpath = "//strong[text()='Living Life Acidity Free']")
		private static WebElement livinglifeAcidityFreetxt1;
		
		@FindBy(xpath = "(//div[@class='image component section zglazyload col-xs-12 related-article-2 fixed-component']//child::a[@href='/all-about-acidity/gas-relief/gas-relief/'])[2]")
		private static WebElement gasRelief1;
		
		@FindBy(xpath = "//h1[text()='Gas Relief']")
		private static WebElement gasRelieftxt1;
		
		
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
		
				public void clickonAcidityRefluxorgerd() throws Exception {
				waitForPageLoadJava();
				clickElementUsingJavaScript(acidityrefluxorgerd);
				visibilityOf(acidityrefluxorgerdtxt);
				boolean elementIsDisplayed=elementIsDisplayed(acidityrefluxorgerdtxt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(acidityrefluxorgerdtxt));
				pageLoad();
				}
				public void clickonunderstandingAcidity() throws Exception {
					waitForPageLoadJava();
					clickElementUsingJavaScript(acidityrefluxorgerd);
					Thread.sleep(1000);
					clickElementUsingJavaScript(understandingAcidity);
					visibilityOf(understandingAciditytxt);
					boolean elementIsDisplayed=elementIsDisplayed(understandingAciditytxt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(understandingAciditytxt));
					pageLoad();
					}
				public void clickonControlAcidityLifestyle() throws Exception {
					waitForPageLoadJava();
					clickElementUsingJavaScript(acidityrefluxorgerd);
					Thread.sleep(1000);
					clickElementUsingJavaScript(understandingAcidity);
					Thread.sleep(1000);
					clickElementUsingJavaScript(controlaciditylifestyle);
					visibilityOf(controlaciditylifestyletxt);
					boolean elementIsDisplayed=elementIsDisplayed(controlaciditylifestyletxt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(controlaciditylifestyletxt));
					pageLoad();
					}
				public void clickonLivingLifeAcidityFree() throws Exception {
					waitForPageLoadJava();
					clickElementUsingJavaScript(acidityrefluxorgerd);
					Thread.sleep(1000);
					clickElementUsingJavaScript(understandingAcidity);
					Thread.sleep(1000);
					clickElementUsingJavaScript(controlaciditylifestyle);
					Thread.sleep(1000);
					clickElementUsingJavaScript(livinglifeAcidityfree);
					visibilityOf(livinglifeAcidityfreetxt);
					boolean elementIsDisplayed=elementIsDisplayed(livinglifeAcidityfreetxt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(livinglifeAcidityfreetxt));
					pageLoad();
					}
				public void clickonWhatisEno() throws Exception {
					waitForPageLoadJava();
					clickElementUsingJavaScript(acidityrefluxorgerd);
					Thread.sleep(1000);
					clickElementUsingJavaScript(understandingAcidity);
					Thread.sleep(1000);
					clickElementUsingJavaScript(controlaciditylifestyle);
					Thread.sleep(1000);
					clickElementUsingJavaScript(livinglifeAcidityfree);
					Thread.sleep(1000);
					clickElementUsingJavaScript(whatiseno);
					visibilityOf(whatisenotxt);
					boolean elementIsDisplayed=elementIsDisplayed(whatisenotxt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(whatisenotxt));
					pageLoad();
					}
				public void clickonwhydoesstomachhurt() throws Exception {
					waitForPageLoadJava();
					clickElementUsingJavaScript(whydoesstomachhurt);
					visibilityOf(whydoesstomachhurttxt);
					boolean elementIsDisplayed=elementIsDisplayed(whydoesstomachhurttxt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(whydoesstomachhurttxt));
					pageLoad();
					}
				public void clickonAcidityorIndigestion() throws Exception {
					waitForPageLoadJava();
					clickElementUsingJavaScript(whydoesstomachhurt);
					Thread.sleep(1000);
					clickElementUsingJavaScript(AcidityorIndigestion);
					visibilityOf(AcidityorIndigestiontxt);
					boolean elementIsDisplayed=elementIsDisplayed(AcidityorIndigestiontxt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(AcidityorIndigestiontxt));
					pageLoad();
					}
				
				public void clickonUnderstandingAcidity_here() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(understandingAcidity_here);
					clickElementUsingJavaScript(understandingAcidity_here);
					visibilityOf(understandingAcidity_heretxt);
					boolean elementIsDisplayed=elementIsDisplayed(understandingAcidity_heretxt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(understandingAcidity_heretxt));
					pageLoad();
					}
				public void clickonHomeRemedies_here() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(homeremedies_here);
					clickElementUsingJavaScript(homeremedies_here);
					visibilityOf(homeremedies_heretxt);
					boolean elementIsDisplayed=elementIsDisplayed(homeremedies_heretxt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(homeremedies_heretxt));
					pageLoad();
					}
				public void clickonHomeRemediesAcidity_here() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(homeremediesacidity_here);
					clickElementUsingJavaScript(homeremediesacidity_here);
					visibilityOf(homeremediesacidity_heretxt);
					boolean elementIsDisplayed=elementIsDisplayed(homeremediesacidity_heretxt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(homeremediesacidity_heretxt));
					pageLoad();
					}
				public void clickonwhatisEno_here() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(whatiseno_here);
					clickElementUsingJavaScript(whatiseno_here);
					visibilityOf(whatiseno_heretxt);
					boolean elementIsDisplayed=elementIsDisplayed(whatiseno_heretxt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(whatiseno_heretxt));
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
					scrollDownUsingElement(livinglifeAcidityFree1);
					clickElementUsingJavaScript(livinglifeAcidityFree1);
					visibilityOf(livinglifeAcidityFreetxt1);
					boolean elementIsDisplayed=elementIsDisplayed(livinglifeAcidityFreetxt1);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(livinglifeAcidityFreetxt1));
					pageLoad();
					}
				public void clickonGasRelief1() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(gasRelief1);
					clickElementUsingJavaScript(gasRelief1);
					visibilityOf(gasRelieftxt1);
					boolean elementIsDisplayed=elementIsDisplayed(gasRelieftxt1);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(gasRelieftxt1));
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
