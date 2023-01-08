package Demo3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test14 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		WebElement country=driver.findElement(By.xpath("//select[@name='country']"));
		Select sel=new Select(country);
		sel.selectByValue("India");
		//sel.selectByVisibleText("INDIA");
		
		//dropDown handle --> tagname--select 
		
	
		
		
		
		//sel.selectByIndex(10);
		
		//sel.selectByValue("AUSTRIA");
		
	//	sel.selectByVisibleText("COLOMBIA");
		
		

		
		
		// TODO Auto-generated method stub

	}

}
