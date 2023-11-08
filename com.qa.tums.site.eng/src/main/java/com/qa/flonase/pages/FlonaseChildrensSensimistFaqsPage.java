package com.qa.flonase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class FlonaseChildrensSensimistFaqsPage extends BaseClass{
	
	public FlonaseChildrensSensimistFaqsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//a[@href='/products/childrens-sensimist/' and text()='About']")
	private static WebElement bannerImgLinkOne;
	
	@FindBy(xpath = "//a[@href='/products/childrens-sensimist/how-to-use/' and text()='How to use']")
	private static WebElement bannerImgLinkTwo;
	
	@FindBy(xpath = "//a[@href='/products/childrens-sensimist/drug-facts/' and text()='Drug facts']")
	private static WebElement bannerImgLinkThree;
	
	@FindBy(xpath = "//a[@href='/products/childrens-sensimist/faqs/' and text()='FAQs']")
	private static WebElement bannerImgLinkFour;
	
	@FindBy(xpath = "//a[@href='/products/childrens-sensimist/reviews/' and text()='Read all reviews']")
	private static WebElement bannerImgLinkFive;
	
	@FindBy(xpath = "//span[text()='How long will the relief last for my child?']//ancestor::h2[@class='accordion-title component']")
	private static WebElement accOne;
	
	@FindBy(xpath = "//span[text()='How long will the relief last for my child?']//ancestor::li[@class='accordion-slide first odd is-active']")
	private static WebElement accActiveOne;
	
	@FindBy(xpath = "//span[text()='How long will the relief last for my child?']//ancestor::li[@class='accordion-slide first odd']")
	private static WebElement accCloseOne;
	
	
	@FindBy(xpath = "//span[text()='How soon will my child get relief?']//ancestor::h2[@class='accordion-title component']")
	private static WebElement accTwo;
	
	@FindBy(xpath = "//span[text()='How soon will my child get relief?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement accActiveTwo;
	
	@FindBy(xpath = "//span[text()='How soon will my child get relief?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement accCloseTwo;
	
	@FindBy(xpath = "//span[text()='What symptoms does Children’s FLONASE SENSIMIST relieve?']//ancestor::h2[@class='accordion-title component']")
	private static WebElement accThree;
	
	@FindBy(xpath = "//span[text()='What symptoms does Children’s FLONASE SENSIMIST relieve?']//ancestor::li[@class='accordion-slide last odd is-active']")
	private static WebElement accActiveThree;
	
	@FindBy(xpath = "//span[text()='What symptoms does Children’s FLONASE SENSIMIST relieve?']//ancestor::li[@class='accordion-slide last odd']")
	private static WebElement accCloseThree;
	
	@FindBy(xpath = "//span[text()='How does Children’s FLONASE SENSIMIST work?']//ancestor::h3[@class='accordion-title component']")
	private static WebElement accFour;
	
	@FindBy(xpath = "//span[text()='How does Children’s FLONASE SENSIMIST work?']//ancestor::li[@class='accordion-slide first odd is-active']")
	private static WebElement accActiveFour;
	
	@FindBy(xpath = "//span[text()='How does Children’s FLONASE SENSIMIST work?']//ancestor::li[@class='accordion-slide first odd']")
	private static WebElement accCloseFour;
	
	@FindBy(xpath = "//span[text()='What is Children’s FLONASE SENSIMIST Allergy Relief?']//ancestor::h3[@class='accordion-title component']")
	private static WebElement accFive;
	
	@FindBy(xpath = "//span[text()='What is Children’s FLONASE SENSIMIST Allergy Relief?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement accActiveFive;
	
	@FindBy(xpath = "//span[text()='What is Children’s FLONASE SENSIMIST Allergy Relief?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement accCloseFive;
	
	@FindBy(xpath = "//span[text()='What is the active ingredient in Children’s FLONASE SENSIMIST?']//ancestor::h3[@class='accordion-title component']")
	private static WebElement accSix;
	
	@FindBy(xpath = "//span[text()='What is the active ingredient in Children’s FLONASE SENSIMIST?']//ancestor::li[@class='accordion-slide last odd is-active']")
	private static WebElement accActiveSix;
	
	@FindBy(xpath = "//span[text()='What is the active ingredient in Children’s FLONASE SENSIMIST?']//ancestor::li[@class='accordion-slide last odd']")
	private static WebElement accCloseSix;
	
	@FindBy(xpath = "//span[text()='Can my child use Children’s FLONASE SENSIMIST for asthma?']//ancestor::h3[@class='accordion-title component']")
	private static WebElement accSeven;
	
	@FindBy(xpath = "//span[text()='Can my child use Children’s FLONASE SENSIMIST for asthma?']//ancestor::li[@class='accordion-slide first odd is-active']")
	private static WebElement accActiveSeven;
	
	@FindBy(xpath = "//span[text()='Can my child use Children’s FLONASE SENSIMIST for asthma?']//ancestor::li[@class='accordion-slide first odd']")
	private static WebElement accCloseSeven;
	
	@FindBy(xpath = "//span[text()='Can my child use Children’s FLONASE SENSIMIST for colds? ']//ancestor::h3[@class='accordion-title component']")
	private static WebElement accEight;
	
	@FindBy(xpath = "//span[text()='Can my child use Children’s FLONASE SENSIMIST for colds? ']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement accActiveEight;
	
	@FindBy(xpath = "//span[text()='Can my child use Children’s FLONASE SENSIMIST for colds? ']//ancestor::li[@class='accordion-slide even']")
	private static WebElement accCloseEight;
	
	@FindBy(xpath = "//span[text()='How does Children’s FLONASE SENSIMIST Allergy Relief differ from Children’s FLONASE Allergy Relief?']//ancestor::h3[@class='accordion-title component']")
	private static WebElement accNine;
	
	@FindBy(xpath = "//span[text()='How does Children’s FLONASE SENSIMIST Allergy Relief differ from Children’s FLONASE Allergy Relief?']//ancestor::li[@class='accordion-slide last odd is-active']")
	private static WebElement accActiveNine;
	
	@FindBy(xpath = "//span[text()='How does Children’s FLONASE SENSIMIST Allergy Relief differ from Children’s FLONASE Allergy Relief?']//ancestor::li[@class='accordion-slide last odd']")
	private static WebElement accCloseNine;
	
	@FindBy(xpath = "//span[text()='If my child’s symptoms go away, should they stop using Children’s FLONASE SENSIMIST?']//ancestor::h3[@class='accordion-title component']")
	private static WebElement accTen;
	
	@FindBy(xpath = "//span[text()='If my child’s symptoms go away, should they stop using Children’s FLONASE SENSIMIST?']//ancestor::li[@class='accordion-slide first odd is-active']")
	private static WebElement accActiveTen;
	
	@FindBy(xpath = "//span[text()='If my child’s symptoms go away, should they stop using Children’s FLONASE SENSIMIST?']//ancestor::li[@class='accordion-slide first odd']")
	private static WebElement accCloseTen;
	
	@FindBy(xpath = "//span[text()='What if my child has chicken pox, measles, or tuberculosis, or comes into contact with someone who does?']//ancestor::h3[@class='accordion-title component']")
	private static WebElement accEleven;
	
	@FindBy(xpath = "//span[text()='What if my child has chicken pox, measles, or tuberculosis, or comes into contact with someone who does?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement accActiveEleven;
	
	@FindBy(xpath = "//span[text()='What if my child has chicken pox, measles, or tuberculosis, or comes into contact with someone who does?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement accCloseEleven;
	
	@FindBy(xpath = "//span[text()='What is the proper dosage for Children’s FLONASE SENSIMIST?']//ancestor::h3[@class='accordion-title component']")
	private static WebElement accTweleve;
	
	@FindBy(xpath = "//span[text()='What is the proper dosage for Children’s FLONASE SENSIMIST?']//ancestor::li[@class='accordion-slide last odd is-active']")
	private static WebElement accActiveTweleve;
	
	@FindBy(xpath = "//span[text()='What is the proper dosage for Children’s FLONASE SENSIMIST?']//ancestor::li[@class='accordion-slide last odd']")
	private static WebElement accCloseTweleve;
	
	@FindBy(xpath = "//a[@href='/products/flonase-allergy-relief/' and text()='FLONASE Allergy Relief']")
	private static WebElement reliefProductsOne;
	
	@FindBy(xpath = "//a[@href='/products/sensimist/' and text()='FLONASE SENSIMIST Allergy Relief']")
	private static WebElement reliefProductsTwo;
	
	@FindBy(xpath = "//a[@href='/products/sensimist-family-pack/' and text()='Family FLONASE SENSIMIST Allergy Relief Pack']")
	private static WebElement reliefProductsThree;
	
	@FindBy(xpath = "//a[@href='/products/childrens-flonase/' and text()='Children’s FLONASE Allergy Relief']")
	private static WebElement reliefProductsFour;
	
	@FindBy(xpath = "//a[@href='/products/headache-and-allergy/' and text()='FLONASE Headache & Allergy Relief']")
	private static WebElement reliefProductsFive;
	
	
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
	
	public void clickBannerImgLinkOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(bannerImgLinkOne)) {
			scrollDownUsingElement(bannerImgLinkOne);
			clickElementUsingJavaScript(bannerImgLinkOne);
			pageLoad();
			System.out.println("bannerImgLinkOne clicked successfully");
		} else {
			System.out.println("bannerImgLinkOne is not presented in the page");
			throw new Exception("bannerImgLinkOne is not presented in the page");
		}
	}
	
	public void clickBannerImgLinkTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(bannerImgLinkTwo)) {
			scrollDownUsingElement(bannerImgLinkTwo);
			clickElementUsingJavaScript(bannerImgLinkTwo);
			pageLoad();
			System.out.println("bannerImgLinkTwo clicked successfully");
		} else {
			System.out.println("bannerImgLinkTwo is not presented in the page");
			throw new Exception("bannerImgLinkTwo is not presented in the page");
		}
	}
	
	public void clickBannerImgLinkThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(bannerImgLinkThree)) {
			scrollDownUsingElement(bannerImgLinkThree);
			clickElementUsingJavaScript(bannerImgLinkThree);
			pageLoad();
			System.out.println("bannerImgLinkThree clicked successfully");
		} else {
			System.out.println("bannerImgLinkThree is not presented in the page");
			throw new Exception("bannerImgLinkThree is not presented in the page");
		}
	}
	
	public void clickBannerImgLinkFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(bannerImgLinkFour)) {
			scrollDownUsingElement(bannerImgLinkFour);
			clickElementUsingJavaScript(bannerImgLinkFour);
			pageLoad();
			System.out.println("bannerImgLinkFour clicked successfully");
		} else {
			System.out.println("bannerImgLinkFour is not presented in the page");
			throw new Exception("bannerImgLinkFour is not presented in the page");
		}
	}
	
	public void clickBannerImgLinkFive() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(bannerImgLinkFive)) {
			scrollDownUsingElement(bannerImgLinkFive);
			clickElementUsingJavaScript(bannerImgLinkFive);
			pageLoad();
			System.out.println("bannerImgLinkFive clicked successfully");
		} else {
			System.out.println("bannerImgLinkFive is not presented in the page");
			throw new Exception("bannerImgLinkFive is not presented in the page");
		}
	}
	
	public void clickAccOne() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(accOne)) {
			scrollDownUsingElement(accOne);
			clickElementUsingJavaScript(accOne);
			visibilityOf(accActiveOne);
			Assert.assertTrue(elementIsDisplayed(accActiveOne));
			clickElementUsingJavaScript(accOne);
			visibilityOf(accCloseOne);
			Assert.assertTrue(elementIsDisplayed(accCloseOne));
			System.out.println("Accordion one verfied Successfully");
		} else {
			System.out.println("Accordion one is not presented in the page");
			throw new Exception("Accordion one is not presented in the page");
		}
	}
	
	public void clickAccTwo() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(accTwo)) {
			scrollDownUsingElement(accTwo);
			clickElementUsingJavaScript(accTwo);
			visibilityOf(accActiveTwo);
			Assert.assertTrue(elementIsDisplayed(accActiveTwo));
			clickElementUsingJavaScript(accTwo);
			visibilityOf(accCloseTwo);
			Assert.assertTrue(elementIsDisplayed(accCloseOne));
			System.out.println("Accordion Two verfied Successfully");
		} else {
			System.out.println("Accordion Two is not presented in the page");
			throw new Exception("Accordion Two is not presented in the page");
		}
	}
	
	public void clickAccThree() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(accThree)) {
			scrollDownUsingElement(accThree);
			clickElementUsingJavaScript(accThree);
			visibilityOf(accActiveThree);
			Assert.assertTrue(elementIsDisplayed(accActiveThree));
			clickElementUsingJavaScript(accThree);
			visibilityOf(accCloseThree);
			Assert.assertTrue(elementIsDisplayed(accCloseThree));
			System.out.println("Accordion Three verfied Successfully");
		} else {
			System.out.println("Accordion Three is not presented in the page");
			throw new Exception("Accordion Three is not presented in the page");
		}
	}
	
	public void clickAccFour() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(accFour)) {
			scrollDownUsingElement(accFour);
			clickElementUsingJavaScript(accFour);
			visibilityOf(accActiveFour);
			Assert.assertTrue(elementIsDisplayed(accActiveFour));
			clickElementUsingJavaScript(accFour);
			visibilityOf(accCloseFour);
			Assert.assertTrue(elementIsDisplayed(accCloseFour));
			System.out.println("Accordion Four verfied Successfully");
		} else {
			System.out.println("Accordion Four is not presented in the page");
			throw new Exception("Accordion Four is not presented in the page");
		}
	}
	
	public void clickAccFive() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(accFive)) {
			scrollDownUsingElement(accFive);
			clickElementUsingJavaScript(accFive);
			visibilityOf(accActiveFive);
			Assert.assertTrue(elementIsDisplayed(accActiveFive));
			clickElementUsingJavaScript(accFive);
			visibilityOf(accCloseFive);
			Assert.assertTrue(elementIsDisplayed(accCloseFive));
			System.out.println("Accordion Five verfied Successfully");
		} else {
			System.out.println("Accordion Five is not presented in the page");
			throw new Exception("Accordion Five is not presented in the page");
		}
	}
	
	public void clickAccSix() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(accSix)) {
			scrollDownUsingElement(accSix);
			clickElementUsingJavaScript(accSix);
			visibilityOf(accActiveSix);
			Assert.assertTrue(elementIsDisplayed(accActiveSix));
			clickElementUsingJavaScript(accSix);
			visibilityOf(accCloseSix);
			Assert.assertTrue(elementIsDisplayed(accCloseSix));
			System.out.println("Accordion Six verfied Successfully");
		} else {
			System.out.println("Accordion Six is not presented in the page");
			throw new Exception("Accordion Six is not presented in the page");
		}
	}
	
	public void clickAccSeven() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(accSeven)) {
			scrollDownUsingElement(accSeven);
			clickElementUsingJavaScript(accSeven);
			visibilityOf(accActiveSeven);
			Assert.assertTrue(elementIsDisplayed(accActiveSeven));
			clickElementUsingJavaScript(accSeven);
			visibilityOf(accCloseSeven);
			Assert.assertTrue(elementIsDisplayed(accCloseSeven));
			System.out.println("Accordion Seven verfied Successfully");
		} else {
			System.out.println("Accordion Seven is not presented in the page");
			throw new Exception("Accordion Seven is not presented in the page");
		}
	}
	
	public void clickAccEight() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(accEight)) {
			scrollDownUsingElement(accEight);
			clickElementUsingJavaScript(accEight);
			visibilityOf(accActiveEight);
			Assert.assertTrue(elementIsDisplayed(accActiveEight));
			clickElementUsingJavaScript(accEight);
			visibilityOf(accCloseEight);
			Assert.assertTrue(elementIsDisplayed(accCloseEight));
			System.out.println("Accordion Eight verfied Successfully");
		} else {
			System.out.println("Accordion Eight is not presented in the page");
			throw new Exception("Accordion Eight is not presented in the page");
		}
	}
	
	public void clickAccNine() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(accNine)) {
			scrollDownUsingElement(accNine);
			clickElementUsingJavaScript(accNine);
			visibilityOf(accActiveNine);
			Assert.assertTrue(elementIsDisplayed(accActiveNine));
			clickElementUsingJavaScript(accNine);
			visibilityOf(accCloseNine);
			Assert.assertTrue(elementIsDisplayed(accCloseNine));
			System.out.println("Accordion Nine verfied Successfully");
		} else {
			System.out.println("Accordion Nine is not presented in the page");
			throw new Exception("Accordion Nine is not presented in the page");
		}
	}
	
	public void clickAccTen() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(accTen)) {
			scrollDownUsingElement(accTen);
			clickElementUsingJavaScript(accTen);
			visibilityOf(accActiveTen);
			Assert.assertTrue(elementIsDisplayed(accActiveTen));
			clickElementUsingJavaScript(accTen);
			visibilityOf(accCloseTen);
			Assert.assertTrue(elementIsDisplayed(accCloseTen));
			System.out.println("Accordion Ten verfied Successfully");
		} else {
			System.out.println("Accordion Ten is not presented in the page");
			throw new Exception("Accordion Ten is not presented in the page");
		}
	}
	
	public void clickAccEleven() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(accEleven)) {
			scrollDownUsingElement(accEleven);
			clickElementUsingJavaScript(accEleven);
			visibilityOf(accActiveEleven);
			Assert.assertTrue(elementIsDisplayed(accActiveEleven));
			clickElementUsingJavaScript(accEleven);
			visibilityOf(accCloseEleven);
			Assert.assertTrue(elementIsDisplayed(accCloseEleven));
			System.out.println("Accordion Eleven verfied Successfully");
		} else {
			System.out.println("Accordion Eleven is not presented in the page");
			throw new Exception("Accordion Eleven is not presented in the page");
		}
	}
	
	public void clickAccTweleve() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(accTweleve)) {
			scrollDownUsingElement(accTweleve);
			clickElementUsingJavaScript(accTweleve);
			visibilityOf(accActiveTweleve);
			Assert.assertTrue(elementIsDisplayed(accActiveTweleve));
			clickElementUsingJavaScript(accTweleve);
			visibilityOf(accCloseTweleve);
			Assert.assertTrue(elementIsDisplayed(accCloseTweleve));
			System.out.println("Accordion Tweleve verfied Successfully");
		} else {
			System.out.println("Accordion Tweleve is not presented in the page");
			throw new Exception("Accordion Tweleve is not presented in the page");
		}
	}
	
	public void clickReliefProductsOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(reliefProductsOne)) {
			scrollDownUsingElement(reliefProductsOne);
			clickElementUsingJavaScript(reliefProductsOne);
			pageLoad();
			System.out.println("reliefProductsOne clicked successfully");
		} else {
			System.out.println("reliefProductsOne is not presented in the page");
			throw new Exception("reliefProductsOne is not presented in the page");
		}
	}
	
	public void clickReliefProductsTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(reliefProductsTwo)) {
			scrollDownUsingElement(reliefProductsTwo);
			clickElementUsingJavaScript(reliefProductsTwo);
			pageLoad();
			System.out.println("reliefProductsTwo clicked successfully");
		} else {
			System.out.println("reliefProductsTwo is not presented in the page");
			throw new Exception("reliefProductsTwo is not presented in the page");
		}
	}
	
	public void clickReliefProductsThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(reliefProductsThree)) {
			scrollDownUsingElement(reliefProductsThree);
			clickElementUsingJavaScript(reliefProductsThree);
			pageLoad();
			System.out.println("reliefProductsThree clicked successfully");
		} else {
			System.out.println("reliefProductsThree is not presented in the page");
			throw new Exception("reliefProductsThree is not presented in the page");
		}
	}
	
	public void clickReliefProductsFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(reliefProductsFour)) {
			scrollDownUsingElement(reliefProductsFour);
			clickElementUsingJavaScript(reliefProductsFour);
			pageLoad();
			System.out.println("reliefProductsFour clicked successfully");
		} else {
			System.out.println("reliefProductsFour is not presented in the page");
			throw new Exception("reliefProductsFour is not presented in the page");
		}
	}
	
	public void clickReliefProductsFive() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(reliefProductsFive)) {
			scrollDownUsingElement(reliefProductsFive);
			clickElementUsingJavaScript(reliefProductsFive);
			pageLoad();
			System.out.println("reliefProductsFive clicked successfully");
		} else {
			System.out.println("reliefProductsFive is not presented in the page");
			throw new Exception("reliefProductsFive is not presented in the page");
		}
	}
	
	

}
