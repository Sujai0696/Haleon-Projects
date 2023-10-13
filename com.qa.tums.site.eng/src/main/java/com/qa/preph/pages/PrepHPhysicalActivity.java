package com.qa.preph.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class PrepHPhysicalActivity extends BaseClass{
	public PrepHPhysicalActivity() {
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
	
	@FindBy(xpath = "//a[text()='flare-ups and new hemorrhoids']")
	private static WebElement flareupsAndNewHemorrhoids;
	
	@FindBy(xpath = "//a[text()='reduce your risk of flare-ups']")
	private static WebElement ReduceYourRiskOfFlareUps;
	
	@FindBy(xpath = "//a[text()='“Hemorrhoids and what to do about them.”']")
	private static WebElement HemorrhoidsAndWhattoDoAboutThem;
	
	@FindBy(xpath = "//a[text()='reduce your symptoms']")
	private static WebElement ReduceYourSymptoms;
	
	@FindBy(xpath = "//a[text()='prevent constipation']")
	private static WebElement PreventConstipation;
	
	
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
	public void clickflareupsAndNewHemorrhoids() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(flareupsAndNewHemorrhoids);
		clickElementUsingJavaScript(flareupsAndNewHemorrhoids);
	}
	public void clickReduceYourRiskOfFlareUps() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(ReduceYourRiskOfFlareUps);
		clickElementUsingJavaScript(ReduceYourRiskOfFlareUps);
	}
	public void clickHemorrhoidsAndWhattoDoAboutThem() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(HemorrhoidsAndWhattoDoAboutThem);
		clickElementUsingJavaScript(HemorrhoidsAndWhattoDoAboutThem);
	}
	public void clickReduceYourSymptoms() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(ReduceYourSymptoms);
		clickElementUsingJavaScript(ReduceYourSymptoms);
	}
	public void clickPreventConstipation() throws Exception{
		waitForPageLoadJava();
		//scrollDownUsingElement(PreventConstipation);
		clickElementUsingJavaScript(PreventConstipation);
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
