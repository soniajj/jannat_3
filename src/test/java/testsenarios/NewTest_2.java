package testsenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest_2 {
  @Test
  public void f() {
	  
	  WebDriver driver;	
	  driver = new ChromeDriver();
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");   
	 driver.quit();   
	  
	  
	  
	  
	  
  }
}
