package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{

	//	LoginPage loginPage;
	//	HomePage homePage;

	public LoginPageTest() {
		super();
	}

	//	@BeforeMethod
	//	public void setUp() {
	//		initialization();
	//		loginPage = new LoginPage();
	//		
	//		
	//	}

	//	@Test(priority = 1)
	//	public void LoginPageTitleTest() {
	//		String title = loginPage.validateLoginPageTitle();
	//		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
	//
	//
	//	}
	//	
	//	@Test(priority = 2)
	//	public void CRMLogoImageTest() {
	//		boolean flag = loginPage.validateCrmImage();
	//		Assert.assertTrue(flag);
	//	}

	@Test(priority = 1)
	public void LoginTest() {
		log.info("****************************** starting test case *****************************************");
		log.info("****************************** LoginTest *****************************************");
		System.out.println("Test");

		System.out.println("\n Hello world ... \n");


		log.trace("This is a trace message");
		log.info("This is information message.");
		log.error("This is an error message.");
		log.warn("This is a warning message.");
		log.fatal("This is a fatal message.");


		System.out.println("\n  Completed successfully...");
		//		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

		log.info("****************************** ending test case *****************************************");
		log.info("****************************** LoginTest *****************************************");

	}

//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}





}
