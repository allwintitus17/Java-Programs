import java.io.*;
import java.util.Scanner;
public class demo3{
	public static void main(String[] args){
		int units1=100;
		int cost;
		Scanner myobj1=new Scanner(System.in);
		System.out.println("ELECTRICITY INVOICE GENERATOR");
		System.out.println("Enter the number of units:");
		int units=myobj1.nextInt();
		if(units<=100){
			units1=units;
			System.out.println("FREE UNITS no charge");
		}
		else if(units>100){
           cost=(units-units1)*5;
			System.out.println("YOUR TOTAL BILL");
			System.out.println("your total="+cost);
		}
		else{
			int cost1=(units-units1)*10;
			System.out.println("Your Total Bill");
			System.out.println("your total="+cost1);
		}

	}
}