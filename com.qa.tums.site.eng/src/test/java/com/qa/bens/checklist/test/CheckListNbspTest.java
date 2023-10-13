package com.qa.bens.checklist.test;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.inject.spi.Element;
import com.qa.baseClass.BaseClass;
import com.qa.bens.checklist.page.CheckListNbspPage;
import com.qa.tums.eng.util.DataProviderCode;
import com.qa.tums.eng.util.LogFile;

public class CheckListNbspTest extends BaseClass{
	
	CheckListNbspPage nbsp;

	@BeforeClass
	private void launchTheBrowser() throws Exception {
		browserLaunch(loadConfig("checkListConfig.properties").getProperty("browser"));
		nbsp = new CheckListNbspPage();
	}

//dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class
	@Test()
	private void verifyNBSP() throws Exception {
		nbsp.verifyNbsp();
		System.out.println("---->**************************************************<----");
		
	}

}
