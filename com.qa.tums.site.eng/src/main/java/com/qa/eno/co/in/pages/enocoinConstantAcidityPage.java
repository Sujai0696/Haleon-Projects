package com.qa.eno.co.in.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;



public class enocoinConstantAcidityPage extends BaseClass{
	
	public enocoinConstantAcidityPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/control-acidity-with-busy-lifestyle']")
		private static WebElement controlAciditybusyLifestyle;		
	
		@FindBy(xpath = "//h1[text()='How To Control Acidity With A Busy Lifestyle']")
		private static WebElement controlAciditybusyLifestyletxt;
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/acidity/living-life-acidity-free']")
		private static WebElement livinglifeAcidityfree;
	
		@FindBy(xpath = "//strong[text()='Living Life Acidity Free']")
		private static WebElement livinglifeAcidityfreetxt;
	
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
		private static WebElement acidityorIndigestionxtxt1;
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/types-of-acidity/acidity-reflux-or-gerd']")
		private static WebElement acidityorrefluxorgerd;
	
		@FindBy(xpath = "//div[@class='richText component section text-align-center even last col-xs-12']//child::a[@href='/discover-eno/what-is-eno/']")
		private static WebElement whatiseno_here;
	
		@FindBy(xpath = "//h1[text()='Discover']")
		private static WebElement whatisenotxt_here;
		
		@FindBy(xpath = "//div[@class='accordion component section references-accordion first odd last col-xs-12 col-md-12 col-lg-10 col-lg-offset-1 initialized']//child::header[@class='accordion-head']")
		private static WebElement References;
		
		@FindBy(xpath = "//li[@class='accordion-slide first last odd is-active']")
		private static WebElement ReferencesOpen;
		
		@FindBy(xpath = "(//div[@class='image component section zglazyload col-xs-12 related-article-1 fixed-component']//child::a[@href='/all-about-acidity/acidity/living-life-acidity-free/'])[1]")
		private static WebElement LivinglifeAcidityFree1;
		
		@FindBy(xpath = "//strong[text()='Living Life Acidity Free']")
		private static WebElement LivinglifeAcidityFreetxt1;
		
		@FindBy(xpath = "(//div[@class='image component section zglazyload col-xs-12 related-article-2 fixed-component']//child::a[@href='/all-about-acidity/types-of-acidity/is-it-acidity-or-indigestion/'])[2]")
		private static WebElement AcidityorIndigestion2;
		
		@FindBy(xpath = "//strong[text()='Is It Acidity or Indigestion?']")
		private static WebElement AcidityorIndigestiontxt2;
		
		
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
		
				public void clickonControlAcidityBusyLifestyle() throws Exception {
				waitForPageLoadJava();
				clickElementUsingJavaScript(controlAciditybusyLifestyle);
				visibilityOf(controlAciditybusyLifestyletxt);
				boolean elementIsDisplayed=elementIsDisplayed(controlAciditybusyLifestyletxt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(controlAciditybusyLifestyletxt));
				pageLoad();
				}
				public void clickonLivingLifeAcidityFree() throws Exception {
					waitForPageLoadJava();
					clickElementUsingJavaScript(controlAciditybusyLifestyle);
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
					clickElementUsingJavaScript(controlAciditybusyLifestyle);
					Thread.sleep(1000);
					clickElementUsingJavaScript(livinglifeAcidityfree);
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
					Thread.sleep(1000);
					clickElementUsingJavaScript(acidityorIndigestion);
					visibilityOf(acidityorIndigestionxtxt1);
					boolean elementIsDisplayed=elementIsDisplayed(acidityorIndigestionxtxt1);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(acidityorIndigestionxtxt1));
					pageLoad();
					}
				public void clickonAcidityorRefluxorGerd() throws Exception {
					waitForPageLoadJava();
					clickElementUsingJavaScript(understandingAcidity);
					Thread.sleep(1000);
					clickElementUsingJavaScript(acidityorIndigestion);
					Thread.sleep(1000);
					clickElementUsingJavaScript(acidityorrefluxorgerd);
					pageLoad();
					}
				public void clickonWhatisEno_here() throws Exception {
					waitForPageLoadJava();
					clickElementUsingJavaScript(whatiseno_here);
					visibilityOf(whatisenotxt_here);
					boolean elementIsDisplayed=elementIsDisplayed(whatisenotxt_here);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(whatisenotxt_here));
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
					scrollDownUsingElement(LivinglifeAcidityFree1);
					clickElementUsingJavaScript(LivinglifeAcidityFree1);
					visibilityOf(LivinglifeAcidityFreetxt1);
					boolean elementIsDisplayed=elementIsDisplayed(LivinglifeAcidityFreetxt1);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(LivinglifeAcidityFreetxt1));
					pageLoad();
					}
				public void clickonAcidityorIndigestion2() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(AcidityorIndigestion2);
					clickElementUsingJavaScript(AcidityorIndigestion2);
					visibilityOf(AcidityorIndigestiontxt2);
					boolean elementIsDisplayed=elementIsDisplayed(AcidityorIndigestiontxt2);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(AcidityorIndigestiontxt2));
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
