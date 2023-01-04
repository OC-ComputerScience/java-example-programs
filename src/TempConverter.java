import java.util.Scanner;

/**
* TempConverter is a Class that will convert temperatures from Celsius to Fahrenheit. 
* 
* @author(David North) 
*/

public class TempConverter {
	final static int BASE=32;
	final static double CONVERSION_FACTOR= 9.0/5.0;

	public static void main(String[] args) {
		
		int celsiusTemp = 24;
		double convertedTemp;
		
		System.out.print("Enter temperature in Celsius: ");
		Scanner scan = new Scanner(System.in);
		celsiusTemp = scan.nextInt();
		
		convertedTemp = convertTemp(celsiusTemp);
		
		System.out.println("Celsius Temp: " + celsiusTemp);
		System.out.println("Fahrenheit Equivalent: " + convertedTemp);
		scan.close();
	}
	/**
	* convertTemp converts Celsius temperature to Fahrenheit
	*
	* @param celsiusTemp - int, the celsius temperature to convert
	*/
	public static double convertTemp(int celsiusTemp)
	{
		double fahrenheitTemp;
		
		// use the conversion factor and the base to calculate fahrenheit
		fahrenheitTemp = celsiusTemp * CONVERSION_FACTOR + BASE;
		return fahrenheitTemp;
	}
}
