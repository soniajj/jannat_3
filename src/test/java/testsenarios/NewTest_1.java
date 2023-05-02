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
		driver.get("https://www.applevacations.com/#!/");
		Thread.sleep(5000);  
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//*[@id=\"placeholder\"]")).sendKeys("Minneapolis (MSP)");
		Thread.sleep(5000); 
		driver.findElement(By.className("passengersCount")).click();
	  
		new Select(driver.findElement(By.id("scc_rt_passengers_numrooms"))).selectByVisibleText("1 Room");
		Thread.sleep(5000); 
		new Select(driver.findElement(By.id("passengers_1_adults"))).selectByVisibleText("2 Adults");
		Thread.sleep(5000); 
		new Select(driver.findElement(By.id("passengers_1_kids"))).selectByVisibleText("1 Child");
		Thread.sleep(5000); 
		
	  
	  
	  
	  
	  
	  
		
		
		
		
		
		
		driver.quit();
	  
  }
}
