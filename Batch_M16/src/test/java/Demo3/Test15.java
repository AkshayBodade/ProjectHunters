package Demo3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test15 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/popup.php");
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();

		Set<String>set=driver.getWindowHandles();
        List<String>list=new ArrayList(set);
        
        System.out.println("ParentId="+list.get(0));
        System.out.println("ChildId="+list.get(1));
        driver.switchTo().window(list.get(1));// switch to child window
        
        driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Test@gmail.com");
        
        driver.switchTo().window(list.get(0)); // switch to parent window
		
		
		//driver.close(); //current window close 
		
		 driver.quit(); // current +all open window close 
		

		// TODO Auto-generated method stub

	}

}
