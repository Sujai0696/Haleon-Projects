package com.qa.eno.co.in.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class EnoInitialSymptomsOfHeartburnPage extends BaseClass{
	
	public EnoInitialSymptomsOfHeartburnPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@class='accordion-title-text']//self::span[text()='References']")
	private static WebElement clickRefernce;
	
	@FindBy(xpath = "//span[text()='References']//ancestor::li[@class='accordion-slide first last odd']")
	private static WebElement references;
	
	@FindBy(xpath = "//span[text()='References']//ancestor::li[@class='accordion-slide first last odd is-active']")
	private static WebElement referenceActive;
	
	
	@FindBy(xpath = "//img[@title='Home Remedies for Indigestion']")
	private static WebElement homeRemediesForIndigestionImg;
	
	@FindBy(xpath = "//strong[text()='Home Remedies for Indigestion']")
	private static WebElement homeRemediesForIndigestionText;
	
	@FindBy(xpath = "//a[contains(normalize-space(),'Your kitchen cupboard has ingredients that can help you calm your stomach!')]")
	private static WebElement homeRemediesForIndigestionPara;
	
	@FindBy(xpath = "//img[contains(@src,'/content/dam/cf-consumer-healthcare/nutrition-eno/en_IN/Related-Article/gas-relief.jpg')]")
	private static WebElement gasReliefImg;
	
	@FindBy(xpath = "//*[@href='/all-about-acidity/gas-relief/gas-relief/']//self::a[text()='Gas Relief']")
	private static WebElement gasReliefText;
	
	@FindBy(xpath = "//*[@href='/all-about-acidity/gas-relief/gas-relief/']//self::a[text()='Gas in your stomach and digestive system is part of the normal process of digestion.']")
	private static WebElement gasReliefPara;
	
	
	
	
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
	
	public void clickHomeRemediesForIndigestionImg() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(clickRefernce);
		clickElementUsingJavaScript(homeRemediesForIndigestionImg);
		pageLoad();
	}
	
	public void clickHomeRemediesForIndigestionText() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(clickRefernce);
		clickElementUsingJavaScript(homeRemediesForIndigestionText);
		pageLoad();
	}
	
	public void clickHomeRemediesForIndigestionPara() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(clickRefernce);
		clickElementUsingJavaScript(homeRemediesForIndigestionPara);
		pageLoad();
	}
	
	public void clickGasReliefImg() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(clickRefernce);
		clickElementUsingJavaScript(gasReliefImg);
		pageLoad();
	}
	
	public void clickGasReliefText() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(clickRefernce);
		clickElementUsingJavaScript(gasReliefText);
		pageLoad();
	}
	
	public void clickGasReliefPara() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(clickRefernce);
		clickElementUsingJavaScript(gasReliefPara);
		pageLoad();
	}
	

}
