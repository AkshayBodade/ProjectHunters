package CrossB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginVerify {
	WebDriver driver;
	@BeforeMethod
	public void setUp() throws Exception {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	
	driver.get("https://www.facebook.com/login.php");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	}
@Test
public void login() throws Exception {
	Loginpom Login=PageFactory.initElements(driver,Loginpom.class);
	Login.getTxtemail().sendKeys("test@12");
	Login.getTxt_password().sendKeys("1234");
	Login.getLogin().click();
	Thread.sleep(3000);
}
@AfterMethod
public void tearDown() {
	driver.close();
}
}
