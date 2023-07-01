package dectorom;
/**
 * Converts an integer to a Roman Numeral.
 */
public class DecimalToRoman
{
	private int decimalNumber;
	private String romanNumber = "";
	
	/**
	 * Constructs a DecimalToRoman object with the passed in decimalNumber.
	 * @param decimalNumber number to convert.
	 */
	public DecimalToRoman(int decimalNumber)
	{
		this.decimalNumber = decimalNumber;
	}
	
	/**
	 * Converts decimalNumber to a Roman Numeral.
	 * @return String containing the Roman Numeral.
	 */
	public String convert()
	{
		int numToSymbol = 12;
		int numberPlace = 0;
		int[] num = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
		String[] symbol = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
		 
	    while(decimalNumber > 0)
	    {
	        numberPlace = decimalNumber/num[numToSymbol];
	        decimalNumber %= num[numToSymbol];

	        while(numberPlace > 0)
	        {
	            romanNumber += symbol[numToSymbol];
	            numberPlace--;
	        } 
	        numToSymbol--;
	    }
	    return romanNumber;
	}
}
