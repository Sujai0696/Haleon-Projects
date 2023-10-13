package com.qa.bens.checklist.page;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class ServerCheckerPage extends BaseClass{
	
	public ServerCheckerPage() {
		PageFactory.initElements(driver, this);
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
	 
	 public void responseCodeCheck(String path) throws Exception {
		 pageLoad();
		 String serverURL = path;
	        
	        int responseCode = getResponseCode(serverURL);

	        if (responseCode == HttpURLConnection.HTTP_OK) {;
	            System.out.println("Server is up."+responseCode+ serverURL);
	            
	        } else {
	            System.out.println("Server is down! Response code: " + responseCode + serverURL);
	            // Perform actions like sending an email or triggering an alert here
	        }

	        driver.quit();
	}

}
