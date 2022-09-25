package Objects;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImdbHomePage {
	
	
	//constructor to initialize Webdriver
	public ImdbHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);	
	}
	
	//to find all Webelements in page using FindBy
	
	@FindBy(xpath="//input[@id='suggestion-search']") private WebElement SearchBox;
	
	@FindBy(xpath="//button[@id='suggestion-search-button']") private WebElement SearchBoxButton;
	
	@FindBy(xpath="//div[@class='sc-d2740ffb-1 duOqOv']") private List<WebElement> SearchResults;
	
	
	public void enterMovieName(String MovieName) {
		SearchBox.sendKeys(MovieName);
	}
	
	public void searchClick() {
		//SearchBoxButton.click();
		SearchResults.get(0).click();
	}
	
	

}
