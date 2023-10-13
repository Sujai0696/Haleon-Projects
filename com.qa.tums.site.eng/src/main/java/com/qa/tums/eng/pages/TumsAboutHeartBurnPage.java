package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class TumsAboutHeartBurnPage extends BaseClass {

	public TumsAboutHeartBurnPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//a[text()='TUMS Home']")
	private static WebElement breadCrumbHome;
	
	@FindBy(xpath = "//img[@title='Man Holding Chest']//following::a[text()='Heartburn Symptoms']")
	private static WebElement hearburnSymptoms;
	
	@FindBy(xpath = "//img[@title='Foods That Cause Heartburn']//following::a[text()='Heartburn Causes']")
	private static WebElement heartburnCauses;
	
	@FindBy(xpath = "//img[@title='Woman Smiling']//following::a[text()='Finding Relief']")
	private static WebElement findingRelief;
	
	@FindBy(xpath = "//img[@title='Pregnant woman']//following::a[text()='Tums & Pregnancy']")
	private static WebElement tumsAndPregnancy;
	
	@FindBy(xpath = "//a[text()='Heartburn Symptoms']//preceding::img[@title='Man Holding Chest']")
	private static WebElement hearburnSymptomsImg;
	
	@FindBy(xpath = "//a[text()='Heartburn Causes']//preceding::img[@title='Foods That Cause Heartburn']")
	private static WebElement heartburnCausesImg;
	
	@FindBy(xpath = "//a[text()='Finding Relief']//preceding::img[@title='Woman Smiling']")
	private static WebElement findingReliefImg;
	
	@FindBy(xpath = "//a[text()='Tums & Pregnancy']//preceding::img[@title='Pregnant woman']")
	private static WebElement tumsAndPregnancyImg;
	
	
	@FindBy(xpath = "//img[@title='Woman Holding Stomach']//following::a[text()='How Do I Know If This Is Heartburn?']")
	private static WebElement relatedArticleOne;
	
	@FindBy(xpath = "//img[@title='Image of a bottle of TUMS Smoothies Product along with cut oranges and limes']//following::a[text()='How Does TUMS Work?']")
	private static WebElement relatedArticleTwo;
	
	@FindBy(xpath = "//img[@title='Yoga Class']//following::a[text()='What Behaviors Can Trigger Heartburn?']")
	private static WebElement relatedArticleThree;
	
	@FindBy(xpath = "//img[@title='Woman with heartburn, hand on her chest']//following::a[text()='The Signs of Severe Heartburn']")
	private static WebElement relatedArticleFour;
	
	@FindBy(xpath = "//img[@title='Man Experiencing Stomach Pain']//following::a[text()='What Causes Heartburn? A Checklist']")
	private static WebElement relatedArticleFive;
	
	@FindBy(xpath = "//img[@title='double deluxe cheeseburger and french fries']//following::a[text()='How You Can Reduce Heartburn']")
	private static WebElement relatedArticleSix;
	
	@FindBy(xpath = "//img[@title='Woman with both hands on her chest in distress']//following::a[text()='Acid Reflux vs. GERD']")
	private static WebElement relatedArticleSeven;
	
	@FindBy(xpath = "//img[@title='Pizza & Juice']//following::a[text()='Antacids And Why They Work']")
	private static WebElement relatedArticleEight;
	
	@FindBy(id = "seeproducts-link")
	private static WebElement seeProducts;
	
	
	
	
	public void clickCookieBtn() throws Exception {
		if (isElementPresent(cookieBtn)) {
			elementToBeClickable(cookieBtn);
			try {
				if (cookieBtn.isDisplayed()) {
					clickElementUsingJavaScript(cookieBtn);
				}
				implicitWait();
				Assert.assertTrue(elementIsDisplayed(cookieClose));
			} catch (Exception e) {
			}
		}else {
			System.out.println("Dismiss is not presented");
		}
	}
	
	
	
	public void clickBreadCrumbHome() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(breadCrumbHome);
		clickElementUsingJavaScript(breadCrumbHome);
	}
	
	public void clickHearburnSymptoms() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(hearburnSymptoms);
		clickElementUsingJavaScript(hearburnSymptoms);
	}
	
	public void clickHeartburnCauses() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(heartburnCauses);
		clickElementUsingJavaScript(heartburnCauses);
	}
	
	public void clickFindingRelief() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(findingRelief);
		clickElementUsingJavaScript(findingRelief);
	}
	
	
	public void clickTumsAndPregnancy() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(tumsAndPregnancy);
		clickElementUsingJavaScript(tumsAndPregnancy);
	}
	
	public void clickHearburnSymptomsImg() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(hearburnSymptomsImg);
		clickElementUsingJavaScript(hearburnSymptomsImg);
	}
	
	public void clickHeartburnCausesImg() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(heartburnCausesImg);
		clickElementUsingJavaScript(heartburnCausesImg);
	}
	
	public void clickFindingReliefImg() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(findingReliefImg);
		clickElementUsingJavaScript(findingReliefImg);
	}
	
	
	public void clickTumsAndPregnancyImg() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(tumsAndPregnancyImg);
		clickElementUsingJavaScript(tumsAndPregnancyImg);
	}
	
	public void clickRelatedArticleOne() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(relatedArticleOne);
		clickElementUsingJavaScript(relatedArticleOne);
	}
	
	public void clickRelatedArticleTwo() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(relatedArticleTwo);
		clickElementUsingJavaScript(relatedArticleTwo);
	}
	
	public void clickRelatedArticleThree() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(relatedArticleThree);
		clickElementUsingJavaScript(relatedArticleThree);
	}
	
	public void clickRelatedArticleFour() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(relatedArticleFour);
		clickElementUsingJavaScript(relatedArticleFour);
	}
	
	public void clickRelatedArticleFive() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(relatedArticleFive);
		clickElementUsingJavaScript(relatedArticleFive);
	}
	
	public void clickRelatedArticleSix() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(relatedArticleSix);
		clickElementUsingJavaScript(relatedArticleSix);
	}
	
	public void clickRelatedArticleSeven() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(relatedArticleSeven);
		clickElementUsingJavaScript(relatedArticleSeven);
	}
	
	public void clickRelatedArticleEight() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(relatedArticleEight);
		clickElementUsingJavaScript(relatedArticleEight);
	}
	
	public void clickSeeProducts() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(seeProducts);
		clickElementUsingJavaScript(seeProducts);
	}
	
}
