package testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest_3 {
	
	WebDriver driver;

	@Parameters("browserName")
	@BeforeClass
	public void sonia_1(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} 
		 else if (browserName.equalsIgnoreCase("EDge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
}

	@Test
  public void f() throws InterruptedException {
		
		 
			 driver.get("https://autotestdata.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div/div[2]/div/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Country")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div/div[3]")).click();
		Thread.sleep(5000);
		//Check box demo using cssSelector locator.
		driver.findElement(By.cssSelector("input[value='excel']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("total-rows-gen")).clear();//clear the previous number 10.
		Thread.sleep(5000);
		driver.findElement(By.id("total-rows-gen")).sendKeys("15");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[2]/div[2]/div")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[5]/button")).click();
		Thread.sleep(5000);
		
	  driver.quit();
	  
	  
  }
}
