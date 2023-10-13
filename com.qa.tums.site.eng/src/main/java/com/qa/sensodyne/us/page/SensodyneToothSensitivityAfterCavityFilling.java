package com.qa.sensodyne.us.page;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class SensodyneToothSensitivityAfterCavityFilling extends BaseClass {
	public SensodyneToothSensitivityAfterCavityFilling() {
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

	@FindBy(xpath = "//a[text()='Back to the article list']")
	private static WebElement BackToTheArticleList;
	
	@FindBy(xpath = "//a[text()='Christine Frank, DDS']")
	private static WebElement ChristineFrankDDS;
	
	@FindBy(xpath = "//a[text()='causing pulpitis']")
	private static WebElement CausingPulpitis;
	
	@FindBy(xpath = "//a[text()='slightly changed your bite']")
	private static WebElement SlightlyChangedYourBite;
	
	@FindBy(xpath = "//a[text()='Other reasons']")
	private static WebElement OtherReasons;
	
	@FindBy(xpath = "//a[text()='go away entirely in two to four weeks']")
	private static WebElement GoAwayEntirely;
	
	@FindBy(xpath = "//a[text()='nonsteroidal anti-inflammatory']")
	private static WebElement NonsteroidalAntiInflammatory;
	
	@FindBy(xpath = "//a[text()='This kind of tooth sensitivity can be treated']")
	private static WebElement ThisKindOfTooth;
	
	@FindBy(xpath = "//a[text()='Sensodyne Rapid Relief']")
	private static WebElement SensodyneRapidRelief;
	
	@FindBy(xpath = "//a[text()=\"5 Oral Health Tips Everyone Should Follow\"]")
	private static WebElement relatedArticleOne;
	
	@FindBy(xpath = "//a[text()=\"My Teeth Hurt; What Should I Do?\"]")
	private static WebElement relatedArticleTwo;
	
	@FindBy(xpath = "//a[text()='Health Issues to Address Right Away']")
	private static WebElement relatedArticleThree;
	
	@FindBy(xpath = "//a[text()=\"Can You Brush Your Teeth Too Hard?\"]")
	private static WebElement relatedArticleFour;
	
	
	public void clickCookieBtn() throws Exception {
		elementToBeClickable(cookieBtn);
		try {
			if (cookieBtn.isDisplayed()) {
				elementClick(cookieBtn);
			}
		} catch (NoSuchElementException e) {

		}
	}

	public void clickGigyaForm() throws Exception {
		elementToBeClickable(gigyaForm);
		try {
			if (gigyaForm.isDisplayed()) {
				elementClick(gigyaForm);
			}
		} catch (NoSuchElementException e) {

		}
	}
	public void clickOnBackToTheArticleList() throws Exception {
		moveToElement(BackToTheArticleList);
		elementClick(BackToTheArticleList);
	}
	public void clickChristineFrankDDS() throws Exception {
		moveToElement(ChristineFrankDDS);
		elementClick(ChristineFrankDDS);
	}
	public void clickCausingPulpitis() throws Exception {
		moveToElement(CausingPulpitis);
		elementClick(CausingPulpitis);
	}
	public void clickSlightlyChangedYourBite() throws Exception {
		moveToElement(SlightlyChangedYourBite);
		elementClick(SlightlyChangedYourBite);
	}
	public void clickOtherReasons() throws Exception {
		moveToElement(OtherReasons);
		elementClick(OtherReasons);
	}
	public void clickGoAwayEntirely() throws Exception {
		moveToElement(GoAwayEntirely);
		elementClick(GoAwayEntirely);
	}
	public void clickNonsteroidalAntiInflammatory() throws Exception {
		moveToElement(NonsteroidalAntiInflammatory);
		elementClick(NonsteroidalAntiInflammatory);
	}
	public void clickThisKindOfTooth() throws Exception {
		moveToElement(ThisKindOfTooth);
		elementClick(ThisKindOfTooth);
	}
	public void clickSensodyneRapidRelief() throws Exception {
		moveToElement(SensodyneRapidRelief);
		elementClick(SensodyneRapidRelief);
	}
	public void clickrelatedArticleOne() throws Exception {
		moveToElement(relatedArticleOne);
		elementClick(relatedArticleOne);
	}
	
	public void clickRealatedArticleOne() throws Exception{
		visibilityOf(relatedArticleOne);
		scrollDownUsingElement(relatedArticleOne);
		clickElementUsingJavaScript(relatedArticleOne);
	}
	
	public void clickRealatedArticleTwo() throws Exception{
		visibilityOf(relatedArticleTwo);
		scrollDownUsingElement(relatedArticleTwo);
		clickElementUsingJavaScript(relatedArticleTwo);
	}
	
	public void clickRealatedArticleThree() throws Exception{
		moveToElement(relatedArticleThree);
		scrollDownUsingElement(relatedArticleThree);
		clickElementUsingJavaScript(relatedArticleThree);
	}
	
	public void clickRealatedArticleFour() throws Exception{
		visibilityOf(relatedArticleFour);
		scrollDownUsingElement(relatedArticleFour);
		clickElementUsingJavaScript(relatedArticleFour);
	}

}
