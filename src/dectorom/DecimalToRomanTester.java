package dectorom;
import java.util.Scanner;

/**
 * Class to test the DecimaToRoman class.
 */
public class DecimalToRomanTester
{
	public static void main(String[] args)
	{
		int input;
		Scanner in = new Scanner(System.in);
		System.out.println("Convert a number to roman numerals!");
		do
		{
			System.out.print("Please enter a positive integer less than 4000: ");
			input = in.nextInt();
		} while (input <= 0  || input > 3999);
		DecimalToRoman num = new DecimalToRoman(input);
		System.out.println(num.convert());
	}
}

/* Input: 100
 * Output: C
 * Expected: C
 * 
 * Input: 1978
 * Output: MCMLXXVIII
 * Expected: MCMLXXVIII
 */
