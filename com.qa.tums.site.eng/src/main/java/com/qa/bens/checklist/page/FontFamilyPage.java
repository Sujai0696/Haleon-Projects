package com.qa.bens.checklist.page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.util.LogFile;

public class FontFamilyPage extends BaseClass{
	
	public static LogFile log = new LogFile();
	
	String currentUrl;
	

	public FontFamilyPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//*[@id='content']//*[text()]")
	private static List<WebElement> gettingText;


	String expectedFontFamily = "sans-serif";
	
	
	public void launchUrl(String path) {
		try {
			implicitWait();
			launchURL(path);
		} catch (Exception e) {
			
		}

	}
	
	
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


	public void getAndVerifyFontFamily() {
		implicitWait();
		try {
			implicitWait();
			for (WebElement element : gettingText) {
				String fontFamily = element.getCssValue("font-family");
				String text = element.getText();
				if (!text.isBlank()) {
					System.out.println("Element Text: " + element.getText());
				    System.out.println("Font Family: " + fontFamily);
				    System.out.println();
					if (fontFamily.equalsIgnoreCase(expectedFontFamily)) {
						System.out.println("Font family is as expected.");
						 currentUrl = getCurrentUrl();
						log.pass(currentUrl);
						log.pass(text+"   :"+fontFamily+"   :"+expectedFontFamily);
					} else {
						System.out.println("Font family is not as expected.");
						log.fail(currentUrl);
						log.fail(text+"   :"+fontFamily+"   :"+expectedFontFamily);
					}
				} 
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}


	}

}
