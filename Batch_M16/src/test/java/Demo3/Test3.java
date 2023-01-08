package Demo3;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {

		
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/login.php");
			driver.manage().window().maximize();
		
		WebElement txt=driver.findElement(By.id("email"));
		txt.sendKeys("7385372351");
		WebElement txt1=driver.findElement(By.id("pass"));
		txt1.sendKeys("dev00raj");
		WebElement btn=driver.findElement(By.id("loginbutton"));
		btn.click();
		// TODO Auto-generated method stub

	}

}
