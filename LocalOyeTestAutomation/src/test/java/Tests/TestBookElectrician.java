package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoElectricianServicePage;
import pages.LoHomePage;

public class TestBookElectrician {

    WebDriver driver;
	
	//initialize browser

	@BeforeTest
	public void setup()
	{
		//System.setProperty("webdriver.chrome.driver", "C:/Users/swamy/Downloads/chromedriver_win32/chromedriver.exe");
//	driver=new ChromeDriver();
		driver= new FirefoxDriver();

	//go to localoye homepage
	driver.get("http://localoye.com");
	driver.manage().window().maximize();
	
	}


	//Tests whether user is able to book an Electrician or not

	@Test
	public void BookElectrician()
	 {
	
	//Creates Home page object and navigates to electrician section

		LoHomePage HpObject = new LoHomePage(driver);
		HpObject.navigateElectrianSection();


	//Creates Electrician Page Object and fills up & submits the user requirements

		LoElectricianServicePage EpObject = new LoElectricianServicePage(driver);
		EpObject.fillRequirments();
}
}
