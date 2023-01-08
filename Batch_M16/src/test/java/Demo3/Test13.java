package Demo3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test13 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		//Alert
		WebElement cusid=driver.findElement(By.xpath("//input[@name='cusid']"));
		cusid.sendKeys("12345");
		WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
		//Alert Handle
		Alert alt=driver.switchTo().alert();
		String s=alt.getText();
		System.out.println(alt.getText());
		//alt.dismiss();
		//Thread.sleep(3000);
		alt.accept();
		 
		Thread.sleep(3000);
		System.out.println(alt.getText());
alt.accept();
System.out.println(alt.getText());
		
		// TODO Auto-generated method stub

	}

}
