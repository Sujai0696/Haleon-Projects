package com.qa.preph.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class PrepHJustforMoms extends BaseClass{
	public PrepHJustforMoms() {
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
	
	@FindBy(xpath = "//a[text()='causes hemorrhoids']")
	private static WebElement CausesHemorrhoids;
	
	@FindBy(xpath = "//a[text()='Medicated Wipes for Women']")
	private static WebElement MedicatedWipesforWomen;
	
	@FindBy(xpath = "(//a[text()='reducing your risk of hemorrhoid flare-ups'])")
	private static WebElement ReducingYourRiskOfHemorrhoidFlareUps;
	
	@FindBy(xpath = "//a[text()='follow a balanced diet']")
	private static WebElement FollowABalancedDiet;
	
	@FindBy(xpath = "//a[text()='What Are Hemorrhoids?']")
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
	public void clickCausesHemorrhoids() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(CausesHemorrhoids);
		clickElementUsingJavaScript(CausesHemorrhoids);
	}
	public void clickMedicatedWipesforWomen() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(MedicatedWipesforWomen);
		clickElementUsingJavaScript(MedicatedWipesforWomen);
	}
	public void clickReducingYourRiskOfHemorrhoidFlareUps() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(ReducingYourRiskOfHemorrhoidFlareUps);
		clickElementUsingJavaScript(ReducingYourRiskOfHemorrhoidFlareUps);
	}
	public void clickFollowABalancedDiet() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(FollowABalancedDiet);
		clickElementUsingJavaScript(FollowABalancedDiet);
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
