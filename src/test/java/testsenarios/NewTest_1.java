package testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewTest_1 {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver;
	  driver= new ChromeDriver();
		driver.get("https://us.megabus.com/account-management/login");
		Thread.sleep(5000);  
		
		//driver.findElement(By.xpath("//*[@id=\"placeholder\"]")).sendKeys("Minneapolis (MSP)");
		//Thread.sleep(5000); 
		driver.findElement(By.xpath("(//a[@class='btn btn-link btn-block'])[1]t")).click();
		Thread.sleep(5000); 
		/*new Select(driver.findElement(By.id("scc_rt_passengers_numrooms"))).selectByVisibleText("1 Room");
		Thread.sleep(5000); 
		new Select(driver.findElement(By.id("passengers_1_adults"))).selectByVisibleText("2 Adults");
		Thread.sleep(5000); 
		new Select(driver.findElement(By.id("passengers_1_kids"))).selectByVisibleText("1 Child");
		Thread.sleep(5000); */
		
	  
	  
	  
	  
	  
	  
		
		
		
		
		
		
		driver.quit();
	  
  }
}
