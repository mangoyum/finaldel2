import java.util.Scanner;//importing scanner to scan for user input
import java.time.LocalDate;//import local date which recognizes local date format
import java.time.Period;//import period to
//not sure why to import period??? found this on google but know it has to do with time

//create a class
public class DifferenceBetweenDates {
	//create a main method
	public static void main(String[] args) {	
		
		
		//Output the prompt; prompt asks for input from user
		System.out.println("Enter a valid oldest date in YYYY-MM-DD format: ");{
			//oldest date is oldestDate
			//Create scanner object
			Scanner input = new Scanner(System.in);
			
			//this is declaring and instantiating the string type variable oldestDateString
			String oldestDateString = input.nextLine();
			
			/*obtains an instance of a LocalDate from a text string (taken from Java Docs)
			-found this by looking up Local Date and then under static because main method
			is static, then found CharSequence~also looked up on google*/
			LocalDate oldestDate = LocalDate.parse(oldestDateString);
			
			//output of second prompt question
			System.out.print("Enter a valid more recent date in YYYY-MM-DD format: ");
			
			//declaring and instantiating a new string type variable recentDateString
			String recentDateString = input.nextLine();
			
			//same as above, use parse for this 
			LocalDate recentDate = LocalDate.parse(recentDateString);
			
			//looked up period class 
			//found this on stack overflow- did not find on Java Docs
			Period difference = oldestDate.until(recentDate);
			int years = difference.getYears();
			int months = difference.getMonths();
			int days = difference.getDays();
			
	
		
			//create local date object
			/*LocalDate input = new LocalDate(System.in);
		
		//create period object
		Period input = new Period(System.in);
		//other things I tried...
		int readDataFromUser() {
			Scanner input = new Scanner(System.in);
			int Date = input.nextDate();
		return readerInput;*/
			
			//closing the scanner
		input.close();
			
			//output of answer
			System.out.println("The difference in time between oldest date and most recent date is " + years + " Years " + months + " Months " + "and " + days + " Days ");
	}

} }



