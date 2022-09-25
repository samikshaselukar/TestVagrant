package Objects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiMoviePage {
	public  WikiMoviePage(WebDriver driver) {
		PageFactory.initElements(driver,this);	
	}
	
	//to find all Webelements in page using FindBy
	
	@FindBy(xpath="//table[@class='infobox vevent']//tbody//tr[13]//td") private WebElement ReleaseDate;
	
	@FindBy(xpath="//table[@class='infobox vevent']//tbody//tr[15]//td") private WebElement Country;
	
	@FindBy(xpath="//table[@class='infobox vevent']//tbody//tr/td") private List<WebElement> movieDetails;
	
	
	public String movieDate() {
		String movieReleaseDate = movieDetails.get(movieDetails.size()-6).getText();
		return movieReleaseDate;
		
	}
	
	public String movieCountry() {
		
		String movieCountryName = movieDetails.get(movieDetails.size()-4).getText();
		return movieCountryName;
		
	}
	

}
