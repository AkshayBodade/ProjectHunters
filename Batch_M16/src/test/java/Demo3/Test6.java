package Demo3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test6 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https//www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("7385372351");
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		email.sendKeys("ev00ra");
		WebElement log=driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')];"));
	    log.click();
	    WebElement fog=driver.findElement(By.xpath("//a[text()='Forgotten password?'];"));
	    fog.click();
	    WebElement ca=driver.findElement(By.xpath(" //a[@href='#']"));
	ca.click();
	 
			
		
		
		// TODO Auto-generated method stub

	}

}
