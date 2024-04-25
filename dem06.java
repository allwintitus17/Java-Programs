import java.util.Scanner;
import java.io.*;
public class dem06{
     public static void main(String[] args){
     	Scanner myobj3=new Scanner(System.in);
     	int days,total,cost;
     	System.out.println("BOOK RENT CALCULATOR");
     	
     	System.out.println("Enter the no of days the book has taken");
          days=myobj3.nextInt();
          if(days<=5){
          	cost=2;
             total=cost*days;
             System.out.println("Total Cost is "+total);
          } 
          else if(days>=6 && days<=10){
          	cost=3;
          	total=cost*days;
          	System.out.println("Total  Cost  is "+total);
          }
          else if(days>=11 && days<=15){
          	cost=4;
          	total=cost*days;
          	System.out.println("Total  Cost   is"+total);
          }
          else{
          	cost=5;
          	total=cost*days;
          		System.out.println("Total  Cost   is"+total);
          }
     }
}