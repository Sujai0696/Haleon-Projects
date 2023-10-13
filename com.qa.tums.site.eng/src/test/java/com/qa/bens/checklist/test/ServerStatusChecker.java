package com.qa.bens.checklist.test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import com.qa.baseClass.BaseClass;

public class ServerStatusChecker extends BaseClass{

    public static void main(String[] args) throws IOException, Exception {
    	browserLaunch(loadConfig("checkListConfig.properties").getProperty("browser"));

        // Navigate to the URL of the server you want to monitor
        driver.get("https://haleonstaging1:Health2023@preparationh-v3-com.preprod-cf65.ch.adobecqms.net/es/relief-finder/");
        
        String serverURL ="https://www.preparationh.com/contact-u/";
        
        int responseCode = getResponseCode(serverURL);

        if (responseCode == HttpURLConnection.HTTP_OK) {;
            System.out.println("Server is up."+responseCode);
        } else {
            System.out.println("Server is down! Response code: " + responseCode);
            // Perform actions like sending an email or triggering an alert here
        }

        // Quit the WebDriver
        driver.quit();
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

