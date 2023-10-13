package com.qa.centrum.eng.pages;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CentrumQuizPage extends BaseClass{

	public CentrumQuizPage() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "//h2[@class='heading']")
	private static WebElement gigyaForm;

	@FindBy(xpath = "//div[contains(@class,'content_hide')]")
	private static WebElement gigyaClose;
	
	@FindBy(xpath = "//a[@class='btn btn-primary bpaction-click-fcstart-true']")
	private static WebElement btnStart;
	
	@FindBy(xpath = "//ul[@class='filter-list-js']//li")
	private static List<WebElement> healthGoal;
	
	@FindBy(xpath = "(//ul[@class='filter-list-js']//li)[1]")
	private static WebElement generalWellness;
	
	@FindBy(xpath = "//li[contains(@class,' active-js')]")
	private static WebElement activeHealthGoal;
	
	@FindBy(xpath = "(//a[@class='btn btn-primary btn-flexible carousel-btn-next bpaction-click-fcnextslide-true'])[1]")
	private static WebElement nextOne;
	
	@FindBy(xpath = "(//li[contains(@class,' active-js')])[2]")
	private static WebElement activeAge;
	
	@FindBy(xpath = "//li[@class='filter-item-js f-20-29 ']")
	private static WebElement ageRandomClick;
	
	@FindBy(xpath = "(//a[@class='btn btn-primary btn-flexible carousel-btn-next bpaction-click-fcnextslide-true'])[2]")
	private static WebElement nextTwo;
	
	@FindBy(xpath = "(//li[contains(@class,' active-js')])[3]")
	private static WebElement activeGender;
	
	@FindBy(xpath = "//li[@class='filter-item-js f-female ']")
	private static WebElement genderRandomClick;
	
	@FindBy(xpath = "(//a[@class='btn btn-primary btn-flexible carousel-btn-next bpaction-click-fcnextslide-true'])[3]")
	private static WebElement nextThree;
	
	@FindBy(xpath = "(//li[contains(@class,' active-js')])[4]")
	private static WebElement activeFormat;
	
	@FindBy(xpath = "//li[@class='filter-item-js f-tablets ']")
	private static WebElement vitaminFormatRandomClick;
	
	@FindBy(xpath = "(//a[@class='btn btn-primary btn-flexible carousel-btn-next bpaction-click-fcnextslide-true'])[4]")
	private static WebElement nextFour;
	
	
	@FindBy(xpath = "(//input[@name='data.ds.centrum.productQuiz.firstName'])[2]")
	private static WebElement gigyaFirstName;
	
	@FindBy(xpath = "(//input[@data-display-name='Please enter a valid e-mail address'])[1]")
	private static WebElement gigyaEmail;
	
	@FindBy(xpath = "//input[@value='Show My Results']")
	private static WebElement btnShowMyResult;
	
	@FindBy(xpath = "//h2[text()='BASED ON YOUR RESPONSES']")
	private static WebElement txtResponses;
	
	public void clickCookieBtn() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(cookieBtn)) {
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
			try {
				if (gigyaForm.isDisplayed()) {
					clickElementUsingJavaScript(gigyaForm);
				}
				implicitWait();
				Assert.assertTrue(elementIsDisplayed(gigyaClose));
			} catch (Exception e) {
			}
		} else {
			System.out.println("gigya is not presented");
		}
	}
	
	public void clickStartBtn() throws Exception{
		scrollDownUsingElement(btnStart);
		clickElementUsingJavaScript(btnStart);
	}
	
	
	public boolean activeHealthGoal() throws Exception{
		elementVisible(activeHealthGoal);
		boolean elementIsDisplayed = elementIsDisplayed(activeHealthGoal);
		return elementIsDisplayed;
	}
	
//	for (int i = 0; i <16; i++) {
//		Thread.sleep(2000);
//		if (getElementWithIndex(By.xpath("//ul[@class='filter-list-js']//li"), i).isDisplayed()) {
//			WebElement ewi = getElementWithIndex(By.xpath("//ul[@class='filter-list-js']//li"), i);
//			System.out.println(ewi.getText());
//			clickElementUsingJavaScript(ewi);
//		}
//		Assert.assertTrue(qp.activeHealthGoal());
//	}
	
	public void clickAllHealthGoal() throws Exception{
		for (int i = 0; i < 16; i++) {
			Thread.sleep(2000);
//			if (driver.findElement(By.xpath("(//ul[@class='filter-list-js']//li)["+i+"]")).isDisplayed()) {
//				WebElement ewi = driver.findElement(By.xpath(("(//ul[@class='filter-list-js']//li)["+i+"]")));
//				System.out.println(ewi.getText());
//				clickElementUsingJavaScript(ewi);
//			}
			
			if (getElementWithIndex(By.xpath("//ul[@class='filter-list-js']//li"), i).isDisplayed()) {
				WebElement ewi = getElementWithIndex(By.xpath("//ul[@class='filter-list-js']//li"), i);
			System.out.println(ewi.getText());
			clickElementUsingJavaScript(ewi);
			}
			Assert.assertTrue(activeHealthGoal());
		}
	}
	
	public boolean activeAge() throws Exception{
		elementVisible(activeAge);
		boolean elementIsDisplayed = elementIsDisplayed(activeAge);
		return elementIsDisplayed;
	}
	
	public void clickAllWhatIsYouAge() throws Exception{
		scrollDownUsingElement(generalWellness);
		clickElementUsingJavaScript(generalWellness);
		elementVisible(nextOne);
		clickElementUsingJavaScript(nextOne);
		for (int i = 16; i < 21; i++) {
			Thread.sleep(2000);
			if (getElementWithIndex(By.xpath("//ul[@class='filter-list-js']//li"), i).isDisplayed()) {
				WebElement ewi = getElementWithIndex(By.xpath("//ul[@class='filter-list-js']//li"), i);
			System.out.println(ewi.getText());
			clickElementUsingJavaScript(ewi);
			}
			implicitWait();
			Assert.assertTrue(activeAge());
		}
	}
	
	public boolean activeGender() throws Exception{
		elementVisible(activeGender);
		boolean elementIsDisplayed = elementIsDisplayed(activeGender);
		return elementIsDisplayed;
	}
	
	
	public void clickAllGender() throws Exception{
		scrollDownUsingElement(generalWellness);
		clickElementUsingJavaScript(generalWellness);
		elementVisible(nextOne);
		clickElementUsingJavaScript(nextOne);
		elementVisible(ageRandomClick);
		clickElementUsingJavaScript(ageRandomClick);
		elementVisible(nextTwo);
		clickElementUsingJavaScript(nextTwo);
		for (int i = 21; i < 24; i++) {
			Thread.sleep(2000);
			if (getElementWithIndex(By.xpath("//ul[@class='filter-list-js']//li"), i).isDisplayed()) {
				WebElement ewi = getElementWithIndex(By.xpath("//ul[@class='filter-list-js']//li"), i);
			System.out.println(ewi.getText());
			clickElementUsingJavaScript(ewi);
			}
			Assert.assertTrue(activeGender());
		}
	}
	
	public boolean activeFormat() throws Exception{
		elementVisible(activeFormat);
		boolean elementIsDisplayed = elementIsDisplayed(activeFormat);
		return elementIsDisplayed;
	}
	
	
	public void clickAllVitaminFormat() throws Exception{
		scrollDownUsingElement(generalWellness);
		clickElementUsingJavaScript(generalWellness);
		elementVisible(nextOne);
		clickElementUsingJavaScript(nextOne);
		elementVisible(ageRandomClick);
		clickElementUsingJavaScript(ageRandomClick);
		elementVisible(nextTwo);
		clickElementUsingJavaScript(nextTwo);
		elementVisible(genderRandomClick);
		clickElementUsingJavaScript(genderRandomClick);
		elementVisible(nextThree);
		clickElementUsingJavaScript(nextThree);
		
		for (int i = 24; i < 29; i++) {
			Thread.sleep(2000);
			if (getElementWithIndex(By.xpath("//ul[@class='filter-list-js']//li"), i).isDisplayed()) {
				WebElement ewi = getElementWithIndex(By.xpath("//ul[@class='filter-list-js']//li"), i);
			System.out.println(ewi.getText());
			clickElementUsingJavaScript(ewi);
			}
			Assert.assertTrue(activeFormat());
		}
		
	}
	
	
	public void verifyGigyaForm()throws Exception {
		scrollDownUsingElement(generalWellness);
		clickElementUsingJavaScript(generalWellness);
		elementVisible(nextOne);
		clickElementUsingJavaScript(nextOne);
		elementVisible(ageRandomClick);
		clickElementUsingJavaScript(ageRandomClick);
		elementVisible(nextTwo);
		clickElementUsingJavaScript(nextTwo);
		elementVisible(genderRandomClick);
		clickElementUsingJavaScript(genderRandomClick);
		elementVisible(nextThree);
		clickElementUsingJavaScript(nextThree);
		elementVisible(vitaminFormatRandomClick);
		clickElementUsingJavaScript(vitaminFormatRandomClick);
		elementVisible(nextFour);
		clickElementUsingJavaScript(nextFour);
		elementVisible(gigyaFirstName);
		elementSendKeys(gigyaFirstName, "ABC");
		elementVisible(gigyaEmail);
		elementSendKeys(gigyaEmail, "abc@gmail.com");
		elementVisible(btnShowMyResult);
		clickElementUsingJavaScript(btnShowMyResult);
		
		if (txtResponses.isDisplayed()) {
			System.out.println(txtResponses.getText());
			Assert.assertTrue(elementIsDisplayed(txtResponses));
		}
		
	}
	
	
}
