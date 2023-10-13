package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CentrumHomePage extends BaseClass {
	
	public CentrumHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * Yogita's Code 
	 */
	
	@FindBy(xpath="//a[text()='Get Started']")
    private static WebElement getStarted;
	
	@FindBy(xpath="(//a[text()='Learn more'])[1]")
    private static WebElement learnmore1;
	
	@FindBy(xpath="(//a[text()='Learn more'])[2]")
    private static WebElement learnmore2;
	
	@FindBy(xpath="(//a[text()='About us'])")
    private static WebElement aboutus;
	
	@FindBy(xpath="(//a[text()='Learn'])[2]")
    private static WebElement learn3;
	
	@FindBy(xpath="//a[text()='View all']")
    private static WebElement viewall;
	
	
	/**
	 * Sujai's Code
	 */
	@FindBy(xpath = "//button[text()='Dismiss']")
	private static WebElement cookieBtn;
	
	@FindBy(xpath = "//h2[@class='heading']")
	private static WebElement gigyaForm;
	
	
	@FindBy(xpath = "(//div[@class='component-content'])[111]")
	private static WebElement btnMultivitaminscroll;
	
	@FindBy(xpath = "(//div[contains(@class,'richText component section border rounded-pill anchor-box')])[1]")
	private static WebElement roundedPillOne;
	
	@FindBy(xpath = "(//div[contains(@class,'richText component section border rounded-pill anchor-box')])[2]")
	private static WebElement roundedPillTwo;
	
	@FindBy(xpath = "(//div[contains(@class,'richText component section border rounded-pill anchor-box')])[3]")
	private static WebElement roundedPillThree;
	
	@FindBy(xpath = "(//div[contains(@class,'richText component section border rounded-pill anchor-box')])[4]")
	private static WebElement roundedPillFour;
	
	@FindBy(xpath = "(//div[contains(@class,'box component section bg-color-white border border')])[1]")
	private static WebElement featuredProductOne;
	
	@FindBy(xpath = "(//a[@class='btn btn-primary ps-widget ps-5eb06fe4f35bde0030585f00 ps-enabled'])[1]")
	private static WebElement buyNowOne;
	
	@FindBy(xpath = "//h2[@class='ps-product-name']")
	private static WebElement buyNowOneText;	
	
	@FindBy(xpath = "(//a[@class='compare-button default-compare'])[1]")
	private static WebElement compareOne;
	
	@FindBy(xpath = "(//div[contains(@class,'box component section bg-color-white border border')])[2]")
	private static WebElement featuredProductTwo;
	
	@FindBy(xpath = "(//a[@class='btn btn-primary ps-widget ps-5eb06fe4f35bde0030585f00 ps-enabled'])[2]")
	private static WebElement buyNowTwo;
	
	@FindBy(xpath = "//h2[text()='Centrum Silver Men 40ct']")
	private static WebElement buyNowTwoText;
	
	@FindBy(xpath = "(//a[@class='compare-button default-compare'])[2]")
	private static WebElement compareTwo;
	
	@FindBy(xpath = "(//div[contains(@class,'box component section bg-color-white border border')])[3]")
	private static WebElement featuredProductThree;
	
	@FindBy(xpath = "(//div[@class='component-content']//following::a[@class='btn btn-primary ps-widget ps-5eb06fe4f35bde0030585f00 ps-enabled'])[3]")
	private static WebElement buyNowThree;
	
	@FindBy(xpath = "//h2[text()='Centrum Kids MultiGummies in Tropical Punch Flavors']")
	private static WebElement buyNowThreeText;
	
	@FindBy(xpath = "(//a[@class='compare-button default-compare'])[3]")
	private static WebElement compareThree;
	
	@FindBy(xpath = "(//div[contains(@class,'box component section bg-color-white border border')])[4]")
	private static WebElement featuredProductFour;
	
	@FindBy(xpath = "(//a[@class='btn btn-primary ps-widget ps-5eb06fe4f35bde0030585f00 ps-enabled'])[4]")
	private static WebElement buyNowFour;
	
	@FindBy(xpath = "//h2[text()='Centrum MultiGummies Adult']")
	private static WebElement buyNowFourText;
	
	@FindBy(xpath = "(//a[@class='compare-button default-compare'])[4]")
	private static WebElement compareFour;
	
	
	
	/**
	 * Yogita's Code
	 */
	
	public void clickongetstarted() throws Exception {
		//scrollDownUsingElement(getStarted);
		moveToElement(getStarted);
		elementClick(getStarted);
	}
	public void clickonLearn1() throws Exception {
		scrollPageInUpAndDown();
		moveToElement(learnmore1);
		clickElementUsingJavaScript(learnmore1);
	}
	public void clickonLearn2() throws Exception {
		scrollPageInUpAndDown();
		moveToElement(learnmore2);
		elementClick(learnmore2);
	}	
	public void clickonabout() throws Exception {
		scrollPageInUpAndDown();
		moveToElement(aboutus);
		elementClick(aboutus);
	}	
	public void clickonlearn3() throws Exception {
		scrollPageInUpAndDown();
		moveToElement(learn3);
		elementClick(learn3);
	}
	public void clickonViewall() throws Exception {
		scrollPageInUpAndDown();
		moveToElement(viewall);
		clickElementUsingJavaScript(viewall);
	}

	/**
	 * Sujai's Code
	 */
	
	public void clickCookieBtn() {
		try {
			if (cookieBtn.isDisplayed()) {
				elementClick(cookieBtn);
			}
		} catch (NoSuchElementException e) {
			
		}
	}
	
	public void clickGigyaForm() {
		elementToBeClickable(gigyaForm);
		try {
			if (gigyaForm.isDisplayed()) {
				elementClick(gigyaForm);
			}
		} catch (NoSuchElementException e) {

		}
	}
	
	public void clickMultivitamins() throws Exception {
		scrollDownUsingElement(roundedPillOne);
		clickElementUsingJavaScript(roundedPillOne);
	}
	
	public void clickTargetedSupplements() throws Exception {
		scrollDownUsingElement(roundedPillTwo);
		clickElementUsingJavaScript(roundedPillTwo);
	}
	
	public void clickVitaminPack() throws Exception {
		scrollDownUsingElement(roundedPillThree);
		clickElementUsingJavaScript(roundedPillThree);
	}
	
	public void clickSeeAllProduct() throws Exception {
		scrollDownUsingElement(roundedPillFour);
		clickElementUsingJavaScript(roundedPillFour);
	}
	
	public void clickFeaturedProductOne() throws Exception {
		scrollDownUsingElement(featuredProductOne);
		clickElementUsingJavaScript(featuredProductOne);
		
	}

	public void buyNowAndCompareOne() throws Exception {
		scrollDownUsingElement(featuredProductOne);
		clickElementUsingJavaScript(buyNowOne);
		Assert.assertTrue(elementIsDisplayed(buyNowOneText));
		refreshWebPage();
		visibilityOf(compareOne);	
		clickElementUsingJavaScript(compareOne);
	}
	
	public void clickFeaturedProductTwo() throws Exception {
		scrollDownUsingElement(featuredProductTwo);
		clickElementUsingJavaScript(featuredProductTwo);
		
	}
	
	public void buyNowAndCompareTwo() throws Exception {
		scrollDownUsingElement(featuredProductOne);
		clickElementUsingJavaScript(buyNowTwo);
		Assert.assertTrue(elementIsDisplayed(buyNowOneText));
		refreshWebPage();
		visibilityOf(compareTwo);	
		clickElementUsingJavaScript(compareTwo);
	}
	
	
	public void clickFeaturedProductThree() throws Exception {
		scrollDownUsingElement(featuredProductThree);
		clickElementUsingJavaScript(featuredProductThree);
		
	}
	
	public void buyNowAndCompareThree() throws Exception {
		scrollDownUsingElement(featuredProductOne);
		clickElementUsingJavaScript(buyNowThree);
		Assert.assertTrue(elementIsDisplayed(buyNowOneText));
		refreshWebPage();
		visibilityOf(compareThree);	
		clickElementUsingJavaScript(compareThree);
	}
	
	public void clickFeaturedProductFour() throws Exception {
		scrollDownUsingElement(featuredProductFour);
		clickElementUsingJavaScript(featuredProductFour);
		
	}
	
	public void buyNowAndCompareFour() throws Exception {
		scrollDownUsingElement(featuredProductOne);
		clickElementUsingJavaScript(buyNowFour);
		Assert.assertTrue(elementIsDisplayed(buyNowOneText));
		refreshWebPage();
		visibilityOf(compareFour);	
		clickElementUsingJavaScript(compareFour);
	}
}
