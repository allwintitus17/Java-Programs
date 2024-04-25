import java.util.Scanner;
import java.io.*;
public class demo31{

	public static void main (String[] args){
		Scanner demo31=new Scanner(System.in);
		int i=1;
	     int count=0;
	     int count1=0;
		while(i!=0){
			System.out.println("Enter the numbers and if you want to stop press 0:");
            i=demo31.nextInt();
            System.out.println(i);
            if(i==0){
               break;
            }
            if(i%2==0){
            	count++;
            }else{
            	count1++;
            }  
            
		} 
		System.out.println("the count of odd numbers is :"+count1);
        System.out.println("the count of even numbers is :"+count);
	}
}