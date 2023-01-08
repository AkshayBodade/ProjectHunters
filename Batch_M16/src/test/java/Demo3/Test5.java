package Demo3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test5 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		WebElement txt= driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
    	txt.sendKeys("7385372351");
    WebElement txt1= driver.findElement(By.xpath("//input[@type='password']"));
    txt1.sendKeys("dev00raj");
    WebElement btn= driver.findElement(By.xpath("//button[@name='login']")); 
    btn.click();
    
    	
    	
	
		
		
		
		 
		 
		 // TODO Auto-generated method stub

	}

}
