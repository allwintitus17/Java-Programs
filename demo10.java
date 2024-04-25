import java.util.Scanner;
import java.io.*;

	
class demo10{

	public static void main(String[] args){
		String city;
		System.out.print("Enter the city name:");
		Scanner myobj7=new Scanner(System.in);
		city=myobj7.nextLine();
		if(city=="delhi" || city=="DELHI"){
			System.out.println("Redfort");
		}
		else if(city=="agra" || city=="AGRA"){
			System.out.println("TajMahal");
		}
		else if(city=="jaipur" || city=="JAIPUR"){
			System.out.println("Jal Mahal");
		}
		else{
			System.out.println("THE requested city is not present");
		}
	}
}