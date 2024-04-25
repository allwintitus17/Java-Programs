import java.util.Scanner;
import java.io.*;

public class demo1{
	public static void main(String[] args){
Scanner myobj=new Scanner(System.in);
System.out.println("ENter the value:");
 int a=myobj.nextInt();
//int b=myobj.nextInt();
if(a<0){
    System.out.println("the given number is negative"+a);

}
else{
    System.out.println("the given number is positive"+a);
}

	}
}