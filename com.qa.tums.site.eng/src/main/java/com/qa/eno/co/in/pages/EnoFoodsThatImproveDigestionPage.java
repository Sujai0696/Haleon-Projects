package com.qa.eno.co.in.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class EnoFoodsThatImproveDigestionPage extends BaseClass{
	
	public EnoFoodsThatImproveDigestionPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@class='accordion-title-text']//self::span[text()='References']")
	private static WebElement clickRefernce;
	
	@FindBy(xpath = "//span[text()='References']//ancestor::li[@class='accordion-slide first last odd']")
	private static WebElement references;
	
	@FindBy(xpath = "//span[text()='References']//ancestor::li[@class='accordion-slide first last odd is-active']")
	private static WebElement referenceActive;
	
	@FindBy(xpath = "//img//ancestor::a[@title='Understand Digestive Wellness']")
	private static WebElement understandDigestiveWellnessImg;
	
	@FindBy(xpath = "//a[text()='Understand Digestive Wellness']")
	private static WebElement understandDigestiveWellnessText;
	
	@FindBy(xpath = "//a[text()='A good digestive system is the key to good health too! Know how to keep it well.']")
	private static WebElement understandDigestiveWellnessPara;
	
	@FindBy(xpath = "//img//ancestor::a[@title='What is ENO']")
	private static WebElement whatIsEnoImg;
	
	@FindBy(xpath = "//a[text()='What is ENO']")
	private static WebElement whatIsEnoText;
	
	@FindBy(xpath = "//a[text()='A fast remedy, Eno gets to work in just 6 seconds and relieves acidity.']")
	private static WebElement whatIsEnoPara;
	
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
	
	
	@FindBy(xpath = "//a[text()='PREVIOUS']")
	private static WebElement Previous;
	
	@FindBy(xpath = "//a[text()='NEXT']")
	private static WebElement Next;
	
	public void clickonPrevious() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(Previous);
		clickElementUsingJavaScript(Previous);
		pageLoad();
		}
	
	public void clickonNext() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(Next);
		clickElementUsingJavaScript(Next);
		pageLoad();
		}
	
	
	public void clickDidYouKnowSection()throws Exception {
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
	
	
	
	
	
	
	
	
	
	public void clickReferences() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(clickRefernce)) {
			scrollDownUsingElement(clickRefernce);
			clickElementUsingJavaScript(clickRefernce);
			visibilityOf(referenceActive);
			Assert.assertTrue(elementIsDisplayed(referenceActive));
			clickElementUsingJavaScript(clickRefernce);
			visibilityOf(references);
			Assert.assertTrue(elementIsDisplayed(references));
			System.out.println("Accordion Verified successfully");
		} else {
			System.out.println("Accordion is not verified");
			Assert.assertTrue(false, "References is not presented in the page");
		}
	}
	

	public void clickUnderstandDigestiveWellnessImg() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(clickRefernce);
		clickElementUsingJavaScript(understandDigestiveWellnessImg);
		pageLoad();
	}
	
	public void clickUnderstandDigestiveWellnessText() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(clickRefernce);
		clickElementUsingJavaScript(understandDigestiveWellnessText);
		pageLoad();
	}
	
	public void clickUnderstandDigestiveWellnessPara() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(clickRefernce);
		clickElementUsingJavaScript(understandDigestiveWellnessPara);
		pageLoad();
	}
	
	public void clickWhatIsEnoImg() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(clickRefernce);
		clickElementUsingJavaScript(whatIsEnoImg);
		pageLoad();
	}
	
	public void clickWhatIsEnoText() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(clickRefernce);
		clickElementUsingJavaScript(whatIsEnoText);
		pageLoad();
	}
	
	public void clickWhatIsEnoPara() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(clickRefernce);
		clickElementUsingJavaScript(whatIsEnoPara);
		pageLoad();
	}
}
