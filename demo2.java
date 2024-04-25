import java.io.*;
import java.util.Scanner;
public class demo2{
	public static void main(String[] args){
Scanner myobj=new Scanner(System.in);
System.out.println("ENter the value:");
 int a=myobj.nextInt();
int b=myobj.nextInt();
if(a%2==0){
	System.out.println("Even number"+a);
}
else{
	System.out.println("Odd number"+a);
}
}
}