package com.qa.eno.co.in.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class EnoAcidityRefluxOrGerdPage extends BaseClass{

	public EnoAcidityRefluxOrGerdPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='PREVIOUS']")
	private static WebElement Previous;

	@FindBy(xpath = "//a[text()='NEXT']")
	private static WebElement Next;

	@FindBy(xpath = "//a[@href='/discover-eno/what-is-eno/']//self::a[text()='here']")
	private static WebElement enoHereLink;

	@FindBy(xpath = "//*[@class='accordion-title-text']//self::span[text()='References']")
	private static WebElement clickRefernce;

	@FindBy(xpath = "//span[text()='References']//ancestor::li[@class='accordion-slide first last odd']")
	private static WebElement references;

	@FindBy(xpath = "//span[text()='References']//ancestor::li[@class='accordion-slide first last odd is-active']")
	private static WebElement referenceActive;

	@FindBy(xpath = "//img[contains(@src,'/content/dam/cf-consumer-healthcare/nutrition-eno/en_IN/Related-Article/living-life-acidity-free.jpg')]")
	private static WebElement livingLifeAcidityImg;

	@FindBy(xpath = "//*[@href='/all-about-acidity/acidity/living-life-acidity-free/']//self::a[text()='Living life acidity free']")
	private static WebElement livingLifeAcidityText;

	@FindBy(xpath = "//*[@href='/all-about-acidity/acidity/living-life-acidity-free/']//self::a[text()='Learn how to manage acidity so you can jiyo life non stop!']")
	private static WebElement livingLifeAcidityPara;

	@FindBy(xpath = "//img[contains(@src,'/content/dam/cf-consumer-healthcare/nutrition-eno/en_IN/Related-Article/gas-relief.jpg')]")
	private static WebElement gasReliefImg;

	@FindBy(xpath = "//*[@href='/all-about-acidity/gas-relief/gas-relief/']//self::a[text()='Gas Relief']")
	private static WebElement gasReliefText;

	@FindBy(xpath = "//*[@href='/all-about-acidity/gas-relief/gas-relief/']//self::a[text()='Gas can be a source of severe discomfort. Learn about its symptoms and cures']")
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




	public void clickEnoHereLink() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(enoHereLink);
		clickElementUsingJavaScript(enoHereLink);
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

	public void clickLivingLifeAcidityImg() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(clickRefernce);
		clickElementUsingJavaScript(livingLifeAcidityImg);
		pageLoad();
	}

	public void clickLivingLifeAcidityText() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(clickRefernce);
		clickElementUsingJavaScript(livingLifeAcidityText);
		pageLoad();
	}

	public void clickLivingLifeAcidityPara() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(clickRefernce);
		clickElementUsingJavaScript(livingLifeAcidityPara);
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
