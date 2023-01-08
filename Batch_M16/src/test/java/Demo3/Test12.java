package Demo3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test12 {

	public static void main(String[] args)throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions act=new Actions(driver);
		//doubleclick
	
		WebElement dble=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(dble);
		Thread.sleep(3000);
		
		//rightclickable
		
		WebElement right=driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement quit=driver.findElement(By.xpath("//span[text()='Quit']"));
		act.contextClick(right).click(quit).build().perform();
		
		
		// TODO Auto-generated method stub
	
	}

}
