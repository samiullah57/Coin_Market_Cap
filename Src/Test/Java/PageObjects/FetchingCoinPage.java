package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FetchingCoinPage {
public static WebDriver driver;
	
	public FetchingCoinPage(WebDriver ldriver) {

		this.driver = ldriver;
		PageFactory.initElements(driver,this);
		}
	
	@FindBy(xpath="//div[@display='flex']//div[@data-sensors-click='true'][normalize-space()='100']") private WebElement rowsdropdown;
	@FindBy(xpath="//*[@id='cmc-cookie-policy-banner']/div[2]") private WebElement okButton;
	@FindBy(xpath="//*[@id='__next']/div[2]/div[2]/span[2]") private WebElement mayBeLaterButton;
	
	@FindBy(xpath="(//*[name()='svg'][@class='sc-aef7b723-0 dgXMPo'])[1]") private WebElement selectNoOfRows;
	@FindBy(xpath="//button[normalize-space()='20']") private WebElement selectOption;
	@FindBy(xpath="//*[@id='__next']/div/div[1]/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div[2]/button[1]") private WebElement filterButton;
	@FindBy(xpath="//*[@id=\"__next\"]/div/div[1]/div[2]/div/div[1]/ul/li[2]/div/span/button") private WebElement algorithmButton;
	@FindBy(xpath="//li[normalize-space()='PoW']") private WebElement powButton;
	@FindBy(xpath="//*[@id='__next']/div/div[1]/div[2]/div/div[1]/ul/li[5]/button") private WebElement addFilterButton;
	@FindBy(xpath="//*[@id='__next']/div/div[1]/div[2]/div/div[1]/div[5]/div/div/div[2]/div[1]/div[1]/button") private WebElement addCurrenciesButton;
	@FindBy(xpath="//button[normalize-space()='Coins']") private WebElement addCoinsOnlyButton;
	@FindBy(xpath="//label[@id='mineable']") private WebElement mineableButton;
	@FindBy(xpath="//*[@id='__next']/div/div[1]/div[2]/div/div[1]/div[5]/div/div/div[2]/div[1]/div[3]/button") private WebElement priceButton;
	@FindBy(xpath="//input[@placeholder='$0']") private WebElement minTextBox;
	@FindBy(xpath="//input[@placeholder='$99,999']") private WebElement maxTextBox;
	@FindBy(xpath="//*[@id='__next']/div/div[1]/div[2]/div/div[1]/div[5]/div/div/div[2]/div/div[4]/div[2]/div/button[1]") private WebElement applyFilter;
	@FindBy(xpath="//button[normalize-space()='Show results']") private WebElement showResultsButton;
    @FindBy(xpath="//tbody/tr/td[3]") private List<WebElement> rows;
	@FindBy(xpath="//tbody/tr['i']/td[3]") private List<WebElement> coins;
	@FindBy(xpath="//tbody/tr/td[3]") private List<WebElement> filteredRows;
	@FindBy(xpath="//tbody/tr['i']/td[3]") private List<WebElement> filteredCoins;
	
	
	
	public WebElement getokButton() {
		return okButton;
	}
	
	public WebElement getmayBeLaterButton() {
		return mayBeLaterButton;
	}
	public WebElement getselectNoOfRows() {
		return selectNoOfRows;
	}
	
	public WebElement getselectOption() {
		return selectOption;
	}
	public WebElement getrowsdropdown() {
		return rowsdropdown;
	}
	
	public WebElement getfilterButton() {
		return filterButton;
	}
	public WebElement getalgorithmButton() {
		return algorithmButton;
	}
	
	public WebElement getpowButton() {
		return powButton;
	}
	
	public WebElement getaddFilterButton() {
		return addFilterButton;
	}
	
	public WebElement getaddCurrenciesButton() {
		return addCurrenciesButton;
	}
	
	public WebElement getaddCoinsOnlyButton() {
		return addCoinsOnlyButton;
	}
	
	public WebElement getMineableButton() {
		return mineableButton;
	}
	
	public WebElement getpriceButton() {
		return priceButton;
	}
	
	public WebElement getminTextBox() {
		return minTextBox;
	}
	
	public WebElement getmaxTextBox() {
		return maxTextBox;
	}
	
	public WebElement getapplyFilter() {
		return applyFilter;
	}
	
	
	public WebElement getshowResultsButton() {
		return showResultsButton;
	}
	public List<WebElement> getfilteredRows() {
		return filteredRows;
	}
	public List<WebElement> getfilteredCoins() {
		return filteredCoins;
	}
	
	public List<WebElement> getrows() {
		return rows;
	}
	public List<WebElement> getcoins() {
		return coins;
	}
	
	
}
