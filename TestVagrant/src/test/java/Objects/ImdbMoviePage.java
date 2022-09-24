package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImdbMoviePage {
	
	public  ImdbMoviePage(WebDriver driver) {
		PageFactory.initElements(driver,this);	
	}
	
	//to find all Webelements in page using FindBy
	
	@FindBy(xpath="//*[@id=\"__next\"]/main/div/section[1]/div/section/div/div[1]/section[9]/div[2]/ul/li[1]/div/ul/li/a") private WebElement ReleaseDate;
	
	@FindBy(xpath="//*[@id=\"__next\"]/main/div/section[1]/div/section/div/div[1]/section[9]/div[2]/ul/li[2]/div/ul/li/a") private WebElement Country;
	
	public String movieDate() {
		String movieReleaseDate = ReleaseDate.getText();
		String[] splitStr = movieReleaseDate.split("\\s+");
		movieReleaseDate= splitStr[1]+" "+splitStr[0]+" "+splitStr[2];
		movieReleaseDate = movieReleaseDate.replace(",", "");
		return movieReleaseDate;
		
	}
	
	public String movieCountry() {
		
		String movieCountryName = Country.getText();
		return movieCountryName;
		
	}
	
	
	

}
