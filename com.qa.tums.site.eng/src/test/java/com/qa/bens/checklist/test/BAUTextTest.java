package com.qa.bens.checklist.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.bens.checklist.page.BAUTextPage;
import com.qa.tums.eng.util.DataProviderCode;

public class BAUTextTest extends BaseClass{

	BAUTextPage bt;

	@BeforeClass
	private void launchTheBrowser() throws Exception {
		browserLaunch(loadConfig("checkListConfig.properties").getProperty("browser"));
		bt = new BAUTextPage();
	}

	//dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class
	@Test(dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class)
	private void verifyText(String Path) throws Exception {
		bt.verifyParticularText(Path);
		System.out.println("---->**************************************************<----");

	}

}
