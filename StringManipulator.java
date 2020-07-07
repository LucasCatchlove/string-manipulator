// -------------------------------------------------------
// Assignment 1
// Written by: Lucas catchlove 27145640
// For COMP 248 Section (section U) – Winter 2020
// -------------------------------------------------------

/* This program receives the name of a city as a string from the user, 
 * capitalizes either a specific letter or the entire word using string methods,
 * and then prints out the modified strings for the user to see. 
 */
import java.util.Scanner;

public class StringManipulator {

	public static void main(String[] args) {
		
		System.out.println("*****************************************\n" +
				"           String Manipulator           \n" + 
				"*****************************************\n"); 
		//creating new user input (Scanner) object and declaring variables related to input city name
		Scanner keyboardInput = new Scanner(System.in);
		String favoriteCity;
		int wordLength;
		
		//receiving input string from user and initializing variables
		System.out.print("Please enter the name of your favorite city in lowercase: ");
		favoriteCity = keyboardInput.next();
		wordLength = favoriteCity.length();
		
		System.out.println("\nYou entered " + favoriteCity + " which has " + wordLength + 
				" characters.\n");
		
		System.out.println("here is the city name...");
		
		//prints out inputted string in uppercase 
		System.out.println("	* with all its letters in uppercase: " + favoriteCity.toUpperCase());
		
		//prints out second letter of string in uppercase
		System.out.println("	* with its second letter in uppercase: " 
				+ (favoriteCity.substring(0,1) 
				+ favoriteCity.substring(1,2).toUpperCase() 
				+ favoriteCity.substring(2, wordLength)));
		
		//prints out second to last letter of string in uppercase
		System.out.println("	* with its second to last letter in uppercase: "
				+ favoriteCity.substring(0, wordLength-2)
				+ favoriteCity.substring(wordLength-2, wordLength-1).toUpperCase()
				+ favoriteCity.substring(wordLength-1));
		
		//prints out middle letter of string in uppercase
		System.out.println("	* with its middle letter in uppercase: " 
				+ favoriteCity.substring(0, wordLength/2)
				+ favoriteCity.substring(wordLength/2, (wordLength/2)+1).toUpperCase()
				+ favoriteCity.substring((wordLength/2)+1) + "\n");
		
		//closes the Scanner
		keyboardInput.close();	
		
		//goodbye message
		System.out.println("operations have been completed successfully! Goodbye!");		
	
	}

}
