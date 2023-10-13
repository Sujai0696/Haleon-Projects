package com.qa.bens.checklist.page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.util.LogFile;

public class CentrumGnePage extends BaseClass{

	public CentrumGnePage() {
		PageFactory.initElements(driver, this);
	}

	public static LogFile log = new LogFile();

	@FindBy(xpath = "//main//*[contains(@href,'/en-gne/learn/')]")
	private static List<WebElement> learnArticles;

	@FindBy(xpath = "//main//*[contains(@href,'/en-gne/about/')]")
	private static List<WebElement> learnAbout;

	//	@FindBy(xpath = "(//a[@href='/en-gne/learn/articles/nutrients-and-routine/'])[1]")
	//	private static WebElement text;
	//	
	//	public void getallText() throws Exception {
	//		launchURL("https://haleonstaging1:Health2023@centrumarabia-com.preprod-cf65.ch.adobecqms.net/en-gne/");
	//		pageLoad();
	//		
	//		String attribute = text.getAttribute("textContent");
	//		System.out.println(attribute);
	//	}




	public void getTextForLearnArticles(String path) throws Exception{
		implicitWait();
//		List<String> listOne = new ArrayList<String>();
//		String text = null;
		launchURL(path);
		implicitWait();
		pageLoad();
		String currentUrl = getCurrentUrl();
		System.out.println(currentUrl);
		log.info(currentUrl);
		implicitWait();
		//		for (int i = 0; i < learnArticles.size(); i++) {
		//			text = learnArticles.get(i).getAttribute("textContent");
		//			listOne.add(text);
		//			System.out.println(listOne);
		//		} 

		int size = learnArticles.size();
		System.out.println(size);
		
		String string2 = Integer.toString(size);
		log.info("Learn Article Size --->:   "+string2);
		
		
		if (size==0) {
			log.pass("Learn Articles is not presented in the page");
		} else {
			for (WebElement string : learnArticles) {
				String attribute2 = string.getAttribute("href");
				String attribute = string.getAttribute("textContent");
				System.out.println(attribute+"<----->"+attribute2);
				log.fail("Learn Articles is Presented in the Page");
				log.fail(attribute+"<----->"+attribute2);
				System.out.println("**************************************");
			}
		}

		int size2 = learnAbout.size();
		System.out.println(size2);
		
		String string = Integer.toString(size2);
		log.info("About Article Size --->:   "+string);
		
		if (size2==0) {
			log.pass("About Articles is not presented in the page");
		} else {
			for (WebElement about : learnAbout) {
				String attribute3 = about.getAttribute("href");
				String attribute4 = about.getAttribute("textContent");
				System.out.println(attribute4+"<----->"+attribute3);
				log.fail("About Articles is Presented in the Page");
				log.fail(attribute4+"<----->"+attribute3);
				System.out.println("**************************************");
			}
		}












	}

}
