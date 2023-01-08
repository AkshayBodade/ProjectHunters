package Demo3;
//iframe
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test16 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/devra/OneDrive/Documents/frame.html");
		//iframe handle by index
		//driver.switchTo().frame(1);
		//iframe handle by findelement
		WebElement selframe=driver.findElement(By.xpath("//iframe[@name='Selenium']"));
		driver.switchTo().frame(selframe);//navigate to iframe
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
		driver.switchTo().defaultContent(); //navigate to main page
		   
		driver.findElement(By.xpath("//a[text()=' Click here for Login FaceBook '] ")).click();
		
		driver.navigate().back();
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-500)", " ");
		
		// TODO Auto-generated method stub

	}

}
