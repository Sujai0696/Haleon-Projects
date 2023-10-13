package com.qa.bens.checklist.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.baseClass.BaseClass;
import com.qa.bens.checklist.page.HttpsVsHttpRedirectionPage;
import com.qa.tums.eng.util.DataProviderCode;

public class HttpsVsHttpRedirectionTest extends BaseClass{

	HttpsVsHttpRedirectionPage hh;



	@BeforeClass
	private void launchTheBrowser() throws Exception {
		browserLaunch(loadConfig("checkListConfig.properties").getProperty("browser"));
		hh = new HttpsVsHttpRedirectionPage();
	}

	@Test(dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class)
	private void checkListHttpsVsHttpRedirection(String path) throws Exception {
		hh.verifyHttpsVsHttpRedirecion(path);
		System.out.println("---->**************************************************<----");
	}

}
