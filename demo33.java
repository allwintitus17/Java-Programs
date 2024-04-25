import java.util.Scanner;
import java.io.*;
public class demo33{
	public static void main(String[] args){
              System.out.print("Fibbonoci series");
              int n1=0,n2=1,n3,i=2,count=10;
              System.out.print(n1 +" "+ n2);
              while(i<count){
              	n3=n2+n1;
              	System.out.print(" "+n3);
              	n1=n2;
              	n2=n3;
              	i++;
              }
	}
}