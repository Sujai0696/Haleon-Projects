package com.qa.eno.co.in.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class EnoAllAboutAcidity extends BaseClass{
	public EnoAllAboutAcidity() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//figure//a[@title='Understanding Acidity']/..")
	private static WebElement UnderstandingAcidity;
	
	@FindBy(xpath = "//figure//a[@title='Heartburn During Pregnancy']/..")
	private static WebElement HeartburnDuringPregnancy;
	
	@FindBy(xpath = "//figure//a[@title='Dealing With Acidity At Night']/..")
	private static WebElement DealingWithAcidityAtNight;
	
	@FindBy(xpath = "//figure//a[@title='Home Remedies for Acidity']/..")
	private static WebElement HomeRemediesforAcidity;
	
	@FindBy(xpath = "//figure//a[@title='Living life acidity free']/..")
	private static WebElement LivingLifeAcidityFree;
	
	@FindBy(xpath = "//a[text()='LEARN MORE' and @title='Understanding Acidity']")
	private static WebElement LearnMore;
	
	
	
	
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
	


	public void clickonUnderstandingAcidity() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(UnderstandingAcidity);
		clickElementUsingJavaScript(UnderstandingAcidity);
	}
	public void clickonHeartburnDuringPregnancy() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(HeartburnDuringPregnancy);
		clickElementUsingJavaScript(HeartburnDuringPregnancy);
	}
	public void clickonDealingWithAcidityAtNight() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(DealingWithAcidityAtNight);
		clickElementUsingJavaScript(DealingWithAcidityAtNight);
	}
	public void clickonHomeRemediesforAcidity() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(HomeRemediesforAcidity);
		clickElementUsingJavaScript(HomeRemediesforAcidity);
	}
	public void clickonLivingLifeAcidityFree() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(LivingLifeAcidityFree);
		clickElementUsingJavaScript(LivingLifeAcidityFree);
	}
	public void clickonLearnMore() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(LearnMore);
		clickElementUsingJavaScript(LearnMore);
	}
	
}
