import java.io.*;
import java.util.Scanner;

public class demo8{
	public static void main(String[] args){
		System.out.println("Stream Assigner Software");
		Scanner myobj5=new Scanner(System.in);
		System.out.println("Enter the English Marks:");
		int English=myobj5.nextInt();
		System.out.println("Enter the Science Marks:");
		int Science=myobj5.nextInt();
		System.out.println("Enter the Maths Marks:");
		int Maths=myobj5.nextInt();
        System.out.println("Enter the Social Science Marks:");
		int SocialScience=myobj5.nextInt();
		System.out.println("English       Marks:"+English);
		System.out.println("Science       Marks:"+Science);
		System.out.println("SocialScience Marks:"+SocialScience);
		System.out.println("Maths         Marks:"+Maths);

		if(English>=80 && Science>=80 && SocialScience>=80 && Maths>=80){
			System.out.println("Science");
		}
		else if(English>=80 && Science>=50 && SocialScience>=50 && Maths>=50){
                  System.out.println("Commerce");
		}
		else if(English>=80 && SocialScience>=80){
			System.out.println("Humanities");
		}
		else{
			System.out.println("ITI");
		}


	}
}