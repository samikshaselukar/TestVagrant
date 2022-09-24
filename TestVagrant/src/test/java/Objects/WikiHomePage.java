package Objects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiHomePage {
	
	public WikiHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//input[@id='searchInput']") private WebElement SearchBox;
	
	@FindBy(xpath="//div[@class='suggestion-text']") private List<WebElement> SearchResults;
	
	
	public void enterMovieName(String MovieName) {
		SearchBox.sendKeys(MovieName);
	}
	
	public void searchClick() {
		//SearchBoxButton.click();
		SearchResults.get(0).click();
	}
}
