package Genaricusalitity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import Objectperposities.Homepage;
import Objectperposities.Loginpage;

public class Base_class {
	public WebDriver driver=null;
	public Javautility ju=new Javautility();
	public Webdriver wd=new Webdriver();
	public Excelfeching ef=new Excelfeching();
	public PropertiesFileUtility pu=new PropertiesFileUtility();
	
	@BeforeSuite
	public void bsconfig() {
		System.out.println("===DB connection===");
	}
	@AfterSuite
	public void asconfig() {
		System.out.println("===DB DISCONNECTION===");
	}
	@BeforeClass
	
	public void bcconfig() throws Throwable {//load browser and open app
		String URL = pu.readDataFrompropertyFile("url");
		String BROWSER = pu.readDataFrompropertyFile("browser");
		//runtime poly
		if(BROWSER.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			System.out.println("Edge is open");
		}
		else if(BROWSER.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			System.out.println("Chrome is opened");
		}
		else {
			System.out.println("Invalid Browser Name");
		}
		wd.maximizeWindow(driver);
		wd.waitForPageload(driver);
		driver.get(URL);
		System.out.println("URL IS OPENED");
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	@BeforeMethod
	public void bmconfig() throws Throwable {
		String UN = pu.readDataFrompropertyFile("un");
		String PWD = pu.readDataFrompropertyFile("pwd");
		Loginpage lp=new Loginpage(driver);
		lp.loginTOApp(UN, PWD);
	}
	@AfterMethod
	public void amconfig() {
		Homepage hp=new Homepage(driver);
		hp.getAdministrator().click();
		hp.getSignoutbtn();
	}

	}

	
	
	
	