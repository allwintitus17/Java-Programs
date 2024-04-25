import java.util.Scanner;
import java.io.*;
public class demo14{
	public static void main(String[] args){
                System.out.println("Enter the 3 NUmbers:");
                int a,b,c;
                Scanner newobj11=new Scanner(System.in);
                a=newobj11.nextInt();
                  b=newobj11.nextInt();
                    c=newobj11.nextInt();

                    if(a<b){
                    	if(a<c){
                    		System.out.println("A IS GRATER:"+a);
                    	}
                    	else{
                    		System.out.println("C IS GRATER:"+c);
                    	}
                    }
                    else{
                    	if(b<c){
                    		System.out.println("B IS GRATER"+b);
                    	}
                    	else{
                    		System.out.println("C is GRATER"+c);
                    	}
                    }

                    if(a==b && b==c && c==a){
                    	System.out.println("All the numbers are equall");
                    }
	}
}