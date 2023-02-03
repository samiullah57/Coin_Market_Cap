package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
public static WebDriver driver;
	
	public HomePage(WebDriver ldriver) {

		this.driver = ldriver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//button[@data-btnname='Log In']") private WebElement loginbutton;
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/div[2]/div[1]/input") private WebElement username;
	@FindBy(xpath="//input[@type='password']") private WebElement password;
	@FindBy(xpath="(//button[@class='sc-a4a6801b-0 dPXqEb'] )[1]") private WebElement login;

	
	public WebElement getloginbutton() {
		return loginbutton;
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}

	
}
