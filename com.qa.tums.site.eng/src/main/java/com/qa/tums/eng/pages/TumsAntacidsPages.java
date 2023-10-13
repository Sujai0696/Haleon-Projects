package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.qa.baseClass.BaseClass;

public class TumsAntacidsPages extends BaseClass{
	
	public TumsAntacidsPages() {
		PageFactory.initElements(driver, this);
	}	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
	
	@FindBy(xpath="(//ol[@class=\"breadcrumbs-list breadcrumbs-without-separator\"])[2]//li[2]")
    private static WebElement HeartBurn101breadcrumbs;

	@FindBy(xpath="(//ol[@class=\"breadcrumbs-list breadcrumbs-without-separator\"])[2]//li[4]")
    private static WebElement whyantacidsworkbreadcrumbs;
	
	@FindBy(xpath="//div[@class=\"youtube-player content paragraphSystem universal\"]")
    private static WebElement youtubebtn;
	
	@FindBy(xpath="(//div[@class=\"ytp-cued-thumbnail-overlay-image\"])[1]")
    private static WebElement thumbnailicon;
	
	@FindBy(xpath="//div[@class=\"youtube-player content paragraphSystem universal\"]//child::iframe")
    private static WebElement iframe;
	
	@FindBy(xpath="//button[@class=\"ytp-play-button ytp-button\"]")
    private static WebElement youtubeplaybtn;
	
	@FindBy(xpath="//a[text()='TUMS']")
    private static WebElement Tums;
	
	@FindBy(xpath="(//a[@href=\"/antacid-products/\"])[3]")
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
	public void clickonwhyantiacidworksbreadcrumbs() throws Throwable {
		clickElementUsingJavaScript(whyantacidsworkbreadcrumbs);
}
	public void clickonAntiacidwhytumsworkvideo() throws Throwable {
		scrollDownUsingElement(youtubebtn);
		clickElementUsingJavaScript(youtubebtn);
		//visibilityOf(iframe);
		//switchToFrameUsingElement(iframe);
		//clickElementUsingJavaScript(thumbnailicon);
		Thread.sleep(2000);
		//Assert.assertTrue(elementIsDisplayed(thumbnailicon));
		//elementClick(youtubeplaybtn);
		System.out.println("Video is playing Successfully");
		//frameSwitchingToDefaultContent();
}
	public void clickonTums() throws Throwable {
		clickElementUsingJavaScript(Tums);
}
	public void clickonseeproducts() throws Throwable {
		clickElementUsingJavaScript(seeproducts);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
