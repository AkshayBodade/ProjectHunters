package Demo3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test8  {

	public static void main(String[] args)throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("maven");
		Thread.sleep(3000);
	List<WebElement>list=driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]//li"));
	System.out.print(list.size());
		for(int i=0;i<list.size();i++)
		{
			String s=list.get(i).getText();
			System.out.println(s);
			if(s.equalsIgnoreCase("maven repository"))
				list.get(i).click();
			break;
		}
		// TODO Auto-generated method stub

	}

}
