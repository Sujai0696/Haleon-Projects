package com.qa.bens.checklist.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.bens.checklist.page.CheckListNbspPage;
import com.qa.tums.eng.util.DataProviderCode;

public class CheckListNbspTest extends BaseClass{
	
	CheckListNbspPage nbsp;

	@BeforeClass
	private void launchTheBrowser() throws Exception {
		browserLaunch(loadConfig("checkListConfig.properties").getProperty("browser"));
		nbsp = new CheckListNbspPage();
	}

//dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class
	@Test(dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class)
	private void verifyTM(String path) throws Exception {
		nbsp.verifyNbsp(path);
		System.out.println("---->**************************************************<----");
		
	}

}
