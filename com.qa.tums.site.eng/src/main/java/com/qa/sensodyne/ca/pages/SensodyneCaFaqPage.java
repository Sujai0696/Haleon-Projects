package com.qa.sensodyne.ca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class SensodyneCaFaqPage extends BaseClass{
	
	public SensodyneCaFaqPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='home']//self::a[@href='/en-ca/']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even last is-current ']//ancestor::a[text()='FAQs']//self::a[@href='/en-ca/faqs/']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//a[text()='Tooth sensitivity, or dentin hypersensitivity']//self::a[@href='/en-ca/about-sensitivity/']")
	private static WebElement toothSensitivityAccOneHLOne;
	
	@FindBy(xpath = "//a[text()='softer, inner part of the tooth called “dentin\" becomes exposed']//self::a[@href='/en-ca/about-sensitivity/causes/']")
	private static WebElement toothSensitivityAccOneHLTwo;
	
	@FindBy(xpath = "//a[text()='Sensodyne toothpaste']//self::a[@href='/en-ca/products/']")
	private static WebElement toothSensitivityAccOneHLThree;
	
	@FindBy(xpath = "//a[text()='sharp shock, jolt, or even minor twinge of pain']//self::a[@href='/en-ca/about-sensitivity/why-do-my-teeth-hurt/']")
	private static WebElement toothSensitivityAccTwoHLOne;
	
	@FindBy(xpath = "//a[text()='Learn more about the symptoms of sensitivity and what can cause it.']//self::a[@href='/en-ca/about-sensitivity/causes/']")
	private static WebElement toothSensitivityAccTwoHLTwo;
	
	@FindBy(xpath = "//a[text()='many different causes of tooth pain']//self::a[@href='/en-ca/about-sensitivity/why-do-my-teeth-hurt/#othercauses']")
	private static WebElement toothSensitivityAccFiveHLOne;
	
	@FindBy(xpath = "//p[contains(text(),'Switching to a daily sensitivity toothpaste, like ')]//a[normalize-space()='Sensodyne']")
	private static WebElement toothSensitivityAccSevenHLOne;
	
	@FindBy(xpath = "//a[text()='specially formulated for tooth sensitivity relief']//self::a[@href='/en-ca/about-sensodyne/ingredients/']")
	private static WebElement toothSensitivityAccSevenHLTwo;
	
	@FindBy(xpath = "//p[contains(text(),'is the No.1 dentist recommended toothpaste for sen')]//a[normalize-space()='Sensodyne']//self::a[@href='/en-ca/products/']")
	private static WebElement toothSensitivityAccEightHLOne;
	
	@FindBy(xpath = "//a[text()='in as little as 60 seconds']//preceding::a[text()='Sensodyne Rapid Relief']//self::a[@href='/en-ca/products/rapid-relief-toothpaste/']")
	private static WebElement howSensodyneWorksAccOneHLOne;
	
	@FindBy(xpath = "//a[text()='in as little as 60 seconds']//self::a[@href='/en-ca/products/rapid-relief-toothpaste/']")
	private static WebElement howSensodyneWorksAccOneHLTwo;
	
	@FindBy(xpath = "//p[contains(text(),'Use')]//a[normalize-space()='Sensodyne']//self::a[@href='/en-ca/products/']")
	private static WebElement howSensodyneWorksAccTwoHLOne;
	
	@FindBy(xpath = "//div[@class='paragraphSystem item2 content']//a[contains(text(),'Learn more about the ingredients in Sensodyne and ')]//self::a[@href='/en-ca/about-sensodyne/ingredients/']")
	private static WebElement howSensodyneWorksAccTwoHLTwo;
	
	@FindBy(xpath = "//div[@class='paragraphSystem item3 content']//a[normalize-space()='Learn more about all the Sensodyne toothpastes.']//self::a[@href='/en-ca/products/']")
	private static WebElement howSensodyneWorksAccThreeHLOne;
	
	@FindBy(xpath = "//div[@class='paragraphSystem item0 content']//a[normalize-space()='Learn more about all the Sensodyne toothpastes.']//self::a[@href='/en-ca/products/']")
	private static WebElement sensodyneIngredientsAccOneHLOne;
	
	@FindBy(xpath = "//div[@class='paragraphSystem item1 content']//a[contains(text(),'Learn more about the ingredients in Sensodyne and ')]//self::a[@href='/en-ca/about-sensodyne/ingredients/']")
	private static WebElement sensodyneIngredientsAccTwoHLOne;
	
	@FindBy(xpath = "(//a[normalize-space()='Sensodyne Sensitivity & Gum'])[1]//self::a[@href='/en-ca/products/sensitivity-and-gum/']")
	private static WebElement sensodyneIngredientsAccThreeHLOne;
	
	@FindBy(xpath = "(//a[normalize-space()='Sensodyne Complete Protection'])[1]//self::a[@href='/en-ca/products/complete-protection-original/']")
	private static WebElement sensodyneIngredientsAccThreeHLTwo;
	
	@FindBy(xpath = "//p[text()=' toothpastes all contain stannous fluoride.']//self::a[text()='Sensodyne Rapid Relief']//self::a[@href='/en-ca/products/rapid-relief-toothpaste/']")
	private static WebElement sensodyneIngredientsAccThreeHLThree;
	
	@FindBy(xpath = "//p[contains(text(),'NovaMin (Calcium sodium phosphosilicate) helps to ')]//a[normalize-space()='Sensodyne Repair and Protect']//self::a[@href='/en-ca/products/repair-and-protect-original/']")
	private static WebElement sensodyneIngredientsAccFourHLOne;
	
	@FindBy(xpath = "//a[text()='Sensodyne Essential Care']//self::a[@href='/en-ca/products/#essential-care']")
	private static WebElement sensodyneIngredientsAccFiveHLOne;
	
	
	
	
	@FindBy(xpath = "//div[@class='richText component section default-style first odd last col-xs-12']//a[normalize-space()='Sensodyne Brilliant Whitening']//self::a[@href='/en-ca/products/brilliant-whitening-toothpaste/']")
	private static WebElement sensodyneProductsAccOneHLOne;
	
	@FindBy(xpath = "//a[normalize-space()='Sensodyne Fresh Mint']//self::a[@href='/en-ca/products/fresh-mint-toothpaste/']")
	private static WebElement sensodyneProductsAccOneHLTwo;
	
	@FindBy(xpath = "//a[text()='Sensodyne Multi-Action Whitening']//self::a[@href='/en-ca/products/multi-action-whitening/']")
	private static WebElement sensodyneProductsAccOneHLThree;
	
	@FindBy(xpath = "//div[@class='richText component section default-style first odd last col-xs-12']//a[normalize-space()='Sensodyne Deep Clean']//self::a[@href='/en-ca/products/deep-clean-toothpaste/']")
	private static WebElement sensodyneProductsAccOneHLFour;
	
	@FindBy(xpath = "//a[normalize-space()='Sensodyne Whitening & Tartar']//self::a[@href='/en-ca/products/whitening-plus-tartar-fighting-toothpaste/']")
	private static WebElement sensodyneProductsAccOneHLFive;
	
	@FindBy(xpath = "//a[text()='Sensodyne Ultra Fresh']//self::a[@href='/en-ca/products/ultra-fresh-toothpaste/']")
	private static WebElement sensodyneProductsAccOneHLSix;
	
	@FindBy(xpath = "//li[contains(text(),'(also available in')]//a[normalize-space()='Sensodyne Rapid Relief']//self::a[@href='/en-ca/products/rapid-relief-toothpaste/']")
	private static WebElement sensodyneProductsAccOneHLSeven;
	
	@FindBy(xpath = "//li[contains(text(),'(also available in')]//a[normalize-space()='Rapid Relief Extra Fresh']//self::a[@href='/en-ca/products/rapid-relief-extra-fresh-toothpaste/']")
	private static WebElement sensodyneProductsAccOneHLEight;
	
	@FindBy(xpath = "//li[contains(text(),'(also available in')]//a[normalize-space()='Rapid Relief Whitening']//self::a[@href='/en-ca/products/sensodyne-rapid-relief-whitening/']")
	private static WebElement sensodyneProductsAccOneHLNine;
	
	@FindBy(xpath = "//li[contains(text(),'(also available in')]//a[normalize-space()='Sensodyne Repair and Protect']//self::a[@href='/en-ca/products/repair-and-protect-original/']")
	private static WebElement sensodyneProductsAccOneHLTen;
	
	@FindBy(xpath = "//li[contains(text(),'(also available in')]//a[normalize-space()='Repair and Protect Extra Fresh']//self::a[@href='/en-ca/products/repair-and-protect-extra-fresh-toothpaste/']")
	private static WebElement sensodyneProductsAccOneHLEleven;
	
	@FindBy(xpath = "//li[contains(text(),'(also available in')]//a[normalize-space()='Repair and Protect Whitening']//self::a[@href='/en-ca/products/repair-and-protect-whitening/']")
	private static WebElement sensodyneProductsAccOneHLTweleve;
	
	@FindBy(xpath = "(//li[contains(text(),'(also available in')]//a[normalize-space()='Sensodyne Complete Protection']//self::a[@href='/en-ca/products/complete-protection-original/'])[1]")
	private static WebElement sensodyneProductsAccOneHLThirteen;
	
	@FindBy(xpath = "//a[normalize-space()='Complete protection Extra Fresh']//self::a[@href='/en-ca/products/complete-protection-extra-fresh/']")
	private static WebElement sensodyneProductsAccOneHLFourteen;
	
	@FindBy(xpath = "(//a[text()='Sensodyne Sensitivity & Gum']//self::a[@href='/en-ca/products/sensitivity-and-gum/'])[2]")
	private static WebElement sensodyneProductsAccOneHLFifteen;
	
	@FindBy(xpath = "//a[text()='Sensitivity & Gum Whitening']//self::a[@href='/en-ca/products/sensitivity-and-gum-whitening/']")
	private static WebElement sensodyneProductsAccOneHLSixteen;
	
	@FindBy(xpath = "//p[contains(text(),'has a unique formula that actively targets sensiti')]//a[normalize-space()='Sensodyne Rapid Relief']//self::a[@href='/en-ca/products/rapid-relief-toothpaste/']")
	private static WebElement sensodyneProductsAccTwoHLOne;
	
	@FindBy(xpath = "//a[normalize-space()='Extra Fresh']//self::a[@href='/en-ca/products/rapid-relief-extra-fresh-toothpaste/']")
	private static WebElement sensodyneProductsAccThreeHLOne;
	
	@FindBy(xpath = "//a[normalize-space()='Whitening']//self::a[@href='/en-ca/products/sensodyne-rapid-relief-whitening/']")
	private static WebElement sensodyneProductsAccThreeHLTwo;
	
	@FindBy(xpath = "//p[contains(text(),'Use')]//a[normalize-space()='Sensodyne Rapid Relief']//self::a[@href='/en-ca/products/rapid-relief-toothpaste/']")
	private static WebElement sensodyneProductsAccFourHLOne;
	
	@FindBy(xpath = "//a[normalize-space()='Sensodyne Whitening plus Tartar fighting']//self::a[@href='/en-ca/products/multi-action-whitening/']")
	private static WebElement sensodyneProductsAccSixHLOne;
	
	@FindBy(xpath = "//a[normalize-space()='major retail outlets, in-store, and online']//self::a[@href='/en-ca/where-to-buy/']")
	private static WebElement sensodyneProductsAccSixHLTwo;
	
	
	
	
	@FindBy(xpath = "//div[@class='richText component section default-style first odd last col-xs-12 col-md-12']//a[normalize-space()='Sensodyne Brilliant Whitening']//self::a[@href='/en-ca/products/brilliant-whitening-toothpaste/']")
	private static WebElement sensodyneAndWhiteningAccOneHLOne;
	
	@FindBy(xpath = "//a[normalize-space()='Sensodyne Repair and Protect Whitening']//self::a[@href='/en-ca/products/repair-and-protect-whitening/']")
	private static WebElement sensodyneAndWhiteningAccOneHLTwo;
	
	@FindBy(xpath = "(//a[text()='Sensodyne Complete Protection']//self::a[@href='/en-ca/products/complete-protection-original/'])[3]")
	private static WebElement sensodyneAndWhiteningAccOneHLThree;
	
	@FindBy(xpath = "//a[text()='Complete Protection Extra Fresh']//self::a[@href='/en-ca/products/complete-protection-extra-fresh/']")
	private static WebElement sensodyneAndWhiteningAccOneHLFour;
	
	@FindBy(xpath = "//div[@class='richText component section default-style first odd last col-xs-12 col-md-12']//a[normalize-space()='Sensodyne Deep Clean']//self::a[@href='/en-ca/products/deep-clean-toothpaste/']")
	private static WebElement sensodyneAndWhiteningAccOneHLFive;
	
	@FindBy(xpath = "//a[@title='Sensodyne and Whitening - Multi-Action Whitening']//self::a[@href='/en-ca/products/multi-action-original/']")
	private static WebElement sensodyneAndWhiteningAccOneHLSix;
	
	
	@FindBy(xpath = "//a[@href='/en-ca/products/']//img")
	private static WebElement findYourToothpaste;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
	
	public void clickToothSensitivityAccOneHLOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(toothSensitivityAccOneHLOne)) {
			scrollDownUsingElement(toothSensitivityAccOneHLOne);
			clickElementUsingJavaScript(toothSensitivityAccOneHLOne);
			pageLoad();
			System.out.println("Tooth Sensitivity Acc One HL One clicked successfully");
		} else {
			System.out.println("Tooth Sensitivity Acc One HL One is not presented in the page");
			throw new Exception("Tooth Sensitivity Acc One HL One is not presented in the page");
		}
	}
	
	public void clickToothSensitivityAccOneHLTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(toothSensitivityAccOneHLTwo)) {
			scrollDownUsingElement(toothSensitivityAccOneHLTwo);
			clickElementUsingJavaScript(toothSensitivityAccOneHLTwo);
			pageLoad();
			System.out.println("Tooth Sensitivity Acc One HL Two clicked successfully");
		} else {
			System.out.println("Tooth Sensitivity Acc One HL Two is not presented in the page");
			throw new Exception("Tooth Sensitivity Acc One HL Two is not presented in the page");
		}
	}
	
	public void clickToothSensitivityAccOneHLThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(toothSensitivityAccOneHLThree)) {
			scrollDownUsingElement(toothSensitivityAccOneHLThree);
			clickElementUsingJavaScript(toothSensitivityAccOneHLThree);
			pageLoad();
			System.out.println("Tooth Sensitivity Acc One HL Three clicked successfully");
		} else {
			System.out.println("Tooth Sensitivity Acc One HL Three is not presented in the page");
			throw new Exception("Tooth Sensitivity Acc One HL Three is not presented in the page");
		}
	}
	
	public void clickToothSensitivityAccTwoHLOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(toothSensitivityAccTwoHLOne)) {
			scrollDownUsingElement(toothSensitivityAccTwoHLOne);
			clickElementUsingJavaScript(toothSensitivityAccTwoHLOne);
			pageLoad();
			System.out.println("Tooth Sensitivity Acc Two HL One clicked successfully");
		} else {
			System.out.println("Tooth Sensitivity Acc Two HL One is not presented in the page");
			throw new Exception("Tooth Sensitivity Acc Two HL One is not presented in the page");
		}
	}
	
	public void clickToothSensitivityAccTwoHLTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(toothSensitivityAccTwoHLTwo)) {
			scrollDownUsingElement(toothSensitivityAccTwoHLTwo);
			clickElementUsingJavaScript(toothSensitivityAccTwoHLTwo);
			pageLoad();
			System.out.println("Tooth Sensitivity Acc Two HL Two clicked successfully");
		} else {
			System.out.println("Tooth Sensitivity Acc Two HL Two is not presented in the page");
			throw new Exception("Tooth Sensitivity Acc Two HL Two is not presented in the page");
		}
	}
	
	public void clickToothSensitivityAccFiveHLOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(toothSensitivityAccFiveHLOne)) {
			scrollDownUsingElement(toothSensitivityAccFiveHLOne);
			clickElementUsingJavaScript(toothSensitivityAccFiveHLOne);
			pageLoad();
			System.out.println("Tooth Sensitivity Acc Five HL One clicked successfully");
		} else {
			System.out.println("Tooth Sensitivity Acc Five HL One is not presented in the page");
			throw new Exception("Tooth Sensitivity Acc Five HL One is not presented in the page");
		}
	}
	
	public void clickToothSensitivityAccSevenHLOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(toothSensitivityAccSevenHLOne)) {
			scrollDownUsingElement(toothSensitivityAccSevenHLOne);
			clickElementUsingJavaScript(toothSensitivityAccSevenHLOne);
			pageLoad();
			System.out.println("Tooth Sensitivity Acc Seven HL One clicked successfully");
		} else {
			System.out.println("Tooth Sensitivity Acc Seven HL One is not presented in the page");
			throw new Exception("Tooth Sensitivity Acc Seven HL One is not presented in the page");
		}
	}
	
	public void clickToothSensitivityAccSevenHLTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(toothSensitivityAccSevenHLTwo)) {
			scrollDownUsingElement(toothSensitivityAccSevenHLTwo);
			clickElementUsingJavaScript(toothSensitivityAccSevenHLTwo);
			pageLoad();
			System.out.println("Tooth Sensitivity Acc Seven HL Two clicked successfully");
		} else {
			System.out.println("Tooth Sensitivity Acc Seven HL Two is not presented in the page");
			throw new Exception("Tooth Sensitivity Acc Seven HL Two is not presented in the page");
		}
	}
	
	public void clickToothSensitivityAccEightHLOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(toothSensitivityAccEightHLOne)) {
			scrollDownUsingElement(toothSensitivityAccEightHLOne);
			clickElementUsingJavaScript(toothSensitivityAccEightHLOne);
			pageLoad();
			System.out.println("Tooth Sensitivity Acc Eight HL One clicked successfully");
		} else {
			System.out.println("Tooth Sensitivity Acc Eight HL One is not presented in the page");
			throw new Exception("Tooth Sensitivity Acc Eight HL One is not presented in the page");
		}
	}
	
	
	public void clickHowSensodyneWorksAccOneHLOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(howSensodyneWorksAccOneHLOne)) {
			scrollDownUsingElement(howSensodyneWorksAccOneHLOne);
			clickElementUsingJavaScript(howSensodyneWorksAccOneHLOne);
			pageLoad();
			System.out.println("How Sensodyne Works Acc One HL One clicked successfully");
		} else {
			System.out.println("How Sensodyne Works Acc One HL One is not presented in the page");
			throw new Exception("How Sensodyne Works Acc One HL One is not presented in the page");
		}
	}
	
	public void clickHowSensodyneWorksAccOneHLTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(howSensodyneWorksAccOneHLTwo)) {
			scrollDownUsingElement(howSensodyneWorksAccOneHLTwo);
			clickElementUsingJavaScript(howSensodyneWorksAccOneHLTwo);
			pageLoad();
			System.out.println("How Sensodyne Works Acc One HL Two clicked successfully");
		} else {
			System.out.println("How Sensodyne Works Acc One HL Two is not presented in the page");
			throw new Exception("How Sensodyne Works Acc One HL Two is not presented in the page");
		}
	}
	
	public void clickHowSensodyneWorksAccTwoHLOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(howSensodyneWorksAccTwoHLOne)) {
			scrollDownUsingElement(howSensodyneWorksAccTwoHLOne);
			clickElementUsingJavaScript(howSensodyneWorksAccTwoHLOne);
			pageLoad();
			System.out.println("How Sensodyne Works Acc Two HL One clicked successfully");
		} else {
			System.out.println("How Sensodyne Works Acc Two HL One is not presented in the page");
			throw new Exception("How Sensodyne Works Acc Two HL One is not presented in the page");
		}
	}
	
	public void clickHowSensodyneWorksAccTwoHLTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(howSensodyneWorksAccTwoHLTwo)) {
			scrollDownUsingElement(howSensodyneWorksAccTwoHLTwo);
			clickElementUsingJavaScript(howSensodyneWorksAccTwoHLTwo);
			pageLoad();
			System.out.println("How Sensodyne Works Acc Two HL Two clicked successfully");
		} else {
			System.out.println("How Sensodyne Works Acc Two HL Two is not presented in the page");
			throw new Exception("How Sensodyne Works Acc Two HL Two is not presented in the page");
		}
	}
	
	public void clickHowSensodyneWorksAccThreeHLOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(howSensodyneWorksAccThreeHLOne)) {
			scrollDownUsingElement(howSensodyneWorksAccThreeHLOne);
			clickElementUsingJavaScript(howSensodyneWorksAccThreeHLOne);
			pageLoad();
			System.out.println("How Sensodyne Works Acc Three HL One clicked successfully");
		} else {
			System.out.println("How Sensodyne Works Acc Three HL One is not presented in the page");
			throw new Exception("How Sensodyne Works Acc Three HL One is not presented in the page");
		}
	}
	
	
	public void clickSensodyneIngredientsAccOneHLOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sensodyneIngredientsAccOneHLOne)) {
			scrollDownUsingElement(sensodyneIngredientsAccOneHLOne);
			clickElementUsingJavaScript(sensodyneIngredientsAccOneHLOne);
			pageLoad();
			System.out.println("Sensodyne Ingredients Acc One HL One clicked successfully");
		} else {
			System.out.println("Sensodyne Ingredients Acc One HL One is not presented in the page");
			throw new Exception("Sensodyne Ingredients Acc One HL One is not presented in the page");
		}
	}
	
	public void clickSensodyneIngredientsAccTwoHLOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sensodyneIngredientsAccTwoHLOne)) {
			scrollDownUsingElement(sensodyneIngredientsAccTwoHLOne);
			clickElementUsingJavaScript(sensodyneIngredientsAccTwoHLOne);
			pageLoad();
			System.out.println("Sensodyne Ingredients Acc Two HL One clicked successfully");
		} else {
			System.out.println("Sensodyne Ingredients Acc Two HL One is not presented in the page");
			throw new Exception("Sensodyne Ingredients Acc Two HL One is not presented in the page");
		}
	}
	
	public void clickSensodyneIngredientsAccThreeHLOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sensodyneIngredientsAccThreeHLOne)) {
			scrollDownUsingElement(sensodyneIngredientsAccThreeHLOne);
			clickElementUsingJavaScript(sensodyneIngredientsAccThreeHLOne);
			pageLoad();
			System.out.println("Sensodyne Ingredients Acc Three HL One clicked successfully");
		} else {
			System.out.println("Sensodyne Ingredients Acc Three HL One is not presented in the page");
			throw new Exception("Sensodyne Ingredients Acc Three HL One is not presented in the page");
		}
	}
	
	public void clickSensodyneIngredientsAccThreeHLTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sensodyneIngredientsAccThreeHLTwo)) {
			scrollDownUsingElement(sensodyneIngredientsAccThreeHLTwo);
			clickElementUsingJavaScript(sensodyneIngredientsAccThreeHLTwo);
			pageLoad();
			System.out.println("Sensodyne Ingredients Acc Three HL Two clicked successfully");
		} else {
			System.out.println("Sensodyne Ingredients Acc Three HL Two is not presented in the page");
			throw new Exception("Sensodyne Ingredients Acc Three HL Two is not presented in the page");
		}
	}
	
	public void clickSensodyneIngredientsAccThreeHLThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sensodyneIngredientsAccThreeHLThree)) {
			scrollDownUsingElement(sensodyneIngredientsAccThreeHLThree);
			clickElementUsingJavaScript(sensodyneIngredientsAccThreeHLThree);
			pageLoad();
			System.out.println("Sensodyne Ingredients Acc Three HL Three clicked successfully");
		} else {
			System.out.println("Sensodyne Ingredients Acc Three HL Three is not presented in the page");
			throw new Exception("Sensodyne Ingredients Acc Three HL Three is not presented in the page");
		}
	}
	
	public void clickSensodyneIngredientsAccFourHLOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sensodyneIngredientsAccFourHLOne)) {
			scrollDownUsingElement(sensodyneIngredientsAccFourHLOne);
			clickElementUsingJavaScript(sensodyneIngredientsAccFourHLOne);
			pageLoad();
			System.out.println("Sensodyne Ingredients Acc Four HL One clicked successfully");
		} else {
			System.out.println("Sensodyne Ingredients Acc Four HL One is not presented in the page");
			throw new Exception("Sensodyne Ingredients Acc Four HL One is not presented in the page");
		}
	}
	
	public void clickSensodyneIngredientsAccFiveHLOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sensodyneIngredientsAccFiveHLOne)) {
			scrollDownUsingElement(sensodyneIngredientsAccFiveHLOne);
			clickElementUsingJavaScript(sensodyneIngredientsAccFiveHLOne);
			pageLoad();
			System.out.println("Sensodyne Ingredients Acc Five HL One clicked successfully");
		} else {
			System.out.println("Sensodyne Ingredients Acc Five HL One is not presented in the page");
			throw new Exception("Sensodyne Ingredients Acc Five HL One is not presented in the page");
		}
	}
	
	public void clickSensodyneProductsAccOneHLOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sensodyneProductsAccOneHLOne)) {
			scrollDownUsingElement(sensodyneProductsAccOneHLOne);
			clickElementUsingJavaScript(sensodyneProductsAccOneHLOne);
			pageLoad();
			System.out.println("Sensodyne Products Acc One HL One clicked successfully");
		} else {
			System.out.println("Sensodyne Products Acc One HL One is not presented in the page");
			throw new Exception("Sensodyne Products Acc One HL One is not presented in the page");
		}
	}
	
	public void clickSensodyneProductsAccOneHLTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sensodyneProductsAccOneHLTwo)) {
			scrollDownUsingElement(sensodyneProductsAccOneHLTwo);
			clickElementUsingJavaScript(sensodyneProductsAccOneHLTwo);
			pageLoad();
			System.out.println("Sensodyne Products Acc One HL Two clicked successfully");
		} else {
			System.out.println("Sensodyne Products Acc One HL Two is not presented in the page");
			throw new Exception("Sensodyne Products Acc One HL Two is not presented in the page");
		}
	}
	
	public void clickSensodyneProductsAccOneHLThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sensodyneProductsAccOneHLThree)) {
			scrollDownUsingElement(sensodyneProductsAccOneHLThree);
			clickElementUsingJavaScript(sensodyneProductsAccOneHLThree);
			pageLoad();
			System.out.println("Sensodyne Products Acc One HL Three clicked successfully");
		} else {
			System.out.println("Sensodyne Products Acc One HL Three is not presented in the page");
			throw new Exception("Sensodyne Products Acc One HL Three is not presented in the page");
		}
	}
	
	public void clickSensodyneProductsAccOneHLFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sensodyneProductsAccOneHLFour)) {
			scrollDownUsingElement(sensodyneProductsAccOneHLFour);
			clickElementUsingJavaScript(sensodyneProductsAccOneHLFour);
			pageLoad();
			System.out.println("Sensodyne Products Acc One HL Four clicked successfully");
		} else {
			System.out.println("Sensodyne Products Acc One HL Four is not presented in the page");
			throw new Exception("Sensodyne Products Acc One HL Four is not presented in the page");
		}
	}
	
	public void clickSensodyneProductsAccOneHLFive() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sensodyneProductsAccOneHLFive)) {
			scrollDownUsingElement(sensodyneProductsAccOneHLFive);
			clickElementUsingJavaScript(sensodyneProductsAccOneHLFive);
			pageLoad();
			System.out.println("Sensodyne Products Acc One HL FIve clicked successfully");
		} else {
			System.out.println("Sensodyne Products Acc One HL Five is not presented in the page");
			throw new Exception("Sensodyne Products Acc One HL Five is not presented in the page");
		}
	}
	
	public void clickSensodyneProductsAccOneHLSix() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sensodyneProductsAccOneHLSix)) {
			scrollDownUsingElement(sensodyneProductsAccOneHLSix);
			clickElementUsingJavaScript(sensodyneProductsAccOneHLSix);
			pageLoad();
			System.out.println("Sensodyne Products Acc One HL Six clicked successfully");
		} else {
			System.out.println("Sensodyne Products Acc One HL Six is not presented in the page");
			throw new Exception("Sensodyne Products Acc One HL Six is not presented in the page");
		}
	}
	
	public void clickSensodyneProductsAccOneHLSeven() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sensodyneProductsAccOneHLSeven)) {
			scrollDownUsingElement(sensodyneProductsAccOneHLSeven);
			clickElementUsingJavaScript(sensodyneProductsAccOneHLSeven);
			pageLoad();
			System.out.println("Sensodyne Products Acc One HL Seven clicked successfully");
		} else {
			System.out.println("Sensodyne Products Acc One HL Seven is not presented in the page");
			throw new Exception("Sensodyne Products Acc One HL Seven is not presented in the page");
		}
	}
	
	public void clickSensodyneProductsAccOneHLEight() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sensodyneProductsAccOneHLEight)) {
			scrollDownUsingElement(sensodyneProductsAccOneHLEight);
			clickElementUsingJavaScript(sensodyneProductsAccOneHLEight);
			pageLoad();
			System.out.println("Sensodyne Products Acc One HL Eight clicked successfully");
		} else {
			System.out.println("Sensodyne Products Acc One HL Eight is not presented in the page");
			throw new Exception("Sensodyne Products Acc One HL Eight is not presented in the page");
		}
	}
	
	public void clickSensodyneProductsAccOneHLNine() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sensodyneProductsAccOneHLNine)) {
			scrollDownUsingElement(sensodyneProductsAccOneHLNine);
			clickElementUsingJavaScript(sensodyneProductsAccOneHLNine);
			pageLoad();
			System.out.println("Sensodyne Products Acc One HL Nine clicked successfully");
		} else {
			System.out.println("Sensodyne Products Acc One HL Nine is not presented in the page");
			throw new Exception("Sensodyne Products Acc One HL Nine is not presented in the page");
		}
	}
	
	public void clickSensodyneProductsAccOneHLTen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sensodyneProductsAccOneHLTen)) {
			scrollDownUsingElement(sensodyneProductsAccOneHLTen);
			clickElementUsingJavaScript(sensodyneProductsAccOneHLTen);
			pageLoad();
			System.out.println("Sensodyne Products Acc One HL Ten clicked successfully");
		} else {
			System.out.println("Sensodyne Products Acc One HL Ten is not presented in the page");
			throw new Exception("Sensodyne Products Acc One HL Ten is not presented in the page");
		}
	}
	
	public void clickSensodyneProductsAccOneHLEleven() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sensodyneProductsAccOneHLEleven)) {
			scrollDownUsingElement(sensodyneProductsAccOneHLEleven);
			clickElementUsingJavaScript(sensodyneProductsAccOneHLEleven);
			pageLoad();
			System.out.println("Sensodyne Products Acc One HL Eleven clicked successfully");
		} else {
			System.out.println("Sensodyne Products Acc One HL Eleven is not presented in the page");
			throw new Exception("Sensodyne Products Acc One HL Eleven is not presented in the page");
		}
	}
	
	public void clickSensodyneProductsAccOneHLTweleve() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sensodyneProductsAccOneHLTweleve)) {
			scrollDownUsingElement(sensodyneProductsAccOneHLTweleve);
			clickElementUsingJavaScript(sensodyneProductsAccOneHLTweleve);
			pageLoad();
			System.out.println("Sensodyne Products Acc One HL Tweleve clicked successfully");
		} else {
			System.out.println("Sensodyne Products Acc One HL Tweleve is not presented in the page");
			throw new Exception("Sensodyne Products Acc One HL Tweleve is not presented in the page");
		}
	}
	
	public void clickSensodyneProductsAccOneHLThirteen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sensodyneProductsAccOneHLThirteen)) {
			scrollDownUsingElement(sensodyneProductsAccOneHLThirteen);
			clickElementUsingJavaScript(sensodyneProductsAccOneHLThirteen);
			pageLoad();
			System.out.println("Sensodyne Products Acc One HL Thirteen clicked successfully");
		} else {
			System.out.println("Sensodyne Products Acc One HL Thirteen is not presented in the page");
			throw new Exception("Sensodyne Products Acc One HL Thirteen is not presented in the page");
		}
	}
	
	public void clickSensodyneProductsAccOneHLFourteen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sensodyneProductsAccOneHLFourteen)) {
			scrollDownUsingElement(sensodyneProductsAccOneHLFourteen);
			clickElementUsingJavaScript(sensodyneProductsAccOneHLFourteen);
			pageLoad();
			System.out.println("Sensodyne Products Acc One HL Fourteen clicked successfully");
		} else {
			System.out.println("Sensodyne Products Acc One HL Fourteen is not presented in the page");
			throw new Exception("Sensodyne Products Acc One HL Fourteen is not presented in the page");
		}
	}
	
	public void clickSensodyneProductsAccOneHLFifteen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sensodyneProductsAccOneHLFifteen)) {
			scrollDownUsingElement(sensodyneProductsAccOneHLFifteen);
			clickElementUsingJavaScript(sensodyneProductsAccOneHLFifteen);
			pageLoad();
			System.out.println("Sensodyne Products Acc One HL Fifteen clicked successfully");
		} else {
			System.out.println("Sensodyne Products Acc One HL Fifteen is not presented in the page");
			throw new Exception("Sensodyne Products Acc One HL Fifteen is not presented in the page");
		}
	}
	
	public void clickSensodyneProductsAccOneHLSixteen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sensodyneProductsAccOneHLSixteen)) {
			scrollDownUsingElement(sensodyneProductsAccOneHLSixteen);
			clickElementUsingJavaScript(sensodyneProductsAccOneHLSixteen);
			pageLoad();
			System.out.println("Sensodyne Products Acc One HL Sixteen clicked successfully");
		} else {
			System.out.println("Sensodyne Products Acc One HL Sixteen is not presented in the page");
			throw new Exception("Sensodyne Products Acc One HL Sixteen is not presented in the page");
		}
	}
	
	
	public void clickSensodyneProductsAccTwoHLOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sensodyneProductsAccTwoHLOne)) {
			scrollDownUsingElement(sensodyneProductsAccTwoHLOne);
			clickElementUsingJavaScript(sensodyneProductsAccTwoHLOne);
			pageLoad();
			System.out.println("Sensodyne Products Acc Two HL One clicked successfully");
		} else {
			System.out.println("Sensodyne Products Acc Two HL One is not presented in the page");
			throw new Exception("Sensodyne Products Acc Two HL One is not presented in the page");
		}
	}
	
	public void clickSensodyneProductsAccThreeHLOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sensodyneProductsAccThreeHLOne)) {
			scrollDownUsingElement(sensodyneProductsAccThreeHLOne);
			clickElementUsingJavaScript(sensodyneProductsAccThreeHLOne);
			pageLoad();
			System.out.println("Sensodyne Products Acc Three HL One clicked successfully");
		} else {
			System.out.println("Sensodyne Products Acc Three HL One is not presented in the page");
			throw new Exception("Sensodyne Products Acc Three HL One is not presented in the page");
		}
	}
	
	public void clickSensodyneProductsAccThreeHLTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sensodyneProductsAccThreeHLTwo)) {
			scrollDownUsingElement(sensodyneProductsAccThreeHLTwo);
			clickElementUsingJavaScript(sensodyneProductsAccThreeHLTwo);
			pageLoad();
			System.out.println("Sensodyne Products Acc Three HL Two clicked successfully");
		} else {
			System.out.println("Sensodyne Products Acc Three HL Two is not presented in the page");
			throw new Exception("Sensodyne Products Acc Three HL Two is not presented in the page");
		}
	}
	
	public void clickSensodyneProductsAccFourHLOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sensodyneProductsAccFourHLOne)) {
			scrollDownUsingElement(sensodyneProductsAccFourHLOne);
			clickElementUsingJavaScript(sensodyneProductsAccFourHLOne);
			pageLoad();
			System.out.println("Sensodyne Products Acc Four HL One clicked successfully");
		} else {
			System.out.println("Sensodyne Products Acc Four HL One is not presented in the page");
			throw new Exception("Sensodyne Products Acc Four HL One is not presented in the page");
		}
	}
	
	
	public void clickSensodyneProductsAccSixHLOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sensodyneProductsAccSixHLOne)) {
			scrollDownUsingElement(sensodyneProductsAccSixHLOne);
			clickElementUsingJavaScript(sensodyneProductsAccSixHLOne);
			pageLoad();
			System.out.println("Sensodyne Products Acc Six HL One clicked successfully");
		} else {
			System.out.println("Sensodyne Products Acc Six HL One is not presented in the page");
			throw new Exception("Sensodyne Products Acc Six HL One is not presented in the page");
		}
	}
	
	public void clickSensodyneProductsAccSixHLTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sensodyneProductsAccSixHLTwo)) {
			scrollDownUsingElement(sensodyneProductsAccSixHLTwo);
			clickElementUsingJavaScript(sensodyneProductsAccSixHLTwo);
			pageLoad();
			System.out.println("Sensodyne Products Acc Six HL Two clicked successfully");
		} else {
			System.out.println("Sensodyne Products Acc Six HL Two is not presented in the page");
			throw new Exception("Sensodyne Products Acc Six HL Two is not presented in the page");
		}
	}
	
	
	public void clickSensodyneAndWhiteningAccOneHLOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sensodyneAndWhiteningAccOneHLOne)) {
			scrollDownUsingElement(sensodyneAndWhiteningAccOneHLOne);
			clickElementUsingJavaScript(sensodyneAndWhiteningAccOneHLOne);
			pageLoad();
			System.out.println("sensodyne And Whitening Acc One HL One is clicked successfully");
		} else {
			System.out.println("sensodyne And Whitening Acc One HL One is not presented in the page");
			throw new Exception("sensodyne And Whitening Acc One HL One is not presented in the page");
		}
	}
	
	public void clickSensodyneAndWhiteningAccOneHLTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sensodyneAndWhiteningAccOneHLTwo)) {
			scrollDownUsingElement(sensodyneAndWhiteningAccOneHLTwo);
			clickElementUsingJavaScript(sensodyneAndWhiteningAccOneHLTwo);
			pageLoad();
			System.out.println("sensodyne And Whitening Acc One HL Two is clicked successfully");
		} else {
			System.out.println("sensodyne And Whitening Acc One HL Two is not presented in the page");
			throw new Exception("sensodyne And Whitening Acc One HL Two is not presented in the page");
		}
	}
	
	public void clickSensodyneAndWhiteningAccOneHLThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sensodyneAndWhiteningAccOneHLThree)) {
			scrollDownUsingElement(sensodyneAndWhiteningAccOneHLThree);
			clickElementUsingJavaScript(sensodyneAndWhiteningAccOneHLThree);
			pageLoad();
			System.out.println("sensodyne And Whitening Acc One HL Three is clicked successfully");
		} else {
			System.out.println("sensodyne And Whitening Acc One HL Three is not presented in the page");
			throw new Exception("sensodyne And Whitening Acc One HL Three is not presented in the page");
		}
	}
	
	public void clickSensodyneAndWhiteningAccOneHLFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sensodyneAndWhiteningAccOneHLFour)) {
			scrollDownUsingElement(sensodyneAndWhiteningAccOneHLFour);
			clickElementUsingJavaScript(sensodyneAndWhiteningAccOneHLFour);
			pageLoad();
			System.out.println("sensodyne And Whitening Acc One HL Four is clicked successfully");
		} else {
			System.out.println("sensodyne And Whitening Acc One HL Four is not presented in the page");
			throw new Exception("sensodyne And Whitening Acc One HL Four is not presented in the page");
		}
	}
	
	public void clickSensodyneAndWhiteningAccOneHLFive() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sensodyneAndWhiteningAccOneHLFive)) {
			scrollDownUsingElement(sensodyneAndWhiteningAccOneHLFive);
			clickElementUsingJavaScript(sensodyneAndWhiteningAccOneHLFive);
			pageLoad();
			System.out.println("sensodyne And Whitening Acc One HL FIve is clicked successfully");
		} else {
			System.out.println("sensodyne And Whitening Acc One HL FIve is not presented in the page");
			throw new Exception("sensodyne And Whitening Acc One HL FIve is not presented in the page");
		}
	}
	
	public void clickSensodyneAndWhiteningAccOneHLSix() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sensodyneAndWhiteningAccOneHLSix)) {
			scrollDownUsingElement(sensodyneAndWhiteningAccOneHLSix);
			clickElementUsingJavaScript(sensodyneAndWhiteningAccOneHLSix);
			pageLoad();
			System.out.println("sensodyne And Whitening Acc One HL Six is clicked successfully");
		} else {
			System.out.println("sensodyne And Whitening Acc One HL Six is not presented in the page");
			throw new Exception("sensodyne And Whitening Acc One HL Six is not presented in the page");
		}
	}
	
	
	public void clickFindYourToothpaste() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(findYourToothpaste)) {
			scrollDownUsingElement(findYourToothpaste);
			clickElementUsingJavaScript(findYourToothpaste);
			pageLoad();
			System.out.println("Find Your Toothpaste is clicked successfully");
		} else {
			System.out.println("Find Your Toothpaste is not presented in the page");
			throw new Exception("Find Your Toothpaste is not presented in the page");
		}
	}
	
	
	
	
	
	
	
}
