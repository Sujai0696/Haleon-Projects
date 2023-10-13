package com.qa.preph.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class PrepHHemorrhoidDiet extends BaseClass{
	public PrepHHemorrhoidDiet() {
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
	
	@FindBy(xpath = "//a[text()='hemorrhoids']")
	private static WebElement Hemorrhoids;
	
	@FindBy(xpath = "//a[text()='cause hemorrhoids']")
	private static WebElement CauseHemorrhoids;
	
	@FindBy(xpath = "//a[text()='symptoms from existing hemorrhoids']")
	private static WebElement SymptomsFromExistingHemorrhoids;
	
	@FindBy(xpath = "//a[text()='exercise plan']")
	private static WebElement ExercisePlan;
	
	@FindBy(xpath = "//a[text()='common causes of constipation']")
	private static WebElement CommonCausesOfConstipation;
	
	@FindBy(xpath = "//a[text()='See the High Fiber Food Chart']")
	private static WebElement SeeTheHighFiberFoodChart;
	
	@FindBy(xpath = "//a[text()='delicious recipes']")
	private static WebElement DeliciousRecipes;
	
	@FindBy(xpath = "//a[text()='Treating Flare-Ups While Away From Home']")
	private static WebElement TreatingFlareUpsWhileAwayFromHome;
	
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
	public void clickHemorrhoids() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(Hemorrhoids);
		clickElementUsingJavaScript(Hemorrhoids);
	}
	public void clickCauseHemorrhoids() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(CauseHemorrhoids);
		clickElementUsingJavaScript(CauseHemorrhoids);
	}
	public void clickSymptomsFromExistingHemorrhoids() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(SymptomsFromExistingHemorrhoids);
		clickElementUsingJavaScript(SymptomsFromExistingHemorrhoids);
	}
	public void clickExercisePlan() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(ExercisePlan);
		clickElementUsingJavaScript(ExercisePlan);
	}
	public void clickCommonCausesOfConstipation() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(CommonCausesOfConstipation);
		clickElementUsingJavaScript(CommonCausesOfConstipation);
	}
	public void clickSeeTheHighFiberFoodChart() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(SeeTheHighFiberFoodChart);
		clickElementUsingJavaScript(SeeTheHighFiberFoodChart);
	}
	public void clickDeliciousRecipes() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(DeliciousRecipes);
		clickElementUsingJavaScript(DeliciousRecipes);
	}
	public void clickTreatingFlareUpsWhileAwayFromHome() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(TreatingFlareUpsWhileAwayFromHome);
		clickElementUsingJavaScript(TreatingFlareUpsWhileAwayFromHome);
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
