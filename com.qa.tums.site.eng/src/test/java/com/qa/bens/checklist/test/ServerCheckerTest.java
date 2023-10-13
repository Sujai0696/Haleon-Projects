package com.qa.bens.checklist.test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.bens.checklist.page.ServerCheckerPage;
import com.qa.tums.eng.util.DataProviderCode;

public class ServerCheckerTest extends BaseClass{
	
	ServerCheckerPage scp;
	
	@BeforeClass
	private void launchTheBrowser() throws Exception {
		browserLaunch(loadConfig("checkListConfig.properties").getProperty("browser"));
		scp = new ServerCheckerPage();
	}
	
	@Test(dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class)
	private void ServerStatusChecker(String path) throws Exception {
		scp.responseCodeCheck(path);
	}
	

}
