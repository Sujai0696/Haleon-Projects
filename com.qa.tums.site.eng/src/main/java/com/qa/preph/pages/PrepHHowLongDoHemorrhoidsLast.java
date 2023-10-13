package com.qa.preph.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class PrepHHowLongDoHemorrhoidsLast extends BaseClass{
	public PrepHHowLongDoHemorrhoidsLast() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "//a[text()='Homepage (US)']")
	private static WebElement BreadHome;

	@FindBy(xpath = "//a[text()='Articles']")
	private static WebElement BreadArticles;
	
	@FindBy(xpath = "//a[text()='Eat a diet that’s high in fiber']")
	private static WebElement EataDietThatsHighInFiber;
	
	@FindBy(xpath = "//a[text()='Exercise more']")
	private static WebElement ExerciseMore;
	
	@FindBy(xpath = "//a[text()='Adopt healthy bathroom habits']")
	private static WebElement AdoptHealthyBathroomHabits;
	
	@FindBy(xpath = "//a[text()='Learn how to treat flare ups']")
	private static WebElement LearnHowToTreatFlareUps;
	
	@FindBy(xpath = "//a[text()='Find out which product is best for you']")
	private static WebElement FindOutWhichProductIsBestForYou;
	
	@FindBy(xpath = "//a[text()='The Emotional Toll of Hemorrhoids']")
	private static WebElement Article1;
	
	@FindBy(xpath = "//a[text()='What Are Hemorrhoids?']")
	private static WebElement Article2;
	
	@FindBy(xpath = "//a[text()='6 Reasons You Have an Itchy Butt']")
	private static WebElement Article3;
	
	public void clickCookieBtn() throws Exception {
		elementToBeClickable(cookieBtn);
		try {
			if (cookieBtn.isDisplayed()) {
				elementClick(cookieBtn);
			}
		} catch (NoSuchElementException e) {

		}
	}
	public void clickBreadHome() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(BreadHome);
		clickElementUsingJavaScript(BreadHome);
	}
	public void clickBreadArticles() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(BreadArticles);
		clickElementUsingJavaScript(BreadArticles);
	}
	public void clickEataDietThatsHighInFiber() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(EataDietThatsHighInFiber);
		clickElementUsingJavaScript(EataDietThatsHighInFiber);
	}
	public void clickExerciseMore() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(ExerciseMore);
		clickElementUsingJavaScript(ExerciseMore);
	}
	public void clickAdoptHealthyBathroomHabits() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(AdoptHealthyBathroomHabits);
		clickElementUsingJavaScript(AdoptHealthyBathroomHabits);
	}
	public void clickLearnHowToTreatFlareUps() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(LearnHowToTreatFlareUps);
		clickElementUsingJavaScript(LearnHowToTreatFlareUps);
	}
	public void clickFindOutWhichProductIsBestForYou() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(FindOutWhichProductIsBestForYou);
		clickElementUsingJavaScript(FindOutWhichProductIsBestForYou);
	}
	public void clickArticle1() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(Article1);
		clickElementUsingJavaScript(Article1);
	}
	public void clickArticle2() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(Article2);
		clickElementUsingJavaScript(Article2);
	}
	public void clickArticle3() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(Article3);
		clickElementUsingJavaScript(Article3);
	}
	
}
