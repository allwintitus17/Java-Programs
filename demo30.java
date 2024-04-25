import java.io.*;
import java.util.Scanner;
public class demo30{
	public static void main(String[] args){
		int i=2;
		int sum=1;
		 //System.out.println(i);
		while(i<=10){
            
          if(i%2==0)
          {
          	sum=sum+i*i;

          	
          }
          else{
          	sum=sum-i*i;
          	
          }

          
           
            i++;
		}
		System.out.println(sum);
	}
}