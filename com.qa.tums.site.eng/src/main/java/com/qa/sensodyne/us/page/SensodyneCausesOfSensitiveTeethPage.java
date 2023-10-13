package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneCausesOfSensitiveTeethPage extends BaseClass{
	
	public SensodyneCausesOfSensitiveTeethPage() {
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
	
	@FindBy(xpath = "//a[text()='enamel wear']")
	private static WebElement enamelWearLink;
	
	@FindBy(xpath = "//a[text()='gum recession']")
	private static WebElement gumRecession;
	
	@FindBy(xpath = "//a[text()='acidic foods and drinks']")
	private static WebElement acidicFoodsAndDrinks;
	
	@FindBy(xpath = "//a[text()='specially formulated']")
	private static WebElement speciallyFormulated;
	
	@FindBy(xpath = "//*[@class='btn']//self::a[text()='Explore Our Products']")
	private static WebElement exploreOurProducts;
	
	@FindBy(xpath = "//a[text()='Can You Brush Your Teeth Too Hard?']")
	private static WebElement relatedArticleOne;
	
	@FindBy(xpath = "//a[text()='5 Oral Health Tips Everyone Should Follow']")
	private static WebElement relatedArticleTwo;
	
	@FindBy(xpath = "//a[text()='Should You Change Your Toothpaste Over Time?']")
	private static WebElement relatedArticleThree;
	
	@FindBy(xpath = "//a[text()='What I Decided to Do About My Tooth Sensitivity']")
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
	
	public void clickEnamelWearLink() throws Exception{
		scrollDownUsingElement(enamelWearLink);
		clickElementUsingJavaScript(enamelWearLink);
		waitForPageLoadJava();
	}
	
	public void clickGumRecession() throws Exception{
		scrollDownUsingElement(gumRecession);
		clickElementUsingJavaScript(gumRecession);
		waitForPageLoadJava();
	}
	
	public void clickAcidicFoodsAndDrinks() throws Exception{
		scrollDownUsingElement(acidicFoodsAndDrinks);
		clickElementUsingJavaScript(acidicFoodsAndDrinks);
		waitForPageLoadJava();
	}
	
	public void clickSpeciallyFormulated() throws Exception{
		scrollDownUsingElement(speciallyFormulated);
		clickElementUsingJavaScript(speciallyFormulated);
		waitForPageLoadJava();
	}
	
	public void clickExploreOurProducts() throws Exception{
		scrollDownUsingElement(exploreOurProducts);
		clickElementUsingJavaScript(exploreOurProducts);
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
