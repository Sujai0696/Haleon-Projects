package com.qa.drbest.ge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class DrBestForschungPage extends BaseClass{
	
	public DrBestForschungPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Akzeptieren']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//div[@class='richText component section default-style odd last col-xs-12 col-sm-5 col-sm-offset-7']//ancestor::a[@href='/zahnbuersten/classic-schwingkopf/']")
	private static WebElement linkUnder1993;
	
	@FindBy(xpath = "//div[@class='box component section forschung-2003 even col-xs-12']//ancestor::a[@href='/zahnbuersten/professional-atemfrisch/']")
	private static WebElement linkUnder2003;
	
	@FindBy(xpath = "//div[@class='box component section forschung-2006 even col-xs-12']//ancestor::a[@href='/zahnbuersten/vibration-multi-expert/']")
	private static WebElement linkUnder2006;
	
	@FindBy(xpath = "//div[@class='box component section forschung-2008 even col-xs-12']//ancestor::a[@href='/zahnbuersten/premium-x-zwischenzahn/']")
	private static WebElement linkUnder2008;
	
	@FindBy(xpath = "//div[@class='box component section forschung-2013 even col-xs-12']//ancestor::a[@href='/zahnbuersten/professional-polimed/']")
	private static WebElement linkUnder2013;
	
	@FindBy(xpath = "//div[@class='richText component section text-2021 odd last']//ancestor::a[@href='/drbest-forschung/']")
	private static WebElement interdentalburstenLink;
	
	@FindBy(xpath = "//div[@class='box component section forschung-2017 even col-xs-12']//ancestor::a[@href='/zahnbuersten/green-clean/']")
	private static WebElement greenCleanLink;
	
	@FindBy(xpath = "//div[@class='box component section forschung-2017 even last col-xs-12']//ancestor::a[@href='/zahnbuersten/green-sensitive/']")
	private static WebElement linkUnder2022;
	
	
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
			Assert.assertTrue(false);
		}
	}
	
	public void clickLinkUnder1993() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(linkUnder1993);
		clickElementUsingJavaScript(linkUnder1993);
		pageLoad();
	}
	
	public void clickLinkUnder2003() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(linkUnder2003);
		clickElementUsingJavaScript(linkUnder2003);
		pageLoad();
	}
	
	public void clickLinkUnder2006() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(linkUnder2006);
		clickElementUsingJavaScript(linkUnder2006);
		pageLoad();
	}
	
	public void clickLinkUnder2008() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(linkUnder2008);
		clickElementUsingJavaScript(linkUnder2008);
		pageLoad();
	}
	
	public void clickLinkUnder2013() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(linkUnder2013);
		clickElementUsingJavaScript(linkUnder2013);
		pageLoad();
	}
	
	public void clickInterdentalburstenLink() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(interdentalburstenLink);
		clickElementUsingJavaScript(interdentalburstenLink);
		pageLoad();
	}
	
	public void clickGreenCleanLink() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(greenCleanLink);
		clickElementUsingJavaScript(greenCleanLink);
		pageLoad();
	}
	
	public void clickLinkUnder2022() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(linkUnder2022);
		clickElementUsingJavaScript(linkUnder2022);
		pageLoad();
	}
	
	

}
