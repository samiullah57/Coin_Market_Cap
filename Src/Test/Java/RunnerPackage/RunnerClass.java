package RunnerPackage;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import BaseClass.BaseClass;
import Utilities.FileReaderManager;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\anser\\eclipse-workspace\\CoinMarketProject\\src\\test\\java\\Resources\\FeatureFile.feature",
glue= {"StepDefinitionPackage"},
monochrome=true,
plugin={"pretty","junit:target/JunitReports/report.xml"},
tags="@SmokeTest")
public class RunnerClass {
	public static WebDriver driver;
	@BeforeClass
	public static void setup() throws IOException {
		 String browserNames = FileReaderManager.getInstance().getCrInstance().getBrowser();
		driver = BaseClass.browserLaunch(browserNames);
	}
	@AfterClass
	public static void teardown() {
		driver.close();
	}
}
