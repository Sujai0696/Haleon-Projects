package com.qa.bens.checklist.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;

public class HeadingH1 extends BaseClass {

	

	@Test()
	private void findingTheH1Tag() throws Exception {
		browserLaunch("chrome");
		launchURL("https://www.caltrate.com/");
		Thread.sleep(3000);

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total value for a tags: "+ allLinks.size());

		Set<String> urlSet = new HashSet();

		for (WebElement link : allLinks) {
			String attribute = link.getAttribute("href");
			//					if(attribute != null)
			//						System.out.println(attribute);
			urlSet.add(attribute);

		}
		//				System.out.println(urlSet);

		System.out.println("total value set :" + urlSet.size());

		List<String> urlList = new ArrayList<String>(urlSet);

		System.out.println("total value set :" + urlList.size());

		int count = 0;
		for (int i = 0; i < urlList.size(); i++) {

			if (urlList.get(i) != null && !urlList.get(i).contains("#")) {
				if (urlList.get(i).startsWith("https://www.caltrate.com/")) {
					System.out.println(urlList.get(i));
					count++;
				}
			}

		}
		System.out.println("Count after filter  : "+count);

	}


}
