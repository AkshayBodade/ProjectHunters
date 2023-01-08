package Demo3;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test4 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement txt=driver.findElement(By.name("firstName"));
		txt.sendKeys("rutu");
		WebElement txt1=driver.findElement(By.name("lastName"));
		txt1.sendKeys("Shetkar");
		WebElement drp_country=driver.findElement(By.name("country"));
		HandleDropDown_text(drp_country,"COLOMBIA");

	/*	Select sel=new Select(txt2);
		sel.selectByValue("INDIA");
		
        List <WebElement> list=sel.getOptions();
		System.out.println(list.size());

		
		for(int i=0;i<list.size();i++)
		{
			String itr =list.get(i).getText();
            System.out.println(itr);	
            if(itr=="INDIA")
    			list.get(i).click();
    		break;
		}*/
			
		// TODO Auto-generated method stub

	}

	private static void HandleDropDown_text(WebElement element, String text) {
		// TODO Auto-generated method stub
		Select select=new Select(element);
		select.selectByVisibleText(text);

	}

}
