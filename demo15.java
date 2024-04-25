import java.util.Scanner;
import java.io.*;
public class demo15{
	public static void main(String[] args){
		System.out.println("Enter the Attendence Percentage to display the marks:");
		Scanner myobj12=new Scanner(System.in);
		int attendence,marks,amount,rollno;
		int tamil,science,social,maths,english;
		String name;
		attendence=myobj12.nextInt();
		if(attendence>=75){
				System.out.println("Enter Your Tamil Marks:");
				tamil=myobj12.nextInt();
				System.out.println("Enter Your 	english Marks:");
				english=myobj12.nextInt();
				System.out.println("Enter Your science Marks:");
				science=myobj12.nextInt();
				System.out.println("Enter Your maths Marks:");
				maths=myobj12.nextInt();
				System.out.println("Enter Your Social Marks:");
				social=myobj12.nextInt();
                marks=maths+science+social+tamil+english;
                System.out.println("Total               :"+marks);
                if(marks>450){
                	System.out.println("BIO MATHS");
                }
                else{
                	System.out.println("COMMERCE");
                }
			}
			else{
			System.out.println("Pay Your Fine to Get the Result");
		}

		}
		

	}
