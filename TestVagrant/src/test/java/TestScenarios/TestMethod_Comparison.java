package TestScenarios;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import Objects.ImdbHomePage;
import Objects.ImdbMoviePage;
import Objects.WikiHomePage;
import Objects.WikiMoviePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethod_Comparison {
	WebDriver driver; 
	//Declare variable
	String Movie = "Andaz apna apna";
	String imdbReleaseDate;
	String imdbCountryName;
	
	String wikiReleaseDate;
	String wikiCountryName;
	
	@BeforeTest
	public void beforetest()
	{
		//no need of system.setProperty
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
	}
	
	@BeforeClass
	public void imdbpageseach() {
		driver.get("https://www.imdb.com/");
		
		ImdbHomePage imdb = new ImdbHomePage(driver);
		
		imdb.enterMovieName(Movie);
		imdb.searchClick();
		
		ImdbMoviePage imdbMovie = new ImdbMoviePage(driver);
		imdbReleaseDate = imdbMovie.movieDate();
		imdbCountryName = imdbMovie.movieCountry();
		
		
	}
	@BeforeClass
	public void wikipagesearch() {
		driver.get("https://www.wikipedia.org/");
		
		WikiHomePage wiki = new WikiHomePage(driver);
		wiki.enterMovieName(Movie);
		wiki.searchClick();
		
		WikiMoviePage wikiMovie = new WikiMoviePage(driver);
		wikiReleaseDate = wikiMovie.movieDate();
		wikiCountryName = wikiMovie.movieCountry();
	}
	@Test(description = "Test method 1")
	public void Datecomparison() {
		
		Assert.assertEquals(imdbReleaseDate, wikiReleaseDate, "Test Failed: Release date is different");
		
	}
	
	@Test(description = "Test method 2")
	public void CountryComparison() {
		Assert.assertEquals(imdbCountryName, wikiCountryName, "Test Failed: Country of Origin is different");
	}
	
	@AfterTest
	public void aftertest() {
		driver.quit();
	}
}
