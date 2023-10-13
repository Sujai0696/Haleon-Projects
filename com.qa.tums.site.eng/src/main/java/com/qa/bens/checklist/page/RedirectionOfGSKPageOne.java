package com.qa.bens.checklist.page;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class RedirectionOfGSKPageOne extends BaseClass{

	public RedirectionOfGSKPageOne() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[contains(@href,'gsk')]")
	private static List<WebElement> gskInLink;


	public void verifyRedirectionOfGSK() throws Exception {
		implicitWait();
		launchURL("https://www.sensodyne.be/");
		pageLoad();
		
		String currentUrl = getCurrentUrl();
		System.out.println(currentUrl);

		int size = gskInLink.size();
		System.out.println(size);

		if (size==0) {
			System.out.println("GSK Links are not presented in the page");
		} else {
//			for (WebElement string : gskInLink) {
				for (int i = 0; i < gskInLink.size(); i++) {
					WebElement element = gskInLink.get(i);

				String parentWindowHandle = driver.getWindowHandle();
				clickElementUsingJavaScript(element);
				String currentUrl3 = getCurrentUrl();
				pageLoad();
//				Set<String> windowHandles = driver.getWindowHandles();
				List<String> windowHandles = new ArrayList<String>(driver.getWindowHandles());
				
				int newWindowIndex = -1;
				for (int j = 0; j < windowHandles.size(); j++) {
				    if (!windowHandles.get(j).equals(parentWindowHandle)) {
				        newWindowIndex = j;
				        break;
				    }
				}
				
				

//				for (String handle : windowHandles) {
					
					if (newWindowIndex != -1) {
						driver.switchTo().window(windowHandles.get(newWindowIndex));
//						driver.switchTo().window(handle);
						String currentUrl2 = getCurrentUrl();
						System.out.println(currentUrl2);
						
						if (currentUrl2.contains("gsk")) {
							System.out.println("current url contains GSK");
							// Perform actions on the new window
							System.out.println("New Window URL: " + driver.getCurrentUrl());
							driver.close(); // Close the new window
							driver.switchTo().window(parentWindowHandle);

							String attribute2 = element.getAttribute("href");
							String attribute = element.getAttribute("textContent");
							System.out.println(attribute+"  <----->  "+attribute2);
							System.out.println("GSK links are Presented in the Page");

						} else {
							driver.close(); // Close the new window
							driver.switchTo().window(parentWindowHandle);
							pageLoad();
							System.out.println("current url is not contains GSK");
							String attribute2 = element.getAttribute("href");
							String attribute = element.getAttribute("textContent");
							System.out.println(attribute+"  <----->  "+attribute2);
							System.out.println("GSK links are not Presented in the Page");

						}
					}else {
						if (currentUrl3.contains("gsk")) {
							System.out.println("current url contains GSK");
							// Perform actions on the new window
							System.out.println("Parent Window URL: " + driver.getCurrentUrl());
//							driver.close(); // Close the new window
//							driver.switchTo().window(parentWindowHandle);
							navigateBack();
							pageLoad();
							String attribute2 = element.getAttribute("href");
							String attribute = element.getAttribute("textContent");
							System.out.println(attribute+"  <----->  "+attribute2);
							System.out.println("GSK links are Presented in the Page");

						} else {
							navigateBack();
							pageLoad();
							System.out.println("current url is not contains GSK");
							String attribute2 = element.getAttribute("href");
							String attribute = element.getAttribute("textContent");
							System.out.println(attribute+"  <----->  "+attribute2);
							System.out.println("GSK links are not Presented in the Page");
							
						}
						
					}
//				}
			}
		}
	}
}
