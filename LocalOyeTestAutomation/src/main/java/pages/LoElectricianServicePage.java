package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoElectricianServicePage {

	private WebDriver driver;

	public LoElectricianServicePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	//Fills the requiremnts & Submit

	public void fillRequirments()
	
	 {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Electrical Repairs')]")));
		//Click on electrical repairs "$x('//div[contains(text(),"Electrical Repairs")]')"

		driver.findElement(By.xpath("//div[contains(text(),'Electrical Installations')]")).click();

		//Click on Wall fan by "$x('//div[contains(text(),"Wall fan")]')"
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//div[contains(text(),'Ceiling fan')]")).click();

		//Click on add to cart button by "$x('//button[contains(text(),"Add to Cart")]')"

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(text(),'Add to Cart')]")).click();

		//Click on checkout $x('//button[contains(text(),"Checkout")]')
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//button[contains(text(),'Checkout')]")).click();		

		//Click on next by "$x('//button[@class="button orange not-rounded-next ng-scope"]')"
		
		driver.findElement(By.xpath("//button[@class='button orange not-rounded-next ng-scope']")).click();

		//add additional info $x('//input[@class="text-input ng-pristine ng-untouched ng-valid"]')[0]
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input(@class='text-input ng-pristine ng-untouched ng-valid')[0]")).sendKeys("This is sample additional requirement");

		//click on next by "$x('//button[contains(text(),"Next")]')[0]"

		driver.findElement(By.xpath("//button[contains(text(),'Next')]')[0]")).click();

		//click on calander icon by "$x('//span[@class="input-group-addon"]')"
		
		driver.findElement(By.xpath("//span[@class='input-group-addon']')")).click();


		//Click on date by "$x('//td[contains(text(),"10")]')[0]"

		driver.findElement(By.xpath("//td[contains(text(),'10')]')[0]")).click();

		//Click on time by "$x('//span[contains(text(), "6:00 PM")]')"

		driver.findElement(By.xpath("//span[contains(text(), '6:00 PM')]')")).click();
}
}
