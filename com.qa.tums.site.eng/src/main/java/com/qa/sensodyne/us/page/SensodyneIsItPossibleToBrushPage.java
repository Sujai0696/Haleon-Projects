package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneIsItPossibleToBrushPage extends BaseClass{
	
	public SensodyneIsItPossibleToBrushPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage gigya-heading first odd component col-xs-12 active']")
	private static WebElement gigyaForm;

	@FindBy(xpath = "//div[contains(@class,'content_hide')]")
	private static WebElement gigyaClose;
	
	@FindBy(xpath = "//*[@class='btn']//self::a[text()='Back to the article list']")
	private static WebElement backToArticleList;
	
	@FindBy(xpath = "//a[text()='Dr. Jonathan B. Levine']")
	private static WebElement jonathanLink;
	
	@FindBy(xpath = "//a[text()='Sensodyne Rapid Relief']")
	private static WebElement sensodyneRapidReleif;
	
	@FindBy(xpath = "//a[text()='Can You Brush Your Teeth Too Hard?']")
	private static WebElement relatedArticleOne;
	
	@FindBy(xpath = "//a[text()='Oral Health Tips We Should All Be Following']")
	private static WebElement relatedArticleTwo;
	
	@FindBy(xpath = "//a[text()='What I Decided to Do About My Tooth Sensitivity']")
	private static WebElement relatedArticleThree;
	
	@FindBy(xpath = "//a[text()='Should You Change Your Toothpaste Over Time?']")
	private static WebElement relatedArticleFour;
	
	
	
	
	public void clickCookieBtn() throws Exception {
		if (isElementPresent(cookieBtn)) {
			elementToBeClickable(cookieBtn);
			try {
				if (cookieBtn.isDisplayed()) {
					elementClick(cookieBtn);
				}
				implicitWait();
				Assert.assertTrue(elementIsDisplayed(cookieClose));
			} catch (Exception e) {
			}
		}else {
			System.out.println("Dismiss is not presented");
		}
	}

	public void clickGigyaForm() throws Exception {
		if (isElementPresent(gigyaForm)) {
			elementToBeClickable(gigyaForm);
			try {
				if (gigyaForm.isDisplayed()) {
					elementClick(gigyaForm);
				}
				implicitWait();
				Assert.assertTrue(elementIsDisplayed(gigyaClose));
			} catch (Exception e) {
			}
		} else {
			System.out.println("gigya is not presented");
		}
	}
	
	public void clickBackToTheArticleList() throws Exception{
		scrollDownUsingElement(backToArticleList);
		clickElementUsingJavaScript(backToArticleList);
	}
	
	public void clickJonathanLink() throws Exception{
		scrollDownUsingElement(jonathanLink);
//		clickElementUsingJavaScript(jonathanLink);
//		elementClick(jonathanLink);
		actionClick(jonathanLink);
		Thread.sleep(3000);
	}
	
	
	public void clickSensodyneRapidRelif() throws Exception{
		scrollDownUsingElement(sensodyneRapidReleif);
		clickElementUsingJavaScript(sensodyneRapidReleif);
		waitForPageLoadJava();
	}
	
	public void clickRelatedArticleOne() throws Exception{
		scrollDownUsingElement(relatedArticleOne);
		clickElementUsingJavaScript(relatedArticleOne);
		waitForPageLoadJava();
	}
	
	public void clickRelatedArticleTwo() throws Exception{
		scrollDownUsingElement(relatedArticleTwo);
		clickElementUsingJavaScript(relatedArticleTwo);
		waitForPageLoadJava();
	}
	
	public void clickRelatedArticleThree() throws Exception{
		scrollDownUsingElement(relatedArticleThree);
		clickElementUsingJavaScript(relatedArticleThree);
		waitForPageLoadJava();
	}
	
	public void clickRelatedArticleFour() throws Exception{
		scrollDownUsingElement(relatedArticleFour);
		clickElementUsingJavaScript(relatedArticleFour);
		waitForPageLoadJava();
	}
	

}
