import java.util.Scanner;
import java.io.*;
public class demo9{
	public static void main(String[] arg){
		System.out.println("Enter the number:");
		Scanner myobj6=new Scanner(System.in);
		int num=myobj6.nextInt();
		num=num%10;
		System.out.println(num);
		if(num%3==0){
			System.out.println("is divisible by 3");
		}
		else {
			System.out.println("is not divisible  by 3");
		}
	}
}