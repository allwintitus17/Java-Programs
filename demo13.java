import java.util.Scanner;
import java.io.*;
public class demo13{
	public static void main(String[] args){
		System.out.println("Enter the number to check wheather it is divisible by 2 and 3  or not:");
		int num1;
		Scanner myobj10=new Scanner(System.in);
		num1=myobj10.nextInt();
		if(num1%2==0 && num1%3==0){
			System.out.println("it is divisible by 2 and 3");
		}
		else{
			System.out.println("it is not divisible by 2 and 3");
		}
	}
}