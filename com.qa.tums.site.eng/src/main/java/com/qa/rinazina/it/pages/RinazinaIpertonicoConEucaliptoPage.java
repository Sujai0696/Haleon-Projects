package com.qa.rinazina.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class RinazinaIpertonicoConEucaliptoPage extends BaseClass{
	
	public RinazinaIpertonicoConEucaliptoPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Accetta tutti i cookie']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='Home']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Prodotti']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd ']//ancestor::a[text()='Senza Medicinali']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even last is-current ']//ancestor::a[text()='Rinazina Aquamarina Spray Nasale Ipertonico']")
	private static WebElement breadcrumbFour;
	
	@FindBy(xpath = "//span[text()='Informazioni sul prodotto Rinazina Aquamarina Spray Nasale ipertonico con eucalipto']//ancestor::li[@class='accordion-slide is-active first odd']")
	private static WebElement accordionActiveOne;
	
	@FindBy(xpath = "//span[text()='Informazioni sul prodotto Rinazina Aquamarina Spray Nasale ipertonico con eucalipto']//ancestor::header[@class='accordion-head']")
	private static WebElement accordionOne;
	
	@FindBy(xpath = "//span[text()='Informazioni sul prodotto Rinazina Aquamarina Spray Nasale ipertonico con eucalipto']//ancestor::li[@class='accordion-slide first odd']")
	private static WebElement accordionCloseOne;
	
	@FindBy(xpath = "//span[text()='Come usare Rinazina Aquamarina spray nasale ipertonico con eucalipto']//ancestor::header[@class='accordion-head']")
	private static WebElement accordionTwo;
	
	@FindBy(xpath = "//span[text()='Come usare Rinazina Aquamarina spray nasale ipertonico con eucalipto']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement accordionActiveTwo;
	
	@FindBy(xpath = "//span[text()='Come usare Rinazina Aquamarina spray nasale ipertonico con eucalipto']//ancestor::li[@class='accordion-slide even']")
	private static WebElement accordionCloseTwo;
	
	
	@FindBy(xpath = "//span[text()='In quanto tempo agisce Rinazina Aquamarina Spray Nasale ipertonico con Eucalipto?']//ancestor::header[@class='accordion-head']")
	private static WebElement accordionThree;
	
	@FindBy(xpath = "//span[text()='In quanto tempo agisce Rinazina Aquamarina Spray Nasale ipertonico con Eucalipto?']//ancestor::li[@class='accordion-slide last odd is-active']")
	private static WebElement accordionActiveThree;
	
	@FindBy(xpath = "//span[text()='In quanto tempo agisce Rinazina Aquamarina Spray Nasale ipertonico con Eucalipto?']//ancestor::li[@class='accordion-slide last odd']")
	private static WebElement accordionCloseThree;
	
	
	
	
	
	
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
		clickElementUsingJavaScript(breadcrumbOne);
		pageLoad();
	}
	
	public void clickBreadcrumbTwo() throws Exception{
		waitForPageLoadJava();
		clickElementUsingJavaScript(breadcrumbTwo);
		pageLoad();
	}
	
	public void clickBreadcrumbThree() throws Exception{
		waitForPageLoadJava();
		clickElementUsingJavaScript(breadcrumbThree);
		pageLoad();
	}
	
	public void clickBreadcrumbFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbFour)) {
			Assert.assertTrue(elementIsDisplayed(breadcrumbFour));
			System.out.println(getElementText(breadcrumbFour)+": Breadcrumb verified successfully");
		} else {
			throw new Exception("Breadcrumb Four is not presented in the page");
		}
	}
	
	public void clickAccordionOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(accordionActiveOne)) {
			clickElementUsingJavaScript(accordionOne);
			visibilityOf(accordionCloseOne);
			Assert.assertTrue(elementIsDisplayed(accordionCloseOne));
			System.out.println(getElementText(accordionOne));
		} else {
			throw new Exception("Accordion One is not active");
		}
		
	}
	
	public void clickAccordionTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(accordionActiveOne)) {
			clickElementUsingJavaScript(accordionTwo);
			visibilityOf(accordionActiveTwo);
			Assert.assertTrue(elementIsDisplayed(accordionActiveTwo));
			clickElementUsingJavaScript(accordionTwo);
			visibilityOf(accordionCloseTwo);
			Assert.assertTrue(elementIsDisplayed(accordionCloseTwo));
			System.out.println(getElementText(accordionTwo));
		} else {
			throw new Exception("Accordion One is not active");
		}
	}
	
	public void clickAccordionThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(accordionActiveOne)) {
			clickElementUsingJavaScript(accordionThree);
			visibilityOf(accordionActiveThree);
			Assert.assertTrue(elementIsDisplayed(accordionActiveThree));
			clickElementUsingJavaScript(accordionThree);
			visibilityOf(accordionCloseThree);
			Assert.assertTrue(elementIsDisplayed(accordionCloseThree));
			System.out.println(getElementText(accordionThree));
		} else {
			throw new Exception("Accordion One is not active");
		}
	}
	
	
	

}
