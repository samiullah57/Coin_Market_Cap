package PageObjects;

import org.openqa.selenium.WebDriver;

import PageObjects.FetchingCoinPage;
import PageObjects.HomePage;

public class PageObjectManager {
public static WebDriver driver;
	
	private HomePage p1;
	private FetchingCoinPage p2;	
	

	public PageObjectManager(WebDriver ldriver) {
		this.driver = ldriver;
		
	}
	
	public HomePage getInstancePomOne() {
		p1 = new HomePage(driver);
		return p1;
		
	}
	public FetchingCoinPage getInstancePomTwo() {
		p2 = new FetchingCoinPage(driver);
		return p2;
	}
		
		
}
