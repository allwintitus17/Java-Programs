import java.io.*;
import java.util.Scanner;

public class demo25{
	public static void main(String[] args){
		System.out.println("Enter the number to get the factorial:");
		Scanner demo25 =new Scanner(System.in);
		int n=demo25.nextInt();
	int i=1;
	int fact=1;
	while(i<=n){
              
       fact*=i;
       System.out.println(fact);
	
         i++;
	}

   
	}
}