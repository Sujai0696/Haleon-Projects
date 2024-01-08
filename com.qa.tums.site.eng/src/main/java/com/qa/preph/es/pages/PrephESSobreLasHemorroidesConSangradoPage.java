package com.qa.preph.es.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class PrephESSobreLasHemorroidesConSangradoPage extends BaseClass{
	
	public PrephESSobreLasHemorroidesConSangradoPage() {
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
