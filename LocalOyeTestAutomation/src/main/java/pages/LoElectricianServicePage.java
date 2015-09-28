package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoElectricianServicePage {

	private WebDriver driver;
	
	//initialize the constructor

	public LoElectricianServicePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	//method to fills the user requirements and Submit

	public void fillRequirments()
	
	 {

		//wait until the requirements section is visible
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Electrical Repairs')]")));
		
		//click on electrical installation
		driver.findElement(By.xpath("//div[contains(text(),'Electrical Installations')]")).click();

		//click on ceiling fan
		driver.findElement(By.xpath("//div[contains(text(),'Ceiling fan')]")).click();

		//click on add to cart button
		driver.findElement(By.xpath("//button[contains(text(),'Add to Cart')]")).click();

		//click on checkout $x('//button[contains(text(),"Checkout")]')
		driver.findElement(By.xpath("//button[contains(text(),'Checkout')]")).click();		

		//click on next button
		driver.findElement(By.xpath("//button[@class='button orange not-rounded-next ng-scope']")).click();

		//enter additional requirements f user
		driver.findElement(By.xpath("//input(@class='text-input ng-pristine ng-untouched ng-valid')[0]")).sendKeys("This is sample additional requirement");

		//click on next
		driver.findElement(By.xpath("//button[contains(text(),'Next')]')[0]")).click();

		//click on calander
		driver.findElement(By.xpath("//span[@class='input-group-addon']')")).click();

		//select a date
		driver.findElement(By.xpath("//td[contains(text(),'10')]')[0]")).click();

		//select the time
		driver.findElement(By.xpath("//span[contains(text(), '6:00 PM')]')")).click();
}
}
