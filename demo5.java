import java.util.Scanner;
import java.io.*;

public class demo5{
	public static void main(String[] args){
        int cost;
         float taxprice;
         float percentagecost;
		System.out.println("Tax Calculator");
		Scanner myobj2=new Scanner(System.in);
		System.out.println("Enter the cost of the vehicle:");
        cost=myobj2.nextInt();
        if(cost>100000){
        	percentagecost=(15*cost)/100;
        	/*taxprice=cost*percentagecost;*/
        	System.out.println("The taxprice total 15% :"+percentagecost);
        }
        else if(cost>50000 && cost<=100000){
        	percentagecost=(10*cost)/100;
        	/*taxprice=cost*percentagecost;*/
        	System.out.println("The tax price total 10%:"+percentagecost);

        }
        else{
        	percentagecost=(	5*cost)/100;
        	/*taxprice=cost*percentagecost;*/
        	System.out.println("The taxprice total  5%:"+percentagecost);
        }

	}
}
