package StepDefinitionPackage;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import BaseClass.BaseClass;
import PageObjects.PageObjectManager;
import RunnerPackage.RunnerClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionClass extends BaseClass{
	public static WebDriver driver = RunnerClass.driver ;
	//private static final Logger LOGGER = LogManager.getLogger(StepDefinitionClass.class);
	PageObjectManager pom = new PageObjectManager(driver);
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	
	@When("user launch the Coin cap application")
	public void user_launch_the_Coin_cap_application() throws IOException {
		
		driver.get("https://coinmarketcap.com");
		pom.getInstancePomTwo().getokButton().click();
		//pom.getInstancePomTwo().getmayBeLaterButton().click();
		System.out.println("***User Launched the application Succesfully***  ");
       // LOGGER.info("Application  Launched ");
		getScreenshot();
	}
	
	@And("user clicks on ShowRows DropDown")
	public void user_clicks_on_ShowRows_DropDown() throws IOException {

		wait.until(ExpectedConditions.elementToBeClickable(pom.getInstancePomTwo().getselectNoOfRows()));
		pom.getInstancePomTwo().getselectNoOfRows().click();
		System.out.println("***User clicked on ShowRows DropDown***  ");
		getScreenshot();
	}
	@Then("user Fetching the coins values and comparing the results using assert")
	public void user_Fetching_the_coins_values_and_comparing_the_results_using_assert() throws IOException {

		wait.until(ExpectedConditions.visibilityOf(pom.getInstancePomTwo().getselectOption()));
	    Actions a = new Actions(driver);
		a.moveToElement(pom.getInstancePomTwo().getselectOption()).perform();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",pom.getInstancePomTwo().getselectOption());
		//Fetching the 20 coins using show rows Dropdown.
		List <String> filteredTwentyCoins1 = new ArrayList<>();
		 for(int i=0;i<pom.getInstancePomTwo().getcoins().size();i++){
			
			 filteredTwentyCoins1.add(pom.getInstancePomTwo().getfilteredCoins().get(i).getText());
		    	String text1 = pom.getInstancePomTwo().getfilteredCoins().get(i).getText();
		    	System.out.println(text1);
		    }
		 
 //Click on filter and algorithm Button
		 wait.until(ExpectedConditions.visibilityOf(pom.getInstancePomTwo().getfilterButton()));
		pom.getInstancePomTwo().getfilterButton().click();
	
	wait.until(ExpectedConditions.visibilityOf(pom.getInstancePomTwo().getalgorithmButton()));
	pom.getInstancePomTwo().getalgorithmButton().click();
	JavascriptExecutor jsOne = (JavascriptExecutor) driver;
	jsOne.executeScript("arguments[0].click();",pom.getInstancePomTwo().getpowButton());

	pom.getInstancePomTwo().getaddFilterButton().click();

	wait.until(ExpectedConditions.visibilityOf(pom.getInstancePomTwo().getaddCurrenciesButton()));
	pom.getInstancePomTwo().getaddCurrenciesButton().click();
	pom.getInstancePomTwo().getaddCoinsOnlyButton().click();
	//Clicks on price Button
	pom.getInstancePomTwo().getpriceButton().click();
	wait.until(ExpectedConditions.visibilityOf(pom.getInstancePomTwo().getaddCurrenciesButton()));
	pom.getInstancePomTwo().getminTextBox().sendKeys("100");
	pom.getInstancePomTwo().getmaxTextBox().sendKeys("10000");	

//clicks on apply filter
		wait.until(ExpectedConditions.visibilityOf(pom.getInstancePomTwo().getapplyFilter()));
		pom.getInstancePomTwo().getapplyFilter().click();
		pom.getInstancePomTwo().getMineableButton().click(); 
		System.out.println("User clicked on Mineable button");

	wait.until(ExpectedConditions.visibilityOf(pom.getInstancePomTwo().getshowResultsButton()));
	pom.getInstancePomTwo().getshowResultsButton().click();
	 System.out.println("User clicked on showResults button");

	    	
//Collects filtered coins and verify by Assertion
			List <String> filteredCoins = new ArrayList<>() ;
			 for(int i=0;i<pom.getInstancePomTwo().getfilteredCoins().size();i++){
				
				 filteredCoins.add(pom.getInstancePomTwo().getfilteredCoins().get(i).getText());
				 String text = pom.getInstancePomTwo().getfilteredCoins().get(i).getText();
				 System.out.println("***Filtered coins****");
				 System.out.println(text);
			 }
			// Assert.assertTrue(filteredCoins.containsAll(filteredTwentyCoins1));
			 Assert.assertFalse(filteredCoins.containsAll(filteredTwentyCoins1));
			 
	System.out.println("***Comparison done***  ");
	getScreenshot();
}
	
}
