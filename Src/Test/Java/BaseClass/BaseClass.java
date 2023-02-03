package BaseClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
public static WebDriver driver;
	
	public static WebDriver browserLaunch(String browser) {
		
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\anser\\eclipse-workspace\\CoinMarketProject\\src\\test\\RootDirectory\\ChromeDriver\\chromedriver.exe");
				driver = new ChromeDriver();
				
				
			}else {
				System.out.println("Invalid browser");
				
			}
			driver.manage().window().maximize();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
}
	
	public static void getUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void getScreenshot() throws IOException {
	TakesScreenshot ts = (TakesScreenshot) driver;              //takesScreenshot is a interface
	File screenshot = ts.getScreenshotAs(OutputType.FILE); // take screenshot method of output file 
	try {
	File destination = new File("C:\\Users\\anser\\eclipse-workspace\\CoinMarketProject\\target\\ScreenShots\\ScreenShots//shots.png");
	FileUtils.copyFile(screenshot,destination);
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	}
}
