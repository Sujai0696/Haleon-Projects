package com.qa.sensodyne.ca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class SensodyneCaWhiteningProductsAndSensitiveTeethPage extends BaseClass{
	
	public SensodyneCaWhiteningProductsAndSensitiveTeethPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='home']//self::a[@href='/en-ca/']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Oral Health Tips']//self::a[@href='/en-ca/oral-health-tips/']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd ']//ancestor::a[text()='Whitening Sensitive Teeth']//self::a[@href='/en-ca/oral-health-tips/whitening-sensitive-teeth/']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even last is-current ']//ancestor::a[text()='Whitening Products and their Impact on Sensitive Teeth']//self::a[@href='/en-ca/oral-health-tips/whitening-sensitive-teeth/whitening-products-and-sensitive-teeth/']")
	private static WebElement breadcrumbFour;
	
	@FindBy(xpath = "//div[@class='richText component section default-style first odd col-xs-12 col-md-6']//ancestor::a[normalize-space()='Sensodyne Brilliant Whitening']//self::a[@href='/en-ca/products/brilliant-whitening-toothpaste/']")
	private static WebElement hyperLinkSensodyneBrilliantWhitening;
	
	@FindBy(xpath = "//span[@class='dark-blue-txt-normal-20']//ancestor::a[@href='/en-ca/products/brilliant-whitening-toothpaste/']")
	private static WebElement relatedArticleOne;
	
	@FindBy(xpath = "//span[@class='dark-blue-txt-normal-20']//ancestor::a[@href='/en-ca/oral-health-tips/whitening-sensitive-teeth/what-to-know/']")
	private static WebElement relatedArticleTwo;
	
	@FindBy(xpath = "//span[@class='dark-blue-txt-normal-20']//ancestor::a[@href='/en-ca/about-sensitivity/causes/']")
	private static WebElement relatedArticleThree;
	
	
	
	
	
	
	
	
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
			clickElementUsingJavaScript(breadcrumbThree);
			pageLoad();
			System.out.println("Breadcrumb Three clicked successfully");
		} else {
			System.out.println("Breadcrumb Three is not presented in the page");
			throw new Exception("Breadcrumb Three is not presented in the page");
		}
	}
	
	
	public void clickBreadcrumbFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbFour)) {
			scrollDownUsingElement(breadcrumbFour);
			clickElementUsingJavaScript(breadcrumbFour);
			pageLoad();
			System.out.println("Breadcrumb Four clicked successfully");
		} else {
			System.out.println("Breadcrumb Four is not presented in the page");
			throw new Exception("Breadcrumb Four is not presented in the page");
		}
	}
	
	public void clickHyperLinkSensodyneBrilliantWhitening() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkSensodyneBrilliantWhitening)) {
			scrollDownUsingElement(hyperLinkSensodyneBrilliantWhitening);
			clickElementUsingJavaScript(hyperLinkSensodyneBrilliantWhitening);
			pageLoad();
			System.out.println("HyperLinkSensodyneBrilliantWhitening clicked successfully");
		} else {
			System.out.println("HyperLink Sensodyne Brilliant Whitening is not presented in the page");
			throw new Exception("HyperLink Sensodyne Brilliant Whitening is not presented in the page");
		}
	}
	
	public void clickRelatedArticleOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(relatedArticleOne)) {
			scrollDownUsingElement(relatedArticleOne);
			clickElementUsingJavaScript(relatedArticleOne);
			pageLoad();
			System.out.println("Related Article One clicked successfully");
		} else {
			System.out.println("Related Article One is not presented in the page");
			throw new Exception("Related Article One is not presented in the page");
		}
	}
	
	public void clickRelatedArticleTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(relatedArticleTwo)) {
			scrollDownUsingElement(relatedArticleTwo);
			clickElementUsingJavaScript(relatedArticleTwo);
			pageLoad();
			System.out.println("Related Article Two clicked successfully");
		} else {
			System.out.println("Related Article Two is not presented in the page");
			throw new Exception("Related Article Two is not presented in the page");
		}
	}
	
	public void clickRelatedArticleThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(relatedArticleThree)) {
			scrollDownUsingElement(relatedArticleThree);
			elementClick(relatedArticleThree);
			clickElementUsingJavaScript(relatedArticleThree);
			pageLoad();
			System.out.println("Related Article Three clicked successfully");
		} else {
			System.out.println("Related Article Three is not presented in the page");
			throw new Exception("Related Article Three is not presented in the page");
		}
	}
	

}
