import java.util.Scanner;
import java.io.*;
public class demo28{
	public static void main(String[] args){
		Scanner demo28 =new Scanner(System.in);
			System.out.println("Enter the xth number:");
		int x=demo28.nextInt();
		int n=1;
		while(n<=x)	{
			System.out.println(x);
		     int square=x^n;
		     int sum=square/n;

		     System.out.println(sum);
		     n++;	
		}
	}
}