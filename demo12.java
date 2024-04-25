import java.util.Scanner;
import java.io.*;
public class demo12{
	public static void main(String[] args){
		System.out.println("Enter the 3 sides of the Triangle");
		Scanner myobj9=new Scanner(System.in);
		int size1,size2,size3,c;
		size1=myobj9.nextInt();
		size2=myobj9.nextInt();
		size3=myobj9.nextInt();
        if(size1+size2>size3 && size2+size3>size1 && size3+size1>size2){
        	System.out.println("The triangle is possible");
}

       else{
       	System.out.println("the Triangle is not possible");
       }
	}
}
