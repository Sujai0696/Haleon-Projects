package com.qa.tums.eng.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class TumsSymptomsPage extends BaseClass{

	public TumsSymptomsPage() {
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "//u[text()='antacids such as TUMS']")
	private static WebElement antacidsSuchAsTyms;
	
	@FindBy(xpath = "//span[text()='Heartburn and Chest Pain']//ancestor::li[@class='accordion-slide is-active first odd']")
	private static WebElement accordionActiveOne;
	
	@FindBy(xpath = "//a[@title='Heartburn and Chest Pain']//ancestor::header[@class='accordion-head']")
	private static WebElement accordionOne;

	@FindBy(xpath = "//a[@aria-expanded='true']")
	private static WebElement accordionClosed;
	
	@FindBy(xpath = "//a[@aria-expanded='false']")
	private static WebElement accordionClosedOthers;
	
	
	@FindBy(xpath = "//span[text()='Heartburn, Bloating and Belching']//ancestor::header[@class='accordion-head']")
	private static WebElement accordionTwo;
	
	@FindBy(xpath = "//span[text()='Heartburn, Bloating and Belching']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement accordionActiveTwo;
	
	@FindBy(xpath = "//a[text()='causes of heartburn']")
	private static WebElement accordionTwoHyperLink;
	
	
	
	@FindBy(xpath = "//span[text()='Heartburn and Acidic Throat']//ancestor::header[@class='accordion-head']")
	private static WebElement accordionThree;
	
	@FindBy(xpath = "//span[text()='Heartburn and Acidic Throat']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement accordionActiveThree;
	
	
	@FindBy(xpath = "//span[text()='Heartburn and Nausea']//ancestor::header[@class='accordion-head']")
	private static WebElement accordionFour;
	
	@FindBy(xpath = "//span[text()='Heartburn and Nausea']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement accordionActiveFour;
	
	@FindBy(xpath = "//span[text()='Heartburn and Hiccups']//ancestor::header[@class='accordion-head']")
	private static WebElement accordionFive;
	
	@FindBy(xpath = "//span[text()='Heartburn and Hiccups']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement accordionActiveFive;
	
	@FindBy(xpath = "//a[text()='find quick heartburn relief']")
	private static WebElement accordionFiveHyperLink;
	
	@FindBy(xpath = "//span[text()='What Does Heartburn Feel Like When Pregnant?']//ancestor::header[@class='accordion-head']")
	private static WebElement accordionSix;
	
	@FindBy(xpath = "//span[text()='What Does Heartburn Feel Like When Pregnant?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement accordionActiveSix;
	

	
	@FindBy(xpath = "//span[text()='When to Seek Medical Attention']//ancestor::header[@class='accordion-head']")
	private static WebElement accordionSeven;
	
	@FindBy(xpath = "//span[text()='When to Seek Medical Attention']//ancestor::li[@class='accordion-slide last odd is-active']")
	private static WebElement accordionActiveSeven;
	
	
	
	@FindBy(xpath = "//p[text()='Show References']")
	private static WebElement showReference;
	
	@FindBy(xpath = "//p[text()='Hide References']")
	private static WebElement hideReference;
	
	
	@FindBy(xpath = "//a[text()='Heartburn Causes']")
	private static WebElement learnMoreArticleOne;
	
	@FindBy(xpath = "//a[text()='Finding Relief']")
	private static WebElement learnMoreArticleTwo;
	
	@FindBy(xpath = "//a[text()='TUMS While Pregnant']")
	private static WebElement learnMoreArticleThree;
	
	@FindBy(xpath = "//a[text()='How Do I Know If This Is Heartburn?']")
	private static WebElement relatedArticleOne;
	
	@FindBy(xpath = "//a[text()='The Signs of Severe Heartburn']")
	private static WebElement relatedArticleTwo;
	
	@FindBy(xpath = "//a[text()='What You Can Do to Manage Night-Time Heartburn']")
	private static WebElement relatedArticleThree;
	
	@FindBy(xpath = "//a[text()='How to Know if You Have Acid Reflux']")
	private static WebElement relatedArticleFour;
	
	@FindBy(id = "seeproducts-link")
	private static WebElement seeProducts;
	
	
	@FindBy(xpath = "//a[text()='TUMS Home']")
	private static WebElement breadCrumbHome;
	
	@FindBy(xpath = "//a[text()='Heartburn 101']")
	private static WebElement breadCrumbOne;






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

	
	public void clickAntacidsSuchAsTums() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(antacidsSuchAsTyms);
		clickElementUsingJavaScript(antacidsSuchAsTyms);
	}

	public void clickAccordionOne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(accordionActiveOne);
		if (isElementPresent(accordionActiveOne)) {
			clickElementUsingJavaScript(accordionOne);
			implicitWait();
			Assert.assertTrue(elementIsDisplayed(accordionClosed));
			System.out.println(getElementText(accordionOne));
		} else {
			System.out.println("accordion is not active");
			Assert.assertTrue(false);
		}
	}

	public void clickAccordionTwo() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(accordionTwo);
		if (isElementPresent(accordionTwo)) {
			clickElementUsingJavaScript(accordionTwo);
			implicitWait();
			Assert.assertTrue(elementIsDisplayed(accordionActiveTwo));
			clickElementUsingJavaScript(accordionTwo);
			implicitWait();
			Assert.assertTrue(elementIsDisplayed(accordionClosedOthers));
		} else {
			System.out.println("accordion is not verified");
			Assert.assertTrue(false);

		}
	}
	
	public void clickAccordionTwoHyperLink() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(accordionTwo);
		clickElementUsingJavaScript(accordionTwo);
		elementToBeClickable(accordionTwoHyperLink);
		clickElementUsingJavaScript(accordionTwoHyperLink);
	}

	public void clickAccordionThree() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(accordionThree);
		if (isElementPresent(accordionThree)) {
			clickElementUsingJavaScript(accordionThree);
			implicitWait();
			Assert.assertTrue(elementIsDisplayed(accordionActiveThree));
			clickElementUsingJavaScript(accordionThree);
			implicitWait();
			Assert.assertTrue(elementIsDisplayed(accordionClosedOthers));
		} else {
			System.out.println("accordion is not verified");
			Assert.assertTrue(false);

		}
	}
	
	public void clickAccordionFour() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(accordionFour);
		if (isElementPresent(accordionFour)) {
			clickElementUsingJavaScript(accordionFour);
			implicitWait();
			Assert.assertTrue(elementIsDisplayed(accordionActiveFour));
			clickElementUsingJavaScript(accordionFour);
			implicitWait();
			Assert.assertTrue(elementIsDisplayed(accordionClosedOthers));
		} else {
			System.out.println("accordion is not verified");
			Assert.assertTrue(false);

		}
	}
	
	public void clickAccordionFive() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(accordionFive);
		if (isElementPresent(accordionFive)) {
			clickElementUsingJavaScript(accordionFive);
			implicitWait();
			Assert.assertTrue(elementIsDisplayed(accordionActiveFive));
			clickElementUsingJavaScript(accordionFive);
			implicitWait();
			Assert.assertTrue(elementIsDisplayed(accordionClosedOthers));
		} else {
			System.out.println("accordion is not verified");
			Assert.assertTrue(false);

		}
	}
	
	
	public void clickAccordionFiveHyperLink() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(accordionFive);
		clickElementUsingJavaScript(accordionFive);
		elementToBeClickable(accordionFiveHyperLink);
		clickElementUsingJavaScript(accordionFiveHyperLink);
	}
	
	public void clickAccordionSix() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(accordionSix);
		if (isElementPresent(accordionSix)) {
			clickElementUsingJavaScript(accordionSix);
			implicitWait();
			Assert.assertTrue(elementIsDisplayed(accordionActiveSix));
			clickElementUsingJavaScript(accordionSix);
			implicitWait();
			Assert.assertTrue(elementIsDisplayed(accordionClosedOthers));
		} else {
			System.out.println("accordion is not verified");
			Assert.assertTrue(false);

		}
	}
	
	public void clickAccordionSeven() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(accordionSeven);
		if (isElementPresent(accordionSeven)) {
			clickElementUsingJavaScript(accordionSeven);
			implicitWait();
			Assert.assertTrue(elementIsDisplayed(accordionActiveSeven));
			clickElementUsingJavaScript(accordionSeven);
			implicitWait();
			Assert.assertTrue(elementIsDisplayed(accordionClosedOthers));
		} else {
			System.out.println("accordion is not verified");
			Assert.assertTrue(false);

		}
	}
	
	public void clickShowReference() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(showReference);
		clickElementUsingJavaScript(showReference);
		Assert.assertTrue(elementIsDisplayed(hideReference));
		elementToBeClickable(hideReference);
		clickElementUsingJavaScript(hideReference);
	}
	
	public void clickLearnMoreArticleOne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(learnMoreArticleOne);
		clickElementUsingJavaScript(learnMoreArticleOne);
	}
	
	public void clickLearnMoreArticleTwo() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(learnMoreArticleTwo);
		clickElementUsingJavaScript(learnMoreArticleTwo);
	}
	
	public void clickLearnMoreArticleThree() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(learnMoreArticleThree);
		clickElementUsingJavaScript(learnMoreArticleThree);
	}
	
	
	public void clickRelatedArticleOne() throws Exception{
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
	
	public void clickSeeProducts() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(seeProducts);
		clickElementUsingJavaScript(seeProducts);
	}
	
	public void clickBreadCrumbHome() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(breadCrumbHome);
		clickElementUsingJavaScript(breadCrumbHome);
	}
	
	public void clickBreadCrumbOne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(breadCrumbOne);
		clickElementUsingJavaScript(breadCrumbOne);
	}
	

}
