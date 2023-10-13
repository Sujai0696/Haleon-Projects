package com.qa.sensodyne.ca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class SensodyneCaOralHealthTipsPage extends BaseClass{
	
	public SensodyneCaOralHealthTipsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='/en-ca/oral-health-tips/managing-sensitive-teeth/sensitivity-to-cold/']//img[@alt='Sugary ice pops can trigger tooth sensitivity']")
	private static WebElement bannerImg;
	
	@FindBy(xpath = "//a[@href='/en-ca/oral-health-tips/']//self::a[text()='All Articles']")
	private static WebElement oralHealthTipsLinkOne;
	
	@FindBy(xpath = "//a[@href='/en-ca/oral-health-tips/whitening-sensitive-teeth/']//self::a[text()='Whitening Sensitive Teeth']")
	private static WebElement oralHealthTipsLinkTwo;
	
	@FindBy(xpath = "//a[@href='/en-ca/oral-health-tips/recognising-sensitive-teeth/']//self::a[text()='Recognizing Sensitive Teeth']")
	private static WebElement oralHealthTipsLinkThree;
	
	@FindBy(xpath = "//a[@href='/en-ca/oral-health-tips/managing-sensitive-teeth/']//self::a[text()='Managing Sensitive Teeth']")
	private static WebElement oralHealthTipsLinkFour;
	
	@FindBy(xpath = "//a[@href='/en-ca/oral-health-tips/managing-sensitive-teeth/sensitivity-to-hot/']//ancestor::div[@class='image component section article-tile switchable-image zglazyload first odd col-xs-12 col-md-6']")
	private static WebElement featuredArticleOne;
	
	@FindBy(xpath = "//a[text()='4 Tips for Whitening Sensitive Teeth']//self::a[@href='/en-ca/oral-health-tips/whitening-sensitive-teeth/sensitive-teeth-whitening-tips/']//ancestor::div[@class='image component section related-box switchable-image zglazyload even last col-xs-12 col-md-3']")
	private static WebElement featuredArticleTwo;
	
	@FindBy(xpath = "//a[@href='/en-ca/oral-health-tips/recognising-sensitive-teeth/brushing-cause-sensitive-teeth/']//ancestor::div[@class='image component section article-tile switchable-image zglazyload first odd col-xs-12 col-md-6']")
	private static WebElement featuredArticleThree;
	
	@FindBy(xpath = "//a[text()='Is it a Cavity or Tooth Sensitivity?']//self::a[@href='/en-ca/oral-health-tips/recognising-sensitive-teeth/cavity-vs-sensitivity/']//ancestor::div[@class='image component section related-box zglazyload even col-xs-12 col-md-3']")
	private static WebElement featuredArticleFour;
	
	@FindBy(xpath = "//a[text()='Whitening Products and their Impact on Sensitive Teeth']//self::a[@href='/en-ca/oral-health-tips/whitening-sensitive-teeth/whitening-products-and-sensitive-teeth/']//ancestor::div[@class='image component section related-box zglazyload odd last col-xs-12 col-md-3']")
	private static WebElement featuredArticleFive;
	
	@FindBy(xpath = "//a[@href='/en-ca/oral-health-tips/managing-sensitive-teeth/sensitivity-to-cold/']//ancestor::div[@class='image component section article-tile switchable-image zglazyload first odd col-xs-12 col-md-6']")
	private static WebElement featuredArticleSix;
	
	@FindBy(xpath = "//a[@href='/en-ca/oral-health-tips/recognising-sensitive-teeth/assessing-tooth-pain/']//ancestor::div[@class='image component section article-tile switchable-image zglazyload even last col-xs-12 col-md-6']")
	private static WebElement featuredArticleSeven;
	
	@FindBy(xpath = "//a[@href='/en-ca/oral-health-tips/whitening-sensitive-teeth/what-to-know/']//ancestor::div[@class='image component section article-tile switchable-image zglazyload first odd last col-xs-12 col-md-6']")
	private static WebElement featuredArticleEight;
	
	@FindBy(xpath = "//a[text()='Find the Right Toothpaste']//self::a[@href='/en-ca/products/']")
	private static WebElement findTheRightToothpastebtn;
	
	
	
	
	public void clickBannerImg() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(bannerImg)) {
			scrollDownUsingElement(bannerImg);
			clickElementUsingJavaScript(bannerImg);
			pageLoad();
		} else {
			System.out.println("Banner Img is not presented in the page");
			throw new Exception("Banner Img is not presented in the page");
		}
	}
	
	public void clickOralHealthTipsLinkOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(oralHealthTipsLinkOne)) {
			scrollDownUsingElement(oralHealthTipsLinkOne);
			clickElementUsingJavaScript(oralHealthTipsLinkOne);
			pageLoad();
		} else {
			System.out.println("Oral Health Tips Link One is not presented in the page");
			throw new Exception("Oral Health Tips Link One is not presented in the page");
		}
	}
	
	public void clickOralHealthTipsLinkTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(oralHealthTipsLinkTwo)) {
			scrollDownUsingElement(oralHealthTipsLinkTwo);
			clickElementUsingJavaScript(oralHealthTipsLinkTwo);
			pageLoad();
		} else {
			System.out.println("Oral Health Tips Link Two is not presented in the page");
			throw new Exception("Oral Health Tips Link Two is not presented in the page");
		}
	}
	
	public void clickOralHealthTipsLinkThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(oralHealthTipsLinkThree)) {
			scrollDownUsingElement(oralHealthTipsLinkThree);
			clickElementUsingJavaScript(oralHealthTipsLinkThree);
			pageLoad();
		} else {
			System.out.println("Oral Health Tips Link Three is not presented in the page");
			throw new Exception("Oral Health Tips Link Three is not presented in the page");
		}
	}
	
	public void clickOralHealthTipsLinkFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(oralHealthTipsLinkFour)) {
			scrollDownUsingElement(oralHealthTipsLinkFour);
			clickElementUsingJavaScript(oralHealthTipsLinkFour);
			pageLoad();
		} else {
			System.out.println("Oral Health Tips Link Four is not presented in the page");
			throw new Exception("Oral Health Tips Link Four is not presented in the page");
		}
	}
	
	public void clickFeaturedArticleOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(featuredArticleOne)) {
			scrollDownUsingElement(featuredArticleOne);
			moveToElement(featuredArticleOne);
			actionClick(featuredArticleOne);
			pageLoad();
		} else {
			System.out.println("Featured Article One is not presented in the page");
			throw new Exception("Featured Article One is not presented in the page");
		}
	}
	
	public void clickFeaturedArticleTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(featuredArticleTwo)) {
			scrollDownUsingElement(featuredArticleTwo);
			moveToElement(featuredArticleTwo);
			actionClick(featuredArticleTwo);
			pageLoad();
		} else {
			System.out.println("Featured Article Two is not presented in the page");
			throw new Exception("Featured Article Two is not presented in the page");
		}
	}
	
	public void clickFeaturedArticleThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(featuredArticleThree)) {
			scrollDownUsingElement(featuredArticleThree);
			moveToElement(featuredArticleThree);
			actionClick(featuredArticleThree);
			pageLoad();
		} else {
			System.out.println("Featured Article Three is not presented in the page");
			throw new Exception("Featured Article Three is not presented in the page");
		}
	}
	
	public void clickFeaturedArticleFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(featuredArticleFour)) {
			scrollDownUsingElement(featuredArticleFour);
			moveToElement(featuredArticleFour);
			actionClick(featuredArticleFour);
			pageLoad();
		} else {
			System.out.println("Featured Article Four is not presented in the page");
			throw new Exception("Featured Article Four is not presented in the page");
		}
	}
	
	public void clickFeaturedArticleFive() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(featuredArticleFive)) {
			scrollDownUsingElement(featuredArticleFive);
			moveToElement(featuredArticleFive);
			actionClick(featuredArticleFive);
			pageLoad();
		} else {
			System.out.println("Featured Article Five is not presented in the page");
			throw new Exception("Featured Article Five is not presented in the page");
		}
	}
	
	public void clickFeaturedArticleSix() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(featuredArticleSix)) {
			scrollDownUsingElement(featuredArticleSix);
			moveToElement(featuredArticleSix);
			actionClick(featuredArticleSix);
			pageLoad();
		} else {
			System.out.println("Featured Article Six is not presented in the page");
			throw new Exception("Featured Article Six is not presented in the page");
		}
	}
	
	public void clickFeaturedArticleSeven() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(featuredArticleSeven)) {
			scrollDownUsingElement(featuredArticleSeven);
			moveToElement(featuredArticleSeven);
			actionClick(featuredArticleSeven);
			pageLoad();
		} else {
			System.out.println("Featured Article Seven is not presented in the page");
			throw new Exception("Featured Article Seven is not presented in the page");
		}
	}
	
	public void clickFeaturedArticleEight() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(featuredArticleEight)) {
			scrollDownUsingElement(featuredArticleEight);
			moveToElement(featuredArticleEight);
			actionClick(featuredArticleEight);
			pageLoad();
		} else {
			System.out.println("Featured Article Eight is not presented in the page");
			throw new Exception("Featured Article Eight is not presented in the page");
		}
	}
	
	public void clickFindTheRightToothpastebtn() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(findTheRightToothpastebtn)) {
			scrollDownUsingElement(findTheRightToothpastebtn);
			moveToElement(findTheRightToothpastebtn);
			actionClick(findTheRightToothpastebtn);
			pageLoad();
		} else {
			System.out.println("Find The Right Toothpaste btn is not presented in the page");
			throw new Exception("Find The Right Toothpaste btn is not presented in the page");
		}
	}
	
	
	

}
