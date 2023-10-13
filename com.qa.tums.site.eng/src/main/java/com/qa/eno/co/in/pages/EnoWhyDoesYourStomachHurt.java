package com.qa.eno.co.in.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class EnoWhyDoesYourStomachHurt extends BaseClass{

	public EnoWhyDoesYourStomachHurt() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='PREVIOUS']")
	private static WebElement Previous;
	
	@FindBy(xpath = "//a[text()='NEXT']")
	private static WebElement Next;
	
	@FindBy(xpath = "(//a[text()='here'])[1]")
	private static WebElement HereLink1;
	
	@FindBy(xpath = "(//a[text()='here'])[2]")
	private static WebElement HereLink2;
	
	@FindBy(xpath = "(//li[@class='accordion-slide first last odd'])[1]")
	private static WebElement referencesClosed;
	
	@FindBy(xpath = "(//li[@class='accordion-slide first last odd is-active'])")
	private static WebElement ReferenceOpen;
	
	@FindBy(xpath = "//img[@title='Gas Relief']/../..")
	private static WebElement GasReliefArticle;
	
	@FindBy(xpath = "//img[@title='Acidity and Heartburn']/../..")
	private static WebElement UnderstandingAcidityArticle;
	
	
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
	}
	public void clickonNext() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(Next);
		clickElementUsingJavaScript(Next);
	}
	public void clickonHereLink1() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(HereLink1);
		clickElementUsingJavaScript(HereLink1);
	}
	public void clickonHereLink2() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(HereLink2);
		clickElementUsingJavaScript(HereLink2);
	}
	public void clickonReferences() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(referencesClosed);
		elementClick(referencesClosed);
		ReferenceOpen.isDisplayed();
		System.out.println("references is open Now");
		elementClick(ReferenceOpen);
		referencesClosed.isDisplayed();
		System.out.println("references is closed now");
		
	}
	public void clickonGasReliefArticle() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(GasReliefArticle);
		clickElementUsingJavaScript(GasReliefArticle);
	}
	public void clickonUnderstandingAcidityArticle() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(UnderstandingAcidityArticle);
		clickElementUsingJavaScript(UnderstandingAcidityArticle);
	}

}
