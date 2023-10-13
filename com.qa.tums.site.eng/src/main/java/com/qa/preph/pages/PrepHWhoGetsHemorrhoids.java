package com.qa.preph.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class PrepHWhoGetsHemorrhoids extends BaseClass{
	public PrepHWhoGetsHemorrhoids() {
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
	
	@FindBy(xpath = "//a[text()='Hemorrhoids']")
	private static WebElement Hemorrhoids;
	
	@FindBy(xpath = "//a[text()='type of hemorrhoids']")
	private static WebElement TypeOfHemorrhoids;
	
	@FindBy(xpath = "(//a[text()='after giving birth'])")
	private static WebElement AfterGivingBirth;
	
	@FindBy(xpath = "//a[text()='home remedies']")
	private static WebElement HomeRemedies;
	
	@FindBy(xpath = "//a[text()='exercising']")
	private static WebElement Exercising;
	
	@FindBy(xpath = "(//a[text()='high-fiber foods'])")
	private static WebElement HighFiberFoods;
	
	@FindBy(xpath = "//a[text()='Preparation H Soothing Relief Cooling Spray']")
	private static WebElement PreparationHSoothingReliefCoolingSpray;
	
	@FindBy(xpath = "//a[text()='Preparation H Soothing Relief Anti-Itch Cream']")
	private static WebElement PreparationHSoothingReliefAntiItchCream;
	
	@FindBy(xpath = "(//a[text()='Preparation H Rapid Relief Totable Wipes'])")
	private static WebElement PreparationHRapidReliefTotableWipes;
	
	@FindBy(xpath = "//a[text()='relieving hemorrhoid symptoms']")
	private static WebElement RelievingHemorrhoidSymptoms;
		
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
	public void clickHemorrhoids() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(Hemorrhoids);
		clickElementUsingJavaScript(Hemorrhoids);
	}
	public void clickTypeOfHemorrhoids() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(TypeOfHemorrhoids);
		clickElementUsingJavaScript(TypeOfHemorrhoids);
	}
	public void clickAfterGivingBirth() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(AfterGivingBirth);
		clickElementUsingJavaScript(AfterGivingBirth);
	}
	public void clickExercising() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(Exercising);
		clickElementUsingJavaScript(Exercising);
	}
	public void clickHomeRemedies() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(HomeRemedies);
		clickElementUsingJavaScript(HomeRemedies);
	}
	public void clickHighFiberFoods() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(HighFiberFoods);
		clickElementUsingJavaScript(HighFiberFoods);
	}
	public void clickPreparationHSoothingReliefCoolingSpray() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(PreparationHSoothingReliefCoolingSpray);
		clickElementUsingJavaScript(PreparationHSoothingReliefCoolingSpray);
	}
	public void clickPreparationHSoothingReliefAntiItchCream() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(PreparationHSoothingReliefAntiItchCream);
		clickElementUsingJavaScript(PreparationHSoothingReliefAntiItchCream);
	}
	public void clickPreparationHRapidReliefTotableWipes() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(PreparationHRapidReliefTotableWipes);
		clickElementUsingJavaScript(PreparationHRapidReliefTotableWipes);
	}
	public void clickRelievingHemorrhoidSymptoms() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(RelievingHemorrhoidSymptoms);
		clickElementUsingJavaScript(RelievingHemorrhoidSymptoms);
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
