package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiMoviePage {
	public  WikiMoviePage(WebDriver driver) {
		PageFactory.initElements(driver,this);	
	}
	
	//to find all Webelements in page using FindBy
	
	@FindBy(xpath="//table[@class='infobox vevent']//tbody//tr[12]//td") private WebElement ReleaseDate;
	
	@FindBy(xpath="//table[@class='infobox vevent']//tbody//tr[14]//td") private WebElement Country;
	
	public String movieDate() {
		String movieReleaseDate = ReleaseDate.getText();
		return movieReleaseDate;
		
	}
	
	public String movieCountry() {
		
		String movieCountryName = Country.getText();
		return movieCountryName;
		
	}
	

}
