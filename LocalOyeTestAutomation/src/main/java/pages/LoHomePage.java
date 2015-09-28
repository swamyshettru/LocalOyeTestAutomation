package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoHomePage {

	private WebDriver driver;
	
	//Initialize the constructor

	public LoHomePage(WebDriver driver){
		this.driver=driver;
	}

	//selects the electricians section
	
	public void navigateElectrianSection()
	 {
	
		//wait until the location element gets displayed
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Bangalore')]")));
		
		//choose location as Bangalore"
		
		driver.findElement(By.xpath("//h3[contains(text(),'Bangalore')]")).click();

		//click on electrician section

		driver.findElement(By.xpath("//h3[text()='Electricians']")).click();
	 }
}
