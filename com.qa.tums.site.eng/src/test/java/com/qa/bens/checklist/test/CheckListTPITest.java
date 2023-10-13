package com.qa.bens.checklist.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.bens.checklist.page.CheckListTPIPage;
import com.qa.tums.eng.util.DataProviderCode;

public class CheckListTPITest extends BaseClass{
	
	CheckListTPIPage tpi;
	
	@BeforeClass
	private void launchTheBrowser() throws Exception {
		browserLaunch(loadConfig("checkListConfig.properties").getProperty("browser"));
		tpi = new CheckListTPIPage();
	}

	@Test(dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class)
	private void findingTPI(String path) throws Exception {
		tpi.verifyTPI(path);
		System.out.println("---->**********************************************<----");
	}

}
