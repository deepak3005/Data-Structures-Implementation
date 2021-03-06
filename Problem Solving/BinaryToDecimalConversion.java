import java.lang.Math;
import java.util.*;

class BinaryToDecimalConversion
{
	public static void decimal(String s)
	{
		int binary = Integer.parseInt(s);
		int decimalValue = 0; 
		int r = 0;
		for(int j=0;j<s.length();j++)
		{
			r = binary % 10;
			binary = binary / 10;
			decimalValue = decimalValue + r*((int)Math.pow(2, j));
		}
		System.out.print("Decimal value : "+(int)decimalValue);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter binary number : ");
		String binary = sc.nextLine();
		decimal(binary);
	}
}
