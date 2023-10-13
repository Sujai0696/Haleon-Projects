package com.qa.bens.checklist.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.util.ExcelWrite;
import com.qa.tums.eng.util.LogFile;
import com.qa.tums.eng.util.Xls_Reader;

public class SampleBau extends BaseClass{

	public static LogFile log = new LogFile();
	public static String lauchingURL;

//	public static ExcelWrite xls; 

	public SampleBau() {
		PageFactory.initElements(driver, this);
	}

	//	@FindBy(xpath = "//body/div/div[@id='content']/div/div/div/div/div/div/div/div[2]/div/div/div[9]/div/div/div[1]/div/figure/figcaption/p[3]/a")
	//	private static WebElement excelValue;


	private WebElement xpathMethod(String xpathValue) {
		WebElement findElement = driver.findElement(By.xpath(xpathValue));
		return findElement;
	}

	public void clickValueInXpath(String path, String xpath, String Sno)   {
//		xls	= new ExcelWrite();




		try {
			launchURL(path);
			implicitWait();
			String LandingPage ="https://pronamel-us.preprod-cf65.ch.adobecqms.net/products/";
			String LandindPageWithoutSlash = "https://pronamel-us.preprod-cf65.ch.adobecqms.net/products";
			String withCred="https://haleonstaging1:Health2023@pronamel-us.preprod-cf65.ch.adobecqms.net/products/";
			String withCredWithoutSlash="https://haleonstaging1:Health2023@pronamel-us.preprod-cf65.ch.adobecqms.net/products";
			lauchingURL = getCurrentUrl();
			if (isElementPresent(xpathMethod(xpath))) {
				clickElementUsingJavaScript(xpathMethod(xpath));
				Thread.sleep(2000);
				String	currentUrl = getCurrentUrl();
				System.out.println("After clicked on the Functionality: ---->   "+currentUrl);
				if (compareTwoTextif(currentUrl, LandingPage)) {
					System.out.println("After Redirection Current URL and Landing URL are same");
					log.pass(lauchingURL+"  ---->After Redirection Current URL and Landing URL are same");
					log.pass(xpath+"     ---->"+Sno);
					//xls.setCellData("RootRelative", "Result", i, "Pass");
				} else if (compareTwoTextif(currentUrl, LandindPageWithoutSlash)) {
					System.out.println("After Redirection Current URL and Landing URL are same");
					log.pass(lauchingURL+"  ---->After Redirection Current URL and Landing URL are same");
					log.pass(xpath+"     ---->"+Sno);
					//xls.setCellData("RootRelative", "Result", i, "Pass");
				}else if (compareTwoTextif(currentUrl, withCred)) {
					System.out.println("After Redirection Current URL and Landing URL are same");
					log.pass(lauchingURL+"  ---->After Redirection Current URL and Landing URL are same");
					log.pass(xpath+"     ---->"+Sno);
					//xls.setCellData("RootRelative", "Result", i, "Pass");
				}else if (compareTwoTextif(currentUrl, withCredWithoutSlash)) {
					System.out.println("After Redirection Current URL and Landing URL are same");
					log.pass(lauchingURL+"  ---->After Redirection Current URL and Landing URL are same");
					log.pass(xpath+"     ---->"+Sno);
					//xls.setCellData("RootRelative", "Result", i, "Pass");
				}else {
					System.out.println("After Redirection Current URL and Landing URL are not same");
					log.fail(lauchingURL+"  --->After Redirection Current URL and Landing URL are not same");
					log.fail(xpath+"     ---->"+Sno);
					//xls.setCellData("RootRelative", "Result", i, "Fail");
					Assert.assertTrue(false, "After Redirection Current URL and Landing URL are not same");
				}
			}
			//				else {
			//					System.out.println(lauchingURL+"xpath is not presented in the page");
			//					log.fail(lauchingURL+"  --->xpath is not presented in the page");
			//					log.fail(xpath);
			//					Assert.assertTrue(false, "xpath is not presented in the page");
			//				}
		} catch (Exception e) {
			System.out.println(lauchingURL+"xpath is not presented in the page");
			log.fail(lauchingURL+"  --->xpath is not presented in the page");
			log.fail(xpath+"     ---->"+Sno);
			//				xls.setCellData("RootRelative", "Result", i, "Fail");
			Assert.assertTrue(false, "xpath is not presented in the page");
		}



	}
}
