import java.util.Scanner;
import java.io.*;
public class demo32{
	public static void main(String[] main){
		int i=1;
		int sum=0;
		System.out.println("Enter the numbers to do sum of the given numbers:");
		Scanner demo32=new Scanner(System.in);
		while(i!=0){
           i=demo32.nextInt();
           
            sum=sum+i;
		} 
		System.out.println(sum);
	}
}