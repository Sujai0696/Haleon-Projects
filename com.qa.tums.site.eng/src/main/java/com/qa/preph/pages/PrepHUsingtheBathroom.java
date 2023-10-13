package com.qa.preph.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class PrepHUsingtheBathroom extends BaseClass{
	public PrepHUsingtheBathroom() {
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
	
	@FindBy(xpath = "//a[text()='relief from your hemorrhoids']")
	private static WebElement ReliefFromYourHemorrhoids;
	
	@FindBy(xpath = "//a[text()='hemorrhoids']")
	private static WebElement Hemorrhoids;
	
	@FindBy(xpath = "(//a[text()='Constipation'])")
	private static WebElement Constipation;
	
	@FindBy(xpath = "//a[text()='causes of hemorrhoid flare-ups']")
	private static WebElement CausesOfHemorrhoidFlareUps;
	
	@FindBy(xpath = "//a[text()='high-fiber diet']")
	private static WebElement HighFiberDiet;
	
	@FindBy(xpath = "(//a[text()='exercise'])")
	private static WebElement Exercise;
	
	@FindBy(xpath = "(//a[text()='PREPARATION H Medicated Wipes'])[1]")
	private static WebElement PREPARATIONHMedicatedWipes1;
	
	@FindBy(xpath = "//a[text()='reduce irritation']")
	private static WebElement ReduceIrritation;
	
	@FindBy(xpath = "(//a[text()='PREPARATION H Medicated Wipes'])[2]")
	private static WebElement PREPARATIONHMedicatedWipes2;
	
	@FindBy(xpath = "(//a[text()='PREPARATION H Medicated Wipes'])[3]")
	private static WebElement PREPARATIONHMedicatedWipes3;
	
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
	public void clickReliefFromYourHemorrhoids() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(ReliefFromYourHemorrhoids);
		clickElementUsingJavaScript(ReliefFromYourHemorrhoids);
	}
	public void clickHemorrhoids() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(Hemorrhoids);
		clickElementUsingJavaScript(Hemorrhoids);
	}
	public void clickConstipation() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(Constipation);
		clickElementUsingJavaScript(Constipation);
	}
	public void clickCausesOfHemorrhoidFlareUps() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(CausesOfHemorrhoidFlareUps);
		clickElementUsingJavaScript(CausesOfHemorrhoidFlareUps);
	}
	public void clickHighFiberDiet() throws Exception{
		waitForPageLoadJava();
		//scrollDownUsingElement(PreventConstipation);
		clickElementUsingJavaScript(HighFiberDiet);
	}
	public void clickExercise() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(Exercise);
		clickElementUsingJavaScript(Exercise);
	}
	public void clickPREPARATIONHMedicatedWipes1() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(PREPARATIONHMedicatedWipes1);
		clickElementUsingJavaScript(PREPARATIONHMedicatedWipes1);
	}
	public void clickReduceIrritation() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(ReduceIrritation);
		clickElementUsingJavaScript(ReduceIrritation);
	}
	public void clickPREPARATIONHMedicatedWipes2() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(PREPARATIONHMedicatedWipes2);
		clickElementUsingJavaScript(PREPARATIONHMedicatedWipes2);
	}
	public void clickPREPARATIONHMedicatedWipes3() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(PREPARATIONHMedicatedWipes3);
		clickElementUsingJavaScript(PREPARATIONHMedicatedWipes3);
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
