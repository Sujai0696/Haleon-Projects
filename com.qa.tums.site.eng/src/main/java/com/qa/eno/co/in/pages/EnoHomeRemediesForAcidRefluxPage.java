package com.qa.eno.co.in.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class EnoHomeRemediesForAcidRefluxPage extends BaseClass{
	
	public EnoHomeRemediesForAcidRefluxPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@href='/products/']//self::a[text()='here']")
	private static WebElement hereLink;

	@FindBy(xpath = "//*[@class='accordion-title-text']//self::span[text()='References']")
	private static WebElement clickRefernce;
	
	@FindBy(xpath = "//span[text()='References']//ancestor::li[@class='accordion-slide first last odd']")
	private static WebElement references;
	
	@FindBy(xpath = "//span[text()='References']//ancestor::li[@class='accordion-slide first last odd is-active']")
	private static WebElement referenceActive;
	
	@FindBy(xpath = "//img[@title='Learn more about acidity']")
	private static WebElement refluxOrGredImg;
	
	@FindBy(xpath = "//a[text()='Is it Acidity, Reflux or GERD']")
	private static WebElement refluxOrGredText;
	
	@FindBy(xpath = "//a[text()='Understanding the difference can help you treat your gastric issues better.']")
	private static WebElement refluxOrGredPara;
	
	@FindBy(xpath = "//img[@title='Get quick relief from acidity']")
	private static WebElement livingLifeAcidityFreeImg;
	
	@FindBy(xpath = "//a[text()='Living Life Acidity Free']")
	private static WebElement livingLifeAcidityFreeText;
	
	@FindBy(xpath = "//a[text()='Learn how to manage acidity so you can jiyo life non stop!']")
	private static WebElement livingLifeAcidityFreePara;
	
	
	
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
	
	
	
	
	public void clickHereLink() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(hereLink);
		clickElementUsingJavaScript(hereLink);
		pageLoad();
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
	
	public void clickRefluxOrGredImg() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(clickRefernce);
		clickElementUsingJavaScript(refluxOrGredImg);
		pageLoad();
	}
	
	public void clickRefluxOrGredText() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(clickRefernce);
		clickElementUsingJavaScript(refluxOrGredText);
		pageLoad();
	}
	
	public void clickRefluxOrGredPara() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(clickRefernce);
		clickElementUsingJavaScript(refluxOrGredPara);
		pageLoad();
	}
	
	public void clickLivingLifeAcidityFreeImg() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(clickRefernce);
		clickElementUsingJavaScript(livingLifeAcidityFreeImg);
		pageLoad();
	}
	
	public void clickLivingLifeAcidityFreeText() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(clickRefernce);
		clickElementUsingJavaScript(livingLifeAcidityFreeText);
		pageLoad();
	}
	
	public void clickLivingLifeAcidityFreePara() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(clickRefernce);
		clickElementUsingJavaScript(livingLifeAcidityFreePara);
		pageLoad();
	}
	
}
