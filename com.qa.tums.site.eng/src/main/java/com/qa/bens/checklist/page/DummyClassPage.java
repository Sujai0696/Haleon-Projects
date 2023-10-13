package com.qa.bens.checklist.page;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class DummyClassPage extends BaseClass{

	public static String serverURL;

	public DummyClassPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@href]")
	private static List<WebElement> links;


	public void getAllTheLinks() {

		for (WebElement webElement : links) {

			String attribute = webElement.getAttribute("href");

			//			System.out.println(attribute);

			serverURL =attribute;

			int responseCode = getResponseCode(serverURL);
			
//			.HTTP_OK
//			HTTP_NOT_FOUND

			if (responseCode == HttpURLConnection.HTTP_OK) {
				System.out.println("Server is up."+responseCode+attribute);
			} else {
				System.out.println("Server is down! Response code: " + responseCode+attribute);
			}

		}



	}





	private static int getResponseCode(String urlString) {
		int responseCode = -1;
		try {
			URL url = new URL(urlString);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.connect();
			responseCode = connection.getResponseCode();
			connection.disconnect();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return responseCode;



	}


}
