package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class TumsheartburnreliefhomeremdiesPages extends BaseClass {
	
	public TumsheartburnreliefhomeremdiesPages() {
		PageFactory.initElements(driver, this);
	}	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
	
	
	@FindBy(xpath="(//ol[@class=\"breadcrumbs-list breadcrumbs-without-separator\"])[2]//li[2]")
    private static WebElement HeartBurn101breadcrumbs;
	
	@FindBy(xpath="(//li[text()=' Heartburn Relief Home Remedies '])[2]")
    private static WebElement heartburnreliefhomeremdies;	
	
	@FindBy(xpath="//a[text()='heartburn symptoms']")
    private static WebElement heartburnsymptoms;
	
	@FindBy(xpath="//a[text()='antacid such as TUMS']")
    private static WebElement antacidTums;
	
	@FindBy(xpath="//a[text()='home remedies']")
    private static WebElement homeremedies;
	
	@FindBy(xpath="//a[text()='changing lifestyle habits']")
    private static WebElement changinglifestylehabits;
	
	@FindBy(xpath="(//a[text()='sleeping on your left side'])[1]")
    private static WebElement sleepingleftside;
	
	@FindBy(xpath="(//a[text()='apple cider vinegar'])")
    private static WebElement applecidervinegar;
	
	@FindBy(xpath="(//a[text()='classic burning sensation associated with heartburn'])")
    private static WebElement classicburningsensation;
	
	@FindBy(xpath="(//a[text()='Ginger can help relieve nausea'])")
    private static WebElement gingerrelievenausea;
	
	@FindBy(xpath="(//a[text()='foods that cause heartburn'])")
    private static WebElement foodcauseheartburn;
	
	@FindBy(xpath="(//a[text()='Tight waistbands or belts'])")
    private static WebElement tightwaistbands;
	
	@FindBy(xpath="(//a[text()='sleeping on your left side'])[2]")
    private static WebElement slepingleftside1;
	
	@FindBy(xpath="(//a[text()='See products'])")
    private static WebElement seeproducts;
	
	
	
	
	
	
	
	
	
	
	
	
	//methods
	
	public void clickCookieBtn() throws Exception {
		//visibilityOf(cookieBtn);
        if (isElementPresent(cookieBtn)) {
            elementToBeClickable(cookieBtn);
            try {
                if (cookieBtn.isDisplayed()) {
                    clickElementUsingJavaScript(cookieBtn);
                }
              implicitWait();
               actionClick(cookieClose);
                Assert.assertTrue(elementIsDisplayed(cookieClose));
            } catch (Exception e) {
            }
        }else {
            System.out.println("Dismiss is not presented");
        }
	}
			public void clickonHeartburn101breadcrumbs() throws Throwable {
				clickElementUsingJavaScript(HeartBurn101breadcrumbs);
		}
			
			public void clickonheartburnreliefhomeremdies() throws Throwable {
				clickElementUsingJavaScript(heartburnreliefhomeremdies);
		}
			public void clickonheartburnsymptoms() throws Throwable {
				clickElementUsingJavaScript(heartburnsymptoms);
		}
			public void clickonantacidsTums() throws Throwable {
				clickElementUsingJavaScript(antacidTums);
		}
			public void clickonhomeremedies() throws Throwable {
				clickElementUsingJavaScript(homeremedies);
		}
			public void clickonchanginglifestylehabits() throws Throwable {
				clickElementUsingJavaScript(changinglifestylehabits);
		}
			public void clickonsleepingleftside() throws Throwable {
				clickElementUsingJavaScript(sleepingleftside);
		}
			public void clickonapplecidervinegar() throws Throwable {
				clickElementUsingJavaScript(applecidervinegar);
		}
			public void clickonclassicburningsensation() throws Throwable {
				clickElementUsingJavaScript(classicburningsensation);
		}
			public void clickongingerrelievenausea() throws Throwable {
				clickElementUsingJavaScript(gingerrelievenausea);
		}
			public void clickonfoodcauseheartburn() throws Throwable {
				clickElementUsingJavaScript(foodcauseheartburn);
		}
			public void clickontightwaistbands() throws Throwable {
				clickElementUsingJavaScript(tightwaistbands);
		}
			public void clickonsleepingleftside1() throws Throwable {
				clickElementUsingJavaScript(slepingleftside1);
		}
			public void clickonseeproducts() throws Throwable {
				clickElementUsingJavaScript(seeproducts);
		}
	
	
	

}
