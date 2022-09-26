# Movie Information Validation

This project provides a very simple application for validating Date of Release and Country of origin of the film from www.imdb.com and www.wikipedia.org.
The application will compare the data from both sites and gives us the result.

#Prerequisites
1. Java SDK 
2. Maven
3. set JAVA_HOME 
4. set MAVEN_HOME 


# To Run Project

To run program through maven commandline type command given below:

mvn "-Dmoviename=your_movie_name" clean install

Here give  name of the movie you want to validate in place of your_movie_name.

e.g. mvn "-Dmoviename=Pushpa:The Rise" clean install

