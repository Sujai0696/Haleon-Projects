package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class PrephHemorrhoidFlareUpsPage extends BaseClass{
	
	public PrephHemorrhoidFlareUpsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//a[@href='/']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Articles']//self::a[@href='/learn-more/']")
	private static WebElement breadcrumbTwo;

	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']//self::li[text()=' Flare-Ups ']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "//a[text()='symptoms of a flare-up']//self::a[@href='/learn-more/hemorrhoid-symptoms/']")
	private static WebElement hyperLinkSymptomsOfAFlareUp;
	
	@FindBy(xpath = "//a[text()='PREPARATION H products for relief from hemorrhoid symptoms']//self::a[@href='/products/']")
	private static WebElement hyperLinkPreparationHProducts;
	
	@FindBy(xpath = "//a[text()='Medicated Wipes']//self::a[@href='/products/medicated-portable-wipes/']")
	private static WebElement hyperLinkMedicatedWipes;
	
	@FindBy(xpath = "//a[text()='home treatments']//self::a[@href='/learn-more/treating-flare-ups/']")
	private static WebElement hyperLinkHomeTreatments;
	
	@FindBy(xpath = "//a[text()='The Emotional Toll of Hemorrhoids']//self::a[@href='/learn-more/emotional-toll-of-hemorrhoids/']")
	private static WebElement relatedArticleOne;
	
	@FindBy(xpath = "//a[text()='What Are Hemorrhoids?']//self::a[@href='/learn-more/what-are-hemorrhoids/']")
	private static WebElement relatedArticleTwo;
	
	@FindBy(xpath = "//a[text()='6 Reasons You Have an Itchy Butt']//self::a[@href='/learn-more/6-reasons-you-have-itchy-butt/']")
	private static WebElement relatedArticleThree;
	
	@FindBy(xpath = "//button[text()='READ MORE']//self::button[@id='emotional-toll-link']")
	private static WebElement relatedArticleReadMoreOne;
	
	@FindBy(xpath = "//button[text()='READ MORE']//self::button[@id='what-are-hemorrhoids-link']")
	private static WebElement relatedArticleReadMoreTwo;
	
	@FindBy(xpath = "//button[text()='READ MORE']//self::button[@id='itchy-butt-link']")
	private static WebElement relatedArticleReadMoreThree;
	
	
	
	
	
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
			clickElementUsingJavaScript(breadcrumbTwo);
			pageLoad();
			System.out.println("Breadcrumb Two clicked successfully");
		} else {
			System.out.println("Breadcrumb Two is not presented in the page");
			throw new Exception("Breadcrumb Two is not presented in the page");
		}
	}

	public void clickBreadcrumbThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbThree)) {
			scrollDownUsingElement(breadcrumbThree);
			String href = breadcrumbThree.getAttribute("href");
	        boolean hasValidUrl = href != null && !href.isEmpty();
	        Assert.assertFalse(hasValidUrl);
			System.out.println("Breadcrumb Three verified successfully");
		} else {
			System.out.println("Breadcrumb Three is not presented in the page");
			throw new Exception("Breadcrumb Three is not presented in the page");
		}
	}
	
	
	public void clickHyperLinkSymptomsOfAFlareUp() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkSymptomsOfAFlareUp)) {
			scrollDownUsingElement(hyperLinkSymptomsOfAFlareUp);
			clickElementUsingJavaScript(hyperLinkSymptomsOfAFlareUp);
			pageLoad();
			System.out.println("hyperLinkSymptomsOfAFlareUp clicked successfully");
		} else {
			System.out.println("hyperLinkSymptomsOfAFlareUp is not presented in the page");
			throw new Exception("hyperLinkSymptomsOfAFlareUp is not presented in the page");
		}
	}
	
	public void clickHyperLinkPreparationHProducts() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkPreparationHProducts)) {
			scrollDownUsingElement(hyperLinkPreparationHProducts);
			clickElementUsingJavaScript(hyperLinkPreparationHProducts);
			pageLoad();
			System.out.println("hyperLinkPreparationHProducts clicked successfully");
		} else {
			System.out.println("hyperLinkPreparationHProducts is not presented in the page");
			throw new Exception("hyperLinkPreparationHProducts is not presented in the page");
		}
	}
	
	public void clickHyperLinkMedicatedWipes() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkMedicatedWipes)) {
			scrollDownUsingElement(hyperLinkMedicatedWipes);
			clickElementUsingJavaScript(hyperLinkMedicatedWipes);
			pageLoad();
			System.out.println("hyperLinkMedicatedWipes clicked successfully");
		} else {
			System.out.println("hyperLinkMedicatedWipes is not presented in the page");
			throw new Exception("hyperLinkMedicatedWipes is not presented in the page");
		}
	}
	
	public void clickHyperLinkHomeTreatments() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkHomeTreatments)) {
			scrollDownUsingElement(hyperLinkHomeTreatments);
			clickElementUsingJavaScript(hyperLinkHomeTreatments);
			pageLoad();
			System.out.println("hyperLinkHomeTreatments clicked successfully");
		} else {
			System.out.println("hyperLinkHomeTreatments is not presented in the page");
			throw new Exception("hyperLinkHomeTreatments is not presented in the page");
		}
	}
	
	public void clickRelatedArticleOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(relatedArticleOne)) {
			scrollDownUsingElement(relatedArticleOne);
			clickElementUsingJavaScript(relatedArticleOne);
			pageLoad();
			System.out.println("relatedArticleOne clicked successfully");
		} else {
			System.out.println("relatedArticleOne is not presented in the page");
			throw new Exception("relatedArticleOne is not presented in the page");
		}
	}
	
	public void clickRelatedArticleTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(relatedArticleTwo)) {
			scrollDownUsingElement(relatedArticleTwo);
			clickElementUsingJavaScript(relatedArticleTwo);
			pageLoad();
			System.out.println("relatedArticleTwo clicked successfully");
		} else {
			System.out.println("relatedArticleTwo is not presented in the page");
			throw new Exception("relatedArticleTwo is not presented in the page");
		}
	}
	
	public void clickRelatedArticleThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(relatedArticleThree)) {
			scrollDownUsingElement(relatedArticleThree);
			clickElementUsingJavaScript(relatedArticleThree);
			pageLoad();
			System.out.println("relatedArticleThree clicked successfully");
		} else {
			System.out.println("relatedArticleThree is not presented in the page");
			throw new Exception("relatedArticleThree is not presented in the page");
		}
	}
	
	public void clickRelatedArticleReadMoreOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(relatedArticleReadMoreOne)) {
			scrollDownUsingElement(relatedArticleReadMoreOne);
			clickElementUsingJavaScript(relatedArticleReadMoreOne);
			pageLoad();
			System.out.println("relatedArticleReadMoreOne clicked successfully");
		} else {
			System.out.println("relatedArticleReadMoreOne is not presented in the page");
			throw new Exception("relatedArticleReadMoreOne is not presented in the page");
		}
	}
	
	public void clickRelatedArticleReadMoreTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(relatedArticleReadMoreTwo)) {
			scrollDownUsingElement(relatedArticleReadMoreTwo);
			clickElementUsingJavaScript(relatedArticleReadMoreTwo);
			pageLoad();
			System.out.println("relatedArticleReadMoreTwo clicked successfully");
		} else {
			System.out.println("relatedArticleReadMoreTwo is not presented in the page");
			throw new Exception("relatedArticleReadMoreTwo is not presented in the page");
		}
	}
	
	public void clickRelatedArticleReadMoreThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(relatedArticleReadMoreThree)) {
			scrollDownUsingElement(relatedArticleReadMoreThree);
			clickElementUsingJavaScript(relatedArticleReadMoreThree);
			pageLoad();
			System.out.println("relatedArticleReadMoreThree clicked successfully");
		} else {
			System.out.println("relatedArticleReadMoreThree is not presented in the page");
			throw new Exception("relatedArticleReadMoreThree is not presented in the page");
		}
	}

}
