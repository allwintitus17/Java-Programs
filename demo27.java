import java.util.Scanner;
import java.io.*;

public class demo27{
	public static void main(String[] args){
		System.out.println("THE SUM OF CUBES");
		Scanner demo27=new Scanner(System.in);
		int n=demo27.nextInt();
		int i=1;
		while(i<=n){
          
           System.out.println(i*i*i);
           i++;
		}
	}
}