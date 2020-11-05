/*Programmer: Ryan Dubeau
 * Date 11/5/2020
 * Purpose: To multiply any amount of numbers by any number
 */

//import scanner and Decimal format
import java.util.Scanner;
import java.text.DecimalFormat;

public class MultiplyNumberList {

	public static void main(String[] args) {

		//Create the decimal format and scanner classes	
		Scanner input = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("#,###.##");

		//Create variables index and listLength
		int index = 0;

		int listLength, lengthOfList = 0;

		//Get the length of the list from the user
		System.err.print("How large is the list? ");
		listLength = input.nextInt();

		//Get the numbers from the user
		System.err.println("Enter the number list: ");
		double array[] = new double[listLength];

		//Create a for loop that runs however many times the user said the length of the list was
		for(index = 0; index < listLength; index++) {
			array[index] = input.nextDouble();
		}

		//Get the multiplier from the user
		System.err.print("Enter the multiplier: ");	
		double multiplier = input.nextDouble(); 

		//Create a for loop that multiplies the multiplier with each number
		for(index = 0; index < (array.length ); index++)	
			System.out.println(formatter.format(multiplier * array[index]));

	}
}






