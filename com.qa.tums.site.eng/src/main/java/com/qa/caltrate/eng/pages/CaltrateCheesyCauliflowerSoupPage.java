package com.qa.caltrate.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CaltrateCheesyCauliflowerSoupPage extends BaseClass{
	
	public CaltrateCheesyCauliflowerSoupPage() {
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
	
	@FindBy(xpath = "//div[@class='richText component section default-style first odd last col-xs-12']//ancestor::a[normalize-space()='Calcium and Calcium Carbonate']")
	private  static WebElement tagsLinkOne;
	
	@FindBy(xpath = "//div[@class='richText component section default-style first odd last col-xs-12']//ancestor::a[normalize-space()='Recipes']")
	private  static WebElement tagsLinkTwo;
	
	@FindBy(xpath = "//span[text()='Surgeon General’s Report']//ancestor::div[contains(@class,'anchor-box even last col-xs-12')]")
	private static WebElement learnMore;
	
	@FindBy(xpath = "//div[contains(@class,'first odd last col-xs-12')]//following::img[contains(@src,'carousel-chewables')]")
	private static WebElement productCard;
	
	@FindBy(xpath = "//div[@class='richText component section p-m-t-1 first odd']//ancestor::a[normalize-space()='All Articles']")
	private static WebElement viewBySectionOne;
	
	@FindBy(xpath = "//div[@class='richText component section p-m-t-1 first odd']//ancestor::a[normalize-space()='All Recipes']")
	private static WebElement viewBySectionTwo;
	
	@FindBy(xpath = "//div[@class='richText component section p-m-t-1 first odd']//ancestor::a[normalize-space()='All Health Tips']")
	private static WebElement viewBySectionThree;
	
	@FindBy(xpath = "//div[@class='richText component section p-m-t-1 first odd']//ancestor::a[normalize-space()='All Interactive Tools']")
	private static WebElement viewBySectionFour;
	
	@FindBy(xpath = "//div[@class='richText component section p-m-t-1 even last']//ancestor::a[normalize-space()='Calcium and Calcium Carbonate']")
	private static WebElement viewByTopicOne;
	
	@FindBy(xpath = "//div[@class='richText component section p-m-t-1 even last']//ancestor::a[normalize-space()='Vitamin D']")
	private static WebElement viewByTopicTwo;
	
	@FindBy(xpath = "//div[@class='richText component section p-m-t-1 even last']//ancestor::a[normalize-space()='Osteoporosis']")
	private static WebElement viewByTopicThree;
	
	@FindBy(xpath = "//div[@class='richText component section p-m-t-1 even last']//ancestor::a[normalize-space()='Calcium Supplements']")
	private static WebElement viewByTopicFour;
	
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='Home']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Bone Health Central']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd ']//ancestor::a[text()='Recipes']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "//*[@class='breadcrumb-list-item even last is-current ']//self::li[normalize-space()='Cheesy Cauliflower Soup']")
	private static WebElement breadcrumbFour;
	
	
	
	
	
	
	
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
		}
	}

	public void clickGigyaForm() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(gigyaForm)) {
			elementToBeClickable(gigyaForm);
			try {
				if (gigyaForm.isDisplayed()) {
					elementClick(gigyaForm);
				}
				implicitWait();
				Assert.assertTrue(elementIsDisplayed(gigyaClose));
			} catch (Exception e) {
			}
		} else {
			System.out.println("gigya is not presented");
		}
	}
	
	public void clickTagsLinkOne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(tagsLinkOne);
		clickElementUsingJavaScript(tagsLinkOne);
	}
	
	public void clickTagsLinkTwo() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(tagsLinkTwo);
		clickElementUsingJavaScript(tagsLinkTwo);
	}
	
	public void clickLearnMore() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(learnMore);
		clickElementUsingJavaScript(learnMore);
	}
	
	public void clickProductCard() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(productCard);
		clickElementUsingJavaScript(productCard);
	}
	
	
	public void clickViewBySectionOne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(viewBySectionOne);
		clickElementUsingJavaScript(viewBySectionOne);
	}
	
	public void clickViewBySectionTwo() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(viewBySectionTwo);
		clickElementUsingJavaScript(viewBySectionTwo);
	}
	
	public void clickViewBySectionThree() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(viewBySectionThree);
		clickElementUsingJavaScript(viewBySectionThree);
	}
	
	public void clickViewBySectionFour() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(viewBySectionFour);
		clickElementUsingJavaScript(viewBySectionFour);
	}
	
	
	public void clickViewByTopicOne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(viewByTopicOne);
		clickElementUsingJavaScript(viewByTopicOne);
	}
	
	public void clickViewByTopicTwo() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(viewByTopicTwo);
		clickElementUsingJavaScript(viewByTopicTwo);
	}
	
	public void clickViewByTopicThree() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(viewByTopicThree);
		clickElementUsingJavaScript(viewByTopicThree);
	}
	
	public void clickViewByTopicFour() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(viewByTopicFour);
		clickElementUsingJavaScript(viewByTopicFour);
	}
	
	
	public void clickBreadcrumbOne ()throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(breadcrumbOne);
		clickElementUsingJavaScript(breadcrumbOne);
	}
	
	public void clickBreadcrumbTwo ()throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(breadcrumbTwo);
		clickElementUsingJavaScript(breadcrumbTwo);
	}
	
	public void clickBreadcrumbThree ()throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(breadcrumbThree);
		clickElementUsingJavaScript(breadcrumbThree);
	}
	
	public void textBreadcrumbFour()throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbFour)) {
			Assert.assertTrue(elementIsDisplayed(breadcrumbFour));
			System.out.println("Breadcrumb Four is verified");
		} else {
			throw new Exception("Bredcrumb Four is not presented in the page");
		}
	}
	
	
}
