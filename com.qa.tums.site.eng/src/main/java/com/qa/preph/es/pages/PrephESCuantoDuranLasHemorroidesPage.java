package com.qa.preph.es.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class PrephESCuantoDuranLasHemorroidesPage extends BaseClass{
	
	public PrephESCuantoDuranLasHemorroidesPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Aceptar cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//a[@href='/es/']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Mas Informacion']//self::a[@href='/es/mas-informacion/']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//a[text()='Sigue una dieta rica en fibra' and @href='/es/mas-informacion/la-dieta-para-las-hemorroides/']")
	private static WebElement hyperlinkOne;
	
	@FindBy(xpath = "//a[text()='Haz más ejercicio' and @href='/es/mas-informacion/actividad-fisica/']")
	private static WebElement hyperlinkTwo;
	
	@FindBy(xpath = "//a[text()='Adopta hábitos de baño saludables' and @href='/es/mas-informacion/uso-del-bano/']")
	private static WebElement hyperlinkThree;
	
	@FindBy(xpath = "//a[text()='Aprende a tratar los brotes' and @href='/es/mas-informacion/tratando-ataques-de-hemorroides/']")
	private static WebElement hyperlinkFour;
	
	@FindBy(xpath = "//a[text()='Averigua qué producto es el mejor para ti' and @href='/es/relief-finder/']")
	private static WebElement hyperlinkFive;
	
	
	@FindBy(xpath = "//a[text()='El Costo Emocional de las Hemorroides' and @href='/es/mas-informacion/el-costo-emocional-de-las-hemorroides/']")
	private static WebElement articleOne;
	
	@FindBy(xpath = "//a[text()='¿Qué Son las Hemorroides?' and @href='/es/mas-informacion/que-son-las-hemorroides/']")
	private static WebElement articleTwo;
	
	@FindBy(xpath = "//a[text()='6 Razones Por las Que Sientes Comezón' and @href='/es/mas-informacion/6-razones-por-las-que-tienes-trasero-con-comezon/']")
	private static WebElement articleThree;
	
	@FindBy(xpath = "//button[@id='emotional-toll-link']")
	private static WebElement articleBtnOne;
	
	@FindBy(xpath = "//button[@id='what-are-hemorrhoids-link']")
	private static WebElement articleBtnTwo;
	
	@FindBy(xpath = "//button[@id='itchy-butt-link']")
	private static WebElement articleBtnThree;
	
	
	
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
			System.out.println("breadcrumbTwo clicked successfully");
		} else {
			System.out.println("breadcrumbTwo is not presented in the page");
			throw new Exception("breadcrumbTwo is not presented in the page");
		}
	}
	
	public void clickHyperlinkOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperlinkOne)) {
			scrollDownUsingElement(hyperlinkOne);
			clickElementUsingJavaScript(hyperlinkOne);
			pageLoad();
			System.out.println("hyperlinkOne clicked successfully");
		} else {
			System.out.println("hyperlinkOne is not presented in the page");
			throw new Exception("hyperlinkOne is not presented in the page");
		}
	}
	
	public void clickHyperlinkTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperlinkTwo)) {
			scrollDownUsingElement(hyperlinkTwo);
			clickElementUsingJavaScript(hyperlinkTwo);
			pageLoad();
			System.out.println("hyperlinkTwo clicked successfully");
		} else {
			System.out.println("hyperlinkTwo is not presented in the page");
			throw new Exception("hyperlinkTwo is not presented in the page");
		}
	}
	
	public void clickHyperlinkThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperlinkThree)) {
			scrollDownUsingElement(hyperlinkThree);
			clickElementUsingJavaScript(hyperlinkThree);
			pageLoad();
			System.out.println("hyperlinkThree clicked successfully");
		} else {
			System.out.println("hyperlinkThree is not presented in the page");
			throw new Exception("hyperlinkThree is not presented in the page");
		}
	}
	
	public void clickHyperlinkFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperlinkFour)) {
			scrollDownUsingElement(hyperlinkFour);
			clickElementUsingJavaScript(hyperlinkFour);
			pageLoad();
			System.out.println("hyperlinkFour clicked successfully");
		} else {
			System.out.println("hyperlinkFour is not presented in the page");
			throw new Exception("hyperlinkFour is not presented in the page");
		}
	}
	
	public void clickHyperlinkFive() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperlinkFive)) {
			scrollDownUsingElement(hyperlinkFive);
			clickElementUsingJavaScript(hyperlinkFive);
			pageLoad();
			System.out.println("hyperlinkFive clicked successfully");
		} else {
			System.out.println("hyperlinkFive is not presented in the page");
			throw new Exception("hyperlinkFive is not presented in the page");
		}
	}
	
	
	
	public void clickArticleOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleOne)) {
			scrollDownUsingElement(articleOne);
			clickElementUsingJavaScript(articleOne);
			pageLoad();
			System.out.println("articleOne clicked successfully");
		} else {
			System.out.println("articleOne is not presented in the page");
			throw new Exception("articleOne is not presented in the page");
		}
	}
	
	public void clickArticleTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleTwo)) {
			scrollDownUsingElement(articleTwo);
			clickElementUsingJavaScript(articleTwo);
			pageLoad();
			System.out.println("articleTwo clicked successfully");
		} else {
			System.out.println("articleTwo is not presented in the page");
			throw new Exception("articleTwo is not presented in the page");
		}
	}
	
	public void clickArticleThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleThree)) {
			scrollDownUsingElement(articleThree);
			clickElementUsingJavaScript(articleThree);
			pageLoad();
			System.out.println("articleThree clicked successfully");
		} else {
			System.out.println("articleThree is not presented in the page");
			throw new Exception("articleThree is not presented in the page");
		}
	}
	
	public void clickArticleBtnOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleBtnOne)) {
			scrollDownUsingElement(articleBtnOne);
			clickElementUsingJavaScript(articleBtnOne);
			pageLoad();
			System.out.println("articleBtnOne clicked successfully");
		} else {
			System.out.println("articleBtnOne is not presented in the page");
			throw new Exception("articleBtnOne is not presented in the page");
		}
	}
	
	public void clickArticleBtnTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleBtnTwo)) {
			scrollDownUsingElement(articleBtnTwo);
			clickElementUsingJavaScript(articleBtnTwo);
			pageLoad();
			System.out.println("articleBtnTwo clicked successfully");
		} else {
			System.out.println("articleBtnTwo is not presented in the page");
			throw new Exception("articleBtnTwo is not presented in the page");
		}
	}
	
	public void clickArticleBtnThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(articleBtnThree)) {
			scrollDownUsingElement(articleBtnThree);
			clickElementUsingJavaScript(articleBtnThree);
			pageLoad();
			System.out.println("articleBtnThree clicked successfully");
		} else {
			System.out.println("articleBtnThree is not presented in the page");
			throw new Exception("articleBtnThree is not presented in the page");
		}
	}

}
