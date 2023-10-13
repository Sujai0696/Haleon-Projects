package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneFallSoupRecipesPage extends BaseClass{
	
	public SensodyneFallSoupRecipesPage() {
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
	
	@FindBy(xpath = "//*[@class='btn']//self::a[text()='Back to the article list']")
	private static WebElement backToArticleList;
	
	@FindBy(xpath = "//a[text()='Bucket List Tummy']")
	private static WebElement bucketListTummy;
	
	@FindBy(xpath = "//a[text()='fiber']")
	private static WebElement fiber;
	
	@FindBy(xpath = "//a[text()='Sensodyne Rapid Relief']")
	private static WebElement sensodyeRapidReleif;
	
	@FindBy(xpath = "//a[text()='Sensodyne']")
	private static WebElement sensodyne;
	
	@FindBy(xpath = "//strong[text()='Roasted Butternut Squash Soup']")
	private static WebElement roastedButternutSquashSoup;
	
	@FindBy(xpath = "//strong[text()='Simple Cauliflower Soup']")
	private static WebElement simpleCauliflowerSoup;
	
	@FindBy(xpath = "//strong[text()='Pumpkin-Apple Soup']")
	private static WebElement pumpkinAppleSoup;
	
	@FindBy(xpath = "//strong[text()='Broccoli and Kale Soup']")
	private static WebElement broccoliAndKaleSoup;
	
	@FindBy(xpath = "//strong[text()='Butternut Squash Soup With Chicken']")
	private static WebElement butternutSquashSoup;
	
	@FindBy(xpath = "//strong[text()='Healthified Broccoli Cheddar Soup']")
	private static WebElement healthifiedBroccoli;
	
	@FindBy(xpath = "//strong[text()='Carrot-Apple Soup']")
	private static WebElement carrotAppleSoup;
	
	@FindBy(xpath = "//a[text()='3 Nighttime Rituals To Reduce Stress']")
	private static WebElement relatedArticleOne;
	
	@FindBy(xpath = "//a[text()='Fall Treats And Your Oral Health']")
	private static WebElement relatedArticleTwo;
	
	@FindBy(xpath = "//a[text()='Ways holiday stress affects your body']")
	private static WebElement relatedArticleThree;
	
	@FindBy(xpath = "//a[text()='Things to say to increase positivity']")
	private static WebElement relatedArticleFour;
	
	
	
	public void clickCookieBtn() throws Exception {
		if (isElementPresent(cookieBtn)) {
			elementToBeClickable(cookieBtn);
			try {
				if (cookieBtn.isDisplayed()) {
					elementClick(cookieBtn);
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
	
	public void clickBackToTheArticleList() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(backToArticleList);
		clickElementUsingJavaScript(backToArticleList);
	}
	
	public void clickBucketListTummy() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(bucketListTummy);
		moveToElement(bucketListTummy);
		actionClick(bucketListTummy);
		Thread.sleep(3000);
	}
	
	public void clickFiberLink() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(fiber);
		elementToBeClickable(fiber);
		clickElementUsingJavaScript(fiber);
//		implicitWait();
//		waitForPageLoadJava();
		Thread.sleep(3000);
	}
	
	public void clickSensodyneRapidReleif() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(sensodyeRapidReleif);
		elementToBeClickable(sensodyeRapidReleif);
		clickElementUsingJavaScript(sensodyeRapidReleif);
//		implicitWait();
//		waitForPageLoadJava();
		Thread.sleep(3000);
	}
	
	public void clickSensodyne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(sensodyne);
		elementToBeClickable(sensodyne);
		clickElementUsingJavaScript(sensodyne);
//		implicitWait();
//		waitForPageLoadJava();
		Thread.sleep(3000);
	}
	
	public void clickRoastedButternutSquashSoup() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(roastedButternutSquashSoup);
		elementToBeClickable(roastedButternutSquashSoup);
		clickElementUsingJavaScript(roastedButternutSquashSoup);
//		implicitWait();
//		waitForPageLoadJava();
		Thread.sleep(3000);
	}
	
	public void clickSimpleCauliflowerSoup() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(simpleCauliflowerSoup);
		elementToBeClickable(simpleCauliflowerSoup);
		clickElementUsingJavaScript(simpleCauliflowerSoup);
//		implicitWait();
//		waitForPageLoadJava();
		Thread.sleep(3000);
	}
	
	public void clickPumpkinAppleSoup() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(pumpkinAppleSoup);
		elementToBeClickable(pumpkinAppleSoup);
		clickElementUsingJavaScript(pumpkinAppleSoup);
//		implicitWait();
//		waitForPageLoadJava();
		Thread.sleep(3000);
	}
	
	public void clickBroccoliAndKaleSoup() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(broccoliAndKaleSoup);
		elementToBeClickable(broccoliAndKaleSoup);
		clickElementUsingJavaScript(broccoliAndKaleSoup);
//		implicitWait();
//		waitForPageLoadJava();
		Thread.sleep(3000);
	}
	
	public void clickButternutSquashSoup() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(butternutSquashSoup);
		elementToBeClickable(butternutSquashSoup);
		clickElementUsingJavaScript(butternutSquashSoup);
//		implicitWait();
//		waitForPageLoadJava();
		Thread.sleep(3000);
	}
	
	public void clickHealthifiedBroccoli() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(healthifiedBroccoli);
		elementToBeClickable(healthifiedBroccoli);
		clickElementUsingJavaScript(healthifiedBroccoli);
//		implicitWait();
//		waitForPageLoadJava();
		Thread.sleep(3000);
	}
	
	public void clickCarrotAppleSoup() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(carrotAppleSoup);
		elementToBeClickable(carrotAppleSoup);
		clickElementUsingJavaScript(carrotAppleSoup);
//		implicitWait();
//		waitForPageLoadJava();
		Thread.sleep(3000);
	}

	public void clickRelatedArticleOne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(relatedArticleOne);
		clickElementUsingJavaScript(relatedArticleOne);
//		implicitWait();
//		waitForPageLoadJava();
		Thread.sleep(3000);
	}
	
	public void clickRelatedArticleTwo() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(relatedArticleTwo);
		clickElementUsingJavaScript(relatedArticleTwo);
//		implicitWait();
//		waitForPageLoadJava();
		Thread.sleep(3000);
	}
	
	public void clickRelatedArticleThree() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(relatedArticleThree);
		clickElementUsingJavaScript(relatedArticleThree);
//		implicitWait();
//		waitForPageLoadJava();
		Thread.sleep(3000);
	}
	
	public void clickRelatedArticleFour() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(relatedArticleFour);
		clickElementUsingJavaScript(relatedArticleFour);
//		implicitWait();
//		waitForPageLoadJava();
		Thread.sleep(3000);
	}
	
}
