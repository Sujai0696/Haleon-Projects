package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;


public class TumsHowtoReduceHeartBurnPages extends BaseClass {
	public TumsHowtoReduceHeartBurnPages() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(text(),'Heartburn 101 ')]")
    private static WebElement heartburn;
	
	@FindBy(xpath="//button[@id='onetrust-accept-btn-handler']")
    private static WebElement cookiesDismissBtn;
	
	@FindBy(xpath="(//a[@href=\"/about-heartburn/quick-heartburn-relief/how-to-reduce-heartburn/\"])[2]")
    private static WebElement reduceheartburn;
	
	@FindBy(xpath = "//nav[@aria-label=\"Breadcrumb\"]//li[@class=\"breadcrumb-list-item odd first \"]")
    private static WebElement Bread_HomeIcon;

	@FindBy(xpath = "//nav[@aria-label='Breadcrumb']//li[@class='breadcrumb-list-item even ']")
    private static WebElement Bread_Heartburn101;
	
//	@FindBy(xpath="//img[@title=\"Twitter\"]")
//	private static WebElement twitter;
//	
//	@FindBy(xpath = "//img[@Title='Facebook']")
//	private static WebElement facebook;
//	
//	@FindBy(xpath = "//img[@Title='Email']")
//	private static WebElement gmail;
//	
	@FindBy(xpath = "//a[text()='spicy foods']")
	private static WebElement spicyfood;
	
	@FindBy(xpath="//button[@id='onetrust-accept-btn-handler']")
    private static WebElement cookiesDismissBtnsed;
	
	
	//methods
	public void clickonheartburns() throws Throwable {
		moveToElement(heartburn);
}
	public void clickonreduceheartburn() throws Throwable {
		//moveToElement(heartburn);
		clickElementUsingJavaScript(reduceheartburn);
	}
	public void clickOnHomeIcon() throws Throwable {
		scrollDownUsingElement(heartburn);
		moveToElement(Bread_HomeIcon);
		clickElementUsingJavaScript(Bread_HomeIcon);
		//System.out.println("print on home icon");
	}
	public void clickCookiesDismissBtns() throws Exception {
	     clickElementUsingJavaScript(cookiesDismissBtnsed);
	     
		 }
	public void clickOnHeartBurn101() throws Throwable {
		scrollDownUsingElement(heartburn);
		moveToElement(Bread_Heartburn101);
		clickElementUsingJavaScript(Bread_Heartburn101);
	}
//	public void clickOnTwitter() throws Throwable {
//		scrollDownUsingElement(heartburn);
//		//elementClick(cookiesDismissBtn);
//		moveToElement(twitter);
//		clickElementUsingJavaScript(twitter);
//		windowHandle();
//	}
//	public void clickOnFaceBook() throws Throwable {
//		scrollDownUsingElement(heartburn);
//		moveToElement(facebook);
//		elementClick(facebook);
//		windowHandle();
//	}
//	public void clickOnGmail() throws Throwable {
//		scrollDownUsingElement(heartburn);
//		moveToElement(gmail);
//		elementClick(gmail);
//		windowHandle();
//	}
	public void clickOnspicyfood() throws Throwable {
		scrollDownUsingElement(heartburn);
		moveToElement(spicyfood);
		clickElementUsingJavaScript(spicyfood);
		
	}
	
	
	public void clickCookiesDismissBtn() throws Exception {
	     clickElementUsingJavaScript(cookiesDismissBtn);
	     }
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
