package Demo3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test7 {

	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("women dresses");
		Thread.sleep(3000);
		//Handle Auto Suggestions
	//List<WebElement>a=driver.findElements(By.xpath("//div[@class='autocomplete-results-container']//div"));
	//System.out.println(a.size());      //30      
		
	List<WebElement>list=driver.findElements(By.xpath("//div[@class='autocomplete-results-container']//div[@class='s-suggestion-container']"));
	System.out.println(list.size());      //10
	
	for(int i=0;i<=list.size();i++)
	  {
		String str=list.get(i).getText();
		System.out.println(str);
		if(str.equals("women dresses casual"))
		{
			list.get(i).click();
		break;
		}
	  }
     }
	}
