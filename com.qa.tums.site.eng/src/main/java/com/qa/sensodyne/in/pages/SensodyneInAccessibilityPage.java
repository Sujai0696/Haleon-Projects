package com.qa.sensodyne.in.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class SensodyneInAccessibilityPage extends BaseClass{
	
	public SensodyneInAccessibilityPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first last ']//ancestor::a[text()='home']//self::a[@href='/']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//a[text()='contact us' and @href='/contact.html']")
	private static WebElement hyperLink;
	
	
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
	
	public void clickHyperLink() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLink)) {
			scrollDownUsingElement(hyperLink);
			clickElementUsingJavaScript(hyperLink);
			pageLoad();
			System.out.println("hyperLink clicked successfully");
		} else {
			System.out.println("hyperLink is not presented in the page");
			throw new Exception("hyperLink is not presented in the page");
		}
	}

}
