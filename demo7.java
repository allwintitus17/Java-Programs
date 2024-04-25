import java.io.*;
import java.util.Scanner;
public class demo7{
	public static void main(String[] args){
		System.out.println("Toll calculator");
		int km,cost;
		System.out.println("Enter the Km to calculate the cost");
		Scanner myobj4=new Scanner(System.in);
          km=myobj4.nextInt();
		if(km<=10){
			cost=11;
			System.out.println("TOTAL BILL IS "+cost*km);
		}
		else if(km>10 &&km<=90){
			cost=10;
			System.out.println("Total BILL IS "+cost*km);
		}
		else{
			cost=9;
				System.out.println("Total BILL IS "+cost*km);
		}
	}
}