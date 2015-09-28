package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoElectricianServicePage;
import pages.LoHomePage;

public class TestBookElectrician {

    WebDriver driver;
	
	//setup the browser

	@BeforeTest
	public void setup(){
		
	//create firefox browser oobject
	driver= new FirefoxDriver();

	//go to localoye homepage
	driver.get("http://localoye.com");
	
	//maximize the browser wiondow
	driver.manage().window().maximize();
	
	}

	//Test whether user is able to book an Electrician or not

	@Test
	public void BookElectrician()
	 {
	
	//Creates Home page object and navigates to electricians section
	LoHomePage HpObject = new LoHomePage(driver);
	HpObject.navigateElectrianSection();


	//Creates Electrician Page Object and fills up & submits the user requirements
	LoElectricianServicePage EpObject = new LoElectricianServicePage(driver);
	EpObject.fillRequirments();
	
	 }
}
