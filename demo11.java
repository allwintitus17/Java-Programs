import java.util.Scanner;
import java.io.*;
class demo11{
	public static void main(String[] args){
		System.out.println("Enter the sides of the triangle:");
		Scanner myobj8=new Scanner(System.in);
		int size1,size2,size3;
		size1=myobj8.nextInt();
		size2=myobj8.nextInt();
		size3=myobj8.nextInt();
		if(size1==size2 &&size2==size3){
			System.out.println("EQuilateral Triangle");
		}
		else if(size1==size2 || size1==size3 || size2==size3){
			System.out.println("Iscosless Triangle");
		}
		else{
			System.out.println("Scalene Triangle");
		}
	}
}

//Scalene triangle (All three sides are unequal)
//Isosceles triangle (Only two sides are equal)
//Equilateral triangle (All three sides are equal)