package com.qa.preph.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class PrepHWhatAreHemorrhoids extends BaseClass{
	public PrepHWhatAreHemorrhoids() {
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
	
	@FindBy(xpath = "//a[text()='* Harvard Health Publications. “']")
	private static WebElement HarvardHealthPublications;
	
	@FindBy(xpath = "//a[text()='Flare-ups']")
	private static WebElement FlareUps;
	
	@FindBy(xpath = "(//a[text()='relief from flare-up symptoms with PREPARATION H products'])")
	private static WebElement reliefFromFlareUpSymptomsWithPREPARATIONHProducts;
	
	@FindBy(xpath = "//a[text()='exercising']")
	private static WebElement Exercising;
	
	@FindBy(xpath = "//a[text()='high-fiber diet']")
	private static WebElement HighFiberDiet;
	
	@FindBy(xpath = "(//a[text()='manage your symptoms'])")
	private static WebElement ManageYourSymptoms;
	
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
	public void clickHarvardHealthPublications() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(HarvardHealthPublications);
		clickElementUsingJavaScript(HarvardHealthPublications);
	}
	public void clickFlareUps() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(FlareUps);
		clickElementUsingJavaScript(FlareUps);
	}
	public void clickreliefFromFlareUpSymptomsWithPREPARATIONHProducts() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(reliefFromFlareUpSymptomsWithPREPARATIONHProducts);
		clickElementUsingJavaScript(reliefFromFlareUpSymptomsWithPREPARATIONHProducts);
	}
	public void clickExercising() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(Exercising);
		clickElementUsingJavaScript(Exercising);
	}
	public void clickHighFiberDiet() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(HighFiberDiet);
		clickElementUsingJavaScript(HighFiberDiet);
	}
	public void clickManageYourSymptoms() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(ManageYourSymptoms);
		clickElementUsingJavaScript(ManageYourSymptoms);
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
