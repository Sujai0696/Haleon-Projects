package com.qa.eno.co.in.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class EnoTheEnoJourney extends BaseClass{
	public EnoTheEnoJourney() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@title='What is ENO?']/..")
	private static WebElement WhatisEno;
	
	@FindBy(xpath = "(//a[@title='The ENO Journey'])[3]/..")
	private static WebElement TheENOJourney;

	@FindBy(xpath = "(//li[@class='accordion-slide first last odd'])[1]")
	private static WebElement referencesClosed;
	
	@FindBy(xpath = "//li[@class='accordion-slide first last odd is-active']")
	private static WebElement ReferenceOpen;
	
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
	
	
	public void clickonWhatisEno() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(WhatisEno);
		clickElementUsingJavaScript(WhatisEno);
	}
	public void clickonTheENOJourney() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(TheENOJourney);
		clickElementUsingJavaScript(TheENOJourney);
	}
	
	public void clickonReferences() throws Exception {
		waitForPageLoadJava();
		Thread.sleep(5);
		scrollDownUsingElement(referencesClosed);
		elementClick(referencesClosed);
		ReferenceOpen.isDisplayed();
		System.out.println("references is open Now");
		clickElementUsingJavaScript(ReferenceOpen);
		referencesClosed.isDisplayed();
		System.out.println("references is closed now");
		
	}

}
