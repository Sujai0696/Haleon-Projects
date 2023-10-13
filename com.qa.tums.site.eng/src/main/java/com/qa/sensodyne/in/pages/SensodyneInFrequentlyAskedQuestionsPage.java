package com.qa.sensodyne.in.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneInFrequentlyAskedQuestionsPage extends BaseClass{
	
	public SensodyneInFrequentlyAskedQuestionsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='home']//self::a[@href='/']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even last is-current ']//ancestor::li[text()=' FAQs ']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//span[text()='What causes tooth sensitivity?']//ancestor::header[@class='accordion-head']")
	private static WebElement toothSensitivityAccTwo;
	
	@FindBy(xpath = "//span[text()='What causes tooth sensitivity?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement toothSensitivityAccActiveTwo;
	
	@FindBy(xpath = "//span[text()='What causes tooth sensitivity?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement toothSensitivityAccCloseTwo;
	
	@FindBy(xpath = "//span[text()='How can I protect myself against sensitivity?']//ancestor::header[@class='accordion-head']")
	private static WebElement toothSensitivityAccThree;
	
	@FindBy(xpath = "//span[text()='How can I protect myself against sensitivity?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement toothSensitivityAccActiveThree;
	
	@FindBy(xpath = "//span[text()='How can I protect myself against sensitivity?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement toothSensitivityAccCloseThree;
	
	@FindBy(xpath = "//span[text()='What triggers sensitive teeth?']//ancestor::header[@class='accordion-head']")
	private static WebElement toothSensitivityAccFour;
	
	@FindBy(xpath = "//span[text()='What triggers sensitive teeth?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement toothSensitivityAccActiveFour;
	
	@FindBy(xpath = "//span[text()='What triggers sensitive teeth?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement toothSensitivityAccCloseFour;
	
	@FindBy(xpath = "//span[text()='Is tooth sensitivity a common dental problem?']//ancestor::header[@class='accordion-head']")
	private static WebElement toothSensitivityAccFive;
	
	@FindBy(xpath = "//span[text()='Is tooth sensitivity a common dental problem?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement toothSensitivityAccActiveFive;
	
	@FindBy(xpath = "//span[text()='Is tooth sensitivity a common dental problem?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement toothSensitivityAccCloseFive;
	
	@FindBy(xpath = "//span[text()='Is tooth sensitivity a sign of a more serious dental problem?']//ancestor::header[@class='accordion-head']")
	private static WebElement toothSensitivityAccSix;
	
	@FindBy(xpath = "//span[text()='Is tooth sensitivity a sign of a more serious dental problem?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement toothSensitivityAccActiveSix;
	
	@FindBy(xpath = "//span[text()='Is tooth sensitivity a sign of a more serious dental problem?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement toothSensitivityAccCloseSix;
	
	@FindBy(xpath = "//span[text()='Can brushing too hard cause sensitive teeth?']//ancestor::header[@class='accordion-head']")
	private static WebElement toothSensitivityAccSeven;
	
	@FindBy(xpath = "//span[text()='Can brushing too hard cause sensitive teeth?']//ancestor::li[@class='accordion-slide last odd is-active']")
	private static WebElement toothSensitivityAccActiveSeven;
	
	@FindBy(xpath = "//span[text()='Can brushing too hard cause sensitive teeth?']//ancestor::li[@class='accordion-slide last odd']")
	private static WebElement toothSensitivityAccCloseSeven;
	
	
	
	@FindBy(xpath = "//span[text()='What causes acid erosion?']//ancestor::header[@class='accordion-head']")
	private static WebElement acidErosionAccTwo;
	
	@FindBy(xpath = "//span[text()='What causes acid erosion?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement acidErosionAccActiveTwo;
	
	@FindBy(xpath = "//span[text()='What causes acid erosion?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement acidErosionAccCloseTwo;
	
	@FindBy(xpath = "//span[text()='Can acid erosion cause teeth sensitivity?']//ancestor::header[@class='accordion-head']")
	private static WebElement acidErosionAccThree;
	
	@FindBy(xpath = "//span[text()='Can acid erosion cause teeth sensitivity?']//ancestor::li[@class='accordion-slide last odd is-active']")
	private static WebElement acidErosionAccActiveThree;
	
	@FindBy(xpath = "//span[text()='Can acid erosion cause teeth sensitivity?']//ancestor::li[@class='accordion-slide last odd']")
	private static WebElement acidErosionAccCloseThree;
	
	
	
	@FindBy(xpath = "//span[text()='Does Sensodyne toothpaste come in different varient?']//ancestor::header[@class='accordion-head']")
	private static WebElement sensitiveToothpasteAccTwo;
	
	@FindBy(xpath = "//span[text()='Does Sensodyne toothpaste come in different varient?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement sensitiveToothpasteAccActiveTwo;
	
	@FindBy(xpath = "//span[text()='Does Sensodyne toothpaste come in different varient?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement sensitiveToothpasteAccCloseTwo;
	
	@FindBy(xpath = "//span[text()='How often should I use Sensodyne toothpaste?']//ancestor::header[@class='accordion-head']")
	private static WebElement sensitiveToothpasteAccThree;
	
	@FindBy(xpath = "//span[text()='How often should I use Sensodyne toothpaste?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement sensitiveToothpasteAccActiveThree;
	
	@FindBy(xpath = "//span[text()='How often should I use Sensodyne toothpaste?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement sensitiveToothpasteAccCloseThree;
	
	@FindBy(xpath = "//span[text()='Once I stop using Sensodyne toothpaste will my tooth sensitivity return?']//ancestor::header[@class='accordion-head']")
	private static WebElement 	sensitiveToothpasteAccFour;
	
	@FindBy(xpath = "//span[text()='Once I stop using Sensodyne toothpaste will my tooth sensitivity return?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement sensitiveToothpasteAccActiveFour;
	
	@FindBy(xpath = "//span[text()='Once I stop using Sensodyne toothpaste will my tooth sensitivity return?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement sensitiveToothpasteAccCloseFour;
	
	@FindBy(xpath = "//span[text()='Why should children under 12 consult a dentist before using Sensodyne toothpaste?']//ancestor::header[@class='accordion-head']")
	private static WebElement sensitiveToothpasteAccFive;
	
	@FindBy(xpath = "//span[text()='Why should children under 12 consult a dentist before using Sensodyne toothpaste?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement sensitiveToothpasteAccActiveFive;
	
	@FindBy(xpath = "//span[text()='Why should children under 12 consult a dentist before using Sensodyne toothpaste?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement sensitiveToothpasteAccCloseFive;
	
	@FindBy(xpath = "//span[text()='Does Sensodyne toothpaste contain fluoride?']//ancestor::header[@class='accordion-head']")
	private static WebElement sensitiveToothpasteAccSix;
	
	@FindBy(xpath = "//span[text()='Does Sensodyne toothpaste contain fluoride?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement sensitiveToothpasteAccActiveSix;
	
	@FindBy(xpath = "//span[text()='Does Sensodyne toothpaste contain fluoride?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement sensitiveToothpasteAccCloseSix;
	
	@FindBy(xpath = "//span[text()='Does Sensodyne contain triclosan?']//ancestor::header[@class='accordion-head']")
	private static WebElement sensitiveToothpasteAccSeven;
	
	@FindBy(xpath = "//span[text()='Does Sensodyne contain triclosan?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement sensitiveToothpasteAccActiveSeven;
	
	@FindBy(xpath = "//span[text()='Does Sensodyne contain triclosan?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement sensitiveToothpasteAccCloseSeven;
	
	@FindBy(xpath = "//span[text()='Is Sensodyne toothpaste available as a travel-sized tube?']//ancestor::header[@class='accordion-head']")
	private static WebElement sensitiveToothpasteAccEight;
	
	@FindBy(xpath = "//span[text()='Is Sensodyne toothpaste available as a travel-sized tube?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement sensitiveToothpasteAccActiveEight;
	
	@FindBy(xpath = "//span[text()='Is Sensodyne toothpaste available as a travel-sized tube?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement sensitiveToothpasteAccCloseEight;
	
	@FindBy(xpath = "//span[text()='Can I use mouthwash after brushing with Sensodyne toothpaste?']//ancestor::header[@class='accordion-head']")
	private static WebElement sensitiveToothpasteAccNine;
	
	@FindBy(xpath = "//span[text()='Can I use mouthwash after brushing with Sensodyne toothpaste?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement sensitiveToothpasteAccActiveNine;
	
	@FindBy(xpath = "//span[text()='Can I use mouthwash after brushing with Sensodyne toothpaste?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement sensitiveToothpasteAccCloseNine;
	
	@FindBy(xpath = "//span[text()='Is Sensodyne toothpaste safe to use during tooth-whitening treatments?']//ancestor::header[@class='accordion-head']")
	private static WebElement sensitiveToothpasteAccTen;
	
	@FindBy(xpath = "//span[text()='Is Sensodyne toothpaste safe to use during tooth-whitening treatments?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement sensitiveToothpasteAccActiveTen;
	
	@FindBy(xpath = "//span[text()='Is Sensodyne toothpaste safe to use during tooth-whitening treatments?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement sensitiveToothpasteAccCloseTen;
	
	@FindBy(xpath = "//span[text()='How is Sensodyne Repair & Protect toothpaste different from the other Sensodyne toothpaste?']//ancestor::header[@class='accordion-head']")
	private static WebElement sensitiveToothpasteAccEleven;
	
	@FindBy(xpath = "//span[text()='How is Sensodyne Repair & Protect toothpaste different from the other Sensodyne toothpaste?']//ancestor::li[@class='accordion-slide last odd is-active']")
	private static WebElement sensitiveToothpasteAccActiveEleven;
	
	@FindBy(xpath = "//span[text()='How is Sensodyne Repair & Protect toothpaste different from the other Sensodyne toothpaste?']//ancestor::li[@class='accordion-slide last odd']")
	private static WebElement sensitiveToothpasteAccCloseEleven;
	
	
	
	@FindBy(xpath = "//span[text()='What are the bristles made of?']//ancestor::header[@class='accordion-head']")
	private static WebElement sensodyneToothbrushAccTwo;
	
	@FindBy(xpath = "//span[text()='What are the bristles made of?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement sensodyneToothbrushAccActiveTwo;
	
	@FindBy(xpath = "//span[text()='What are the bristles made of?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement sensodyneToothbrushAccCloseTwo;
	
	@FindBy(xpath = "//span[text()='Why is the Sensodyne toothbrush good for people with sensitive teeth?']//ancestor::header[@class='accordion-head']")
	private static WebElement sensodyneToothbrushAccThree;
	
	@FindBy(xpath = "//span[text()='Why is the Sensodyne toothbrush good for people with sensitive teeth?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement sensodyneToothbrushAccActiveThree;
	
	@FindBy(xpath = "//span[text()='Why is the Sensodyne toothbrush good for people with sensitive teeth?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement sensodyneToothbrushAccCloseThree;
	
	@FindBy(xpath = "//span[text()='How often should one replace a toothbrush?']//ancestor::header[@class='accordion-head']")
	private static WebElement sensodyneToothbrushAccFour;
	
	@FindBy(xpath = "//span[text()='How often should one replace a toothbrush?']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement sensodyneToothbrushAccActiveFour;
	
	@FindBy(xpath = "//span[text()='How often should one replace a toothbrush?']//ancestor::li[@class='accordion-slide even']")
	private static WebElement sensodyneToothbrushAccCloseFour;
	
	@FindBy(xpath = "//span[text()='What is the benefit of using this brush over an electric toothbrush?']//ancestor::header[@class='accordion-head']")
	private static WebElement sensodyneToothbrushAccFive;
	
	@FindBy(xpath = "//span[text()='What is the benefit of using this brush over an electric toothbrush?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement sensodyneToothbrushAccActiveFive;
	
	@FindBy(xpath = "//span[text()='What is the benefit of using this brush over an electric toothbrush?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement sensodyneToothbrushAccCloseFive;
	
	@FindBy(xpath = "//span[text()='Can I use a Sensodyne toothbrush on my dentures?']//ancestor::header[@class='accordion-head']")
	private static WebElement sensodyneToothbrushAccSix;
	
	@FindBy(xpath = "//span[text()='Can I use a Sensodyne toothbrush on my dentures?']//ancestor::li[@class='accordion-slide last even is-active']")
	private static WebElement sensodyneToothbrushAccActiveSix;
	
	@FindBy(xpath = "//span[text()='Can I use a Sensodyne toothbrush on my dentures?']//ancestor::li[@class='accordion-slide last even']")
	private static WebElement sensodyneToothbrushAccCloseSix;
	
	@FindBy(xpath = "//a[@href='/products.html']//img[@alt='Arrow to find your store and purchase Sensodyne toothpaste']")
	private static WebElement findYourStore;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void clickBreadcrumbOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbOne)) {
			scrollDownUsingElement(breadcrumbOne);
			clickElementUsingJavaScript(breadcrumbOne);
			pageLoad();
			System.out.println("Breadcrumb One clicked successfully");
		} else {
			System.out.println("Breadcrumb One is not presented in the page");
			throw new Exception("Breadcrumb One is not presented in the page");
		}
	}

	public void clickBreadcrumbTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbTwo)) {
			scrollDownUsingElement(breadcrumbTwo);
			String href = breadcrumbTwo.getAttribute("href");
	        boolean hasValidUrl = href != null && !href.isEmpty();
	        Assert.assertFalse(hasValidUrl);
			pageLoad();
			System.out.println("Breadcrumb Two verified successfully");
		} else {
			System.out.println("Breadcrumb Two is not presented in the page");
			throw new Exception("Breadcrumb Two is not presented in the page");
		}
	}
	
	
	public void clickToothSensitivityAccTwo() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(toothSensitivityAccTwo)) {
			scrollDownUsingElement(toothSensitivityAccTwo);
			clickElementUsingJavaScript(toothSensitivityAccTwo);
			visibilityOf(toothSensitivityAccActiveTwo);
			Assert.assertTrue(elementIsDisplayed(toothSensitivityAccActiveTwo));
			clickElementUsingJavaScript(toothSensitivityAccTwo);
			visibilityOf(toothSensitivityAccCloseTwo);
			Assert.assertTrue(elementIsDisplayed(toothSensitivityAccCloseTwo));
			System.out.println("toothSensitivity Accordion two verfied Successfully");
		} else {
			System.out.println("toothSensitivity Accordion two is not presented in the page");
			throw new Exception("toothSensitivity Accordion two is not presented in the page");
		}
	}
	
	public void clickToothSensitivityAccThree() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(toothSensitivityAccThree)) {
			scrollDownUsingElement(toothSensitivityAccThree);
			clickElementUsingJavaScript(toothSensitivityAccThree);
			visibilityOf(toothSensitivityAccActiveThree);
			Assert.assertTrue(elementIsDisplayed(toothSensitivityAccActiveThree));
			clickElementUsingJavaScript(toothSensitivityAccThree);
			visibilityOf(toothSensitivityAccCloseThree);
			Assert.assertTrue(elementIsDisplayed(toothSensitivityAccCloseThree));
			System.out.println("toothSensitivity Accordion Three verfied Successfully");
		} else {
			System.out.println("toothSensitivity Accordion Three is not presented in the page");
			throw new Exception("toothSensitivity Accordion Three is not presented in the page");
		}
	}
	
	public void clickToothSensitivityAccFour() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(toothSensitivityAccFour)) {
			scrollDownUsingElement(toothSensitivityAccFour);
			clickElementUsingJavaScript(toothSensitivityAccFour);
			visibilityOf(toothSensitivityAccActiveFour);
			Assert.assertTrue(elementIsDisplayed(toothSensitivityAccActiveFour));
			clickElementUsingJavaScript(toothSensitivityAccFour);
			visibilityOf(toothSensitivityAccCloseFour);
			Assert.assertTrue(elementIsDisplayed(toothSensitivityAccCloseFour));
			System.out.println("toothSensitivity Accordion Four verfied Successfully");
		} else {
			System.out.println("toothSensitivity Accordion Four is not presented in the page");
			throw new Exception("toothSensitivity Accordion Four is not presented in the page");
		}
	}
	
	public void clickToothSensitivityAccFive() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(toothSensitivityAccFive)) {
			scrollDownUsingElement(toothSensitivityAccFive);
			clickElementUsingJavaScript(toothSensitivityAccFive);
			visibilityOf(toothSensitivityAccActiveFive);
			Assert.assertTrue(elementIsDisplayed(toothSensitivityAccActiveFive));
			clickElementUsingJavaScript(toothSensitivityAccFive);
			visibilityOf(toothSensitivityAccCloseFive);
			Assert.assertTrue(elementIsDisplayed(toothSensitivityAccCloseFive));
			System.out.println("toothSensitivity Accordion Five verfied Successfully");
		} else {
			System.out.println("toothSensitivity Accordion Five is not presented in the page");
			throw new Exception("toothSensitivity Accordion Five is not presented in the page");
		}
	}
	
	public void clickToothSensitivityAccSix() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(toothSensitivityAccSix)) {
			scrollDownUsingElement(toothSensitivityAccSix);
			clickElementUsingJavaScript(toothSensitivityAccSix);
			visibilityOf(toothSensitivityAccActiveSix);
			Assert.assertTrue(elementIsDisplayed(toothSensitivityAccActiveSix));
			clickElementUsingJavaScript(toothSensitivityAccSix);
			visibilityOf(toothSensitivityAccCloseSix);
			Assert.assertTrue(elementIsDisplayed(toothSensitivityAccCloseSix));
			System.out.println("toothSensitivity Accordion Six verfied Successfully");
		} else {
			System.out.println("toothSensitivity Accordion Six is not presented in the page");
			throw new Exception("toothSensitivity Accordion Six is not presented in the page");
		}
	}
	
	public void clickToothSensitivityAccSeven() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(toothSensitivityAccSeven)) {
			scrollDownUsingElement(toothSensitivityAccSeven);
			clickElementUsingJavaScript(toothSensitivityAccSeven);
			visibilityOf(toothSensitivityAccActiveSeven);
			Assert.assertTrue(elementIsDisplayed(toothSensitivityAccActiveSeven));
			clickElementUsingJavaScript(toothSensitivityAccSeven);
			visibilityOf(toothSensitivityAccCloseSeven);
			Assert.assertTrue(elementIsDisplayed(toothSensitivityAccCloseSeven));
			System.out.println("toothSensitivity Accordion Seven verfied Successfully");
		} else {
			System.out.println("toothSensitivity Accordion Seven is not presented in the page");
			throw new Exception("toothSensitivity Accordion Seven is not presented in the page");
		}
	}
	
	
	
	
	
	
	public void clickAcidErosionAccTwo() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(acidErosionAccTwo)) {
			scrollDownUsingElement(acidErosionAccTwo);
			clickElementUsingJavaScript(acidErosionAccTwo);
			visibilityOf(acidErosionAccActiveTwo);
			Assert.assertTrue(elementIsDisplayed(acidErosionAccActiveTwo));
			clickElementUsingJavaScript(acidErosionAccTwo);
			visibilityOf(acidErosionAccCloseTwo);
			Assert.assertTrue(elementIsDisplayed(acidErosionAccCloseTwo));
			System.out.println("acidErosion Accordion two verfied Successfully");
		} else {
			System.out.println("acidErosion Accordion two is not presented in the page");
			throw new Exception("acidErosion Accordion two is not presented in the page");
		}
	}
	
	public void clickAcidErosionAccThree() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(acidErosionAccThree)) {
			scrollDownUsingElement(acidErosionAccThree);
			clickElementUsingJavaScript(acidErosionAccThree);
			visibilityOf(acidErosionAccActiveThree);
			Assert.assertTrue(elementIsDisplayed(acidErosionAccActiveThree));
			clickElementUsingJavaScript(acidErosionAccThree);
			visibilityOf(acidErosionAccCloseThree);
			Assert.assertTrue(elementIsDisplayed(acidErosionAccCloseThree));
			System.out.println("acidErosion Accordion Three verfied Successfully");
		} else {
			System.out.println("acidErosion Accordion Three is not presented in the page");
			throw new Exception("acidErosion Accordion Three is not presented in the page");
		}
	}
	
	
	public void clickSensitiveToothpasteAccTwo() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(sensitiveToothpasteAccTwo)) {
			scrollDownUsingElement(sensitiveToothpasteAccTwo);
			clickElementUsingJavaScript(sensitiveToothpasteAccTwo);
			visibilityOf(sensitiveToothpasteAccActiveTwo);
			Assert.assertTrue(elementIsDisplayed(sensitiveToothpasteAccActiveTwo));
			clickElementUsingJavaScript(sensitiveToothpasteAccTwo);
			visibilityOf(sensitiveToothpasteAccCloseTwo);
			Assert.assertTrue(elementIsDisplayed(sensitiveToothpasteAccCloseTwo));
			System.out.println("sensitiveToothpaste Accordion two verfied Successfully");
		} else {
			System.out.println("sensitiveToothpaste Accordion two is not presented in the page");
			throw new Exception("sensitiveToothpaste Accordion two is not presented in the page");
		}
	}
	
	public void clickSensitiveToothpasteAccThree() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(sensitiveToothpasteAccThree)) {
			scrollDownUsingElement(sensitiveToothpasteAccThree);
			clickElementUsingJavaScript(sensitiveToothpasteAccThree);
			visibilityOf(sensitiveToothpasteAccActiveThree);
			Assert.assertTrue(elementIsDisplayed(sensitiveToothpasteAccActiveThree));
			clickElementUsingJavaScript(sensitiveToothpasteAccThree);
			visibilityOf(sensitiveToothpasteAccCloseThree);
			Assert.assertTrue(elementIsDisplayed(sensitiveToothpasteAccCloseThree));
			System.out.println("sensitiveToothpaste Accordion Three verfied Successfully");
		} else {
			System.out.println("sensitiveToothpaste Accordion Three is not presented in the page");
			throw new Exception("sensitiveToothpaste Accordion Three is not presented in the page");
		}
	}
	
	public void clickSensitiveToothpasteAccFour() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(sensitiveToothpasteAccFour)) {
			scrollDownUsingElement(sensitiveToothpasteAccFour);
			clickElementUsingJavaScript(sensitiveToothpasteAccFour);
			visibilityOf(sensitiveToothpasteAccActiveFour);
			Assert.assertTrue(elementIsDisplayed(sensitiveToothpasteAccActiveFour));
			clickElementUsingJavaScript(sensitiveToothpasteAccFour);
			visibilityOf(sensitiveToothpasteAccCloseFour);
			Assert.assertTrue(elementIsDisplayed(sensitiveToothpasteAccCloseFour));
			System.out.println("sensitiveToothpaste Accordion Four verfied Successfully");
		} else {
			System.out.println("sensitiveToothpaste Accordion Four is not presented in the page");
			throw new Exception("sensitiveToothpaste Accordion Four is not presented in the page");
		}
	}
	
	public void clickSensitiveToothpasteAccFive() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(sensitiveToothpasteAccFive)) {
			scrollDownUsingElement(sensitiveToothpasteAccFive);
			clickElementUsingJavaScript(sensitiveToothpasteAccFive);
			visibilityOf(sensitiveToothpasteAccActiveFive);
			Assert.assertTrue(elementIsDisplayed(sensitiveToothpasteAccActiveFive));
			clickElementUsingJavaScript(sensitiveToothpasteAccFive);
			visibilityOf(sensitiveToothpasteAccCloseFive);
			Assert.assertTrue(elementIsDisplayed(sensitiveToothpasteAccCloseFive));
			System.out.println("sensitiveToothpaste Accordion Five verfied Successfully");
		} else {
			System.out.println("sensitiveToothpaste Accordion Five is not presented in the page");
			throw new Exception("sensitiveToothpaste Accordion Five is not presented in the page");
		}
	}
	
	public void clickSensitiveToothpasteAccSix() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(sensitiveToothpasteAccSix)) {
			scrollDownUsingElement(sensitiveToothpasteAccSix);
			clickElementUsingJavaScript(sensitiveToothpasteAccSix);
			visibilityOf(sensitiveToothpasteAccActiveSix);
			Assert.assertTrue(elementIsDisplayed(sensitiveToothpasteAccActiveSix));
			clickElementUsingJavaScript(sensitiveToothpasteAccSix);
			visibilityOf(sensitiveToothpasteAccCloseSix);
			Assert.assertTrue(elementIsDisplayed(sensitiveToothpasteAccCloseSix));
			System.out.println("sensitiveToothpaste Accordion Six verfied Successfully");
		} else {
			System.out.println("sensitiveToothpaste Accordion Six is not presented in the page");
			throw new Exception("sensitiveToothpaste Accordion Six is not presented in the page");
		}
	}
	
	public void clickSensitiveToothpasteAccSeven() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(sensitiveToothpasteAccSeven)) {
			scrollDownUsingElement(sensitiveToothpasteAccSeven);
			clickElementUsingJavaScript(sensitiveToothpasteAccSeven);
			visibilityOf(sensitiveToothpasteAccActiveSeven);
			Assert.assertTrue(elementIsDisplayed(sensitiveToothpasteAccActiveSeven));
			clickElementUsingJavaScript(sensitiveToothpasteAccSeven);
			visibilityOf(sensitiveToothpasteAccCloseSeven);
			Assert.assertTrue(elementIsDisplayed(sensitiveToothpasteAccCloseSeven));
			System.out.println("sensitiveToothpaste Accordion Seven verfied Successfully");
		} else {
			System.out.println("sensitiveToothpaste Accordion Seven is not presented in the page");
			throw new Exception("sensitiveToothpaste Accordion Seven is not presented in the page");
		}
	}
	
	public void clickSensitiveToothpasteAccEight() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(sensitiveToothpasteAccEight)) {
			scrollDownUsingElement(sensitiveToothpasteAccEight);
			clickElementUsingJavaScript(sensitiveToothpasteAccEight);
			visibilityOf(sensitiveToothpasteAccActiveEight);
			Assert.assertTrue(elementIsDisplayed(sensitiveToothpasteAccActiveEight));
			clickElementUsingJavaScript(sensitiveToothpasteAccEight);
			visibilityOf(sensitiveToothpasteAccCloseEight);
			Assert.assertTrue(elementIsDisplayed(sensitiveToothpasteAccCloseEight));
			System.out.println("sensitiveToothpaste Accordion Eight verfied Successfully");
		} else {
			System.out.println("sensitiveToothpaste Accordion Eight is not presented in the page");
			throw new Exception("sensitiveToothpaste Accordion Eight is not presented in the page");
		}
	}
	
	public void clickSensitiveToothpasteAccNine() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(sensitiveToothpasteAccNine)) {
			scrollDownUsingElement(sensitiveToothpasteAccNine);
			clickElementUsingJavaScript(sensitiveToothpasteAccNine);
			visibilityOf(sensitiveToothpasteAccActiveNine);
			Assert.assertTrue(elementIsDisplayed(sensitiveToothpasteAccActiveNine));
			clickElementUsingJavaScript(sensitiveToothpasteAccNine);
			visibilityOf(sensitiveToothpasteAccCloseNine);
			Assert.assertTrue(elementIsDisplayed(sensitiveToothpasteAccCloseNine));
			System.out.println("sensitiveToothpaste Accordion Nine verfied Successfully");
		} else {
			System.out.println("sensitiveToothpaste Accordion Nine is not presented in the page");
			throw new Exception("sensitiveToothpaste Accordion Nine is not presented in the page");
		}
	}
	
	public void clickSensitiveToothpasteAccTen() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(sensitiveToothpasteAccTen)) {
			scrollDownUsingElement(sensitiveToothpasteAccTen);
			clickElementUsingJavaScript(sensitiveToothpasteAccTen);
			visibilityOf(sensitiveToothpasteAccActiveTen);
			Assert.assertTrue(elementIsDisplayed(sensitiveToothpasteAccActiveTen));
			clickElementUsingJavaScript(sensitiveToothpasteAccTen);
			visibilityOf(sensitiveToothpasteAccCloseTen);
			Assert.assertTrue(elementIsDisplayed(sensitiveToothpasteAccCloseTen));
			System.out.println("sensitiveToothpaste Accordion Ten verfied Successfully");
		} else {
			System.out.println("sensitiveToothpaste Accordion Ten is not presented in the page");
			throw new Exception("sensitiveToothpaste Accordion Ten is not presented in the page");
		}
	}
	
	public void clickSensitiveToothpasteAccEleven() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(sensitiveToothpasteAccEleven)) {
			scrollDownUsingElement(sensitiveToothpasteAccEleven);
			clickElementUsingJavaScript(sensitiveToothpasteAccEleven);
			visibilityOf(sensitiveToothpasteAccActiveEleven);
			Assert.assertTrue(elementIsDisplayed(sensitiveToothpasteAccActiveEleven));
			clickElementUsingJavaScript(sensitiveToothpasteAccEleven);
			visibilityOf(sensitiveToothpasteAccCloseEleven);
			Assert.assertTrue(elementIsDisplayed(sensitiveToothpasteAccCloseEleven));
			System.out.println("sensitiveToothpaste Accordion Eleven verfied Successfully");
		} else {
			System.out.println("sensitiveToothpaste Accordion Eleven is not presented in the page");
			throw new Exception("sensitiveToothpaste Accordion Eleven is not presented in the page");
		}
	}
	
	
	
	
	public void clickSensodyneToothbrushAccTwo() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(sensodyneToothbrushAccTwo)) {
			scrollDownUsingElement(sensodyneToothbrushAccTwo);
			clickElementUsingJavaScript(sensodyneToothbrushAccTwo);
			visibilityOf(sensodyneToothbrushAccActiveTwo);
			Assert.assertTrue(elementIsDisplayed(sensodyneToothbrushAccActiveTwo));
			clickElementUsingJavaScript(sensodyneToothbrushAccTwo);
			visibilityOf(sensodyneToothbrushAccCloseTwo);
			Assert.assertTrue(elementIsDisplayed(sensodyneToothbrushAccCloseTwo));
			System.out.println("sensodyneToothbrush Accordion two verfied Successfully");
		} else {
			System.out.println("sensodyneToothbrush Accordion two is not presented in the page");
			throw new Exception("sensodyneToothbrush Accordion two is not presented in the page");
		}
	}
	
	public void clickSensodyneToothbrushAccThree() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(sensodyneToothbrushAccThree)) {
			scrollDownUsingElement(sensodyneToothbrushAccThree);
			clickElementUsingJavaScript(sensodyneToothbrushAccThree);
			visibilityOf(sensodyneToothbrushAccActiveThree);
			Assert.assertTrue(elementIsDisplayed(sensodyneToothbrushAccActiveThree));
			clickElementUsingJavaScript(sensodyneToothbrushAccThree);
			visibilityOf(sensodyneToothbrushAccCloseThree);
			Assert.assertTrue(elementIsDisplayed(sensodyneToothbrushAccCloseThree));
			System.out.println("sensodyneToothbrush Accordion Three verfied Successfully");
		} else {
			System.out.println("sensodyneToothbrush Accordion Three is not presented in the page");
			throw new Exception("sensodyneToothbrush Accordion Three is not presented in the page");
		}
	}
	
	public void clickSensodyneToothbrushAccFour() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(sensodyneToothbrushAccFour)) {
			scrollDownUsingElement(sensodyneToothbrushAccFour);
			clickElementUsingJavaScript(sensodyneToothbrushAccFour);
			visibilityOf(sensodyneToothbrushAccActiveFour);
			Assert.assertTrue(elementIsDisplayed(sensodyneToothbrushAccActiveFour));
			clickElementUsingJavaScript(sensodyneToothbrushAccFour);
			visibilityOf(sensodyneToothbrushAccCloseFour);
			Assert.assertTrue(elementIsDisplayed(sensodyneToothbrushAccCloseFour));
			System.out.println("sensodyneToothbrush Accordion Four verfied Successfully");
		} else {
			System.out.println("sensodyneToothbrush Accordion Four is not presented in the page");
			throw new Exception("sensodyneToothbrush Accordion Four is not presented in the page");
		}
	}
	
	public void clickSensodyneToothbrushAccFive() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(sensodyneToothbrushAccFive)) {
			scrollDownUsingElement(sensodyneToothbrushAccFive);
			clickElementUsingJavaScript(sensodyneToothbrushAccFive);
			visibilityOf(sensodyneToothbrushAccActiveFive);
			Assert.assertTrue(elementIsDisplayed(sensodyneToothbrushAccActiveFive));
			clickElementUsingJavaScript(sensodyneToothbrushAccFive);
			visibilityOf(sensodyneToothbrushAccCloseFive);
			Assert.assertTrue(elementIsDisplayed(sensodyneToothbrushAccCloseFive));
			System.out.println("sensodyneToothbrush Accordion Five verfied Successfully");
		} else {
			System.out.println("sensodyneToothbrush Accordion Five is not presented in the page");
			throw new Exception("sensodyneToothbrush Accordion Five is not presented in the page");
		}
	}
	
	public void clickSensodyneToothbrushAccSix() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(sensodyneToothbrushAccSix)) {
			scrollDownUsingElement(sensodyneToothbrushAccSix);
			clickElementUsingJavaScript(sensodyneToothbrushAccSix);
			visibilityOf(sensodyneToothbrushAccActiveSix);
			Assert.assertTrue(elementIsDisplayed(sensodyneToothbrushAccActiveSix));
			clickElementUsingJavaScript(sensodyneToothbrushAccSix);
			visibilityOf(sensodyneToothbrushAccCloseSix);
			Assert.assertTrue(elementIsDisplayed(sensodyneToothbrushAccCloseSix));
			System.out.println("sensodyneToothbrush Accordion Six verfied Successfully");
		} else {
			System.out.println("sensodyneToothbrush Accordion Six is not presented in the page");
			throw new Exception("sensodyneToothbrush Accordion Six is not presented in the page");
		}
	}
	
	public void clickFindYourStore() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(findYourStore)) {
			scrollDownUsingElement(findYourStore);
			clickElementUsingJavaScript(findYourStore);
			pageLoad();
		} else {
			System.out.println("Find your store is not presented in the page");
			throw new Exception("Find your store is not presented in the page");
		}
	}
	

}
