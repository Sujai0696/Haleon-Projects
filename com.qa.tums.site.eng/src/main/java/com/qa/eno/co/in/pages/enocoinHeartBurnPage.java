package com.qa.eno.co.in.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class enocoinHeartBurnPage extends BaseClass{
	
	public enocoinHeartBurnPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "(//div[@class='image component section article-list__item category_acidity first odd col-xs-12 col-md-6']//child::a[@href='/all-about-acidity/heartburn/understanding-heartburn/'])[1]")
		private static WebElement understandingHeartburn;
		
		@FindBy(xpath = "//h1[text()='Understanding Heartburn']")
		private static WebElement understandingHeartburntxt;
	
		@FindBy(xpath = "(//div[@class='image component section article-list__item category_acidity even col-xs-12 col-md-3']//child::a[@href='/all-about-acidity/heartburn/initial-symptoms-of-heartburn/'])[1]")
		private static WebElement InitialSymptoms;
	
		@FindBy(xpath = "//h1[text()='Initial Symptoms']")
		private static WebElement InitialSymptomstxt;
	
		@FindBy(xpath = "//div[@class='image component section article-list__item category_acidity odd last col-xs-12 col-md-3']//child::a[@href='/all-about-acidity/heartburn/home-remedies-for-heartburn/']")
		private static WebElement HomeRemedies;
	
		@FindBy(xpath = "//h1[text()='Home Remedies']")
		private static WebElement HomeRemediestxt;
	
		//next slider//
		
		//Slider Section//
		
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
		
		public void clickonUnderstandingHeartburn() throws Exception {
		waitForPageLoadJava();
		clickElementUsingJavaScript(understandingHeartburn);
//		visibilityOf(understandingHeartburn);
//		boolean elementIsDisplayed=elementIsDisplayed(understandingHeartburn);
//		Assert.assertTrue(elementIsDisplayed);
//		System.out.println(getElementText(understandingHeartburn));
		pageLoad();
		}
		public void clickonInitialSymptoms() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(InitialSymptoms);
			visibilityOf(InitialSymptomstxt);
			boolean elementIsDisplayed=elementIsDisplayed(InitialSymptomstxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(InitialSymptomstxt));
			pageLoad();
			}
		public void clickonHomeRemedies() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(HomeRemedies);
			visibilityOf(HomeRemediestxt);
			boolean elementIsDisplayed=elementIsDisplayed(HomeRemediestxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(HomeRemediestxt));
			pageLoad();
			}
		//next slider//
		//slidersection//
		
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
