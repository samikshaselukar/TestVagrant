package Objects;

import java.io.IOException;
import java.util.Properties;



public class GetMovieName {
	public String mName() throws IOException {
		//Read MyProject.properties
		Properties prop = new Properties(); 
		//Load properties file
		prop.load(GetMovieName.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		
		return prop.getProperty("movieName");
		
	}

}
