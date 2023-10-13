package com.qa.flonase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class FlonaseSpringAllergiesCausesSymptomsTreatmentPage extends BaseClass{
	
	public FlonaseSpringAllergiesCausesSymptomsTreatmentPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	
	@FindBy(xpath = "//span[text()='Tree Pollen']//ancestor::header[@class='accordion-head']")
	private static WebElement AccOne;
	
	@FindBy(xpath = "//span[text()='Tree Pollen']//ancestor::li[@class='accordion-slide first odd is-active']")
	private static WebElement AccActiveOne;
	
	@FindBy(xpath = "//span[text()='Tree Pollen']//ancestor::header[@class='accordion-head active']")
	private static WebElement AccHeadOne;
	
	@FindBy(xpath = "//span[text()='Tree Pollen']//ancestor::li[@class='accordion-slide first odd']")
	private static WebElement AccCloseOne;
	
	@FindBy(xpath = "//span[text()='Grass Pollen']//ancestor::header[@class='accordion-head']")
	private static WebElement AccTwo;
	
	@FindBy(xpath = "//span[text()='Grass Pollen']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement AccActiveTwo;
	
	@FindBy(xpath = "//span[text()='Grass Pollen']//ancestor::header[@class='accordion-head active']")
	private static WebElement AccHeadTwo;
	
	@FindBy(xpath = "//span[text()='Grass Pollen']//ancestor::li[@class='accordion-slide even']")
	private static WebElement AccCloseTwo;
	
	@FindBy(xpath = "//span[text()='Mold']//ancestor::header[@class='accordion-head']")
	private static WebElement AccThree;
	
	@FindBy(xpath = "//span[text()='Mold']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement AccActiveThree;
	
	@FindBy(xpath = "//span[text()='Mold']//ancestor::header[@class='accordion-head active']")
	private static WebElement AccHeadThree;
	
	@FindBy(xpath = "//span[text()='Mold']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement AccCloseThree;
	
	@FindBy(xpath = "//span[text()='Dust Mites']//ancestor::header[@class='accordion-head']")
	private static WebElement AccFour;
	
	@FindBy(xpath = "//span[text()='Dust Mites']//ancestor::li[@class='accordion-slide last even is-active']")
	private static WebElement AccActiveFour;
	
	@FindBy(xpath = "//span[text()='Dust Mites']//ancestor::header[@class='accordion-head active']")
	private static WebElement AccHeadFour;
	
	@FindBy(xpath = "//span[text()='Dust Mites']//ancestor::li[@class='accordion-slide last even']")
	private static WebElement AccCloseFour;
	
	
	
	@FindBy(xpath = "//a[@href='/allergies/tree-pollen-allergy-types/' and text()='tree pollen']")
	private static WebElement accOneHyperLinkOne;
	
	@FindBy(xpath = "//a[@href='/allergies/baseball-spring-allergies-checklist/' and text()='grass pollen']")
	private static WebElement accTwoHyperLinkOne;
	
	@FindBy(xpath = "//a[@href='/allergies/mold-allergies/' and text()='Mold']")
	private static WebElement accThreeHyperLinkOne;
	
	@FindBy(xpath = "//a[@href='/allergies/dust-allergies/' and text()='Dust mites']")
	private static WebElement accFourHyperLinkOne;
	
	
	@FindBy(xpath = "//a[@href='/allergies/common-allergy-symptoms/' and text()='symptom reported for']")
	private static WebElement hyperLinkOne;
	
	@FindBy(xpath = "//a[@href='/allergies/common-allergy-symptoms/' and text()='allergies']")
	private static WebElement hyperLinkTwo;
	
	@FindBy(xpath = "//a[@href='/allergies/reduce-indoor-allergens/' and text()='indoor allergens']")
	private static WebElement hyperLinkThree;
	
	@FindBy(xpath = "//a[@href='https://www.flonase.com/allergies/reduce-indoor-allergens/' and text()='learn how to clean house the right way.']")
	private static WebElement hyperLinkFour;
	
	@FindBy(xpath = "//a[@href='/allergies/what-to-expect-flonase-products/' and text()='how FLONASE can help']")
	private static WebElement hyperLinkFive;
	
	@FindBy(xpath = "//a[@href='/allergies/#spring-allergies' and normalize-space()='Spring Allergies']")
	private static WebElement tagsLinksOne;
	
	@FindBy(xpath = "//a[@href='https://www.flonase.com/allergies/' and text()='See all articles >']")
	private static WebElement hyperLinkSeeAllArticles;
	
	
	@FindBy(xpath = "//a[@href='/allergies/when-and-what-is-allergy-season/' and text()='KEEP AN EYE ON THE POLLEN COUNT']")
	private static WebElement allAboutAllergiesArticleOne;
	
	@FindBy(xpath = "//a[@href='/allergies/when-and-what-is-allergy-season/' and text()='SIMPLE TIPS FOR BEATING FALL ALLERGIES']")
	private static WebElement allAboutAllergiesArticleTwo;
	
	@FindBy(xpath = "//a[@href='/allergies/what-to-expect-flonase-products/' and text()='GETTING STARTED WITH YOUR FLONASE PRODUCT']")
	private static WebElement allAboutAllergiesArticleThree;
	
	@FindBy(xpath = "//a[@href='/products/' and text()='BUY NOW']")
	private static WebElement btnBuyNow;
	
	
	
	
	public void clickCookieBtn() throws Exception {
		waitForPageLoadJava();
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
			throw new Exception("Unable to click on cookie Pop-up");
		}
	}
	
	public void clickAllAcc() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(AccOne)) {
			scrollDownUsingElement(AccOne);
			clickElementUsingJavaScript(AccOne);
			visibilityOf(AccActiveOne);
			Assert.assertTrue(elementIsDisplayed(AccActiveOne));
			clickElementUsingJavaScript(AccHeadOne);
			visibilityOf(AccCloseOne);
			Assert.assertTrue(elementIsDisplayed(AccCloseOne));
			System.out.println("Accordion One verified Successfully");
			
			pageLoad();
			scrollDownUsingElement(AccTwo);
			clickElementUsingJavaScript(AccTwo);
			visibilityOf(AccActiveTwo);
			Assert.assertTrue(elementIsDisplayed(AccActiveTwo));
			clickElementUsingJavaScript(AccHeadTwo);
			visibilityOf(AccCloseTwo);
			Assert.assertTrue(elementIsDisplayed(AccCloseTwo));
			System.out.println("Accordion Two verified Successfully");
			
			pageLoad();
			scrollDownUsingElement(AccThree);
			clickElementUsingJavaScript(AccThree);
			visibilityOf(AccActiveThree);
			Assert.assertTrue(elementIsDisplayed(AccActiveThree));
			clickElementUsingJavaScript(AccHeadThree);
			visibilityOf(AccCloseThree);
			Assert.assertTrue(elementIsDisplayed(AccCloseThree));
			System.out.println("Accordion Three verified Successfully");
			
			pageLoad();
			scrollDownUsingElement(AccFour);
			clickElementUsingJavaScript(AccFour);
			visibilityOf(AccActiveFour);
			Assert.assertTrue(elementIsDisplayed(AccActiveFour));
			clickElementUsingJavaScript(AccHeadFour);
			visibilityOf(AccCloseFour);
			Assert.assertTrue(elementIsDisplayed(AccCloseFour));
			System.out.println("Accordion Four verified Successfully");
			
		} else {
			System.out.println("Acc One is not presented in the page");
			throw new Exception("Acc One is not presented in the page");
		}
	}
	
	
	public void clickAccOneHyperLinkOne() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(AccOne)) {
			scrollDownUsingElement(AccOne);
			clickElementUsingJavaScript(AccOne);
			visibilityOf(AccActiveOne);
			Assert.assertTrue(elementIsDisplayed(AccActiveOne));
			visibilityOf(accOneHyperLinkOne);
			clickElementUsingJavaScript(accOneHyperLinkOne);
			pageLoad();
			System.out.println("accOneHyperLinkOne clicked successfully");
		} else {
			System.out.println("accOneHyperLinkOne is not presented in the page");
			throw new Exception("accOneHyperLinkOne is not presented in the page");
		}
	}
	
	public void clickAccTwoHyperLinkOne() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(AccTwo)) {
			scrollDownUsingElement(AccTwo);
			clickElementUsingJavaScript(AccTwo);
			visibilityOf(AccActiveTwo);
			Assert.assertTrue(elementIsDisplayed(AccActiveTwo));
			visibilityOf(accTwoHyperLinkOne);
			clickElementUsingJavaScript(accTwoHyperLinkOne);
			pageLoad();
			System.out.println("accTwoHyperLinkOne clicked successfully");
		} else {
			System.out.println("accTwoHyperLinkOne is not presented in the page");
			throw new Exception("accTwoHyperLinkOne is not presented in the page");
		}
	}
	
	public void clickAccThreeHyperLinkOne() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(AccThree)) {
			scrollDownUsingElement(AccThree);
			clickElementUsingJavaScript(AccThree);
			visibilityOf(AccActiveThree);
			Assert.assertTrue(elementIsDisplayed(AccActiveThree));
			visibilityOf(accThreeHyperLinkOne);
			clickElementUsingJavaScript(accThreeHyperLinkOne);
			pageLoad();
			System.out.println("accThreeHyperLinkOne clicked successfully");
		} else {
			System.out.println("accThreeHyperLinkOne is not presented in the page");
			throw new Exception("accThreeHyperLinkOne is not presented in the page");
		}
	}
	
	
	public void clickAccFourHyperLinkOne() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(AccFour)) {
			scrollDownUsingElement(AccFour);
			clickElementUsingJavaScript(AccFour);
			visibilityOf(AccActiveFour);
			Assert.assertTrue(elementIsDisplayed(AccActiveFour));
			visibilityOf(accFourHyperLinkOne);
			clickElementUsingJavaScript(accFourHyperLinkOne);
			pageLoad();
			System.out.println("accFourHyperLinkOne clicked successfully");
		} else {
			System.out.println("accFourHyperLinkOne is not presented in the page");
			throw new Exception("accFourHyperLinkOne is not presented in the page");
		}
	}
	
	
	public void clickHyperLinkOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkOne)) {
			scrollDownUsingElement(hyperLinkOne);
			clickElementUsingJavaScript(hyperLinkOne);
			pageLoad();
			System.out.println("hyperLinkOne clicked successfully");
		} else {
			System.out.println("hyperLinkOne is not presented in the page");
			throw new Exception("hyperLinkOne is not presented in the page");
		}
	}
	
	
	public void clickHyperLinkTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkTwo)) {
			scrollDownUsingElement(hyperLinkTwo);
			clickElementUsingJavaScript(hyperLinkTwo);
			pageLoad();
			System.out.println("hyperLinkTwo clicked successfully");
		} else {
			System.out.println("hyperLinkTwo is not presented in the page");
			throw new Exception("hyperLinkTwo is not presented in the page");
		}
	}
	
	public void clickHyperLinkThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkThree)) {
			scrollDownUsingElement(hyperLinkThree);
			clickElementUsingJavaScript(hyperLinkThree);
			pageLoad();
			System.out.println("hyperLinkThree clicked successfully");
		} else {
			System.out.println("hyperLinkThree is not presented in the page");
			throw new Exception("hyperLinkThree is not presented in the page");
		}
	}
	
	public void clickHyperLinkFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkFour)) {
			scrollDownUsingElement(hyperLinkFour);
			clickElementUsingJavaScript(hyperLinkFour);
			pageLoad();
			System.out.println("hyperLinkFour clicked successfully");
		} else {
			System.out.println("hyperLinkFour is not presented in the page");
			throw new Exception("hyperLinkFour is not presented in the page");
		}
	}
	
	
	public void clickHyperLinkFive() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkFive)) {
			scrollDownUsingElement(hyperLinkFive);
			clickElementUsingJavaScript(hyperLinkFive);
			pageLoad();
			System.out.println("hyperLinkFive clicked successfully");
		} else {
			System.out.println("hyperLinkFive is not presented in the page");
			throw new Exception("hyperLinkFive is not presented in the page");
		}
	}
	
	public void clickTagsLinksOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(tagsLinksOne)) {
			scrollDownUsingElement(tagsLinksOne);
			clickElementUsingJavaScript(tagsLinksOne);
			pageLoad();
			System.out.println("tagsLinksOne clicked successfully");
		} else {
			System.out.println("tagsLinksOne is not presented in the page");
			throw new Exception("tagsLinksOne is not presented in the page");
		}
	}
	
	
	public void clickHyperLinkSeeAllArticles() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkSeeAllArticles)) {
			scrollDownUsingElement(hyperLinkSeeAllArticles);
			clickElementUsingJavaScript(hyperLinkSeeAllArticles);
			pageLoad();
			System.out.println("hyperLinkSeeAllArticles clicked successfully");
		} else {
			System.out.println("hyperLinkSeeAllArticles is not presented in the page");
			throw new Exception("hyperLinkSeeAllArticles is not presented in the page");
		}
	}
	
	public void clickAllAboutAllergiesArticleOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(allAboutAllergiesArticleOne)) {
			scrollDownUsingElement(allAboutAllergiesArticleOne);
			clickElementUsingJavaScript(allAboutAllergiesArticleOne);
			pageLoad();
			System.out.println("allAboutAllergiesArticleOne clicked successfully");
		} else {
			System.out.println("allAboutAllergiesArticleOne is not presented in the page");
			throw new Exception("allAboutAllergiesArticleOne is not presented in the page");
		}
	}
	
	public void clickAllAboutAllergiesArticleTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(allAboutAllergiesArticleTwo)) {
			scrollDownUsingElement(allAboutAllergiesArticleTwo);
			clickElementUsingJavaScript(allAboutAllergiesArticleTwo);
			pageLoad();
			System.out.println("allAboutAllergiesArticleTwo clicked successfully");
		} else {
			System.out.println("allAboutAllergiesArticleTwo is not presented in the page");
			throw new Exception("allAboutAllergiesArticleTwo is not presented in the page");
		}
	}
	
	public void clickAllAboutAllergiesArticleThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(allAboutAllergiesArticleThree)) {
			scrollDownUsingElement(allAboutAllergiesArticleThree);
			clickElementUsingJavaScript(allAboutAllergiesArticleThree);
			pageLoad();
			System.out.println("allAboutAllergiesArticleThree clicked successfully");
		} else {
			System.out.println("allAboutAllergiesArticleThree is not presented in the page");
			throw new Exception("allAboutAllergiesArticleThree is not presented in the page");
		}
	}
	
	
	public void clickBtnBuyNow() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(btnBuyNow)) {
			scrollDownUsingElement(btnBuyNow);
			clickElementUsingJavaScript(btnBuyNow);
			pageLoad();
			System.out.println("btnBuyNow clicked successfully");
		} else {
			System.out.println("btnBuyNow is not presented in the page");
			throw new Exception("btnBuyNow is not presented in the page");
		}
	}
	
	
	
	
	
}
