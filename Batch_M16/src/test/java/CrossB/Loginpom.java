package CrossB;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpom {
	@FindBy(how=How.XPATH,using="//input[@name='email']")private WebElement txtemail;
	@FindBy(how=How.XPATH,using="//input[@name='pass']") private WebElement txt_password;
	@FindBy(how=How.XPATH,using="//button[@name='login']") private WebElement login;
	public WebElement getTxtemail() {
		return txtemail;
	}
	
	public WebElement getTxt_password() {
		return txt_password;
	}
	
	public WebElement getLogin() {
		return login;
	}
	
	

	

}
