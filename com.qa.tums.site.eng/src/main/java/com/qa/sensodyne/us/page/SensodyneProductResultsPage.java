package com.qa.sensodyne.us.page;

import javax.xml.xpath.XPath;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.stdDSA;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneProductResultsPage extends BaseClass{
	
	public SensodyneProductResultsPage() {
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
	
	@FindBy(xpath = "(//a[@href='/en-us/products/sensodyne-sensitivity-and-gum-fresh-clean-toothpaste/'])[2]")
	private static WebElement sensitivityAndGumPrdtOne;
	
	@FindBy(xpath = "(//a[@href='/en-us/products/sensodyne-sensitivity-and-gum-whitening-toothpaste/'])[2]")
	private static WebElement sensitivityAndGumPrdtTwo;
	
	@FindBy(xpath = "(//a[@href='/en-us/products/sensodyne-sensitivity-and-gum-mint-toothpaste/'])[3]")
	private static WebElement sensitivityAndGumPrdtThree;
	
	@FindBy(xpath = "(//a[@href='/en-us/products/sensodyne-sensitive-care-toothbrush/'])[1]")
	private static WebElement sensitiveCarePrdtFour;
	
	@FindBy(xpath = "(//a[@href='/en-us/products/sensodyne-rapid-relief-whitening-toothpaste/'])[2]")
	private static WebElement rapidReliefWhiteningPrdtFive;
	
	@FindBy(xpath = "(//a[@href='/en-us/products/sensodyne-rapid-relief-mint-toothpaste/'])[3]")
	private static WebElement rapidReliefMintPrdtSix;
	
	@FindBy(xpath = "(//a[@href='/en-us/products/sensodyne-rapid-relief-extra-fresh-toothpaste/'])[2]")
	private static WebElement rapidReliefExtraFreshPrdtSeven;
	
	@FindBy(xpath = "(//a[@href='/en-us/products/sensodyne-repair-protect-whitening-toothpaste/'])[2]")
	private static WebElement repairAndProtectWhiteningPrdtEight;
	
	@FindBy(xpath = "(//a[@href='/en-us/products/sensodyne-repair-protect-extra-fresh-toothpaste/'])[2]")
	private static WebElement repairAndProtectExtraFreshPrdtNine;
	
	@FindBy(xpath = "(//a[@href='/en-us/products/sensodyne-repair-protect-toothpaste/'])[2]")
	private static WebElement repairAndProtectPrdtTen;
	
	@FindBy(xpath = "(//a[@href='/en-us/products/sensodyne-complete-protection-extra-fresh-toothpaste/'])[2]")
	private static WebElement completeProtectionExtraFreshPrdtEleven;
	
	@FindBy(xpath = "(//a[@href='/en-us/products/sensodyne-complete-protection-toothpaste/'])[2]")
	private static WebElement completeProtectionPrdtTwelve;
	
	@FindBy(xpath = "(//a[@href='/en-us/products/sensodyne-true-white-extra-fresh-toothpaste/'])[2]")
	private static WebElement trueWhiteExtraFreshPrdtThirteen;
	
	@FindBy(xpath = "(//a[@href='/en-us/products/sensodyne-true-white-mint-toothpaste/'])[2]")
	private static WebElement trueWhiteMintPrdtFourteen;
	
	@FindBy(xpath = "(//a[@href='/en-us/products/sensodyne-deep-clean-toothpaste/'])[2]")
	private static WebElement deepCleanPrdtFifteen;
	
	@FindBy(xpath = "(//a[@href='/en-us/products/sensodyne-extra-whitening-toothpaste/'])[2]")
	private static WebElement extraWhiteningPrdtSixteen;
	
	@FindBy(xpath = "(//a[@href='/en-us/products/sensodyne-fresh-mint-toothpaste/'])[2]")
	private static WebElement freshMintPrdtSeventeen;
	
	@FindBy(xpath = "(//a[@href='/en-us/products/sensodyne-full-protection-toothpaste/'])[2]")
	private static WebElement fullProtectionPrdtEighteen;
	
	@FindBy(xpath = "(//a[@href='/en-us/products/sensodyne-tartar-control-toothpaste/'])[2]")
	private static WebElement tartarControlPrdtNineteen;
	
	@FindBy(xpath = "(//a[@href='/en-us/products/sensodyne-fresh-impact-toothpaste/'])[2]")
	private static WebElement freshImpactPrdtTwenty;
	
	@FindBy(xpath = "(//a[@href='https://www.pronamel.us/products/gentle-whitening-toothpaste/'])[1]")
	private static WebElement pronamelGentleWhiteningPrdtTwentyOne;
	
	@FindBy(xpath = "(//a[@href='https://www.pronamel.us/products/multi-action-toothpaste/'])[1]")
	private static WebElement pronamelMultiActionPrdtTwentyTwo;
	
	@FindBy(xpath = "(//a[@href='https://www.pronamel.us/products/fresh-breath-toothpaste/'])[1]")
	private static WebElement pronamelFreshBreathPrdtTwentyThree;
	
	@FindBy(xpath = "(//a[@href='https://www.pronamel.us/products/daily-protection-toothpaste/'])[1]")
	private static WebElement pronamelDailyProtectionPrdtTwentyFour;
	
	@FindBy(xpath = "(//a[@href='https://www.pronamel.us/products/strong-bright-mint-whitening-toothpaste/'])[1]")
	private static WebElement pronamelMineralBoostRefreshingPrdtTwentyFive;
	
	@FindBy(xpath = "https://www.pronamel.us/products/strong-bright-extra-fresh-whitening-toothpaste/")
	private static WebElement pronamelMineralBoostGentlePrdtTwentySix;
	
	@FindBy(xpath = "//img[contains(@src,'content/dam/cf-consumer-healthcare/sensodyne-v2/en_US/Product-pages/Landing_pages/desktop/sensitivity-gum-cleanfresh.png?auto=format')]")
	private static WebElement sensitivityAndGumImgOne;
	
	
	
	
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
	
	public void clickProductOne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(sensitivityAndGumPrdtOne);
		clickElementUsingJavaScript(sensitivityAndGumPrdtOne);
		pageLoad();
		
	}
	
	public void clickProductTwo() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(sensitivityAndGumPrdtTwo);
		clickElementUsingJavaScript(sensitivityAndGumPrdtTwo);
		pageLoad();
		
	}
	
	public void clickProductThree() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(sensitivityAndGumPrdtThree);
		clickElementUsingJavaScript(sensitivityAndGumPrdtThree);
		pageLoad();
		
	}
	
	public void clickProductFour() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(sensitiveCarePrdtFour);
		clickElementUsingJavaScript(sensitiveCarePrdtFour);
		pageLoad();
	}
	
	public void clickProductFive() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(rapidReliefWhiteningPrdtFive);
		clickElementUsingJavaScript(rapidReliefWhiteningPrdtFive);
		pageLoad();
	}
	
	public void clickProductSix() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(rapidReliefMintPrdtSix);
		clickElementUsingJavaScript(rapidReliefMintPrdtSix);
		pageLoad();
	}
	
	public void clickProductSeven() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(rapidReliefExtraFreshPrdtSeven);
		clickElementUsingJavaScript(rapidReliefExtraFreshPrdtSeven);
		pageLoad();
	}
	
	public void clickProductEight() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(repairAndProtectWhiteningPrdtEight);
		clickElementUsingJavaScript(repairAndProtectWhiteningPrdtEight);
		pageLoad();
	}
	
	public void clickProductNine() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(repairAndProtectExtraFreshPrdtNine);
		clickElementUsingJavaScript(repairAndProtectExtraFreshPrdtNine);
		pageLoad();
	}
	
	public void clickProductTen() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(repairAndProtectPrdtTen);
		clickElementUsingJavaScript(repairAndProtectPrdtTen);
		pageLoad();
	}
	
	public void clickProductEleven() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(completeProtectionExtraFreshPrdtEleven);
		clickElementUsingJavaScript(completeProtectionExtraFreshPrdtEleven);
		pageLoad();
	}
	
	public void clickProductTwelve() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(completeProtectionPrdtTwelve);
		clickElementUsingJavaScript(completeProtectionPrdtTwelve);
		pageLoad();
	}
	
	public void clickProductThirteen() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(trueWhiteExtraFreshPrdtThirteen);
		clickElementUsingJavaScript(trueWhiteExtraFreshPrdtThirteen);
		pageLoad();
	}
	
	public void clickProductFourteen() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(trueWhiteMintPrdtFourteen);
		clickElementUsingJavaScript(trueWhiteMintPrdtFourteen);
		pageLoad();
	}
	
	public void clickProductFifteen() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(deepCleanPrdtFifteen);
		clickElementUsingJavaScript(deepCleanPrdtFifteen);
		pageLoad();
	}
	
	public void clickProductSixteen() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(extraWhiteningPrdtSixteen);
		clickElementUsingJavaScript(extraWhiteningPrdtSixteen);
		pageLoad();
	}
	
	public void clickProductSeventeen() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(freshMintPrdtSeventeen);
		clickElementUsingJavaScript(freshMintPrdtSeventeen);
		pageLoad();
	}
	
	public void clickProductEighteen() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(fullProtectionPrdtEighteen);
		clickElementUsingJavaScript(fullProtectionPrdtEighteen);
		pageLoad();
	}
	
	public void clickProductNineteen() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(tartarControlPrdtNineteen);
		clickElementUsingJavaScript(tartarControlPrdtNineteen);
		pageLoad();
	}
	
	public void clickProductTwenty() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(freshImpactPrdtTwenty);
		clickElementUsingJavaScript(freshImpactPrdtTwenty);
		pageLoad();
	}
	
	public void clickProductTwentyOne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(pronamelGentleWhiteningPrdtTwentyOne);
		clickElementUsingJavaScript(pronamelGentleWhiteningPrdtTwentyOne);
		pageLoad();
	}
	
	public void clickProductTwentyTwo() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(pronamelMultiActionPrdtTwentyTwo);
		clickElementUsingJavaScript(pronamelMultiActionPrdtTwentyTwo);
		pageLoad();
	}
	
	public void clickProductTwentyThree() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(pronamelFreshBreathPrdtTwentyThree);
		clickElementUsingJavaScript(pronamelFreshBreathPrdtTwentyThree);
		pageLoad();
	}
	
	public void clickProductTwentyFour() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(pronamelDailyProtectionPrdtTwentyFour);
		clickElementUsingJavaScript(pronamelDailyProtectionPrdtTwentyFour);
		pageLoad();
	}
	
	public void clickProductTwentyFive() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(pronamelMineralBoostRefreshingPrdtTwentyFive);
		clickElementUsingJavaScript(pronamelMineralBoostRefreshingPrdtTwentyFive);
		pageLoad();
	}
	
	public void clickProductTwentySix() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(pronamelMineralBoostGentlePrdtTwentySix);
		clickElementUsingJavaScript(pronamelMineralBoostGentlePrdtTwentySix);
		pageLoad();
	}
	
	public void clickImageOne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(sensitivityAndGumPrdtOne);
		Assert.assertTrue(elementIsDisplayed(sensitivityAndGumImgOne));
//		clickElementUsingJavaScript(sensitivityAndGumImgOne);
		pageLoad();
	}
}
