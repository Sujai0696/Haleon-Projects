package com.qa.eno.co.in.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class enocoinHomeRemediesforAcidityPage extends BaseClass{

	public enocoinHomeRemediesforAcidityPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/acidity/living-life-acidity-free']")
		private static WebElement livinglifeacidityfree;
	
		@FindBy(xpath = "//strong[text()='Living Life Acidity Free']")
		private static WebElement livinglifeacidityfreetxt;
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/discover-eno/what-is-eno']")
		private static WebElement whatiseno;
	
		@FindBy(xpath = "//h1[text()='Discover']")
		private static WebElement whatisenotxt;
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/acidity/understanding-acidity']")
		private static WebElement understandingAcidity;
	
		@FindBy(xpath = "//strong[text()='Understanding Acidity']")
		private static WebElement understandingAciditytxt;
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/types-of-acidity/is-it-acidity-or-indigestion']")
		private static WebElement acidityorindigestion;
	
		@FindBy(xpath = "//strong[text()='Is It Acidity or Indigestion?']")
		private static WebElement acidityorindigestiontxt;
	
		@FindBy(xpath = "//div[@class='parametrizedhtml component section container-override col-xs-12 reference-article-pagination pagination-component fixed-component']//child::a[@href='/all-about-acidity/types-of-acidity/acidity-reflux-or-gerd']")
		private static WebElement AcidityorRefluxorgerd;
	
		@FindBy(xpath = "//h2[text()='Understanding The Types Of Acidity Problems And Its Remedies']")
		private static WebElement AcidityorRefluxorgerdtxt;
	
		@FindBy(xpath = "//div[@class='image component section icon-text-float text-no-padding zglazyload even col-xs-12']//child::a[@href='/discover-eno/what-is-eno/']")
		private static WebElement whatiseno_here;
	
		@FindBy(xpath = "//div[@class='richText component section text-align-center text-no-padding odd last col-xs-12']//child::a[@href='/discover-eno/what-is-eno/']")
		private static WebElement whatiseno_here1;
	
		@FindBy(xpath = "//div[@class='accordion component section references-accordion even last col-xs-12 col-md-12 col-lg-10 col-lg-offset-1 initialized']//child::header[@class='accordion-head']")
		private static WebElement References;
	
		@FindBy(xpath = "//div[@class='accordion component section references-accordion even last col-xs-12 col-md-12 col-lg-10 col-lg-offset-1 initialized']//child::li[@class='accordion-slide first last odd is-active']")
		private static WebElement ReferencesOpen;
	
		@FindBy(xpath = "//div[@class='image component section zglazyload col-xs-12 related-article-1 fixed-component']//child::a[text()='Constant Acidity']")
		private static WebElement constantAcidity;
		
		@FindBy(xpath = "//h1[text()='Constant Acidity']")
		private static WebElement constantAciditytxt;
		
		@FindBy(xpath = "//div[@class='image component section zglazyload col-xs-12 related-article-2 fixed-component']//child::a[text()='What is ENO']")
		private static WebElement whatisenos;
		
		@FindBy(xpath = "//h1[text()='Discover']")
		private static WebElement whatisenostxt;
		
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
		
				public void clickonLivinglifeAcidityfree() throws Exception {
				waitForPageLoadJava();
				clickElementUsingJavaScript(livinglifeacidityfree);
				visibilityOf(livinglifeacidityfreetxt);
				boolean elementIsDisplayed=elementIsDisplayed(livinglifeacidityfreetxt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(livinglifeacidityfreetxt));
				pageLoad();
				}
				public void clickonWhatisEno() throws Exception {
					waitForPageLoadJava();
					clickElementUsingJavaScript(livinglifeacidityfree);
					Thread.sleep(1000);
					clickElementUsingJavaScript(whatiseno);
					visibilityOf(whatisenotxt);
					boolean elementIsDisplayed=elementIsDisplayed(whatisenotxt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(whatisenotxt));
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
				public void clickonAcidityorRefluxorgerd() throws Exception {
					waitForPageLoadJava();
					clickElementUsingJavaScript(understandingAcidity);
					Thread.sleep(1000);
					clickElementUsingJavaScript(acidityorindigestion);
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
					scrollDownUsingElement(whatiseno_here);
					clickElementUsingJavaScript(whatiseno_here);
					pageLoad();
				}
				public void clickonWhatisEno_here1() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(whatiseno_here1);
					clickElementUsingJavaScript(whatiseno_here1);
					pageLoad();
				}
				public void clickonReferences() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(References);
					clickElementUsingJavaScript(References);
					visibilityOf(ReferencesOpen);
					boolean elementISDisplayed=elementIsDisplayed(ReferencesOpen);
					Assert.assertTrue(elementISDisplayed);
					Thread.sleep(1000);
					clickElementUsingJavaScript(References);
					pageLoad();
				}
				public void clickonConstantAcidity() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(constantAcidity);
					clickElementUsingJavaScript(constantAcidity);
					visibilityOf(constantAciditytxt);
					boolean elementISDisplayed=elementIsDisplayed(constantAciditytxt);
					Assert.assertTrue(elementISDisplayed);
					System.out.println(getElementText(constantAciditytxt));
					pageLoad();
				}
				public void clickonWhatisemos() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(whatisenos);
					clickElementUsingJavaScript(whatisenos);
					visibilityOf(whatisenotxt);
					boolean elementISDisplayed=elementIsDisplayed(whatisenotxt);
					Assert.assertTrue(elementISDisplayed);
					System.out.println(getElementText(whatisenotxt));
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
