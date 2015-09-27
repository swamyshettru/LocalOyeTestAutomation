package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Predicate;


public class LoHomePage {


	//Initialize the constructor

	private WebDriver driver;


	public LoHomePage(WebDriver driver)
	{
		this.driver=driver;

	}


	// Locate & navigate to Electrician Service Section

	
	public void navigateElectrianSection()
	 {
	
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Bangalore')]")));
		//Choose the location as bangalore by locator "css=h3.ng-binding"
		
		driver.findElement(By.xpath("//h3[contains(text(),'Bangalore')]")).click();

		//Click on "Home" by locator "xpath=(//a[contains(text(),'Home')] or link=Home

		//driver.findElement(By.xpath("//a[text()='Home']")).click();

		//Click on electrician by "$x('//h3[contains(@text(), "Electricians")]')"
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//h3[text()='Electricians']")).click();
	
}
}
