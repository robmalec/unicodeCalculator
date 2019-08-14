package unicodeCalc;

import java.util.Scanner;
import java.lang.String;

public class unicodeCalc {

	public static void main(String[] args) {
	
		
		String input1 = "", input2 = "";
		int sum1 = 0, sum2 = 0;
		Scanner scn = new Scanner(System.in);
		
		try {
			input1 =  parseInput(scn.next());
			input2 = parseInput(scn.next());
		}
		catch (Exception e)
		{
			System.err.println(e.getMessage());
		}
		
		sum1 = printAndSumUnicodeValOfChars(input1);
		sum2 = printAndSumUnicodeValOfChars(input2);
		
		System.out.println("Difference (as absolute value): " + absoluteVal(sum1 - sum2));
		scn.close();
	}
	public static String parseInput(String s)
	{
		return s.split(":")[1];
	}
	public static int printAndSumUnicodeValOfChars(String s)
	{
		int sum = 0;
		
		for (char c : s.toCharArray())
		{
			System.out.println(c + ": " + (int)c);
			sum += (int)c;
		}
		
		return sum;
	}
	public static int absoluteVal(int input)
	{
		if (input < 0)
		{
			return (-1 * input);
		}
		return (input);
	}
}
