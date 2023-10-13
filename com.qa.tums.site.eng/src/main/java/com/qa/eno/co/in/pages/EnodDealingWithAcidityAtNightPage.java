package com.qa.eno.co.in.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class EnodDealingWithAcidityAtNightPage extends BaseClass{
	
	public EnodDealingWithAcidityAtNightPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//p[contains(text(),'If acidity still manages to find a way to get in t')]//a[normalize-space()='here']")
	private static WebElement reachOutForEnoHereLink;
	
	@FindBy(xpath = "//div[@class='richText component section text-align-center even last col-xs-12 col-md-offset-0']//ancestor::a[@href='/discover-eno/what-is-eno/']")
	private static WebElement findOutMoreHereLinkOne;
	
	@FindBy(xpath = "//div[@class='richText component section text-align-center even last col-xs-12 col-md-offset-0']//ancestor::a[@href='/all-about-acidity/acidity/home-remedies-for-acidity/']")
	private static WebElement findOutMoreHereLinkTwo;
	
	@FindBy(xpath = "//*[@class='accordion-title-text']//self::span[text()='References']")
	private static WebElement clickRefernce;
	
	@FindBy(xpath = "//span[text()='References']//ancestor::li[@class='accordion-slide first last odd']")
	private static WebElement references;
	
	@FindBy(xpath = "//span[text()='References']//ancestor::li[@class='accordion-slide first last odd is-active']")
	private static WebElement referenceActive;
	
	@FindBy(xpath = "//img[@title='Get quick relief from acidity']")
	private static WebElement livingLifeAcidityFreeImg;
	
	@FindBy(xpath = "//a[text()='Living Life Acidity Free']")
	private static WebElement livingLifeAcidityFreeText;
	
	@FindBy(xpath = "//a[text()='Learn how to manage acidity so you can jiyo life non stop!']")
	private static WebElement livingLifeAcidityFreePara;
	
	@FindBy(xpath = "//img[@title='Causes and Symptoms of Acidity']")
	private static WebElement constantAcidityImg;
	
	@FindBy(xpath = "//a[text()='Constant Acidity']")
	private static WebElement constantAcidityText;
	
	@FindBy(xpath = "//a[text()='Constant acidity could be a red flag! Learn about its causes and treatment.']")
	private static WebElement constantAcidityPara;
	
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
	
	
	
	
	
	
	
	public void clickReachOutForEnoHereLink() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(reachOutForEnoHereLink);
		clickElementUsingJavaScript(reachOutForEnoHereLink);
		pageLoad();
	}
	
	public void clickFindOutMoreHereLinkOne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(findOutMoreHereLinkOne);
		clickElementUsingJavaScript(findOutMoreHereLinkOne);
		pageLoad();
	}
	
	public void clickFindOutMoreHereLinkTwo() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(findOutMoreHereLinkTwo);
		clickElementUsingJavaScript(findOutMoreHereLinkTwo);
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
	
	public void clickConstantAcidityImg() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(clickRefernce);
		clickElementUsingJavaScript(constantAcidityImg);
		pageLoad();
	}
	
	public void clickConstantAcidityText() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(clickRefernce);
		clickElementUsingJavaScript(constantAcidityText);
		pageLoad();
	}
	
	public void clickConstantAcidityPara() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(clickRefernce);
		clickElementUsingJavaScript(constantAcidityPara);
		pageLoad();
	}
	
	

}
