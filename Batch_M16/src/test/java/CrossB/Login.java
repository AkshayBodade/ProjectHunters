package CrossB;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login extends BaseClass {
       @Test
       public void VerifyLogin() {
    	   driver.findElement(By.xpath("//input[@name='email']")).sendKeys("7385372351");
    	   driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("dev00ra");
    	   driver.findElement(By.xpath("//button[@name='login']")).click();
       }
	
}
