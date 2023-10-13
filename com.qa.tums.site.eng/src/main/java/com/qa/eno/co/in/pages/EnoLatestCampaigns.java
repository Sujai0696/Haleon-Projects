package com.qa.eno.co.in.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class EnoLatestCampaigns extends BaseClass{
	public EnoLatestCampaigns() {
		PageFactory.initElements(driver, this);
	}
	
	
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

}
