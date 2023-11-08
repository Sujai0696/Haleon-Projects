package com.qa.flonase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.qa.baseClass.BaseClass;

public class FlonaseNighttimeAllergyFaqsPage extends BaseClass{
	
	public FlonaseNighttimeAllergyFaqsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public static  SoftAssert soft = new SoftAssert();
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//a[@href='/products/nighttime-allergy/' and text()='About']")
	private static WebElement bannerImgLinkOne;
	
	@FindBy(xpath = "//a[@href='/products/nighttime-allergy/how-to-use/' and text()='How to use']")
	private static WebElement bannerImgLinkTwo;
	
	@FindBy(xpath = "//a[@href='/products/nighttime-allergy/drug-facts/' and text()='Drug facts']")
	private static WebElement bannerImgLinkThree;
	
	@FindBy(xpath = "//a[@href='/products/nighttime-allergy/faqs/' and text()='FAQs']")
	private static WebElement bannerImgLinkFour;
	
	@FindBy(xpath = "//a[@href='/products/nighttime-allergy/reviews/' and text()='Read all reviews']")
	private static WebElement bannerImgLinkFive;
	
	
	@FindBy(xpath = "//span[text()='Is FLONASE Nighttime Allergy Relief a spray?']//ancestor::h2[@class='accordion-title component']")
	private static WebElement accOne;
	
	@FindBy(xpath = "//span[text()='Is FLONASE Nighttime Allergy Relief a spray?']//ancestor::li[@class='accordion-slide first odd is-active']")
	private static WebElement accActiveOne;
	
	@FindBy(xpath = "//span[text()='Is FLONASE Nighttime Allergy Relief a spray?']//ancestor::li[@class='accordion-slide first odd']")
	private static WebElement accCloseOne;
	
	@FindBy(xpath = "//span[text()='How does FLONASE Nighttime Allergy Relief work?']//ancestor::h2[@class='accordion-title component']")
	private static WebElement accTwo;
	
	@FindBy(xpath = "//span[text()='How does FLONASE Nighttime Allergy Relief work?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement accActiveTwo;
	
	@FindBy(xpath = "//span[text()='How does FLONASE Nighttime Allergy Relief work?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement accCloseTwo;
	
	@FindBy(xpath = "//span[text()='What is FLONASE Nighttime Allergy Relief?']//ancestor::h2[@class='accordion-title component']")
	private static WebElement accThree;
	
	@FindBy(xpath = "//span[text()='What is FLONASE Nighttime Allergy Relief?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement accActiveThree;
	
	@FindBy(xpath = "//span[text()='What is FLONASE Nighttime Allergy Relief?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement accCloseThree;
	
	@FindBy(xpath = "//span[text()='Can FLONASE Nighttime Allergy Relief help with nasal and sinus congestion and pressure?']//ancestor::h2[@class='accordion-title component']")
	private static WebElement accFour;
	
	@FindBy(xpath = "//span[text()='Can FLONASE Nighttime Allergy Relief help with nasal and sinus congestion and pressure?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement accActiveFour;
	
	@FindBy(xpath = "//span[text()='Can FLONASE Nighttime Allergy Relief help with nasal and sinus congestion and pressure?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement accCloseFour;
	
	@FindBy(xpath = "//span[text()='How do you take FLONASE Nighttime Allergy Relief?']//ancestor::h2[@class='accordion-title component']")
	private static WebElement accFive;
	
	@FindBy(xpath = "//span[text()='How do you take FLONASE Nighttime Allergy Relief?']//ancestor::li[@class='accordion-slide last odd is-active']")
	private static WebElement accActiveFive;
	
	@FindBy(xpath = "//span[text()='How do you take FLONASE Nighttime Allergy Relief?']//ancestor::li[@class='accordion-slide last odd']")
	private static WebElement accCloseFive;
	
	@FindBy(xpath = "//span[text()='How long does FLONASE Nighttime Allergy Relief last?']//ancestor::h2[@class='accordion-title component']")
	private static WebElement accSix;
	
	@FindBy(xpath = "//span[text()='How long does FLONASE Nighttime Allergy Relief last?']//ancestor::li[@class='accordion-slide first odd is-active']")
	private static WebElement accActiveSix;
	
	@FindBy(xpath = "//span[text()='How long does FLONASE Nighttime Allergy Relief last?']//ancestor::li[@class='accordion-slide first odd']")
	private static WebElement accCloseSix;
	
	@FindBy(xpath = "//span[text()='What are the active ingredients in FLONASE Nighttime Allergy Relief?']//ancestor::h2[@class='accordion-title component']")
	private static WebElement accSeven;
	
	@FindBy(xpath = "//span[text()='What are the active ingredients in FLONASE Nighttime Allergy Relief?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement accActiveSeven;
	
	@FindBy(xpath = "//span[text()='What are the active ingredients in FLONASE Nighttime Allergy Relief?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement accCloseSeven;
	
	@FindBy(xpath = "//span[text()='Which symptoms can FLONASE Nighttime Allergy Relief help me with?']//ancestor::h2[@class='accordion-title component']")
	private static WebElement accEight;
	
	@FindBy(xpath = "//span[text()='Which symptoms can FLONASE Nighttime Allergy Relief help me with?']//ancestor::li[@class='accordion-slide last odd is-active']")
	private static WebElement accActiveEight;
	
	@FindBy(xpath = "//span[text()='Which symptoms can FLONASE Nighttime Allergy Relief help me with?']//ancestor::li[@class='accordion-slide last odd']")
	private static WebElement accCloseEight;
	
	@FindBy(xpath = "//span[text()='How is FLONASE Nighttime Allergy Relief different from other allergy medicines?']//ancestor::h2[@class='accordion-title component']")
	private static WebElement accNine;
	
	@FindBy(xpath = "//span[text()='How is FLONASE Nighttime Allergy Relief different from other allergy medicines?']//ancestor::li[@class='accordion-slide first odd is-active']")
	private static WebElement accActiveNine;
	
	@FindBy(xpath = "//span[text()='How is FLONASE Nighttime Allergy Relief different from other allergy medicines?']//ancestor::li[@class='accordion-slide first odd']")
	private static WebElement accCloseNine;
	
	@FindBy(xpath = "//span[text()='Is FLONASE Nighttime Allergy Relief covered by my insurance?']//ancestor::h2[@class='accordion-title component']")
	private static WebElement accTen;
	
	@FindBy(xpath = "//span[text()='Is FLONASE Nighttime Allergy Relief covered by my insurance?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement accActiveTen;
	
	@FindBy(xpath = "//span[text()='Is FLONASE Nighttime Allergy Relief covered by my insurance?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement accCloseTen;
	
	@FindBy(xpath = "//span[text()='Can children take FLONASE Nighttime Allergy Relief?']//ancestor::h2[@class='accordion-title component']")
	private static WebElement accEleven;
	
	@FindBy(xpath = "//span[text()='Can children take FLONASE Nighttime Allergy Relief?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement accActiveEleven;
	
	@FindBy(xpath = "//span[text()='Can children take FLONASE Nighttime Allergy Relief?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement accCloseEleven;
	
	@FindBy(xpath = "//span[text()='Is there a limit to how many tablets of FLONASE Nighttime Allergy Relief I can take in a day?']//ancestor::h2[@class='accordion-title component']")
	private static WebElement accTweleve;
	
	@FindBy(xpath = "//span[text()='Is there a limit to how many tablets of FLONASE Nighttime Allergy Relief I can take in a day?']//ancestor::li[@class='accordion-slide last even is-active']")
	private static WebElement accActiveTweleve;
	
	@FindBy(xpath = "//span[text()='Is there a limit to how many tablets of FLONASE Nighttime Allergy Relief I can take in a day?']//ancestor::li[@class='accordion-slide last even']")
	private static WebElement accCloseTweleve;
	
	@FindBy(xpath = "//span[text()='Who should not use FLONASE Nighttime Allergy Relief?']//ancestor::h2[@class='accordion-title component']")
	private static WebElement accThirteen;
	
	@FindBy(xpath = "//span[text()='Who should not use FLONASE Nighttime Allergy Relief?']//ancestor::li[@class='accordion-slide first last odd is-active']")
	private static WebElement accActiveThirteen;
	
	@FindBy(xpath = "//span[text()='Who should not use FLONASE Nighttime Allergy Relief?']//ancestor::li[@class='accordion-slide first last odd']")
	private static WebElement accCloseThirteen;
	
	
	
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
	
	public void clickAllAcc() throws Exception {
		waitForPageLoadJava();
		try {
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
			
			if (isElementPresent(accTwo)) {
				scrollDownUsingElement(accTwo);
				clickElementUsingJavaScript(accTwo);
				visibilityOf(accActiveTwo);
				Assert.assertTrue(elementIsDisplayed(accActiveTwo));
				clickElementUsingJavaScript(accTwo);
				visibilityOf(accCloseTwo);
				Assert.assertTrue(elementIsDisplayed(accCloseTwo));
				System.out.println("Accordion Two verfied Successfully");
			} else {
				System.out.println("Accordion Two is not presented in the page");
				throw new Exception("Accordion Two is not presented in the page");
			}
			
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
			
//			if (isElementPresent(acc)) {
//				scrollDownUsingElement(acc);
//				clickElementUsingJavaScript(acc);
//				visibilityOf(accActive);
//				Assert.assertTrue(elementIsDisplayed(accActive));
//				clickElementUsingJavaScript(acc);
//				visibilityOf(accClose);
//				Assert.assertTrue(elementIsDisplayed(accClose));
//				System.out.println("Accordion one verfied Successfully");
//			} else {
//				System.out.println("Accordion one is not presented in the page");
//				throw new Exception("Accordion one is not presented in the page");
//			}
//			
//			if (isElementPresent(acc)) {
//				scrollDownUsingElement(acc);
//				clickElementUsingJavaScript(acc);
//				visibilityOf(accActive);
//				Assert.assertTrue(elementIsDisplayed(accActive));
//				clickElementUsingJavaScript(acc);
//				visibilityOf(accClose);
//				Assert.assertTrue(elementIsDisplayed(accClose));
//				System.out.println("Accordion one verfied Successfully");
//			} else {
//				System.out.println("Accordion one is not presented in the page");
//				throw new Exception("Accordion one is not presented in the page");
//			}
//			
//			if (isElementPresent(acc)) {
//				scrollDownUsingElement(acc);
//				clickElementUsingJavaScript(acc);
//				visibilityOf(accActive);
//				Assert.assertTrue(elementIsDisplayed(accActive));
//				clickElementUsingJavaScript(acc);
//				visibilityOf(accClose);
//				Assert.assertTrue(elementIsDisplayed(accClose));
//				System.out.println("Accordion one verfied Successfully");
//			} else {
//				System.out.println("Accordion one is not presented in the page");
//				throw new Exception("Accordion one is not presented in the page");
//			}
//			
//			if (isElementPresent(acc)) {
//				scrollDownUsingElement(acc);
//				clickElementUsingJavaScript(acc);
//				visibilityOf(accActive);
//				Assert.assertTrue(elementIsDisplayed(accActive));
//				clickElementUsingJavaScript(acc);
//				visibilityOf(accClose);
//				Assert.assertTrue(elementIsDisplayed(accClose));
//				System.out.println("Accordion one verfied Successfully");
//			} else {
//				System.out.println("Accordion one is not presented in the page");
//				throw new Exception("Accordion one is not presented in the page");
//			}
//			
//			if (isElementPresent(acc)) {
//				scrollDownUsingElement(acc);
//				clickElementUsingJavaScript(acc);
//				visibilityOf(accActive);
//				Assert.assertTrue(elementIsDisplayed(accActive));
//				clickElementUsingJavaScript(acc);
//				visibilityOf(accClose);
//				Assert.assertTrue(elementIsDisplayed(accClose));
//				System.out.println("Accordion one verfied Successfully");
//			} else {
//				System.out.println("Accordion one is not presented in the page");
//				throw new Exception("Accordion one is not presented in the page");
//			}
//			
//			if (isElementPresent(acc)) {
//				scrollDownUsingElement(acc);
//				clickElementUsingJavaScript(acc);
//				visibilityOf(accActive);
//				Assert.assertTrue(elementIsDisplayed(accActive));
//				clickElementUsingJavaScript(acc);
//				visibilityOf(accClose);
//				Assert.assertTrue(elementIsDisplayed(accClose));
//				System.out.println("Accordion one verfied Successfully");
//			} else {
//				System.out.println("Accordion one is not presented in the page");
//				throw new Exception("Accordion one is not presented in the page");
//			}
			
			soft.assertAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
